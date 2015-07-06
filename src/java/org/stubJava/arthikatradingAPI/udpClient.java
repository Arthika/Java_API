package org.stubJava.arthikatradingAPI;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class udpClient 
{
    private InetAddress host;
    private int port;
    private DatagramSocket socket;
    private DatagramPacket packetTx;
    private DatagramPacket packetRx;
    private byte[] buffer = new byte[65536];
	
    public udpClient(String sHost, String sPort)
    {
        try {
            host = InetAddress.getByName(sHost); 
            port = Integer.parseInt(sPort);
            System.out.println ("Attemping to connect to " + host + " port " + port);
        }
        catch (UnknownHostException ex) { 
            System.out.println ("Connect error " + host + " port " + port);
            System.err.println(ex);
            System.exit(1);
        }

        try {
            socket = new DatagramSocket();
            socket.setSoTimeout(5000);
            packetTx = new DatagramPacket(new byte[65536], 65536, host, port);
            packetRx = new DatagramPacket(buffer, buffer.length);
        } 
        catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void send(byte[] msg)
    {
        try {
            packetTx.setData(msg);
            socket.send(packetTx);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }	
    }
    
    public void displayReceive()
    {
        try {

            // Convert the contents to a string, and display them
            socket.receive(packetRx);
            String msg = new String(buffer, 0, packetRx.getLength());
            System.out.println(packetRx.getAddress().getHostName() + ": " + msg);
        }
        catch (IOException e) {
            // timeout exception.
            System.out.println("Timeout reached!!! " + e);
        }
    }
    
    public void receive()
    {
        try {
            socket.receive(packetRx);
        }
        catch (IOException e) {
            System.out.println("Timeout reached!!! " + e);
        }
    }

    public byte[] getBuffer() {
        return buffer;
    }
    
//  byte[] msgCode = {0, 1};
//  byte[] bookId = {2, 3};
//  byte[] sequence = {4, 5, 6, 7};
//  byte[] param1 = {8, 0, 0, 0};
//  byte[] param2 = {12, 0, 0, 0};
//  byte[] param3 = {16, 0, 0, 0};
//  byte[] param4 = {20, 0, 0, 0};
//  byte[] payloadSize = {24, 0, 0, 0};	public int receivePrice()
    
    public void receivePrice(ArrayList<Integer> array)
    {
        int ti;
        int price;
        int liquidity; 
        array.clear();
        try {
            socket.receive(packetRx);
//	    System.out.println(new String(buffer, 0, packetRx.getLength()));
            int payloadLenght =  (buffer[24] & 0x000000ff) | ((buffer[25] << 8) & 0x0000ff00) | ((buffer[26] << 16) & 0x00ff0000) | ((buffer[27] << 24) & 0xff000000);
//          System.out.println("Lenght: " + packetRx.getLength());
            int numberTis= (buffer[28] & 0x000000ff) | ((buffer[29] << 8) & 0x0000ff00) | ((buffer[30] << 16) & 0x00ff0000) | ((buffer[31] << 24) & 0xff000000);
            if (numberTis * 10 == payloadLenght - 4)
            {
                for (int i = 0; i < numberTis; i++)
                {
                    ti = (buffer[32+10*i] & 0x000000ff) | ((buffer[33+10*i] << 8) & 0x0000ff00);
                    price = (buffer[34+10*i] & 0x000000ff) | ((buffer[35+10*i] << 8) & 0x0000ff00) | ((buffer[36+10*i] << 16) & 0x00ff0000) | ((buffer[37+10*i] << 24) & 0xff000000);
                    liquidity = (buffer[38+10*i] & 0x000000ff) | ((buffer[39+10*i] << 8) & 0x0000ff00) | ((buffer[40+10*i] << 16) & 0x00ff0000) | ((buffer[41+10*i] << 24) & 0xff000000);
//                  System.out.println("Rx data " + i + ", TI: " + ti + " price: " + price + " Lenght: " + payloadLength);	
                    array.add(ti);
                    array.add(price);
                    array.add(liquidity);
                }
            }
        }
        catch (IOException e) {
            // timeout exception.
            System.out.println("Timeout reached!!! " + e);
        }
    }
    
    public int receiveTradeAlives()
    {
        int trades_alive = 0;
        
        try {
            socket.receive(packetRx);

            trades_alive = (buffer[8] & 0x000000ff) | ((buffer[9] << 8) & 0x0000ff00) | 
                    ((buffer[10] << 16) & 0x00ff0000) | ((buffer[11] << 24) & 0xff000000);
        }
        catch (IOException e) {
            // timeout exception.
            System.out.println("Timeout reached!!! " + e);
        }
        
        return trades_alive;
    }        
}

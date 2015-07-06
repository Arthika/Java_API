/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stubJava.arthikatradingAPI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gudu
 */
public class PricesToB {
    
    protected String security;
    protected List<Integer> data_ask;
    protected List<Integer> data_bid;
    protected byte codeSecurity;
    
    /**
    * Public Constructor.
    */
    public PricesToB ()
    {
        data_ask = new ArrayList<>();
        data_bid = new ArrayList<>();
    }
    
    /**
    * Public Constructor.
    * 
    * @param price
    */
    public PricesToB (PricesToB price)
    {
        data_ask = new ArrayList<>();
        data_bid = new ArrayList<>();
        
        this.security = price.getSecurity();
        this.codeSecurity = price.getCodeSecurity();
    }
    
    /**
     * Get code of security
     * 
     * @return Code of security
     */
    public byte getCodeSecurity() {
        return codeSecurity;
    }

    /**
     * Set code of security
     * 
     * @param codeSecurity Code of security
     */
    public void setCodeSecurity(byte codeSecurity) {
        this.codeSecurity = codeSecurity;
    }

    /**
     * Get name of security
     * 
     * @return name of security
     */
    public String getSecurity() {
        return security;
    }
    
    /**
     * Set name of security
     * 
     * @param security Name of security
     */
    public void setSecurity(String security) {
        this.security = security;
    }
    
    /**
     * Get raw data of trading interfaces ID, prices and depths of ask prices
     * 
     * @return Raw data of trading interfaces ID, prices and depths
     */
    public List<Integer> getData_ask() {
        return data_ask;
    }

    /**
     * Set raw data of trading interfaces ID, prices and depths for ask prices
     * 
     * @param precios Raw data of trading interfaces ID, prices and depths
     */
    public void setData_ask (List<Integer> precios) {
        this.data_ask = precios;
    }  
    
    /**
     * Get raw data of trading interfaces ID, prices and depths of bid prices
     * 
     * @return Raw data of trading interfaces ID, prices and depths
     */
    public List<Integer> getData_bid () {
        return data_bid;
    }

    /**
     * Set raw data of trading interfaces ID, prices and depths for bid prices
     * 
     * @param precios Raw data of trading interfaces ID, prices and depths
     */
    public void setData_bid (List<Integer> precios) {
        this.data_bid = precios;
    }
    
    /** 
     * Get list of prices for ask
     * 
     * @return List of prices for ask
     */
    public List<Integer> getPrices_ask() {
        
        List<Integer> ret = new ArrayList<>();
        
        for (int i = 0; i < data_ask.size(); i += 3)
        {
            ret.add(data_ask.get(i + 1));
        }
        
        return ret;
    }

    /** 
     * Get list of prices for bid
     * 
     * @return List of prices for bid
     */
    public List<Integer> getPrices_bid() {
        
        List<Integer> ret = new ArrayList<>();
        
        for (int i = 0; i < data_ask.size(); i += 3)
        {
            ret.add(data_ask.get(i + 1));
        }
        
        return ret;
    }

    /** 
     * Get depths for ask
     * 
     * @return List of depths for ask
     */
    public List<Integer> getDepth_ask() {
        
        List<Integer> ret = new ArrayList<>();
        
        for (int i = 0; i < data_ask.size(); i += 3)
        {
            ret.add(data_bid.get(i + 2));
        }
        
        return ret;
    }

    /** 
     * Get depths for bid
     * 
     * @return List of depths for bid
     */
    public List<Integer> getDepth_bid() {
        
        List<Integer> ret = new ArrayList<>();
        
        for (int i = 0; i < data_ask.size(); i += 3)
        {
            ret.add(data_bid.get(i + 2));
        }
        
        return ret;
    }

    /** 
     * Get trading Interfaces IDs for ask
     * 
     * @return List of Trading Interfaces IDs for ask
     */
    public List<Integer> getTI_ask() {
        
        List<Integer> ret = new ArrayList<>();
        
        for (int i = 0; i < data_ask.size(); i += 3)
        {
            ret.add(data_ask.get(i));
        }
        
        return ret;
    }

    /** 
     * Get trading Interfaces IDs for bid
     * 
     * @return List of Trading Interfaces IDs for bid
     */
    public List<Integer> getTI_bid() {
        
        List<Integer> ret = new ArrayList<>();
        
        for (int i = 0; i < data_ask.size(); i += 3)
        {
            ret.add(data_bid.get(i));
        }
        
        return ret;
    }
    
    /** 
     * Get position i from list of ask prices
     * 
     * @param i Position of list of ask prices
     * @return Price i of ask prices
     */
    public int getPrices_ask(int i) {
        
        int ret = 0;
        
        if (data_ask.size() > ((i * 3) + 1))
        {
            ret = data_ask.get((i * 3) + 1);
        }
        
        return ret;
    }

    /** 
     * Get position i from list of bid prices
     * 
     * @param i Position of list of bid prices
     * @return Price i of bid prices
     */
    public int getPrices_bid(int i) {
        
        int ret = 0;
        
        if (data_bid.size() > ((i * 3) + 1))
        {
            ret = data_bid.get((i * 3) + 1);
        }
        
        return ret;
    }

    /** 
     * Get position i from list of ask depths
     * 
     * @param i Position of list of ask depths
     * @return Depth i of ask depths
     */
    public int getDepth_ask(int i) {
        
        int ret = 0;
        
        if (data_ask.size() > ((i * 3) + 2))
        {
            ret = data_ask.get((i * 3) + 2);
        }
        
        return ret;
    }
    
    /** 
     * Get position i from list of ask depths
     * 
     * @param i Position of list of ask depths
     * @return Depth i of ask depths
     */
    public int getDepth_bid(int i) {
        
        int ret = 0;
        
        if (data_bid.size() > ((i * 3) + 2))
        {
            ret = data_bid.get((i * 3) + 2);
        }
        
        return ret;
    }

    /** 
     * Get position i from list of Trading interfaces ID
     * 
     * @param i Position of list of ask Trading Interfaces ID
     * @return QuoteID i of ask Trading Interfaces ID
     */
    public int getTI_ask(int i) {
        
        int ret = 0;
        
        if (data_ask.size() > (i * 3))
        {
            ret = data_ask.get(i * 3);
        }
        
        return ret;
    }

    /** 
     * Get position i from list of Trading interfaces ID
     * 
     * @param i Position of list of bid Trading Interfaces ID
     * @return QuoteID i of bid Trading Interfaces ID
     */
    public int getTI_bid(int i) {
        
        int ret = 0;
        
        if (data_bid.size() > (i * 3))
        {
            ret = data_bid.get(i * 3);
        }
        
        return ret;
    }
    
    /** 
     * Get number of ask prices
     * 
     * @return Number of ask prices
     */
    public int getSize_ask ()
    {
        return data_ask.size() / 3;
    }
    
    /** 
     * Get number of bid prices
     * 
     * @return Number of bid prices
     */
    public int getSize_bid ()
    {
        return data_bid.size() / 3;
    }
}

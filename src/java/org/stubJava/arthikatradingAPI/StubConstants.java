/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stubJava.arthikatradingAPI;

import java.util.HashMap;

/**
 *
 * @author gudu
 */
public class StubConstants {
    
    public static final byte SIDE_BID = (byte) 0x01;
    public static final byte SIDE_ASK = (byte) 0x02;
    
    // get configuration parameters from map
    static final byte[] MAPSERVER_CODE_MASK = {(byte) 0xFF,(byte) 0x00};

    static final byte[] MAPSERVER_GET_CONFIG_MASK =                 {(byte) 0x00, (byte) 0x01};
    static final byte[] MAPSERVER_GET_NUMBER_OF_PB =                {(byte) 0x15, (byte) 0x01};
    static final byte[] MAPSERVER_GET_PB_ID_FROM_INDEX =            {(byte) 0x02, (byte) 0x01};
    static final byte[] MAPSERVER_GET_PB_INDEX_FROM_ID =            {(byte) 0x03, (byte) 0x01};
    static final byte[] MAPSERVER_GET_PB_NAME_FROM_ID =             {(byte) 0x14, (byte) 0x01};
    static final byte[] MAPSERVER_GET_PB_NAME_FROM_INDEX =          {(byte) 0x05, (byte) 0x01};
    static final byte[] MAPSERVER_GET_NUMBER_OF_TI =                {(byte) 0x06, (byte) 0x01};
    static final byte[] MAPSERVER_GET_TI_ID_FROM_INDEX =            {(byte) 0x07, (byte) 0x01};
    static final byte[] MAPSERVER_GET_TI_INDEX_FROM_ID =            {(byte) 0x08, (byte) 0x01};
    static final byte[] MAPSERVER_GET_TI_NAME_FROM_ID =             {(byte) 0x09, (byte) 0x01};
    static final byte[] MAPSERVER_GET_TI_NAME_FROM_INDEX =          {(byte) 0x010, (byte) 0x01};
    static final byte[] MAPSERVER_GET_PB_FROM_TI_INDEX =            {(byte) 0x011, (byte) 0x01};
    static final byte[] MAPSERVER_GET_PB_FROM_TI_ID =               {(byte) 0x012, (byte) 0x01};
    static final byte[] MAPSERVER_GET_DECIMAL_POSITIONS_FOR_SECURITY =  {(byte) 0x013, (byte) 0x01};

    // get all types of prices
    final byte[] MAPSERVER_GET_PRICES_MASK =                        {(byte) 0x00, (byte) 0x02};
    static final byte[] MAPSERVER_GET_PRICES_FIX_TOB_BID =          {(byte) 0x01, (byte) 0x02};
    static final byte[] MAPSERVER_GET_PRICES_FIX_TOB_ASK =          {(byte) 0x02, (byte) 0x02};
    static final byte[] MAPSERVER_GET_PRICES_FIX_FBA_BID =          {(byte) 0x03, (byte) 0x02};
    static final byte[] MAPSERVER_GET_PRICES_FIX_FBA_ASK =          {(byte) 0x04, (byte) 0x02};
    static final byte[] MAPSERVER_GET_PRICES_FIX_FBD_BID =          {(byte) 0x05, (byte) 0x02};
    static final byte[] MAPSERVER_GET_PRICES_FIX_FBD_ASK =          {(byte) 0x06, (byte) 0x02};

    static final byte[] MAPSERVER_GET_PRICES_BOOK_ASSET =           {(byte) 0x10, (byte) 0x02};
    static final byte[] MAPSERVER_GET_PRICES_BOOK_SEC =             {(byte) 0x11, (byte) 0x02};
    
    // get exposures
    static final int MAPSERVER_GET_EXPOSURES_MASK = 0x0300;
    static final byte[] MAPSERVER_GET_ASSET_EXPOSURE =              {(byte) 0x01, (byte) 0x03};
    static final byte[] MAPSERVER_GET_SECURITY_EXPOSURE =           {(byte) 0x02, (byte) 0x03};
    static final byte[] MAPSERVER_GET_TOTAL_ASSET_EXPOSURE =        {(byte) 0x03, (byte) 0x03};
    static final byte[] MAPSERVER_GET_GLOBAL_ASSET_EXPOSURE =       {(byte) 0x04, (byte) 0x03};
    static final byte[] MAPSERVER_GET_GLOBAL_SECURITY_EXPOSURE =    {(byte) 0x05, (byte) 0x03};
    static final byte[] MAPSERVER_GET_GLOBAL_TOTAL_ASSET_EXPOSURE = {(byte) 0x06, (byte) 0x03};

    // get accounting from any accounting unit
    static final int MAPSERVER_GET_ACCOUNTING_MASK = 0x0400;
    static final byte[] MAPSERVER_GET_EQUITY =                      {(byte) 0x01, (byte) 0x04};
    static final byte[] MAPSERVER_GET_USED_MARGIN =                 {(byte) 0x02, (byte) 0x04};
    static final byte[] MAPSERVER_GET_RESERVED_MARGIN =             {(byte) 0x03, (byte) 0x04};
    static final byte[] MAPSERVER_GET_GLOBAL_EQUITY =               {(byte) 0x04, (byte) 0x04};

    // get alive trades from any accounting unit
    static final int MAPSERVER_GET_TRADES_MASK = 0x0500;
    static final byte[] MAPSERVER_SEND_TRADE =                      {(byte) 0x01, (byte) 0x05};
    static final byte[] MAPSERVER_MODIFY_TRADE =                    {(byte) 0x02, (byte) 0x05};
    static final byte[] MAPSERVER_CANCEL_TRADE =                    {(byte) 0x03, (byte) 0x05};
    static final byte[] MAPSERVER_GET_TRADES_ALIVE =                {(byte) 0x08, (byte) 0x05};
    static final byte[] MAPSERVER_GET_TRADE_ALIVE_INFO =            {(byte) 0x05, (byte) 0x05};
    static final byte[] MAPSERVER_GET_TRADE_HISTORIC_INFO =         {(byte) 0x07, (byte) 0x05};
    static final byte[] MAPSERVER_GET_TRADE_INFO =                  {(byte) 0x09, (byte) 0x05};
    static final byte[] MAPSERVER_TRADE_ALIVE_ID =                  {(byte) 0x06, (byte) 0x05};
    
    // Trades side
    public static final byte TRADE_SIDE_BUY =                     1;
    public static final byte TRADE_SIDE_SELL =                    2;

    // Trade types
    public static final byte TRADE_TYPE_MARKET =                  1;
    public static final byte TRADE_TYPE_LIMIT =                   2;
    public static final byte TRADE_TYPE_ICEBERG =                 3;

    // Time in force Valid values (not all type trades support all time in force values):
    public static final byte TRADE_TIMEINFORCE_DAY =              0;   // 0 = Day
    public static final byte TRADE_TIMEINFORCE_GOOD_TILL_CANCEL = 1;   // 1 = Good Till Cancel (GTC)
    public static final byte TRADE_TIMEINFORCE_INMED_OR_CANCEL =  3;   // 3 = Immediate or Cancel (OC)
    public static final byte TRADE_TIMEINFORCE_FILL_OR_KILL =     4;   // 4 = Fill or Kill (FOK)
    
    public static final HashMap<Integer, String> codeErrors;
    public static final HashMap<Integer, String> codeStatus;
    
    public static final HashMap<String, Byte> mapSecurities;
    public static final HashMap<Byte, String> mapSecurities_inverse;
    
    public static final HashMap<String, Byte> mapAsset;
    public static final HashMap<Byte, String> mapAsset_inverse;
    
    public static final byte AUD_CAD = 1;
    public static final byte AUD_CHF = 2;
    public static final byte AUD_JPY = 3;
    public static final byte AUD_NZD = 4;
    public static final byte AUD_SGD = 5;
    public static final byte AUD_USD = 6;
    public static final byte CAD_CHF = 7;
    public static final byte CAD_JPY = 8;
    public static final byte CAD_SGD = 9;
    public static final byte CHF_JPY = 10;
    public static final byte CHF_NOK = 11;
    public static final byte CHF_PLN = 12;
    public static final byte CHF_SEK = 13;
    public static final byte CHF_SGD = 14;
    public static final byte CZK_JPY = 15;
    public static final byte EUR_AED = 16;
    public static final byte EUR_AUD = 17;
    public static final byte EUR_BHD = 18;
    public static final byte EUR_CAD = 19;
    public static final byte EUR_CHF = 20;
    public static final byte EUR_CZK = 21;
    public static final byte EUR_DKK = 22;
    public static final byte EUR_GBP = 23;
    public static final byte EUR_HKD = 24;
    public static final byte EUR_HUF = 25;
    public static final byte EUR_ILS = 26;
    public static final byte EUR_INR = 27;
    public static final byte EUR_JPY = 28;
    public static final byte EUR_KWD = 29;
    public static final byte EUR_MXN = 30;
    public static final byte EUR_NOK = 31;
    public static final byte EUR_NZD = 32;
    public static final byte EUR_OMR = 33;
    public static final byte EUR_PLN = 34;
    public static final byte EUR_SAR = 35;
    public static final byte EUR_SEK = 36;
    public static final byte EUR_SGD = 37;
    public static final byte EUR_SKK = 38;
    public static final byte EUR_THB = 39;
    public static final byte EUR_TRY = 40;
    public static final byte EUR_USD = 41;
    public static final byte EUR_ZAR = 42;
    public static final byte GBP_AUD = 43;
    public static final byte GBP_CAD = 44;
    public static final byte GBP_CHF = 45;
    public static final byte GBP_DKK = 46;
    public static final byte GBP_HKD = 47;
    public static final byte GBP_HUF = 48;
    public static final byte GBP_ILS = 49;
    public static final byte GBP_JPY = 50;
    public static final byte GBP_NOK = 51;
    public static final byte GBP_NZD = 52;
    public static final byte GBP_PLN = 53;
    public static final byte GBP_SEK = 54;
    public static final byte GBP_SGD = 55;
    public static final byte GBP_USD = 56;
    public static final byte HKD_JPY = 57;
    public static final byte HUF_JPY = 58;
    public static final byte MXN_JPY = 59;
    public static final byte NOK_JPY = 60;
    public static final byte NOK_SEK = 61;
    public static final byte NZD_CAD = 62;
    public static final byte NZD_CHF = 63;
    public static final byte NZD_DKK = 64;
    public static final byte NZD_JPY = 65;
    public static final byte NZD_SEK = 66;
    public static final byte NZD_SGD = 67;
    public static final byte NZD_USD = 68;
    public static final byte PLN_JPY = 69;
    public static final byte SEK_JPY = 70;
    public static final byte SGD_JPY = 71;
    public static final byte TRY_JPY = 72;
    public static final byte USD_AED = 73;
    public static final byte USD_BHD = 74;
    public static final byte USD_CAD = 75;
    public static final byte USD_CHF = 76;
    public static final byte USD_CLP = 77;
    public static final byte USD_CZK = 78;
    public static final byte USD_DKK = 79;
    public static final byte USD_HKD = 80;
    public static final byte USD_HUF = 81;
    public static final byte USD_IDR = 82;
    public static final byte USD_ILS = 83;
    public static final byte USD_INR = 84;
    public static final byte USD_JPY = 85;
    public static final byte USD_KWD = 86;
    public static final byte USD_MXN = 87;
    public static final byte USD_NOK = 88;
    public static final byte USD_OMR = 89;
    public static final byte USD_PLN = 90;
    public static final byte USD_RUB = 91;
    public static final byte USD_SAR = 92;
    public static final byte USD_SEK = 93;
    public static final byte USD_SGD = 94;
    public static final byte USD_SKK = 95;
    public static final byte USD_THB = 96;
    public static final byte USD_TRY = 97;
    public static final byte USD_ZAR = 98;
    public static final byte XAG_EUR = 99;

    
    public static final byte AED = 1;
    public static final byte AUD = 2;
    public static final byte BHD = 3;
    public static final byte CAD = 4;
    public static final byte CHF = 5;
    public static final byte CLP = 6;
    public static final byte CZK = 7;
    public static final byte DKK = 8;
    public static final byte EUR = 9;
    public static final byte GBP = 10;
    public static final byte HKD = 11;
    public static final byte HUF = 12;
    public static final byte IDR = 13;
    public static final byte ILS = 14;
    public static final byte INR = 15;
    public static final byte JPY = 16;
    public static final byte KWD = 17;
    public static final byte MXN = 18;
    public static final byte NOK = 19;
    public static final byte NZD = 20;
    public static final byte OMR = 21;
    public static final byte PLN = 22;
    public static final byte RUB = 23;
    public static final byte SAR = 24;
    public static final byte SEK = 25;
    public static final byte SGD = 26;
    public static final byte SKK = 27;
    public static final byte THB = 28;
    public static final byte TRY = 29;
    public static final byte USD = 30;
    public static final byte XAG = 31;
    public static final byte XAU = 32;
    public static final byte ZAR = 33;
    
    public static final int ERROR_TRADINGINTERFACE    = -1001;
    public static final int ERROR_ORDERTOOSMALL       = -1002;
    public static final int ERROR_ORDERTOOBIG         = -1003;
    public static final int ERROR_NOMARGIN            = -1004;
    public static final int ERROR_WRONGUSER           = -1005;
    public static final int ERROR_WRONGMESSAGE        = -1006;
    public static final int ERROR_WRONG_SECURITY      = -1007;
    public static final int ERROR_TRADE_NOT_FOUND     = -1008;
    
    public static final int TRADE_STATE_INVALID               = 0;
    public static final int TRADE_STATE_IN_FLUX               = 1;
    public static final int TRADE_STATE_PENDING               = 2;
    public static final int TRADE_STATE_INDETERMINED          = 3;
    public static final int TRADE_STATE_EXECUTED              = 4;
    public static final int TRADE_STATE_CANCELED              = 5;
    public static final int TRADE_STATE_REJECTED              = 6;
    public static final int TRADE_STATE_ERROR_SEND            = 7;
    public static final int TRADE_STATE_REPLACED_TO_NEW       = 8;
    public static final int TRADE_STATE_REPLACED_TO_CANCEL    = 9;
    public static final int TRADE_STATE_CANCELED_BY_USER      = 10;
 
    static
    {
        codeErrors = new HashMap();
        codeErrors.put(-1001, "ERROR_TRADINGINTERFACE");
        codeErrors.put(-1002, "ERROR_ORDERTOOSMALL");
        codeErrors.put(-1003, "ERROR_ORDERTOOBIG");
        codeErrors.put(-1004, "ERROR_NOMARGIN");
        codeErrors.put(-1005, "ERROR_WRONGUSER");
        codeErrors.put(-1006, "ERROR_WRONGMESSAGE");
        codeErrors.put(-1007, "ERROR_WRONG_SECURITY");
        codeErrors.put(-1008, "ERROR_TRADE_NOT_FOUND");
        
        
        codeStatus = new HashMap();
        codeStatus.put(0, "TRADE_STATE_INVALID");
        codeStatus.put(1, "TRADE_STATE_IN_FLUX");
        codeStatus.put(2, "TRADE_STATE_PENDING");
        codeStatus.put(3, "TRADE_STATE_INDETERMINED");
        codeStatus.put(4, "TRADE_STATE_EXECUTED");
        codeStatus.put(5, "TRADE_STATE_CANCELED");
        codeStatus.put(6, "TRADE_STATE_REJECTED");
        codeStatus.put(7, "TRADE_STATE_ERROR_SEND");
        codeStatus.put(8, "TRADE_STATE_REPLACED_TO_NEW");
        codeStatus.put(9, "TRADE_STATE_REPLACED_TO_CANCEL");
        codeStatus.put(10, "TRADE_STATE_CANCELED_BY_USER");
        
        
        mapSecurities = new HashMap();
        mapSecurities.put("AUD_CAD", (byte) 1);      
        mapSecurities.put("AUD_CHF", (byte) 2);      
        mapSecurities.put("AUD_JPY", (byte) 3);      
        mapSecurities.put("AUD_NZD", (byte) 4);      
        mapSecurities.put("AUD_SGD", (byte) 5);      
        mapSecurities.put("AUD_USD", (byte) 6);      
        mapSecurities.put("CAD_CHF", (byte) 7);      
        mapSecurities.put("CAD_JPY", (byte) 8);      
        mapSecurities.put("CAD_SGD", (byte) 9);      
        mapSecurities.put("CHF_JPY", (byte) 10);      
        mapSecurities.put("CHF_NOK", (byte) 11);      
        mapSecurities.put("CHF_PLN", (byte) 12);      
        mapSecurities.put("CHF_SEK", (byte) 13);      
        mapSecurities.put("CHF_SGD", (byte) 14);      
        mapSecurities.put("CZK_JPY", (byte) 15);      
        mapSecurities.put("EUR_AED", (byte) 16);      
        mapSecurities.put("EUR_AUD", (byte) 17);      
        mapSecurities.put("EUR_BHD", (byte) 18);      
        mapSecurities.put("EUR_CAD", (byte) 19);      
        mapSecurities.put("EUR_CHF", (byte) 20);      
        mapSecurities.put("EUR_CZK", (byte) 21);      
        mapSecurities.put("EUR_DKK", (byte) 22);      
        mapSecurities.put("EUR_GBP", (byte) 23);      
        mapSecurities.put("EUR_HKD", (byte) 24);      
        mapSecurities.put("EUR_HUF", (byte) 25);      
        mapSecurities.put("EUR_ILS", (byte) 26);      
        mapSecurities.put("EUR_INR", (byte) 27);      
        mapSecurities.put("EUR_JPY", (byte) 28);      
        mapSecurities.put("EUR_KWD", (byte) 29);      
        mapSecurities.put("EUR_MXN", (byte) 30);      
        mapSecurities.put("EUR_NOK", (byte) 31);      
        mapSecurities.put("EUR_NZD", (byte) 32);      
        mapSecurities.put("EUR_OMR", (byte) 33);      
        mapSecurities.put("EUR_PLN", (byte) 34);
        mapSecurities.put("EUR_SAR", (byte) 35);
        mapSecurities.put("EUR_SEK", (byte) 36);
        mapSecurities.put("EUR_SGD", (byte) 37);
        mapSecurities.put("EUR_SKK", (byte) 38);
        mapSecurities.put("EUR_THB", (byte) 39);
        mapSecurities.put("EUR_TRY", (byte) 40);
        mapSecurities.put("EUR_USD", (byte) 41);
        mapSecurities.put("EUR_ZAR", (byte) 42);
        mapSecurities.put("GBP_AUD", (byte) 43);
        mapSecurities.put("GBP_CAD", (byte) 44);
        mapSecurities.put("GBP_CHF", (byte) 45);
        mapSecurities.put("GBP_DKK", (byte) 46);
        mapSecurities.put("GBP_HKD", (byte) 47);
        mapSecurities.put("GBP_HUF", (byte) 48);
        mapSecurities.put("GBP_ILS", (byte) 49);
        mapSecurities.put("GBP_JPY", (byte) 50);
        mapSecurities.put("GBP_NOK", (byte) 51);
        mapSecurities.put("GBP_NZD", (byte) 52);
        mapSecurities.put("GBP_PLN", (byte) 53);
        mapSecurities.put("GBP_SEK", (byte) 54);
        mapSecurities.put("GBP_SGD", (byte) 55);
        mapSecurities.put("GBP_USD", (byte) 56);
        mapSecurities.put("HKD_JPY", (byte) 57);
        mapSecurities.put("HUF_JPY", (byte) 58);
        mapSecurities.put("MXN_JPY", (byte) 59);
        mapSecurities.put("NOK_JPY", (byte) 60);
        mapSecurities.put("NOK_SEK", (byte) 61);
        mapSecurities.put("NZD_CAD", (byte) 62);
        mapSecurities.put("NZD_CHF", (byte) 63);
        mapSecurities.put("NZD_DKK", (byte) 64);
        mapSecurities.put("NZD_JPY", (byte) 65);
        mapSecurities.put("NZD_SEK", (byte) 66);
        mapSecurities.put("NZD_SGD", (byte) 67);
        mapSecurities.put("NZD_USD", (byte) 68);
        mapSecurities.put("PLN_JPY", (byte) 69);
        mapSecurities.put("SEK_JPY", (byte) 70);
        mapSecurities.put("SGD_JPY", (byte) 71);
        mapSecurities.put("TRY_JPY", (byte) 72);
        mapSecurities.put("USD_AED", (byte) 73);
        mapSecurities.put("USD_BHD", (byte) 74);
        mapSecurities.put("USD_CAD", (byte) 75);
        mapSecurities.put("USD_CHF", (byte) 76);
        mapSecurities.put("USD_CLP", (byte) 77);
        mapSecurities.put("USD_CZK", (byte) 78);
        mapSecurities.put("USD_DKK", (byte) 79);
        mapSecurities.put("USD_HKD", (byte) 80);
        mapSecurities.put("USD_HUF", (byte) 81);
        mapSecurities.put("USD_IDR", (byte) 82);
        mapSecurities.put("USD_ILS", (byte) 83);
        mapSecurities.put("USD_INR", (byte) 84);
        mapSecurities.put("USD_JPY", (byte) 85);
        mapSecurities.put("USD_KWD", (byte) 86);
        mapSecurities.put("USD_MXN", (byte) 87);
        mapSecurities.put("USD_NOK", (byte) 88);
        mapSecurities.put("USD_OMR", (byte) 89);
        mapSecurities.put("USD_PLN", (byte) 90);
        mapSecurities.put("USD_RUB", (byte) 91);
        mapSecurities.put("USD_SAR", (byte) 92);
        mapSecurities.put("USD_SEK", (byte) 93);
        mapSecurities.put("USD_SGD", (byte) 94);
        mapSecurities.put("USD_SKK", (byte) 95);
        mapSecurities.put("USD_THB", (byte) 96);
        mapSecurities.put("USD_TRY", (byte) 97);
        mapSecurities.put("USD_ZAR", (byte) 98);
        mapSecurities.put("XAG_EUR", (byte) 99);

              
        mapSecurities_inverse = new HashMap();
        mapSecurities_inverse.put((byte) 1, "AUD_CAD");
        mapSecurities_inverse.put((byte) 2, "AUD_CHF");
        mapSecurities_inverse.put((byte) 3, "AUD_JPY");
        mapSecurities_inverse.put((byte) 4, "AUD_NZD");
        mapSecurities_inverse.put((byte) 5, "AUD_SGD");
        mapSecurities_inverse.put((byte) 6, "AUD_USD");
        mapSecurities_inverse.put((byte) 7, "CAD_CHF");
        mapSecurities_inverse.put((byte) 8, "CAD_JPY");
        mapSecurities_inverse.put((byte) 9, "CAD_SGD");
        mapSecurities_inverse.put((byte) 10, "CHF_JPY");
        mapSecurities_inverse.put((byte) 11, "CHF_NOK");
        mapSecurities_inverse.put((byte) 12, "CHF_PLN");
        mapSecurities_inverse.put((byte) 13, "CHF_SEK");
        mapSecurities_inverse.put((byte) 14, "CHF_SGD");
        mapSecurities_inverse.put((byte) 15, "CZK_JPY");
        mapSecurities_inverse.put((byte) 16, "EUR_AED");
        mapSecurities_inverse.put((byte) 17, "EUR_AUD");
        mapSecurities_inverse.put((byte) 18, "EUR_BHD");
        mapSecurities_inverse.put((byte) 19, "EUR_CAD");
        mapSecurities_inverse.put((byte) 20, "EUR_CHF");
        mapSecurities_inverse.put((byte) 21, "EUR_CZK");
        mapSecurities_inverse.put((byte) 22, "EUR_DKK");
        mapSecurities_inverse.put((byte) 23, "EUR_GBP");
        mapSecurities_inverse.put((byte) 24, "EUR_HKD");
        mapSecurities_inverse.put((byte) 25, "EUR_HUF");
        mapSecurities_inverse.put((byte) 26, "EUR_ILS");
        mapSecurities_inverse.put((byte) 27, "EUR_INR");
        mapSecurities_inverse.put((byte) 28, "EUR_JPY");
        mapSecurities_inverse.put((byte) 29, "EUR_KWD");
        mapSecurities_inverse.put((byte) 30, "EUR_MXN");
        mapSecurities_inverse.put((byte) 31, "EUR_NOK");
        mapSecurities_inverse.put((byte) 32, "EUR_NZD");
        mapSecurities_inverse.put((byte) 33, "EUR_OMR");
        mapSecurities_inverse.put((byte) 34, "EUR_PLN");
        mapSecurities_inverse.put((byte) 35, "EUR_SAR");
        mapSecurities_inverse.put((byte) 36, "EUR_SEK");
        mapSecurities_inverse.put((byte) 37, "EUR_SGD");
        mapSecurities_inverse.put((byte) 38, "EUR_SKK");
        mapSecurities_inverse.put((byte) 39, "EUR_THB");
        mapSecurities_inverse.put((byte) 40, "EUR_TRY");
        mapSecurities_inverse.put((byte) 41, "EUR_USD");
        mapSecurities_inverse.put((byte) 42, "EUR_ZAR");
        mapSecurities_inverse.put((byte) 43, "GBP_AUD");
        mapSecurities_inverse.put((byte) 44, "GBP_CAD");
        mapSecurities_inverse.put((byte) 45, "GBP_CHF");
        mapSecurities_inverse.put((byte) 46, "GBP_DKK");
        mapSecurities_inverse.put((byte) 47, "GBP_HKD");
        mapSecurities_inverse.put((byte) 48, "GBP_HUF");
        mapSecurities_inverse.put((byte) 49, "GBP_ILS");
        mapSecurities_inverse.put((byte) 50, "GBP_JPY");
        mapSecurities_inverse.put((byte) 51, "GBP_NOK");
        mapSecurities_inverse.put((byte) 52, "GBP_NZD");
        mapSecurities_inverse.put((byte) 53, "GBP_PLN");
        mapSecurities_inverse.put((byte) 54, "GBP_SEK");
        mapSecurities_inverse.put((byte) 55, "GBP_SGD");
        mapSecurities_inverse.put((byte) 56, "GBP_USD");
        mapSecurities_inverse.put((byte) 57, "HKD_JPY");
        mapSecurities_inverse.put((byte) 58, "HUF_JPY");
        mapSecurities_inverse.put((byte) 59, "MXN_JPY");
        mapSecurities_inverse.put((byte) 60, "NOK_JPY");
        mapSecurities_inverse.put((byte) 61, "NOK_SEK");
        mapSecurities_inverse.put((byte) 62, "NZD_CAD");
        mapSecurities_inverse.put((byte) 63, "NZD_CHF");
        mapSecurities_inverse.put((byte) 64, "NZD_DKK");
        mapSecurities_inverse.put((byte) 65, "NZD_JPY");
        mapSecurities_inverse.put((byte) 66, "NZD_SEK");
        mapSecurities_inverse.put((byte) 67, "NZD_SGD");
        mapSecurities_inverse.put((byte) 68, "NZD_USD");
        mapSecurities_inverse.put((byte) 69, "PLN_JPY");
        mapSecurities_inverse.put((byte) 70, "SEK_JPY");
        mapSecurities_inverse.put((byte) 71, "SGD_JPY");
        mapSecurities_inverse.put((byte) 72, "TRY_JPY");
        mapSecurities_inverse.put((byte) 73, "USD_AED");
        mapSecurities_inverse.put((byte) 74, "USD_BHD");
        mapSecurities_inverse.put((byte) 75, "USD_CAD");
        mapSecurities_inverse.put((byte) 76, "USD_CHF");
        mapSecurities_inverse.put((byte) 77, "USD_CLP");
        mapSecurities_inverse.put((byte) 78, "USD_CZK");
        mapSecurities_inverse.put((byte) 79, "USD_DKK");
        mapSecurities_inverse.put((byte) 80, "USD_HKD");
        mapSecurities_inverse.put((byte) 81, "USD_HUF");
        mapSecurities_inverse.put((byte) 82, "USD_IDR");
        mapSecurities_inverse.put((byte) 83, "USD_ILS");
        mapSecurities_inverse.put((byte) 84, "USD_INR");
        mapSecurities_inverse.put((byte) 85, "USD_JPY");
        mapSecurities_inverse.put((byte) 86, "USD_KWD");
        mapSecurities_inverse.put((byte) 87, "USD_MXN");
        mapSecurities_inverse.put((byte) 88, "USD_NOK");
        mapSecurities_inverse.put((byte) 89, "USD_OMR");
        mapSecurities_inverse.put((byte) 90, "USD_PLN");
        mapSecurities_inverse.put((byte) 91, "USD_RUB");
        mapSecurities_inverse.put((byte) 92, "USD_SAR");
        mapSecurities_inverse.put((byte) 93, "USD_SEK");
        mapSecurities_inverse.put((byte) 94, "USD_SGD");
        mapSecurities_inverse.put((byte) 95, "USD_SKK");
        mapSecurities_inverse.put((byte) 96, "USD_THB");
        mapSecurities_inverse.put((byte) 97, "USD_TRY");
        mapSecurities_inverse.put((byte) 98, "USD_ZAR");
        mapSecurities_inverse.put((byte) 99, "XAG_EUR");

        
        mapAsset = new HashMap();
        mapAsset.put("AED", (byte) 1);       //Emirates Dirham
        mapAsset.put("AUD", (byte) 2);       //Australia Dollar
        mapAsset.put("BHD", (byte) 3);       // Bahrain Dinar
        mapAsset.put("CAD", (byte) 4);       //Canada Dollar
        mapAsset.put("CHF", (byte) 5);       //Switzerland Franc
        mapAsset.put("CLP", (byte) 6);       //Chile Peso
        mapAsset.put("CZK", (byte) 7);       //Czech Republic Koruna
        mapAsset.put("DKK", (byte) 8);       //Denmark Krone
        mapAsset.put("EUR", (byte) 9);       //Euro Member Countries
        mapAsset.put("GBP", (byte) 10);      //United Kingdom Pound
        mapAsset.put("HKD", (byte) 11);      //Hong Kong Dollar
        mapAsset.put("HUF", (byte) 12);      //Hungary Forint
        mapAsset.put("IDR", (byte) 13);      //Indonesia Rupiah
        mapAsset.put("ILS", (byte) 14);      //Israel Shekel
        mapAsset.put("INR", (byte) 15);      //India Rupee
        mapAsset.put("JPY", (byte) 16);      //Japan Yen
        mapAsset.put("KWD", (byte) 17);      //Kuwaiti Dinar
        mapAsset.put("MXN", (byte) 18);      //Mexico Peso
        mapAsset.put("NOK", (byte) 19);      //Norway Krone
        mapAsset.put("NZD", (byte) 20);      //New Zealand Dollar
        mapAsset.put("OMR", (byte) 21);      //Oman Rial
        mapAsset.put("PLN", (byte) 22);      //Poland Zloty
        mapAsset.put("RUB", (byte) 23);      //Russia Ruble
        mapAsset.put("SAR", (byte) 24);      //Saudi Arabia Riyal
        mapAsset.put("SEK", (byte) 25);      //Sweden Krona
        mapAsset.put("SGD", (byte) 26);      //Singapore Dollar
        mapAsset.put("SKK", (byte) 27);      //Slovak Koruna
        mapAsset.put("THB", (byte) 28);      //Thailand Baht
        mapAsset.put("TRY", (byte) 29);      //Turkey Lira
        mapAsset.put("USD", (byte) 30);      //United States Dollar
        mapAsset.put("XAG", (byte) 31);      //Silver
        mapAsset.put("XAU", (byte) 32);      //Gold
        mapAsset.put("ZAR", (byte) 33);      //South Africa Rand
        
        
        mapAsset_inverse = new HashMap();
        mapAsset_inverse.put((byte) 1, "AED");
        mapAsset_inverse.put((byte) 2, "AUD");
        mapAsset_inverse.put((byte) 3, "BHD");
        mapAsset_inverse.put((byte) 4, "CAD");
        mapAsset_inverse.put((byte) 5, "CHF");
        mapAsset_inverse.put((byte) 6, "CLP");
        mapAsset_inverse.put((byte) 7, "CZK");
        mapAsset_inverse.put((byte) 8, "DKK");
        mapAsset_inverse.put((byte) 9, "EUR");
        mapAsset_inverse.put((byte) 10, "GBP");
        mapAsset_inverse.put((byte) 11, "HKD");
        mapAsset_inverse.put((byte) 12, "HUF");
        mapAsset_inverse.put((byte) 13, "IDR");
        mapAsset_inverse.put((byte) 14, "ILS");
        mapAsset_inverse.put((byte) 15, "INR");
        mapAsset_inverse.put((byte) 16, "JPY");
        mapAsset_inverse.put((byte) 17, "KWD");
        mapAsset_inverse.put((byte) 18, "MXN");
        mapAsset_inverse.put((byte) 19, "NOK");
        mapAsset_inverse.put((byte) 20, "NZD");
        mapAsset_inverse.put((byte) 21, "OMR");
        mapAsset_inverse.put((byte) 22, "PLN");
        mapAsset_inverse.put((byte) 23, "RUB");
        mapAsset_inverse.put((byte) 24, "SAR");
        mapAsset_inverse.put((byte) 25, "SEK");
        mapAsset_inverse.put((byte) 26, "SGD");
        mapAsset_inverse.put((byte) 27, "SKK");
        mapAsset_inverse.put((byte) 28, "THB");
        mapAsset_inverse.put((byte) 29, "TRY");
        mapAsset_inverse.put((byte) 30, "USD");
        mapAsset_inverse.put((byte) 31, "XAG");
        mapAsset_inverse.put((byte) 32, "XAU");
        mapAsset_inverse.put((byte) 33, "ZAR");

    }
}

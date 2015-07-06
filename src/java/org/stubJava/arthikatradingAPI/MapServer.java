package org.stubJava.arthikatradingAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapServer {
    // header for incoming messages
    private byte[] msg = new byte[154];
    private udpClient udp;

    /**
    * Public Constructor.
    * 
    * @param host String that define the host where is stub
    * @param port String that define the port where is stub
    * 
    */
    public MapServer (String host, String port)
    {
        udp = new udpClient (host, port);
    }
    
    // Config methods
    
    /**
    * Get number of Prime Brokers
    * 
    * @return number of Prime Brokers
    * 
    */
    public int getNumberOfPB ()
    {   
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_NUMBER_OF_PB[0];
        msg[1] = StubConstants.MAPSERVER_GET_NUMBER_OF_PB[1];
        
        sendAndRecv (msg);
        
        return getParam(1);
    }
    
    /**
    * Get Prime Broker Index from Prime Broker ID
    * 
    * @param id Integer that identify the Prime Broker
    * @return index of Prime Broker
    * 
    */
    public int getPBIndexFromID (int id)
    {       
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_PB_INDEX_FROM_ID[0];
        msg[1] = StubConstants.MAPSERVER_GET_PB_INDEX_FROM_ID[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((id >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);
        
        return getParam(1);
    }
    
    /**
    * Get Prime Broker ID from Prime Broker Index
    * 
    * @param pbindex Integer that identify the Prime Broker
    * @return ID of Prime Broker
    * 
    */
    public int getPBIDFromIndex (int pbindex)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_PB_ID_FROM_INDEX[0];
        msg[1] = StubConstants.MAPSERVER_GET_PB_ID_FROM_INDEX[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((pbindex >> i*8 ) & 0x000000FF);
        }
                
        sendAndRecv (msg);
        
        return getParam(1);
    }
    
    /**
    * Get Prime Broker name from Prime Broker ID
    * 
    * @param id Integer that identify the Prime Broker
    * @return name of Prime Broker
    * 
    */
    public String getPBNameFromID (int id)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_PB_NAME_FROM_ID[0];
        msg[1] = StubConstants.MAPSERVER_GET_PB_NAME_FROM_ID[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((id >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);
        
        String ret = new String (getPayload());
        
        return ret;
    }
    
    /**
    * Get Prime Broker name from Prime Broker Index
    * 
    * @param pbindex Integer that identify the Prime Broker
    * @return name of Prime Broker
    * 
    */
    public String getPBNameFromIndex (int pbindex)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_PB_NAME_FROM_INDEX[0];
        msg[1] = StubConstants.MAPSERVER_GET_PB_NAME_FROM_INDEX[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((pbindex >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);
        
        String ret = new String (getPayload());
        
        return ret;
    }
    
    /**
    * Get number of Trading Interfaces
    * 
    * @return number of Trading Interfaces
    * 
    */
    public int getNumberOfTI ()
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_NUMBER_OF_TI[0];
        msg[1] = StubConstants.MAPSERVER_GET_NUMBER_OF_TI[1];
        
        sendAndRecv (msg);
        
        return getParam(1);
    }
    
    /**
    * Get Trading Interface ID from Trading Interface Index
    * 
    * @param tiIndex Integer that identify the Trading Interface
    * @return Trading Interface ID
    * 
    */
    public int getTIIDFromTIIndex (int tiIndex)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_TI_ID_FROM_INDEX[0];
        msg[1] = StubConstants.MAPSERVER_GET_TI_ID_FROM_INDEX[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((tiIndex >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);
        
        return getParam(1);
    }
      
    /**
    * Get Trading Interface Index from Trading Interface ID
    * 
    * @param id Integer that identify the Trading Interface
    * @return Trading Interface ID
    * 
    */
    public int getTIIndexFromTIID (int id)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_TI_INDEX_FROM_ID[0];
        msg[1] = StubConstants.MAPSERVER_GET_TI_INDEX_FROM_ID[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((id >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);
        
        return getParam(1);
    }
    
    /**
    * Get Trading Interface name from Trading Interface Index
    * 
    * @param tiIndex Integer that identify the Trading Interface
    * @return Trading Interface name
    * 
    */
    public String getTINameFromTIIndex (int tiIndex)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_TI_NAME_FROM_INDEX[0];
        msg[1] = StubConstants.MAPSERVER_GET_TI_NAME_FROM_INDEX[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((tiIndex >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);
        
        String ret = new String (getPayload());
        
        return ret;
    }
    
    /**
    * Get Trading Interface name from Trading Interface ID
    * 
    * @param id Integer that identify the Trading Interface
    * @return Trading Interface name
    * 
    */
    public String getTINameFromTIID (int id)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_TI_NAME_FROM_ID[0];
        msg[1] = StubConstants.MAPSERVER_GET_TI_NAME_FROM_ID[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((id >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);
        
        String ret = new String (getPayload());
        
        return ret;
    }
    
    /**
    * Get Prime Broker from Trading Interface Index
    * 
    * @param tiIndex Integer that identify the Trading Interface
    * @return number of Primer Broker
    * 
    */
    public int getPBFromTIIndex (int tiIndex)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_PB_FROM_TI_INDEX[0];
        msg[1] = StubConstants.MAPSERVER_GET_PB_FROM_TI_INDEX[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((tiIndex >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);
        
        return getParam(1);
    }
    
    /**
    * Get Prime Broker from Trading Interface ID
    * 
    * @param id Integer that identify the Trading Interface
    * @return number of Prime Broker
    * 
    */
    public int getPBFromTIID (int id)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_PB_FROM_TI_ID[0];
        msg[1] = StubConstants.MAPSERVER_GET_PB_FROM_TI_ID[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((id >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);
        
        return getParam(1);
    }
    
    /**
    * Get Accounting Unit ID
    * 
    * @param user user of system 
    * @param password password of system
    * @return Accounting Unit ID
    * 
    */
    public int getAUId (String user, String password)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_TRADES_ALIVE[0];
        msg[1] = StubConstants.MAPSERVER_GET_TRADES_ALIVE[1];
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        return getParam(2);
    }
    
    /**
    * Get Decimal Positions of a Security
    * 
    * @param security ID of security
    * @return number of decimal places
    * 
    */
    public int getDecPosSecurity (byte security)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_DECIMAL_POSITIONS_FOR_SECURITY[0];
        msg[1] = StubConstants.MAPSERVER_GET_DECIMAL_POSITIONS_FOR_SECURITY[1];
        
        int iSecurity = security;
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((iSecurity >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);
        
        return getParam(1);
    }
    
    // Get all types of prices
    
    /**
    * Get Top of Book Prices of a security and one side
    * 
    * @param security ID of security 
    * @param side SIDE_BID or SIDE_ASK
    * @return PricesToB object
    * 
    */
    public PricesToB getTOB (byte security, byte side)
    {   
        Arrays.fill(msg, (byte) 0);
        
        PricesToB ret = new PricesToB();
        
        if (StubConstants.SIDE_ASK == side)
        {
            msg[0] = StubConstants.MAPSERVER_GET_PRICES_FIX_TOB_ASK[0];
            msg[1] = StubConstants.MAPSERVER_GET_PRICES_FIX_TOB_ASK[1];
        }
        else
        {
            msg[0] = StubConstants.MAPSERVER_GET_PRICES_FIX_TOB_BID[0];
            msg[1] = StubConstants.MAPSERVER_GET_PRICES_FIX_TOB_BID[1];        
        }
        
        msg[8] = security;
        
        sendAndRecv (msg);
        
        ret.setCodeSecurity(security);
        ret.setSecurity(StubConstants.mapSecurities_inverse.get(security));
        
        if (StubConstants.SIDE_ASK == side)
        {
            parsePrices(ret.getData_ask());
        }
        else
        {
            parsePrices(ret.getData_bid());
        }       
                        
        return ret;
    }
    
    /**
    * Get Top of Book Prices of a security
    * 
    * @param security ID of security 
    * @return PricesToB object
    * 
    */
    public PricesToB getTOB (byte security)
    {   
        PricesToB ret = new PricesToB();
                        
        ret.setCodeSecurity(security);
        ret.setSecurity(StubConstants.mapSecurities_inverse.get(security));
        
        Arrays.fill(msg, (byte) 0);
        getListTOB (ret.getData_ask(), security, StubConstants.SIDE_ASK);
        Arrays.fill(msg, (byte) 0);
        getListTOB (ret.getData_bid(), security, StubConstants.SIDE_BID);
                        
        return ret;
    }
    
    private void getListTOB (List<Integer> list, byte security, byte side)
    {   
        Arrays.fill(msg, (byte) 0);
        
        if (StubConstants.SIDE_ASK == side)
        {
            msg[0] = StubConstants.MAPSERVER_GET_PRICES_FIX_TOB_ASK[0];
            msg[1] = StubConstants.MAPSERVER_GET_PRICES_FIX_TOB_ASK[1];
        }
        else
        {
            msg[0] = StubConstants.MAPSERVER_GET_PRICES_FIX_TOB_BID[0];
            msg[1] = StubConstants.MAPSERVER_GET_PRICES_FIX_TOB_BID[1];        
        }
        
        msg[8] = security;
        
        sendAndRecv (msg);
                
        parsePrices(list);
    }
     
    /**
    * Get Full Book Prices of a security and one side for a determined Trading Interface
    * 
    * @param security ID of security 
    * @param ti Trading Interface ID
    * @param numPrices depth for prices, 0 for Full Book, 1 for Top Of Book, n for a book with n levels
    * @param side SIDE_BID or SIDE_ASK
    * @return PricesFB object
    * 
    */
    public PricesFB getFBA (byte security, int ti, int numPrices, byte side)
    {
        Arrays.fill(msg, (byte) 0);
        
        if (StubConstants.SIDE_ASK == side)
        {
            msg[0] = StubConstants.MAPSERVER_GET_PRICES_FIX_FBA_ASK[0];
            msg[1] = StubConstants.MAPSERVER_GET_PRICES_FIX_FBA_ASK[1];
        }
        else
        {
            msg[0] = StubConstants.MAPSERVER_GET_PRICES_FIX_FBA_BID[0];
            msg[1] = StubConstants.MAPSERVER_GET_PRICES_FIX_FBA_BID[1];       
        }
        
        msg[8] = security;
        for (int i = 0; i < 4; i++)
        {
            msg[12+i] = (byte) ((ti >> i*8 ) & 0x000000FF);
            msg[16+i] = (byte) ((numPrices >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);
        
        PricesFB ret = new PricesFB();
        
        ret.setCodeSecurity(security);
        ret.setSecurity(StubConstants.mapSecurities_inverse.get(security));
        ret.setTi(ti);
        
        if (StubConstants.SIDE_ASK == side)
        {
            parsePrices(ret.getData_ask());
        }
        else
        {
            parsePrices(ret.getData_bid());
        }
                        
        return ret;
    }
    
    /**
    * Get Full Book Prices of a security and one side for a determined Trading Interface
    * 
    * @param security ID of security 
    * @param ti Trading Interface ID
    * @param numPrices depth for prices, 0 for Full Book, 1 for Top Of Book, n for a book with n levels
    * @return PricesFB object
    * 
    */
    public PricesFB getFBA (byte security, int ti, int numPrices)
    {
        PricesFB ret = new PricesFB();
                        
        ret.setCodeSecurity(security);
        ret.setSecurity(StubConstants.mapSecurities_inverse.get(security));
        ret.setTi(ti);
        
        Arrays.fill(msg, (byte) 0);
        ret.setData_ask(getListFBA (security, ti, numPrices, StubConstants.SIDE_ASK));
        Arrays.fill(msg, (byte) 0);
        ret.setData_bid(getListFBA (security, ti, numPrices, StubConstants.SIDE_BID));
                               
        return ret;
    }
    
    private List<Integer> getListFBA (byte security, int ti, int numPrices, byte side)
    {   
        Arrays.fill(msg, (byte) 0);
        
        List<Integer> ret = new ArrayList<>();
        
        if (StubConstants.SIDE_ASK == side)
        {
            msg[0] = StubConstants.MAPSERVER_GET_PRICES_FIX_FBA_ASK[0];
            msg[1] = StubConstants.MAPSERVER_GET_PRICES_FIX_FBA_ASK[1];
        }
        else
        {
            msg[0] = StubConstants.MAPSERVER_GET_PRICES_FIX_FBA_BID[0];
            msg[1] = StubConstants.MAPSERVER_GET_PRICES_FIX_FBA_BID[1];        
        }
        
        msg[8] = security;
        for (int i = 0; i < 4; i++)
        {
            msg[12+i] = (byte) ((ti >> i*8 ) & 0x000000FF);
            msg[16+i] = (byte) ((numPrices >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);
                
        parsePrices(ret);
                        
        return ret;
    }
    
    /**
    * Get Prices of Book for an asset
    * 
    * @param asset ID of asset (EUR, USD, etc...) 
    * @return Price of Asset
    * 
    */
    public double getPricesBookAsset (byte asset)
    {
        Arrays.fill(msg, (byte) 0);
        
        double ret;
        
        msg[0] = StubConstants.MAPSERVER_GET_PRICES_BOOK_ASSET[0];
        msg[1] = StubConstants.MAPSERVER_GET_PRICES_BOOK_ASSET[1];
        
        msg[8] = asset;
        
        sendAndRecv (msg);
        
        ret = getParam(1) + (getParam(2) / 100000.0);
        
        return ret;
    }
    
    /**
    * Get Prices of Book for a security
    * 
    * @param security ID of security (EUR/USD, etc...) 
    * @return Price of security
    * 
    */
    public double getPricesBookSecurity (byte security)
    {
        Arrays.fill(msg, (byte) 0);
        
        double ret;
        
        msg[0] = StubConstants.MAPSERVER_GET_PRICES_BOOK_SEC[0];
        msg[1] = StubConstants.MAPSERVER_GET_PRICES_BOOK_SEC[1];
        
        msg[8] = security;
        
        sendAndRecv (msg);
        
        ret = getParam(1) + (getParam(2) / 100000.0);
        
        return ret;
    }
    
    // Get exposures
    
    /**
    * Get Exposure for an Asset, an Accounting unit and Prime broker
    * 
    * @param auID ID of Accounting Unit
    * @param pbID ID of Prime Broker
    * @param asset ID of asset 
    * @return AssetExposure object
    * 
    */
    public AssetExposure getAssetExposure (int auID, int pbID, byte asset)
    {
        Arrays.fill(msg, (byte) 0);
        
        double exposure;
        
        msg[0] = StubConstants.MAPSERVER_GET_ASSET_EXPOSURE[0];
        msg[1] = StubConstants.MAPSERVER_GET_ASSET_EXPOSURE[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((auID >> i*8 ) & 0x000000FF);
            msg[12+i] = (byte) ((pbID >> i*8 ) & 0x000000FF);
        }
        
        msg[16] = asset;
        
        sendAndRecv (msg);        
   
        exposure = getParam(1) + (getParam(2) / 100000.0);  
        AssetExposure ret = new AssetExposure (exposure, asset);
        
        return ret;
    }
    
    /**
    * Get exposure for a Security, an Accounting unit and Prime broker
    * 
    * @param auID ID of Accounting Unit
    * @param pbID ID of Prime Broker
    * @param security ID of asset 
    * @return SecurityExposure object
    * 
    */
    public SecurityExposure getSecurityExposure (int auID, int pbID, byte security)
    {
        Arrays.fill(msg, (byte) 0);
        
        double price;
        double exposure;
        
        msg[0] = StubConstants.MAPSERVER_GET_SECURITY_EXPOSURE[0];
        msg[1] = StubConstants.MAPSERVER_GET_SECURITY_EXPOSURE[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((auID >> i*8 ) & 0x000000FF);
            msg[12+i] = (byte) ((pbID >> i*8 ) & 0x000000FF);
        }
        
        msg[16] = security;
        
        sendAndRecv (msg);
        
        exposure = getParam(1) + (getParam(2) / 100000.0); 
        price = getParam(3) + (getParam(4) / 100000.0); 
        
        SecurityExposure ret = new SecurityExposure (exposure, price, security);
        
        return ret;
    }
    
    /**
    * Get Total exposure for an Asset, an Accounting unit and Prime broker
    * 
    * @param auID ID of Accounting Unit
    * @param pbID ID of Prime Broker
    * @param asset ID of asset 
    * @return AssetExposure object
    * 
    */
    public AssetExposure getTotalAssetExposure (int auID, int pbID, byte asset)
    {
        Arrays.fill(msg, (byte) 0);
        
        double exposure;
        
        msg[0] = StubConstants.MAPSERVER_GET_TOTAL_ASSET_EXPOSURE[0];
        msg[1] = StubConstants.MAPSERVER_GET_TOTAL_ASSET_EXPOSURE[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((auID >> i*8 ) & 0x000000FF);
            msg[12+i] = (byte) ((pbID >> i*8 ) & 0x000000FF);
        }
        
        msg[16] = asset;
        
        sendAndRecv (msg);        
   
        exposure = getParam(1) + (getParam(2) / 100000.0);  
        AssetExposure ret = new AssetExposure (exposure, asset);
        
        return ret;
    }
    
    /**
    * Get Global exposure for an Asset in one Accounting unit
    * 
    * @param auID ID of Accounting Unit
    * @param asset ID of asset 
    * @return AssetExposure object
    * 
    */
    public AssetExposure getGlobalAssetExposure (int auID, byte asset)
    {
        Arrays.fill(msg, (byte) 0);
        
        double exposure;    
        
        msg[0] = StubConstants.MAPSERVER_GET_GLOBAL_ASSET_EXPOSURE[0];
        msg[1] = StubConstants.MAPSERVER_GET_GLOBAL_ASSET_EXPOSURE[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((auID >> i*8 ) & 0x000000FF);
        }
        
        msg[16] = asset;
        
        sendAndRecv (msg);        
   
        exposure = getParam(1) + (getParam(2) / 100000.0);  
        AssetExposure ret = new AssetExposure (exposure, asset);
        
        return ret;
    }
    
    /**
    * Get Global exposure for a Security and an Accounting unit
    * 
    * @param auID ID of Accounting Unit
    * @param security ID of asset 
    * @return SecurityExposure object
    * 
    */
    public SecurityExposure getGlobalSecurityExposure (int auID, byte security)
    {
        Arrays.fill(msg, (byte) 0);
        
        double price;
        double exposure;
        
        msg[0] = StubConstants.MAPSERVER_GET_GLOBAL_SECURITY_EXPOSURE[0];
        msg[1] = StubConstants.MAPSERVER_GET_GLOBAL_SECURITY_EXPOSURE[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((auID >> i*8 ) & 0x000000FF);
        }
        
        msg[16] = security;
        
        sendAndRecv (msg);
        
        exposure = getParam(1) + (getParam(2) / 100000.0); 
        price = getParam(3) + (getParam(4) / 100000.0); 
        
        SecurityExposure ret = new SecurityExposure (exposure, price, security);
        
        return ret;
    }
    
    /**
    * Get Global total exposure for an Asset in an Accounting unit
    * 
    * @param auID ID of Accounting Unit
    * @param asset ID of asset 
    * @return AssetExposure object
    * 
    */
    public AssetExposure getGlobalTotalAssetExposure (int auID, byte asset)
    {
        Arrays.fill(msg, (byte) 0);
        
        double exposure;
        
        msg[0] = StubConstants.MAPSERVER_GET_GLOBAL_TOTAL_ASSET_EXPOSURE[0];
        msg[1] = StubConstants.MAPSERVER_GET_GLOBAL_TOTAL_ASSET_EXPOSURE[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((auID >> i*8 ) & 0x000000FF);
        }
        
        msg[16] = asset;
        
        sendAndRecv (msg);        
   
        exposure = getParam(1) + (getParam(2) / 100000.0);  
        AssetExposure ret = new AssetExposure (exposure, asset);
        
        return ret;
    }
    
    // get accounting from any accounting unit
    
    /**
    * Get equity for an Accounting unit and one Prime Broker
    * 
    * @param auID ID of Accounting Unit
    * @param pbID ID of Prime Broker 
    * @return Equity in base asset
    * 
    */
    public double getEquity (int auID, int pbID)
    {
        Arrays.fill(msg, (byte) 0);
        
        double ret;
        
        msg[0] = StubConstants.MAPSERVER_GET_EQUITY[0];
        msg[1] = StubConstants.MAPSERVER_GET_EQUITY[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((auID >> i*8 ) & 0x000000FF);
            msg[12+i] = (byte) ((pbID >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);        
   
        ret = getParam(1) + (getParam(2) / 100000.0);
        
        return ret;
    }
    
    /**
    * Get used margin for an Accounting unit and one Prime Broker
    * 
    * @param auID ID of Accounting Unit
    * @param pbID ID of Prime Broker 
    * @return percentage of used margin
    * 
    */
    public double getUsedMargin (int auID, int pbID)
    {
        Arrays.fill(msg, (byte) 0);
        
        double ret;
        
        msg[0] = StubConstants.MAPSERVER_GET_USED_MARGIN[0];
        msg[1] = StubConstants.MAPSERVER_GET_USED_MARGIN[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((auID >> i*8 ) & 0x000000FF);
            msg[12+i] = (byte) ((pbID >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);        
   
        ret = getParam(1) + (getParam(2) / 100000.0);
        
        return ret;
    }
    
    /**
    * Get reserved margin for an Accounting unit and one Prime Broker
    * 
    * @param auID ID of Accounting Unit
    * @param pbID ID of Prime Broker 
    * @return percentage of reserved margin
    * 
    */
    public double getReserveMargin (int auID, int pbID)
    {
        Arrays.fill(msg, (byte) 0);
        
        double ret;
        
        msg[0] = StubConstants.MAPSERVER_GET_RESERVED_MARGIN[0];
        msg[1] = StubConstants.MAPSERVER_GET_RESERVED_MARGIN[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((auID >> i*8 ) & 0x000000FF);
            msg[12+i] = (byte) ((pbID >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);        
   
        ret = getParam(1) + (getParam(2) / 100000.0);
        
        return ret;
    }
    
    /**
    * Get global equity for an Accounting unit and one Prime Broker
    * 
    * @param auID ID of Accounting Unit
    * @param pbID ID of Prime Broker 
    * @return Global equity in base asset
    * 
    */
    public double getGlobalEquity (int auID, int pbID)
    {
        Arrays.fill(msg, (byte) 0);
        
        double ret;
        
        msg[0] = StubConstants.MAPSERVER_GET_GLOBAL_EQUITY[0];
        msg[1] = StubConstants.MAPSERVER_GET_GLOBAL_EQUITY[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((auID >> i*8 ) & 0x000000FF);
            msg[12+i] = (byte) ((pbID >> i*8 ) & 0x000000FF);
        }
        
        sendAndRecv (msg);        
   
        ret = getParam(1) + (getParam(2) / 100000.0);
        
        return ret;
    }
    
    // Trading methods
   
    /**
    * Send trade by specific Trade Interface
    * 
    * @param tradeType TRADE_TYPE_MARKET / TRADE_TYPE_LIMIT
    * @param side TRADE_SIDE_BUY / TRADE_SIDE_SELL
    * @param timeInForce TRADE_TIMEINFORCE_DAY / TRADE_TIMEINFORCE_GOOD_TILL_CANCEL / TRADE_TIMEINFORCE_INMED_OR_CANCEL / TRADE_TIMEINFORCE_FILL_OR_KILL
    * @param price For TRADE_TYPE_LIMIT only, price without decimal places
    * @param amount Amount of trade
    * @param tiId ID of Trading Interface
    * @param security Security for traded (EUR/USD, etc...)
    * @param user user of system 
    * @param password password of system
    * @return Trade object
    * 
    */
    public Trade sendTrade (byte tradeType , byte side, byte timeInForce, 
           int price, int amount, int tiId, byte security, String user, String password)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_SEND_TRADE[0];
        msg[1] = StubConstants.MAPSERVER_SEND_TRADE[1];
        
        msg[8] = tradeType;
        msg[9] = side;
        msg[10] = timeInForce;
        
        for (int i = 0; i < 4; i++)
        {
            msg[12+i] = (byte) ((price >> i*8 ) & 0x000000FF);
            msg[16+i] = (byte) ((amount >> i*8 ) & 0x000000FF);
        }
        
        for (int i = 0; i < 2; i++)
        {
            msg[20+i] = (byte) ((tiId >> i*8 ) & 0x000000FF);           
        }
        
        msg[22] = security;
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        Trade ret = new Trade (getParam(1), getParam(2), tradeType, side, timeInForce, price,
                               amount, tiId, security);
        
        return ret;
    }
    
    /**
    * Send trade by specific Trade Interface
    * 
    * @param tradeType TRADE_TYPE_MARKET / TRADE_TYPE_LIMIT
    * @param side TRADE_SIDE_BUY / TRADE_SIDE_SELL
    * @param timeInForce TRADE_TIMEINFORCE_DAY / TRADE_TIMEINFORCE_GOOD_TILL_CANCEL / TRADE_TIMEINFORCE_INMED_OR_CANCEL / TRADE_TIMEINFORCE_FILL_OR_KILL
    * @param price For TRADE_TYPE_LIMIT only, price without decimal places
    * @param amount Amount of trade
    * @param tiId ID of Trading Interface
    * @param security Security for traded (EUR/USD, etc...)
    * @param user user of system 
    * @param password password of system
    * @return Trade object
    * 
    */
    public Trade sendTrade (int tradeType , int side, int timeInForce, 
           int price, int amount, int tiId, byte security, String user, String password)
    {
        return sendTrade ((byte) ((tradeType) & 0x000000FF) , (byte) ((side) & 0x000000FF), 
                (byte) ((timeInForce) & 0x000000FF), price, amount, tiId, security, user, password);
    }
    
    /**
    * Send market trade by specific Trade Interface
    * 
    * @param side TRADE_SIDE_BUY / TRADE_SIDE_SELL
    * @param timeInForce TRADE_TIMEINFORCE_DAY / TRADE_TIMEINFORCE_GOOD_TILL_CANCEL / TRADE_TIMEINFORCE_INMED_OR_CANCEL / TRADE_TIMEINFORCE_FILL_OR_KILL
    * @param amount Amount of trade
    * @param tiId ID of Trading Interface
    * @param security Security for traded (EUR/USD, etc...)
    * @param user user of system 
    * @param password password of system
    * @return Trade object
    * 
    */
    public Trade sendMarketTrade (byte side, byte timeInForce, 
           int amount, int tiId, byte security, String user, String password)
    {
        return sendTrade (StubConstants.TRADE_TYPE_MARKET, side, timeInForce, 
           0, amount, tiId, security, user, password);
    }
    
    /**
    * Send market trade by specific Trade Interface
    * 
    * @param side TRADE_SIDE_BUY / TRADE_SIDE_SELL
    * @param timeInForce TRADE_TIMEINFORCE_DAY / TRADE_TIMEINFORCE_GOOD_TILL_CANCEL / TRADE_TIMEINFORCE_INMED_OR_CANCEL / TRADE_TIMEINFORCE_FILL_OR_KILL
    * @param amount Amount of trade
    * @param tiId ID of Trading Interface
    * @param security Security for traded (EUR/USD, etc...)
    * @param user user of system 
    * @param password password of system
    * @return Trade object
    * 
    */
    public Trade sendMarketTrade (int side, int timeInForce, 
           int amount, int tiId, byte security, String user, String password)
    {
        return sendTrade (StubConstants.TRADE_TYPE_MARKET, (byte) ((side) & 0x000000FF), 
                (byte) ((timeInForce) & 0x000000FF), (byte) 0, amount, tiId, security, user, password);
    }
    
    /**
    * Send limit trade by specific Trade Interface
    * 
    * @param side TRADE_SIDE_BUY / TRADE_SIDE_SELL
    * @param timeInForce TRADE_TIMEINFORCE_DAY / TRADE_TIMEINFORCE_GOOD_TILL_CANCEL / TRADE_TIMEINFORCE_INMED_OR_CANCEL / TRADE_TIMEINFORCE_FILL_OR_KILL
    * @param price For TRADE_TYPE_LIMIT only, price without decimal places
    * @param amount Amount of trade
    * @param tiId ID of Trading Interface
    * @param security Security for traded (EUR/USD, etc...)
    * @param user user of system 
    * @param password password of system
    * @return Trade object
    * 
    */
    public Trade sendLimitTrade (byte side, byte timeInForce, int price, 
           int amount, int tiId, byte security, String user, String password)
    {
        return sendTrade (StubConstants.TRADE_TYPE_LIMIT , side, timeInForce, 
           0, amount, tiId, security, user, password);
    }
    
    /**
    * Send limit trade by specific Trade Interface
    * 
    * @param side TRADE_SIDE_BUY / TRADE_SIDE_SELL
    * @param timeInForce TRADE_TIMEINFORCE_DAY / TRADE_TIMEINFORCE_GOOD_TILL_CANCEL / TRADE_TIMEINFORCE_INMED_OR_CANCEL / TRADE_TIMEINFORCE_FILL_OR_KILL
    * @param price For TRADE_TYPE_LIMIT only, price without decimal places
    * @param amount Amount of trade
    * @param tiId ID of Trading Interface
    * @param security Security for traded (EUR/USD, etc...)
    * @param user user of system 
    * @param password password of system
    * @return Trade object
    * 
    */
    public Trade sendLimitTrade (int side, int timeInForce, int price, 
           int amount, int tiId, byte security, String user, String password)
    {
        return sendTrade (StubConstants.TRADE_TYPE_LIMIT, (byte) ((side) & 0x000000FF), 
                (byte) ((timeInForce) & 0x000000FF), (byte) 0, amount, tiId, security, user, password);
    }
    
    /**
    * Send limit trade by specific Trade Interface
    * 
    * @param trade Trade Object with parameters of trade
    * @param user user of system 
    * @param password password of system
    * @return Trade object
    * 
    */
    public Trade sendTrade (Trade trade, String user, String password)
    {
        return sendTrade ((byte) ((trade.getTradeType()) & 0x000000FF) , (byte) ((trade.getSide()) & 0x000000FF), 
                (byte) ((trade.getTimeInForce()) & 0x000000FF), trade.getPrice(), trade.getAmount(), trade.getTiId(), 
                trade.getSecurity(), user, password);
    }
    
    /**
    * Modify one specific trade, only can modify amount or price
    * 
    * @param trade Trade Object with new parameters of trade
    * @param user user of system 
    * @param password password of system
    * @return result of modify
    * 
    */
    public int modifyTrade (Trade trade, String user, String password)
    {    
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_MODIFY_TRADE[0];
        msg[1] = StubConstants.MAPSERVER_MODIFY_TRADE[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((trade.getID() >> i*8 ) & 0x000000FF);
            msg[12+i] = (byte) ((trade.getPrice() >> i*8 ) & 0x000000FF);
            msg[16+i] = (byte) ((trade.getAmount() >> i*8 ) & 0x000000FF);
        }
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        trade.setResult(getParam(1));
        
        return getParam(1);
    }
    
    /**
    * Modify one specific market trade, only can modify amount
    * 
    * @param tradeID Trade Object with new parameters of trade
    * @param amount New trade amount
    * @param user user of system 
    * @param password password of system
    * @return result of modify
    * 
    */
    public int modifyMarketTrade (int tradeID, int amount, String user, String password)
    {    
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_MODIFY_TRADE[0];
        msg[1] = StubConstants.MAPSERVER_MODIFY_TRADE[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((tradeID >> i*8 ) & 0x000000FF);
            msg[12+i] = 0;
            msg[16+i] = (byte) ((amount >> i*8 ) & 0x000000FF);
        }
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        return getParam(1);
    }
    
    /**
    * Modify one specific limit trade, only can modify amount or price
    * 
    * @param tradeID Trade Object with new parameters of trade
    * @param price New trade price
    * @param amount New trade amount
    * @param user user of system 
    * @param password password of system
    * @return result of modify
    * 
    */
    public int modifyLimitTrade (int tradeID, int price, int amount, String user, String password)
    {    
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_MODIFY_TRADE[0];
        msg[1] = StubConstants.MAPSERVER_MODIFY_TRADE[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((tradeID >> i*8 ) & 0x000000FF);
            msg[12+i] = (byte) ((price >> i*8 ) & 0x000000FF);
            msg[16+i] = (byte) ((amount >> i*8 ) & 0x000000FF);
        }
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
               
        return getParam(1);
    }
    
    /**
    * Cancel one specific trade, only can modify amount or price
    * 
    * @param trade Trade Object to cancel
    * @param user user of system 
    * @param password password of system
    * @return result of cancel
    * 
    */
    public int cancelTrade (Trade trade, String user, String password)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_CANCEL_TRADE[0];
        msg[1] = StubConstants.MAPSERVER_CANCEL_TRADE[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((trade.getID() >> i*8 ) & 0x000000FF);
        }
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        return getParam(1);
    }
    
    /**
    * Get number of alive trades in system
    * 
    * @param user user of system 
    * @param password password of system
    * @return number of alive trades
    * 
    */
    public int getTradesAlive (String user, String password)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_TRADES_ALIVE[0];
        msg[1] = StubConstants.MAPSERVER_GET_TRADES_ALIVE[1];
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        return getParam(1);
    }
    
    /**
    * Get info of alive trade in system
    * 
    * @param tradeID ID of trade
    * @param user user of system 
    * @param password password of system
    * @return Trade Object with info
    * 
    */
    public Trade getTradeAliveInfo (int tradeID, String user, String password)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_TRADE_ALIVE_INFO[0];
        msg[1] = StubConstants.MAPSERVER_GET_TRADE_ALIVE_INFO[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((tradeID >> i*8 ) & 0x000000FF);
        }
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        Trade ret = new Trade (getParam(1), tradeID, 0, 0, 0, getParam(4),
                               getParam(3), 0, (byte) 0);
        
        ret.setStatus(getParam(2));
        
        return ret;
    }
    
    /**
    * Get info of alive trade in system
    * 
    * @param trade Object Trade to get info
    * @param user user of system 
    * @param password password of system
    * 
    */
    public void getTradeAliveInfo (Trade trade, String user, String password)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_TRADE_ALIVE_INFO[0];
        msg[1] = StubConstants.MAPSERVER_GET_TRADE_ALIVE_INFO[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((trade.getID() >> i*8 ) & 0x000000FF);
        }
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        trade.setResult(getParam(1));
        trade.setPrice(getParam(4));
        trade.setAmount(getParam(3));
        
        trade.setStatus(getParam(2));
    }
    
    /**
    * Get info of historic trade in system
    * 
    * @param tradeID ID of trade
    * @param user user of system 
    * @param password password of system
    * @return Trade Object with info
    * 
    */
    public Trade getTradeHistoricInfo (int tradeID, String user, String password)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_TRADE_HISTORIC_INFO[0];
        msg[1] = StubConstants.MAPSERVER_GET_TRADE_HISTORIC_INFO[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((tradeID >> i*8 ) & 0x000000FF);
        }
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        Trade ret = new Trade (getParam(1), tradeID, 0, 0, 0, getParam(4),
                               getParam(3), 0, (byte) 0);
        
        ret.setStatus(getParam(2));
        
        return ret;
    }
    
    /**
    * Get info of historic trade in system
    * 
    * @param trade Object Trade to get info
    * @param user user of system 
    * @param password password of system
    * 
    */
    public void getTradeHistoricInfo (Trade trade, String user, String password)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_TRADE_HISTORIC_INFO[0];
        msg[1] = StubConstants.MAPSERVER_GET_TRADE_HISTORIC_INFO[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((trade.getID() >> i*8 ) & 0x000000FF);
        }
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        trade.setResult(getParam(1));
        trade.setPrice(getParam(4));
        trade.setAmount(getParam(3));
        
        trade.setStatus(getParam(2));
    }
    
    /**
    * Get info of a trade in system
    * 
    * @param trade Object Trade to get info
    * @param user user of system 
    * @param password password of system
    * 
    */
    public void getTradeInfo (Trade trade, String user, String password)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_TRADE_INFO[0];
        msg[1] = StubConstants.MAPSERVER_GET_TRADE_INFO[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((trade.getID() >> i*8 ) & 0x000000FF);
        }
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        trade.setResult(getParam(1));
        trade.setPrice(getParam(4));
        trade.setAmount(getParam(3));
        
        trade.setStatus(getParam(2));
    }
    
    /**
    * Get info trade in system
    * 
    * @param tradeID ID of trade
    * @param user user of system 
    * @param password password of system
    * @return Trade Object with info
    * 
    */
    public Trade getTradeInfo (int tradeID, String user, String password)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_GET_TRADE_HISTORIC_INFO[0];
        msg[1] = StubConstants.MAPSERVER_GET_TRADE_HISTORIC_INFO[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((tradeID >> i*8 ) & 0x000000FF);
        }
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        Trade ret = new Trade (getParam(1), tradeID, 0, 0, 0, getParam(4),
                               getParam(3), 0, (byte) 0);
        
        ret.setStatus(getParam(2));
        
        return ret;
    }
    
    public int getTradeAliveId (int tradeID, String user, String password)
    {
        Arrays.fill(msg, (byte) 0);
        
        msg[0] = StubConstants.MAPSERVER_TRADE_ALIVE_ID[0];
        msg[1] = StubConstants.MAPSERVER_TRADE_ALIVE_ID[1];
        
        for (int i = 0; i < 4; i++)
        {
            msg[8+i] = (byte) ((tradeID >> i*8 ) & 0x000000FF);
        }
        
        setUserPassword (user, password);
        
        sendAndRecv (msg);
        
        return getParam(1);
    }

    // General methods
   
    private void setUserPassword (String user, String password)
    {
        msg[24] = (byte) 0x80;
        msg[25] = (byte) 0x00;
        msg[26] = (byte) 0x00;
        msg[27] = (byte) 0x00;
        
        for (int i = 0; i < user.length() && i < 64; i++)
        {
            msg[28+i] = user.getBytes()[i];
        }
        
        for (int i = 0; i < password.length() && i < 64; i++)
        {
            msg[92+i] = password.getBytes()[i];
        }
    }
    
    // Net methods
    
    private void sendAndRecv (byte[] msg)
    {
        udp.send(msg);
        
        udp.receive();
    }
    
    private int getParam (int numberOfParam)
    {
        int ret;
        
        numberOfParam = ((numberOfParam - 1) * 4) + 8;
        
        ret = (udp.getBuffer()[numberOfParam] & 0x000000ff) | ((udp.getBuffer()[numberOfParam + 1] << 8) & 0x0000ff00) | 
                    ((udp.getBuffer()[numberOfParam + 2] << 16) & 0x00ff0000) | ((udp.getBuffer()[numberOfParam + 3] << 24) & 0xff000000);        
        
        return ret;
    }
    
    private byte[] getPayload ()
    {
        int payloadLenght =  (udp.getBuffer()[24] & 0x000000ff) | ((udp.getBuffer()[25] << 8) & 0x0000ff00) | 
                ((udp.getBuffer()[26] << 16) & 0x00ff0000) | ((udp.getBuffer()[27] << 24) & 0xff000000);
        
        byte[] payload = new byte[payloadLenght];
        
        payload = Arrays.copyOfRange(udp.getBuffer(), 28, 28 + payloadLenght);
        
        return payload;
    }
    
    private void parsePrices (List<Integer> array)
    {
        byte[] payload = getPayload();
        int ti, price, liquidity;
        
        array.clear();
        
        int numberTis = (payload[0] & 0x000000ff) | ((payload[1] << 8) & 0x0000ff00) | 
                ((payload[2] << 16) & 0x00ff0000) | ((payload[3] << 24) & 0xff000000);
        if ((numberTis * 10) == (payload.length - 4))
        {
            for (int i = 0; i < numberTis; i++)
            {
                ti = (payload[4 + 10*i] & 0x000000ff) | ((payload[5 + 10*i] << 8) & 0x0000ff00);
                price = (payload[6 + 10*i] & 0x000000ff) | ((payload[7 + 10*i] << 8) & 0x0000ff00) | 
                        ((payload[8 + 10*i] << 16) & 0x00ff0000) | ((payload[9 + 10*i] << 24) & 0xff000000);
                liquidity = (payload[10 + 10*i] & 0x000000ff) | ((payload[11 + 10*i] << 8) & 0x0000ff00) | 
                        ((payload[12 + 10*i] << 16) & 0x00ff0000) | ((payload[13 + 10*i] << 24) & 0xff000000);
                            
                array.add(ti);
                array.add(price);
                array.add(liquidity);
            }
        }
    }
}

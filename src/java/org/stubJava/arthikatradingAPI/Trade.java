/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stubJava.arthikatradingAPI;

/**
 *
 * @author gudu
 */
public class Trade {

    private int ID;
    private int result;
    private int status;
    
    private int tradeType;
    private int side;
    private int timeInForce;
    private int price; 
    private  int amount; 
    private int tiId; 
    private byte security;
    
    /**
     * Public Constructor.
     */
    public Trade () 
    {
    }
    
    /**
     * Public Constructor.
     * 
     * @param result Result of trade
     * @param ID ID of trade
     * @param tradeType TRADE_TYPE_MARKET / TRADE_TYPE_LIMIT
     * @param side TRADE_SIDE_BUY / TRADE_SIDE_SELL
     * @param timeInForce TRADE_TIMEINFORCE_DAY / TRADE_TIMEINFORCE_GOOD_TILL_CANCEL / TRADE_TIMEINFORCE_INMED_OR_CANCEL / TRADE_TIMEINFORCE_FILL_OR_KILL
     * @param price For TRADE_TYPE_LIMIT only, price without decimal places
     * @param amount Amount of trade
     * @param tiId ID of Trading Interface
     * @param security Security for traded (EUR/USD, etc...)
     */
    public Trade (int result, int ID, int tradeType, int side, int timeInForce, int price, 
                  int amount, int tiId, byte security)
    {
        this.ID = ID;
        this.result = result;
        
        this.tradeType = tradeType;
        this.side = side;
        this.timeInForce = timeInForce;
        this.price = price;
        this.amount = amount;
        this.tiId = tiId;
        this.security = security;
    }
    
    /**
     * Public Constructor.
     * 
     * @param result Result of trade
     * @param ID ID of trade
     * @param tradeType TRADE_TYPE_MARKET / TRADE_TYPE_LIMIT
     * @param side TRADE_SIDE_BUY / TRADE_SIDE_SELL
     * @param timeInForce TRADE_TIMEINFORCE_DAY / TRADE_TIMEINFORCE_GOOD_TILL_CANCEL / TRADE_TIMEINFORCE_INMED_OR_CANCEL / TRADE_TIMEINFORCE_FILL_OR_KILL
     * @param amount Amount of trade
     * @param tiId ID of Trading Interface
     * @param security Security for traded (EUR/USD, etc...) 
     */
    public Trade (int result, int ID, int tradeType, int side, int timeInForce, 
                  int amount, int tiId, byte security)
    {
        this.ID = ID;
        this.result = result;
        
        this.tradeType = tradeType;
        this.side = side;
        this.timeInForce = timeInForce;
        this.amount = amount;
        this.tiId = tiId;
        this.security = security;
    }
    
    /**
     * Public Constructor.
     * 
     * @param tradeType TRADE_TYPE_MARKET / TRADE_TYPE_LIMIT
     * @param side TRADE_SIDE_BUY / TRADE_SIDE_SELL
     * @param timeInForce TRADE_TIMEINFORCE_DAY / TRADE_TIMEINFORCE_GOOD_TILL_CANCEL / TRADE_TIMEINFORCE_INMED_OR_CANCEL / TRADE_TIMEINFORCE_FILL_OR_KILL
     * @param amount Amount of trade
     * @param tiId ID of Trading Interface
     * @param security Security for traded (EUR/USD, etc...)
     */
    public Trade (int tradeType, int side, int timeInForce, int amount, int tiId, byte security)
    {
        this.ID = 0;
        this.result = 0;
        
        this.tradeType = tradeType;
        this.side = side;
        this.timeInForce = timeInForce;
        this.amount = amount;
        this.tiId = tiId;
        this.security = security;
    }

    /**
     * Get ID of trade.
     * 
     * @return Trade ID 
     */
    public int getID() {
        return ID;
    }

    /**
     * Set ID of trade
     * 
     * @param ID Trade ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    
    /**
     * Get result of trade
     * 
     * @return Result of trade 
     */
    public int getResult() {
        return result;
    }

    /**
     * Set result of Trade
     * 
     * @param result Result of trade
     */
    public void setResult(int result) {
        this.result = result;
    }

    /**
     * Get type of trade
     * 
     * @return TRADE_TYPE_MARKET / TRADE_TYPE_LIMIT
     */
    public int getTradeType() {
        return tradeType;
    }

    /**
     * Set type of trade
     * 
     * @param tradeType TRADE_TYPE_MARKET / TRADE_TYPE_LIMIT
     */
    public void setTradeType(int tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * Get side of trade
     * 
     * @return TRADE_SIDE_BUY / TRADE_SIDE_SELL
     */
    public int getSide() {
        return side;
    }

    /**
     * Set side of trade
     * 
     * @param side TRADE_SIDE_BUY / TRADE_SIDE_SELL
     */
    public void setSide(int side) {
        this.side = side;
    }

    /**
     * Get TimeInForce of trade
     * 
     * @return TRADE_TIMEINFORCE_DAY / TRADE_TIMEINFORCE_GOOD_TILL_CANCEL / TRADE_TIMEINFORCE_INMED_OR_CANCEL / TRADE_TIMEINFORCE_FILL_OR_KILL
     */
    public int getTimeInForce() {
        return timeInForce;
    }

    /**
     * Set TimeInForce of trade
     * 
     * @param timeInForce TRADE_TIMEINFORCE_DAY / TRADE_TIMEINFORCE_GOOD_TILL_CANCEL / TRADE_TIMEINFORCE_INMED_OR_CANCEL / TRADE_TIMEINFORCE_FILL_OR_KILL
     */
    public void setTimeInForce(int timeInForce) {
        this.timeInForce = timeInForce;
    }

    /**
     * Get price of trade sent or finished price if the trade is historic
     * 
     * @return Price without decimal places
     */
    public int getPrice() {
        return price;
    }

    /**
     * Set price of trade, only for LIMIT trades
     * 
     * @param price Price of trade without decimal places (2.12000 -> 212000)
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Get amount of trade sent or finished amount if the trade is historic
     * 
     * @return Amount of trade
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Set amount of trade
     * 
     * @param amount Amount to trade
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Get Trading Interface where the trade will sent
     * 
     * @return Trading interface ID
     */
    public int getTiId() {
        return tiId;
    }

    /**
     * Set Trading Interface where the trade will sent
     * 
     * @param tiId Trading interface ID
     */
    public void setTiId(int tiId) {
        this.tiId = tiId;
    }

    /**
     * Get security of trade
     * 
     * @return Security code
     */
    public byte getSecurity() {
        return security;
    }

    /**
     * Set Security of trade
     * 
     * @param security Security Code
     */
    public void setSecurity(byte security) {
        this.security = security;
    }

    /**
     * Get status of trade
     * 
     * @return Status of trade
     */
    public int getStatus() {
        return status;
    }

    /**
     * Set status of trade
     * 
     * @param status Status of trade
     */
    public void setStatus(int status) {
        this.status = status;
    }   
}

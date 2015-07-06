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
public class SecurityExposure extends Exposure {
    
    private double price;
    private byte codeSecurity;
    
   /**
    * Public Constructor.
    * 
    * @param exposure Double that represents the exposure to a security
    * @param price Price of reference of Security
    * @param codeSecurity Code of security
    */
    public SecurityExposure (double exposure, double price, byte codeSecurity)
    {
        super (exposure);
        this.price = price;
        this.codeSecurity = codeSecurity;
    }

    /**
     * Get price of reference
     * 
     * @return Price of reference
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get code of security
     * 
     * @return Code of Security
     */
    public byte getCodeSecurity() {
        return codeSecurity;
    }

    /**
     * Set Price of reference for the security
     * 
     * @param price Price of reference
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * Set code of security
     * 
     * @param nameSecurity Code of Security
     */
    public void setCodeSecurity(byte nameSecurity) {
        this.codeSecurity = nameSecurity;
    }
       
}

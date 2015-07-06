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
public class Exposure {
    
    private int error;
    private double exposure;
    
    /**
    * Public Constructor.
    * 
    * @param exposure Data that represents the exposure
    */
    public Exposure (double exposure)
    {
        this.exposure = exposure;
    }
    
    /**
     * Get exposure data
     * 
     * @return Exposure
     */
    public double getExposure() {
        return exposure;
    }

    /**
     * Get error of petition
     * 
     * @return Code of error
     */
    public int getError() {
        return error;
    }
}

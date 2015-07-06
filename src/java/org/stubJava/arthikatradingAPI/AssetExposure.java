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
public class AssetExposure extends Exposure {
    
    private byte codeAsset;
    
    /**
    * Public Constructor.
    * 
    * @param exposure Double that represents the exposure to an asset
    * @param codeAsset Code of the exposure's asset
    */
    public AssetExposure (double exposure, byte codeAsset)
    {
        super (exposure);
        this.codeAsset = codeAsset;
    }      
    
    /**
     * Get code of asset
     * 
     * @return Code of asset
     */
    public byte getCodeAsset() {
        return codeAsset;
    }

    /**
     * Set code of asset
     * 
     * @param codeAsset Code of asset
     */
    public void setCodeAsset(byte codeAsset) {
        this.codeAsset = codeAsset;
    }
     
}

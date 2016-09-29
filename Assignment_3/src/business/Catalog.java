/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Siddhant
 */
public class Catalog {
    
    private String productName;
    private String modelNumber;
    private String vendorName;
    private String productDescription;
    private float prodBasePrice;
    private float prodCeilingPrice;
    private float prodFloorPrice;
    private String prodFeature;
    private String benefits;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProdFeature() {
        return prodFeature;
    }

    public void setProdFeature(String prodFeature) {
        this.prodFeature = prodFeature;
    }     

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public float getProdBasePrice() {
        return prodBasePrice;
    }

    public void setProdBasePrice(float prodBasePrice) {
        this.prodBasePrice = prodBasePrice;
    }

    public float getProdCeilingPrice() {
        return prodCeilingPrice;
    }

    public void setProdCeilingPrice(float prodCeilingPrice) {
        this.prodCeilingPrice = prodCeilingPrice;
    }

    public float getProdFloorPrice() {
        return prodFloorPrice;
    }

    public void setProdFloorPrice(float prodFloorPrice) {
        this.prodFloorPrice = prodFloorPrice;
    }
    
    @Override
    public String toString() {
        return productName;
    }
    
}

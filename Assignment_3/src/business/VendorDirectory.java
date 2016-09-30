/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class VendorDirectory {

    private ArrayList<Vendor> vendorList;

    public VendorDirectory() {
        this.vendorList = new ArrayList<Vendor>();
    }

    public ArrayList<Vendor> getVendorlist() {
        return vendorList;
    }

    public void setVendorlist(ArrayList<Vendor> vendorList) {
        this.vendorList = vendorList;
    }

    public Vendor addVendor() {
        Vendor vendor = new Vendor();
        vendorList.add(vendor);
        return vendor;
    }

    public void delete(Vendor vendorCatalog) {
        vendorList.remove(vendorCatalog);
    }

}

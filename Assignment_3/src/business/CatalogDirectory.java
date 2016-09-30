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
public class CatalogDirectory {
    
    private ArrayList<Catalog> cataloglist;
    
    public CatalogDirectory(){
        this.cataloglist=new ArrayList<Catalog>();
    }

    public ArrayList<Catalog> getCataloglist() {
        return cataloglist;
    }

    public void setCataloglist(ArrayList<Catalog> cataloglist) {
        this.cataloglist = cataloglist;
    }
    
    public Catalog addCatalog(){
        Catalog catalog=new Catalog();
        cataloglist.add(catalog);
        return catalog;
    }
    
    
    
    public Catalog searchCatalog(String productName) {
        for (Catalog catalog : cataloglist) {
            if (catalog.getProductName().equals(productName)) {
                return catalog;
            }
        }
        return null;
    }

    public void deleteCatalog(Catalog catalog) {
        cataloglist.remove(catalog);
    }

     
    
}

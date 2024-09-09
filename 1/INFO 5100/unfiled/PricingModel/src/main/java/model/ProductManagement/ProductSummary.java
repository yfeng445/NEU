/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ProductManagement;

/**
 *
 * @author kal bugrara
 */

//this class will extract summary data from the product
public class ProductSummary {
    Product subjectproduct;
    int numberofsalesabovetarget;
    int numberofsalesbelowtarget;
    int productpriceperformance; //total profit above target --could be negative too
    int acutalsalesvolume;
    int rank; // will be done later
    
    public ProductSummary(Product p){
        
        numberofsalesabovetarget = p.getNumberOfProductSalesAboveTarget();
        productpriceperformance = p.getOrderPricePerformance();
        subjectproduct = p; //keeps track of the product itself not as well;
        acutalsalesvolume = p.getSalesVolume();
        numberofsalesbelowtarget = p.getNumberOfProductSalesBelowTarget();
    
    }
    
    public int getSalesRevenues(){
        return acutalsalesvolume;
    }
    public int getNumberAboveTarget(){
        return numberofsalesabovetarget;
    }
    public int getProductPricePerformance(){
        return productpriceperformance;
    }
    public int getNumberBelowTarget(){
        return numberofsalesbelowtarget;
    }            
    public boolean isProductAlwaysAboveTarget(){
        return false; // to be implemented
    }
}

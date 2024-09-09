/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.OrderManagement;

/**
 *
 * @author kal bugrara
 */
public class OrderSummary {
    int salesvolume;
    boolean totalabovetarget;
    int orderpriceperformance;
    int numberofOrderitemsabovetarget;
    
public OrderSummary(Order o){
    salesvolume = o.getOrderTotal();
    totalabovetarget = o.isOrderAboveTotalTarget();
    orderpriceperformance = o.getOrderPricePerformance();
    numberofOrderitemsabovetarget = o.getNumberOfOrderItemsAboveTarget();

}
public int getOrderProfit(){
    return orderpriceperformance;
}
}

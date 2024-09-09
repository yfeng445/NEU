/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ProductManagement;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class ProductCatalog {

    String type;
    ArrayList<Product> products; //list of products initially empty

    public ProductCatalog(String n) {
        type = n;
         products = new ArrayList();  ///create the list of elements otherwise it is null
    }
// new ProductCatalog(); or new ProductCatalog("Printers");
    public ProductCatalog(    ) {
        type = "unknown";
        products = new ArrayList();
    }
    public Product newProduct(int fp, int cp, int tp) {
        Product p = new Product(fp, cp, tp);
        products.add(p);
        return p;
    }
    public Product newProduct(String n, int fp, int cp, int tp) {
        Product p = new Product(n,fp, cp, tp);
        products.add(p);
        return p;
    }

    public ProductsReport generatProductPerformanceReport() {
        ProductsReport productsreport = new ProductsReport();

        for (Product p : products) {

            ProductSummary ps = new ProductSummary(p);
            productsreport.addProductSummary(ps);
        }
        return productsreport;
    }

    public ArrayList<Product> getProductList(){
        return products;
    }

}

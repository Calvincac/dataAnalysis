package dataanalysis

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author calvin
 */
class Manager {
    
    private def data;
    
    public def Manager(array) {
        this.data = array;
        processData();
    }
    
    public def processData(){
        def countCustomer = 0;
        def countSalesman = 0
        
        for(item in this.data) {            
            if(item instanceof Customer) {
                countCustomer++;
            }            
            if(item instanceof Salesman) {
                countSalesman++;
            }            
            if(item instanceof SalesData) {
                checkMostExpensiveSale(item);
            }            
        }
    }
    
    
    public def checkMostExpensiveSale(sale) {
        def expensive = 0;        
        def value = processItem(sale.getItems());        
    }
    
    public def processItem(items) {        
        def it =  items.replace("[", "").replace("]", "");
        def item =  it.split(",");
        def sum = 0;
        
        for(def i=0; i<item.length; i++) {
            def information = item[i].split("-");
            def quantity = information[1] as Double;
            def price = information[2] as Double;
            def fullPrice = price * quantity;
            sum = sum + fullPrice;
        }        
        return sum;      
    }   
}

    


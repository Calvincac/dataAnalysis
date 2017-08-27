package dataanalysis

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author calvin
 */
class Manager {
    
    private def data;
    private def mostExpensive = 0;
    private def leastExpensiveSale = Double.MAX_VALUE;
    private def worstSalesMan;
    private def idExpensiveSale;
    
    public def Manager(array) {
        this.data = array;
        processData();
    }
    
    public def processData(){
        def countCustomer = 0;
        def countSalesman = 0
        def expensiveSale = 0;
        def worstSalesman = "";
        
        for(item in this.data) {            
            if(item instanceof Customer) {
                countCustomer++;
            }            
            if(item instanceof Salesman) {
                countSalesman++;
            }            
            if(item instanceof SalesData) {
                expensiveSale = getIdMostExpensiveSale(item);
                worstSalesman = getWorstSalesman(item);
            }            
        }        
        def output = new FileManager(worstSalesman, expensiveSale, countCustomer, countSalesman);
        output.writeToFile();
    }
    
    
    public def getIdMostExpensiveSale(sale) {        
        def value = processItem(sale.getItems());
        
        if(value > this.mostExpensive) {
            this.mostExpensive = value;
            this.idExpensiveSale = sale.getSaleId();
        }
        return this.idExpensiveSale;
    }
    
    public def getWorstSalesman(sale) {
        def value = processItem(sale.getItems());
        
        if(value < this.leastExpensiveSale) {
            this.leastExpensiveSale = value;
            this.worstSalesMan = sale.getSalesmanName();
        }
        return this.worstSalesMan;
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

    


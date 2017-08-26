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
        processItem(sale.getItems());        
    }
    
    public def processItem(items) {
        def pattern = "[(\\d)+.]+";
        def arr = new ArrayList();
        Pattern pat= Pattern.compile(pattern);
        Matcher matcher = pat.matcher(items);
        
        while(matcher.find()) {
            arr.add(matcher.group());
        }
        
        for(def i=1; i<arr.size(); i++) {
            println(arr.get(i) * arr.get(i+1));
        }
       
    }   
}

    


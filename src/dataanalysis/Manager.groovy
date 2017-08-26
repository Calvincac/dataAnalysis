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
        println(arr);
        for(def i=0; i<arr.size(); i++) {
            def y = arr.get(i) as Double;
            
            if(i == 0) {
                println(arr.get(i+1) * arr.get(i+2));
            } else {
                println(arr.get(i+2) * arr.get(i+3));
            }
            
        }
        
        
       
    }   
}

    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataanalysis

/**
 *
 * @author calvin
 */
class FileManager {
    private def worstSalesman;
    private def expensiveSale;
    private def countCustomer;
    private def countSalesman;
    
    public def FileManager(worstSalesman, expensiveSale, countCustomer, countSalesman) {
        this.worstSalesman = worstSalesman;
        this.expensiveSale = expensiveSale;
        this.countCustomer = countCustomer;
        this.countSalesman = countSalesman;
    }
    
    public def writeToFile() {
        def filename = "src/dataanalysis/data/out/file.done.dat";
        def file = new File(filename);
        def w = file.newWriter();
        def string = "Amount of clients: " + this.countCustomer + 
                     " Amount of Salesman: " + this.countSalesman +
                     " ID of most expensive sale: " + this.expensiveSale + 
                     " Worst salesman ever: " + this.worstSalesman;
        
        w << string;
        w.close();                        
    }
	
}


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
        
    }
	
}


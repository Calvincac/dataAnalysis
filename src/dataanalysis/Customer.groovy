package dataanalysis

/**
 *
 * @author calvin
 */
class Customer {
    
    private def id;
    private def cnpj;
    private def name;
    private def businessArea;
    
    public def Customer() {
        
    }
    
    public def Customer(id, cnpj, name, businessArea) {
        this.id = id;
        this.cnpj = cnpj;
        this.name = name;
        this.businessArea = businessArea;
    }
    
    public String toString() {
       return "Id: " + this.id + \
              "\nCNPJ: " + this.cnpj + \
              "\nName: " + this.name + \
              "\nBusinessArea: " + this.businessArea;
    } 
	
}


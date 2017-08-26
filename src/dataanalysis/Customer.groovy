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
    
    public def getId() {
        return this.id;
    }
    
    public def getCnpj() {
        return this.cnpj;
    }
    
    public def getName() {
        return this.name;
    }
    
    public def getBusinessArea() {
        return this.businessArea;
    }
    
    public String toString() {
       return "Id: " + this.id + \
              "\nCNPJ: " + this.cnpj + \
              "\nName: " + this.name + \
              "\nBusinessArea: " + this.businessArea;
    } 
	
}


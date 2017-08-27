package dataanalysis

/**
 *
 * @author calvin
 */
class Salesman {
    
    private def id;
    private def cpf;
    private def name;
    private def salary;
    
    public def Salesman() {
        
    }
    
    public def Salesman(id, cpf, name, salary) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.salary = salary;
    }
    
    public def getId() {
        return this.id;
    }
   
    public def getName() {
        return this.name;
    }
    
    public def getSalary() {
        return this.salary;
    }
    
   public String toString() {
       return "Id: " + this.id + \
              "\nCpf: " + this.cpf + \
              "\nName: " + this.name + \
              "\nSalary: " + this.salary;
    }  
	
}


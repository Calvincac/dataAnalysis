package dataanalysis

/**
 *
 * @author calvin
 */
class Builder {
    
    private def arrayOfBeans = new ArrayList();   
       
    public def readFile() {
        new File("src/dataanalysis/data/in/file.dat").eachLine {
            line -> line ? build(line) :"";
        }
        return this;
    }
    
    public def build(line) {
        def pattern = "ç";
        def property = line.split(pattern);
        
        if(property[0] == "001") {
            this.arrayOfBeans.add(new Salesman(property[0], property[1], property[2], property[3]));
        }
        if(property[0] == "002") {
           this.arrayOfBeans.add(new Customer(property[0], property[1], property[2], property[3]));
        }
        if(property[0] == "003") {
            this.arrayOfBeans.add(new SalesData(property[0], property[1], property[2], property[3]));
        }
    }
    
    public def callManager() {
        return new Manager(this.arrayOfBeans);        
    }
	
}


package dataanalysis

/**
 *
 * @author calvin
 */
class Builder {
    
    
    public def Builder() {

    }
    
    
    public def readFile() {
        new File("src/dataanalysis/data/in/file.dat").eachLine {
            line -> line ? build(line) :"";
        }  
    }
    
    public def build(line) {
        def pattern = "ç";
        def property = line.split(pattern);
        def arr = new ArrayList();
        
        if(property[0] == "001") {
          arr.add(new Salesman(property[0], property[1], property[2], property[3]));
        }
        if(property[0] == "002") {
           arr.add(new Customer(property[0], property[1], property[2], property[3]));
        }
        if(property[0] == "003") {
            arr.add(new SalesData(property[0], property[1], property[2], property[3]));
        }
        
        return new Manager(arr);
    }
	
}


package dataanalysis

/**
 *
 * @author calvin
 */
class SalesData {
    
    private def id;
    private def saleId;
    private def items;
    private def salesmanName;
    
    public def SalesData(id, saleId, items, salesmanName) {
        this.id = id;
        this.saleId = saleId;
        this.items = items;
        this.salesmanName = salesmanName;
    }
    
    public def getId() {
        return this.id;
    }
    
    public def getsaleId() {
        return this.saleId;
    }
    
    public def getItems() {
        return this.items;
    }
    
    public def getSalesmanName() {
        return this.salesmanName;
    }
    
}


public class House extends Asset {
    String address;
    int squareFoot;
    int lotSize;
    int condition;
//    (1 -excellent, 2 -good, 3 -fair, 4 -poor)

    public House(String description, String dateAcquired, double originalCost, String address, int squareFoot, int lotSize, int condition) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
        this.condition = condition;

    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSquareFoot() {
        return this.squareFoot;
    }

    public int getLotSize() {
        return this.lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    @Override
    public double getValue() {
        double priceForPerSquareFoot =
                switch (this.condition) {
                    case 1 -> 180.00;
                    case 2 -> 130.00;
                    case 3 -> 90.00;
                    case 4 -> 80.00;
                    default -> 0.0;
                };
        return (squareFoot * priceForPerSquareFoot) + (lotSize * 0.25);
    }
}



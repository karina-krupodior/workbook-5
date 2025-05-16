public class Cash extends Asset {
    private double amount;

    public Cash(double amount, String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
        this.amount = amount;
    }
    @Override
   public double getValue(){
        return this.amount;
    }


}

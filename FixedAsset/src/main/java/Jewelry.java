public class Jewelry extends FixedAsset{
    private double karat;
  public   Jewelry(String name, double marketValue, double karat) {
      super(name,marketValue);
      this.karat = karat;

    }

    public double getValue() {
      return marketValue + (karat * 50);

    }


}

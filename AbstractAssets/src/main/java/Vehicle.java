public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;
    private double price;


    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer, double price) {
        super(description, dateAcquired, originalCost);

        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
        this.price = price;
    }

    public String getMakeModel() {
        return this.makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return this.odometer;

    }

    public double getPrice() {
        return this.price;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double carValue;
        int currentYear = 2025;
        int carAge = currentYear - year;

        if (carAge <= 3) {
            carValue = getOriginalCost() * Math.pow(0.97, carAge);
        } else if (carAge <= 6) {
            carValue = getOriginalCost() * Math.pow(0.94, carAge);
        } else if (carAge <= 10) {
            carValue = getOriginalCost() * Math.pow(0.92, carAge);
        } else {
            carValue = 1000.00;
        }

        if (odometer > 100000 &&
                !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
            carValue *= 0.75;
        }

        return carValue;
    }

}


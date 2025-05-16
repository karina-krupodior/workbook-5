import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
//        Asset asset = new Asset("my home");
//        ArrayList of Asset objects.
//        This program will not have a user interface. In your main(), create an
//        ArrayList of Asset objects
        ArrayList<Asset> assets = new ArrayList<>();

//        Load it with your Assets.
//                Include at least 2 houses (you have a vacation home!)
//        and at least two vehicles. Use descriptions like "my house" or "Tom's truck" for
//        the assets.

        assets.add(new House("My house", "2010-06-01", 250000.00, "123 Main St, Austin, TX", 1200, 10000, 1));
        assets.add(new House("Vacation home", "2015-08-15", 180000.00, "45 Beach Rd, Malibu, CA", 1200, 10000, 1));
        assets.add(new Vehicle("Tom's truck", "2018-03-20", 35000.00, "Ford F-150", 2018, 120000, 54546));

//        Now, loop thru the Asset collection displaying the description of each asset, the
//        date you acquired it, how much you paid for it, and its value

        // Displaying all asset info

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("The date you acquired it: " + asset.getDateAcquired());
            System.out.println("How much you paid for it: " + asset.getOriginalCost());
            System.out.println("Its value :" + asset.getValue());

//            the year and make/model of the vehicle.
//            You will need to use instanceof when you loop through the assets to detect the type of asset it is.
//            Once you know it is a House or Vehicle, you will need to downcast it so that you
//            can call the methods of the specific type.

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            }
            if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Vehicle year: " + vehicle.getYear() + "Model" + vehicle.getMakeModel());
            }
        }
    }
}

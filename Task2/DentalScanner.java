public class DentalScanner {
    private String machineID;
    private String serialNum;
    private String brand;
    private String manufacturedCountry;
    private float cost;
    private static int count = 0;

    public DentalScanner(String mID, String sn, String br, String mC, float cst) {
        machineID = mID;
        serialNum = sn;
        brand = br;
        manufacturedCountry = mC;
        cost = cst;
    }

    public static DentalScanner getDentalScanner(String mID, String sn, String br, String mC, float cst) {
        if (count == 0) {
            DentalScanner d1 = new DentalScanner(mID, sn, br, mC, cst);
            System.out.println("Scanner Machine added successfully");
            count++;
            return d1;
        } else {
            System.out.println("Sorry - Scanner Machine already added");
            return null;
        }
    }// end getDentalScanner

    public void showScannerDetails() {
        System.out.println("Dental Scanner Machine ID :" + machineID);
        System.out.println("Serial Number :" + serialNum);
        System.out.println("Make of the scanner :" + brand);
        System.out.println("Country of origin :" + manufacturedCountry);
        System.out.println("Cost of the scanner :" + cost);
        System.out.println("--------------------------------------------");
    }
}

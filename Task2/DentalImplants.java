public class DentalImplants extends Treatment {
    private int implantCount;

    public DentalImplants(String tID, String medLog, String prr, int impCount) {
        super(tID, medLog, prr);
        implantCount = impCount;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Implanted Tooth Count : " + implantCount);
    }

    public int getImplantCount() {
        return implantCount;
    }
}

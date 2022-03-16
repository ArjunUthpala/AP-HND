public class Nurse extends Staff {
    private String shiftDetails;

    public Nurse(String eID, String na, String addr, String dob, int nic, int cnum, String shift) {
        super(eID, na, addr, dob, nic, cnum);
        shiftDetails = shift;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Shift Details : " + shiftDetails);
    }

    public String getShift() {
        return shiftDetails;
    }
}

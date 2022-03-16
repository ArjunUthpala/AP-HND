import java.util.Vector;

public class Staff {
    private String empID;
    private String name;
    private String address;
    private String DOB;
    private int NIC;
    private int contactNum;
    public DentalFacility dent;
    private Vector treatment;

    public Staff(String eID, String na, String addr, String dob, int nic, int cnum) {
        empID = eID;
        name = na;
        address = addr;
        DOB = dob;
        NIC = nic;
        contactNum = cnum;
        treatment = new Vector();
    }

    public void showDetails() {
        System.out.println("Employee ID :" + empID);
        System.out.println("Name :" + name);
        System.out.println("Address :" + address);
        System.out.println("Date of Birth :" + DOB);
        System.out.println("NIC Number :" + NIC);
        System.out.println("Contact Number :" + contactNum);
        System.out.println("--------------------------------------------");
    } // show Details

    public void setAddress(String addr) {
        address = addr;
    } // updateAddress

    public void addFacility(DentalFacility d) {
        dent = d;
    } // add a room

    public void addTreatment(Treatment tr) {
        treatment.addElement(tr);
    } // assign a treatment
}

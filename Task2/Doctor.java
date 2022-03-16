import java.util.Vector;

public class Doctor {
    private String drID;
    private String name;
    private String address;
    private String DOB;
    private int NIC;
    private int contactNum;
    public DentalFacility dent;
    private Vector appointment;
    private Vector treatment;

    public Doctor(String dID, String na, String addr, String dob, int nic, int cnum) {
        drID = dID;
        name = na;
        address = addr;
        DOB = dob;
        NIC = nic;
        contactNum = cnum;
        appointment = new Vector();
        treatment = new Vector();
    }

    public void showDetails() {
        System.out.println("Doctor ID :" + drID);
        System.out.println("Name :" + name);
        System.out.println("Address :" + address);
        System.out.println("Date of Birth :" + DOB);
        System.out.println("NIC Number :" + NIC);
        System.out.println("Contact Number :" + contactNum);
        System.out.println("--------------------------------------------");
    } // show Details

    public void setContactNum(int cnum) {
        contactNum = cnum;
    } // update Contact Number

    public void addFacility(DentalFacility d) {
        dent = d;
    } // allocate a room

    public void addAppointment(Appointment ap) {
        appointment.addElement(ap);
    } // add appointments

    public void addTreatment(Treatment tr) {
        treatment.addElement(tr);
    } // add treatments
}

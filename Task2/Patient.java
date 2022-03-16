import java.util.Vector;

public class Patient {
    private String patID;
    private String name;
    private String address;
    private int NIC;
    private int contactNum;
    private Vector appointment;
    private Vector payment;

    public Patient(String pID, String na, String addr, int nic, int cnum) {
        patID = pID;
        name = na;
        address = addr;
        NIC = nic;
        contactNum = cnum;
        appointment = new Vector();
        payment = new Vector();
    }

    public void showDetails() {
        System.out.println("Patient ID :" + patID);
        System.out.println("Patient Name :" + name);
        System.out.println("Patient Address :" + address);
        System.out.println("Patient NIC Number :" + NIC);
        System.out.println("Patient Contact Number :" + contactNum);
        System.out.println("--------------------------------------------");
    } // show Details

    public void setAddress(String addr) {
        address = addr;
    } // updateAddress

    public void addAppointment(Appointment ap) {
        appointment.addElement(ap);
    } // add appointments

    public void addPayment(Payment pa) {
        payment.addElement(pa);
    } // add payments for the relavant treatments

}



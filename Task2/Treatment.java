public class Treatment {
    private String trtID;
    private String medicineLog;
    private String prerequisites;
    public Doctor doc;
    public Payment pay;
    public Staff stf;

    public Treatment(String tID, String medLog, String prr) {
        trtID = tID;
        medicineLog = medLog;
        prerequisites = prr;
    }

    public void showDetails() {
        System.out.println("Treatment ID :" + trtID);
        System.out.println("Medicine Log :" + medicineLog);
        System.out.println("Prerequisites for the treatment :" + prerequisites);
    } // show Details

    public void setMedLog(String medLog) {
        medicineLog = medLog;
    } // update Medicine Log

    public void addDoctor(Doctor d) {
        doc = d;
    } // add a doctor

    public void addPayment(Payment pa) {
        pay = pa;
    } // add a payment

    public void addStaff(Staff s) {
        stf = s;
    } // add a staff member
}

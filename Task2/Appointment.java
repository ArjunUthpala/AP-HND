public class Appointment {
    private String appointID;
    private String description;
    private String appointDate;
    private String appointTime;
    public Patient pat;
    public Doctor doc;

    public Appointment(String apID, String des, String apDate, String apTime) {
        appointID = apID;
        description = des;
        appointDate = apDate;
        appointTime = apTime;
    }

    public void showDetails() {
        System.out.println("Appointment ID :" + appointID);
        System.out.println("Description :" + description);
        System.out.println("Appointment date :" + appointDate);
        System.out.println("Appointment time :" + appointTime);
        System.out.println("--------------------------------------------");

    } // show Details

    public void setDate(String apDate) {
        appointDate = apDate;
    } // update Date

    public void setTime(String apTime) {
        appointTime = apTime;
    } // update Time

    public void addPatient(Patient p) {
        pat = p;
    } // add the relavent patient

    public void addDoctor(Doctor d) {
        doc = d;
    } // assign the doctor
}

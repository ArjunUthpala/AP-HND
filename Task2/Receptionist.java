public class Receptionist extends Staff {
    private String assignedDuties;

    public Receptionist(String eID, String na, String addr, String dob, int nic, int cnum, String duty) {
        super(eID, na, addr, dob, nic, cnum);
        assignedDuties = duty;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Assigned Duties : " + assignedDuties);
    }

    public String getDuties() {
        return assignedDuties;
    }
}

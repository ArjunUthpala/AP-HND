public class Manager extends Staff {
    private String qualification;

    public Manager(String eID, String na, String addr, String dob, int nic, int cnum, String Qlf) {
        super(eID, na, addr, dob, nic, cnum);
        qualification = Qlf;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Qualifications : " + qualification);
    }

    public String getQualification() {
        return qualification;
    }
}

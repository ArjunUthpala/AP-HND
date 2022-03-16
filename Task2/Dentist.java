public class Dentist extends Doctor {
    private int expieriencedYears;

    public Dentist(String dID, String na, String addr, String dob, int nic, int cnum, int expYears) {
        super(dID, na, addr, dob, nic, cnum);
        expieriencedYears = expYears;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Expierienced Years : " + expieriencedYears);
    }

    public void setYears(int expYears) {
        expieriencedYears = expYears;
    } // update expierienced years
}

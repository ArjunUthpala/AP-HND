import java.util.Vector;

public class SeniorEmployee extends Employee {
    private Vector juniors;

    public SeniorEmployee(String eID, String na, String addr, int nic, int cnum, String pos, float sal) {
        super(eID, na, addr, nic, cnum, pos, sal);
        juniors = new Vector();
    }

    public void addJunior(Employee s) {
        juniors.addElement(s);
    }

    public void getJuniorList() {
        super.showDetails();
        System.out.println("Subordinates List");
        int x = 0;
        while (x < juniors.size()) {
            Employee s = (Employee) juniors.elementAt(x);
            s.showDetails();
            x++;
        } // end while
    }
}
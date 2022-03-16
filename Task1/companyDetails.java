import java.util.Vector;

public class companyDetails {
    private String name, regNum, CEO, address;
    private int contactNum;
    private Vector departments;

    public companyDetails(String n, String rn, String ce, String addr, int cnum) {
        name = n;
        regNum = rn;
        CEO = ce;
        address = addr;
        contactNum = cnum;
        departments = new Vector();
    }

    public void addDep(department dep) {
        departments.addElement(dep);
    }

    public void showDep() {
        System.out.println("Comany name:" + name);
        System.out.println("Comany Registration Number :" + regNum);
        System.out.println("Company CEO :" + CEO);
        System.out.println("Address :" + address);
        System.out.println("Contact Number :" + contactNum);
        System.out.println("_________________________________________________");
        for (int x = 0; x < departments.size(); x++) {
            department dep = (department) departments.elementAt(x);
            dep.showDepDetails();
        }
    }
}

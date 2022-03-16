public class Employee {
    protected String empID;
    protected String name;
    protected String address;
    protected int NIC;
    protected int contactNum;
    protected String position;
    protected float salary;

    public Employee(String eID, String na, String addr, int nic, int cnum, String pos, float sal) {

        empID = eID;
        name = na;
        address = addr;
        NIC = nic;
        contactNum = cnum;
        position = pos;
        salary = sal;
    }

    public void showDetails() {
        System.out.println("Employee ID :" + empID);
        System.out.println("Name :" + name);
        System.out.println("Address :" + address);
        System.out.println("NIC Number :" + NIC);
        System.out.println("Contact Number :" + contactNum);
        System.out.println("Position :" + position);
        System.out.println("Salary :" + salary);
        System.out.println("--------------------------------------------");
    }
}

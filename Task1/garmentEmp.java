public class garmentEmp {
    protected String name, address;
    protected int empId, phoneNum;

    public garmentEmp(String n, int ID, int pn, String addr) {
        name = n;
        address = addr;
        empId = ID;
        phoneNum = pn;
    }

    public void showDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + phoneNum);
    }
}

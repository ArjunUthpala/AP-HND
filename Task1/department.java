public class department {
    private String depID, depName, depHead;
    private int noOFEmp, contactNum;

    public department(String dID, String dn, String dh, int numEmp, int cnum) {
        depID = dID;
        depName = dn;
        depHead = dh;
        noOFEmp = numEmp;
        contactNum = cnum;
    }

    public void showDepDetails() {
        System.out.println("Department ID:" + depID);
        System.out.println("Department name :" + depName);
        System.out.println("HOD :" + depHead);
        System.out.println("Employee Count :" + noOFEmp);
        System.out.println("Contact Number :" + contactNum);
        System.out.println("--------------------------------------------");
    }

}

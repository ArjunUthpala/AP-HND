public class empSal {
    private String empID, name;
    private int hrsWorked;
    private float perHourRate;

    public empSal(String eID, String n, int hw, float phr) {
        empID = eID;
        name = n;
        hrsWorked = hw;
        perHourRate = phr;
    }

    public String getEmpID() {
        return empID;
    }

    public void calculatePay() {
        float pay = hrsWorked * perHourRate;
        System.out.println("name: " + name);
        System.out.println("Payment: " + pay);
    }
}

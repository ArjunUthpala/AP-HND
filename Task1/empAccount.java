public class empAccount {
    private String name;
    private int hrsWorked, perHourRate;

    public empAccount(String n, int hw, int phr) {
        hrsWorked = hw;
        perHourRate = phr;
        name = n;
    }

    public void calculatePay() {
        int pay = hrsWorked * perHourRate;
        System.out.println("name: " + name);
        System.out.println("Payment: " + pay);
    }
}

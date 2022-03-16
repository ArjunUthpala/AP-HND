public class Payment {
    private String paymentID;
    private float payAmount;
    private String payDate;
    private String payTime;
    private String payMethod;
    public Patient pat;
    public Treatment trt;

    public Payment(String payID, float payAmt, String PayD, String PayT, String PayMT) {
        paymentID = payID;
        payAmount = payAmt;
        payDate = PayD;
        payTime = PayT;
        payMethod = PayMT;
    }

    public void showDetails() {
        System.out.println("Payment ID :" + paymentID);
        System.out.println("Payment Amount :" + payAmount);
        System.out.println("Paid date :" + payDate);
        System.out.println("Paid time :" + payTime);
        System.out.println("Payment Method :" + payMethod);
        System.out.println("--------------------------------------------");
    } // show Details

    public void setAmount(float payAmt) {
        payAmount = payAmt;
    } // updateAmount

    public void addPatient(Patient p) {
        pat = p;
    } // select patient

    public void addTreatment(Treatment tr) {
        trt = tr;
    } // select relavant treatment to be billed
}
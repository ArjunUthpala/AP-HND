public class NerveFilling extends Treatment {
    private int fillCount;

    public NerveFilling(String tID, String medLog, String prr, int fcount) {
        super(tID, medLog, prr);
        fillCount = fcount;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Filled Tooth Count : " + fillCount);
    }

    public int getFillCount() {
        return fillCount;
    }
}

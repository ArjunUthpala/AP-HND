public class Extraction extends Treatment {
    private int toothCount;

    public Extraction(String tID, String medLog, String prr, int tCount) {
        super(tID, medLog, prr);
        toothCount = tCount;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Extracted Tooth Count : " + toothCount);
    }

    public int getToothCount() {
        return toothCount;
    }
}

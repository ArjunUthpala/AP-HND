public class shirts extends apparel {
    private float chest, length, bottomWidth, sleeveLength;

    public shirt(int apID, String mt, String sz, float pr, float ch, float ln, float bw, float sl) {
        super(apID, mt, sz, pr);
        chest = ch;
        length = ln;
        bottomWidth = bw;
        sleeveLength = sl;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Chest in inches: " + chest);
        System.out.println("Length in inches: " + length);
        System.out.println("Bottom Width in inches: " + bottomWidth);
        System.out.println("Sleeve Length in inches: " + sleeveLength);
    }

    public float getLength() {
        return length;
    }
}
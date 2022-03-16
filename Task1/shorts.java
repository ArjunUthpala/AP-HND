public class shorts extends apparel {
    private float waist, hip, thigh, bottom;

    public shorts(int apID, String mt, String sz, float pr, float wt, float hp, float th, float bt) {
        super(apID, mt, sz, pr);
        waist = wt;
        hip = hp;
        thigh = th;
        bottom = bt;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Waist in inches: " + waist);
        System.out.println("Hip in inches: " + hip);
        System.out.println("Thigh Width in inches: " + thigh);
        System.out.println("Bottom in inches: " + bottom);
    }

    public float getBottom() {
        return bottom;
    }
}

public class apparel {
    protected String size, material;
    protected int apparelId;
    protected float price;

    public apparel(int apID, String mt, String sz, float pr) {
        apparelId = apID;
        material = mt;
        size = sz;
        price = pr;
    }

    public void showDetails() {
        System.out.println("Apparel ID: " + apparelId);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
    }

    public void setPrice(float pr) {
        price = pr;
    }
}

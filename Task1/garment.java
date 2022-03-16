public class garment {
    public static void main(String arg[]) {

        /*
         * empAccount e1 = new empAccount("Jack", 150, 200); e1.calculatePay(); empSal
         * e2 = new empSal("e123", "Jack", 150, 200.00f); e2.calculatePay();
         */

        /*
         * shirts x1 = new shirts(250, "cotton", "L", 750.0f, 32.0f, 35.0f, 40.0f,
         * 45.0f); shorts y1 = new shorts(251, "Linnen", "M", 950.0f, 35.0f, 40.0f,
         * 20.0f, 12.0f); x1.showDetails(); y1.showDetails();
         */

        companyDetails c1 = new companyDetails("PQR Apparel", "GAR015326", "Mr. Arjun Uthpala",
                "246/2, Munamale lane, Kurunegala", 718855719);
        department dep1 = new department("DEP01", "Design", "Mrs. Sumana Bandara", 15, 372233654);
        department dep2 = new department("DEP02", "Fabric Store and fabric sourcing ", "Mrs. Kasuni Herath", 20,
                372233654);
        department dep3 = new department("DEP03", "Sewing ", "Mr. Dasun Wijesinghe", 100, 372233654);
        department dep4 = new department("DEP04", "Embroidery ", "Mr. Nisal Perera", 25, 372233654);
        c1.addDep(dep1);
        c1.addDep(dep2);
        c1.addDep(dep3);
        c1.addDep(dep4);
        c1.showDep();
    }
}

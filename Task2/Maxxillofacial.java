public class Maxxillofacial extends Treatment {
    private String surgeryReport;

    public Maxxillofacial(String tID, String medLog, String prr, String surRep) {
        super(tID, medLog, prr);
        surgeryReport = surRep;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Surgery Report : " + surgeryReport);
    }

    public String getReport() {
        return surgeryReport;
    }
}

public class DentalConsultant extends Doctor {
    private String postGradQualification;
    private String countryOfGradUni;

    public DentalConsultant(String dID, String na, String addr, String dob, int nic, int cnum, int expYears, String pgQ,
            String cgu) {
        super(dID, na, addr, dob, nic, cnum);
        postGradQualification = pgQ;
        countryOfGradUni = cgu;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Post Graduate Qualifications : " + postGradQualification);
        System.out.println("Country of Graduated University : " + countryOfGradUni);
    }

}

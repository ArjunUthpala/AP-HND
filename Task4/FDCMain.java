public class FDCMain {
    public static void main(String arg[]) {
        SeniorEmployee s1 = new SeniorEmployee("A001", "Anton", "Aniwatta, Kandy", 123456, 718535214, "Director",
                1000000);
        JuniorEmployee j1 = new JuniorEmployee("A002", "Chamod", "Katugasthota, Kandy", 789456, 752562565, "Dentist",
                600000);
        SeniorEmployee s2 = new SeniorEmployee("A003", "Supuni", "Peradeniya, Kandy", 426789, 782542542, "Dentist",
                600000);
        JuniorEmployee j2 = new JuniorEmployee("A004", "Madhavi", "Digana, Kandy", 753159, 712385687, "Dentist",
                600000);
        JuniorEmployee j3 = new JuniorEmployee("A005", "Piyal", "Katugasthota, Kandy", 453126, 777864523, "Nurse",
                2000000);
        JuniorEmployee j4 = new JuniorEmployee("A006", "Kamal", "Mawathagama, Kurunegala", 785612, 704528978, "Nurse",
                2000000);
        JuniorEmployee j5 = new JuniorEmployee("A007", "Kapila", "Digana, Kandy", 325678, 784565892, "Nurse", 2000000);

        s1.addJunior(j2);
        s1.addJunior(j3);

        s2.addJunior(j1);
        s2.addJunior(j4);
        s2.addJunior(j5);

        s1.getJuniorList();
        System.out.println("...................................................................................");
        s2.getJuniorList();
    }
}

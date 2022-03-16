public class Manager extends garmentEmp {
    private String department;

    public HardDisk(int pno, String des, float pr, String cap, String sp){
		super(pno, des,pr);
		capacity = cap;
		speed = sp;
	}

    public void showDetails() {
        super.showDetails();
        System.out.println("Capacity : " + capacity);
        System.out.println("Speed : " + speed);
    }

    public String getSpeed() {
        return speed;
    }
}
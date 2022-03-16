import java.util.Vector;

public class DentalFacility {
	private String dentalName, address;
	private int contactNum;
	private Vector rooms;
	public Doctor doc;
	public Staff stf;

	public DentalFacility(String dn, String addr, int cn) {
		dentalName = dn;
		address = addr;
		contactNum = cn;
		rooms = new Vector();
	}

	public void addRoom(SurgeryRoom mi) {
		rooms.addElement(mi);
	}

	public void showRooms() {
		System.out.println("Dental Name :" + dentalName);
		System.out.println("Address :" + address);
		System.out.println("Contact number :" + contactNum);
		System.out.println("_________________________________________________");
		for (int x = 0; x < rooms.size(); x++) {
			SurgeryRoom mi = (SurgeryRoom) rooms.elementAt(x);
			mi.showRoomDetails();
		}
	} // show dental facility included rooms

	public void addDoctor(Doctor d) {
		doc = d;
	} // assign a doctor for a specific room

	public void addStaff(Staff s) {
		stf = s;
	} // assign a nurse for a specific room
}
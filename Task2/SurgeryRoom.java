public class SurgeryRoom {
	private String room;
	private String doctor;
	private String nurse;
	private String surgerySchedule;

	public SurgeryRoom(String rm, String dr, String nr, String sur) {
		room = rm;
		doctor = dr;
		nurse = nr;
		surgerySchedule = sur;
	}

	public void showRoomDetails() {
		System.out.println("Room Number :" + room);
		System.out.println("Doctor incharge :" + doctor);
		System.out.println("Nurse incharge :" + nurse);
		System.out.println("Surgery Schedule :" + surgerySchedule);
		System.out.println("--------------------------------------------");
	}
}

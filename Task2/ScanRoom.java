public class ScanRoom {
    private String room;
    private String doctor;
    private String nurse;
    private String scanLog;

    public ScanRoom(String rm, String dr, String nr, String sl) {
        room = rm;
        doctor = dr;
        nurse = nr;
        scanLog = sl;
    }

    public void showRoomDetails() {
        System.out.println("Room Number :" + room);
        System.out.println("Doctor incharge :" + doctor);
        System.out.println("Nurse incharge :" + nurse);
        System.out.println("Scan Log :" + scanLog);
        System.out.println("--------------------------------------------");
    }
}
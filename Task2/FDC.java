import java.util.Scanner;

public class FDC {
	public static void main(String arg[]) {
		Scanner Obj = new Scanner(System.in);
		System.out.print("Enter Dental Scanner Machine ID: ");
		String mID = Obj.nextLine();
		System.out.print("Enter Serial Number: ");
		String sn = Obj.nextLine();

		System.out.print("Enter make of the scanner: ");
		String br = Obj.nextLine();

		System.out.print("Enter Country of origin: ");
		String mC = Obj.nextLine();

		System.out.print("Enter Cost of the scanner: ");
		float cst = Obj.nextFloat();

		DentalScanner d1 = DentalScanner.getDentalScanner(mID, sn, br, mC, cst);
		d1.showScannerDetails();
		// trying to make another Dental scanner
		DentalScanner d2 = DentalScanner.getDentalScanner("S102", "123C", "LG", "USA", 150000.0f);

	}
}
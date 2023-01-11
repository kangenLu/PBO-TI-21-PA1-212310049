import java.util.Scanner;

public class Latihan4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String jwb;

		System.out.print("Masukkan Nomor : ");
		jwb = input.nextLine();

		if (jwb == "") {
			System.out.println("Masukkan angka minimal 1 digit");
		}else {
			createNoRegis(jwb);
		}
	}

	static void createNoRegis(String paramJWB) {
		System.out.print("No Register : IBIK");

		for (int i = paramJWB.length(); i < 5; i++) {
			System.out.print(0);
		}

		System.out.println(paramJWB);
	}
}
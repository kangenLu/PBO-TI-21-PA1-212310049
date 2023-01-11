import java.util.Scanner;

class Resto{
	
	private long harga;
	public void chooseMenu() {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Pilih Menu = ");
	for (int i=1; i<=80; i++)
	System.out.print("=");
	System.out.println("\n\t\t\t\tMenu Sarapan\n");
	System.out.println("1. Nasi Goreng\n2. Bubur Ayam\n3. Soto Ayam");
	for (int i=1; i<=80; i++)
	System.out.print("=");	
		    
	int pilihMenu = input.nextInt();
	do {
	switch(pilihMenu) {
	case 1:
		System.out.println("Anda memesan Nasi Goreng dengan harga"+getPrices(pilihMenu));
		break;
	case 2:
		System.out.println("Anda memesan Bubur Ayam dengan harga"+getPrices(pilihMenu));
		break;
	case 3:
		System.out.println("Anda memesan Soto Ayam dengan harga"+getPrices(pilihMenu));
		break;
		default:
			System.out.println("Maaf menu yang anda masukan salah"+getPrices(pilihMenu));
	}
	private long getPrices(int pilihMenu) {
		if (pilihMenu == 1) {
			harga = 22000;
			
		}else if(pilihMenu == 2) {
			harga = 15000;
		}else if(pilihMenu == 3) {
			harga = 25000;
		}
		return harga;
	}
	

public class Latihan07 {
	public static void main(String[] args) {
		Resto resto = new Resto();
		resto.chooseMenu();
		
		Scanner input = new Scanner(System.in);
	    System.out.print("Apakah anda akan memesan kembali ? (Y/N)= ");
	    String jwb;
	    jwb = input.next();
	    
		while (jwb.equals("Y"));

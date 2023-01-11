import javax.swing.JOptionPane;

public class Latihan07 {
	public static void main(String[] args) {
		Resto r = new Resto();
		r.chooseMenu();
	}
}

class Resto {
	private long harga;
	private String menu;
	public void chooseMenu() {
		//Menampilkan menu 
		boolean isExit = false;
		do {
			String list = "1. Nasi Goreng \n 2. Bubur Ayam \n 3. Soto Ayam";
		
			String menu = JOptionPane.showInputDialog(null, list,
													  "Menu Sarapan", JOptionPane.QUESTION_MESSAGE);
			//Periksa apakah inputan melebihi qty menu atau bertype data selain integer
			if (menu == null) {
				isExit = (isConfirm() == 1) ? false : true;
			} else if (isNumber(menu)) {
				int convertMenu = Integer.parseInt(menu);
					getPrices(convertMenu);
			}
		} while(!isExit);	
	}
	public int isConfirm() {
//		Mengkonfirmasi kepada user apabila user menekan tombol cancel, apa user ingin keluar atau tidak
		String[] options = new String[2];
		options[0] = "tidak";
		options[1] = "mau";
		int isConfirm = JOptionPane.showOptionDialog(null,"Apakah anda ingin memesan? ",
													 "Konfirmasi Keluar", 0,
													 JOptionPane.INFORMATION_MESSAGE, null,
													 options, null);
		return isConfirm;
	}	
	public boolean isNumber(String number) { //cek apakah nilai input berupa numerik
		//error handler try_catch
		try {//statement logic jika benar
			Integer.parseInt(number);
			return true;
		} catch (Exception e) {//statement logic jika salah
			JOptionPane.showMessageDialog(null, "Masukan nilai numerik", 
										"Warning", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}	
	private Long getPrices(int menu) {
		Resto r= new Resto();
//		menampilkan window pesanan setelah user menginput nomor menu
		switch (menu) {
			case 1:
			r.menu = "Nasi Goreng";
			r.harga = 22000;
			JOptionPane.showMessageDialog(null,"Anda memesan " + (r.menu) + " dengan harga Rp." + (r.harga) + ",-",
						 				  "Makanan yang anda pesan",JOptionPane.INFORMATION_MESSAGE);
			r.reOrder();
			break;
			case 2 :
			r.menu = "Bubur Ayam";
			r.harga = 15000;
			JOptionPane.showMessageDialog(null,"Anda memesan " + (r.menu) + " dengan harga Rp." + (r.harga) + ",-",
										  "Makanan yang anda pesan",JOptionPane.INFORMATION_MESSAGE);
			r.reOrder();
			break;
			case 3 :
			r.menu = "Soto Ayam";
			r.harga = 25000;
			JOptionPane.showMessageDialog(null,"Anda memesan " + (r.menu) + " dengan harga Rp." + (r.harga) + ",-",
										  "Makanan yang anda pesan",JOptionPane.INFORMATION_MESSAGE);
			r.reOrder();
			break;
			default :
//				jika nomor menu yang diinput oleh user melebihi qty menu maka menampilkan window pilihan tidak tersedia
			JOptionPane.showMessageDialog(null,"Menu tidak tersedia, pilih menu yang ada di daftar",
										  "Error Input",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		return r.harga;
	}
	public int reOrder() {
//		mengkonfirmsi kepada user apakah user ingin menambah makanan atau memesan kembali setelah memesan
		String[] options = new String[2];
		options[0] = "Tidak";
		options[1] = "Mau";
		int reOrder = JOptionPane.showOptionDialog(null,
				  					 			  "Apakah ingin memesan kembali?",
				  					 			  "Konfirmasi jika ingin mesen lagi",
				  					 			  0,
				  					 			  JOptionPane.INFORMATION_MESSAGE,
				  					 			  null,
				  					 			  options,
				  					 			  null);
		if (reOrder == 0) {
			JOptionPane.showMessageDialog(null,
					  					  "Terima Kasih",
					  					  "Order anda sedang diproses",
					  					  JOptionPane.INFORMATION_MESSAGE);
					  					  System.exit(0);
		}
		return reOrder;
	}
}
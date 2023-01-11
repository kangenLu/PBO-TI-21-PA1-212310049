import javax.swing.JOptionPane;

public class Latihan03 {
	public static void main(String[] args) {
		Biodata siswaObj1 = new Biodata();
		JOptionPane jop = new JOptionPane();
		int a = 0, konfirmasi_a = 0;
		String Fullname,Alamat,Usia;
		
		do {
			do {
				Fullname = jop.showInputDialog(null, "Masukkan Nama Lengkap");
				siswaObj1.setFullname(Fullname);
				if(Fullname == null) {
					a = jop.showConfirmDialog(jop, "Apakah anda ingin keluar ?","Yakin?", jop.YES_NO_OPTION);
					if(a == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
				}
			}while(a == JOptionPane.NO_OPTION && Fullname == null);
			
			do {
				Alamat = jop.showInputDialog(null, "Masukkan Alamat");
				siswaObj1.setAlamat(Alamat);
				if(Alamat == null) {
					a = jop.showConfirmDialog(jop, "Apakah anda ingin keluar ?","Yakin?", jop.YES_NO_OPTION);
					if(a == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
				}
			}while(a == JOptionPane.NO_OPTION && Alamat == null);
			
			do {
				Usia = jop.showInputDialog(null, "Masukkan Usia");
				siswaObj1.setUsia(Usia);
				if(Usia == null) {
					a = jop.showConfirmDialog(jop, "Apakah anda ingin keluar ?","Yakin?", jop.YES_NO_OPTION);
					if(a == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
				}
			}while(a == JOptionPane.NO_OPTION && Usia == null);
			
			if(Fullname.equals("") || Usia.equals("") || Alamat.equals("") ) {
				jop.showMessageDialog(null, "Field [fullname/usia/alamat] tidak boleh kosong", "Error Message", jop.ERROR_MESSAGE);
			}else if(Alamat.length() <= 10) {
				jop.showMessageDialog(null, "Masukkan alamat minimum 10 karakter!", "WARNING!", jop.WARNING_MESSAGE);
			}else {

		        try { 
		          int strUsia= Integer.parseInt(Usia);
		          jop.showMessageDialog(null, siswaObj1.getFullname() + "\n" + siswaObj1.getAlamat() + "\n" + siswaObj1.getUsia());
		          konfirmasi_a = jop.showConfirmDialog(jop, "Apakah anda ingin keluar ?","Yakin?", jop.YES_NO_OPTION);
		          if(konfirmasi_a == JOptionPane.YES_OPTION) {
		        	  System.exit(0);
		          }
		        } catch(NumberFormatException e) { 
		          JOptionPane.showMessageDialog(null, "Isian Usia harus angka!", "ERROR!", jop.ERROR_MESSAGE);
		          System.exit(0);
		        }
			}
		}while(konfirmasi_a == JOptionPane.NO_OPTION);

	}
}
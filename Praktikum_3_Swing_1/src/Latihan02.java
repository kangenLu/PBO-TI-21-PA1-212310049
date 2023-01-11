import javax.swing.*;

public class Latihan02 {
    public static void main(String[] args) {
        Biodata siswaObj1 = new Biodata();
        JOptionPane jop = new JOptionPane();

        String Fullname = JOptionPane.showInputDialog(null, "Masukkan Nama Lengkap");
        siswaObj1.setFullname(Fullname);

        String Alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat");
        siswaObj1.setAlamat(Alamat);

        String Usia = JOptionPane.showInputDialog(null, "Masukkan Usia");
        siswaObj1.setUsia(Usia);

        JOptionPane.showMessageDialog(null, siswaObj1.getFullname() + "\n" + siswaObj1.getAlamat() + "\n" + siswaObj1.getUsia());
    }

}
class Biodata{
    String Fullname, Usia, Alamat;
    void setFullname(String paramFullname) {
        Fullname = paramFullname;
    }

    String getFullname() {
        return Fullname;
    }

    void setAlamat(String paramAlamat) {
        Alamat = paramAlamat;
    }

    String getAlamat() {
        return Alamat;
    }

    void setUsia(String paramUsia) {
        Usia = paramUsia;
    }

    String getUsia() {
        return Usia;
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Latihan02 {

	public static void main(String[] args) {
		int length = 2, jumlah = 0;
		String value = "";
		ArrayList<ArrayList<Integer> > matriksA =
		new ArrayList<ArrayList<Integer> >();
		ArrayList<ArrayList<Integer> > matriksB =
		new ArrayList<ArrayList<Integer> >();
		

		for(int i =0; i<length; i++) {
			for(int j=0; j<length; j++) {
			matriksA.add(new ArrayList<Integer>());
			value = JOptionPane.showInputDialog(null,"Masukkan angka: ","Matriks A ke-["+i+"]"+"["+j+"]",JOptionPane.QUESTION_MESSAGE);
			matriksA.get(i).add(j, Integer.parseInt(value));
		}
			}
		for(int i =0; i<length; i++) {
			for(int j=0; j<length; j++) {
			matriksB.add(new ArrayList<Integer>());
			value = JOptionPane.showInputDialog(null,"Masukkan angka: ","Matriks B ke-["+i+"]"+"["+j+"]",JOptionPane.QUESTION_MESSAGE);
			matriksB.get(i).add(j, Integer.parseInt(value));
		}
			}
		
		String output = "Matrix A: \n";
		for(int i =0; i<length; i++) {
			for(int j=0; j<length; j++) {
			output += matriksA.get(i).get(j) + " ";
		}
			output += "\n";
			}
		String output1="Matrix B: \n";
		for(int i =0; i<length; i++) {
			for(int j=0; j<length; j++) {
			output1 += matriksB.get(i).get(j) + " ";
		}
			output1 += "\n";
			}
		String output2 = "\nHasil Perkalian : \n";
		for(int i =0; i<length; i++) {
			for(int j=0; j<length; j++) {
				 for (int k = 0; k < length; k++) {
		            //jumlah = jumlah + matrixA[i][k] * matrixA[k][j];
		            jumlah +=  matriksA.get(i).get(k) * matriksB.get(k).get(j);
		         }
		          output2 += jumlah + " ";
		          jumlah = 0;
		    }
				output2 += "\n";
		}
		
		JOptionPane.showMessageDialog(null, output+output1+output2);	
	}
}
package com.ibik.pbo.praktikum;

	import javax.swing.JOptionPane;
	import java.util.ArrayList;

	public class AppBukuTelp {
	    
	    public static ArrayList<String> table;

	    public static void main(String[] args) {
	        AppBukuTelp mainApps = new AppBukuTelp();

	        table = new ArrayList<String>();
	        table.add("Nama Lengkap");
	        table.add("Alamat");
	        table.add("No. Telp");
	        
	        ArrayList<ArrayList<String>> data_tabel = new ArrayList<ArrayList<String>>();

	        for(int i = 0; i < table.size(); i++) {
	            data_tabel.add(new ArrayList<String>());
	            for(int j = 0; j < table.size(); j++) {
	                String values = JOptionPane.showInputDialog(null,
	                                "Masukkan " + table.get(j) + ":",
	                                "Data ke - " + i,
	                                JOptionPane.QUESTION_MESSAGE);
	                data_tabel.get(i).add(j, values);
	            }
	        }

	        String output = mainApps.PrintValues(data_tabel);

	        JOptionPane.showMessageDialog(null, output, "Output Data", JOptionPane.INFORMATION_MESSAGE);
	    }

	    private String PrintValues(ArrayList<ArrayList<String>> val) {
	        String output = "";
	        for(int i = 0; i < val.size(); i++) {
	            for(int j = 0; j < val.size(); j++) {
	                output += table.get(j) + ": " + val.get(i).get(j) + "\n";
	            }
	            output += "\n";
	        }
	        return output;
	    }

	}
class Latihan09 {
	int npm,semester;
	String fullName,className;
	float gpa;
	
	int getNPM(int paramNPM) {
		npm = paramNPM;
		return npm;
	}
	
	String getFullName(String paramFullName) {
		fullName = paramFullName;
		return fullName;
	}
	
	String getClassName(String paramClassName) {
		className = paramClassName;
		return className;
	}
	
	int getSemester(int paramSemester) {
		semester = paramSemester;
		return semester;
	}
	
	float getGPA(float paramGPA) {
		gpa = paramGPA;
		return gpa;
	}
}

public class Students {
	public static void main(String[] args) {
		Latihan09 myBio = new Latihan09();
		System.out.println("NPM : " + myBio.getNPM(212310049));
		System.out.println("Nama Lengkap : " + myBio.getFullName("Melani"));
		System.out.println("Kelas : " + myBio.getClassName("TI21-PA"));
		System.out.println("Semester : " + myBio.getSemester(3));
		System.out.println("GPA : " + myBio.getGPA(4));
	}
}
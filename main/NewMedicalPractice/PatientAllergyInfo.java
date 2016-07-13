package NewMedicalPractice;

import java.util.List;

public class PatientAllergyInfo extends NewPatient{
	


	public static void main (String [] args){
		PatientAllergyInfo pt1 = new PatientAllergyInfo();
		
		pt1.setName("Jason  Nehemiah", "Veerpana");
		pt1.setAge(25);
		pt1.setSex("Male");
		pt1.setPhoneNo(135133215, 656546546);
		pt1.setAddress("Memphis", "Wisconsin");
		Allergy al = new Allergy();
		al.setAllergyName("Rashes");
		al.setSeverity("High");
		pt1.printpatient();
		System.out.println("Allergy name: " + al.getAllergyName());
		System.out.println("Severity: " + al.getSeverity());
		System.out.println("Allergy Date: " + pt1.getAllergyDate());
		
		System.out.println("\n===============================================================");
		
		PatientAllergyInfo maddy = new PatientAllergyInfo();
		maddy.setName("Madhav reddy", "Gummadi");
		maddy.setAge(25);
		maddy.setPhoneNo(925556563,  2767);
		maddy.setAddress("california", null);
		maddy.setAllergyName("Kugli");
		maddy.setSeverity("Super High");
		maddy.setDoctorName("Dr. Musheer Akbar");
		maddy.printpatient();
		System.out.println("Allergy name: " + maddy.getAllergyName());
		System.out.println("Severity: " + maddy.getSeverity());
		System.out.println("Allergy Date: " + maddy.getAllergyDate());
		System.out.println("Doctor Name: " + maddy.getDoctorName());
	}
		
	
}

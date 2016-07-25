package Allergy;

import java.util.ArrayList;
import java.util.List;

public class PatientHealthInfo {
public static void main(String[] args) {
		
		Patient pt = new Patient();
		pt.setName("Jack");
		Allergy al = new Allergy();
		al.setAllergyName("rashes");
		al.setSeverity("medium");
		Allergy al1 = new Allergy();
		al1.setAllergyName("sweling");
		al1.setSeverity("medium");
		List<Allergy> allergyList = new ArrayList<Allergy>();
		allergyList.add(al);
		allergyList.add(al1);
		pt.setAllergyList(allergyList);
		String str = patient(pt);

		System.out.println(" Result is : " + str);
		
		System.out.println("Patient Name      Allergy Name             Severity ");
		System.out.println("===========================================================");
		System.out.printf("%s\t\t%s\t\t\t%s\t\t\t", pt.getName(), al.getAllergyName(),al.getSeverity());
		
		}

		public static String patient(Patient pt){
		if(pt.getAllergyList().size() > 0){
		return "allergy";
		}
		else if (pt.getDiseaseList().size() > 0){
		return "diease";
		}
		return null;
		
	}
}

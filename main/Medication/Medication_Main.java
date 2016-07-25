package Medication;

import java.util.ArrayList;

public class Medication_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1 = new Patient("Vinay",Patient.Dosage.DAILY);
		Patient p2 = new Patient("Ram",Patient.Dosage.HOURLY,1);
		Patient p3 = new Patient("Ravi",Patient.Dosage.DAILY,Patient.When.BEFORE_MEALS,Patient.When.AFTER_MEALS);
		ArrayList<Patient> patients = new ArrayList<Patient>();
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		System.out.println("PATIENT_NAME\t\tDOSAGE\t\t When");
		for(Patient e:patients){
			System.out.print(e.patient_name+"\t\t\t");
			System.out.print(e.dosage.name()+"\t\t");
			for(Patient.When x:e.when){
				System.out.print(x.name()+"   ");
			}
			System.out.println();
		}
		
	}
}

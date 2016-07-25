package Medication;

import java.util.ArrayList;
import java.util.List;

public class Patient {
	public enum Dosage {
		HOURLY,DAILY,WEEKLY,MONTHLY
	}
	public enum When {
		BEFORE_MEALS,WITH_MEALS,AFTER_MEALS,Any_Time
	}
	
	String patient_name;
	Dosage dosage;
	List<When> when = new ArrayList<When>();
	int noOfTimes;
	Patient(String patient_name,Dosage dosage){
		this.patient_name=patient_name;
		this.dosage=dosage;
		this.noOfTimes=1;
		this.when.add(When.Any_Time);
	}
	Patient(String patient_name,Dosage dosage,When once){
		this.patient_name=patient_name;
		this.dosage=dosage;
		this.when.add(once);
		this.noOfTimes=1;
	}
	Patient(String patient_name,Dosage dosage,When first_dose,When second_dose){
		this.patient_name=patient_name;
		this.dosage=dosage;
		this.when.add(first_dose);
		this.when.add(second_dose);
		this.noOfTimes=2;
	}
	Patient(String patient_name,Dosage dosage,When first_dose,When second_dose,When third_dose){
		this.patient_name=patient_name;
		this.dosage=dosage;
		this.when.add(first_dose);
		this.when.add(second_dose);
		this.when.add(third_dose);
		this.noOfTimes=3;
	}
	Patient(String patient_name,Dosage dosage,int no_of_times){
		this.patient_name=patient_name;
		this.dosage=dosage;
		this.noOfTimes=no_of_times;
		this.when.add(When.Any_Time);
	}
}

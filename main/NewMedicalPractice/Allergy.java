package NewMedicalPractice;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class Allergy  {
	 
	private String allergyName;
	private String Severity;
	java.util.Date allergyDate = new Date();
	private String doctorName;

	public String getDoctorName(){
		return doctorName;
	}
	
	public void setDoctorName(String doctorName){
		this.doctorName= doctorName;
	}
	public String getAllergyName(){
		return allergyName;
	}
	
	public void setAllergyName(String allergyName){
		this.allergyName=allergyName;
	}
	
	public String getSeverity(){
		return Severity;
	}
	
	public void setSeverity(String Severity){
		this.Severity=Severity;
	}
	
	private List<Allergy> allergyList;
	
	public List<Allergy> getAllergyList(){
		return allergyList;
	}
	
	public void setAllergyList(){
		this.allergyList=allergyList;
	}

	
	public java.util.Date getAllergyDate(){
		return allergyDate;
	}

}

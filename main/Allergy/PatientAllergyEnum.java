package Allergy;

public enum PatientAllergyEnum {
	
		patient1("Allergy1","Medium","rashes","doctor"),
		patient2("Allergy2","Low","swelling","Nurse"),
		patient3("Allergy3","High","cold","Cousin");
	
	private final String allergyType;
	private final String severity;
	private final String symptoms;
	private final String report;
	
	PatientAllergyEnum(String nameOfAllergy,String sev,String symp, String allergyreport)
	{
		allergyType = nameOfAllergy;
		severity = sev;
		symptoms = symp;
		report =allergyreport;
	}
	public String getType()
	{
		return allergyType;
	}
	public String getSeverity()
	{
		return severity;
	}
	public String getSymptoms()
	{
		return symptoms;
	}
	public String getAllergyReported(){
	return report;
	}
}


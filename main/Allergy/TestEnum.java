package Allergy;

public class TestEnum {
	public static void main(String [] args)
	{
		System.out.println("Name\t        AllergyType\t       Severity\t       Symptoms\t       Allergy Reported By");
		System.out.println("------------------------------------------------------------------------------------------");
		for(PatientAllergyEnum patients : PatientAllergyEnum.values())
		{
			System.out.printf("%s\t%s\t\t%s\t\t%s\t\t%s\n",patients, patients.getType(),patients.getSeverity(),patients.getSymptoms(),patients.getAllergyReported());
		}
		
	}
}


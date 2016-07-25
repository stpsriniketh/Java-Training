package Allergy;

public class Allergy {
	

		private String allergyName;

		private String severity;
		
		private String allergyreported;
		
		public String getAllergyReported(){
			return allergyreported;
		}
		
		public void getAllergyReported(String allergyreported){
			this.allergyreported=allergyreported;
		}

		public String getAllergyName() {
		return allergyName;
		}

		public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
		}

		public String getSeverity() {
		return severity;
		}

		public void setSeverity(String severity) {
		this.severity = severity;
		}
		
	}



package NewMedicalPractice;

public class PrintPatient {
	public static void main(String []args){
		NewPatient p1 = new NewPatient();
		p1.setName("Musheer akbar" , null);
		p1.setAge(25);
		p1.setAddress("1746 Randolph Place ", "4930 Owens Drive");
		p1.setPhoneNo(925356, 9234466);
		p1.setSex("Male");
	
		p1.printpatient();
		//System.out.println("Date : " + p1.getDate().toString());
		
	}
}

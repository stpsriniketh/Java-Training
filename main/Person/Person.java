package Person;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	public Person(String firstName, String lastName, int age) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName+" "+lastName+" "+age;
	}
	
	public void printPatient(){
		System.out.println("First Name: " + firstName);
		System.out.println("First Name: " + lastName);
		System.out.println("Age: " + age);
	}
	
}

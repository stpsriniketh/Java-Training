package NewMedicalPractice;

import java.util.Date;

public class Temperature {

    final static double normaltemp = 98.6;
    private String patientname;
    private String sex;
    private int age;
    private String recorder;
    private String readingType;
    java.util.Date daterecorded = new Date();
  

    public String getPatientName(){
    	return patientname;
    }
    
    public void setPatientName(String patientname){
    	this.patientname=patientname;
    }
    public String getSex(){
    	return sex;
    }
    public void setSex(String sex){
    	this.sex=sex;
    }
    
    public int getAge(){
    	return age;
    }
    public void setAge(int age){
    	this.age=age;
    }
    
    public String getTempRecorder(){
    	return recorder;
    }
    
    public void setTempRecorder(String recorder){
    	this.recorder=recorder;	
    }
    
    public Date getDateRecorded(){
    	return daterecorded;
    }
    
    public String getReadingType(){
    	return readingType;
    }
    
    public void setReadinType(String readingType){
    	this.readingType=readingType;
    }
    
    
	public  void getTemperatureFromMouth(double reading){
		
		if ( reading > normaltemp)
			System.out.println("High Fever");
	}
	public  void  getTempFromArmpit(double reading){
		if (reading > 100)
			System.out.println("High Fever");
	
		}
	public  void  getTempFromEar(double reading){
		if (reading > 100)
			System.out.println("High Fever");
	}		
	
   public void printPatient(){
	   System.out.println("Patient Name: " + patientname);
	   System.out.println("Patient Age: " + age );
	   System.out.println("Sex: " + sex);
	   System.out.println("Recorder: " + recorder);
	   System.out.println("Reading Taken from: " + readingType);
	   System.out.println("Date of Recording: " + daterecorded);
   }

	public static void main(String []args){
	    Temperature rashu = new Temperature();
	    rashu.setPatientName("Rasiq Turabi");
	    rashu.setSex("Male");
	    rashu.setAge(25);
	    rashu.setReadinType("from Mouth");
	    rashu.setTempRecorder("Nurse");
	    rashu.printPatient();
	    rashu.getTemperatureFromMouth(100);
	    System.out.println("Body Temperatue of Patient is: " );
	 
	    
	    
	}
}

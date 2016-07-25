package Medical;

import java.util.Date;

public class NewAllergy {

	  private Date dateDiagnosed; 
	  private String diagnosedBy; 
	  private String Allergy; 
	  private String reaction; 
	  private String specifics; 
	  private String brandName;
	  private String route;
	  private String dose;
	  private String reasonStopped;
	  private String name;
	  private Date dateStarted;
	  private Date dateStopped;
	  public String strength; 
	  private String frequency; 
	  private String prescription;
	  private String details;
	 public NewAllergy(Date dateStarted, Date dateStopped, String reasonStopped, String name, String brandName, String dose, String route, String strength, String frequency, String prescription, String details) { 
		
		 
		    this.dateStarted = dateStarted; 
		    this.dateStopped = dateStopped; 
		    this.reasonStopped = reasonStopped; 
		    this.name = name; 
		    this.brandName = brandName; 
		    this.dose = dose; 
		    this.route = route; 
		    this.strength = strength; 
		    this.frequency = frequency; 
		    this.prescription = prescription; 
		    this.details = details; 
		  } 
		 
		  /**
		   * @return the dateStarted 
		   */ 
		  public Date getDateStarted() { 
		    return dateStarted; 
		  } 
		 
		  /**
		   * @param dateStarted the dateStarted to set 
		   */ 
		  public void setDateStarted(Date dateStarted) { 
		    this.dateStarted = dateStarted; 
		  } 
		 
		  /**
		   * @return the dateStopped 
		   */ 
		  public Date getDateStopped() { 
		    return dateStopped; 
		  } 
		 
		  /**
		   * @param dateStopped the dateStopped to set 
		   */ 
		  public void setDateStopped(Date dateStopped) { 
		    this.dateStopped = dateStopped; 
		  } 
		 
		  /**
		   * @return the reasonStopped 
		   */ 
		  public String getReasonStopped() { 
		    return reasonStopped; 
		  } 
		 
		  /**
		   * @param reasonStopped the reasonStopped to set 
		   */ 
		  public void setReasonStopped(String reasonStopped) { 
		    this.reasonStopped = reasonStopped; 
		  } 
		
		 
		
		 
		  /**
		   * @return the brandName 
		   */ 
		  public String getBrandName() { 
		    return brandName; 
		  } 
		 
		  /**
		   * @param brandName the brandName to set 
		   */ 
		  public void setBrandName(String brandName) { 
		    this.brandName = brandName; 
		  } 
		 
		  /**
		   * @return the dose 
		   */ 
		  public String getDose() { 
		    return dose; 
		  } 
		 
		  /**
		   * @param dose the dose to set 
		   */ 
		  public void setDose(String dose) { 
		    this.dose = dose; 
		  } 
		 
		  /**
		   * @return the route 
		   */ 
		  public String getRoute() { 
		    return route; 
		  } 
		 
		  /**
		   * @param route the route to set 
		   */ 
		  public void setRoute(String route) { 
		    this.route = route; 
		  } 
		 
		  /**
		   * @return the strength 
		   */ 
		  public String getStrength() { 
		    return strength; 
		  } 
		 
		  /**
		   * @param strength the strength to set 
		   */ 
		  public void setStrength(String strength) { 
		    this.strength = strength; 
		  } 
		 
		  /**
		   * @return the frequency 
		   */ 
		  public String getFrequency() { 
		    return frequency; 
		  } 
		 
		  /**
		   * @param frequency the frequency to set 
		   */ 
		  public void setFrequency(String frequency) { 
		    this.frequency = frequency; 
		  } 
		 
		  /**
		   * @return the prescription 
		   */ 
		  public String getPrescription() { 
		    return prescription; 
		  } 
		 
		  /**
		   * @param prescription the prescription to set 
		   */ 
		  public void setPrescription(String prescription) { 
		    this.prescription = prescription; 
		  } 
		 
		  /**
		   * @return the details 
		   */ 
		  public String getDetails() { 
		    return details; 
		  } 
		 
		  /**
		   * @param details the details to set 
		   */ 
		  public void setDetails(String details) { 
		    this.details = details; 
		  } 

		} 
		



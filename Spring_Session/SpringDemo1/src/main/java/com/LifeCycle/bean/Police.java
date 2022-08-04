package com.LifeCycle.bean;

public class Police {
  int policeId;
  String policeName;
  int numberOfCases;
  
  //public void setBeanName(String beanName)
	  
	  
 // }
  
  
  
  
  
  
  
  
public int getPoliceId() {
	return policeId;
}
public void setPoliceId(int policeId) {
	this.policeId = policeId;
}
public String getPoliceName() {
	return policeName;
}
public void setPoliceName(String policeName) {
	this.policeName = policeName;
}
public int getNumberOfCases() {
	return numberOfCases;
}
public void setNumberOfCases(int numberOfCases) {
	this.numberOfCases = numberOfCases;
}
@Override
public String toString() {
	return "Police [policeId=" + policeId + ", policeName=" + policeName + ", numberOfCases=" + numberOfCases + "]";
}
public Police() {
	super();
	// TODO Auto-generated constructor stub
}
public void init() {
	System.out.println("Inside the init method");
	System.out.println();
}
public void destroy() {
	
	System.out.println("Destroy method called");
}
  
}

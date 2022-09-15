package com.classandobjquestion2;
//Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.

//Name of the class - Patient
//
//Member Variables - patientName(String),height(double),weight(double)
//
//Member Function - double computeBMI()
//
//The above method should compute the BMI and return the result. T
//he formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
//
//Create an object of the Patient class and check the results.

public class Patient {
	String patientName;
	Double patientHeight=5.6;
	Double patientWeight=50.6;
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Double getPatientHeight() {
		return patientHeight;
	}
	public void setPatientHeight(Double patientHeight) {
		this.patientHeight = patientHeight;
	}
	public Double getPatientWeight() {
		return patientWeight;
	}
	public void setPatientWeight(Double patientWeight) {
		this.patientWeight = patientWeight;
	}
	

	public Double computeBMI() {
		
		Double bmi=patientWeight/(patientHeight*patientHeight);
		return bmi;
		
	}
	
	public static void main(String[] args) {
		Patient p=new Patient();
		System.out.println(p.computeBMI());
	}
	
	

}

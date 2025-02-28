/*kareen kamel 
 * 123059
 * lecture section :6
 * lab section:11
 * */
package myPac;

import java.util.ArrayList;

public class LongTermPatient extends PatientBase {
	private int daysAdmitted;
	private double dailyRate;
	
	

	public LongTermPatient(String patientId, String name, int age, String medicalHistory, Department department, int daysAdmitted, double dailyRate) {
		super(patientId, name, age, medicalHistory, department);
		this.daysAdmitted = daysAdmitted;
		this.dailyRate = dailyRate;
	}

	
	
	public int getDaysAdmitted() {
		return daysAdmitted;
	}
	public void setDaysAdmitted(int daysAdmitted) {
		this.daysAdmitted = daysAdmitted;
	}
	public double getDailyRate() {
		return dailyRate;
	}
	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}
	@Override
	public double calculateBill() {
		double  totalServiceCosts=0;
	 if (getServices() != null) { 
    for(HospitalService service:getServices()) {
    	if(service.getPatient()==this)
	totalServiceCosts+=service.getServiceCost();
						}
		}
		double bill;
		bill=((daysAdmitted*dailyRate)+totalServiceCosts)* (1 + Tax_Rate);
		return bill;
	}
	

	

}

/*kareen kamel 
 * 123059
 * lecture section :6
 * lab section:11
 */
package myPac;
import java.util.ArrayList;

public class EmergencyPatient extends PatientBase {
	private double emergencyFee;

	public double getEmergencyFee() {
		return emergencyFee;
	}

	public void setEmergencyFee(double emergencyFee) {
		this.emergencyFee = emergencyFee;
	}
	
	@Override
	public double calculateBill() {
		double  totalServiceCosts =0;
		 if (getServices() != null) { 
			    for(HospitalService service:getServices()) {
			    	if(service.getPatient()==this)
				totalServiceCosts+=service.getServiceCost();
									}
					}
		 
		double bill=emergencyFee+(totalServiceCosts*(1 +Tax_Rate));
		return bill ;
	}
	//default constructor
	public EmergencyPatient(String patientId, String name, int age, String medicalHistory, Department department,
			ArrayList<HospitalService> services, double emergencyFee) {
		super(patientId, name, age, medicalHistory, department, services);
		this.emergencyFee = emergencyFee;
	}

	public EmergencyPatient(String patientId, String name, int age, String medicalHistory, Department department, double emergencyFee) {
		super(patientId, name, age, medicalHistory, department);
		this.emergencyFee = emergencyFee;
	}

	

}

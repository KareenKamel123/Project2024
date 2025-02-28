/*kareen kamel 
 * 123059
 * lecture section :6
 * lab section:11
 */
package myPac;

public class HospitalService {
	private String serviceName;
	private double ServiceCost;
	private PatientBase patient;
	
	public HospitalService() {
		
	}

	public String toString() {
		return "HospitalService [serviceName=" + serviceName + ", ServiceCost=" + ServiceCost + ", patient=" + patient
				+ "]";
	}

	public static String toString2() {
		return "HospitalService";
	}
	public String getServiceName() {
		return getServiceName();
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public double getServiceCost() {
		return ServiceCost;
	}
	public void setServiceCost(double serviceCost) {
		ServiceCost = serviceCost;
	}
	public PatientBase getPatient() {
		return patient;
	}
	public void setPatient(PatientBase patient) {
		this.patient = patient;
	}
	public HospitalService(String serviceName, double serviceCost, PatientBase patient) {
		super();
		this.serviceName = serviceName;
		ServiceCost = serviceCost;
		this.patient = patient;
	}


}

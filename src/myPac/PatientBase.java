/*kareen kamel 
 * 123059
 * lecture section :6
 * lab section:11
 */


package myPac;
import java.util.ArrayList;

public abstract class  PatientBase  implements Comparable<PatientBase>, Billable {
	private static String patientId;
	private String name;
	private int age ;
	private String medicalHistory;
	private Department department;
	private ArrayList<HospitalService> services;
	public PatientBase(String patientId, String name, int age, String medicalHistory, Department department) {
		this.patientId= patientId;
		this.name=name;
		this.age=age;
		this.medicalHistory=medicalHistory;
		this.department=department;
		
	}
	public static String toString2() {
		return "PatientBase [patientId=" + patientId ;
		
	}
	public PatientBase() {
		super();
	}

	//non-default constructor - with args 
	public PatientBase(String patientId, String name, int age, String medicalHistory, Department department,
			ArrayList<HospitalService> services) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.medicalHistory = medicalHistory;
		this.department = department;
		this.services = new ArrayList<>(); 
	}
	
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMedicalHistory() {
		return medicalHistory;
	}
	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	public ArrayList<HospitalService> getServices() {
		return services;
	}
	public void setServices(ArrayList<HospitalService> services) {
		this.services = services;
	}
	public abstract double calculateBill() ;
		

	@Override
	public int compareTo(PatientBase o) {
		if(o.calculateBill()>calculateBill())
			return -1;
		else if(o.calculateBill()<calculateBill())
			return 1;
		else 
		  return 0;
	}
	
	@Override
	public String toString() {
		return "PatientBase [patientId=" + patientId + ", name=" + name + ", age=" + age + ", medicalHistory="
				+ medicalHistory + ", department=" + department + ", services=" + services + "]";
	}
	
	


}

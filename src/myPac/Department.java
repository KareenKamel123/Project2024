/*kareen kamel 
 * 123059
 * lecture section :6
 * lab section:11
 */
package myPac;

import java.util.ArrayList;

public class Department {
	private String departmentId;
	private String name;
	private ArrayList<Doctor>doctors=new ArrayList<>();
	private ArrayList<PatientBase>patients=new ArrayList();
	public Department() {
		
	}
	
	public Department(String departmentId, String name) {
		super();
		this.departmentId = departmentId;
		this.name = name;
	}
//default constructor
	public Department(String departmentId, String name, ArrayList<Doctor> doctors, ArrayList<PatientBase> patients) {
		super();
		this.departmentId = departmentId;
		this.name = name;
		this.doctors = doctors;
		this.patients = patients;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}
	public ArrayList<PatientBase> getPatients() {
		return patients;
	}
	public void setPatients(ArrayList<PatientBase> patients) {
		this.patients = patients;
	}
	public void addDoctor(Doctor doctor)
	{
		doctors.add(doctor);
		
	}
	public void addPatient(PatientBase Patient) {
		patients.add(Patient);
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", name=" + name + ", doctors=" + doctors + ", patients="
				+ patients + "]";
	}
	


}

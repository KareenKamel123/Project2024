/*kareen kamel 
 * 123059
 * lecture section :6
 * lab section:11
 */
package myPac;
public class Doctor implements Comparable<Doctor> {
	private String doctorId;
	private String name;
	private String specialty;
	private String degree;
	private double baseSalary;
	private double overtimeHours;
	private double overtimeRate;
	private Department department;
	public double calculateSalary() {
		if (degree.equalsIgnoreCase("Bachelor")){
	  double Bachelor=baseSalary+(0.1*baseSalary)+calculateOvertimePay();
	  return Bachelor;
	  }
		else if (degree.equalsIgnoreCase("Master")) {
			double Master=baseSalary+(0.2*baseSalary)+calculateOvertimePay();
			return Master;
		}
		else if (degree.equalsIgnoreCase("PhD")) {
			double PhD=baseSalary+(0.3*baseSalary)+calculateOvertimePay();
			return PhD;
		}
		else
		return baseSalary+calculateOvertimePay() ;
	  
	}
	public double calculateOvertimePay() {
		return overtimeHours* overtimeRate;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}
	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	public double getOvertimeRate() {
		return overtimeRate;
	}
	public void setOvertimeRate(double overtimeRate) {
		this.overtimeRate = overtimeRate;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Doctor(String doctorId, String name, String specialty, String degree, double baseSalary,
			double overtimeHours, double overtimeRate, Department department) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.specialty = specialty;
		this.degree = degree;
		this.baseSalary = baseSalary;
		this.overtimeHours = overtimeHours;
		this.overtimeRate = overtimeRate;
		this.department = department;
	}
	
	@Override
	public String toString() {
	return "Doctor [doctorId=" + doctorId + ", name=" + name + ", specialty=" + specialty + ", degree=" + degree
			+ ", baseSalary=" + baseSalary + ", overtimeHours=" + overtimeHours + ", overtimeRate=" + overtimeRate
			+ ", department=" + department + "]";
	}
	
	@Override
	public int compareTo(Doctor o) {
	if(o.calculateSalary()>this.calculateSalary() )
		return -1;
	else if (o.calculateSalary()<this.calculateSalary())
		return 1;
	else
		return 0;
	}
	


}

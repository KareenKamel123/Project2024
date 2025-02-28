
/*kareen kamel 
 * 123059
 * lecture section :6
 * lab section:11
 */
package myPac;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		ArrayList<PatientBase> patients = new ArrayList<>();
		Department dermatologists = new Department("00", "dermatologist");
		Department dentist = new Department("01", "dentist");
		Department general = new Department("02", "general");
		Doctor doc1 = new Doctor("11", "kamal", "dentist", "master", 4000, 30, 13, dentist);
		Doctor doc2 = new Doctor("12", "mohamed", "general", "phd", 3500, 10, 12, general);
		EmergencyPatient p1 = new EmergencyPatient("123", "saleem", 19, "old", dermatologists, 100);
		EmergencyPatient p2 = new EmergencyPatient("124", "sara", 40, "new", general, 50);
		LongTermPatient p3 = new LongTermPatient("122", "suad", 70, "old", dentist, 7, 8);
		dentist.addDoctor(doc1);
		general.addDoctor(doc2);
		dermatologists.addPatient(p1);
		dentist.addPatient(p3);
		general.addPatient(p2);
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		ArrayList<Doctor> doctors = new ArrayList<>();
		doctors.add(doc1);
		doctors.add(doc2);
		ArrayList<HospitalService> hospitals = new ArrayList<>();
		p1.setServices(hospitals);
		p1.getServices().add(new HospitalService("X-ray", 50, p1));
		p1.getServices().add(new HospitalService("MRI", 100, p1));
		p2.setServices(hospitals);
		p2.getServices().add(new HospitalService("MRI", 100, p2));
		p2.getServices().add(new HospitalService("lab tests", 200, p2));
		p3.setServices(hospitals);
		p3.getServices().add(new HospitalService("lab tests", 200, p3));
		HospitalService h=new HospitalService();
		h.toString2();
		System.out.println("Generate and display the third patient bill:");
		generateBill(patients.get(2));
		sortDoctorsBySalary(doctors);
		System.out.println("Sorted doctors by salary");
		for (int i = 0; i < doctors.size(); i++) {
			Department department = doctors.get(i).getDepartment();
			System.out.println("Doctor Department:" + department.getName() + ", Doctor Salary "
					+ doctors.get(i).calculateSalary());
		}
		java.util.Collections.sort(patients);
		System.out.println("Sorted patients by bill amount");
		for (int j = 0; j < patients.size(); j++) {
			System.out.println("Patient name=" + patients.get(j).getName() + ", age=" + patients.get(j).getAge());
		}

		System.out.println("The Total Sum Is " + calculateTotalpatientsBill(patients));

	}

	public static void sortDoctorsBySalary(ArrayList<Doctor> d) {
		java.util.Collections.sort(d);

	}

	public static double calculateTotalpatientsBill(ArrayList<PatientBase> p) {
		double totalBill = 0;
		for (int i = 0; i < p.size(); i++) {
			totalBill += p.get(i).calculateBill();

		}

		return totalBill;

	}

	public static void generateBill(PatientBase p) {
		System.out.println("Patient’s ID:" + p.getPatientId());
		System.out.println("Patient’s Name:" + p.getName());
		System.out.println("Patient’s total bill amount:" + p.calculateBill());

	}

}

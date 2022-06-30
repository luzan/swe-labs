package studentrecordsmgmtapp.model;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;
public class Student implements Comparable<Student>{
	public int studentId;
	public String name;
	public LocalDate dateOfAdmission;
	
	public Student(int studentId, String name, LocalDate dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dateOfAdmission = dateOfAdmission;
	}
	public Student(int studentId, String name) {
		
		this.studentId = studentId;
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int i) {
		this.studentId = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	 @Override
	public int compareTo(Student n) {
        return n.dateOfAdmission.compareTo(dateOfAdmission);
    }
	
	  
}

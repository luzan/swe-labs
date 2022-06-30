package studentrecordsmgmtapp;

import java.time.LocalDate;
import java.util.*;
import java.util.Collections;
import java.util.List;

import studentrecordsmgmtapp.model.Student;

public class MyStudentRecordsMgmtApp {
	public void printListOfStudents(List<Student> students) {
		Collections.sort(students);
	       
		// Print the name from the list....
		for (Student s : students) {
			System.out.println(s.getName());
		}
		
	}
	public void getListOfPlatinumAlumniStudents(List<Student> students) {
		LocalDate localDate = LocalDate.now();
		int platinumYear=localDate.getYear()-30;
		Collections.sort(students);
		//int platinumYear1=students.getYear();
        System.out.println("The Platinum Year is: " +  platinumYear);
        System.out.println("The PlatinumStudents :");
		for (Student s : students) {
			
			LocalDate d =s.getDateOfAdmission();
			if(d.getYear()<= platinumYear)
			System.out.println(s.getStudentId() +" "+s.getName() + "  " + s.getDateOfAdmission());
		}
		
	}

	public static void main(String[] args) {
		MyStudentRecordsMgmtApp myStudent = new MyStudentRecordsMgmtApp();
		List<Student> students = Arrays.asList(new Student(110001, "Dave",LocalDate.of(1951,11,18)), new Student(110002, "Anna",LocalDate.of(1990,12,17)),
				new Student(110003, "Erica",LocalDate.of(1974,01,31)), new Student(1110004, "Carlos",LocalDate.of(2009,8,22)), new Student(110005, "Bob",LocalDate.of(1990,03,05))

		);
		
		//myStudent.printListOfStudents(students);
		
		myStudent.getListOfPlatinumAlumniStudents(students);
		

	}
}

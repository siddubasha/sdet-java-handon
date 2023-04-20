package com.flatmap.in;

import java.util.Arrays;
import java.util.List;

class Student {
	int id;
	String name;
	char grade;

	public Student(int id, String name, char grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	

}

public class Demo3 {
	public static void main(String[] args) {
       
		List<Student> studentsEee=Arrays.asList(
				
				new Student(101,"Smith", 'A'),
				new Student(102, "Jhon", 'B'),
				new Student(103, "Kendey", 'C')
				
				);
        List<Student> studentsEce=Arrays.asList(
				
				new Student(104,"Scott", 'A'),
				new Student(105, "Mary", 'B'),
				new Student(106, "Kitty", 'C')
				
				);
        List<List<Student>> collegeStudents=Arrays.asList(studentsEee,studentsEce);
         // flatmap return stream of objects
        // filtered the students who is having grade is C from complex collections
         collegeStudents.stream()
         .flatMap(collection->collection.stream().filter(student->student.grade=='C'))
         .forEach(System.out::println);
         
         //
		
		
		
		
	}

}

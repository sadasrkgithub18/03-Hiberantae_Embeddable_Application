package com.srkit.client;

import com.srkit.dao.StudentDAO;
import com.srkit.dao.impl.StudentDAOImpl;
import com.srkit.entity.StudentCompositeKey;
import com.srkit.entity.StudentEntity;

public class Tester {

	public static void main(String[] args) {

		StudentDAO dao = new StudentDAOImpl();
		
/*		
 * Save a student entity
*/		
		
		/*
		StudentCompositeKey compositeKey = new StudentCompositeKey();
		compositeKey.setRollNumber(101);
		compositeKey.setSection("B");
		
		StudentEntity entity = new StudentEntity();
		entity.setCompositeKey(compositeKey);
		entity.setStudentName("SANJAY");
		entity.setMarks(500);
		
		dao.saveStudent(entity);
		
		
		*/
		
		
		// fetch a student entity
		
		StudentCompositeKey compositeKey = new StudentCompositeKey();
		compositeKey.setRollNumber(101);
		compositeKey.setSection("A");
		
		StudentEntity entity = dao.fetchStudent(compositeKey);
		System.out.println("Name: " + entity.getStudentName());
		System.out.println("Marks: "+ entity.getMarks());
	}

}

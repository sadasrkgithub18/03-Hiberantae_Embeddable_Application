package com.srkit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.srkit.dao.StudentDAO;
import com.srkit.entity.StudentCompositeKey;
import com.srkit.entity.StudentEntity;

public class StudentDAOImpl implements StudentDAO {

	private EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("test");
	
	@Override
	public void saveStudent(StudentEntity entity) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try
		{
			entityManager.persist(entity);
			tx.commit();
			System.out.println("Student Entity is persisted to DB.....");
		}
		catch(Exception e)
		{
			tx.rollback();
			System.out.println("Issue in persisting student entity "+ e);	
		}
		finally
		{
			entityManager.close();
		}
	}

	@Override
	public StudentEntity fetchStudent(StudentCompositeKey compositeKey) {
		
		EntityManager entityManager = factory.createEntityManager();
		StudentEntity entity = entityManager.find(StudentEntity.class, compositeKey);
		entityManager.close();
		return entity;
	}

}

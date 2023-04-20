package com.srkit.dao;

import com.srkit.entity.StudentCompositeKey;
import com.srkit.entity.StudentEntity;

public interface StudentDAO {

	void saveStudent(StudentEntity entity);
	
	StudentEntity fetchStudent(StudentCompositeKey compositeKey);
	
	
}

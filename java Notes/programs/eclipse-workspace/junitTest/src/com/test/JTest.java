package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

class JTest {
	

	@Test
	void test() throws Exception{
		Demo d=new Demo();
//		DbUtils db=new DbUtils();
//		db.getconnection();
//	
	//	StudentDao sd=new StudentDao();
		StudentDao.DeleteStudent(4);
		assertEquals(4, 4);
		
		
	}
	
	@Test
	public void testConnection() throws Exception {
		//StudentDao.AddStudent(4, "test", 87);
	
		
		Object app=StudentDao.getAllStudent();
		assertEquals(4, app);
	}
}

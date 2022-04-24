package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class StuddentDetails {

    StudentVerify studentverify=new StudentVerify();
    Student stud=new Student();
	
	@Test
	public void testCalculateAttendance() {
		stud.setName("akash");
		stud.setAge(25);
		stud.setAttendance(56);
		stud.setId(1);
		stud.setEmail("abc@gmail.com");
		stud.setMarks(89);
		double att=studentverify.calAttendance(stud);
		assertEquals(67, att,0.0);
		
	}
	@Test
	public void testCalculateMarks() {
		stud.setName("ravi");
		stud.setAge(25);
		stud.setAttendance(66);
		stud.setId(2);
		stud.setEmail("pqr@gmail.com");
		stud.setMarks(69);
		double marks=studentverify.calMarks(stud);
		assertEquals(69, marks,0.0);
		
	}
	
	
	@Test
	public void testAge(){
		stud.setName("harvey");
		stud.setAge(-35);
		stud.setAttendance(56);
		stud.setId(3);
		stud.setEmail("lmn@gmail.com");
		stud.setMarks(77);
		int age=studentverify.calAge(stud);
		assertTrue(age>0);
	}
	@Test
	public void testCheckAge(){
		stud.setName("mike");
		stud.setAge(47);
		stud.setAttendance(76);
		stud.setId(4);


		int age=studentverify.checkAge(stud);
		assertTrue(age<60);
	}
	
	@Test
	public void testCheckName(){
		stud.setName(null);
		stud.setAge(60);
		stud.setId(5);
		stud.setEmail("xyz@gmail.com");
		stud.setMarks(77);
		String name=studentverify.checkName(stud);
		assertNotNull(name);
	}
	

	@Test
	
	public void testValidEmailId() throws Exception {

	    /*Arrange*/

		StudentEmail studem=new StudentEmail();
	    /*Act*/

	    boolean result = studem.isValidEmailId("andy@testdomain.com");

	    /*Assert*/

	    assertTrue("Valid email ID failed ", result );

	}

	@Test

	public void testInvalidEmailId() throws Exception {

		 /*Arrange*/

		StudentEmail studem=new StudentEmail();
	    /*Act*/

	    boolean result= studem.isValidEmailId("andy@testdomain");

	    /*Assert*/

	    assertFalse("Invalid email ID passed ", result);


	}
    @Test

    public void testAddEmailId() throws Exception {

        /*Arrange*/

    	StudentEmail studem=new StudentEmail();

        studem.addStudentEmailId("st1","lmn@gmail.com");;

        studem.addStudentEmailId("st2","mno@gmail.com");;

        /*Act*/

        int size=studem.hashMap.size();

        /*Assert*/

        assertEquals("Incorrect collection size ", 2, size);

    }
    @Test

    public void testAddEmailIdWithDuplicateKey() throws Exception {

        /*Arrange*/

    	StudentEmail studem=new StudentEmail();

        studem.addStudentEmailId("str01","pet@testdomain.com");

        studem.addStudentEmailId("Emp02", "mary@testdomain.com");


        /*Act*/

        int size=studem.hashMap.size();

        /*Assert*/

        assertNotEquals("Duplicate key in collection ", 3, size);

    }
   
    
    @Test

    public void testGetNonExistingEmailId() throws Exception {

        /*Arrange*/

    	StudentEmail studem=new StudentEmail();

    	studem.addStudentEmailId("str01","pet@testdomain.com");

        studem.addStudentEmailId("Emp02", "mary@testdomain.com");

       /*Act*/

        String val = studem.getStuddentEmailId("st4");

       /*Assert*/

        assertNull("Failed to return null for non existing employee", val);

    }
    @Test

    public void testIfObjectsAreSame() throws Exception {

        /*Arrange*/
    	StudentEmail stud1=new StudentEmail();

        stud1.addStudentEmailId("Emp01","peter@testdomain.com");

    	StudentEmail stud2=new StudentEmail();

        stud2.addStudentEmailId("Emp01","peter@testdomain.com");

        /*Act*/

        Map map1=stud1.hashMap;
        Map map2=stud2.hashMap;


        map1= map2;

        /*Assert*/

        assertSame("Failed because objects are not same ", map1, map2);

    }
    @Test

    public void testIfObjectsAreNotSame() throws Exception {

        /*Arrange*/

    	  /*Arrange*/
    	StudentEmail stud1=new StudentEmail();

        stud1.addStudentEmailId("Emp01","peter@testdomain.com");

    	StudentEmail stud2=new StudentEmail();

        stud2.addStudentEmailId("Emp01","peter@testdomain.com");

        /*Act*/

        Map map1=stud1.hashMap;
        Map map2=stud2.hashMap;


        /*Assert*/

        assertNotSame("Failed because objects are same ", map1, map2);

    }


}

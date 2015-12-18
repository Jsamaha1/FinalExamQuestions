package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Jacques", "S", "d", dBirthDate, "214 Chestnut Lane", "302-555-6889", "jsamaha@udel.edu","MIS");
		Student stu3 = new Student("Manuel", "c", "g", dBirthDate, "214 Oak Lane", "302-555-555", "manny@udel.edu","MIS");
		Student stu4 = new Student("Victor", "e", "h", dBirthDate, "214 James Lane", "302-893-5565", "Shaggy@udel.edu","MIS");
		Student stu5 = new Student("Shane", "f", "g", dBirthDate, "214 Cedar Lane", "302-333-5342", "Shauna@udel.edu","MIS");

		HashMap<UUID, Student> hashmap = new HashMap<UUID, Student>();
		hashmap.put(stu1.getPersonID(), stu1);
		hashmap.put(stu2.getPersonID(), stu2);
		hashmap.put(stu3.getPersonID(), stu3);
		hashmap.put(stu4.getPersonID(), stu4);
		hashmap.put(stu5.getPersonID(), stu5);
		
		assertTrue(hashmap.size() == 5);
	}

}

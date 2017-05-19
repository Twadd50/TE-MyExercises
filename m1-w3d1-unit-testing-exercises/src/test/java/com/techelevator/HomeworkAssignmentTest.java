package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {
	
	HomeworkAssignment sut;																//sut = subject under test (class youre testing) / sut = variable name

	@Before																				// @ = java annotation
	public void setUp() throws Exception {
		sut = new HomeworkAssignment(100);
	}
	@Test
	public void testSetTotalMarks100() {
		sut.setTotalMarks(233);
		assertEquals("A" , sut.getTotalMarks());
	}
	@Test
	public void testGetLetterGradeAWhen90() {
		sut.setTotalMarks(90);
		assertEquals("A" , sut.getLetterGrade());										//what you're expecting to get comes first... "A" in this example
	}
	@Test
	public void testGetLetterGradeAWhen89() {
		sut.setTotalMarks(89);
		assertEquals("B" , sut.getLetterGrade());
	}
	@Test
	public void testGetLetterGradeAWhen79() {
		sut.setTotalMarks(79);
		assertEquals("C" , sut.getLetterGrade());
	}
	@Test
	public void testGetLetterGradeAWhen69() {
		sut.setTotalMarks(69);
		assertEquals("D" , sut.getLetterGrade());
	}
	@Test
	public void testGetLetterGradeAWhen80() {
		sut.setTotalMarks(80);
		assertEquals("B" , sut.getLetterGrade());
	}
	@Test
	public void testGetLetterGradeAWhen70() {
		sut.setTotalMarks(70);
		assertEquals("C" , sut.getLetterGrade());
	}
	@Test
	public void testGetLetterGradeAWhen60() {
		sut.setTotalMarks(60);
		assertEquals("D" , sut.getLetterGrade());
	}
	@Test
	public void testGetLetterGradeAWhen59() {
		sut.setTotalMarks(59);
		assertEquals("F" , sut.getLetterGrade());
	}

	@Test
	public void testSubmitterName() {					//test name can can only return "void"
		sut.setSubmitterName("Tyler");
		assertEquals("Tyler" , sut.getSubmitterName());
		
	}
	
}






























		//Some tests are going to come back as failed

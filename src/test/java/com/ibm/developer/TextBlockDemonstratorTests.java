package com.ibm.developer;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class TextBlockDemonstratorTests {

	@Test
	public void testWorkingWithNormalStrings() {
		String jsonBody = "{\n" + //
				"\t\"fName\" : \"Thor\",\n" + //
				"\t\"lName\" : \"Odinson\"\n" + //
				"}";
		System.out.println("testWorkingWithNormalStrings");
		System.out.println(jsonBody);
	}

	@Test
	public void testUsingTextBlock() {
		String jsonBody = """
			              {
			                      "fName" : "Thor",
			                      "lName" : "Odinson"
			              }
			              """;
		System.out.println("testUsingTextBlock");
		System.out.println(jsonBody);         
	}

}
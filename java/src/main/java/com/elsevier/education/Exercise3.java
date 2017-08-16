package com.elsevier.education;

import java.util.*;

/**
I*/
public class Exercise3

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id * generator.nextInt();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}

// The test would pass as we are passing same value twice and since this is a  set,only one value will exist and the assert statement will be true

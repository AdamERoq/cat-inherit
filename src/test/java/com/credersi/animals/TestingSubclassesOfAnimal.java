package com.credersi.animals;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingSubclassesOfAnimal {

	@Test
	public void testDogDiesDiffernetlyToCat() {
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.runs();
		cat.runs();
		dog.runs();
		dog.runs();
		assertTrue(cat.isAlive());
		assertFalse(dog.isAlive());
		}
	}


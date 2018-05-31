package com.gft.esempi.test;

import com.gft.esempi.esercizi.Fibonacci;
import static org.junit.Assert.*;

import org.junit.Test;

public class testFibonacci {

	@Test
	public void testFibonacci1() {
		assertEquals( 1, Fibonacci.fibonacci(1));		
	}
	@Test
	public void testFibonacci2() {
		assertEquals( 8, Fibonacci.fibonacci(5));	
		assertEquals( 13, Fibonacci.fibonacci(6));		
	}
	
}

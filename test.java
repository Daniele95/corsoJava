package com.gft.esempi;

import com.gft.esempi.esercizi.Fibonacci;
import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testFibonacci() {
		assertEquals( 1, Fibonacci.fibonacci(1));		
	}
	@Test
	public void testFibonacci2() {
		assertEquals( 8, Fibonacci.fibonacci(5));	
		assertEquals( 13, Fibonacci.fibonacci(6));		
	}
	
}

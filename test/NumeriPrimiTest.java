package com.gft.esempi.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.gft.esempi.esercizi.NumeriPrimi;

public class NumeriPrimiTest {

	@Test
	public void testPrimi() {  
		List<Integer> primi = Arrays.asList(3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
		assertEquals( primi, NumeriPrimi.primi(100));
	}

}

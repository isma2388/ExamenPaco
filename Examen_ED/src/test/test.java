package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import codigo.Menor;

public class test {
	
	Menor comparar = new Menor();

	@Before

	public void setUp() throws Exception {
		
		comparar.setA(7);
		comparar.setB(5);

	}

	@Test
	public void test() {
		
		assertEquals(5,comparar.menor());
		}


	}



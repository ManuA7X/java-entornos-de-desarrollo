package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class TestAlgoritmos {

	@Test
	void sumatorio() {
		int sumaEsperada = 10;
		int sumaObtenida = Algoritmos.sumatorio(4);
		assertEquals(sumaEsperada, sumaObtenida);
	}
	
	@Test
	void factorial() {
		int factorialEsperada = 24;
		int factorialObtenida = Algoritmos.factorial(4);
		assertEquals(factorialEsperada, factorialObtenida);
	}

}

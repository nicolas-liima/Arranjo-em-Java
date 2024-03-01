package Arranjo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrranjoTeste {

	@Test
	void arranjotest() {
		int[] arr = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};

		Arranjo a  = new Arranjo(arr);
		
		assertEquals(510, a.menor(),"O menor deve ser 510");
		assertEquals(940, a.maior(), "O maior deve ser 940");
		assertEquals(7540, a.soma(),"A soma deve ser 7540");
		assertEquals(0, a.repeticoes(arr, 3),"3 aparece 0 vezes");
		assertEquals(1, a.repeticoes2(arr, 790),"790 aparece 1 vez");
		assertEquals(2, a.repeticoes3(arr, 940),"940 aparece 2 vezes");
		

		
		
	}

}
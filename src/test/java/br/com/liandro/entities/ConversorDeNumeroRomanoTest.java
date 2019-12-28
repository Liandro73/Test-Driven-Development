package br.com.liandro.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class ConversorDeNumeroRomanoTest {
	
	@Test
	public void deveEntenderOSimbolo() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("I");
		assertEquals(1, numero);		
	}
	
}

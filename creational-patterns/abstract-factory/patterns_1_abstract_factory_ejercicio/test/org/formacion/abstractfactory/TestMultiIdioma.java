package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiIdioma {

	@Test
	public void test_es() {
		AbstractFactory abstractFactory = new FactoryEs();
		
		assertEquals("¿qué hora es?", abstractFactory.createPreguntas().preguntaHora());
		assertEquals("¿qué tiempo hace?", abstractFactory.createPreguntas().preguntaTiempo());

		assertEquals("buenos días", abstractFactory.createSaludos().buenosDias());
		assertEquals("buenas tardes", abstractFactory.createSaludos().buenasTardes());
	}
	
	@Test
	public void test_en() {
		AbstractFactory abstractFactory = new FactoryEn();
		
		assertEquals("what time is it?", abstractFactory.createPreguntas().preguntaHora());
		assertEquals("how is the weather?", abstractFactory.createPreguntas().preguntaTiempo());

		
		assertEquals("good morning", abstractFactory.createSaludos().buenosDias());
		assertEquals("good afternoon", abstractFactory.createSaludos().buenasTardes());
	}

}

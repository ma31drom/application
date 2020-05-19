package by.pvt.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import by.pvt.aplication.AutoService;
import by.pvt.application.Auto;

public class AutoServiceTestss {

	@Test
	public void testVaz() {
		Auto createNewLada = new AutoService().createNewLada();
		assertEquals("ВАЗ", createNewLada.getManufacter());
		assertEquals("Priora", createNewLada.getModel().getName());
	}

}

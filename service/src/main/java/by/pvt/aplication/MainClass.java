package by.pvt.aplication;

import by.pvt.application.Auto;

public class MainClass {

	public static void main(String[] args) {

		Auto createNewLada = new AutoService().createNewLada();

		System.out.println(createNewLada);
	}
}

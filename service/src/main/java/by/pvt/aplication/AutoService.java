package by.pvt.aplication;

import java.util.Date;

import by.pvt.application.Auto;
import by.pvt.application.Model;

public class AutoService {

	public Auto createNewLada() {
		Auto auto = new Auto();
		Model ver = new Model();
		ver.setName("Priora");
		ver.setYear(new Date());
		auto.setModel(ver);
		auto.setManufacter("ВАЗ");

		return auto;
	};

}

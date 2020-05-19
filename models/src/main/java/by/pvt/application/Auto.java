package by.pvt.application;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Auto {

	private String manufacter;
	private Model model;

	public String getManufacter() {
		return manufacter;
	}

	public void setManufacter(String manufacter) {
		this.manufacter = manufacter;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}

}

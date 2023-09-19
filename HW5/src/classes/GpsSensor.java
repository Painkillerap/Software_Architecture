package classes;

import interfaces.IGpsSensor;

public class GpsSensor implements IGpsSensor {
    @Override
	public void methodFromInterface() {
		System.out.println("GpsSensor.methodFromInterface");
	}
}

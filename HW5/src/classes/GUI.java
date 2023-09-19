package classes;

import interfaces.IGUI;

public class GUI implements IGUI {
    @Override
	public void methodFromInterface() {
		System.out.println("GUI.methodFromInterface");
	}
}

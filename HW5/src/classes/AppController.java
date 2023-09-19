package classes;

import interfaces.ICommonInterface;
import interfaces.IGUI;
import interfaces.IUxControllers;

public class AppController implements ICommonInterface {
    private IGUI myGui;
	private IUxControllers myIUxControllers;

	private MapController mapController;

	public AppController(IGUI myGui, IUxControllers myIUxControllers, MapController mapController) {
		this.myGui = myGui;
		this.myIUxControllers = myIUxControllers;
		this.mapController = mapController;
	}

	@Override
	public void methodFromInterface() {
		System.out.println("AppController.methodFromInterface");
	}
}

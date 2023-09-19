package classes;

import interfaces.ICommonInterface;

public class TripController implements ICommonInterface {

	GpsSensor gps;
	private NetController netController;

	public TripController(GpsSensor gps, NetController netController) {
		this.gps = gps;
		this.netController = netController;
	}

	@Override
	public void methodFromInterface() {
		System.out.println("TripController.methodFromInterface");
	}
}
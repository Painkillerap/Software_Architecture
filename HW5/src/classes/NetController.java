package classes;

import interfaces.ICommonInterface;

class NetController implements ICommonInterface {
	private RoadRepository roadRepo;
	private CameraRepository cameraRepo;
	private CurrentTrafficRepository trafficRepo;

	public NetController(RoadRepository roadRepo, CameraRepository cameraRepo, CurrentTrafficRepository trafficRepo) {
		this.roadRepo = roadRepo;
		this.cameraRepo = cameraRepo;
		this.trafficRepo = trafficRepo;
	}

	@Override
	public void methodFromInterface() {
		System.out.println("NetController.methodFromInterface");
	}
	
}
package classes;

import interfaces.ICameraRepository;

public class CameraRepository implements ICameraRepository {
    @Override
	public void methodFromInterface() {
		System.out.println("CameraRepository.methodFromInterface");
	}
}

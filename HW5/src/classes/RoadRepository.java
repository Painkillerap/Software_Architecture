package classes;

import interfaces.IRoadRepository;

public class RoadRepository implements IRoadRepository{
    @Override
	public void methodFromInterface() {
		System.out.println("RoadRepository.methodFromInterface");
	}
}

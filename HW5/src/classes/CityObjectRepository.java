package classes;

import interfaces.ICityObjectRepository;

public class CityObjectRepository implements ICityObjectRepository{
    @Override
	public void methodFromInterface() {
		System.out.println("CityObjectRepository.methodFromInterface");
	}
}

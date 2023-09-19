package classes;

import interfaces.ICurrentTrafficRepository;

public class CurrentTrafficRepository implements ICurrentTrafficRepository {
    @Override
	public void methodFromInterface() {
		System.out.println("CurrentTrafficRep");
	}
}

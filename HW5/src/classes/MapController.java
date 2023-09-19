package classes;

import interfaces.ICityObjectRepository;
import interfaces.ICommonInterface;

public class MapController implements ICommonInterface{
    
    private ICityObjectRepository cityObjectRepository;
    private TripController tripController;

    public MapController(ICityObjectRepository cityObjectRepository, TripController tripController){
        this.cityObjectRepository=cityObjectRepository;
        this.tripController=tripController;
    }
    @Override
	public void methodFromInterface() {
		System.out.println("MapController.methodFromInterface");
	}
}

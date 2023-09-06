package InMemoryModel;

import ModelElements.*;
import ModelElements.SupportedFiles.*;

public class ModelStore implements IModelChanger {
    public static float power = 0;
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangeObserver changeObserver;

    public ModelStore(IModelChangeObserver changeObserver) {
        this.changeObserver = changeObserver;
        this.models = new PoligonalModel(new Poligon(new Point3D()), new Texture());
        this.cameras = new Camera(new Point3D(), new Angle3D());
        this.flashes = new Flash(new Point3D(), new Angle3D(), new Color(), power);
        this.scenes = new Scene(this.models, this.flashes, this.cameras);
    }

    public Scene getScena(int n){
        return this.scenes;
    }

    @Override
    public void notifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");
    }
    
}

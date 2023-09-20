package ModelElements;
import java.util.List;
import java.util.ArrayList;
public class Scene {
    public int id;

    public List<PoligonalModel> models;

    public List<Flash> flashes;

    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }


    public <T> T method1(T Flash) {
        return Flash;
    }

    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }

}

package Model;
import java.util.ArrayList;
import Entity.Entity_Obat;

public class Model_Obat implements Model_Interface {
    ArrayList<Entity_Obat> data_obat = new ArrayList<>();

    public ArrayList<Entity_Obat> getDataObat() {
        return data_obat;
    }
    
    @Override
    public void create(Object x) {
        data_obat.add((Entity_Obat) x);
    }
    
    @Override
    public void view() {
        
    }
    
    @Override
    public void update(int index, Object x) {
        data_obat.set(index, (Entity_Obat) x);
    }
    
    @Override
    public void delete(int index) {
        data_obat.remove(index);
    }
}

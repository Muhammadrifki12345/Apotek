package Model;
import java.util.ArrayList;
import Entity.Entity_Pelanggan;

public class Model_Pelanggan implements Model_Interface {
    public ArrayList<Entity_Pelanggan> data_pelanggan = new ArrayList<>();

    public ArrayList<Entity_Pelanggan> getData_pelanggan() {
        return data_pelanggan;
    }
    
    @Override
    public void create(Object x) {
        data_pelanggan.add((Entity_Pelanggan) x);
    }
    
    @Override
    public void view() {
        
    }
    
    @Override
    public void update(int index, Object x) {
        data_pelanggan.set(index, (Entity_Pelanggan) x);
    }
    
    @Override
    public void delete(int index) {
        data_pelanggan.remove(index);
    }
}

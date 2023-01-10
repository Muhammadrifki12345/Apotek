package Model;
import java.util.ArrayList;
import Entity.Entity_Pegawai;

public class Model_Pegawai implements Model_Interface {
    public ArrayList<Entity_Pegawai> data_pegawai = new ArrayList<>();
    
    public ArrayList<Entity_Pegawai> getDataPegawai() {
        return data_pegawai;
    }
    
    @Override
    public void create(Object x) {
        data_pegawai.add((Entity_Pegawai) x);
    }
    
    @Override
    public void view() {
        
    }
    
    @Override
    public void update(int index, Object x) {
        data_pegawai.set(index, (Entity_Pegawai) x);
    }
    
    @Override
    public void delete(int index) {
        data_pegawai.remove(index);
    }
}

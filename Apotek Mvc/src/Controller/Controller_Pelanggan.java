package Controller;
import java.util.ArrayList;
import Entity.Entity_Pelanggan;
import Model.Model_Pelanggan;

public class Controller_Pelanggan {
    public Model_Pelanggan m_pelanggan = new Model_Pelanggan();
    
    public Controller_Pelanggan() {
        
    }
    
    public ArrayList<Entity_Pelanggan> view() {
        return m_pelanggan.getData_pelanggan();
    }
    
    public void create(Entity_Pelanggan pelanggan) {
        m_pelanggan.create(pelanggan);
    }
    
    public void update(int index, Entity_Pelanggan pelanggan) {
        m_pelanggan.update(index, pelanggan);
    }
    
    public void delete(int index) {
        m_pelanggan.delete(index);
    }
    
    public int cek_pelanggan(String no_id){
        int keterangan = -1;
        if(m_pelanggan.getData_pelanggan().size() > 0) {
            for(int i = 0; i < m_pelanggan.getData_pelanggan().size(); i++){
             if(no_id.equals(m_pelanggan.getData_pelanggan().get(i).getNo_id())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
}

package Controller;
import java.util.ArrayList;
import Entity.Entity_Pegawai;
import Model.Model_Pegawai;

public class Controller_Pegawai {
    public Model_Pegawai m_pegawai = new Model_Pegawai();
    
    public Controller_Pegawai() {
        
    }
    
    public ArrayList<Entity_Pegawai> view(){
        return m_pegawai.getDataPegawai();
        }
  
    public void create(Entity_Pegawai pegawai){
        m_pegawai.create(pegawai);
    }

    public void update(int index, Entity_Pegawai pegawai){
        m_pegawai.update(index, pegawai);
    }

    public void delete(int index){
        m_pegawai.delete(index);
    }
}

package Controller;
import java.util.ArrayList;
import Entity.Entity_Obat;
import Model.Model_Obat;

public class Controller_Obat {
    public Model_Obat m_obat = new Model_Obat();
    
    public Controller_Obat() {
        
    }
    
    public ArrayList<Entity_Obat> view() {
        return m_obat.getDataObat();
    }
    
    public void create(Entity_Obat obat) {
        m_obat.create(obat);
    }
    
    public void update(int index, Entity_Obat obat) {
        m_obat.update(index, obat);
    }
    
    public void delete(int index) {
        m_obat.delete(index);
    }
    
    public int cek_obat(int kode) {
        int keterangan = -1;
        if(m_obat.getDataObat().size() > 0) {
            for(int i = 0; i < m_obat.getDataObat().size(); i++) {
                if(kode == m_obat.getDataObat().get(i).getKode()) {
                    keterangan = i;
                    break;
                } else {
                    keterangan = -1;
                }
            }
        }
        return keterangan;
    }
    
    
}

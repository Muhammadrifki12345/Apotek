package Controller;
import java.util.ArrayList;
import Entity.Entity_Pemesanan;
import Model.Model_Pemesanan;

public class Controller_Pemesanan {
    public Model_Pemesanan m_pemesanan = new Model_Pemesanan();
    
    public Controller_Pemesanan() {
        
    }
    
    public ArrayList<Entity_Pemesanan> view() {
        return m_pemesanan.getDataPemesanan();
    }
    
    public void create(Entity_Pemesanan pemesanan) {
        m_pemesanan.create(pemesanan);
    }
}

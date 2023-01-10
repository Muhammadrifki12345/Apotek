package Model;
import java.util.ArrayList;
import Entity.Entity_Pemesanan;

public class Model_Pemesanan {
    public ArrayList<Entity_Pemesanan> data_pemesanan = new ArrayList<>();

    public ArrayList<Entity_Pemesanan> getDataPemesanan() {
        return data_pemesanan;
    }
    
    public void create(Object x) {
        data_pemesanan.add((Entity_Pemesanan) x);
    }
}

package Entity;

public class Entity_Pelanggan {
    private String no_id, nama;
    
    public Entity_Pelanggan(String no_id, String nama) {
        this.no_id = no_id;
        this.nama = nama;
    }

    public void setNo_id(String no_id) {
        this.no_id = no_id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_id() {
        return no_id;
    }

    public String getNama() {
        return nama;
    }
}

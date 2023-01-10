package Entity;

public class Entity_Pegawai {
    private String no_id, nama, password;
    
    public Entity_Pegawai(String no_id, String nama, String password) {
        this.no_id = no_id;
        this.nama = nama;
        this.password = password;
    }

    public void setNo_id(String no_id) {
        this.no_id = no_id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNo_id() {
        return no_id;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }
}

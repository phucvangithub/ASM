package dev.zero.asm;

public class CarModel {
    private String _id;
    private String ten;
    private int namSX;
    private String hang;
    private Double gia;

    public CarModel(String _id, String ten, int namSX, String hang, Double gia) {
        this._id = _id;
        this.ten = ten;
        this.namSX = namSX;
        this.hang = hang;
        this.gia = gia;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }
}

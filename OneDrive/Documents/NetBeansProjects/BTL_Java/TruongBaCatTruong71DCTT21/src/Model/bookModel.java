package Model;

public class bookModel {
    String id, tensach, theloai, namxuatban, ngaynhap, giatien;

    public bookModel() {
    }

    public bookModel(String tensach, String theloai, String namxuatban, String ngaynhap, String giatien) {
        this.tensach = tensach;
        this.theloai = theloai;
        this.namxuatban = namxuatban;
        this.ngaynhap = ngaynhap;
        this.giatien = giatien;
    }

    public bookModel(String id, String tensach, String theloai, String namxuatban, String ngaynhap, String giatien) {
        this.id = id;
        this.tensach = tensach;
        this.theloai = theloai;
        this.namxuatban = namxuatban;
        this.ngaynhap = ngaynhap;
        this.giatien = giatien;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(String namxuatban) {
        this.namxuatban = namxuatban;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    
    
}

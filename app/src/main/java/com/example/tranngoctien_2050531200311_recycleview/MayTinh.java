package com.example.tranngoctien_2050531200311_recycleview;

public class MayTinh {
    private int idImage;
    private String tenMay;

    public MayTinh(int idImage, String tenMay) {
        this.idImage = idImage;
        this.tenMay = tenMay;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }
}

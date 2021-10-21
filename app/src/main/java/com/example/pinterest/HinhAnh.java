package com.example.pinterest;

public class HinhAnh {
    String URLHinh,Ten;

    public HinhAnh(String URLHinh, String ten) {
        this.URLHinh = URLHinh;
        Ten = ten;
    }
    public HinhAnh(){

    }
    public String getURLHinh() {
        return URLHinh;
    }

    public void setURLHinh(String URLHinh) {
        this.URLHinh = URLHinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }
}

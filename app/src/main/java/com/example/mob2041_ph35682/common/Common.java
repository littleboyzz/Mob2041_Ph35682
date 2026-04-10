package com.example.mob2041_ph35682.common;

public class Common {
    private static GioHang gioHang;
    public static String maNhanVien;

    public static GioHang getGioHang() {
        if (gioHang == null) gioHang = new GioHang();
        return gioHang;
    }
}

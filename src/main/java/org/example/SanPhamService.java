package org.example;
import org.example.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
     List<SanPham> danhSachSanPham = new ArrayList<>();

    public void themSanPham(SanPham sp) {
        if(!danhSachSanPham.isEmpty()){
            for(SanPham sanPham : danhSachSanPham){
                if (sanPham.getMa().equalsIgnoreCase(sp.getMa())){
                    throw new IllegalArgumentException();
                }
            }
        }
        danhSachSanPham.add(sp);
    }

    public boolean xoaSanPham(String ma) {
        if(danhSachSanPham.isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        if (ma == null || ma.isBlank()) {
            throw new IllegalArgumentException();
        }
        for (SanPham sp : danhSachSanPham) {
            if (sp.getMa().equals(ma)) {
                danhSachSanPham.remove(sp);
                return true;
            }
        }
        return false;
    }

    public List<SanPham> getAll() {
        return danhSachSanPham;
    }
}


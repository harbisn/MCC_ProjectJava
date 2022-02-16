/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Firli
 */
class Laptop {
    private String merek;
    private int tahunProduksi;
    private float harga;

    public Laptop(String merek, int tahunProduksi, float harga) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Laptop{"+"merek="+merek+",tahunProduksi="+tahunProduksi+",harga="+harga+"juta}";
    }

    public String getMerek() {
        return merek;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public float getHarga() {
        return harga;
    }
    
    
}
class LaptopDTO {
    private String merek;
    private float harga;

    public LaptopDTO(String merek, float harga) {
        this.merek = merek;
      
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Laptop{"+"merek="+merek+",harga="+harga+"juta}";
    }

    public String getMerek() {
        return merek;
    }

    public float getHarga() {
        return harga;
    }
}




public class Stream_Map {
    
    public static void main(String[] args) {
        
        List<Laptop> dataList = new ArrayList<Laptop>();
//        memasukan data
        dataList.add(new Laptop("Asus", 2019, 4.5f));
        dataList.add(new Laptop("Lenovo", 2020, 6.5f));
        dataList.add(new Laptop("Apple", 2021, 10.5f));
        
//        System.out.println(dataList);
        
//        versi umum pemindahan data menggunakan map
//        List<LaptopDTO> dataListDTO = new ArrayList<LaptopDTO>();
//        for(Laptop data:dataList){
//            dataListDTO.add(new LaptopDTO(data.getMerek(), data.getHarga()));
//        }
//        System.out.println(dataListDTO);
        
//        menggunakan Stream
        List<LaptopDTO> listData = 
                dataList.stream().map((Laptop laptop) -> new LaptopDTO(laptop.getMerek(), laptop.getHarga())).collect(Collectors.toList());
        
        System.out.println(listData);
      
      
     
     
    }
    
}


package inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        BangunDatar bangunDatar = new BangunDatar();
        
        Persegi persegi = new Persegi();
        System.out.print("Masukan Sisi Persegi: ");
        persegi.sisi = input.nextInt();
        
        Lingkaran lingkaran = new Lingkaran();
        System.out.print("Masukkan Jari Jari Lingkaran: ");
        lingkaran.r = input.nextInt();
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.print("Masukkan Panjang persegi panjang: ");
        persegiPanjang.panjang = input.nextInt();
        System.out.print("Masukkan Lebar Persegi Panjang: ");
        persegiPanjang.lebar = input.nextInt();
        
        Segitiga mSegitiga = new Segitiga();
        System.out.print("Masukkan Alas Segitiga: ");
        mSegitiga.alas = input.nextInt();
        System.out.print("Masukkan Tinggi Segitiga: ");
        mSegitiga.tinggi = input.nextInt();
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
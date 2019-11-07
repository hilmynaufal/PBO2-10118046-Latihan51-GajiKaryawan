/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program :
 */
public class PBO210118046Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager manager = new Manager();
        System.out.println("===Program Perhitungan Gaji Karyawan====");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nim: "); manager.setNik(scanner.next());
        System.out.print("Masukkan Nama: "); manager.setNama(scanner.next());
        System.out.print("Masukkan Golongan (1/2/3): "); manager.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan: "); manager.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran: "); manager.setKehadiran(scanner.nextInt());
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK\t: " + manager.getNik());
        System.out.println("NAMA\t: " + manager.getNama());
        System.out.println("GOLONGAN: " + manager.getGolongan());
        System.out.println("JABATAN\t: " + manager.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN\t: " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: " + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t: " + manager.gajiTotal());
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan51.gajikaryawan;

/**
 *
 * @author ASUS
 */
public class Manager extends Karyawan{
    protected int kehadiran;
    protected float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan) {
        jabatan = jabatan.toLowerCase();
        switch (jabatan) {
            case "manager":
                tunjanganJabatan = 2000000;
                break;
            case "kabag":
                tunjanganJabatan = 1000000;
                break;
            default:
                tunjanganJabatan = 0;
                break;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan) {
        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                break;
            case 2:
                tunjanganGolongan = 1000000;
                break;
            case 3:
                tunjanganGolongan = 1500000;
                break;
            default:
                tunjanganGolongan = 0;
                break;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal() {
        return tunjanganGolongan+tunjanganJabatan+tunjanganKehadiran;
    }
    
}

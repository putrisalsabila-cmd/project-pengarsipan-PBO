/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pengarsipan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class suratKeluar { 
    private String noSurat; 
    private String tanggal; 
    private String tujuan;
    private String perihal;
    
    private ArrayList<String> dataNoSurat; 
    private ArrayList<String> dataTanggal;
    private ArrayList<String> dataTujuan;
    private ArrayList<String> dataPerihal;
    
    public suratKeluar() { 
        dataNoSurat = new ArrayList<>(); 
        dataTanggal = new ArrayList<>();
        dataTujuan = new ArrayList<>();
        dataPerihal = new ArrayList<>();
    }
    
    public suratKeluar(String noSurat, String tanggal, 
        String tujuan, String perihal){
        this.noSurat = noSurat;
        this.tanggal = tanggal;
        this.tujuan = tujuan;
        this.perihal = perihal;
}
    
public int getIndexData(String data){
    int index = -1;
    index = this.dataNoSurat.indexOf(data);

    if(index < 0){
        JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
    } else {
        System.out.println(index);
    }

    return index;
}

public void cariDataSuratKeluar(String noSurat){
    int i = getIndexData(noSurat);

    String tanggal = this.dataTanggal.get(i);
    String tujuan = this.dataTujuan.get(i);
    String perihal = this.dataPerihal.get(i);

    String isi = "No Surat : " + noSurat +
                 "\nTanggal : " + tanggal +
                 "\nTujuan : " + tujuan +
                 "\nPerihal : " + perihal;

    JOptionPane.showMessageDialog(null, isi);
}

public void updateData(int index, String noSurat,
        String tanggal, String pengirim,
        String perihal){

    dataNoSurat.set(index, noSurat);
    dataTanggal.set(index, tanggal);
    dataTujuan.set(index, pengirim);
    dataPerihal.set(index, perihal);

}

public void hapusData(int index){

    dataNoSurat.remove(index);
    dataTanggal.remove(index);
    dataTujuan.remove(index);
    dataPerihal.remove(index);

}

public boolean cekNoSurat(String noSurat){

    return dataNoSurat.contains(noSurat);

}

    public void inputNoSurat(String noSurat) {
        this.dataNoSurat.add(noSurat);
    }
    
    public void inputTanggal(String tanggal) {
        this.dataTanggal.add(tanggal);
    }    
    
    public void inputTujuan(String tujuan) {
        this.dataTujuan.add(tujuan);
    }
    
    public void inputPerihal(String perihal) {
        this.dataPerihal.add(perihal);
    }


    public ArrayList<String> arrayNoSurat(){ 
        return this.dataNoSurat;
    }
    public ArrayList<String> arrayTanggal(){
        return this.dataTanggal;
    }
    public ArrayList<String> arrayTujuan(){
        return this.dataTujuan;
    }
    public ArrayList<String> arrayPerihal(){
        return this.dataPerihal;
    }

public void setNoSurat(String noSurat) { 
    this.noSurat = noSurat;
        try {
            if (noSurat.equals(null)) {
                JOptionPane.showMessageDialog(null, "nomor surat belum diisi");
            }else {
                this.noSurat = noSurat;
            }
        } catch (Exception e) {    
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}

public void setTanggal(String tanggal) {
    this.tanggal = tanggal;
        try {
            if (tanggal.equals(null)) {
                JOptionPane.showMessageDialog(null, "tanggal belum diisi");
            }else {
                this.tanggal = tanggal;
            }
        } catch (Exception e) {    
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}

public void setTujuan(String tujuan) {
    this.tujuan = tujuan;
        try {
            if (tujuan.equals(null)) {
                JOptionPane.showMessageDialog(null, "tujuan belum diisi");
            }else {
                this.tujuan = tujuan;
            }
        } catch (Exception e) {    
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}

public void setPerihal(String perihal) {
    this.perihal = perihal;
        try {
            if (perihal.equals(null)) {
                JOptionPane.showMessageDialog(null, "perihal belum diisi");
            }else {
                this.perihal = perihal;
            }
        } catch (Exception e) {    
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}

public String getNoSurat(){ 
        return this.noSurat;
    }
    public String getTanggal(){
        return this.tanggal;
    }
    public String getTujuan(){
        return this.tujuan;
    }
    public String getPerihal(){
        return this.perihal;
    }

}


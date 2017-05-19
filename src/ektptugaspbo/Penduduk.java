/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ektptugaspbo;

/**
 *
 * @author Publisher
 */

public class Penduduk {
     private String jeneng, agomo, kelamin, pengawean, getih, deso, RT, panggenlahir, tanggalLahir, negoroAsal;
    public Penduduk(){
    }
    public Penduduk(String jeneng, String agomo, String kelamin, String pengawean, String getih, String deso, String RT, String panggenlahir, String tanggalLahir, String negoroAsal) {
        this.jeneng = jeneng;
        this.agomo = agomo;
        this.kelamin = kelamin;
        this.pengawean = pengawean;
        this.getih = getih;
        this.deso = deso;
        this.RT = RT;
        this.panggenlahir = panggenlahir;
        this.tanggalLahir = tanggalLahir;
        this.negoroAsal = negoroAsal;
    }

    public String getNama() {
        return jeneng;
    }

    public void setNama(String nama) {
        this.jeneng = nama;
    }

    public String getAgama() {
        return agomo;
    }

    public void setAgama(String agama) {
        this.agomo = agama;
    }

    public String getJenisKelamin() {
        return kelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.kelamin = jenisKelamin;
    }

    public String getPekerjaan() {
        return pengawean;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pengawean = pekerjaan;
    }

    public String getGetih() {
        return getih;
    }

    public void setGetih(String getih) {
        this.getih = getih;
    }

    public String getKelurahan() {
        return deso;
    }

    public void setKelurahan(String kelurahan) {
        this.deso = kelurahan;
    }

    public String getRT() {
        return RT;
    }

    public void setRT(String RT) {
        this.RT = RT;
    }

    public String getTempatLahir() {
        return panggenlahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.panggenlahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getKewarganegaraan() {
        return negoroAsal;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.negoroAsal = kewarganegaraan;
    }
}

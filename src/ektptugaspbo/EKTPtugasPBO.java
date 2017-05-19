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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jdk.nashorn.internal.objects.NativeArray;

public class EKTPtugasPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Penduduk ppl = new Penduduk();

        HashMap<String, ArrayList> Sukorame = new HashMap<String, ArrayList>();
        
//RT 1     DESA SUKORAME        
        ArrayList<String> RT1 = new ArrayList<String>();
        ppl.setNama("Jainudin");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Ojek");
        ppl.setGetih("RA");
        ppl.setKelurahan("Sukorame");
        ppl.setRT("RT 1");
        ppl.setTempatLahir("Ngasin");
        ppl.setTanggalLahir("20-06-1984");
        ppl.setKewarganegaraan("Indonesia");
        RT1.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");

        ppl.setNama("Bagus Pria Sae");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Berimajinasi");
        ppl.setGetih("ZZ");
        ppl.setKelurahan("Sukorame");
        ppl.setRT("RT 1");
        ppl.setTempatLahir("Ngadipuro");
        ppl.setTanggalLahir("30-01-1990");
        ppl.setKewarganegaraan("Indonesia");
        RT1.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");

        ppl.setNama("Tresno Tekane Pati");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Ojek");
        ppl.setGetih("AC");
        ppl.setKelurahan("Sukorame");
        ppl.setRT("RT 1");
        ppl.setTempatLahir("Kayangan 11");
        ppl.setTanggalLahir("24-06-1885");
        ppl.setKewarganegaraan("Indonesia");
        RT1.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");

        ppl.setNama("Mugiwara");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Dagang Sayur");
        ppl.setGetih("O");
        ppl.setKelurahan("Sukorame");
        ppl.setRT("RT 1");
        ppl.setTempatLahir("Gunung Lor");
        ppl.setTanggalLahir("06-09-1984");
        ppl.setKewarganegaraan("Indonesia");
        RT1.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
        Sukorame.put(ppl.getNama(), RT1);

        for (Iterator<String> iterator = RT1.iterator(); iterator.hasNext();) {
            String next = iterator.toString();
            System.out.println(iterator.next());
        }

    }

}

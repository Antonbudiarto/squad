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
        System.out.println("Data RT 1 Desa Sukorame");
        for (Iterator<String> iterator = RT1.iterator(); iterator.hasNext();) {
            String next = iterator.toString();
            System.out.println(iterator.next());
        }
            ArrayList<String> RT2 = new ArrayList<String>();
            ppl.setNama("Sri Kandi");
            ppl.setAgama("Budha");
            ppl.setJenisKelamin("Perempuan");
            ppl.setPekerjaan("Jaga Apotek");
            ppl.setGetih("O");
            ppl.setKelurahan("Sukorame");
            ppl.setRT("RT 2");
            ppl.setTempatLahir("Gua Hantu");
            ppl.setTanggalLahir("06-09-1989");
            ppl.setKewarganegaraan("Indonesia");
            RT2.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");

            ppl.setNama("Bol Kadut");
            ppl.setAgama("Kong Wuchu");
            ppl.setJenisKelamin("Perempuan");
            ppl.setPekerjaan("Sopir");
            ppl.setGetih("RZ");
            ppl.setKelurahan("Sukorame");
            ppl.setRT("RT 2");
            ppl.setTempatLahir("Gunung Timur");
            ppl.setTanggalLahir("09-09-1998");
            ppl.setKewarganegaraan("Indonesia");
            RT2.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");

            ppl.setNama("Saras 088");
            ppl.setAgama("Hindu");
            ppl.setJenisKelamin("Perempuan");
            ppl.setPekerjaan("Pahlawan");
            ppl.setGetih("PO");
            ppl.setKelurahan("Sukorame");
            ppl.setRT("RT 2");
            ppl.setTempatLahir("Totlanta");
            ppl.setTanggalLahir("19-09-1976");
            ppl.setKewarganegaraan("Indonesia");
            RT2.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");

            ppl.setNama("Polowijo");
            ppl.setAgama("Kristen");
            ppl.setJenisKelamin("Laki - laki");
            ppl.setPekerjaan("Tukang Cukur");
            ppl.setGetih("RZ");
            ppl.setKelurahan("Sukorame");
            ppl.setRT("RT 2");
            ppl.setTempatLahir("Red Line");
            ppl.setTanggalLahir("09-12-1986");
            ppl.setKewarganegaraan("Indonesia");
            RT2.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
            Sukorame.put(ppl.getNama(), RT2);
 System.out.println("Data RT 2 Desa Sukorame");
            for (Iterator<String> ampunBos = RT2.iterator(); ampunBos.hasNext();) {
                String next = ampunBos.toString();
                System.out.println(ampunBos.next());
            }
        }
    }

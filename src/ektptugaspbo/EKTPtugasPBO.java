
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

        HashMap<String, ArrayList> Sukorame = new HashMap<>();

//RT 1     DESA SUKORAME        
        ArrayList<String> RT1 = new ArrayList<>();
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
        System.out.println("\nData RT 1 Desa Sukorame");
        for (Iterator<String> iterator = RT1.iterator(); iterator.hasNext();) {
            String next = iterator.toString();
            System.out.println(iterator.next());
        }
        ArrayList<String> RT2 = new ArrayList<>();
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
        System.out.println("\nData RT 2 Desa Sukorame");
        for (Iterator<String> ampunBos = RT2.iterator(); ampunBos.hasNext();) {
            String next = ampunBos.toString();
            System.out.println(ampunBos.next());
        }

        ArrayList<String> RT3 = new ArrayList<>();
        ppl.setNama("Musuh");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Minum Alkohol");
        ppl.setGetih("AB");
        ppl.setKelurahan("Sukorame");
        ppl.setRT("RT 3");
        ppl.setTempatLahir("Kasur");
        ppl.setTanggalLahir("01-10-1984");
        ppl.setKewarganegaraan("Indonesia");
        RT3.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
        Sukorame.put(ppl.getNama(), RT3);

        ppl.setNama("Teman");
        ppl.setAgama("Kristen");
        ppl.setJenisKelamin("Perempuan");
        ppl.setPekerjaan("Pemakan Soto");
        ppl.setGetih("A");
        ppl.setKelurahan("Sukorame");
        ppl.setRT("RT 3");
        ppl.setTempatLahir("Rumah Sakit");
        ppl.setTanggalLahir("22-11-1990");
        ppl.setKewarganegaraan("Indonesia");
        RT3.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
        Sukorame.put(ppl.getNama(), RT3);

        ppl.setNama("Supono");
        ppl.setAgama("Budha");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Peminum Coklat");
        ppl.setGetih("B");
        ppl.setKelurahan("Sukorame");
        ppl.setRT("RT 3");
        ppl.setTempatLahir("Meja");
        ppl.setTanggalLahir("23-03-1991");
        ppl.setKewarganegaraan("Indonesia");
        RT3.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
        Sukorame.put(ppl.getNama(), RT3);

        ppl.setNama("Mugiman");
        ppl.setAgama("Hindu");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Pemakan Segala");
        ppl.setGetih("O");
        ppl.setKelurahan("Sukorame");
        ppl.setRT("RT 3");
        ppl.setTempatLahir("Botol");
        ppl.setTanggalLahir("11-02-1992");
        ppl.setKewarganegaraan("Indonesia");
        RT3.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
        Sukorame.put(ppl.getNama(), RT3);
        System.out.println("\nData RT 3 Desa Sukorame");
        for (Iterator<String> ampunBos = RT3.iterator(); ampunBos.hasNext();) {
            String next = ampunBos.toString();
            System.out.println(ampunBos.next());
        }

        ArrayList<String> RT4 = new ArrayList<>();
        ppl.setNama("Supini");
        ppl.setAgama("Kong Hucu");
        ppl.setJenisKelamin("Perempuan");
        ppl.setPekerjaan("Penghitung Uang");
        ppl.setGetih("B");
        ppl.setKelurahan("Sukorame");
        ppl.setRT("RT 4");
        ppl.setTempatLahir("Tas");
        ppl.setTanggalLahir("01-10-1984");
        ppl.setKewarganegaraan("Indonesia");
        RT4.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
        Sukorame.put(ppl.getNama(), RT4);

        ppl.setNama("Su Tris");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Penidur");
        ppl.setGetih("AB");
        ppl.setKelurahan("Sukorame");
        ppl.setRT("RT 4");
        ppl.setTempatLahir("Kardus");
        ppl.setTanggalLahir("24-07-1990");
        ppl.setKewarganegaraan("Indonesia");
        RT4.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
        Sukorame.put(ppl.getNama(), RT4);

        ppl.setNama("Penjahat");
        ppl.setAgama("Kristen");
        ppl.setJenisKelamin("Perempuan");
        ppl.setPekerjaan("Pendoa");
        ppl.setGetih("AB");
        ppl.setKelurahan("Sukorame");
        ppl.setRT("RT 4");
        ppl.setTempatLahir("Closet");
        ppl.setTanggalLahir("03-07-1989");
        ppl.setKewarganegaraan("Indonesia");
        RT4.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
        Sukorame.put(ppl.getNama(), RT4);

        ppl.setNama("Penolong");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Melamun");
        ppl.setGetih("O");
        ppl.setKelurahan("Sukorame");
        ppl.setRT("RT 4");
        ppl.setTempatLahir("Gelas");
        ppl.setTanggalLahir("22-04-1988");
        ppl.setKewarganegaraan("Indonesia");
        RT4.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
        Sukorame.put(ppl.getNama(), RT4);
        System.out.println("\nData RT 4 Desa Sukorame");
        for (Iterator<String> ampunBos = RT4.iterator(); ampunBos.hasNext();) {
            String next = ampunBos.toString();
            System.out.println(ampunBos.next());
        }
        
        HashMap<String, ArrayList> Bandulan = new HashMap<>();
        ArrayList<String> rt01 = new ArrayList<>();
		//1
	ppl.setNama("Michael ervan");
        ppl.setAgama("Khatolik");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Pedagang gorengan");
        ppl.setGetih("AB");
        ppl.setKelurahan("Bandulan");
        ppl.setRT("RT 01");
        ppl.setTempatLahir("Ngasem");
        ppl.setTanggalLahir("02-01-1979");
        ppl.setKewarganegaraan("Indonesia");
        rt01.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
		
		//2
	ppl.setNama("Akbar Taufik");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Tani");
        ppl.setGetih("O");
        ppl.setKelurahan("Bandulan");
        ppl.setRT("RT 01");
        ppl.setTempatLahir("Ngasem");
        ppl.setTanggalLahir("12-08-1969");
        ppl.setKewarganegaraan("Indonesia");
        rt01.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
		
		//3
	ppl.setNama("Cila Ambarwati");
        ppl.setAgama("Kristen");
        ppl.setJenisKelamin("Perempuan");
        ppl.setPekerjaan("Pembantu rumah tangga");
        ppl.setGetih("A");
        ppl.setKelurahan("Bandulan");
        ppl.setRT("RT 01");
        ppl.setTempatLahir("Ngasem");
        ppl.setTanggalLahir("16-11-1975");
        ppl.setKewarganegaraan("Indonesia");
        rt01.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
		
		//4
	ppl.setNama("Michael ervan");
        ppl.setAgama("Khatolik");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Pedagang gorengan");
        ppl.setGetih("AB");
        ppl.setKelurahan("Bandulan");
        ppl.setRT("RT 01");
        ppl.setTempatLahir("Ngasem");
        ppl.setTanggalLahir("02-01-1979");
        ppl.setKewarganegaraan("Indonesia");
        rt01.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
		System.out.println("\nData RT 1 Desa Bandulan");
        for (Iterator<String> gt = rt01.iterator(); gt.hasNext();) {
            String next = gt.toString();
            System.out.println(gt.next());
        }
        
        ArrayList<String> rt02 = new ArrayList<>();
		//1
	ppl.setNama("Muhammad Fauzi");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Gali kubur");
        ppl.setGetih("O");
        ppl.setKelurahan("Bandulan");
        ppl.setRT("RT 02");
        ppl.setTempatLahir("Ngasem");
        ppl.setTanggalLahir("10-02-1981");
        ppl.setKewarganegaraan("Indonesia");
        rt02.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
		
		//2
	ppl.setNama("Tukinem");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Perempuan");
        ppl.setPekerjaan("Guru SD");
        ppl.setGetih("AB");
        ppl.setKelurahan("Bandulan");
        ppl.setRT("RT 02");
        ppl.setTempatLahir("Ngajum");
        ppl.setTanggalLahir("17-08-1986");
        ppl.setKewarganegaraan("Indonesia");
        rt02.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
		
		//3
	ppl.setNama("Siti Khotidjah");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Perempuan");
        ppl.setPekerjaan("Pelajar");
        ppl.setGetih("B");
        ppl.setKelurahan("Bandulan");
        ppl.setRT("RT 02");
        ppl.setTempatLahir("Ngasem");
        ppl.setTanggalLahir("19-05-1996");
        ppl.setKewarganegaraan("Indonesia");
        rt02.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
		
		//4
	ppl.setNama("I Nyoman Made Wirawan");
        ppl.setAgama("Hindu");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Pembalap");
        ppl.setGetih("A");
        ppl.setKelurahan("Bandulan");
        ppl.setRT("RT 02");
        ppl.setTempatLahir("Ngasem");
        ppl.setTanggalLahir("29-10-1979");
        ppl.setKewarganegaraan("Indonesia");
        rt02.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
		System.out.println("\nData RT 2 Desa Bandulan");
        for (Iterator<String> gw = rt02.iterator(); gw.hasNext();) {
            String next = gw.toString();
            System.out.println(gw.next());
        }
        ArrayList<String> rt03 = new ArrayList<String>();
        ppl.setNama("Udin");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Ngamen");
        ppl.setGetih("O");
        ppl.setKelurahan("Bandulan");
        ppl.setRT("RT 03");
        ppl.setTempatLahir("Tlogomas");
        ppl.setTanggalLahir("08-06-1974");
        ppl.setKewarganegaraan("Indonesia");
        rt03.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");

        ppl.setNama("Hanami");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Perempuan");
        ppl.setPekerjaan("Berjalan");
        ppl.setGetih("X");
        ppl.setKelurahan("Bandulan");
        ppl.setRT("RT 03");
        ppl.setTempatLahir("Nganjuk");
        ppl.setTanggalLahir("03-01-1909");
        ppl.setKewarganegaraan("Indonesia");
        rt03.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");

        ppl.setNama("Tresno Karo Kowe");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Assisten");
        ppl.setGetih("A");
        ppl.setKelurahan("Bandulan");
        ppl.setRT("RT 03");
        ppl.setTempatLahir("Doli");
        ppl.setTanggalLahir("20-01-1885");
        ppl.setKewarganegaraan("Indonesia");
        rt03.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");

        ppl.setNama("Luffy");
        ppl.setAgama("Islam");
        ppl.setJenisKelamin("Laki-laki");
        ppl.setPekerjaan("Dagang Ban");
        ppl.setGetih("O");
        ppl.setKelurahan("Bandulan");
        ppl.setRT("RT 03");
        ppl.setTempatLahir("Gunung Kidul");
        ppl.setTanggalLahir("15-02-1884");
        ppl.setKewarganegaraan("Indonesia");
        rt03.add("" + ppl.getNama() + " " + ppl.getAgama() + " " + ppl.getJenisKelamin() + " " + ppl.getPekerjaan() + " " + ppl.getGetih() + " " + ppl.getKelurahan() + " " + ppl.getRT() + " " + ppl.getTempatLahir() + " " + ppl.getTanggalLahir() + " " + ppl.getKewarganegaraan() + "");
        Bandulan.put(ppl.getNama(), rt03);
        System.out.println();
	System.out.println("Data RT 03 Desa Bandulan");
        for (Iterator<String> ite = rt03.iterator(); ite.hasNext();) {
            String next = ite.toString();
            System.out.println(ite.next());
        }

    }
}

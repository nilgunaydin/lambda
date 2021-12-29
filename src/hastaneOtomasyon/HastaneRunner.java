package hastaneOtomasyon;

import java.util.*;

public class HastaneRunner {
    private static Hastane hastane = new Hastane();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String hastaDurumu;
        String unvan;

        System.out.println("Acile Hosgeldiniz Hastalik Durumunuzu seciniz");
        Durum durum1 = new Durum();
        durum1.setAktuelDurum(scan.nextLine());
        

    }

    public static String doktorUnvan(String aktuelDurum) {
        if (aktuelDurum.equalsIgnoreCase("Allerji")) {
            return hastane.unvanlar[0];
        }
        if (aktuelDurum.equalsIgnoreCase("Bas Agrisi")) {
            return hastane.unvanlar[1];
        }
        if (aktuelDurum.equalsIgnoreCase("Diabet")) {
            return hastane.unvanlar[2];
        }
        if (aktuelDurum.equalsIgnoreCase("Soguk Alginligi")) {
            return hastane.unvanlar[3];
        }
        if (aktuelDurum.equalsIgnoreCase("Migren")) {
            return hastane.unvanlar[4];
        }
        if (aktuelDurum.equalsIgnoreCase("Kalp Hastaliklari")) {
            return hastane.unvanlar[5];
        }

        return "aradiginiz alanda hizmet vermiyoruz";
    }

    public static Doktor doktorBul(String unvan) {
        Doktor doktor1 = new Doktor();

        for (int i = 0; i < hastane.unvanlar.length; i++) {
            if (unvan.equals(hastane.unvanlar[i])) {
                doktor1.setIsim(hastane.doctorIsimleri[i]);
                doktor1.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor1.setUnvan(unvan);
            }
        }


   return doktor1;
    }}

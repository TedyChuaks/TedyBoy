package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Buaya;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Kuda;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Kuda> initDataKuda(Context ctx) {
        List<Kuda> kudas = new ArrayList<>();
        kudas.add(new Kuda("Shire", "Britain",
                "Kuda ini dikenal sebagai kuda penarik", R.drawable.kuda_shire));
        kudas.add(new Kuda("Iceland", "Amerika Utara ",
                "The Kuda Iceland adalah baka kuda yang dikembangkan di Iceland. Walaupun kuda kecil, kadang-kadang berukuran kuda, kebanyakan pendaftar untuk Iceland menyebutnya sebagai kuda", R.drawable.kuda_islandia));
        kudas.add(new Kuda("Friesian", "Belanda",
                "Kuda ini berasal dari friesland di dalam belanda ", R.drawable.kuda_ferisian));

        return kudas;
    }

    private static List<Buaya>initDataBuaya(Context ctx) {
        List<Buaya> buayas = new ArrayList<>();
        buayas.add(new Buaya("Buaya Nil", "Afrika",
                "Buaya nil termasuk jenis buaya yang paling berbahaya di dunia. Ia dapat ditemukan di danau, perairan air tawar atau air payau. Ukuran tubuh buaya nil juga terbilang besar, bisa mencapai 5-6 meter", R.drawable.nil));
        buayas.add(new Buaya("Buaya air asin", "India Timur",
                "Buaya dengan nama latin Crocodylus porosus ini tak hanya ganas memangsa tapi juga menjadi salah satu hewan reptil terbesar di dunia. Panjang buaya air asin bisa mencapai 6,5 - 7 meter dengan berat hingga 1.000 kg lebih", R.drawable.air_asin));
        buayas.add(new Buaya("Buaya Alligator Amerika", "Amerika Serikat",
                "Meski terbilang berbahaya, kebanyakan alligator tumbuh dengan ukuran yang lebih kecil dari buaya pada umumnya, yakni sekitar 4-4,5 meter", R.drawable.aligator));
        return buayas;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataKuda(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

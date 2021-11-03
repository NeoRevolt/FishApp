package com.example.fishapp1;

import com.example.fishapp1.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class DataSeluruhIkan {
    public DataSeluruhIkan() {
    }


    //TODO
    public List<ItemModel> listDataIkan() {
        List<ItemModel> listModel = new ArrayList<>();
        listModel.addAll(lisDataIkanSmallFish());
        listModel.addAll(lisDataIkanGoldFish());
        listModel.addAll(listDataIkanCatfish());
        listModel.addAll(listDataIkanCichlid());
        listModel.addAll(listDataIkanTeritorial());
        listModel.addAll(listDataIkanPredator());
        return listModel;
    }

    public List<ItemModel> listDataIkanCatfish() {
        List<ItemModel> listModel = new ArrayList<>();
        listModel.add(new ItemModel(R.drawable.tigersho, "Ikan Lele Tiger Shovelnose", R.string.desk_tigercatfish));
        listModel.add(new ItemModel(R.drawable.redtailsatu, "Ikan Lele Red Tail", R.string.desk_rtc));
        listModel.add(new ItemModel(R.drawable.sapusapu, "Ikan Sapu-Sapu", R.string.desk_sapusapu));
        listModel.add(new ItemModel(R.drawable.kuhli, "Ikan Kuhli Loach", R.string.desk_kuhli));
        listModel.add(new ItemModel(R.drawable.botia, "Ikan Botia Badut", R.string.desk_botia));
        listModel.add(new ItemModel(R.drawable.blackghost, "Ikan Black Ghost", R.string.desk_blackghost));
        return listModel;
    }


    public List<ItemModel> lisDataIkanSmallFish() {
        List<ItemModel> listModel = new ArrayList<>();
        listModel.add(new ItemModel(R.drawable.cupang, "Ikan Cupang", R.string.desk_cupang));
        listModel.add(new ItemModel(R.drawable.molly, "Ikan Molly", R.string.desk_molly));
        listModel.add(new ItemModel(R.drawable.guppydua, "Ikan Guppy", R.string.desk_guppy));
        listModel.add(new ItemModel(R.drawable.platy, "Ikan Platy", R.string.desk_platy));
        listModel.add(new ItemModel(R.drawable.neon, "Ikan Neon", R.string.desk_neon));
        listModel.add(new ItemModel(R.drawable.ikanzebra, "Ikan Zebra", R.string.desk_ikanzebra));
        return listModel;
    }

    public List<ItemModel> lisDataIkanGoldFish() {
        List<ItemModel> listModel = new ArrayList<>();
        listModel.add(new ItemModel(R.drawable.komet, "Ikan Komet", R.string.desk_komet));
        listModel.add(new ItemModel(R.drawable.koi, "Ikan Koi", R.string.desk_koi));
        listModel.add(new ItemModel(R.drawable.redtailshark, "Ikan Red Tail Shark", R.string.desk_redtailshark));
        listModel.add(new ItemModel(R.drawable.koki, "Ikan Mas Koki", R.string.desk_koki));
        listModel.add(new ItemModel(R.drawable.balashark, "Ikan Balashark", R.string.desk_balashark));
        listModel.add(new ItemModel(R.drawable.rainbowfish, "Ikan Pelangi", R.string.desk_ikanpelangi));
        return listModel;
    }

    public List<ItemModel> listDataIkanCichlid() {
        List<ItemModel> listModel = new ArrayList<>();
        listModel.add(new ItemModel(R.drawable.louhan, "Ikan Louhan", R.string.desk_louhan));
        listModel.add(new ItemModel(R.drawable.greenterror, "Ikan Green Terror Cichlid", R.string.desk_greenterror));
        listModel.add(new ItemModel(R.drawable.reddevil, "Ikan Red Devil", R.string.desk_reddevil));
        listModel.add(new ItemModel(R.drawable.oscar, "Ikan Oscar", R.string.desk_oscar));
        listModel.add(new ItemModel(R.drawable.lemon, "Ikan Lemon", R.string.desk_lemon));
        listModel.add(new ItemModel(R.drawable.peacock, "Ikan Peacock Bass", R.string.desk_peacock));
        return listModel;
    }

    public List<ItemModel> listDataIkanTeritorial() {
        List<ItemModel> listModel = new ArrayList<>();
        listModel.add(new ItemModel(R.drawable.snakeheaddua, "Ikan Snakehead", R.string.desk_snakehead));
        listModel.add(new ItemModel(R.drawable.bichir, "Ikan Bichir", R.string.desk_bichir));
        listModel.add(new ItemModel(R.drawable.ikansumatra, "Ikan Sumatra", R.string.desk_sumatra));
        listModel.add(new ItemModel(R.drawable.swordfish, "Ikan Swordtails", R.string.desk_ikanswordfish));
        listModel.add(new ItemModel(R.drawable.anglefish, "Ikan Angelfish", R.string.desk_angelfish));
        listModel.add(new ItemModel(R.drawable.killifish, "Ikan Killifish", R.string.desk_killifish));
        return listModel;
    }

    public List<ItemModel> listDataIkanPredator() {
        List<ItemModel> listModel = new ArrayList<>();
        listModel.add(new ItemModel(R.drawable.superred, "Ikan Arwana Asia", R.string.desk_arwana));
        listModel.add(new ItemModel(R.drawable.arwanasilver, "Ikan Arwana Silver", R.string.desk_arwanasilver));
        listModel.add(new ItemModel(R.drawable.belida, "Ikan Belida Sumatra", R.string.desk_belida));
        listModel.add(new ItemModel(R.drawable.alligator, "Ikan Aligator Spatula Gar", R.string.desk_alligator));
        listModel.add(new ItemModel(R.drawable.arapaima, "Ikan Arapaima Gigas", R.string.desk_arapaima));
        listModel.add(new ItemModel(R.drawable.discuss, "Ikan Disscus", R.string.desk_molly));
        return listModel;
    }
}

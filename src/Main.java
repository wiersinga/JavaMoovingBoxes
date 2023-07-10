

public class Main {
    public static void main(String[] args){
//       float cartons = 34.0f;
//        float contenance = 9.0f;
//        float div = cartons/contenance;
//        System.out.println(div);
        int cartons = 34;
        int contenance = 9;

        int NombreVoyage= Math.round((float)cartons/contenance);
        System.out.println(NombreVoyage);


        for (int i=0; i<NombreVoyage; i++){
            int cartonsTranportes = Math.min(cartons,contenance);
            System.out.println("un voyage de "+ cartonsTranportes +"cartons");
            cartons-=cartonsTranportes;

        }
        }
        };

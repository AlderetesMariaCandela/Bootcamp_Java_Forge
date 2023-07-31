import java.util.HashMap;
import java.util.Set;


public class MapaHashmatiqueTest{

    public static void main (String[] args){

        MapaHashmatique manipulador = new MapaHashmatique();

        HashMap<String, String> list = manipulador.trackList();
        Set<String> keys = list.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(list.get(key));
        }

          //extraer una cancion por su título
        String cancion = list.get("Linger");
        System.out.println("Linger");
        System.out.println(cancion);
    }
}
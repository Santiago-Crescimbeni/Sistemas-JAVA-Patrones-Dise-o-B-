package presencial;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {
    private static Map<String,Computadora> computadoraMap;

    public ComputadoraFactory() {
        computadoraMap=new HashMap<>();
    }
    public Computadora getComputadora(Integer ram,Integer disco){
        //creo una clave
        String clave="key:"+ram+":"+disco;
        //preguntar si existe la clave en el mapa
        if (!computadoraMap.containsKey(clave)){
            //no existe la key en el mapa, debemos instanciar
            Computadora nuevaCompu=new Computadora(ram,disco,clave);
            computadoraMap.put(clave,nuevaCompu);
        }
        return computadoraMap.get(clave);
    }
}

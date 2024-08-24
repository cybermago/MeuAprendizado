package map;

import java.util.*;

/*
* put()
* containsKey()
* KeySet()
* values()
* entrySet()
* getValue()
* getKey()
* iterator()
* iterator.hashNext()
* iterator.next()
* LinkedHashMap()
* Interface Entry*/
public class ExMap {
    public static void main(String[] args) {

        // Map carros = new HashMap()
        // Map<String, Double> carros = new HashMap<>();
        // HashMap<String, Double> carros = new HAshMap<>();
        // Map<String, Double> carros = Map.of("", 10, "", 11);

        System.out.println();
        Map<String, Double> carros = new HashMap<>(){{
            put("gol", 10.1);
            put("uno", 10.2);
            put("fiat", 10.3);
            put("hb20", 10.4);
            put("porsa", 10.5);
        }};
        System.out.println(carros.toString());
        // Substiruição
        System.out.println(carros.put("gol", 10.9));
        //Conferir se está dentro
        System.out.println(carros.containsKey("uno"));
        // - Retornar valor da chave
        System.out.println(carros.get("gol"));
        // -
        System.out.println(carros.keySet());
        // - Exibir valor das chaves
        Collection<Double> consumo = carros.values();
        System.out.println(consumo);
        //
        Double comsumoEficiente = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloeficiente = "";

        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(comsumoEficiente)){
                modeloeficiente = entry.getKey();
                System.out.println("ModeloEficiente" + modeloeficiente
                        + "ConsumoEficiente" + comsumoEficiente + "");
            }
        }
        // - Menor consumo
        double consumomenos = Collections.min(carros.values());
        for(Map.Entry<String, Double> entry: carros.entrySet()){
            if(entry.getValue().equals(consumomenos)){
                modeloeficiente = entry.getKey();
                System.out.println(modeloeficiente + consumomenos);
            }
        }
        //
        Iterator<Double> iterator = carros.values().iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        // Soma
        System.out.println(soma);
        //Média
        System.out.println((soma /carros.size()));
        //
        Iterator<Double> iterator2 = carros.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next().equals(15.6))
                iterator2.remove();
        }
        System.out.println(carros);

        // Ordem Informada
        Map<String, Double> carros2 = new LinkedHashMap<>(){{
            put("gol", 10.1);
            put("uno", 10.2);
            put("fiat", 10.3);
            put("hb20", 10.4);
            put("porsa", 10.5);
        }};
        System.out.println(carros2.toString());

        // Dicionario ordenado pelo modelo
        Map<String, Double> carros3 = new TreeMap<>();
        System.out.println(carros3.toString());
        //Apagar
        carros.clear();
        System.out.println(carros);
        // se esta vazio
        System.out.println(carros.isEmpty());
    }
}

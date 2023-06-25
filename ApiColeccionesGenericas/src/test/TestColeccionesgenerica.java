package test;

import java.util.*;// solo utilizo import java.util.* porque vamos a utilizar varias clases o interfaces en este paquete

public class TestColeccionesgenerica {

    public static void main(String[] args) {
        // guarda un orden y el tipo Array muestra en orden los elementos si hay duplicados los deja duplicados
        List<String> milista = new ArrayList<>();
        milista.add("lunes");
        milista.add("martes");
        milista.add("miercoles");
        milista.add("jueves");
        milista.add("viernes");
        milista.add("sabado");
        milista.add("domingo");
        String elemento=milista.get(0);
        
       // System.out.println(" Elemento: "+elemento);
        

        //1. Puedo utilizar de dos formas como lo es el ciclo for de la siguiente foma o el forEach
//        for (Object elemento:milista) {
//        System.out.println(" EL DIA: " + elemento);
//        }
//                //2. con forEach seria de la sigueinte forma
//        milista.forEach((elemento) -> {
//            System.out.println(" EL DIA: " + elemento);
//        });
        // la clase HshSet ()= No permite elementos duplicados: Cada elemento en un HashSetes único. 
        //Si intenta agregar un elemento que ya está presente, no se agregará duplicado
        //Imprimir(milista);
        Set<String> miset = new HashSet();
        miset.add("Lunes");
        miset.add("Martes");
        miset.add("Miercoles");
        miset.add("Jueves");                                                                                                        
        miset.add("Viernes");
        miset.add("Sabado");
        miset.add("Domingo");
        //Imprimir(miset);

        Map<String,String> mimapa = new HashMap<>();
        mimapa.put("Valor 1: ", "Juan");
        mimapa.put("valor 2: ", "Pedro");
        mimapa.put("Valor 3", "Karla");
        mimapa.put("Valor 3: ", "Carlos");
        
      // accedemos a los elementos de un mapa de la siguiente manera
      String elementoMapa = mimapa.get("Valor 3");
       System.out.println("Elemento Mapa: " + elementoMapa);
        Imprimir(mimapa.keySet());
        Imprimir(mimapa.values());//
    }

    public static void Imprimir(Collection<String> collection) {
//        collection.forEach((elemento) -> {
//            System.out.println("Elemento: " + elemento);
//        });
        for (String elemento : collection) {
            System.out.println(" Elemento: " + elemento);
            
        }
    
    }
}

package test;

import Genericos.ClaseGenerica;

/**
 *
 * @author JOSE
 */
public class TestColeccionesGenericas {

    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Juan");
        objetoString.obtenerTipo();
    }
}

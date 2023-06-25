
package Genericos;

// Añado una letra <t> la cual indica que esta clase es de un tipo Generico
// Despues defino el tipo generico
public class ClaseGenerica<t> {
    private t objeto;
    public ClaseGenerica(t objeto){
        this.objeto = objeto;
        }
    public void obtenerTipo(){
        System.out.println("El tipo t es: " + objeto.getClass().getSimpleName());
        // con .getClass().getSimpleName()nos ayuda a imprimir el tipo que se utliza el tipo que se utilziao para crear
        //una Instancia de esta clase   
    }
}

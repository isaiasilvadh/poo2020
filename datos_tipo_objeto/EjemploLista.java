package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        //Creacion de una lista en java
        //para almacenar valores de tipo String
        List<String> universidades = new ArrayList<String>();
        universidades.add ("UTPL");
        System.out.println("Tamaño de la lista: "+universidades.size());
        universidades.add("Spol");
        System.out.println("Tamaño de la lista: "+universidades.size());
        universidades.add("unl");
        System.out.println("Tamaño de la lista: "+universidades.size());
        //Eliminacion del elemento de la posicion 1
        universidades.remove(1);
        System.out.println("Tamaño de la lista, luego de eliminar el elmento: "+universidades.size());
        System.out.println("Valores de la lista");
        //reemplazamos el valor indicado
        universidades.set(1,"UIDE");
        //Agregamos un nuevo valor en una pocision intermedia
        universidades.add(1,"UNL");
      /*  for (int i=0;i<universidades.size();i++)  {
            System.out.println(universidades.get(i));
        }
       */
      //Foreach para recorrer la lista de las universidades
        for (String univ: universidades){
            System.out.println(univ);
        }

    }
}

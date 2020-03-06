package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();
        int op;
        boolean bandera = true;
        do{
            System.out.println("Ingrese 1 para agregar un nombre");
            System.out.println("ingrese 2 para presentar lista de nombres");
            System.out.println("Ingrese 3 para salir");
            System.out.println("____________________________________________");
            op = teclado.nextInt();
            teclado.nextLine();
            switch (op){
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    nombres.add(teclado.nextLine());
                    break;
                case 2:
                    for (int i = 0; i<nombres.size();i++){
                        System.out.println(nombres.get(i));
                    }
                    break;

                case 3: bandera = false;
            }


        }while (bandera);
    }
}

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Directorio directorio = new Directorio();
        Persona joseLuis = new Persona("Jose", "Medina", "Luis", 'M', 52, "6675036832");
        //directorio.agregar(joseLuis);

        System.out.println("Ingrese la opcion deseada: ");
        Scanner in = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("1) Agregar persona");
            System.out.println("2) Borrar persona");
            System.out.println("3) Imprimir todo");
            System.out.println("4) Finalizar");

            String entrada = in.nextLine();
            numero = Integer.parseInt(entrada);
            if (numero == 1) {
                directorio.agregar(joseLuis);
            }
            else if (numero == 2) {
                directorio.eliminar();
            }
            else if (numero == 3){
                directorio.imprimirTodo();
            }
        }while(numero != 4);
    }
}

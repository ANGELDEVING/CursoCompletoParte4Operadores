import java.util.Scanner;

public class NuevaPractica {
    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        String[] nombre = new String[3];
        StringBuilder salida = new StringBuilder();
        for(int i = 0; i < nombre.length; i++)
        {
            System.out.println((i + 1) + "Dijite el nombre ");
            nombre[i] = datos.nextLine();
            salida.append(nombre[i].toUpperCase().charAt(1)).append(".").append(nombre[i].substring(nombre[i].length() - 2)).append(" _ ");
        }
        System.out.println(salida);
    }
}

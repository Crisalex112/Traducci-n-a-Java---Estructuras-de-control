package mostrar;
/**
 *
 * @author Cristopher Alexander Gálvez Gutierrez
 */
import java.util.Scanner;
public class Mostrar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, carrera;
        int edad;
        double estatura;
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su carrera: ");
        carrera = sc.nextLine();
        System.out.println("Ingrese su estatura: ");
        estatura = sc.nextDouble();
        System.out.println("Hola "+nombre);
        System.out.println("Tienes "+edad+" años");
        System.out.println("Estudias la carrera de "+ carrera);
        System.out.println("Y mides "+estatura);
    }
    
}

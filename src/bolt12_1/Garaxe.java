package bolt12_1;

import java.util.Scanner;

/**
 *
 * @author agonzalezacevedo
 */
public class Garaxe {

    Scanner sc = new Scanner(System.in);
    private int n_coches;
    private String matricula;
    private int n_horas;
    private double precio;
    private double dinero;

    public void aparca() {
        for (n_coches = 0; n_coches < 5; n_coches++) {
            System.out.println("Esta disponible");
            System.out.println("Cual es la matrícula?");
            matricula = sc.next();
            System.out.println("Cuanto tiempo lleva aquí?");
            n_horas = sc.nextInt();
            if (n_horas < 3) {
                precio = 1.5;
            } else {
                precio = 1.5 + 0.2 * (n_horas - 3);
            }
            System.out.println("El precio es " + precio + ".");
            System.out.println("Cuanto dinero pagas?");
            dinero = sc.nextDouble();
            System.out.println("\nFactura:\nMatricula: " + matricula + "\nTiempo aparcado: " + n_horas + "\nPrecio: " + precio + "\nDinero recibido: " + dinero + "\nDinero devuelto: " + (dinero - precio));
        }
        System.out.println("Lleno");
    }
}

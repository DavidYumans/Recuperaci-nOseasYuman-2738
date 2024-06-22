import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro programa que desea hacer el día de hoy?: ");
        System.out.println("1. Operaciones Lógicas: ");
        System.out.println("2. Clase Catedrático: ");
        System.out.println("3. Clase Estudiante: ");
        System.out.println("4. Lista de Estudiantes: ");
        System.out.println("5. Mostrar Lista de Estudiantes: ");
       ;

        int opc=menu.nextInt();

        switch (opc){
            case 1:
                System.out.println("Ingrese un 2 Numeros y un Operador");
                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingrese el primer numero: ");
                double nm1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                double nm2 = scanner.nextDouble();

                System.out.print("Ingresa un operador (+, -, *, /): ");
                char op = scanner.next().charAt(0);

                ExamenFinalVarianteA operadora = new ExamenFinalVarianteA (nm1, nm2, op);
                operadora.verificar();

                scanner.close();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                List<Estudiante> listaEstudiantes = new ArrayList<>();
                Scanner obtener = new Scanner(System.in);
                int opcion;

                System.out.print("Nombre del Estudiante: ");
                int nombre = obtener.nextInt();
                System.out.print("Calificacion del Estudiante: ");
                int calificacion = obtener.nextInt();

                Estudiante nuevoEstudiante = new Estudiante( nombre, calificacion );
                listaEstudiantes.add(nuevoEstudiante);
                break;

            case 5:
                break;
        }
    }
}
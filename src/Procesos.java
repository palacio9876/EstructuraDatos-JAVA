import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
//Cristian Palacio
public class Procesos {
    //Cristian Palacio
    int cantAlumnos, cantAprobados = 0, cantReprobo = 0, cantRecupera = 0, cantNoRecupera = 0;
    double nota1, nota2, nota3,promedioFinal;
    ArrayList<Double> notaFinal = new ArrayList<Double>();
    ArrayList<String> nombres = new ArrayList<String>();

    public void iniciar() {
        pedirDatos();
        imprimirDatos();
        //Cristian Palacio
    }

    public void pedirDatos() {
        cantAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos: "));
        for (int i = 0; i < cantAlumnos; i++) {
            nombres.add(JOptionPane.showInputDialog("Ingrese el nombre del alumno"));
            do {
                nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));
                if (nota1 < 0 || nota1 > 5) {
                    JOptionPane.showMessageDialog(null, "La nota debe estar entre 0 y 5");
                }
            } while (nota1 < 0 || nota1 > 5);
            do {
                nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2"));
                if (nota2 < 0 || nota2 > 5) {
                    JOptionPane.showMessageDialog(null, "La nota debe estar entre 0 y 5");
                }
            } while (nota2 < 0 || nota2 > 5);
            do {
                nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3"));
                if (nota3 < 0 || nota3 > 5) {
                    JOptionPane.showMessageDialog(null, "La nota debe estar entre 0 y 5");
                }
                //Cristian Palacio
            } while (nota3 < 0 || nota3 > 5);
            notaFinal.add((nota1 + nota2 + nota3) / 3);

            if (notaFinal.get(i) >= 3.5) {
                JOptionPane.showMessageDialog(null, "Aprobo");
                cantAprobados++;
            } else {
                if (notaFinal.get(i) < 3.5 && notaFinal.get(i) >= 2) {
                    JOptionPane.showMessageDialog(null, "puede recuperar");
                    cantRecupera++;
                } else {
                    JOptionPane.showMessageDialog(null, "reprobo");
                    cantNoRecupera++;
                }
                cantReprobo++;
            }


            System.out.println("El promedio del estudiante: " + nombres.get(i) + " es de: " + notaFinal.get(i));
        }
        //Cristian Palacio
    }


    public void imprimirDatos() {
        System.out.println("---------------------------------------------------");
        System.out.println("El total de alumnos registrados es de: " + cantAlumnos);
        System.out.println("la cantidad de notas ingresadas es: " + cantAlumnos * 3);
        System.out.println("La cantidad de alumnos que aprobaron es de: " + cantAprobados);
        System.out.println("La cantidad de alumnos que reprobaron es de: " + cantReprobo);
        System.out.println("La cantidad de alumnos que pueden recuperar es de: " + cantRecupera);
        System.out.println("La cantidad de alumnos que no pueden recuperar es de: " + cantNoRecupera);
        System.out.println("---------------------------------------------------");
        System.out.println("El promedio de las notas finales es de: "+ promedioFinal);
        System.out.println("---------------------------------------------------");
        System.out.println("Lista de alumnos y notas registrados");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre: "+nombres.get(i) + " | notas: " + notaFinal.get(i));
        }
        //Cristian Palacio
    }
}

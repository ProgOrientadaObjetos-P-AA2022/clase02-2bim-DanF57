/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author Daniel
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        //Crear un objeto de tipo Estudiante Presencial
        String nombre = "Daniel";
        String ape = "Flores";
        String id = "11023302";
        int ed = 20;

        EstudiantePresencial est1 = new EstudiantePresencial(nombre,
                ape, id, ed);

        est1.establecerNumeroCreditos(15);
        est1.establecerCostoCredito(200);
        est1.calcularMatriculaPresencial();

        System.out.printf("%s", est1);

    }

}

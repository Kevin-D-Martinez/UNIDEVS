/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignacion1;

import java.util.Scanner;

/**
 *
 * @author Dalvi
 */

public class InformacionPersonal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Escriba su correo: ");
        String correo = sc.nextLine();

        System.out.println("Su nombre es " + nombre + " y su correo es " + correo);
    }
    
}

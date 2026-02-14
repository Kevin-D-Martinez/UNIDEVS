/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

/**
 *
 * @author LaChichi
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisor tv1 = new Televisor("Samsung", "QN55S95FAFXZA");
        Televisor tv2 = new Televisor("LG", "C5 OLED");
        Televisor tv3 = new Televisor("Samsung", "QN70F Neo QLED");

        System.out.println("============== TV 1 ==============");
        System.out.println(tv1.obtenerInformacion());
        System.out.println(tv1.obtenerStatus());
        System.out.println(tv1.subirVolumen());
        System.out.println(tv1.encender());
        System.out.println(tv1.encender());
        System.out.println(tv1.subirVolumen());
        System.out.println(tv1.subirVolumen());
        System.out.println(tv1.bajarVolumen());
        System.out.println(tv1.apagar());
        System.out.println();
        
        System.out.println("============== TV 2 ==============");
        System.out.println(tv2.obtenerInformacion());
        System.out.println(tv2.obtenerStatus());
        System.out.println(tv2.subirVolumen());
        System.out.println(tv2.encender());
        System.out.println(tv2.subirVolumen());
        System.out.println(tv2.subirVolumen());
        System.out.println(tv2.subirVolumen());
        System.out.println(tv2.apagar());
        System.out.println(tv2.apagar());
        System.out.println();
        
        System.out.println("============== TV 3 ==============");
        System.out.println(tv3.obtenerInformacion());
        System.out.println(tv3.encender());
        System.out.println(tv3.bajarVolumen());
        System.out.println(tv3.bajarVolumen());
        System.out.println(tv3.bajarVolumen());
        System.out.println(tv3.bajarVolumen());
        System.out.println(tv3.obtenerStatus());
        System.out.println(tv3.apagar());
    }

}

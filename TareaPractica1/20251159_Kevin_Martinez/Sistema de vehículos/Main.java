
public class Main{
    public static void main(String[] args){
        Vehiculo carro1 = new Vehiculo();
        Vehiculo carro2 = new Vehiculo("A463743", "Toyota", "Corola");
        Vehiculo carro3 = new Vehiculo("A245654", "Honda", "CR-V");
        Vehiculo carro4 = new Vehiculo("A463743", "Chevrolet", "Camaro");
        
        System.out.println("Costo total por servicio: "+carro1.calcularMantenimiento(15900)+"\n\n");
        
        System.out.println("Costo total por servicio: "+carro2.calcularMantenimiento(64534,"Intermedio","Automatica")+"\n\n");
        
        System.out.println("Costo total por servicio: "+carro3.calcularMantenimiento(50256,"Completo","CVT")+"\n\n");
        
        System.out.println("Costo total por servicio: "+carro4.calcularMantenimiento(15924,"Preventivo")+"\n\n");
    }
}
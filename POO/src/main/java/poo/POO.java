package poo;

public class POO {

    public static void main(String[] args) {
        
    Vehiculo ve1 = new Vehiculo(8578, 4, "Ferrari", "Zefel");   
    
    /*Auto auto1 = new Auto();  */
    
    Auto auto2 = new Auto(1, "AJ234UT", 6, "negro", true, 46532, 4,"Volkswagen", "Gol Trend");
    Moto moto1 = new Moto(1200, 4554, 2, "Yamaha", "Titan");
    Camion cam1 = new Camion(4, true, 344343, 8, "Mercedez", "Maks");
    
    
    Vehiculo vector[] = new Vehiculo [4];
    vector[0] = ve1;
    vector[1] = auto2;
    vector[2] = moto1;
    vector[3] = cam1;
    
    for (int i=0; i<4; i++){
        System.out.println("Registro N° " + i + vector[i].getMarca());
    
    }
    
    
     /* System.out.println("La id del auto2 es: " + auto2.getId());          
        System.out.println(auto2.toString());
        System.out.println(auto1.toString());
    */
       /* auto2.encender();
    auto2.acelerar(80);
    auto2.afrenar(40);
    auto2.apagar(); */
    
       /* System.out.println("El valor del id es: " + auto2.getId());
        auto2.setId(37562);
        System.out.println("El nuevo valor de la id es: " + auto2.getId());
    */
  
       /* System.out.println("La id de auto1 es: " + auto1.getId()); 
        System.out.println("La color de auto1 es: " + auto1.getColor());
        
        auto1.setId(2484);
        auto1.setPatente("WER345WRT");
        auto1.setCant_puertas(4);
        auto1.setColor("Gris");
        auto1.setCaja_manual(false);
       
        System.out.println("-------------------");
        
        System.out.println("La id de auto1 es: " + auto1.getId()); 
        System.out.println("La color de auto1 es: " + auto1.getColor());
        */
             
          
    }
}

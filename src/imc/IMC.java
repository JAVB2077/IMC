/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

import java.util.Scanner;

/**
 *
 * @author killer
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Patient patient1 = new Patient();
          Patient patient2 = new Patient("Desconocido", 0.00F, 0.00F, 'M');
          
          
          //System.out.prinln("Estado inicial de los patient\n"+"Patient1\n"+ patient1.toString() "Patient2\n"+patient2.toString());
          
         // Paciente 1
         //data(patient1);
         //data(patient2);
         
         System.out.println(patient1);
         System.out.println(patient2);
         
         data(patient1);
         System.out.println(patient1);
         
         data(patient2);
         System.out.println(patient2);
         
          
    }
    
    
    public static void data (Patient p){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre ");
        p.setName(scanner.nextLine());
        System.out.println("Ingrese peso");
        p.setWaight(Float.parseFloat(scanner.nextLine()));
        System.out.println("EStatura");
        p.setHeight(Float.parseFloat(scanner.nextLine()));
          System.out.println("ingrese sexo M/F (1/2)");
          byte a = Byte.parseByte(scanner.nextLine());
          char s = 'M';
          if (a == 2){
              s = 'F';
          }
        p.setSex(s);
        
        
    }
}


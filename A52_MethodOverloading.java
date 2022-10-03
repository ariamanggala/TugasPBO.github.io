/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class A52_MethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sayHello();
        sayHello("Eko");
        sayHello("Eko", "Kurniawan");
      }

      static void sayHello(){
        System.out.println("Hello");
      }

      static void sayHello(String firstname){
        System.out.println("Hello " + firstname);
      }

      static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
    
}

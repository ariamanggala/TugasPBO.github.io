/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class A55_ErorStackOverflow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        loop(1000);
        }
        static void loop(int value) {
        if (value == 0) {
          System.out.println("Selesai");
        } else {
          System.out.println("Loop-" + value);
          loop(value - 1);
        }
    }
    
}

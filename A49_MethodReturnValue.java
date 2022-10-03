/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class A49_MethodReturnValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 100;
        int b = 200;
        int c = sum(a,b);
        System.out.println(c);
      }

      static int sum(int value1, int value2){
        int total = value1 + value2;
        return total;
    }
    
}

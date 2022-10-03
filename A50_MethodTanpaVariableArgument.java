/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class A50_MethodTanpaVariableArgument {

    /**
     * @param name
     * @param values
     */
    public static void sayCongrats(String name, int[] values) {
        // TODO code application logic here
        int total = 0;
        for (int value : values) {
          total += value;
        }

        int finalValue = total / values.length;

        if (finalValue >= 75) {
          System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
          System.out.println("Maaf " + name + ", Anda Lulus");
        }
    }
    
}

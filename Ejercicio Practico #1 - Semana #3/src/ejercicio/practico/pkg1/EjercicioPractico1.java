/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.practico.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author gcastro
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
        Una empresa necesita deterinar el monto total que debe pagar a la Caja Costarricense del Seguro Social.
        Para esto, se requiere un programa que calcule dicho monto basado en el salario para un empleado especifico. 
        El programa debe solicitar el salario individual y calcular el monto total a pagar aplicando los siguiente rubros: 
        
        - Seguro de enfermedad y Maternidad: 9.25% del salario. 
        - Invalidez, Vejez y Muerte: 5.08%. 
        */
        
        //Variables
        String ssalario = "";
        double salario = 0;
        double sem = 0.0925;
        double ivm = 0.0508;
        double total = 0;
        
        //Desarrollo

        JOptionPane.showMessageDialog(null,"Bienvenido al Programa de la Caja Costarricense del Seguro Social!");
        ssalario = JOptionPane.showInputDialog("Ingrese el salario mensual bruto al cual se van a realizar los calculos:");
        salario = Double.parseDouble(ssalario);
        
        sem = salario * sem;
        ivm = salario * ivm;
        total = sem + ivm;
        
        //Resultado
        
        JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS el monto de: ₡ " + total + " colones." + "\n"
                                            + "\n" + "Por concepto de:" + "\n"
                                            + "-Seguro de Enfermedad Y Maternidad (9.25%): ₡ " + sem + "." + "\n"
                                            + "-Invalidez, Vejez y Muerte (5.08%): ₡ " + ivm + ".");
        
        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestros servicios." + "\n"
                                        + "\n"
                                        + "Un programa hecho por @Tavillo.Dev.");
        
        
        
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan48.kalkulator;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program Kalkulator
 */
public class PBOIF210119051Latihan48Kalkulator {

    
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();
        calc.setValue1(7);
        calc.setValue2(5);
        
        double val1 = calc.getValue1();
        double val2 = calc.getValue2();
        
        System.out.println("VALUE 1 = " + val1);
        System.out.println("VALUE 2 = " + val2);
        
        calc.setNameProject();
        calc.setNoteProject("This project shown you how to manage method in java");
        
        System.out.println("Result Add is = " + calc.add(val1, val2));
        System.out.println("Result Minus is = " + calc.minus(val1, val2));
        System.out.println("Result Multiple is = " + calc.multiplication(val1, val2));
        System.out.println("Result Division is = " + calc.division(val1, val2));
    }
    
}

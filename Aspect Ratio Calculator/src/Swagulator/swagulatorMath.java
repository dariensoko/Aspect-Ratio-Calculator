/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swagulator;

/**
 *
 * @author darien.sokoloski
 */
public class swagulatorMath {

    private String mode;
    private String ratio;
    private double inputNumber;

    public swagulatorMath(double number, String selectedRatio, String calculation) {
        this.mode = calculation;
        this.ratio = selectedRatio;
        this.inputNumber = number;
    }

    public void modeSelection(String mode) {

        if (mode.equals("Height")) {
            System.out.println("Height");
        } else if (mode.equals("Width")) {
            System.out.println("Width");
        } 
    }
}

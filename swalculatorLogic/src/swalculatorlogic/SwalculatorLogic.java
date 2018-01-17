
package swalculatorlogic;

import java.util.Scanner;

public class SwalculatorLogic {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String choice = reader.nextLine();
        int rw = Integer.parseInt(reader.nextLine());
        int rh = Integer.parseInt(reader.nextLine());
        int i = Integer.parseInt(reader.nextLine());
        if(choice.equals("height")){//i = width
            System.out.println(rh*(i/rw));
        } else if(choice.equals("width")){//i = height
            System.out.println(rw*(i/rh));
        }
    }
    
}

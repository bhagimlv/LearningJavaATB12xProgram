package ex_09_Switch;

import javax.sound.midi.Soundbank;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        // JDK > 13
        int itemcode = 000;
        switch (itemcode) {
            case 001, 002, 005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004, 006, 007:
                System.out.println("This is Mech");
                break;
            case 000:
                System.out.println("this is 000");
                break;

            default:
                System.out.println("None");
        }
    }
}

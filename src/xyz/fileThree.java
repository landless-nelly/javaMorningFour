package xyz;

import javax.swing.*;

public class fileThree {
    public static void main(String[] args) {
        String[] watu;
        String output;
        watu = new  String[5];
        watu[0] ="Nelly";
        watu[1] ="Raymond";
        watu[2] ="angel";
        watu[3] ="Tertius";
        watu[4] ="Agevi";
        output = watu[0] + " \n " +  watu[1] +" \n " + watu[2] + " \n " + watu[3] +" \n " + watu[4];
        JOptionPane.showMessageDialog(null,output);

    }

}

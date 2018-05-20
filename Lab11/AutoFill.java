package ua.lpnuai.oop.stasiuk11;

import java.io.*;

public class AutoFill extends Main implements Main.Command {
    public void execute(){
        File myFile = new File("E:\\OOP\\Lab11\\src\\ua\\lpnuai\\oop\\stasiuk11\\data.txt");
        String name_txt = "Stasiuk A.O.";
        String date_txt = "18.03.00";
        String phonen_txt = "0999932312";
        String zno_txt = "191";
        String  start_txt = "1.09.17";
        System.out.println("Name - " + name_txt);
        System.out.println("Date -  " + date_txt);
        System.out.println("Phone - " + phonen_txt);
        System.out.println("ZNO - " + zno_txt);
        System.out.println("Start learn - " + start_txt);
        System.out.println("**************************************");
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer.println("Name - " + name_txt);
            writer.println("Date -  " + date_txt);
            writer.println("Phone - " + phonen_txt);
            writer.println("ZNO - " + zno_txt);
            writer.println("Statr learn - " + start_txt);
            writer.println("**************************************");
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("File autofilled!");
    }
}
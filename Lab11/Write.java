package ua.lpnuai.oop.stasiuk11;
import java.io.*;
import java.util.Scanner;

public class Write extends Main implements Main.Command {
    public void execute(){
        File myFile = new File("E:\\OOP\\Lab11\\src\\ua\\lpnuai\\oop\\stasiuk11\\data.txt");
        Scanner name = new Scanner(System.in);
        System.out.print("Your name: ");
        String name_text = name.nextLine();
        Scanner date = new Scanner(System.in);
        System.out.print("Your date: ");
        String date_text = date.nextLine();
        Scanner phonen = new Scanner(System.in);
        System.out.print("Your registration number: ");
        String phonen_text = phonen.nextLine();
        Scanner zno = new Scanner(System.in);
        System.out.print("Your zno: ");
        String zno_text = zno.nextLine();
        Scanner start = new Scanner(System.in);
        System.out.println("Start learning:");
        String start_text = start.nextLine();
        System.out.println("**************************************");
        System.out.println("Name - " + name_text);
        System.out.println("Date -  " + date_text);
        System.out.println("Phone - " + phonen_text);
        System.out.println("ZNO - " + zno_text);
        System.out.println("Start learn - " + start_text);
        System.out.println("**************************************");
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer.println("Name - " + name_text);
            writer.println("Date -  " + date_text);
            writer.println("Phone - " + phonen_text);
            writer.println("ZNO - " + zno_text);
            writer.println("Statr learn - " + start_text);
            writer.println("**************************************");
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
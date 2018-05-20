package ua.lpnuai.oop.stasiuk11;

import java.io.File;

public class Delete extends Main implements Main.Command {
    public void execute(){
        File myFile = new File("E:\\OOP\\Lab11\\src\\ua\\lpnuai\\oop\\stasiuk11\\data.txt");
        if(myFile.delete()){
            System.out.println("File was successfully deleted!");
        }
        else
            System.out.println("File wasn`t found!");
    }
}
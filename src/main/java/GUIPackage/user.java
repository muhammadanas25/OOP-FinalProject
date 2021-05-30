package GUIPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public interface user {
    public static Boolean checkLogin(String name,String password){
        String [] dataArr= new String[50];
        try{

            File myObj = new File(name+".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                dataArr=data.split(" ");
                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return (dataArr[1].equals(name)&&dataArr[3].equals(password));

    }

}



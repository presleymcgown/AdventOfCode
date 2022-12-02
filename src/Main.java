import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String path = "res/elfcalories.txt";
        File file = new File(path);

        Scanner scr;

        try {
            scr = new Scanner(file);
        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        }

        // if we make it this far, we found our file.

        /*
        1) add lines into a list
        2) split list into each elf
        3) add each elf's calories together
        4) see which is biggest
        5) get answer
         */

        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> totals = new ArrayList<>();

        String s = scr.nextLine();
        int t = 0;
        int g = 0;

        while(scr.hasNextLine()){

            if(!s.isEmpty()) {
                System.out.println("Found empty line.");
                strings.add(s);
            }else{
                for (int i = 0; i < strings.size(); i++) {
                    t += Integer.parseInt(strings.get(i));
                }

                totals.add(t);
                System.out.println("New elf added to line, total was" + t);
                t = 0;

                strings.clear();



            }
        }

        for (int i = 0; i < totals.size(); i++) {

            if(totals.get(i) > g){

                g = totals.get(i);

            }

        }

        System.out.println("The greatest amount of calories that one elf had is: " + g);


    }

}

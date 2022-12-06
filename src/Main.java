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


        int t = 0;
        int g = 0;
        int g2 = 0;
        int g3 = 0;

        while(scr.hasNextLine()){

            String s = scr.nextLine();

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

        totals.remove(totals.indexOf(g));

        for (int i = 0; i < totals.size(); i++) {

            if(totals.get(i) > g2){

                g2 = totals.get(i);

            }

        }

        totals.remove(totals.indexOf(g2));

        for (int i = 0; i < totals.size(); i++) {

            if(totals.get(i) > g3){

                g3 = totals.get(i);

            }

        }

        int topThree = g + g2 + g3;

        System.out.println("The greatest amount of calories that one elf had is: " + g);
        System.out.println("The greatest amount of the top three calorie carrying elves is: " + topThree);


    }

}

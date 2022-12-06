import javax.swing.plaf.IconUIResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        dayFive();


    }

    public static void dayOne(){

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

    public static void dayFive(){

        String path = "res/cratesandstacks.txt";
        File file = new File(path);

        Scanner scr;

        try {
            scr = new Scanner(file);
        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        }

        // initialize all stacks

        Stack[] stacks = new Stack[9];

        for (int i = 0; i < stacks.length; i++) {

            stacks[i] = new Stack<Character>();

        }

        // read a line of input

        // put characters on correct stacks

        // once all stacks are populated:

        // read a line of input

        //

        String s = scr.nextLine();

        while(!s.isEmpty()){

            for (int i = 0; i < s.length(); i++) {

                if(!(s.charAt(i) == '[' || s.charAt(i) == ']' || s.charAt(i) == ' ')){

                    System.out.println("Letter found: " + s.charAt(i));

                    int charNum = i;

                    switch (charNum){

                        case 2:

                            stacks[0].push(s.charAt(i));
                            System.out.println(s.charAt(i) + " put on stack 1.");
                            break;

                        case 6:

                            stacks[1].push(s.charAt(i));
                            System.out.println(s.charAt(i) + " put on stack 2.");
                            break;

                        case 10:

                            stacks[2].push(s.charAt(i));
                            System.out.println(s.charAt(i) + " put on stack 3.");
                            break;

                        case 14:

                            stacks[3].push(s.charAt(i));
                            System.out.println(s.charAt(i) + " put on stack 4.");
                            break;

                        case 18:

                            stacks[4].push(s.charAt(i));
                            System.out.println(s.charAt(i) + " put on stack 5.");
                            break;

                        case 22:

                            stacks[5].push(s.charAt(i));
                            System.out.println(s.charAt(i) + " put on stack 6.");
                            break;

                        case 26:

                            stacks[6].push(s.charAt(i));
                            System.out.println(s.charAt(i) + " put on stack 7.");
                            break;

                        case 30:

                            stacks[7].push(s.charAt(i));
                            System.out.println(s.charAt(i) + " put on stack 8");
                            break;

                        case 34:

                            stacks[8].push(s.charAt(i));
                            System.out.println(s.charAt(i) + " put on stack 9.");
                            break;

                    }

                }

            }

            s = scr.nextLine();

        }




        // perform the line of input

        // output the top of each stack




    }

    public static Stack revereStack(Stack in){

        Stack out = new Stack<>();

        while(!in.isEmpty()){
            out.push(in.pop());
        }

        return out;




    }

}

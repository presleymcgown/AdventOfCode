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
        Stack[] fnlStacks = new Stack[9];

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

                    if(i == 1){
                        stacks[0].push(s.charAt(i));
                        System.out.println(s.charAt(i) + " put on stack 1.");
                    }else if(i == 5){
                        stacks[1].push(s.charAt(i));
                        System.out.println(s.charAt(i) + " put on stack 2.");
                    }else if(i == 9) {
                        stacks[2].push(s.charAt(i));
                        System.out.println(s.charAt(i) + " put on stack 3.");
                    }else if(i == 13) {
                        stacks[3].push(s.charAt(i));
                        System.out.println(s.charAt(i) + " put on stack 4.");
                    }else if(i == 17) {
                        stacks[4].push(s.charAt(i));
                        System.out.println(s.charAt(i) + " put on stack 5.");
                    }else if(i == 21) {
                        stacks[5].push(s.charAt(i));
                        System.out.println(s.charAt(i) + " put on stack 6.");
                    }else if(i == 25){
                        stacks[6].push(s.charAt(i));
                        System.out.println(s.charAt(i) + " put on stack 7.");
                    }else if(i == 29){
                        stacks[7].push(s.charAt(i));
                        System.out.println(s.charAt(i) + " put on stack 8");
                    }else if(i == 33){
                        stacks[8].push(s.charAt(i));
                        System.out.println(s.charAt(i) + " put on stack 9.");
                    }

                }

            }

            s = scr.nextLine();

        }


        // perform the line of input

        // output the top of each stack

        System.out.println(" ");
        System.out.println("Reversing...");
        System.out.println(" ");

        fnlStacks[0] = reverseStack(stacks[0]);
        fnlStacks[1] = reverseStack(stacks[1]);
        fnlStacks[2] = reverseStack(stacks[2]);
        fnlStacks[3] = reverseStack(stacks[3]);
        fnlStacks[4] = reverseStack(stacks[4]);
        fnlStacks[5] = reverseStack(stacks[5]);
        fnlStacks[6] = reverseStack(stacks[6]);
        fnlStacks[7] = reverseStack(stacks[7]);
        fnlStacks[8] = reverseStack(stacks[8]);

        System.out.println("Stack One: " + fnlStacks[0]);
        System.out.println("Stack Two: " + fnlStacks[1]);
        System.out.println("Stack Three: " + fnlStacks[2]);
        System.out.println("Stack Four: " + fnlStacks[3]);
        System.out.println("Stack Five: " + fnlStacks[4]);
        System.out.println("Stack Six: " + fnlStacks[5]);
        System.out.println("Stack Seven: " + fnlStacks[6]);
        System.out.println("Stack Eight: " + fnlStacks[7]);
        System.out.println("Stack Nine: " + fnlStacks[8]);
        System.out.println(" ");

        s = scr.nextLine();
        s = scr.nextLine();

        int change = 0;
        int extraChange = 0;
        int ogStack = 0;
        int endStack = 0;

        while(scr.hasNextLine()){

            s = scr.nextLine();

            for (int i = 0; i < s.length(); i++) {

                if(s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0'){

                    // IF THE NUMBER HAS AN E IN FRONT IT IS THE CHANGE, M IT IS THE START STACK, AND O IT IS THE END STACK
                    if(s.charAt(i-2) == 'e'){

                        if(s.charAt(i+1) == '1'|| s.charAt(i+1) == '2' || s.charAt(i+1) == '3' || s.charAt(i+1) == '4' || s.charAt(i+1) == '5' || s.charAt(i+1) == '6' || s.charAt(i+1) == '7' || s.charAt(i+1) == '8' || s.charAt(i+1) == '9' || s.charAt(i+1) == '0'){

                            String num = s.charAt(i) + s.charAt(i+1) + "";
                            change = Integer.parseInt((new String(num)));

                            System.out.println(s.charAt(i));
                            System.out.println(s.charAt(i+1));

                            System.out.println(change);



                        }else{

                            String num = s.charAt(i) + "";

                            change = Integer.parseInt((new String(num)));

                        }

                    }else if(s.charAt(i-2) == 'm'){

                        String num = s.charAt(i) + "";

                        ogStack = Integer.parseInt((new String(num)));

                        ogStack -= 1;

                    }else if(s.charAt(i-2) == 'o'){

                        String num = s.charAt(i) + "";

                        endStack = Integer.parseInt((new String(num)));

                        endStack -= 1;

                    }

                }

            }


                for (int i = 0; i < change; i++) {

                    System.out.println("Moving " + (change) + " items from stack " + (ogStack + 1) + " to stack " + (endStack + 1));

                    fnlStacks[endStack].push(fnlStacks[ogStack].pop());

                    System.out.println("End Stack: " + fnlStacks[endStack]);
                    System.out.println("Start Stack: " + fnlStacks[ogStack]);
                    System.out.println(" ");


                }
            }

            change = 0;
            ogStack = 0;
            endStack = 0;

        }


    }

    public static Stack reverseStack(Stack in){

        Stack out = new Stack<>();

        while(!in.isEmpty()){
            out.push(in.pop());
        }

        return out;




    }

}

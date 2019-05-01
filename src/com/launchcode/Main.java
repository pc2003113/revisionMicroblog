package com.launchcode;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Microblog!!!");
        MicroblogMenu microblogMenu= new MicroblogMenu();
        boolean keepGoing = true;

        while(keepGoing){
            microblogMenu.displayMenu();
            int result =microblogMenu.userChoice();
            System.out.println(result);
            microblogMenu.userAction(result);
            if (result==0){
                keepGoing=false;

            }

        }

    }


}

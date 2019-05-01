package com.launchcode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MicroblogMenu {
    //Declaration and initialization


    // constructors


    // methods

    public void displayMenu() {
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Please select what you would like to do from the following list\n" +
                "1- login\n" +
                "2- create a post\n" +
                "3- print all posts\n" +
                "4- print all users\n ");


    }
    public int userChoice(){
        Scanner keyboard= new Scanner(System.in);
        int choice=keyboard.nextInt();
        keyboard.skip("\n");
        return  choice;

    }

    public void userAction(int choice){
        Scanner keyboard= new Scanner(System.in);
        switch(choice){
            case 1:
                System.out.println("Enter the link to your Avatar");
                String userAvatar =keyboard.nextLine();
                System.out.println("Enter your user name ");
                String userName=keyboard.nextLine();
                System.out.println("Enter your first name");
                String firstName=keyboard.nextLine();
                System.out.println("Enter your last name");
                String lastName=keyboard.nextLine();
                System.out.println("Enter your post weblink");
                String webLink=keyboard.nextLine();

                break;


            case 2:
                System.out.println("Enter your post");
                String post= keyboard.nextLine();
                break;

            case 3:
                System.out.println("This is to print all posts");
                break;

            case 4:
                System.out.println("This is to print all users");
                break;

            case 0:
                System.out.println("Bye bye.. see you next time");
                break;

            default:
                System.out.println("Wrong entry. Try again.");
                break;

        }








    }
    {





    }

}

/*
Challenge #1 Easy
=================
create a program that will ask the users name, age, and reddit username. have it tell them the information back, in the format:
your name is (blank), you are (blank) years old, and your username is (blank)
for extra credit, have the program log this information in a file to be accessed later.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Challenge1
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = "";
        String username = "";
        int age = 0;

        try
        {
            System.out.print("Please enter your name: ");
            name = br.readLine();
            System.out.print("Please enter your age: ");
            age = Integer.parseInt(br.readLine());
            System.out.print("Please enter your reddit username: ");
            username = br.readLine();

            System.out.print("Your name is " + name);
            System.out.print(", you are " + age + " years old, ");
            System.out.print("and your reddit username is " + username + ".\n");
        }
        catch(IOException e)
        {
            System.err.println("Error: " + e);
        }
    }
}

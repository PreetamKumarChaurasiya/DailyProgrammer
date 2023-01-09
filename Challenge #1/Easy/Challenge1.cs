/*
    Challenge #1 Easy
    =================
    create a program that will ask the users name, age, and reddit username. have it tell them the information back, in the format:
    your name is (blank), you are (blank) years old, and your username is (blank)
    for extra credit, have the program log this information in a file to be accessed later.
*/

using System;
using System.IO;

public class Challenge1
{
    public static void Main()
    {
        String name = "";
        String username = "";
        int age = 0;

        Console.Write("Please enter your name: ");
        name = Console.ReadLine();
        Console.Write("Please enter your age: ");
        age = int.Parse(Console.ReadLine());
        Console.Write("Please enter your reddit username: ");
        username = Console.ReadLine();

        Console.WriteLine("Your name is {0}, you are {1} years old, and your username is {2}.", name, age, username);
    }
}

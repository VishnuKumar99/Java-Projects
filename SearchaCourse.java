package com.company;

import java.util.Scanner;

//import java.util.*;
public class SearchaCourse {
//Main class
        public static void main(String[] args)
        {
            //Taking user input using Scanner class

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of course: ");
            int number = sc.nextInt();
            //Entering the total number of courses
            //If it is less than or equal to 0 it will print invalid range
            if(number<=0)
            {
                System.out.println("Invalid Range");
            }

            //If the number of course entered is more than 20, it will print the respective message
            else if(number>20)
            {
                System.out.println("Maximum number of courses should be 20");
            }

            //otherwise it will initialise an array of given number
            else
            {
                String[] course = new String[number];
                System.out.println("Enter course names: ");

                for(int i=0; i<number; i++)
                {
                    course[i] = sc.next();
                }

                //Entering the course to be searched
                System.out.println("Enter the course to be searched: ");
                String search = sc.next();

                //Creating an object of main class and calling the method
                SearchaCourse obj = new SearchaCourse();
                boolean flag = obj.searchCourse(course, search);

                //If flag is true, that means course is available
                if(flag)
                {
                    System.out.println(search+" course is available");
                }

                //else it is not available
                else
                {
                    System.out.println(search+" course is not available");
                }
            }
        }

        //Function to search for a course in an entered array

        boolean searchCourse(String[] course, String search)
        {
            boolean flag = false;

            //for loop to traverse the array
            for(int i=0; i<course.length; i++)
            {
                String res = course[i]; //If it founds, it will set the flag value to true and came out of loop and return the flag value
                if(res.equals(search))
                {
                    flag = true;
                    break;
                }
            }
            return flag;
        }
    }

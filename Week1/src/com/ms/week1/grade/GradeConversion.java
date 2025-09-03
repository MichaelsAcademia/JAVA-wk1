package com.ms.week1.grade;

/**
 * @author Michael Santiago
 * Retrieving grades from user and them resulting the avg.
 */

import java.util.Scanner;

public class GradeConversion {

    public static void main(String[] args) {
    	 
        double avg_grade = 0;
        double num_of_grades = 0;
        String name;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter students name: ");
        name = sc.next();
        
        boolean finished_input = false;
        do {
            
            System.out.println("Please input grade: ");
            
            double grade = sc.nextDouble();
            
            if(grade == 999) {
                finished_input = true;
                break;
            }
            
            avg_grade += grade;
            
            num_of_grades += 1;
            
        } while (!finished_input);
        
        
        System.out.printf("The Final Grade for %s is %f%n", name, (avg_grade / num_of_grades));
        
        sc.close();
    }

}

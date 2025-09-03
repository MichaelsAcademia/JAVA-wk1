package com.ms.week1.grade2;

/**
 * @author Michael Santiago
 * Same as com.ms.week1.grade except we will display the letter grade
 */

import java.util.Scanner;

public class GradeCalculations {

	public static void main(String[] args) {

		double grade_total = 0;
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
            
            grade_total += grade;
            
            num_of_grades += 1;
            
        } while (!finished_input);
        
        double avg_grade = grade_total / num_of_grades;
        
        char grade;
        
        if(avg_grade >= 80) {
        	grade = 'A';
        }
        else if (avg_grade >= 60) {
        	grade = 'B';
        }
        else if (avg_grade >= 40) {
        	grade = 'C';
        }
        else {
        	grade = 'D';
        }
        
        System.out.printf("The Final Grade for %s is %c%n", name, grade);
        
        sc.close();
	}

}

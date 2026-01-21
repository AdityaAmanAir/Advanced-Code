//Decision making in Java

import java.util.*;
public class class3b{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Attendance status (TRUE/falSE) : ");
        boolean present = sc.nextBoolean();
        if(present){
            System.out.print("Attendance will be given\nEnter the marks : ");
            double marks = sc.nextDouble();
            if(marks>90){
                System.out.println("A");
            }else if(marks>80 && marks<=90){
                System.out.println("B");
            }else if(marks>70 && marks<=80){
                System.out.println("C");
            }else if(marks>60 && marks<=70){
                System.out.println("D");
            }else{
                System.out.println("F");
            }

        }
        else{
            System.out.print("Attendance will not be given\n Enter the total attandance % :");
            double attandance=sc.nextDouble();
            if(attandance>=75.0){
                System.out.println("He/she can give Exam!!!");
            }else{
                System.out.println("He/she MUST Drop Engineering !!!!!!!");
            }

        }
        System.out.println("Enter there BRANCH!!!");
        String branch = sc.next();
        switch(branch){
            case "CSE":
            System.out.println("You are in Computer Science and Engineering");
            break;
            case "ECE":
            System.out.println("You are in ECE");
            break;
            case "EEE":
            System.out.println("You are in EEE");
            break;
            case "MECH":
            System.out.println("You are in MECH");
            break;
            case "CIVIL":
            System.out.println("You are in CIVIL");
            break;
            default:
            System.out.println("You are not in any branch");
            //once of the statement get true the flag is set to true... (only one flag is used in switch case)
            //that's why we use break
        }

        //Ternary operator
        int a=10;
        int b=20;
        int c=(a>b)?a:b;
        System.out.println(c);
        System.out.println(((c>b)?"C is bigger":"Both are same"));

        //while, do-while, for-each
        int[] arr=new int[5];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j:arr){ //This is called for-each, lol xD
            System.out.println(j);
        }
    }
}
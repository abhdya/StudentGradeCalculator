import java.util.Scanner;

public class CodSoft2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int num_sub = sc.nextInt();

        sc.nextLine();

        int i=1;
        int total_marks=0;
        while(i<=num_sub){
            System.out.print("Enter subject name : ");
            String sub_name = sc.nextLine();
            System.out.print("Enter subject marks : ");
            int sub_marks = sc.nextInt();
            total_marks += sub_marks;
            i++;

            sc.nextLine();
        }

        int grade = total_marks/num_sub;
        float percentage = grade;
        int cgpa;

        System.out.println("Percentage of student is : " + percentage);

        if(percentage>=90){
            cgpa = 10;
        }
        else if(percentage>=80){
            cgpa = 9;
        }
        else if(percentage>=70){
            cgpa = 8;
        }
        else if(percentage>=60){
            cgpa = 7;
        }
        else if(percentage>50){
            cgpa = 6;
        }
        else if(percentage>40){
            cgpa = 5;
        }
        else{
            cgpa = 4;
        }

        switch(cgpa){
            case 10:
                System.out.println("CGPA is 10");
                break;
            case 9:
                System.out.println("CGPA is 9");
                break;
            case 8:
                System.out.println("CGPA is 8");
                break;
            case 7:
                System.out.println("CGPA is 7");
                break;
            case 6:
                System.out.println("CGPA is 6");
                break;
            case 5:
                System.out.println("CGPA is 5");
                break;
            default:
                System.out.println("CGPA is 4 or lower");
                break;
        }
        sc.close();

    }
}

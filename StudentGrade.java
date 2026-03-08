/* in db there are N number of students the feilds of the table are Name, aeg, grade, gender 
	->Return the names of the students who are greater than 20 years old
	->Calculate the average of the grades (using the ASCII values for the female candidates)

*/

import java.util.Scanner;
import java.util.Arrays;

class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] stuDetails = new String[n][4];
        for(int i=0;i<n;i++){
            System.out.print("Enter the name of the student: ");
            stuDetails[i][0] = sc.nextLine();
            
            System.out.print("Enter the age of the student: ");
            stuDetails[i][1] = sc.nextLine();
            
            System.out.print("Enter the grade of the student: ");
            stuDetails[i][2] = sc.nextLine();
            
            System.out.print("Enter the gender of the student: ");
            stuDetails[i][3] = sc.nextLine();
        }
        for(String[] r: stuDetails){
            System.out.println(Arrays.toString(r));
        }
        cal(stuDetails);
    }
    public static void cal(String[][] str){
        StringBuilder ageGreater = new StringBuilder();
        for(String[] r: str){
            if(Integer.parseInt(r[1]) > 20){
                ageGreater.append(r[0]).append(" ");
            }
        }
        System.out.println(ageGreater.toString());
        int femaleAverage= 0;
        int femaleCount=0;
        for(String[] r: str){
            if(r[3].toLowerCase().equals("female")){
                femaleCount++;
                femaleAverage += (int) r[2].charAt(0);
            }
        }
        System.out.println(femaleAverage/femaleCount);
        
    }
    
}
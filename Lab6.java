/* This program is designed to calculate the final grade of a student
 * in their CISC3130 class
 */
import java.util.Scanner;

public class Lab6 {

 public static void main(String args[]) {
   
  int practiceProbs[] = new int [8]; //there are 8 total practice problems
  int lab[] = new int [7]; // there are 7 total lab assignments
  int midterms[] = new int [2]; //there are two midterms
  int finalExam; //there is one final exam
  int totalPracticeProbs = 0; //initializes the total score of practice problems to zero
  int totalLabs = 0; //initializes the total score of labworks to zero
  int totalMidterms = 0; //initializes the total  score of midterms to zero
  
  Scanner scanner = new Scanner(System.in);
  System.out.println("This program will calculate your final grade for CISC3130.\n");
  System.out.print("Please enter your 8 scores for Practice problems: ");
  
  //for loop assigns values entered into scanner into practice problem array
  for(int i = 0; i < practiceProbs.length; i++) {
    practiceProbs[i] = scanner.nextInt();
  }
  totalPracticeProbs = total(practiceProbs); //calculates total of all practice probs
  
  System.out.print("Please enter your 7 scores for lab assignments: ");
  for(int i = 0; i < lab.length; i++) {
   lab[i] = scanner.nextInt();
  }
  totalLabs = total(lab);//calls method total to calculate total of all lab scores
  
  System.out.print("Please enter your 2 Midterm scores: ");
  for(int i = 0; i < midterms.length; i++) {
   midterms[i] = scanner.nextInt();
  }
  totalMidterms = total(midterms); //calls method total to calculate total of all midterms
  
  System.out.print("Please enter your Final exam score: ");
  finalExam = scanner.nextInt(); //only one grade
  
  int finalGrade =  totalPracticeProbs + totalLabs + totalMidterms + finalExam;
  
  System.out.println("Your final grade for CISC3130 is "+ finalGrade);
  System.out.println("Your letter grade for CISC3130 is " + letterGrade(finalGrade)); 
 }
 
 //method calculates total of all numbers in the array
 public static int total(int[] array) { 
   int total = 0; 
   for (int i : array) { 
     total = total + i; 
   } 
   return total; 
 }

 //method converts numerical grade into letter grade
 public static char letterGrade(double grade) {
  char letter;
  if(grade < 60)
   letter = 'F';
  else if(grade >= 60 && grade <= 69)
   letter = 'D';
  else if(grade >= 70 && grade <= 79)
   letter = 'C';
  else if(grade >= 80 && grade <= 89)
   letter = 'B';
  else
   letter = 'A';
  return letter;
 }
}
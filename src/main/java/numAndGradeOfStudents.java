import java.util.InputMismatchException;
import java.util.Scanner;

public class numAndGradeOfStudents {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] stuGrades;

        System.out.println("enter the number of students:");
        int numOfStudents = s.nextInt();
        stuGrades = new int[numOfStudents];

        System.out.println("enter the grade of students:");

        for (int a = 0; a < numOfStudents; a++) {
            try {
                Scanner scan = new Scanner(System.in);
                int i = scan.nextInt();
              try {
                  if (i < 0 || i > 100) {

                      throw new notValidMarks("invalid input as defined");
                  }
                  for(a=0;a< numOfStudents;a++){
                      stuGrades[i]=scan.nextInt();
                  }

              }
              catch (notValidMarks ex)
                {
                    System.out.println(ex.getMessage());
                    a--;

                }


         }catch (InputMismatchException e) {
                System.out.println(e);
                a--;}
            }


            }


        }

        class notValidMarks extends Exception {
            public notValidMarks(String s) {
                // Call constructor of parent Exception
                super(s);
            }

        }




























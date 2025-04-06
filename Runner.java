import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class Runner {

        public static void main(String[] args)
        {
            String input;     // To hold input
            int questions;    // Number of questions
            int missed;       // Number of questions missed
            boolean validInput = false;
            
            while (!validInput) {
               try {
                   // Get the number of questions on the exam
                   qinput = JOptionPane.showInputDialog("How many questions are on the exam?");
                   questions = Integer.parseInt(qinput);

                   // Get the number of questions the student missed
                   minput = JOptionPane.showInputDialog("How many questions did the student miss?");
                   missed = Integer.parseInt(minput);
                   
                   if (questions <= 0) {
                      throw new ArithmeticException("Total number of questions must be greater than zero.");
                   }
                   
                   validInput = true; //Input is valid, break the Loop
                   } catch (NumberFormatException e) {
                     JOptionPane.showMessageDialog(null, "Invalid input. Please enter integers only.");
                   } catch (ArithmeticException e) {
                     JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                   }
            }
              

            // Create an Exam object
            Exam exam = new Exam(questions, missed);

            // Display the test results
            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();
            JOptionPane.showMessageDialog(null, message);

            System.exit(0);
        }
    }



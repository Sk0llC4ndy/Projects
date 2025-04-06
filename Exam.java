public class Exam extends Assessment { 
   private int NumQuestions; // total number of questions
   private int NumMissed; // Number of Missed Questions
   private double pointsEach; //Points that the questions are worth
   
   /** 
   Constructor to intialize exam
   * Params total number of questions
   * Params number of not missed questions
   */
   public Exam(int questions, int missed) {
            if (questions <= 0) {
        throw new IllegalArgumentException("Number of questions must be greater than 0.");
   }
   this.NumQuestions = questions;
   this.NumMissed = missed;
   this.pointsEach = 100.0 / questions; //Points of each question depends on size
   
   //calculating score
   int score = (int) Math.round(100.0 - (missed * pointsEach));
   setScore(score); //Stores score within the superclass
 }
 
 /** 
 * Returns the points each question is worth
 * return points per question.
 */
 public double getPointsEach() {
   return pointsEach;
 }
}

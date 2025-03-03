import java.text.DecimalFormat;
//Import for correcting the quotient decimal formatting
//Welcome to the Calculator program
//insert two numbers and the calculator with catanate the results of sum, subtraction, multiplying, and division
public class Calc {
    private double [][] numbers;

    // Custom constructor (size = argument)
    public Calc() {
        this.numbers = new double[1][2];
    }

    // Getters
    public double getNum1(int index) {
        return numbers[index][0];
    }

    public double getNum2(int index) {
        return numbers[index][1];
    }

    // Setters
    public void setNum1(int index, double num1) {
        this.numbers[index][0] = num1;
    }

    public void setNum2(int index, double num2) {
        this.numbers[index][1] = num2;
    }
    
        // Calculate sum
    public double add(int index) {
        return numbers[index][0] + numbers[index][1];
    }
    
    // Calculate subtraction
    public double subtract(int index) {
        return numbers[index][0] - numbers[index][1];
    }
    // Calculate multiplication
    public double multiply(int index) {
        return numbers[index][0] * numbers[index][1];
    }
    
    // Calculate division (with zero check)
      public double divide(int index) {
        if (numbers[index][1] == 0) {
            System.out.println("Error: Cannot divide by zero at index " + index);
            return Double.NaN; // NaN = "Not a Number"
        }
        return numbers[index][0] / numbers[index][1];
    }
    
    // Override toString to display numbers
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            result.append("Index " + i + ": Num1 = " + numbers[i][0] + ", Num2 = " + numbers[i][1] + "\n");
        }
        return result.toString();
    }
}

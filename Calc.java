public class Calc {
    private double Num1;
    private double Num2;

    // Custom constructor (no-arg)
    public Calc() {
        this.Num1 = 0;
        this.Num2 = 0;
    }

    // Getters
    public double getNum1() {
        return Num1;
    }

    public double getNum2() {
        return Num2;
    }

    // Setters
    public void setNum1(double Num1) {
        this.Num1 = Num1;
    }

    public void setNum2(double Num2) {
        this.Num2 = Num2;
    }

    // Calculate sum
    public double add() {
        return Num1 + Num2;
    }

    // Calculate subtraction
    public double subtract() {
        return Num1 - Num2;
    }

    // Calculate multiplication
    public double multiply() {
        return Num1 * Num2;
    }

    // Calculate division (with zero check)
    public double divide() {
        if (Num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // NaN = "Not a Number"
        }
        return Num1 / Num2;
    }

    // Override toString to display numbers
    @Override
    public String toString() {
        return "First number: " + Num1 + ", Second number: " + Num2;
    }
}

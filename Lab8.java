import java.io.*;

public class Lab8 {
    public static void main(String[] args) throws IOException {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";
        //could be replaced with Filewriter if needed
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
       
        writer.write("EmpID,PayRate,Hours,Weekly Pay");
        writer.newLine();

        String line;
        reader.readLine(); // skip header
         //Do Wednesday
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(",");

            String empId = fields[0];
            double payRate = Double.parseDouble(fields[1]);
            double hours = Double.parseDouble(fields[2]);

            double weeklyPay;
            //calculate weeklyPay while accounting for overtime
            //Do saturday
            if (hours > 40) {
                double overtime = hours - 40;
                weeklyPay = (40 * payRate) + (overtime * payRate * 1.5);
            } else {
                weeklyPay = hours * payRate;
            }

            String formattedPay = String.format("$%.2f", weeklyPay);
            String outputLine = empId + "," + payRate + "," + hours + "," + formattedPay;

            writer.write(outputLine);
            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}

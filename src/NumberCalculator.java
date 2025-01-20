package numbercalculator;

import javax.swing.JOptionPane;

public class NumberCalculator {
    public static void main(String[] args) {
        double[] numbers = new double[6];
        double total = 0;
        
        for (int i = 0; i < 6; i++) {
            String input = JOptionPane.showInputDialog(null, 
                "Enter number " + (i + 1) + ":",
                "Input Number", 
                JOptionPane.QUESTION_MESSAGE);
            try {
                numbers[i] = Double.parseDouble(input);
                total += numbers[i];
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, 
                    "Invalid input. Please enter a valid number.",
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                i--;
            }
        }

        double average = total / 6;

        StringBuilder output = new StringBuilder("Numbers entered:\n");
        for (double num : numbers) {
            output.append(num).append("\n");
        }
        output.append("\nTotal: ").append(total);
        output.append("\nAverage: ").append(average);

        JOptionPane.showMessageDialog(null, 
            output.toString(), 
            "Results", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}

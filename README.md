
# Java Number Calculator

A simple Java application that allows users to input six numbers and calculates the total and average of those numbers. The program features a graphical user interface (GUI) built using Java Swing.

## Features

- Input validation to ensure valid numbers are entered.
- Displays the numbers entered along with their total and average.
- User-friendly interface with pop-up dialogs for input and results.

## Requirements

- Java Development Kit (JDK) 8 or later.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/nurulashraf/NumberCalculator.git
   cd NumberCalculator
   ```

2. Compile the program:
   ```bash
   javac -d . NumberCalculator.java
   ```

3. Run the application:
   ```bash
   java numbercalculator.NumberCalculator
   ```

## Code Overview

- The program uses Java Swing for the GUI to prompt users for inputs and display results.
- Input validation ensures users are prompted again if invalid data is entered.
- The results include:
  - A list of the numbers entered.
  - The total of the numbers.
  - The average of the numbers.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Java-Assignment-8
Exception Handling in Java

# PART - 1
This repository contains Java code for exception handling examples.

Contents:
FactorialException.java: A custom exception class for factorial calculation example.
ExceptionDemo.java: A Java program that demonstrates exception handling for user input validation.

The factorial of 'n' numbers supplied as command line arguments is calculated by this Java programme (CLA). The programme checks if integer values fall inside a specific range using its own exception class named "FactorialException".

FactorialException-
The FactorialException is a custom exception class that extends the Exception class. When the input integer is outside of range, this exception is raised. The boundaries are 0 to 15. A parameterized constructor for this class sets an integer as an instance variable after accepting an integer as input. The incorrect input value is included in the custom message that is returned by overriding the toString() method.

ExceptionDemo-
The ExceptionDemo class is the main class that contains the main() method. The try-catch block is used in this program to manage exceptions. The program accepts various integer inputs from the user using command line arguments (CLA) in the main() method. The factorial() method is used to get the factorial of each integer input. A FactorialException is thrown by the program if the input integer is not within the range of 0 to 15. NumberFormatException is thrown in the event that the input is not an integer. The catch block is used to handle these exceptions.

The program prints the calculated factorial of that integer if the input is correct.


# PART - 2

This repository contains Java code that demonstrates the use of custom exception handling.

Contents:
A custom exception class for ensuring the accuracy of user input is NOMATCHEXCP.java.
A Java programme called ExceptionDemo2.java shows how to handle exceptions with NOMATCHEXCP.

This Java code illustrates the use of user-defined exception classes by defining the NOMATCHEXCP exception class. This class's function is to validate user input by raising an exception when a string entered by the user is not equivalent to "India".

The parameterized constructor of the NOMATCHEXCP class accepts a string argument that represents the input that generated the exception. The user-inputted incorrect string and the line number are included in the exception message that is produced by overriding the toString() method.

The Scanner class is used by the ExceptionDemo programme to collect keyboard input from users. A custom exception NOMATCHEXCP is issued and collected to provide an error message if the input text is not "India". A success message is shown if the input string is "India".

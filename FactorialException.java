// Custom exception class for factorial calculation
class FactorialException extends Exception {
    // Instance variable to store the out of range value
    private int num;
    // Constructor that takes the out of range value as an argument
    public FactorialException(int num) {
        this.num = num;
    }
    // Override the toString() method to provide a custom error message
    @Override
    public String toString() {
        return "FactorialException: " + num + " is out of range (0-15)";
    }
}

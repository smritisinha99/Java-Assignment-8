// Custom exception class for input validation
class NOMATCHEXCP extends Exception {
    // Instance variable to store the input string that caused the exception
    private String inputString;
    // Constructor that takes the input string as an argument
    public NOMATCHEXCP(String inputString) {
        this.inputString = inputString;
    }
    // Override the toString() method to provide a custom error message
    @Override
    public String toString() {
        return "NOMATCHEXCP at line " + Thread.currentThread().getStackTrace()[2].getLineNumber() +
                ": Input string \"" + inputString + "\" does not match expected value \"India\"";
    }
}
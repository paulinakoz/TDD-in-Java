public class Calculator {
    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public double divide(int firstNumber, int secondNumber) {
        if(secondNumber == 0){
            throw new ArithmeticException("can't divide by zero");
        }
        return firstNumber / secondNumber;
    }
}

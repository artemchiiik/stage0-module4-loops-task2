package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        System.out.println(1);
        int counter = 1;
        while (counter <= printToInclusive){
            int number = counter;
            int factorial = 1;
            while (number >= 1){
                factorial *= number;
                number--;
            }
            System.out.println(factorial);
            counter++;
        }
    }
}

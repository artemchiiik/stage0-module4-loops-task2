package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while(counter <= printToInclusive){
            int divider = 2;
            int number = 0;
            while(divider < counter){
                if (counter % divider == 0){
                    number++;
                }
                divider++;
            }
            if(number == 0){
                System.out.println(counter);
            }
            counter++;
        }
    }
}

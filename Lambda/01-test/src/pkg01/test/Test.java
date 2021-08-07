package pkg01.test;

import java.util.*;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 3 ,1);
        Collections.sort(numbers);
        
        for(Integer number : numbers) {
            System.out.println(number);
        }
        
        Sortowanie s = () -> {
            Collections.sort(numbers, Collections.reverseOrder());
        }; 
        s.sort();
        Consumer<Integer> intetgerConsumer = n -> System.out.println(n);
        numbers.forEach(intetgerConsumer);
        
    }
    
}

interface Sortowanie {
    void sort();
}
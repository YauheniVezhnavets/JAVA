

package by.epam.cycle.task;

import java.math.BigInteger;
//(решена)
//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Task04 {
    public static void main(String[] args) {


        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= 200; i++) {
            result = result.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(result);

    }
}

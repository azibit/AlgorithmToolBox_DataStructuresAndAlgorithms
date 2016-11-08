/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author azibit
 */
public class MaximumPairwise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        long[] numbers = new long[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = scanner.nextInt();
        }

        long temp = 0;

        long maximumNumber = numbers[0];
        long secondMaxNumber = numbers[1];

        if (secondMaxNumber > maximumNumber) {
            maximumNumber = numbers[1];
            secondMaxNumber = numbers[0];
        }

        for (int i = 2; i < numberOfElements; i++) {
            if (numbers[i] > maximumNumber) {
              secondMaxNumber = maximumNumber;
              maximumNumber = numbers[i];
            } else if (numbers[i] > secondMaxNumber) {
                secondMaxNumber = numbers[i];
            }
        }

        System.out.println(maximumNumber * secondMaxNumber);

    }


}

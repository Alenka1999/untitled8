package com.skypro;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        // 1
        int [] numbers = new  int[12];
        numbers [0] = 1;
        int OneNumbers = numbers [0];
        numbers [1] = 2;
        int TwoNumbers = numbers [1];
        numbers [2] = 3;
        int ThreeNumbers = numbers [2];
        for (int i = 0; i < 12; i++) {
            if (numbers [i] % 2!=0) numbers [i]+=1; {
                System.out.print(numbers [i]);
            }
            
        }
        System.out.print(OneNumbers + ",");
        System.out.print(TwoNumbers + ",");
        System.out.print(ThreeNumbers );
        System.out.println();

        // 2
        float [] numbers1 = {1,57, 7,654, 9,986, 0, 0, 0, 0, 0, 0, 0, 0, 0} ;
        float OneNumbers1 = numbers1 [0];
        float TwoNumbers1 = numbers1 [1];
        float ThreeNumbers1 = numbers [2];
        System.out.print(OneNumbers1 + ",");
        System.out.print(TwoNumbers + ",");
        System.out.print(ThreeNumbers);
        System.out.println();

        // 3
        int [] weights = {3, 5, 7};
        int BacketWeightAggs = weights [0];
        int BacketWeightJuice = weights [1];
        int BacketWeighLemons = weights [2];
        System.out.print(BacketWeightAggs + ",");
        System.out.print(BacketWeightJuice + ",");
        System.out.print(BacketWeighLemons);
        System.out.println();

        // Задание 3
        System.out.print(ThreeNumbers + ",");
        System.out.print(TwoNumbers + ",");
        System.out.print(OneNumbers);
        System.out.println();

        System.out.print(ThreeNumbers + ",");
        System.out.print(TwoNumbers + ",");
        System.out.print(OneNumbers);
        System.out.println();

        System.out.print(BacketWeighLemons + ",");
        System.out.print(BacketWeightJuice + ",");
        System.out.print(BacketWeightAggs);







    }
}

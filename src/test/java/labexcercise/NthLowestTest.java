package labexcercise;

import labexcercise.NthLowest;


public class NthLowestTest {

    public NthLowestTest() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] params) {
        NthLowest test1 = new NthLowest();
        int[] input1 = { 1, 5, 3, 4, 7, 9, 2 };
        System.out.println(test1.getNthLowest(input1, 5));
        System.out.println(test1.getNthLowest(input1, 10));
        System.out.println(test1.getNthLowest(input1, -1));

    }
}

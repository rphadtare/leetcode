package leetcode.arr.solutions;

public class Sample {

    public static int findMid(int a, int b, int c){
        System.out.println("Mid of Value of a: " + a + " b: " + b + " c: " + c);
        return (a > b) ? ( (a < c) ? a : (c > b) ? c : b ):  ((a > c) ? a : (c > b) ? c : b);
    }


    public static void main(String[] args) {

        //int a=26, b = 12, c = 5;
        //int max = (a > b)? (a > c? a : c) : (b > c? b : c);
        //int min = (a < b)? (a < c? a : c) : (b < c? b : c);

        /*
            System.out.println(findMid(26, 12, 5));
            System.out.println(findMid(26, 5, 12));
            System.out.println(findMid(12, 5, 26));
            System.out.println(findMid(12, 26, 5));
         */

         // for each
        int[] arr = new int[]{1,2,3,4,5};

        for(int i=0; i < 5; i++){
            System.out.println(arr[i]);
        }

        for(int i : arr){
            System.out.println(i*i);
        }



    }
}

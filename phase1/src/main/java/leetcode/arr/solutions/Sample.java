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
            System.out.println(findMid(26, 5 , 12));
            System.out.println(findMid(12,5 , 26));
            System.out.println(findMid(12,26 , 5));
         */

        //break example
        for(int i = 0 ; i < 10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }

        //continue
        for(int i = 0 ; i < 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }


    }
}

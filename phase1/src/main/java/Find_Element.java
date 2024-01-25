// you can also use imports, for example:
import java.util.*;

public class Find_Element {

    // you can write to stdout for debugging purposes, e.g.
    // System.out.println("this is a debug message");

    public static int solution(int[] A) {

        HashMap<Integer, Integer> map =
                new HashMap<Integer, Integer>();

        for(int ele : A){
            map.put(ele, ele);
        }

        Set<Integer> set = map.keySet();

        Integer[] input_arr = set.toArray(new Integer[set.size()]);
        Arrays.sort(input_arr);

        System.out.println("Sorted array: ");
        for(int ele: input_arr){
            System.out.println(ele);
        }

        int num = 1;
        for(int i=0;i<input_arr.length;i++){
            if(num == input_arr[i]){
                num += 1;
            } else {
                break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int result = solution(new int[]{2,1,3,5,7,4});
        System.out.println("Result: " + result);

    }



}

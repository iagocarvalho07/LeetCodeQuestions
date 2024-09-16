import Easy.TowSun;

import java.util.Arrays;

public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] arr = {2, 7, 11, 15};
    TowSun as = new TowSun();
    System.out.println(Arrays.toString(as.twoSum(arr, 8)));
}
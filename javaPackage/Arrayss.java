package javaPackage;

import java.util.Arrays;

public class Arrayss {
    public static void main (String[] args){
    int [] numbers = new int [5];
    numbers[0] =1;
    numbers[1] =2;
    System.out.println(numbers);
    int [] numbers1 ={2,3,5,1,4};
    System.out.println(numbers1.length);
    Arrays.sort(numbers1);
    System.out.println(Arrays.toString(numbers1));
    int [][] numbers2 = new int[2][3];
    numbers2[0][0]=1;
    numbers2[1][0]=2;
    System.out.println(Arrays.deepToString(numbers2));
    int numbers3[][] = {{1,2,3},{4,5,6}};
    System.out.println(Arrays.deepToString(numbers3));
    //constant
    final float PI=3.14F;
    

}}

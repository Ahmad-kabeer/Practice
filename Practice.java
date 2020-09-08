package com.company;
import java.util.*;
public class Practice {
    public static boolean IsPalindrome(int element){
        int n,sum=0;
        int temp=element;
        while (element>0){
            n=element%10;
            sum=(sum*10)+n;
            element=element/10;
        }
        if(temp==sum){
            return true;
        }
        return false;
    }
    public static boolean IsArmstrong(int element){
        int temp=element;
        int n,sum=0;
        while (element>0){
            n=element%10;
            sum=sum+(n*n*n);
            element=element/10;
        }
        if(temp==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] arg){
        System.out.println(Practice.IsPalindrome(121));
        System.out.println(Practice.IsArmstrong(370));
    }
}

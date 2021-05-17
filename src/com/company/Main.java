package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The area is:"+   getArea(123,786));
        System.out.println("Fullname is "+fullName("Anold","Kupara"));
        System.out.println("My Truth "+isTrue(true,false));
    }
    public static int getArea(int width,int height){
        return width * height;
    }

    public static String fullName(String firstName,String lastName){
        return firstName +" "+lastName;
    }

    public  static boolean isTrue(boolean a, boolean b){
        if(a!=b){
            return a;
        }else {
            return b;
        }
    }
}

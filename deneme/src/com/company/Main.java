package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int literature = sc.nextInt();
        int history = sc.nextInt();
        int musics = sc.nextInt();

        double average = (maths+physics+chemistry+literature+history+musics)/6;

        System.out.println(average);
    }
}

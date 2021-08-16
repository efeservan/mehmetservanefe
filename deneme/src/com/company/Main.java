package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Matematik notunu gir : ");
        int maths = sc.nextInt();
        System.out.print("Fizik notunu gir : ");
        int physics = sc.nextInt();
        System.out.print("Kimya notunu gir : ");
        int chemistry = sc.nextInt();
        System.out.print("Turkce notunu gir : ");
        int literature = sc.nextInt();
        System.out.print("Tarih notunu gir : ");
        int history = sc.nextInt();
        System.out.print("Muzik notunu gir : ");
        int musics = sc.nextInt();

        double average = (maths+physics+chemistry+literature+history+musics)/6;

        System.out.println(average);

        if(average>60){
            System.out.println("Sinifi gecti");
        }
        else{
            System.out.println("Sinifta kaldi");
        }

    }
}

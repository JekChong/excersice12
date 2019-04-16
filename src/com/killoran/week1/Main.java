package com.killoran.week1;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Queue<Integer>  q = new LinkedList<>();

        q.add(12);
        q.add(13);
        q.add(14);
        q.add(enqueue());

        System.out.println(q);

        System.out.println("now we remove the head of the list" );

        int remove = q.remove();


        System.out.println(q);


    }
    public static int enqueue(){

        System.out.println("please add an integer to the list");
        Scanner input = new Scanner(System.in);
        int newOb = input.nextInt();
        return newOb;
    }

}

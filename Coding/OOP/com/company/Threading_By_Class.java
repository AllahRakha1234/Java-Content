
package com.company;
class Thread1 extends Thread{
    @Override
    public void run(){
        int i = 0 ;
        while (i<20){
        System.out.println("I am thread 1.....");
        i++;
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        int i = 0 ;
        while (i<20){
            System.out.println("I am thread 2.....");
            i++;
        }
    }
}
public class Threading_By_Class {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}

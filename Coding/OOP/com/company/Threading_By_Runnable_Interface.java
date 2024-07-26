
package com.company;
class MyThread1 implements Runnable{
    @Override
    public void run(){
        int i = 0 ;
        while (i<20){
            System.out.println("I am thread 1.....");
            i++;
        }
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run(){
        int i = 0 ;
        while (i<20){
            System.out.println("I am thread 1.....");
            i++;
        }
    }
}
public class Threading_By_Runnable_Interface {
    public static void main(String[] args) {
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//        t1.start();
//        t2.start();

        // Another way to run threads
        Thread1 t1 = new Thread1();
        Thread tt1 = new Thread(t1);
        Thread2 t2 = new Thread2();
        Thread tt2 = new Thread(t2);
        tt1.start();
        tt2.start();
    }
}


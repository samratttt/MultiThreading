// Java MultiThreading : executing multiple path of code at same time
// achieving multithreading by extending Thread class and overriding run()

import java.lang.Thread;
public class Main extends Thread{

    @Override
    public void run(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }

    public static void main(String[] args){

        // make object and invoke with start() method inPlace of run()
        // can on acheive multithreading by using start() method
        Main myThread = new Main();
        Main myThead1 = new Main();
        myThread.start();
        myThead1.start();

        // we will get random answers as we cannot decide which thread we run first
    }
}
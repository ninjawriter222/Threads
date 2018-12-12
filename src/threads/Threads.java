/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;
class RunningThread implements Runnable{    
    Thread runner;
    public RunningThread(){
    }
    public RunningThread(String numbahOne){
        runner = new Thread(this, numbahOne);// This creats a new thread
        System.out.println(runner.getName());
        runner.start();// this starts our new thread we just made.
    }
    public void run() {
        System.out.println(Thread.currentThread());
    }
}
/**
 *
 * @author Poozer
 */
public class Threads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunningThread(), "Bert");
        Thread thread2 = new Thread(new RunningThread(), "Ernie");
        RunningThread thread3 = new RunningThread("Elmo");
        thread1.start();
        thread2.start();
        try{
            Thread.currentThread().sleep(1000);
        } catch(InterruptedException e){
        }
        System.out.println(Thread.currentThread());
    }
    
}

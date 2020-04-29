/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizbasicthreadimplementsrunnable;

/**
 *
 * @author ooigi
 */
public class QuizBasicThreadImplementsRunnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Thread Thread1 = new Thread(new MyThread());
      Thread Thread2 = new Thread(new MyThread());
      Thread Thread3 = new Thread(new MyThread());
      
      Thread1.start();
      Thread2.start();     
      Thread3.start();
    }
    
}

class MyThread implements Runnable {

    @Override
    public void run() {
    System.out.println(Thread.currentThread().getName());
    
        }
    }
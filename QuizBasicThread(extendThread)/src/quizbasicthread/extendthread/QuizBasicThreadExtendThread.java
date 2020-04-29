/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizbasicthread.extendthread;

/**
 *
 * @author ooigi
 */
public class QuizBasicThreadExtendThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println(Thread.currentThread().getName());
      System.out.println(Thread.currentThread().getId());
      
      StartThread threadname1 = new StartThread();
      StartThread threadname2 = new StartThread();
      threadname1.start();
      threadname2.start();
    }
    
}

class StartThread extends Thread {

    @Override
    public void run() {
     System.out.println("Hello Thread" + Thread.currentThread().getName()); 
    
}
}
    
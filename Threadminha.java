
package thread;


public class Threadminha extends Thread { 
    public void run(){
    for (int i = 0; i <= 10; i++){
     try{
      Thread.sleep(1000);
      System.out.println("Thread: " + i);
     } catch(InterruptedException e){
        e.printStackTrace();
     }
    }
    }

    
      
}

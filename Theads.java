
package thread;


public class Theads extends Thread{
    
    public void run(){
    for (char letra = 'A'; letra <= 'J'; letra++){
     try{
      Thread.sleep(500);
      System.out.println("Thread: " + letra);
     } catch(InterruptedException e){
        e.printStackTrace();
      }
     }
    }

}


package thread;


public class Main {
    public static void main(String[] args){
    System.out.println("Inicio do programa...");
    
    Thread t1 = new Threadminha();
    Thread t2 = new Theads();
    
    t1.start();
    t2.start();
    System.out.println("Fim de programa");
    }
    
}

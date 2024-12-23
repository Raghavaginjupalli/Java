package threading.ofjava.programs;

public class Threading extends Thread{

    // Thread class is java.lang package, so we no needs to import explicitly, java already imports this package.
    @Override
    public void run(){
        System.out.println("UDF thread is running");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Main thread is running");
        System.out.println(Thread.currentThread().getName());

    }
}

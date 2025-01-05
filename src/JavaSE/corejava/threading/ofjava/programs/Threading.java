package JavaSE.corejava.threading.ofjava.programs;

public class Threading extends Thread{

    // Thread class is java.lang package, so we no needs to import explicitly, java already imports this package.
    // run() method is present in Thread class, if we want to create multiple threads we need to write code inside this.
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

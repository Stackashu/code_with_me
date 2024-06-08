

public class lambdaThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i =0; i <=10;i++){
                System.out.println("Ashish Verma");
            }
            System.out.println(Thread.currentThread().getName());
        };
       Thread th = new Thread(runnable);
       th.setName("first");
       th.start();
       System.out.println("hi dear");
    }
}

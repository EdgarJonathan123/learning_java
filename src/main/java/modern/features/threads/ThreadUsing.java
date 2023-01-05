package modern.features.threads;

public class ThreadUsing {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            CustomThread customThread = CustomThread.createThread(i);
            customThread.start();
        }
    }
}

class CustomThread extends Thread{

    public static CustomThread createThread(int number){
        return new CustomThread(number);
    }

    private final int number;

    private CustomThread(int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Hello from thread - "+number);
    }
}

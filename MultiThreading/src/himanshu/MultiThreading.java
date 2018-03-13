package himanshu;

public class MultiThreading implements Runnable {

    volatile public static int flatCount = 10;

    public static void main(String[] args) {

        MultiThreading d1 = new MultiThreading();

        Thread t1 = new Thread(d1);

        t1.setName("Himanshu thread");
        t1.start();

        MultiThreading.countDogs();
        //MultiThreading.countCats();


    }
    public static void countDogs(){
        for (int i = 1;i <= 30;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Dog number " + i + " on " + Thread.currentThread().getName());
        }
    }

    synchronized public static void countCats(){
        for (int i = 1;i <= 45;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Cat number " + i + " on " + Thread.currentThread().getName());
        }

    }
    @Override
    public void run() {
        MultiThreading.countCats();

    }
}

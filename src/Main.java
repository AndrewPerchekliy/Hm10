public class Main {
    public static void main(String[] args){

        long timeGeneral = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + "начало");

        Clock clock = new Clock();
        Thread tikThread = new Thread(clock);
        tikThread.start();

        for (int i = 0; i<=10; ++i) {
            if (i == 10 ) {
                tikThread.interrupt();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " конец");
        System.out.printf("Программа работала %s миллисекунд.", System.currentTimeMillis() - timeGeneral);

    }
}
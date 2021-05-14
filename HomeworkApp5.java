package JavaLevel2.task5;


public class HomeworkApp5 {

    public static void main(String[] args) throws InterruptedException {

        singleThreaded();
        multiThreaded();

    }

    public static void singleThreaded() {

        final int size = 10_000_000;

        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
           arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();

        System.out.print("Время выполнения однопоточной операции операции: ");
        System.out.println(System.currentTimeMillis() - a);

    }

    public static void multiThreaded() throws InterruptedException {

        final int size = 10_000_000;
        final int h = size / 2;

        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);


        Thread thread1 = new Thread(() -> {

            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread thread2 = new Thread(() -> {

            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) ((a2[i]) * Math.sin(0.2f + (i+h) / 5) * Math.cos(0.2f + (i+h) / 5) * Math.cos(0.4f + (i+h) / 2));
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.currentTimeMillis();

        System.out.print("Время выполнения многопоточной операции: ");
        System.out.println(System.currentTimeMillis() - a);

    }
}

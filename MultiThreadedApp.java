class PrintTask {
    public synchronized void printProcess1(int i) {
        System.out.println("process1: " + i);
    }

    public synchronized void printProcess2(int i) {
        System.out.println("process2: " + i);
    }
}

class Process1 extends Thread {
    PrintTask printTask;

    Process1(PrintTask printTask) {
        this.printTask = printTask;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            printTask.printProcess1(i);
        }
    }
}

class Process2 extends Thread {
    PrintTask printTask;

    Process2(PrintTask printTask) {
        this.printTask = printTask;
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            printTask.printProcess2(i);
        }
    }
}

class MultiThreadedApp {
    public static void main(String[] args) {
        PrintTask printTask = new PrintTask();
        Process1 p1 = new Process1(printTask);
        Process2 p2 = new Process2(printTask);
        p1.start();
        p2.start();
    }
}

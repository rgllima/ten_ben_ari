package fourth;

class Process extends Thread {
    int id;
    boolean selfWant;
    boolean otherWant;

    Process(int id, boolean selfWant, boolean otherWant) {
        this.id = id;
        this.selfWant = selfWant;
        this.otherWant = otherWant;
    }

    @Override
    public void run() {
        super.run();

        while (true) {
            System.out.println("Self Want: " + selfWant + " Id: " + id);

            System.out.println(id + " está na Região Crítica!");
            otherWant = true;
            while (selfWant) {
                otherWant = false;
                otherWant = true;
            }
            System.out.println(id + " saiu da Região Crítica!");
            otherWant = false;
        }
    }
}

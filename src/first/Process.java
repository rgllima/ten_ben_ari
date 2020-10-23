package first;

class Process extends Thread {
    int id;
    Integer turn;
    int num;

    Process(int id, Integer turn, int num) {
        this.id = id;
        this.turn = turn;
        this.num = num;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            System.out.println("Turn: " + turn + " Id: " + id);

            if (turn == id) {
                System.out.println(id + " está na Região Crítica!");
                turn  = num;
                System.out.println(id + " saiu da Região Crítica!");
            }
        }
    }
}

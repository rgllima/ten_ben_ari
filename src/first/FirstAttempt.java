package first;

public class FirstAttempt {
    Integer turn = 1;

    public void start() {
        Process processA = new Process(1, this.turn, 2);
        Process processB = new Process(2, this.turn, 1);

        processA.start();
        processB.start();
    }
}


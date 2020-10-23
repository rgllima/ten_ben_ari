package second;

public class SecondAttempt {
    boolean wantP = false;
    boolean wantQ = false;

    public void start() {
        Process processP = new Process(1, wantQ, wantP);
        Process processQ = new Process(2, wantP, wantQ);

        processP.start();
        processQ.start();
    }
}

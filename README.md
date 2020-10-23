### Implementação das Tentativas do Ben Ari

```text
Rafael Lima - 399509
Josué Nicholson - 399715
```

### Códigos em Java

Tentativa 1
```java
public class FirstAttempt {
    Integer turn = 1;

    public void start() {
        Process processA = new Process(1, this.turn, 2);
        Process processB = new Process(2, this.turn, 1);

        processA.start();
        processB.start();
    }
}
```

```java
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
```

Tentativa 2
```java
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
```

```java
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

            if (!selfWant) {
                otherWant = true;
                System.out.println(id + " está na Região Crítica!");
                otherWant = false;
                System.out.println(id + " saiu da Região Crítica!");
            }
        }
    }
}
```

Tentativa 3
```java
public class ThirdAttempt {
    boolean wantP = false;
    boolean wantQ = false;

    public void start() {
        Process processP = new Process(1, wantQ, wantP);
        Process processQ = new Process(2, wantP, wantQ);

        processP.start();
        processQ.start();
    }
}
```

```java
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

            otherWant = true;
            if (!selfWant) {
                System.out.println(id + " está na Região Crítica!");
                otherWant = false;
                System.out.println(id + " saiu da Região Crítica!");
            }
        }
    }
}
```

Tentativa 4
```java
public class FourthAttempt {
    boolean wantP = false;
    boolean wantQ = false;

    public void start() {
        Process processP = new Process(1, wantQ, wantP);
        Process processQ = new Process(2, wantP, wantQ);

        processP.start();
        processQ.start();
    }
}
```

```java
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
```
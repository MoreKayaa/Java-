abstract class Telephone {
    abstract void call();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    void call() {
        System.out.println("Calling");
    }

    void lift() {
        System.out.println("Lifting");
    }

    void disconnect() {
        System.out.println("Disconnecting");
    }

    void playGame() {
        System.out.println("Playing Game");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartTelephone smartTelephone = new SmartTelephone();
        smartTelephone.call();
        smartTelephone.lift();
        smartTelephone.disconnect();
        smartTelephone.playGame();
    }
}
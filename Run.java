public class Run extends Main {
    public static void main(String[] args) {
        Main x = new Main();
        StartGame y = new StartGame();
        try {
            x.mainGame();
            y.startGame();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
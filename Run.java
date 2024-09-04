public class Run extends Main {
    public static void main(String[] args) {
        Main x = new Main();
        try {
            x.mainGame();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
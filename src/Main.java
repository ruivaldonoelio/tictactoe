import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Jogo abrir = new Jogo();
        abrir.setContentPane(abrir.game);
        abrir.setVisible(true);
        abrir.setSize(575, 400);
        abrir.setResizable(false);
        abrir.setDefaultCloseOperation(3);
    }
}
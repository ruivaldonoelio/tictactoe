import javax.swing.*;

public class Painel  extends JFrame{
    private JRadioButton P2;
    private JRadioButton P4;
    private JComboBox P1_2;
    private JComboBox P2_2;
    private JComboBox P1_4;
    private JComboBox P2_4;
    private JComboBox P3_4;
    private JComboBox P4_4;
    private JButton jogar;
    private JButton sair;
    private JPanel main;

    public static void main(String[] args) {
        Painel abrir = new Painel();
        abrir.setContentPane(abrir.main);
        abrir.setVisible(true);
        abrir.setSize(350, 350);
        abrir.setResizable(false);
        abrir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Jogo extends JFrame{
    private JRadioButton J1;
    private JRadioButton J2;
    private JButton voltarButton;
    private JRadioButton J3;
    private JRadioButton J4;
    private JButton J_0;
    private JButton J_1;
    private JButton J_3;
    private JButton J_4;
    private JButton J_2;
    private JButton J_5;
    private JButton J_6;
    private JButton J_7;
    private JButton J_8;
    JPanel game;
    private JLabel lblP1;
    private JLabel lblP2;
    private JLabel lblP3;
    private JLabel lblP4;
    private JLabel P4v;
    private JLabel P3v;
    private JLabel P1v;
    private JLabel P2v;
    int cont1=0;
    int cont2=0;
    int cont3=0;
    int cont4=0;

    public Jogo() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JButton[] jogada = {J_0, J_1, J_2, J_3, J_4, J_5, J_6, J_7, J_8};
                for (int i = 0; i < jogada.length; i++) {
                    if (e.getSource() == jogada[i] & J1.isSelected() & jogada[i].getText() == "") {
                        jogada[i].setText("X");
                        J2.setSelected(true);
                        J1.setSelected(false);
                    }

                    if (e.getSource() == jogada[i] & J2.isSelected() & jogada[i].getText() == "") {
                        jogada[i].setText("O");
                        J1.setSelected(true);
                        J2.setSelected(false);
                    }
                }
                //Vencedor

                if (J_0.getText().equals("X") && J_1.getText().equals("X") && J_2.getText().equals("X") ||
                    J_3.getText().equals("X") && J_4.getText().equals("X") && J_5.getText().equals("X") ||
                    J_6.getText().equals("X") && J_7.getText().equals("X") && J_8.getText().equals("X") ||
                    J_0.getText().equals("X") && J_3.getText().equals("X") && J_6.getText().equals("X") ||
                    J_1.getText().equals("X") && J_4.getText().equals("X") && J_7.getText().equals("X") ||
                    J_2.getText().equals("X") && J_5.getText().equals("X") && J_8.getText().equals("X") ||
                    J_0.getText().equals("X") && J_4.getText().equals("X") && J_8.getText().equals("X") ||
                    J_2.getText().equals("X") && J_4.getText().equals("X") && J_6.getText().equals("X")
                ) {
                    JOptionPane.showMessageDialog(null, "Jogador 1 venceu!");
                    cont1++;
                    P1v.setText(Integer.toString(cont1));

                    for (int i=0; i< jogada.length; i++){
                        jogada[i].setText("");
                    }
                }
                if (J_0.getText().equals("O") && J_1.getText().equals("O") && J_2.getText().equals("O") ||
                    J_3.getText().equals("O") && J_4.getText().equals("O") && J_5.getText().equals("O") ||
                    J_6.getText().equals("O") && J_7.getText().equals("O") && J_8.getText().equals("O") ||
                    J_0.getText().equals("O") && J_3.getText().equals("O") && J_6.getText().equals("O") ||
                    J_1.getText().equals("O") && J_4.getText().equals("O") && J_7.getText().equals("O") ||
                    J_2.getText().equals("O") && J_5.getText().equals("O") && J_8.getText().equals("O") ||
                    J_0.getText().equals("O") && J_4.getText().equals("O") && J_8.getText().equals("O") ||
                    J_2.getText().equals("O") && J_4.getText().equals("O") && J_6.getText().equals("O")
                ) {
                    JOptionPane.showMessageDialog(null, "Jogador 2 venceu!");
                    cont2++;
                    P2v.setText(Integer.toString(cont2));
                    for (int i=0; i< jogada.length; i++){
                        jogada[i].setText("");
                    }
                }
            }
        };

        J_0.addActionListener(listener);
        J_3.addActionListener(listener);
        J_4.addActionListener(listener);
        J_5.addActionListener(listener);
        J_2.addActionListener(listener);
        J_1.addActionListener(listener);
        J_6.addActionListener(listener);
        J_7.addActionListener(listener);
        J_8.addActionListener(listener);
        J1.setSelected(true);
    }

}
package uma.tspi.arqd;

import javax.swing.*;

public class SmartTermo extends JFrame {
    private JPanel JPanelDad;
    private JButton HOMEButton;
    private JButton MENUButton;
    private JButton FANButton;
    private JButton SYSTEMButton;
    private JButton MoreTemperature;
    private JButton lessTemperature;
    private JLabel CurrentTemperature;
    private JLabel DesiredTemperature;


    public SmartTermo(String tittle){
        super(tittle);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(JPanelDad);
        this.pack();





    }

    public static void main(String[] args){
        JFrame frame = new SmartTermo("Java SWING  Examples");
        frame.setVisible(true);

    }
}

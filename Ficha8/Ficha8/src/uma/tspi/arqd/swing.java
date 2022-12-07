package uma.tspi.arqd;

import javax.swing.*;

public class swing extends JFrame {
    private JPanel JPanelDad;
    private JButton HOMEButton;
    private JButton MENUButton;
    private JButton FANButton;
    private JButton SYSTEMButton;
    private JButton MoreTemperature;
    private JButton lessTemperature;
    private JLabel CurrentTemperature;
    private JLabel DesiredTemperature;
    private JLabel IndoorTemperature;


    public swing(String tittle){
        super(tittle);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(JPanelDad);
        this.pack();



    }

    public static void main(String[] args){
        JFrame frame = new swing("Java SWING  Examples");
        frame.setVisible(true);

    }
}

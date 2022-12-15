package uma.tspi.arqd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class swing extends JFrame {

    private JPanel JPanelDad;
    private JLabel jLabelActualTemp;
    private JLabel jLabelDesiredTemp;
    private JButton jButtonTempMinus;
    private JButton jButtonTempPlus;
    private JButton jButtonHumiMinus;
    private JButton jButtonHumiPlus;
    private JLabel jLabelActualHumi;
    private JLabel jLabelDesiredHumi;
    private JLabel jLabelDate;
    private JTextArea jTextAreaLog;
    private JToggleButton JButtonOn;

    private float desiredTemp,actualTemp;
    private float desiredHumi,actualHumi;



    public swing(String tittle){
        super(tittle);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(JPanelDad);
        this.pack();
        this.desiredTemp=24;
        this.actualTemp=20;

        this.actualHumi=60;
        this.desiredHumi=50;

        this.jLabelActualTemp.setText(String.format("%.1f º",actualTemp) );
        this.jLabelDesiredTemp.setText(String.format("%.1f º",desiredTemp) );

        this.jLabelActualHumi.setText(String.format("%.1f ",actualHumi )+ " %");
        this.jLabelDesiredHumi.setText(String.format("%.1f ",desiredHumi ) + " %");

        this.jLabelDate.setText(new Date().toString());

        jButtonTempPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desiredTemp+=0.5;
                jLabelDesiredTemp.setText(String.format("%.1f º",desiredTemp) );
                logAction("Desired Temperature was increased 0.5");
            }
        });
        jButtonTempMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desiredTemp-=0.5;
                jLabelDesiredTemp.setText(String.format("%.1f º",desiredTemp) );
                logAction("Desired Temperature was decreased 0.5");
            }
        });
        jButtonHumiMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desiredHumi-=5;
                jLabelDesiredHumi.setText(String.format("%.1f ",desiredHumi ) + " %");
                logAction("Desired Temperature was decreased 5");

            }
        });
        jButtonHumiPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desiredHumi+=5;
                jLabelDesiredHumi.setText(String.format("%.1f ",desiredHumi ) + " %");
                logAction("Desired Temperature was increased 5");
            }
        });
        JButtonOn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JButtonOn.getText() == "OFF"){
                    JButtonOn.setText("ON");
                }
                else {
                    JButtonOn.setText("OFF");
                }
            }




        });
        Timer t=new Timer();

        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                simulateTemperature();
            }
        },0,1000);
    }

    private void simulateTemperature(){
        Random r =new Random();
        int next =r.nextInt(100);
        if(next<=30){
            actualTemp-=0.5;
            this.jLabelActualTemp.setText(String.format("%.1f º",actualTemp) );
        }

    }

    private void logAction(String message) {
        this.jTextAreaLog.append(message +"\n");
    }


    public static void main(String[] args){
        JFrame frame = new swing("Java SWING  Examples");
        frame.setVisible(true);

    }
}

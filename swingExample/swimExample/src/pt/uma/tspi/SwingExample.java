package pt.uma.tspi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample extends JFrame {

    private JLabel controlButton;
    private JButton OKButton;
    private JButton SUBMITButton;
    private JButton CANCELButton;
    private JLabel statusLabell;
    private JPanel jPanelmain;
    private JPanel pannel_buttons;
    private JPanel JPanel_footer;
    private JList jList;


    private class ButtonClickListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String command=e.getActionCommand();

            if(command.equals("OK")){
                statusLabell.setText("Ok Button clicked");
                controlButton.setText(e.getSource().getClass().getSimpleName());
            }
            else if(command.equals("SUBMIT")){
                statusLabell.setText("Submit Button clicked");
                controlButton.setText(e.getSource().getClass().getSimpleName());            }
            else {
                statusLabell.setText("Cancel Button clicked");
                controlButton.setText(e.getSource().getClass().getSimpleName());            }

        }

    }





    public SwingExample(String tittle){
        super(tittle);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(jPanelmain);


        this.pack();

        this.jList.add("Test",new JLabel("JLabel text"));



        OKButton.addActionListener(new  ButtonClickListener());
        SUBMITButton.addActionListener(new  ButtonClickListener());
        CANCELButton.addActionListener(new  ButtonClickListener());
    }

    private void OKButtonPressed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        statusLabell.setText(button.getText()+"Button Pressed");
    }

    public static void main(String[] args){
        JFrame frame = new SwingExample("Java SWING  Examples");
        frame.setVisible(true);

    }
}

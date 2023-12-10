package org.example.week8.hello_gui_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGui extends JFrame {
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    HelloGui() {
        //telling JFrame that the main window is this JPanel called mainpanel
        setContentPane(mainPanel);
        //set the size of the window when it initiates
        setPreferredSize(new Dimension(500, 500));
        //pack all the components in and make sure they are the right sizes/layout etc
        pack();
        //make sure we can see the JFrame
        setVisible(true);
        //will actually close the operation instead of just keeping it running in the background
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //set event listeners
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // action goes here for when the button is clicked
                //in the example below we'll change the label text when the button is clicked
                myFirstLabel.setText("Hello GUI Programmers!!");
            }
        });

    }


}

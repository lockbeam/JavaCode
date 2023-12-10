package org.example.week8.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel conversionResultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox;

    private final String EUROS = "Euros";
    private final String UYPESOS = "Uruguayan Pesos";

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.92, UYPESOS, 39.13);

    CurrencyConverter() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //hitting enter also works instead of having to click
        getRootPane().setDefaultButton(convertButton);

        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(UYPESOS);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // what was typed in the text field
                String dollarString = dollarsTextField.getText();
                // convert to a number

                try {
                    double dollars = Double.parseDouble(dollarString);
                    String toCurrency = (String) currencyComboBox.getSelectedItem();

                    double exchangeRate = exchangeRates.get(toCurrency);


                    // convert to currency
                   double convertedValue = dollars * exchangeRate;
//                    //display result
                    String resultString = String.format("%.2f dollars is equivalent to %.2f %s", dollars, convertedValue, toCurrency);
                    conversionResultLabel.setText(resultString);
               } // parse leaves us open to user not inputting a number
                // so try catch where a pane will pop up where the error is occuring
                // and display message to user
                    catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(CurrencyConverter.this, "Please enter a number without any symbols or other characters.");
                }
            }
        });

    }


}

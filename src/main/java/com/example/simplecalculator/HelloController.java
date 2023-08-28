package com.example.simplecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Button Cancel;

    @FXML
    private Button Clear;

    @FXML
    private Label Outpanel;

    @FXML
    private TextArea UserInput;

    @FXML
    void Binary(ActionEvent event) {
        String input= UserInput.getText();
        try{
            int decimal =Integer.parseInt(input);
            String binary = Integer.toBinaryString(decimal);
            Outpanel.setText(binary+" ");
        }catch (Exception e)
        {
            Outpanel.setText("Invalid");
        }
    }

    @FXML
    void Hexadecimal(ActionEvent event) {
        String input= UserInput.getText();
        try{
            int decimal =Integer.parseInt(input);
            String Hexadecimal = Integer.toHexString(decimal);
            Outpanel.setText(Hexadecimal+" ");
        }catch (Exception e)
        {
            Outpanel.setText("Invalid");
        }

    }

    @FXML
    void Octal(ActionEvent event) {
        String input= UserInput.getText();
        try{
            int decimal =Integer.parseInt(input);
            String Octal = Integer.toOctalString(decimal);
            Outpanel.setText(Octal+" ");
        }catch (Exception e)
        {
            Outpanel.setText("Invalid");
        }
    }

    @FXML
    void cancel(ActionEvent event) {
        int status = 0;
        System.exit(status);

    }

    @FXML
    void clear(ActionEvent event) {
        Outpanel.setText("");
        Outpanel.setText("                                  No Input");

    }

    @FXML
    void userinput(MouseEvent event) {

    }


}

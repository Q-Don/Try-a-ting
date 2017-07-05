/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8testfxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author peel
 */
public class FXMLDocumentController implements Initializable
{
    @FXML
    private Button test;
    @FXML
    private Button test2;
    //testing something
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnExit;
    @FXML
    private TextField txtFirst;
    @FXML
    private TextField txtSecond;
    @FXML
    private TextField txtR;
    @FXML
    private TextArea tarea;
    @FXML
    private CheckBox chkAdd;
    @FXML
    private RadioButton radAdd;
    @FXML
    private RadioButton radMul;
    @FXML
    private ToggleGroup grp = new ToggleGroup();
    
    
    @FXML
    private void Addition(ActionEvent event)
    {
        double a = Double.parseDouble(txtFirst.getText());
        double b = Double.parseDouble(txtSecond.getText());
        double c = a+b;
        txtR.setText(String.valueOf(c));
        tarea.appendText(a+"\t\t"+b+"\t\t"+c+"\n");
    }
    
    @FXML
    private void Clear(ActionEvent event)
    {
        txtFirst.clear();
        txtSecond.clear();
        txtR.clear();
        
    }
    
    @FXML
    private void Exit(ActionEvent event)
    {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Exit Application");
        a.setHeaderText("Confirm");
        a.setContentText("Press Ok if you want to exit");
        a.showAndWait().ifPresent(response ->
        {
            if(response==ButtonType.OK)
                System.exit(0);
            
            
            
        });
        
    }
    
     @FXML
    private void ChkAdd(ActionEvent event)
    {
        double a = Double.parseDouble(txtFirst.getText());
        double b = Double.parseDouble(txtSecond.getText());
        if(chkAdd.isSelected()==true)
        {
            double c = a+b;
            txtR.setText(String.valueOf(c));
            tarea.appendText(a+"\t\t"+b+"\t\t"+c+"\n");
        }
        else
        {
            txtFirst.clear();
            txtSecond.clear();
            txtR.clear();
        
        }
    }
    
    @FXML
    private void radAdd(ActionEvent event)
    {
        double a = Double.parseDouble(txtFirst.getText());
        double b = Double.parseDouble(txtSecond.getText());
        double c = a+b;
        txtR.setText(String.valueOf(c));
        tarea.appendText(a+"\t\t"+b+"\t\t"+c+"\n");
    }
    
    @FXML
    private void radMul(ActionEvent event)
    {
        double a = Double.parseDouble(txtFirst.getText());
        double b = Double.parseDouble(txtSecond.getText());
        double c = a*b;
        txtR.setText(String.valueOf(c));
        tarea.appendText(a+"\t\t"+b+"\t\t"+c+"\n");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        radAdd.setToggleGroup(grp);
        radMul.setToggleGroup(grp);
    }    
    
}

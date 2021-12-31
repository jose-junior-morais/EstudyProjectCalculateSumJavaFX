package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;

public class ViewController {
    @FXML
	private TextField txtNumber1;
	
    @FXML
    private TextField txtNumber2;
    
    @FXML
    private Label lbResultSum;
    
	@FXML
	private Button sum;
	
	@FXML
	public void onBtnAction() {
		Locale.setDefault(Locale.US);
		Double number1=Double.parseDouble(txtNumber1.getText());
		Double number2=Double.parseDouble(txtNumber2.getText());
		Double sum=number1+number2;
		lbResultSum.setText(String.format("%.2f", sum));
	}
	
}

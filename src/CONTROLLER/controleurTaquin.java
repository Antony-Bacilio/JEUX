package CONTROLLER;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

public class controleurTaquin {

    @FXML
    private GridPane GridPane;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Label lblTaquin;
    @FXML
    private Button btnCommencer;
    @FXML
    private Button btnReset;
    @FXML
    private Button btnExit;
    @FXML
    private Label lblTemps;
    @FXML
    private TextArea txtTemps;
    @FXML
    private Label lblMouvement;
    @FXML
    private TextArea txtMouvement;
    
    @FXML
    void Commencer(ActionEvent event) {
    	/*btn1.setText("2");
    	btn2.setText("3");
    	btn3.setText("1");
    	btn4.setText("8");
    	btn5.setText("");
    	btn6.setText("6");
    	btn7.setText("5");
        btn8.setText("7");
        btn9.setText("4");*/
    	btnCommencer.setDisable(true);
    	btnReset.setDisable(false);
    }
    
    @FXML
    void Exit(ActionEvent event) {
    	System.exit(1);
    }
    
    @FXML
    void btnClic(ActionEvent event) {
    	/*btn9.setText(btn6.getText());
    	btn6.setText(null);*/
    }
    
}

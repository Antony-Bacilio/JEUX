package CONTROLLER;

import CLIENT.ClientJeux;
import MODELE.modeleJeuxImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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
    
    public int mouvements = 0;
    
    //modeleJeuxImpl md = new modeleJeuxImpl();
    int[] tabTaquin = {1,2,3,4,5,6,7,8,9};
    
    @FXML
    void Commencer(ActionEvent event) {
    	btnCommencer.setDisable(true);
    	btnReset.setDisable(false);
    	int N = tabTaquin.length;
    	for(int i=0; i<N; i++){
    		tabTaquin[i] =(int) (Math.random()*N+1); 
    		btn1.setText(String.valueOf(tabTaquin[i]));
    		btn2.setText(String.valueOf(tabTaquin[i]));
    		btn3.setText(String.valueOf(tabTaquin[i]));
    		btn4.setText(String.valueOf(tabTaquin[i]));
    		btn5.setText(String.valueOf(tabTaquin[i]));
    		btn7.setText(String.valueOf(tabTaquin[i]));
    		btn8.setText(String.valueOf(tabTaquin[i]));
    		btn9.setText(String.valueOf(tabTaquin[i]));
    		btn1.setText(String.valueOf(tabTaquin[i]));    		
    	}
    	//md.initTaquin();
    }
    
    @FXML
    void Exit(ActionEvent event) {
    	Stage menu = (Stage) btnCommencer.getScene().getWindow();
        menu.close();
    	try {
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("../VUE/vueAccueil.fxml"));
            Scene scene = new Scene(root,600,400); 
            Stage stage = new Stage();
	            stage.setTitle("Accueil");       
	            stage.setScene(scene);		
	            stage.setResizable(false);
	            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    	//System.exit(1);
    }
    
    @FXML
    void actionMove() {
    	this.mouvements++;
    	this.txtMouvement.setText(String.valueOf(mouvements));
    }
    
    @FXML
    void actionBtn1(ActionEvent event) {
    		if(btn2.getText()==""){
    			btn2.setText(btn1.getText());
    			btn1.setText("");
    			this.actionMove();
    		}
    		if(btn4.getText()==""){
    			btn4.setText(btn1.getText());
    			btn1.setText("");
    			this.actionMove();
    		}	
    }

    @FXML
    void actionBtn2(ActionEvent event) {
    	if(btn1.getText()==""){
			btn1.setText(btn2.getText());
			btn2.setText("");
			this.actionMove();
		}
    	if(btn3.getText()==""){
			btn3.setText(btn2.getText());
			btn2.setText("");
			this.actionMove();
		}
    	if(btn5.getText()==""){
			btn5.setText(btn2.getText());
			btn2.setText("");
			this.actionMove();
		}
    }

    @FXML
    void actionBtn3(ActionEvent event) {
    	if(btn2.getText()==""){
			btn2.setText(btn3.getText());
			btn3.setText("");
			this.actionMove();
		}
    	if(btn6.getText()==""){
			btn6.setText(btn3.getText());
			btn3.setText("");
			this.actionMove();
		}
    }

    @FXML
    void actionBtn4(ActionEvent event) {
    	if(btn1.getText()==""){
			btn1.setText(btn4.getText());
			btn4.setText("");
			this.actionMove();
		}
    	if(btn5.getText()==""){
			btn5.setText(btn4.getText());
			btn4.setText("");
			this.actionMove();
		}
    	if(btn7.getText()==""){
			btn7.setText(btn4.getText());
			btn4.setText("");
			this.actionMove();
		}
    }

    @FXML
    void actionBtn5(ActionEvent event) {
    	if(btn2.getText()==""){
			btn2.setText(btn5.getText());
			btn5.setText("");
			this.actionMove();
		}
    	if(btn4.getText()==""){
			btn4.setText(btn5.getText());
			btn5.setText("");
			this.actionMove();
		}
    	if(btn6.getText()==""){
			btn6.setText(btn5.getText());
			btn5.setText("");
			this.actionMove();
		}
    	if(btn8.getText()==""){
			btn8.setText(btn5.getText());
			btn5.setText("");
			this.actionMove();
		}
    }

    @FXML
    void actionBtn6(ActionEvent event) {
    	if(btn3.getText()==""){
			btn3.setText(btn6.getText());
			btn6.setText("");
			this.actionMove();
		}
		if(btn5.getText()==""){
			btn5.setText(btn6.getText());
			btn6.setText("");
			this.actionMove();
		}
		if(btn9.getText()==""){
			btn9.setText(btn6.getText());
			btn6.setText("");
			this.actionMove();
		}
    }

    @FXML
    void actionBtn7(ActionEvent event) {
    	if(btn4.getText()==""){
			btn4.setText(btn7.getText());
			btn7.setText("");
			this.actionMove();
		}
		if(btn8.getText()==""){
			btn8.setText(btn7.getText());
			btn7.setText("");
			this.actionMove();
		}
    }

    @FXML
    void actionBtn8(ActionEvent event) {
    	if(btn5.getText()==""){
			btn5.setText(btn8.getText());
			btn8.setText("");
			this.actionMove();
		}
		if(btn7.getText()==""){
			btn7.setText(btn8.getText());
			btn8.setText("");
			this.actionMove();
		}
		if(btn9.getText()==""){
			btn9.setText(btn8.getText());
			btn8.setText("");
			this.actionMove();
		}
    }

    @FXML
    void actionBtn9(ActionEvent event) {
    	if(btn6.getText()==""){
			btn6.setText(btn9.getText());
			btn9.setText("");
			this.actionMove();
		}
		if(btn8.getText()==""){
			btn8.setText(btn9.getText());
			btn9.setText("");
			this.actionMove();
		}
    }
    
    
}

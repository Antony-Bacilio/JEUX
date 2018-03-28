package CONTROLLER;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import MODELE.modeleJeuxInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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
    private int port = 7000;
    private modeleJeuxInterface objJeux;
    //public modeleJeuxImpl JIMPL; 
    
    int[] tabTaquin = {1,2,3,4,5,6,7,8,9};
    
    @FXML
    void Reset(ActionEvent event) {
    	
    	btnCommencer.setDisable(false);
    	btnReset.setDisable(true);
    	txtMouvement.setText("0");
    	txtMouvement.setDisable(true);
    	btn1.setDisable(true);
    	btn2.setDisable(true);
    	btn3.setDisable(true);
    	btn4.setDisable(true);
    	btn5.setDisable(true);
    	btn6.setDisable(true);
    	btn7.setDisable(true);
    	btn8.setDisable(true);
    	btn9.setDisable(true);
    	
    	btn1.setText("1");
    	btn2.setText("2");
    	btn3.setText("3");
    	btn4.setText("4");
    	btn5.setText("5");
    	btn6.setText("6");
    	btn7.setText("7");		
    	btn8.setText("8");
    	btn9.setText("");
    	
    	this.mouvements = 0;
    }
    
    @FXML
    void Commencer(ActionEvent event) throws MalformedURLException, RemoteException, NotBoundException {
    	this.objJeux = (modeleJeuxInterface) Naming.lookup("rmi://localhost:" + this.port + "/Jeux");/*se servir de l'interface pour obtenir des methodes*/
    	btnCommencer.setDisable(true);
    	btnReset.setDisable(false);
    	txtMouvement.setDisable(false);
    	
    	btn1.setDisable(false);
    	btn2.setDisable(false);
    	btn3.setDisable(false);
    	btn4.setDisable(false);
    	btn5.setDisable(false);
    	btn6.setDisable(false);
    	btn7.setDisable(false);
    	btn8.setDisable(false);
    	btn9.setDisable(false);
    	int N = tabTaquin.length;
    	for(int i=0; i<N; i++){
    		tabTaquin[i] =(int) (Math.random()*(N-1)+1); 
    		btn1.setText(String.valueOf(tabTaquin[i]));
    		btn2.setText(String.valueOf(tabTaquin[i]));
    		btn3.setText(String.valueOf(tabTaquin[i]));
    		btn4.setText(String.valueOf(tabTaquin[i]));
    		btn5.setText("");
    		btn6.setText(String.valueOf(tabTaquin[i]));
    		btn7.setText(String.valueOf(tabTaquin[i]));
    		btn8.setText(String.valueOf(tabTaquin[i]));
    		btn9.setText(String.valueOf(tabTaquin[i]));    		
    	}
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
    
    /*@FXML
    void actionMove() {
    	this.mouvements++;
    	this.txtMouvement.setText(String.valueOf(mouvements));
    }*/
    
    
    
    @FXML
    void actionBtn1(ActionEvent event) throws RemoteException, MalformedURLException, NotBoundException {
    		if(btn2.getText()==""){
    			btn2.setText(btn1.getText());
    			btn1.setText("");
    			//modeleJeuxInterface objJeux = (modeleJeuxInterface) Naming.lookup("rmi://localhost:" + this.port + "/Jeux");
    			this.mouvements = objJeux.actionMove(this.mouvements);
    			this.txtMouvement.setText(String.valueOf(mouvements));
    			//this.txtMouvement.setText(String.valueOf(objJeux.actionMove(this.mouvements)));
    		}
    		if(btn4.getText()==""){
    			btn4.setText(btn1.getText());
    			btn1.setText("");
    			//modeleJeuxInterface objJeux = (modeleJeuxInterface) Naming.lookup("rmi://localhost:" + this.port + "/Jeux");
    			this.mouvements = objJeux.actionMove(this.mouvements);
    			this.txtMouvement.setText(String.valueOf(mouvements));
    		}	
    }
    @FXML
    void actionBtn2(ActionEvent event) throws RemoteException, MalformedURLException, NotBoundException {
    	if(btn1.getText()==""){
			btn1.setText(btn2.getText());
			btn2.setText("");
			//modeleJeuxInterface objJeux = (modeleJeuxInterface) Naming.lookup("rmi://localhost:" + this.port + "/Jeux");
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    	if(btn3.getText()==""){
			btn3.setText(btn2.getText());
			btn2.setText("");

			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    	if(btn5.getText()==""){
			btn5.setText(btn2.getText());
			btn2.setText("");
			
			modeleJeuxInterface objJeux = (modeleJeuxInterface) Naming.lookup("rmi://localhost:" + 7000 + "/Jeux");
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    }

    @FXML
    void actionBtn3(ActionEvent event) throws RemoteException, MalformedURLException, NotBoundException {
    	if(btn2.getText()==""){
			btn2.setText(btn3.getText());
			btn3.setText("");

			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    	if(btn6.getText()==""){
			btn6.setText(btn3.getText());
			btn3.setText("");

			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    }

    @FXML
    void actionBtn4(ActionEvent event) throws RemoteException, MalformedURLException, NotBoundException {
    	if(btn1.getText()==""){
			btn1.setText(btn4.getText());
			btn4.setText("");

			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    	if(btn5.getText()==""){
			btn5.setText(btn4.getText());
			btn4.setText("");

			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    	if(btn7.getText()==""){
			btn7.setText(btn4.getText());
			btn4.setText("");

			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    }

    @FXML
    void actionBtn5(ActionEvent event) throws RemoteException, MalformedURLException, NotBoundException {
    	if(btn2.getText()==""){
			btn2.setText(btn5.getText());
			btn5.setText("");

			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    	if(btn4.getText()==""){
			btn4.setText(btn5.getText());
			btn5.setText("");
			
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    	if(btn6.getText()==""){
			btn6.setText(btn5.getText());
			btn5.setText("");
			
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    	if(btn8.getText()==""){
			btn8.setText(btn5.getText());
			btn5.setText("");
			
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    }

    @FXML
    void actionBtn6(ActionEvent event) throws RemoteException, MalformedURLException, NotBoundException {
    	if(btn3.getText()==""){
			btn3.setText(btn6.getText());
			btn6.setText("");
			//this.txtMouvement.setText(String.valueOf(objJeux.actionMove(this.mouvements)));
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
		if(btn5.getText()==""){
			btn5.setText(btn6.getText());
			btn6.setText("");

			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
		if(btn9.getText()==""){
			btn9.setText(btn6.getText());
			btn6.setText("");

			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    }

    @FXML
    void actionBtn7(ActionEvent event) throws RemoteException, MalformedURLException, NotBoundException  {
    	if(btn4.getText()==""){
			btn4.setText(btn7.getText());
			btn7.setText("");
			
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
		if(btn8.getText()==""){
			btn8.setText(btn7.getText());
			btn7.setText("");
			
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    }

    @FXML
    void actionBtn8(ActionEvent event) throws RemoteException, MalformedURLException, NotBoundException  {
    	if(btn5.getText()==""){
			btn5.setText(btn8.getText());
			btn8.setText("");
			
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
		if(btn7.getText()==""){
			btn7.setText(btn8.getText());
			btn8.setText("");
			
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
		if(btn9.getText()==""){
			btn9.setText(btn8.getText());
			btn8.setText("");
			
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    }

    @FXML
    void actionBtn9(ActionEvent event) throws RemoteException, MalformedURLException, NotBoundException {
    	if(btn6.getText()==""){
			btn6.setText(btn9.getText());
			btn9.setText("");
			
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
		if(btn8.getText()==""){
			btn8.setText(btn9.getText());
			btn9.setText("");
			
			this.mouvements = objJeux.actionMove(this.mouvements);
			this.txtMouvement.setText(String.valueOf(mouvements));
		}
    }
    
}

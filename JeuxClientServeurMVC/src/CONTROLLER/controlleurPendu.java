package CONTROLLER;
	import java.net.URL;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ResourceBundle;

import MODELE.modelePenduInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

	public class controlleurPendu implements Initializable {
			@FXML
			private GridPane GridTab;
			@FXML
		    private Button btnR;
		    @FXML
		    private Button btnB;
		    @FXML
		    private Button btnC;
		    @FXML
		    private Button btnD;
		    @FXML
		    private Button btnG;
		    @FXML
		    private Button btnE;
		    @FXML
		    private Button btnL;
		    @FXML
		    private Button btnW;
		    @FXML
		    private Button btnV;
		    @FXML
		    private Button btnU;
		    @FXML
		    private Button btnT;
		    @FXML
		    private Button btnS;
		    @FXML
		    private Button btnF;
		    @FXML
		    private Button btnQ;
		    @FXML
		    private Button btnK;
		    @FXML
		    private Button btnP;
		    @FXML
		    private Button btnJ;
		    @FXML
		    private Button btnO;
		    @FXML
		    private Button btnI;
		    @FXML
		    private Button btnN;
		    @FXML
		    private Button btnM;
		    @FXML
		    private Button btnH;
		    @FXML
		    private Button btnZ;
		    @FXML
		    private Button btnY;
		    @FXML
		    private Button btnX;
		    @FXML
		    private Button btnA;
		    @FXML
		    private Label motDevine;
		    @FXML
		    private Label labelWarn;
		    @FXML
		    private ImageView ImgPendu;
		    @FXML
		    private Button btnCommencer;
		    @FXML
		    private Button btnReset;
		    @FXML
		    private Button btnExit;
		    @FXML
		    private Button btnRejouer;

		    
		    private modelePenduInterface mp;
		    private String mot;
		    private int fois ;
		    private boolean gagne = false;


		    @FXML
		    void Commencer(ActionEvent event) {
		    	btnA.setDisable(false); btnO.setDisable(false);
		    	btnB.setDisable(false); btnP.setDisable(false);
		    	btnC.setDisable(false); btnQ.setDisable(false);
		    	btnD.setDisable(false); btnR.setDisable(false);
		    	btnE.setDisable(false); btnS.setDisable(false);
		    	btnF.setDisable(false); btnT.setDisable(false);
		    	btnG.setDisable(false); btnU.setDisable(false);
		    	btnH.setDisable(false); btnV.setDisable(false);
		    	btnI.setDisable(false); btnW.setDisable(false);
		    	btnJ.setDisable(false); btnX.setDisable(false);
		    	btnK.setDisable(false); btnY.setDisable(false);
		    	btnL.setDisable(false); btnZ.setDisable(false);
		    	btnM.setDisable(false);
		    	btnN.setDisable(false);
		    	//this.GridTab.setDisable(false);
		    	
		    	btnCommencer.setDisable(true);
		    	btnReset.setDisable(false);
		    	
		    	fois--;
	    		if(fois<=7) {
	    			this.ImgPendu.setImage(new Image("/pic/p" + fois + ".png")); 
	    		}
	    		
	    		this.btnRejouer.setVisible(false);
		    }

		    /*Selectionner un Autre mot*/
		    @FXML
		    void Reset(ActionEvent event) throws RemoteException {
		    	btnA.setDisable(true); btnO.setDisable(true);
		    	btnB.setDisable(true); btnP.setDisable(true);
		    	btnC.setDisable(true); btnQ.setDisable(true);
		    	btnD.setDisable(true); btnR.setDisable(true);
		    	btnE.setDisable(true); btnS.setDisable(true);
		    	btnF.setDisable(true); btnT.setDisable(true);
		    	btnG.setDisable(true); btnU.setDisable(true);
		    	btnH.setDisable(true); btnV.setDisable(true);
		    	btnI.setDisable(true); btnW.setDisable(true);
		    	btnJ.setDisable(true); btnX.setDisable(true);
		    	btnK.setDisable(true); btnY.setDisable(true);
		    	btnL.setDisable(true); btnZ.setDisable(true);
		    	btnM.setDisable(true);
		    	btnN.setDisable(true);
		    	//this.GridTab.setDisable(true);
		    	
		    	btnReset.setDisable(true);
		    	btnCommencer.setDisable(false);
		    	ImgPendu.setImage(null);
		    	
		    	this.labelWarn.setText("");
		    	this.motDevine.setText("");
				this.mot = this.mp.PenseMot().getMot() ;
				this.fois = this.mp.PenseMot().getFois();

				String init = "";
				for(int i = 0; i<mot.length();i++) {
					init += "_";
				}
				this.motDevine.setText(init);
				
				this.btnRejouer.setVisible(false);
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
		    }
		    
		    @FXML
		    void Rejouer(ActionEvent event) {
		    	Stage menu = (Stage) btnCommencer.getScene().getWindow();
		        menu.close();
		    	try {
		            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("../VUE/vuePendu.fxml"));
		            Scene scene = new Scene(root,600,400); 
		            Stage stage = new Stage();
			            stage.setTitle("Accueil");       
			            stage.setScene(scene);		
			            stage.setResizable(false);
			            stage.show();
		        } catch(Exception e) {
		            e.printStackTrace();
		        }
		    	this.btnRejouer.setVisible(false);
		    }
		    
		    /*Evaluation de boutons*/
		    public void ControlBtn(Button B, char c) {
		    	this.labelWarn.setText("");
		    	B.setDisable(true);
		    	StringBuilder tmp = new StringBuilder(this.motDevine.getText());
		    	boolean lettreExist = false;
		    	if(fois!=1) {
		    
		    			for(int i = 0; i < mot.length(); i++) {
				    		if(mot.charAt(i)== c) {       
				                tmp.replace(i, i+1, c+"");
				                lettreExist = true;
				    		}
		    			}
		    	
				    	if(lettreExist==false&&this.gagne==false) {
				    		fois--;
				    		if(fois<=7) {
				    			this.ImgPendu.setImage(new Image("/pic/p" + fois + ".png")); 
				    		}
				    		this.labelWarn.setText("La lettre "+ c + " n'exist pas! "+ "\n- il vous reste "+ fois +" essaies");
				    		B.setBackground(new Background( new BackgroundFill(Color.web( "CC7722" ), null, null)));
				    	}
				    	else {
				    		B.setBackground(new Background( new BackgroundFill(Color.web( "CC1100" ), null, null)));
				    	}
			    		this.motDevine.setText(tmp.toString());
			    }
		    
		    	else {
		    		this.labelWarn.setText("Désole, Vous avez perdu! \n-  Le mot était : "+ this.mot);
		    		btnA.setDisable(true); btnO.setDisable(true);
			    	btnB.setDisable(true); btnP.setDisable(true);
			    	btnC.setDisable(true); btnQ.setDisable(true);
			    	btnD.setDisable(true); btnR.setDisable(true);
			    	btnE.setDisable(true); btnS.setDisable(true);
			    	btnF.setDisable(true); btnT.setDisable(true);
			    	btnG.setDisable(true); btnU.setDisable(true);
			    	btnH.setDisable(true); btnV.setDisable(true);
			    	btnI.setDisable(true); btnW.setDisable(true);
			    	btnJ.setDisable(true); btnX.setDisable(true);
			    	btnK.setDisable(true); btnY.setDisable(true);
			    	btnL.setDisable(true); btnZ.setDisable(true);
			    	btnM.setDisable(true);
			    	btnN.setDisable(true);
			    	
			    	//this.GridTab.setDisable(true);
			    	ImgPendu.setImage(null);
			    	
			    	System.out.println("Vous avez perdu!, Domage!! ");
		    		
		    		
		    	}
		    	
		    	if(!tmp.toString().contains("_")) {
		    		this.gagne = true;
		    		this.labelWarn.setText("Felicitations, Vous avez gagné!");
		    		
		    		btnA.setDisable(true); btnO.setDisable(true);
			    	btnB.setDisable(true); btnP.setDisable(true);
			    	btnC.setDisable(true); btnQ.setDisable(true);
			    	btnD.setDisable(true); btnR.setDisable(true);
			    	btnE.setDisable(true); btnS.setDisable(true);
			    	btnF.setDisable(true); btnT.setDisable(true);
			    	btnG.setDisable(true); btnU.setDisable(true);
			    	btnH.setDisable(true); btnV.setDisable(true);
			    	btnI.setDisable(true); btnW.setDisable(true);
			    	btnJ.setDisable(true); btnX.setDisable(true);
			    	btnK.setDisable(true); btnY.setDisable(true);
			    	btnL.setDisable(true); btnZ.setDisable(true);
			    	btnM.setDisable(true);
			    	btnN.setDisable(true);
			    	//this.GridTab.setDisable(true);
			    	this.btnRejouer.setVisible(true);
			    	
			    	this.btnReset.setDisable(true);;
			    	System.out.println("Vous avez gagné!, Felicitations!! ");
		    	}
		    	
		    }
		    @FXML
		    void ToucheA() {
		    		this.ControlBtn(this.btnA, 'a');
		    	
		    }
	
		    @FXML
		    void ToucheB() {
		    		this.ControlBtn(this.btnB, 'b');
		    }
	
		    @FXML
		    void ToucheC() {
		    		this.ControlBtn(this.btnC, 'c');
		    }
	
		    @FXML
		    void ToucheD() {
		    		this.ControlBtn(this.btnD, 'd');
		    }
	
		    @FXML
		    void ToucheE() {
		    		this.ControlBtn(this.btnE, 'e');
		    }
	
		    @FXML
		    void ToucheF() {
		    		this.ControlBtn(this.btnF, 'f');   
		    }
	
		    @FXML
		    void ToucheG() {
		    		this.ControlBtn(this.btnG, 'g');
		    }
	
		    @FXML
		    void ToucheH() {
		    		this.ControlBtn(this.btnH, 'h');
		    }
	
		    @FXML
		    void ToucheI() {
		    		this.ControlBtn(this.btnI, 'i');
		    }
	
		    @FXML
		    void ToucheJ() {
		    		this.ControlBtn(this.btnJ, 'j');
		    }
	
		    @FXML
		    void ToucheK() {
		    		this.ControlBtn(this.btnK, 'k');
		    }
	
		    @FXML
		    void ToucheL() {
		    		this.ControlBtn(this.btnL, 'l');
		    }
	
		    @FXML
		    void ToucheM() {
		    		this.ControlBtn(this.btnM, 'm');
		    }
	
		    @FXML
		    void ToucheN() {
		    		this.ControlBtn(this.btnN, 'n');
		    }
	
		    @FXML
		    void ToucheO() {
		    		this.ControlBtn(this.btnO, 'o');
		    }
	
		    @FXML
		    void ToucheP() {
		    		this.ControlBtn(this.btnP, 'p');
		    }
	
		    @FXML
		    void ToucheQ() {
		    		this.ControlBtn(this.btnQ, 'q');
		    }
	
		    @FXML
		    void ToucheR() {
		    		this.ControlBtn(this.btnR, 'r');
		    }
	
		    @FXML
		    void ToucheS() {
		    		this.ControlBtn(this.btnS, 's');
		    }
	
		    @FXML
		    void ToucheT() {
		    		this.ControlBtn(this.btnT, 't');
		    }
	
		    @FXML
		    void ToucheU() {
		    		this.ControlBtn(this.btnU, 'u');
		    }
	
		    @FXML
		    void ToucheV() {
		    		this.ControlBtn(this.btnV, 'v');
		    }
	
		    @FXML
		    void ToucheW() {
		    		this.ControlBtn(this.btnW, 'w');
		    }
	
		    @FXML
		    void ToucheX() {
		    		this.ControlBtn(this.btnX, 'x');
		    }
	
		    @FXML
		    void ToucheY() {
		    		this.ControlBtn(this.btnY, 'y');
		    }
	
		    @FXML
		    void ToucheZ() {
		    		this.ControlBtn(this.btnZ, 'z');
		    }
	
			@Override
			public void initialize(URL location, ResourceBundle resources) {
				int port = 7000;
				try {
					this.mp = (modelePenduInterface) Naming.lookup("rmi://localhost:" + port+ "/Pendu");
				}catch(Exception ex){
					System.out.println("Client exception : " + ex);
				}

				
				try {
					this.mot = this.mp.PenseMot().getMot() ;
					this.fois = this.mp.PenseMot().getFois();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String init = "";
				for(int i = 0; i<mot.length();i++) {
					init += "_";
				}
				this.motDevine.setText(init);
			}
	
}

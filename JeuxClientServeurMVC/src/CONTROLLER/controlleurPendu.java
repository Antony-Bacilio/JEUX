package CONTROLLER;
	import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

	public class controlleurPendu implements Initializable {

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
	    
	    private String[] tab = new String[] {"rechercher","politic","ordinateur","souris"};
	    private String mot = this.tab[(int) (Math.random()*this.tab.length)];;
	    private int fois = mot.length();
	    
	    
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
	    	
	    	if(lettreExist==false) {
	    		fois--;
	    		this.ImgPendu.setImage(new Image("/pic/p" + fois + ".png")); 
	    		this.labelWarn.setText("la lettre "+ c + " n'exist pas ! il vous reste "+ fois +"essaies");
	    		
	    		B.setBackground(new Background( new BackgroundFill(Color.web( "CC7722" ), null, null)));
	    	}
	    	else {
	    		B.setBackground(new Background( new BackgroundFill(Color.web( "CC1100" ), null, null)));
	    	}
	    		
	    		this.motDevine.setText(tmp.toString());
	    		
	    	}
	    	else {
	    		this.labelWarn.setText("Vous avez perdu!");
	    	}
	    	
	    	if(!tmp.toString().contains("_")) {
	    		
	    		this.labelWarn.setText("Vous avez gagne!");
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
			
			String init = "";
			for(int i = 0; i<mot.length();i++) {
				init += "_";
			}
		
			
			this.motDevine.setText(init);
		}

}

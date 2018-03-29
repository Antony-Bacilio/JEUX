package CONTROLLER;
import java.net.URL;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ResourceBundle;

import MODELE.modelePenduInterface;
import MODELE.modeleTicTacToe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class controleurTicTacToe implements Initializable{


	    @FXML
	    private ImageView Cas02;

	    @FXML
	    private ImageView Cas21;

	    @FXML
	    private ImageView Cas11;

	    @FXML
	    private ImageView Cas01;

	    @FXML
	    private ImageView Cas20;

	    @FXML
	    private ImageView Cas10;

	    @FXML
	    private ImageView Cas00;

	    @FXML
	    private ImageView Cas12;

	    @FXML
	    private ImageView Cas22;
	    private Image icon;
	    private modeleTicTacToe ObjetDistanceTTT;
	    private int tab[] = new int [9];
	    private int myId;
	    @FXML
	    private Button btnExit;

	    @FXML
	    private Button btnCommencer;

	    @FXML
	    private Labeled lblResultat;

	    @FXML
	    void Commencer(ActionEvent event) {

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
	    
	    
	    public ImageView RempliImg(int n) {
	    	switch(n) {
	    		case 0:
	    			return this.Cas00;
	  
	    		case 1:
	    			return this.Cas01;
	   
	    		case 2:
	    			return this.Cas02;
	    	
	    		case 3:
	    			return this.Cas10;

	    		case 4:
	    			return this.Cas11;
	
	    		case 5:
	    			return this.Cas12;
	    			
	    		case 6:
	    			return this.Cas20;
	    		
	    		case 7:
	    			return this.Cas21;
	    		
	    		case 8:
	    			return this.Cas22;
	 
	    	}
			return null;
	    	
	    	
	    	
	    }

	    public void ChosirIcon() {
	    	
					if(this.myId==1) {
						this.icon = new Image ("/pic/Cercle.png");
					}
					else if(this.myId==2) {
						this.icon = new Image ("/pic/Crois.png");
					}
			
	    }
	    
		private void creeThreadRefresh() {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						try {
							Refresh();
						} catch (RemoteException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			});
			t.start();
		}
	    public void Refresh() throws RemoteException {
	    	this.tab = this.ObjetDistanceTTT.getEtat();
	    	for(int i=0;i<9;i++) {
	    			if(this.tab[i]	==	1) {
	    				this.RempliImg(i).setImage(new Image ("/pic/Cercle.png"));;
	    			}
	    			else if(this.tab[i] == 2) {
	    				this.RempliImg(i).setImage(new Image ("/pic/Crois.png"));;
	    			}
	    		
	    	}
	    }
	    
	    public void ContImg(int nb) throws RemoteException {
    		
    		if(this.tab[nb]==-1) {
    			if(this.myId==1) {
    				this.tab[nb]=1;
    			}else if(this.myId==2){
    				this.tab[nb]=2;
    			}
    		
    		try {
				this.ObjetDistanceTTT.setEtat(tab);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		}
    		
	    }
	    @FXML
	    void ToucheCas00(MouseEvent event) throws RemoteException {
	    		
	    		this.ContImg(0);
	    		
	    }

	    @FXML
	    void ToucheCas01(MouseEvent event) throws RemoteException {
	    		this.ContImg(1);
	    }

	    @FXML
	    void ToucheCas02(MouseEvent event) throws RemoteException {
	    	this.ContImg(2);
	    }

	    @FXML
	    void ToucheCas10(MouseEvent event) throws RemoteException {
	    	this.ContImg(3);
	    }

	    @FXML
	    void ToucheCas11(MouseEvent event) throws RemoteException {
	    	this.ContImg(4);
	    }

	    @FXML
	    void ToucheCas12(MouseEvent event) throws RemoteException {
	    	this.ContImg(5);
	    }

	    @FXML
	    void ToucheCas20(MouseEvent event) throws RemoteException {
	    	this.ContImg(6);
	    }

	    @FXML
	    void ToucheCas22(MouseEvent event) throws RemoteException {
	    	this.ContImg(8);
	    }

	    @FXML
	    void ToucheCas21(MouseEvent event) throws RemoteException {
	    	this.ContImg(7);
	    }

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			int port = 7000;
			
			try {
				this.ObjetDistanceTTT = (modeleTicTacToe) Naming.lookup("rmi://localhost:" + port+ "/Tic-Tac-Toe");
				this.ObjetDistanceTTT.RejointreJeu();
				this.myId = this.ObjetDistanceTTT.getIdJoueur();
				
				this.creeThreadRefresh();
				
			}catch(Exception ex){
				System.out.println("Client exception : " + ex);
			}
	
			
			this.ChosirIcon();
			
			
		}

	

}

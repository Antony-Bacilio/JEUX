package MODELE;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class modelePenduImpl extends UnicastRemoteObject implements modelePendu{

	public modelePenduImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pendu PenseMot() throws RemoteException {
		Pendu p = new Pendu(new String[] {"rechercher","politic","ordinateur","souris"});
		return p;
		
	}



}

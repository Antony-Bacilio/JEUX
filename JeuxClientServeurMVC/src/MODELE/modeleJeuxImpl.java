package MODELE;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class modeleJeuxImpl  extends UnicastRemoteObject implements modeleJeuxInterface{

	public modeleJeuxImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public double add(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}


	@Override
	public ArrayList taquin() throws RemoteException {
		// TODO Stub de la méthode généré automatiquement
		return null;
	}

}

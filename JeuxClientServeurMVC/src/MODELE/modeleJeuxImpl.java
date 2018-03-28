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


	@SuppressWarnings("unused")
	public void initTaquin(int []carre) throws RemoteException {
		// TODO Stub de la méthode généré automatiquement
		//int taquin[] = {1,2,3,4,5,6,7,8,9};
		//carre = taquin;
		int N = carre.length;
		for(int i=0; i<N; i++){
			
			carre[i]= (int) (Math.random()*N+1);
		}
	}


	@Override
	public boolean gagnerTaquin(int[]carre) throws RemoteException {
		// TODO Stub de la méthode généré automatiquement
		boolean gagne = false;
		
		return false;
	}


	@Override
	public int actionMove(int mouvements) throws RemoteException {
		// TODO Stub de la méthode généré automatiquement
		mouvements++;
		return mouvements;
	}

}

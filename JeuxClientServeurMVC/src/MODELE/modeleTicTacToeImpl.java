package MODELE;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class modeleTicTacToeImpl extends UnicastRemoteObject implements modeleTicTacToeInterface{

	private static final long serialVersionUID = 1L;
	private int IdJoueur = 0;
	private int etat[] = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
	public modeleTicTacToeImpl() throws RemoteException {
		super();
	
	}
	
	
	@Override
	public void SetEtatCase() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void RejointreJeu() throws RemoteException {
		if(IdJoueur<2) {
			IdJoueur++;
		}
		
		System.out.println("Client ID : " + IdJoueur);
	}
	
	public int getIdJoueur() {
		return IdJoueur;
	}
	
	public int[] getEtat() {
		return etat;
	}
	
	public void setEtat(int[] etat) {
		this.etat = etat;
	}
	
}

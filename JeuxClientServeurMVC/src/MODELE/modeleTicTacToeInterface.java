package MODELE;

import java.rmi.RemoteException;

public interface modeleTicTacToeInterface extends java.rmi.Remote{
		public void SetEtatCase() throws RemoteException;
		public void RejointreJeu() throws RemoteException;
		public int getIdJoueur() throws RemoteException;
		public void setEtat (int[] etat) throws RemoteException;
		public int[] getEtat() throws RemoteException;
		
}

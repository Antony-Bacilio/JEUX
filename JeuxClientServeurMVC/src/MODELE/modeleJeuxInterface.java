package MODELE;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface modeleJeuxInterface extends Remote{
	
	public double add(double a, double b) throws RemoteException;
	
	/*Taquin*/
	//public ArrayList taquin() throws RemoteException;
	public int[] initTaquin(int carre[]) throws RemoteException;
	public int actionMove(int move) throws RemoteException;
	public boolean gagnerTaquin(int[]carre) throws RemoteException;
	


}
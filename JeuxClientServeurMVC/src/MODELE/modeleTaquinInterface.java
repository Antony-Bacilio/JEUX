package MODELE;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface modeleTaquinInterface extends Remote{
	
	public double add(double a, double b) throws RemoteException;	

	/*Taquin*/
	public int[] initTaquin(int carre[]) throws RemoteException;
	public int actionMove(int move) throws RemoteException;
	public boolean gagnerTaquin(int[]carre, int[] test) throws RemoteException;



}
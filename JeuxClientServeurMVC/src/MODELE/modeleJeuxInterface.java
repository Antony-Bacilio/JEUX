package MODELE;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface modeleJeuxInterface extends Remote{
	
	public double add(double a, double b) throws RemoteException;
	
	/*Taquin*/
	public ArrayList taquin() throws RemoteException;


}
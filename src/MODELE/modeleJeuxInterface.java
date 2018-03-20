package MODELE;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface modeleJeuxInterface extends Remote{
	
	public double add(double a, double b) throws RemoteException;


}
package CONTROLLER;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface taquinInterface extends Remote{
	
	public double add(double a, double b) throws RemoteException;
	
	public double mul(double a, double b) throws RemoteException;

}
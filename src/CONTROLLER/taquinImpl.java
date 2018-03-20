package CONTROLLER;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class taquinImpl  extends UnicastRemoteObject implements taquinInterface{

	public taquinImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public double add(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double mul(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a*b;
	}

}

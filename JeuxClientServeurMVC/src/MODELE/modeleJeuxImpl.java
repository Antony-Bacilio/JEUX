package MODELE;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

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


	@SuppressWarnings("null")
	public int[] initTaquin(int []carre) throws RemoteException {
		// TODO Stub de la méthode généré automatiquement
		int N = carre.length;
		int K = N;
		int[] taquin = null;

		for(int i=0; i<N; i++){
			carre[i] = i+1;
		}
		for(int i=0; i<N; i++){
			int indiceRand = (int) Math.random()*(K-1);           
            taquin[i] = carre[indiceRand];
            carre[indiceRand] = carre[K-1];
            K--;
		}
		return taquin;
	}

	@Override
	public int actionMove(int mouvements) throws RemoteException {
		// TODO Stub de la méthode généré automatiquement
		mouvements++;
		return mouvements;
	}
	
	@SuppressWarnings("unused")
	public boolean gagnerTaquin(int[]carre) throws RemoteException {
		// TODO Stub de la méthode généré automatiquement
		boolean gagne = false;
		int N = carre.length;
		for(int i=0; i<=N; i++){
			if(carre[i] == i+1 && carre[N] == 0) gagne = true;
		}
		return gagne;
	}


	

}

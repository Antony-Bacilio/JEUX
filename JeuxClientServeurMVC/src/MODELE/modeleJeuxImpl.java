package MODELE;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

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

	public int[] initTaquin(int []carre) throws RemoteException {
		// TODO Stub de la méthode généré automatiquement
		int N = carre.length;
		int K = N;
		int[] taquin = new int[N];
		Random rd = new Random();

		for(int i=0; i<N; i++){
			carre[i] = i+1;
		}
		for(int i=0; i<N; i++){
			int indiceRand = rd.nextInt(K);//(int) Math.random()*K;           
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
	
	public boolean gagnerTaquin(int[]carre, int[]resolu) throws RemoteException {
		boolean gagne = false;
		if(carre.length==resolu.length){
			for(int i=0; i<carre.length; i++){
				if(carre[i] == resolu[i]) return gagne = true;
			}
		}
		return gagne;
	}

}

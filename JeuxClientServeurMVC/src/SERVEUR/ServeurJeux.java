package SERVEUR;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import MODELE.modeleJeuxImpl;


public class ServeurJeux {

	public static void main(String[] argv) {
		// TODO Auto-generated method stub

		try{
			int port = 8000;
			LocateRegistry.createRegistry(port);
			Naming.rebind("rmi://localhost:"+ port + "/Jeux", new modeleJeuxImpl());
			System.out.println("\n\tServer prêt pour commencer à Jouer!!!...");
			
		}
		catch(Exception ex){
			System.out.println("Server échec : " + ex);
		}
	}

}
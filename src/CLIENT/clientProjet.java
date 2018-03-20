package CLIENT;

import java.rmi.Naming;

import CONTROLLER.taquinInterface;
import VIEW.vueTaquin;

public class clientProjet {

	public static void main(String[] argv) {
		// TODO Auto-generated method stub

		try{
			int port = 7000;
			taquinInterface objCal = (taquinInterface) Naming.lookup("rmi://localhost:" + port+ "/taquin");
			System.out.println("Client conected...");
			System.out.println("\n- La Somme  est : " + objCal.add(9, 20) );
			System.out.println("\n- La Multiplication  est : " + objCal.mul(-6, -25));
			

			vueTaquin fenetre_taquin = new vueTaquin();
			System.out.println("\n\t\t *********** Bienvenue à : Le Taquin *************");
			fenetre_taquin.setVisible(true);
			fenetre_taquin.setSize(850,500);
			fenetre_taquin.setLocationRelativeTo(null);
			
			//controllerTaquin ct = new controllerTaquin();
			
			
		}
		catch(Exception ex){
			System.out.println("Client exception : " + ex);
		}
		
	}

}


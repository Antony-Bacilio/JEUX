package MODELE;

import java.io.Serializable;

public class Pendu implements Serializable{
    private String motTab[];
    private String mot;
    private int fois;
    
    
	public Pendu(String[] tab) {
		super();
		this.motTab = tab;
		this.mot = this.motTab[(int) (Math.random()*this.motTab.length)];
		this.fois = this.mot.length();
	}
	
	public String getMot() {
		return this.mot;
	}
	
	public void setMot(String mot) {
		this.mot = mot;
	}
	
	public int getFois() {
		return this.fois;
	}
	
	public void setFois(int fois) {
		this.fois = fois;
	}
	
    

}

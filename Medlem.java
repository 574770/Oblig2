package no.hvl.dat102.datakontakt;

import no.hvl.dat102.mengde.adt.MengdeADT;

public class Medlem {
	private String navn;
	private MengdeADT<Hobby> hobbyer;
	private int statusIndeks;

	// Konstruktør

	public Medlem(String navn, MengdeADT<Hobby> hobbyer, int statusIndeks) {
		this.navn = navn;
		this.statusIndeks = -1;
		this.hobbyer = hobbyer;

	}

	public String getNavn() {
		return this.navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;

	}

	public MengdeADT<Hobby> getHobby() {
		return this.hobbyer;
	}

	public void setHobby(MengdeADT<Hobby> hobbyer) {
		this.hobbyer = hobbyer;
	}

	public int getStatusIndeks() {
		return this.statusIndeks;
	}

	public void setStatusIndeks(int StatusIndeks) {
		this.statusIndeks = StatusIndeks;
	}

	public void passerTil (Medlem medlem2) {
		//som avgjør om to medlemmer passer til hverandre og kan danne et par. to medlemmer passer 
		//til hverandre om de har samme hobbyer (tips samme mengde)
		
		for (int i = 0; i<(); i++) {
			
			
		}
		
	}

}

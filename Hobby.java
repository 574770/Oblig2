package no.hvl.dat102.datakontakt;

public class Hobby {

	private String hobbyNavn;

	public Hobby(String hobby) {
		hobbyNavn = hobby;

	}

	public String getHobbyNavn() {
		return this.hobbyNavn;
	}

	public void setHobbyNavn(String hobby) {
		this.hobbyNavn = hobby;
	}

	public String toString() {
		return "<" + hobbyNavn + ">" + "/n";
	}

	public boolean equals(Object hobby2) {
		if (this.equals(hobby2)) {
			return true;

		}
		return false;
	}

}

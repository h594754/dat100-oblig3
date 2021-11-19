package no.hvl.dat100.jplab11.oppgave1;

public abstract class Innlegg {
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;
		
	public Innlegg(int id, String bruker, String dato) {
		this.id = id; 
		this.bruker = bruker; 
		this.dato = dato;
		likes = 0;
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id = id; 
		this.bruker = bruker;
		this.dato = dato; 
		this.likes = likes;

		
	}
	
	public String getBruker() {
		return bruker; 

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato; 
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes ++; 
	}
	
	public boolean erLik(Innlegg innlegg) {
		return (innlegg.getId() == id);

	}
	
	@Override
	public String toString() {
		
		String printtekst = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		return printtekst;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
//	public String toHTML() {
//		
//		throw new UnsupportedOperationException(TODO.method());
//				
//	}
}

public class Knjiga {
	
	private String naziv;
	private double cijena;
	private int stanje;
	private Autor autor;
	
	public Knjiga (String naziv, double cijena, int stanje, Autor autor){
		
		this.naziv=naziv;
		this.cijena=cijena;
		this.stanje = stanje;
		this.autor =autor;
		
	}
		
	public Knjiga(){
		
		this.naziv= "Patuljak iz Zaboravljene zemlje";
		this.cijena=10;
		this.stanje=2;
		this.autor=new Autor();
		
	}
	
	public Knjiga (Knjiga other){
		
		this.naziv=other.naziv;
		this.cijena=other.cijena;
		this.stanje=other.stanje;
		this.autor=new Autor(other.autor);
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCijena() {
		return cijena;
	}

	public void setCijena(double cijena) {
		if (cijena <0){
			throw new IllegalArgumentException("Cijena knjige ne moze biti negativna");
		} else {
			this.cijena = cijena;
		}
	}

	public int getStanje() {
		return stanje;
	}

	public void setStanje(int stanje) {
		this.stanje = stanje;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor.setIme(autor.getIme());
		this.autor.setMail(autor.getMail());
		this.autor.setSpol(autor.getSpol());

		this.autor = autor;
	}
	
	public String toString() {
		return "Naziv knjige: " + naziv + ",\nCijena knjige: " + cijena + ", \nStanje u magacinu: "
				+ stanje + ",\n" + autor ;
	}
	
	public boolean equals(Knjiga knjiga){
		if (this.naziv.equals(knjiga.naziv)&& this.cijena==knjiga.cijena && this.stanje==knjiga.stanje){
			if (this.autor.getIme().equals(knjiga.autor.getIme())&&this.autor.getMail().equals(knjiga.autor.getMail())&& this.autor.getSpol() == knjiga.autor.getSpol()){
				return true;
			}
		} else {
			
		}
		return false;
		
		
	}
}

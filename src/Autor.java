public class Autor {

	private String ime;
	private String mail;
	private char spol;

	/**
	 * Kontruktor sa parametrima.
	 * 
	 * @param ime
	 * @param mail
	 * @param spol
	 */

	public Autor(String ime, String mail, char spol) {
		this.ime = ime;
		this.mail = mail;
		this.spol = spol;
	}

	/**
	 * Konstruktor bez parametara
	 */

	public Autor() {
		this.ime = "NN";
		this.mail = "nomail@gmail.com";
		this.spol = 'M';
	}

	/**
	 * Konstruktor za kopiranje
	 * 
	 * @param other
	 */

	public Autor(Autor other) {
		this.ime = other.ime;
		this.mail = other.mail;
		this.spol = other.spol;
	}

	/**
	 * Ispis parametara!
	 */

	public String toString() {
		return "Autorovo ime: " + ime + " \nMail: " + mail + " \nSpol: " + spol;
	}

	/**
	 * Get-er za ime.
	 * 
	 * @return ime
	 */

	public String getIme() {
		return ime;
	}

	/**
	 * Set-er za ime.
	 * 
	 * @param ime
	 */
	public void setIme(String ime) {
		this.ime = ime;
	}

	/**
	 * Get-er za mail.
	 * 
	 * @return mail.
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Set-er za mail
	 * 
	 * @param mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Get-er za spol.
	 * 
	 * @return
	 */
	public char getSpol() {
		return spol;
	}

	/**
	 * Set-er za spol.
	 * 
	 * @param spol
	 */
	public void setSpol(char spol) {
		if (spol == 'M' && spol == 'Z') {
			this.spol = spol;

			// } else {
			// throw new IllegalArgumentException(
			// "Za unos spola koristite iskljuèivo slova m (za muški) ili ž (za ženski) spol");
		}

	}

	/**
	 * Konstruktor za boolean provjeru jednakosti objekata.
	 * 
	 * @param autor
	 * @return
	 */

	public boolean equals(Autor autor) {
		if (this.ime.equals(autor.ime) && this.mail.equals(autor.mail)
				&& this.spol == autor.spol) {
			return true;
		} else {
			return false;

		}

	}

}
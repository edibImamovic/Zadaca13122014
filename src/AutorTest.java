
public class AutorTest {

	public static void main(String[] args) {
		
		Autor autorKnjige = new Autor();
		Knjiga mojaKnjiga = new Knjiga();
		
		autorKnjige.setIme("Ahmed Hromadzic");
		autorKnjige.setMail("ahmed@hromadzic.com");
		autorKnjige.setSpol('M');
		
		mojaKnjiga.setAutor(autorKnjige);
		mojaKnjiga.setNaziv("Patuljak iz Zaboravljene zemlje");
		mojaKnjiga.setCijena(20);
	
		System.out.println(mojaKnjiga.toString());
	}
	

}

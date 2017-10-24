package lab_1;
import java.util.ArrayList;
import java.util.List;

public class Carte {

	String titlu;
	List<Autor> autori;
	List<Capitol> capitole;
	
	public Carte(String titlu, List<Autor> autori, List<Capitol> capitole)
	{
		this.titlu = titlu;
		this.autori = new ArrayList<Autor>();
		this.capitole = new ArrayList<Capitol>();
	}
	
	public void addAutor(Autor autor)
	{
		this.autori.add(autor);
	}
	
	public void addCapitol(Capitol capitol)
	{
		this.capitole.add(capitol);
	}
	
}

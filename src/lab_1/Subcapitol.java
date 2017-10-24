package lab_1;
import java.util.ArrayList;
import java.util.List;

public class Subcapitol {
	
	String titlu;
	List<Imagine> imagini;
	List<Tabel> tabele;
	List<Paragraf> paragrafe;
	
	public Subcapitol(String titlu)
	{
		this.titlu = titlu;
		this.imagini = new ArrayList<Imagine>();
		this.tabele = new ArrayList<Tabel>();
		this.paragrafe = new ArrayList<Paragraf>();
	}
	
	public void addImagine(Imagine imagine)
	{
		this.imagini.add(imagine);
	}
	
	public void addTabel(Tabel tabel)
	{
		this.tabele.add(tabel);
	}
	
	public void addParagraf(Paragraf paragraf)
	{
		this.paragrafe.add(paragraf);
	}
	
}

package lab_1;
import java.util.ArrayList;
import java.util.List;

public class Capitol {

	String titlu;
	List<Subcapitol> subcapitole;

	public Capitol(String titlu)
	{
		this.titlu = titlu;
		this.subcapitole = new ArrayList<Subcapitol>();
	}
	
	public void addSubcapitol(Subcapitol subcapitol)
	{
		this.subcapitole.add(subcapitol);
	}
	
}

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.lang.Comparable;

class Stud implements Comparable<Stud>
{
	int rollno,marks;
	String name;
	
	public Stud(int rollno, String name ,int marks)
	{
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	public int CompareTo(Stud s)
	{
		return marks>s.marks?1:-1;
	}
	
}
public class ComparableInterface
{

	public static void main(String[] args) 
	{
		
		List<Stud> studs=new ArrayList<>();
		studs.add(new Stud(1,"RENU",48));
		studs.add(new Stud(5,"SELVI",49));
		studs.add(new Stud(3,"TINKOO",45));
		Collections.sort(studs);
		for(Stud s:studs)
		{
			System.out.println(s);
		}
	}

}

package JavaTrickyPrograms;

/*
 * Can we initialize non static member by using static block?
 * Yes we can initialize non static/static member within static block.
 */
public class InitializeNOnStaticMember
{
    int age;
    static String name;
    static {
    	InitializeNOnStaticMember s=new InitializeNOnStaticMember();
    	s.age=20;
    	name="NAME";
    	System.out.println("age="+s.age+" "+"name="+name);
    }
    public static void main(String[] args) {
		
	}
	
}

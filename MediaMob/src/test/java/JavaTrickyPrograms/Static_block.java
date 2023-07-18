package JavaTrickyPrograms;

public class Static_block 
{
    public static void main(String[] args) {
		System.out.println("main="+StaticBlock.a);
		System.out.println("main_RemoveFinalKeyword="+RemoveFinalKeyword.a);
	}
}
class StaticBlock
{
	public static final int a=233;
	static {
		System.out.println("Static="+a);
	}
}
class RemoveFinalKeyword
{
	public static int a=233;
	static {
		System.out.println("Static_RemoveFinalKeyword="+a);
	}
}

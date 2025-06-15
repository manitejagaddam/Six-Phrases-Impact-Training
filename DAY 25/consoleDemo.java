class console
{
    public static void gotoxy( int row, int col )
	{
	   System.out.printf("%c[%d;%dH", 27,row, col); 
	}
	public static void cls()
	{
	   System.out.printf("\033[2J"); 
	}

}
class consoleDemo
{
     public static void main(String [] args)
	 {
		String str = "This is a demo string!!!!!";
		int row;
		int col;
		row = 30/2;
		col = ( 130 - str.length())/2;
		console.cls();
		console.gotoxy( 30, col );
		System.out.print(str);
		
	 }
}
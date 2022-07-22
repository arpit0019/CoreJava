package Inheritance;
interface E  
{
    default void text()
    {
   		System.out.println("Hello");
    }
}

interface F   //Second interface
{
    default void text()
    {
   		System.out.println("What's your name?");
    }
}

class G implements E,F
{

	@Override
	public void text() {
	
		E.super.text();
		F.super.text();
	}

	

 
}

class Multiple2
{
    public static void main(String args[])
	{
         G obj = new G();
         obj.text();   
    }
}


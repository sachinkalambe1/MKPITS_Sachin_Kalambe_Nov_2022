class one{

one()
{

	}
one(int x,int y)
{
	System.out.println(" x="+x +" y="+y);
	}

}
class two extends one{

two()
{

one ob= new one(2,3);

}
}

class Instead_Of_Super_Keyword
{

public static void main(String[] args){

two ob=new two();
}
}

public class noday {

	public static void main(String[] args) {
		String month="January";
		int year=2000;
		switch(month)
		{
		case"January","March","May","July","August","October","December" ->System.out.println("Number of days=31");
		case"April","June","September","November" ->System.out.println("Number of days=30");
		case"February" ->
		{
			if(year%4==0)
				System.out.println("Leap year and number of days =29");
				else
					System.out.println("number of days=28");
		}
		}

	}

}

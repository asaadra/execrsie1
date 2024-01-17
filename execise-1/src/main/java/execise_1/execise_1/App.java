package execise_1.execise_1;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String order_number( int order_number )
	{
		if((order_number>=1)&&(order_number<=11))
			return "Accepted";
		else if ((order_number>11)&&(order_number<=99))
			return "Not Accepted";
		else
			return "error";
	}
}

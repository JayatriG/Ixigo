package Flight;

public class Booking {
		public int calculateFare(String source,String destination,int nop, int noc)
		{
			int fare=0;
			
			if((source.equals("Kolkata") && destination.equals("Delhi")) || (source.equals("Delhi") && destination.equals("Kolkata")))
			{
				fare=(2570*nop) + ((2570/2)*noc);
			}
			if((source.equals("Kolkata") && destination.equals("Hyderabad")) || (source.equals("Hyderabad") && destination.equals("Kolkata")))
			{
				fare=(2875*nop) + ((2875/2)*noc);
			}
			if((source.equals("Kolkata") && destination.equals("Bangalore")) || (source.equals("Bangalore") && destination.equals("Kolkata")))
			{
				fare=(3245*nop) + ((3245/2)*noc);
			}
			if((source.equals("Kolkata") && destination.equals("Pune")) || (source.equals("Pune") && destination.equals("Kolkata")))
			{
				fare=(3055*nop) + ((3055/2)*noc);
			}
			if((source.equals("Kolkata") && destination.equals("Mumbai")) ||(source.equals("Mumbai") && destination.equals("Kolkata")))
			{
				fare=(4725*nop) + + ((4725/2)*noc);
			}
			if((source.equals("Kolkata") && destination.equals("Mysore")) || (source.equals("Mysore") && destination.equals("Kolkata")))
			{
				fare=(3570*nop) + ((3570/2)*noc);
			}
			if((source.equals("Kolkata") && destination.equals("Guwahati")) || (source.equals("Guwahati") && destination.equals("Kolkata")))
			{
				fare=(2150*nop) + ((2150/2)*noc);
			}
			if((source.equals("Delhi") && destination.equals("Guwahati")) || (source.equals("Guwahati") && destination.equals("Delhi")))
			{
				fare=(2350*nop) + ((2350/2)*noc);
			}
			if((source.equals("Delhi") && destination.equals("Hyderabad")) || (source.equals("Hyderabad") && destination.equals("Delhi")))
			{
				fare=(3750*nop) + ((3750/2)*noc);
			}
			if((source.equals("Delhi") && destination.equals("Bangalore")) || (source.equals("Bangalore") && destination.equals("Delhi")))
			{
				fare=(4050*nop) + ((4050/2)*noc);
			}
			if((source.equals("Delhi") && destination.equals("Pune")) || (source.equals("Pune") && destination.equals("Delhi")))
			{
				fare=(3550*nop) + ((3550/2)*noc);
			}
			if((source.equals("Delhi") && destination.equals("Mumbai")) || (source.equals("Mumbai") && destination.equals("Delhi")))
			{
				fare=(4850*nop) + ((4850/2)*noc);
			}
			if((source.equals("Delhi") && destination.equals("Mysore")) || (source.equals("Mysore") && destination.equals("Delhi")))
			{
				fare=(4550*nop) + ((4550/2)*noc);
			}
			if((source.equals("Hyderabad") && destination.equals("Bangalore")) || (source.equals("Bangalore") && destination.equals("Hyderabad")))
			{
				fare=(2510*nop) + ((2510/2)*noc);
			}
			if((source.equals("Hyderabad") && destination.equals("Pune")) || (source.equals("Pune") && destination.equals("Hyderabad")))
			{
				fare=(2850*nop) + ((2850/2)*noc);
			}
			if((source.equals("Hyderabad") && destination.equals("Mumbai")) || (source.equals("Mumbai") && destination.equals("Hyderabad")))
			{
				fare=(3550*nop) + ((3550/2)*noc);
			}
			if((source.equals("Hyderabad") && destination.equals("Mysore")) || (source.equals("Mysore") && destination.equals("Hyderabad")))
			{
				fare=(3150*nop) + ((3150/2)*noc);
			}
			if((source.equals("Hyderabad") && destination.equals("Guwahati")) || (source.equals("Guwahati") && destination.equals("Hyderabad")))
			{
				fare=(3510*nop) + ((3510/2)*noc);
			}
			if((source.equals("Bangalore") && destination.equals("Pune")) || (source.equals("Pune") && destination.equals("Bangalore")))
			{
				fare=(3150*nop) + ((3150/2)*noc);
			}
			if((source.equals("Bangalore") && destination.equals("Mumbai")) || (source.equals("Mumbai") && destination.equals("Bangalore")))
			{
				fare=(5420*nop) + ((5420/2)*noc);
			}
			if((source.equals("Bangalore") && destination.equals("Mysore")) || (source.equals("Mysore") && destination.equals("Bangalore")))
			{
				fare=(3210*nop) + ((3210/2)*noc);
			}
			if((source.equals("Bangalore") && destination.equals("Guwahati")) || (source.equals("Guwahati") && destination.equals("Bangalore")))
			{
				fare=(3950*nop) + ((3950/2)*noc);
			}
			if((source.equals("Pune") && destination.equals("Mumbai")) || (source.equals("Mumbai") && destination.equals("Pune")))
			{
				fare=(3950*nop) + ((3950/2)*noc);
			}
			if((source.equals("Pune") && destination.equals("Mysore")) || (source.equals("Mysore") && destination.equals("Pune")))
			{
				fare=(3180*nop) + ((3180/2)*noc);
			}
			if((source.equals("Pune") && destination.equals("Guwahati")) || (source.equals("Guwahati") && destination.equals("Pune")))
			{
				fare=(4100*nop) + ((4100/2)*noc);
			}
			if((source.equals("Mumbai") && destination.equals("Mysore")) || (source.equals("Mysore") && destination.equals("Mumbai")))
			{
				fare=(3150*nop) + ((3150/2)*noc);
			}
			if((source.equals("Mumbai") && destination.equals("Guwahati")) || (source.equals("Guwahati") && destination.equals("Mumbai")))
			{
				fare=(4520*nop) + ((4520/2)*noc);
			}
			
			
			return fare;
		}
}

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		int r1 = (int)(Math.random() * num);
		int r2 = (int)(Math.random() * num);
		int r3 = (int)(Math.random() * num);
		int smallest = Math.min(r1,(Math.min(r2,r3)));
		int biggest = Math.max(r1,(Math.max(r2,r3)));
		int middle = r1 + r2 + r3 - smallest - biggest ;

		System.out.println(smallest + " " + middle + " " + biggest);







		//Math.min(int,int)
		//Math.max(int,int),
	}
}

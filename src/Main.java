public class Main
{
	public static void main(String sqcString[])
	{
		print(sqcString);
	}

	public static void print(String sqcString[])
	{
		if (sqcString == null)
			return;

		for (int itera = 0; itera < sqcString.length; ++itera)
			System.out.println(sqcString[itera]);
	}
}

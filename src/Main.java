public class Main
{
	public static void main(String sqcString[])
	{
		print(sqcString);
		sort(sqcString);
	}

	public static void print(String sqcString[])
	{
		for (int itera = 0; itera < sqcString.length; ++itera)
			System.out.println(sqcString[itera]);
	}

	public static void sort(String sqcString[])
	{
		print(_QuickSort.sort(sqcString));
	}
}

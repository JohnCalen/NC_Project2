public class Main
{
	public static void main(String sqcString[])
	{
		sort(sqcString);
		print(sqcString);
	}

	public static void print(String sqcString[])
	{
		for (int itera = 0; itera < sqcString.length; ++itera)
			System.out.println(sqcString[itera]);
	}

	public static void sort(String sqcString[])
	{
		String temp;
		int j;
		int length = sqcString.length;
		for(int i = 0; i < length - 1; i++)
		{
			if (sqcString[i].compareTo(sqcString[i + 1]) > 0)
			{
				temp = sqcString[i + 1];
				sqcString[i + 1] = sqcString[i];

				j = i;

				while (j > 0 && temp.compareTo(sqcString[j - 1]) < 0)
				{
					sqcString[j] = sqcString[j - 1];
					j--;
				}

				sqcString[j] = temp;
			}
		}
	}
}

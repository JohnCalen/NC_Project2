public class _QuickSort
{
	private static String sqcStringLocal[];

	public static String[] sort(String sqcStringInner[])
	{
		if (sqcStringInner == null || sqcStringInner.length == 0)
		{
			System.err.println("String array is null or empty");
			return null;
		}

		sqcStringLocal = sqcStringInner;
		quicksort(0, sqcStringLocal.length - 1);

		return sqcStringLocal;
	}

	private static void quicksort(int initLimit, int finalLimit)
	{
		int i = initLimit, j = finalLimit;
		String stringTMP;

		String centralElement = sqcStringLocal[initLimit + ((finalLimit - initLimit) >> 1)];

		while (i <= j)
		{
			while (sqcStringLocal[i].compareTo(centralElement) < 0)
				++i;

			while (sqcStringLocal[j].compareTo(centralElement) > 0)
				--j;

			if (i <= j)
			{
				stringTMP = sqcStringLocal[i];
				sqcStringLocal[i] = sqcStringLocal[j];
				sqcStringLocal[j] = stringTMP;

				++i;
				--j;
			}
		}

		if (initLimit < j)
			quicksort(initLimit, j);

		if (i < finalLimit)
			quicksort(i, finalLimit);
	}
}
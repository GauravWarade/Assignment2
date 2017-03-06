package mob;
public class SplittingMethod
{
	static String word = "We test codesrs.Give us a try?";
	static int i = 0;
	static String[] a;
	public static void main(String[] args) 
	{
		char c[] = word.toCharArray();
		int arr[] = new int[5];
		int j=0;
		for (int i = 0; i < word.length(); i++) 
		{
			if(c[i] == '.'||c[i] == '?'|| c[i]=='!')
			{
				arr[j] = i;
				j++;
			}
		}
		String abc = word.substring(arr[0]+1, arr[1]);
		a = abc.split(" ");
		System.out.println("total word "+getResult());
	}
	public static int getResult()
	{
		for (int k = 0; k < a.length; k++) 
		{
			System.out.print(a[k]+" ");
			i++;
		}
		return i;
	}
}
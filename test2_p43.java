
public class test2_p43 {

	public static void main(String[] args)
	{
		int[] test = {80,60,22,50,75};
		
		for (int i = 0; i < test.length; i++) {
			System.out.println("第" + (i+1) + "個人的分數是"+ test[i] +"分");
		}
		
		System.out.println("考試人數有"+ test.length +"人");
	}
}

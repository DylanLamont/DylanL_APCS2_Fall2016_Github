import java.util.Arrays;

public class LotsOfCopies {
	public static void main(String[] args){
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1,2,3,4,5};
		changeMe(num, strMain, arrMain);
		System.out.println(num);
		System.out.println(strMain);
//		System.out.println(arrMain);
		System.out.println(Arrays.toString(arrMain));
	//	changeMe(num, strMain, arrMain);
	}
	public static void changeMe (int x, String str, int[]arr){
		x = x+7;
		str = "APCS Method Called";
		//System.out.println(str);
		arr[4] = 19;
		//System.out.println(Arrays.toString(arr));
	}
}

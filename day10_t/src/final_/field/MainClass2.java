package final_.field;

import java.util.Arrays;

public class MainClass2 {
	public static void main(String[] args) {
		Collector c1 = new Collector();
		
		System.out.println(Arrays.toString(c1.stickers));
		
		// c1은 final이 붙었으나 변경 가능
		c1.stickers[0] = "파이리";
		
		System.out.println(Arrays.toString(c1.stickers));
	}
	
}

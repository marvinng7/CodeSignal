package dad.codesignal;

import java.util.Arrays;

public class MakeArrayConsecutive2 {

	int makeArrayConsecutive2(int[] statues) {

		Arrays.sort(statues);
		int contador = 0;

		for(int x = 1; x < statues.length; x++){
			contador = contador + (statues[x] - (statues[x-1]+1));
		}
		return contador;
		}
}

package dad.codesignal;

public class adjacentElementsProduct {

	int adjacentElementsProduct(int[] inputArray) {

		int valorMayor= inputArray[0] * inputArray[1];
		int x;
		int tamaño= inputArray.length - 1;
		for(x=1; x < tamaño; x++){
		    int valor= inputArray[x]* inputArray[x+1];
		    if(valorMayor < valor){
		        valorMayor=valor;
		        
		    }
		}
		return valorMayor;

		}
}

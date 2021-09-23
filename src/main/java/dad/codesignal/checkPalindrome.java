package dad.codesignal;

public class checkPalindrome {

	boolean checkPalindrome(String inputString) {
	    int inicio = 0;
	    int fin = inputString.length()-1;
	    for(inicio = 0; inicio < fin; inicio++,fin--){
	        if(inputString.charAt(inicio)!=inputString.charAt(fin)){
	            return false;
	        }
	    }
	    return true;
	}
}

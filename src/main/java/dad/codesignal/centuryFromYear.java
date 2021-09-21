package dad.codesignal;

public class centuryFromYear {

	int century(int year) {

	    return (int)Math.floor(year / 100.0) + ((year % 100.0 == 0) ? 0 : 1);
	}


}

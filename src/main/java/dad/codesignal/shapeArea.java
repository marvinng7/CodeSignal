package dad.codesignal;

public class shapeArea {

	int shapeArea(int n) {

		int x = 2 * n - 1;
		int y = x * x - 4 * (( n * (n-1)/2));
		return y;

		}

}

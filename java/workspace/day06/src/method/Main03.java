package method;

public class Main03 {
	public static int calculateArea(int width, int height) {
		return width * height;
	}

	public static void main(String[] args) {
		int width = 5;
        int height = 8;
        int area = calculateArea(width, height);
        System.out.println("사각형의 넓이: " + area);
	}

}








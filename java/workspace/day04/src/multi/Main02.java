package multi;

public class Main02 {

	public static void main(String[] args) {
		int point = 78;
		
		if( point > 70 && point <= 80 ) {
			//System.out.println("C등급입니다.");
			// 77 초과 : C+ , 74점 미만 : C-
			// 그 외 : C0
			if( point > 77 ) {
				System.out.println("C+입니다.");
			}else if ( point < 74 ) {
				System.out.println("C-입니다.");
			}else {
				System.out.println("C0입니다.");
			}
		}
	}

}






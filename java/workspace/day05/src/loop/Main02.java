package loop;

public class Main02 {

	public static void main(String[] args) {
		// 11시 20분까지
		/*
		 * 1. 아래 그림을 찍으세요(8*8)
		 * 	★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
		 */
		for(int i=0; i<=7; i++) {
			for(int j=0; j<=7; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("------------");
		
		/*
		 * 2. 아래 그림을 찍으세요(8*8)
		 * 	★★★★★★★★
			★★★★★★★
			★★★★★★
			★★★★★
			★★★★
			★★★
			★★
			★
		 */
		for(int i=0; i<=7; i++) {
			for(int j=i; j<=7; j++ ) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("----------");
		/*
		 * 3. 아래 그림을 찍으세요(8*8)
		 *  ★
			★★
			★★★
			★★★★
			★★★★★
			★★★★★★
			★★★★★★★
			★★★★★★★★
		 */
		for(int i=7; i>=0; i--) {
			for(int j=i; j<=7; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	}

}









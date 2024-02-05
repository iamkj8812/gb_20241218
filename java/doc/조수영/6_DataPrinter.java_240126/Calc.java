package todolist;


import java.util.Calendar;

public class Calc {

	public static void show(int[] month) {
		
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String[] day_name = {"일","월","화","수","목","금","토"};
		
		
		cal.set(2024,0,1);
		int start = cal.get(Calendar.DAY_OF_WEEK );
		int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		int day_count = 1;
		System.out.printf("일\t월\t화\t수\t목\t금\t토");
		for(int i = 0 ; i< 50;i++) {
			if(i < start) {
				System.out.print("\t");
			}else {
				if(month[i] == day_count) {
					System.out.printf("%02d",day_count);
					System.out.print("+"+"\t");
					if(i%7==0) {
						System.out.println();
					}
					day_count++;
					
					continue;
				}
				System.out.printf("%02d \t",day_count);
				day_count++;
			}
			if(i % 7 == 0) {
				System.out.println();
			}if(day_count> last) {
				break;
			}
			
		}
		System.out.println();
		
	}
}
		
		
		
		
		
		
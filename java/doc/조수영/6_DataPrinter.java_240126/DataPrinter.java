package todolist;

import java.util.Calendar;
import java.util.Scanner;

public class DataPrinter {
	//캘린더 클래스를 파라미터로 받아 시간 출력하기
	public static void printDateTime(Calendar cal) {
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1;
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		
		System.out.printf(String.format(" %d년 %02d월 %02d일 %02d시 %02d분 %02d초 \n", yy,mm,dd,hh,mi,ss));
	}
	public void act() {
	     Scanner scanner = new Scanner(System.in);
	     Calc calendar = new Calc();
	     Calendar cal = Calendar.getInstance();
	     DataPrinter.printDateTime(cal);
	     int select = 0;
	     int month[] = new int[33];
	     calendar.show(month);
	     int day = 0;
	     String doing;
	     boolean flag = true;
	     TimeBlock myList = new TimeBlock();
	     try {



	    	 while(flag != false) {

	    		 System.out.println("1: add\n2: remove\n3: replace\n4: "
	    		 		+ "clear\n5: View Calendar\n6 : EXIT");
	    		 select = scanner.nextInt();
	    		 if(select != 4 && select != 6) {
	    			 
	    			 System.out.println("----캘린더-----");
	    			 Calc.show(month);
	    		 }
	    		 if(select == 1) {
	    			 System.out.println("날짜를 입력하세요:");
	    			 if(day > 32 || day < 0) {
	    				 System.out.println("잘못된 날짜를 입력하셨습니다. 다시 입력하세요");
	    				 break;
	    			 }
	    			 day = scanner.nextInt();

	    			 month[day+1] = day;
	    		 }


	    		 switch(select) {
	    		 case 1:
	    			 System.out.println("할일은 ?");
	    			 doing = scanner.next();
	    			 myList.add(doing, day);
	    			 myList.display();
	    			 Calc.show(month);
	    			 break;
	    		 case 2:
	    			 System.out.println("삭제할 요일은?");
	    			 day = scanner.nextInt();
	    			 myList.remove(day);
	    			 month[day+1] = 0;
	    			 myList.display();
	    			 Calc.show(month);
	    			 break;
	    		 case 3:
	    			 System.out.println("교체할 요일 두개를 입력하세요");
	    			 int a,b;
	    			 a = scanner.nextInt();
	    			 b = scanner.nextInt();
	    			 myList.replace(a, b);
	    			 myList.display();
	    			 Calc.show(month);

	    			 break;
	    		 case 4:
	    			 myList.clear();
	    			 for(int i = 0 ; i<month.length;i++) {
	    				 month[i] = 0;
	    			 }
	    			 Calc.show(month);
	    			 break;
	    		 case 5:
	    			 myList.display();
	    			 break;
	    		 case 6:
	    			 flag = false;
	    			 System.out.println("종료합니다.");
	    			 break;
	    		 default:
	    			 System.out.println("잘못입력");
	    			 break;
	    		 }

	    	 }
	     }catch(NumberFormatException e) {
	    	 System.out.println("숫자로 기입해주세요");
	     }catch(Exception e) {
	    	 System.out.println("알 수 없는 오류");
	     }
	}
}
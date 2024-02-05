package todolist;

import java.util.Arrays; 



public class TimeBlock{

	private String[] timeBlock; 

	public TimeBlock(){     

	timeBlock = new String[31];

	}

	public void add(String task,int day){   

		timeBlock[day] = task; //할당

		updatingMessage();
	}


	public void remove(int day){ 
		timeBlock[day] = null;

	}
	public void clear(){
		int idx = 0;
		for(String arr : timeBlock) {
			if(arr!=null) {
				timeBlock[idx] = null;
			}
			idx++;
		}

		System.out.println("초기화 되었습니다.");

	} 

	public void replace(int day1, int day2){
		// 유효 숫자 점검
		if(timeBlock[day1]==null ||timeBlock[day2]==null ) {
			System.out.println("할일이 없는 날이 있습니다.");
			return;
		}
		String temp;
		temp = timeBlock[day1];
		timeBlock[day1] = timeBlock[day2];
		timeBlock[day2] = temp;


		updatingMessage();

	}

	public void display(){
		int idx = 0;
		boolean flag = false;
		System.out.println("------- 투두리스트 및 일정 --------");
		for(String arr : timeBlock) {
			if(arr!=null) {
				System.out.println(idx+"일에"+arr);
				flag = true;
			}
			idx++;
		}


		if(!flag) {

			System.out.println("할 일이 없습니다."); 
		}

		System.out.println();
	}
	private void updatingMessage(){

		System.out.println("업데이트 중입니다.");

		System.out.println();
	}   

}




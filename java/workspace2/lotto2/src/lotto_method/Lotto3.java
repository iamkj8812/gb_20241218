package lotto_method;
import java.util.Scanner;
import java.util.Arrays;
public class Lotto3 
{   
	
  	
	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
	    Lotto3_fuc lo = new Lotto3_fuc();
		int mode;
	 	while(true) {
		int[] in_num = new int[6];
	 	int[] out_num = new int[6];
	 	int cor=0;
	 	
	 	System.out.println("★☆★★☆☆로또추첨기★☆★☆★☆");
	    System.out.println("모드선택 1=자동 2=수동 3=1등될때까지한다! 0=종료");
	    mode = sc.nextInt();
	if(mode==1)
	{
		lo.generate_nonDup(out_num);
		lo.align(out_num);		
		
		lo.generate_nonDup(in_num);
		lo.align(in_num);
		
		lo.grade(in_num,out_num,cor);      
		} //mode 1
	else if(mode==2) 
	{
	    System.out.println("번호를 입력해주세요");	    
	    for(int i=0;i<in_num.length;i++)
	    {   
	    	System.out.printf("%d번째 번호 입력",i+1);	        
	    	in_num[i] = sc.nextInt();	
	    	if(!(in_num[i]<=45&&in_num[i]>0))
	    	{i--; System.out.println("로또 번호는 1~45입니다");}
	    	for(int j=0; j<i; j++)
	        {
	        	if(in_num[i]==in_num[j]) 
	        	{i--;
	        	System.out.println("중복되었습니다. 다시입력해주세요");
	        	break;
	        	}		        	
	        }
	    }
	    lo.align(in_num);
	    lo.generate_nonDup(out_num);
	    lo.align(out_num);	
    
	    lo.grade(in_num,out_num,cor);
	}//mode 2
	
	else if(mode==3)
	{   int mode3_A=1;
		lo.generate_nonDup(out_num);
		lo.align(out_num);	
		
		while(true) {
			cor = 0;
			lo.generate_nonDup(in_num);
			lo.align(in_num);
	    for(int i=0;i<in_num.length;i++)
	    {
	    	for(int j=0;j<i+1;j++)
	    	{
	    	if(in_num[i]==out_num[j]) 	    	
	    	cor++;  
	    	}
	    }
	    System.out.println(mode3_A+"번째시도");
	    System.out.println("당첨번호는"+Arrays.toString(out_num)+"입니다.");
	    System.out.println("입력번호는"+Arrays.toString(in_num)+"입니다.");
        if(cor==6) {System.out.println("1등당첨!!!!!!!!!"); break;}    
        mode3_A++;
		}//mode3_while		
		System.out.println("사용금액은"+mode3_A/100000+"억원입니다.");
	}//mode 3
	else if (mode==0) {System.out.println("프로그램을 종료합니다.");break;}
	else System.out.println("올바른숫자를입력해주세요");	
   }//while	
	 	sc.close();
  } //main
}//class

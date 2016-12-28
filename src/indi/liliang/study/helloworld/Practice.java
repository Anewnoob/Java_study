package indi.liliang.study.helloworld;
import java.util.Arrays;

public class Practice {
	public void oneTothree(int scores[]){
		int count=0;
		Arrays.sort(scores);
		for(int i=scores.length-1;i>=0;i--){
			if(scores[i]<100&&scores[i]>=0){
				System.out.println(scores[i]);
				count++;
			}
			else continue;
			if(count==3){break;}
		}
		return;
	}
	
	public static void main(String[] args) {
		Practice a=new Practice();
		int scores[]={89,-23,64,91,119,52,73};
		System.out.println("考试的前三名是：");
		a.oneTothree(scores);
	
	}

}

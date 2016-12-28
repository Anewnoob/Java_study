package indi.liliang.study.helloworld;
import java.util.Scanner;

public class Array {
	public static void main(String args[]){
		//ScannerµÄÊ¹ÓÃ
/*		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		System.out.println(a);*/
		int num[][]=new int[10][10];
        int count = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                num[i][j] = count++;
                System.out.printf("%02d ",num[i][j]);
            }
            System.out.println();
        }
	}
}

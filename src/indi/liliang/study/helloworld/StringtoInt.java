package indi.liliang.study.helloworld;

public class StringtoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	//×Ö·û´®×ªÊý×Ö
        int x =Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int b = Integer.valueOf("444");
        System.out.println(x);
        System.out.println(c);
        System.out.println(b);
        
        //Êý×Ö×ª×Ö·û´®
        int a= 10;
        String str1 = Integer.toString(10);
        String str2 = String.valueOf(10);
        System.out.println(str1);
        System.out.println(str2);
	}

}

package indi.liliang.study.helloworld;

import javax.sql.rowset.CachedRowSet;

public class string1 {
    public static void main(String[] args) {
        // Java�ļ���
		String fileName = "HelloWorld.java"; 
        // ����
		String email = "laurenyang@imooc.com";
		
		// �ж�.java�ļ����Ƿ���ȷ���Ϸ����ļ���Ӧ����.java��β
        /*
        �ο����裺
        1����ȡ�ļ��������һ�γ���"."�ŵ�λ��
        2������"."�ŵ�λ�ã���ȡ�ļ��ĺ�׺
        3���ж�"."��λ�ü��ļ���׺��
        */
        //��ȡ�ļ��������һ�γ���"."�ŵ�λ��
		int index = fileName.lastIndexOf(".");
        
        // ��ȡ�ļ��ĺ�׺
		String prefix =fileName.substring(index);
        
		// �жϱ������"."�ţ��Ҳ��ܳ�������λ��ͬʱ��׺��Ϊ"java"
		if (   prefix.equals(".java")  ) {
			System.out.println("Java�ļ�����ȷ");
		} else {
			System.out.println("Java�ļ�����Ч");
		}

        // �ж������ʽ�Ƿ���ȷ���Ϸ���������������Ҫ����"@", ����"@"����"."֮ǰ
         /*
        �ο����裺
        1����ȡ�ļ�����"@"���ŵ�λ��
        2����ȡ������"."�ŵ�λ��
        3���жϱ������"@"���ţ���"@"������"."֮ǰ
        */
	    // ��ȡ������"@"���ŵ�λ��
		int index2 = email.indexOf('@');
        
        // ��ȡ������"."�ŵ�λ��
		int index3 = email.indexOf('.');
        
		// �жϱ������"@"���ţ���"@"������"."֮ǰ
		if (index2 != -1 && index3 > index2) {
			System.out.println("�����ʽ��ȷ");
		} else {
			System.out.println("�����ʽ��Ч");
		}
		
		
		// ����һ���ַ���
		String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
        
        // ���ִ���
		int num = 0;
		char a='a';
         // ѭ������ÿ���ַ����ж��Ƿ����ַ� a ������ǣ��ۼӴ���
		for (int i=0;i<s.length();i++)
		{
            // ��ȡÿ���ַ����ж��Ƿ����ַ�a
			if (a==s.charAt(i)) {
                // �ۼ�ͳ�ƴ���
				num++; 
			}
		}
		System.out.println("�ַ�a���ֵĴ�����" + num);
	}

}

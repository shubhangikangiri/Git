package practice;

import java.util.Arrays;

public class B {
	
	public static void main(String[] args) {
		
int s[]= {1,45,89,99,76,58,88};	

Arrays.sort(s);
		
for(int i=0;i<s.length;i++) {
	System.out.println(s[i]);
}		
System.out.println("largest no in arrray");
int num=s[0];

for(int i=0;i<s.length;i++) {
if(s[i]>num) {
	
	num=s[i];
}	
}
System.out.println(num);	

System.out.println(s[0]);
System.out.println();
System.out.println("swapping of array");
int b;

for(int i=0;i<=s.length/2;i++) {
	
b=s[i];
s[i]=s[(s.length-1)-1];
s[(s.length-1)-1]=b;	

}System.out.println();
for(int i=0;i<s.length;i++) {
	System.out.println(s[i]);
}
System.out.println(s[0]);












}

}

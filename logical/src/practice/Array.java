package practice;

import java.util.Arrays;

public class Array {
	
public static void main(String[] args) {
	
int a[]= {12,46,79,43,567,55,22};	//array declaration and initialization.

int  b[]=new int[5];  ///array declaration only	.

System.out.println("given array");
for(int i=0;i<a.length;i++) {

	System.out.print(a[i]+",");
}

System.out.println();
System.out.println("revercing of array");

for(int i=a.length-1;i>=0;i--) {
	
	System.out.print(a[i]+",");
}


System.out.println();System.out.println();
System.out.println("array sorting = asscending order");

Arrays.sort(a);

for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
System.out.println();
System.out.println("array desscending order");

for(int i=a.length-1;i>=0;i--) {
	System.out.println(a[i]);
}
System.out.println();
System.out.println("swapping of index of array");



int s[]={5,87,93,67,44,80};

System.out.println("s[0]="+s[0]);
for(int i=0;i<s.length/2;i++) {
int z;
z=s[i];
s[i]=s[(s.length-1)-i];
s[(s.length-1)-i]=z;	
}
for(int j=0;j<s.length;j++) {
	System.out.println(s[j]);
}
System.out.println("s[0]="+s[0]);

System.out.println();
System.out.println("without sort method");

























}	

}

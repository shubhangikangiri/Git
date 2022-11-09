package practice;

public class BBB {

public static void main(String[] args) {
		
int a[]	= {56,67,88,95,853,77,66};

System.out.println(a[0]+"=a[0]");

for(int i=0;i<a.length/2;i++) {
int z;
z=a[i];
a[i]=a[(a.length-1)-i];
a[(a.length-1)-i]=z;	
	
}
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
System.out.println(a[0]+"=a[0]");

}}

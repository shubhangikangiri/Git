package practice;

public class AAA {

public static void main(String[] args) {	

int a[]= {23,45,67,89,24,67,446};	
int A[]= new int [4];
	
System.out.println("given array");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+",");
	
}
System.out.println();System.out.println();
System.out.println("sorting without sort method");
int b;
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
	
if(a[i]>a[j]){
	
b=a[i];
a[i]=a[j];
a[j]=b;

}	

}
System.out.println(a[i]);












}
}}

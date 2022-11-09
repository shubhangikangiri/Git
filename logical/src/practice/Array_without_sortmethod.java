package practice;

public class Array_without_sortmethod {
public static void main(String[] args) {
	
int a[]= {55,23,66,88,33,80,41};	
	
int b=0;

for(int i=0;i<a.length;i++) {
	
for(int j=i+1;j<a.length;j++) {
if(a[i]>a[j]) {
b=a[i];	
a[j]=a[i];
	
}	
}	
}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}}

package practice;

public class Largest_no_in_array {
	
public static void main(String[] args) {
		
int a[]= {2,5,68,97,457,34,56,2345670};	

int num=a[0];

for(int i=0;i<a.length;i++) {
	
if(a[i]>num) {

	num=a[i];
	
	
}	
	
}
System.out.println("largest number ="+num);
//System.out.println(num);


int s[]= {1,22,333,4444,55555};

int sk=s[0];

for(int i=0;i<s.length;i++) {
	
if(s[i]<sk) {
	
	sk=s[i];
}	
	
}

System.out.println("smallest number="+sk);
























}}

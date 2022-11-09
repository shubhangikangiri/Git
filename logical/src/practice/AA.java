package practice;

public class AA {
	public static void main(String[] args) {
		
String a="shubhangi";	
String rev ="";

for(int i=a.length()-1;i>0;i--) {
	
rev = rev+ a.charAt(i);	

}
System.out.println(rev);


int s[]= {56,78,99,35,67,46};

int k=0;
for(int i=0;i<s.length;i++) {
for(int j=i+1;j<s.length;j++) {
if(s[i]>s[j]) {
	k=s[i];
	s[j]=s[i];
	
}	
	
	
}	
	
	
}
for(int i=0;i<s.length;i++) {
	System.out.println(s[i]);
}

int num=s[0];
for(int i=0;i<s.length;i++){
	
if(s[i]<num) {
	num=s[i];
}	
		
}
System.out.println();
System.out.println(num);

}

}

package logical;

public class B {
	public static void main(String[] args) {
		
for(int i=1;i<=10;i++) { //rows

for (int j=1;j<=i;j++) {
	System.out.print("*"); //stars
}
System.out.println();
}	
for(int s=1;s<=9;s++) { //rows
	
for(int k=9;k>=s;k--) {
	System.out.print("*");
}	
System.out.println();
}

}}

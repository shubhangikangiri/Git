package logical;

public class C {
	public static void main(String[] args) {
		
for(int a=1;a<=10;a++) {              //rows
	
for(int b=9;b>=a;b--) {
	System.out.print(" ");
}	
for(int c=1;c<=a;c++) {
	System.out.print("*");
}
System.out.println();
}		
for(int i=1;i<=9;i++) {
	
for(int j=1;j<=i;j++) {
	System.out.print(" ");
}
for(int  k=9;k>=i;k--) {
	System.out.print("*");
}
System.out.println();
}	

}
}
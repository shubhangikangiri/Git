package logical;

public class A {
public static void main(String[] args) {
	
for (int i=1;i<=7;i++) {     //rows
	
for(int j=1;j<=i;j++) {
	System.out.print(" ");
}	
for(int k=1;k<=5;k++) {
	System.out.print("*");
}
System.out.println();

}

for(int s=1;s<=7;s++) {    //rows
	
for(int k=7;k>=s;k--) {
	System.out.print(" ");
}
for(int l=1;l<=5;l++) {
	System.out.print("*");
}
System.out.println();
}
	
}
}

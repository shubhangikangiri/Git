package logical;

public class Rhs {
public static void main(String[] args) {
	for(int x=1;x<=10;x++) {
		
		for(int y=9;y>=x;y--) {
			System.out.print(" ");
		}
		
		for(int z=1;z<=x;z++) {
			System.out.print("* ");
		}
		 System.out.println();
	}
for(int a=1;a<=10;a++) {
	
	
	for(int b=1;b<=a;b++) {
		System.out.print(" ");
		
	}
	for(int c=9;c>=a;c--) {
		System.out.print("* ");
	}
	System.out.println();
}
	
	
}}

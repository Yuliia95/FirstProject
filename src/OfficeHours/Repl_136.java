package OfficeHours;
import java.util.*;
public class Repl_136 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
	                              };
	                            
int result = 0;

result = ((matrix[0][0]+ matrix[1][1]+ matrix[2][2]) - (matrix[0][2] + matrix[1][1]+ matrix[2][0]));
System.out.println(Math.abs(result));
}
}

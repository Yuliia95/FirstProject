package Day30_METHODS02;

public class StudentAtSchool {
	public static void main(String[] args) {
	study("Java");
	sleep(8);
	}
public static void study (String topic) {
	System.out.println("Student is studing "+ topic);
}
public static void sleep(int hours) {
	System.out.println("Student has been sleeping for "+ hours+ " hours");
}
}
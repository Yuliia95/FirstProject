package day07_scanner_operators;

public class PreAndPost2 {
	public static void main(String[] args) {
	
		int messages = 10;
		messages++;// 11
		++messages;// 12
		
		System.out.println("Messages: " + messages);
		
		int ReadMessages = --messages;
		System.out.println("ReadMessages: " + ReadMessages);
		System.out.println("Messages: " + messages);
		
		int unreadMessages = ReadMessages--;
		
		System.out.println("unreadMessages: " + unreadMessages);
		System.out.println("readMessages: " + ReadMessages);
		
		int total = unreadMessages++ - ReadMessages--;
		System.out.println(total);
		
		int count = 20;
		int count2 = 10;
		
		int totalCount = ++count + --count2; // 21 + 9
		System.out.println("count: " + count);// 21
		System.out.println("count2: " + count2);// 9
		System.out.println("totalCount: " + totalCount);// 30
		              //21    +    23
		int myCount = count++ + ++count;
		
		System.out.println("count: " + count);
		System.out.println("mycount: " + myCount);
		
		
		
		
		
		
		
	}
	

}

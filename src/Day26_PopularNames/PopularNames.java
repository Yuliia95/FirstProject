package Day26_PopularNames;

import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;

public class PopularNames {
	public static void main(String[] args) {
	String[] PopularNames = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda",
				"William", "Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah",
				"Charles", "Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty",
				"Donald", "Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna",
				"Kenneth", "Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa",
				"Edward", "Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen",
				"Ryan", "Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley",
				"Stephen", "Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela",
				"Brandon", "Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond",
				"Catherine", "Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis",
				"Emma", "Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie",
				"Douglas", "Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly",
				"Walter", "Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith",
				"Gerald", "Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence",
				"Jean", "Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe",
				"Kathryn", "Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie",
				"Bruce", "Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy",
				"Beverly", "Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel",
				"Rose", "Louis", "Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip",
                "Jane", "Logan", "Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };
	
	
        //print number of names in the array.
		System.out.println("Total names: "+PopularNames.length);
	//print all names in single line 
	System.out.println(Arrays.toString(PopularNames));
	
	
	
	System.out.println("################");
	
	//Print in column format.
	//2 names in each line.
	
	for(int i = 0; i < PopularNames.length; i+=2) {
		System.out.println(PopularNames[i]+ ", "+PopularNames[i+1]);
	}
	//print male names in single line separated by comma
	System.out.println("########## MALE NAMES: ");
    for(int m = 0; m < PopularNames.length; m+=2) {
    	System.out.print(PopularNames[m]+ ", ");
}
//print female names in single line separated by comma
    System.out.println("########## FEMALE NAMES: ");
	for(int idx = 0;idx < PopularNames.length; idx++ ) {
		if(idx %2 == 1) {
		System.out.print(PopularNames[idx]+ ", ");	
		}
	}
	//PRINT random name from this array
	//use Random class
	Random random = new Random();
	int r = random.nextInt(PopularNames.length);
	System.out.println("Random name: "+PopularNames[r]);	
	
	
	//PRINT all names that are up to 4 characters, in uppercase, in same line 
	for(String name : PopularNames ) {
		if(PopularNames.length <= 4 ) {
			System.out.print(PopularNames.length + ", ");
		}
	}
  System.out.println("\nNAMES LENGTH SORT");
	String namesUpto4 = "";
	String names5to6 =  "";
	String names7orMore = "";
	
	for(String name : PopularNames) {
		if(PopularNames.length<= 4) {
			namesUpto4 += name + ", ";
		}else if(name.length()==5 ||PopularNames.length ==6 ) {
			names5to6 += name+ ", ";
		}else{
			names7orMore += name + ", ";
	}
	}
	System.out.println("namesUpto4: "+namesUpto4); 
	System.out.println("names5to6: "+ names5to6 );
    System.out.println("names7otMore: "+names7orMore);	
     
    System.out.println(Arrays.toString(PopularNames));
    //CODE HERE
 // reverse the Array
	for(int i = 0; i < PopularNames.length; i++) {
	String temp = PopularNames[i];
	PopularNames[i] = PopularNames[i+1];
	PopularNames[i+1] = temp;
	
	}
	System.out.println(Arrays.toString(PopularNames));
	
	// reverse the Array
	String str1 = "first word";
	String str2 = "second word";
	
	String temp = str1;
	str1 = str2;
	str2 = temp;
	
	System.out.println("str1 - "+str1);
	System.out.println("str2 - "+str2);
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	}



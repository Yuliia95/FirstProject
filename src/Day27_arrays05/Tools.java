package Day27_arrays05;

public class Tools {
	public static void main(String[] args) {
		//Java --> programming language
        // Selenium --> Test Automation
         //TesNG --> Unit Test
         //JUnit --> Unit Test
        // Cucumber --> BDD Style testing 
        // Git --> Version control
        //Maven --> building and execution for project 

//String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"} 

 String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};

  for(String tool : tools) {
  switch(tool.toLowerCase()) {
  case  "java":
	System.out.println("Java --> programming language") ;
	break;
  
  case  "Selenium":
		System.out.println(" Selenium --> Test Automation") ;
		break;

  case  "TesNG":
  case "JUnit":	
	  System.out.println(tool+ "Testing tool") ;
		break;
  
  case  "Cucumber":
		System.out.println("Cucumber  --> BDD Style testing ") ;
		break;
  
  case  "Git":
		System.out.println("Git --> Version control") ;
		break;
  
  case  "Maven":
		System.out.println("Maven --> building and execution for project") ;
		break;	
  
  default:
	  System.out.println("Unknown tool") ;
  break;
  }
 }

}
}

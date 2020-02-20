public class Lab5{
	public static void main(String[] args){
		
 
 try {

 	if  (args.length==2){
 		
 	
 	System.out.println( args[0]);
    System.out.println( args[1]);

} else {
	System.out.println("Usage:java Lab5 <int> <int>");
	System.exit(1);


}
  String myString="137";

   int n=Integer.parseInt(args[0]);
   int m=Integer.parseInt(args[1]);
    int p=n/m;

    System.out.println( p);
 }
 
 
  catch (Exception e){
   
   
   System.out.println(e);

   throw e;
 } 
  System.out.println( "still running");






	}

}
package chapter09;

	public class Ex9_02 {
			public static void main(String[] args) {
				Person p1 = new Person(801111111112l);
				Person p2 = new Person(801111111112l);
				
				if(p1==p2) {
					System.out.println("p1과 p2는 같은 사람");
				} else {
					System.out.println("p1과 p2는 다른 사람");
				}
			
				if (p1.equals(p2))
					System.out.println("p1과 p2는 같은 사람");
				else 
					System.out.println("p1과 p2는 다른 사람");
				
			}
	}
	
   class Person {
   long id;
   
   public boolean equals(Object obj) {
	   if (obj instanceof Person) 
		   return id == ((Person)obj).id;
	   else 
		   return false;
   }

   Person(long id) {
	   this.id =id;
   }
 }
package review;

class Gun{
	
	void shoot() {
		System.out.println("BBang");
	}
	
}




class soldier extends Gun{
	
	private Gun gun;
	
	
	public Gun getGun() {
		return gun;
	}



	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	
	public soldier() {
		gun = new Gun();
	}


	void walk() {
		System.out.println("walk");
	}
	public void shoot() {
		gun.shoot();
	}
}




public class has_a_without_extends {
   public static void main(String[] args) {
	   
	   
	   
	  soldier s = new soldier();
	  
	  s.walk();
	  s.shoot();
	  
	
}
	

}

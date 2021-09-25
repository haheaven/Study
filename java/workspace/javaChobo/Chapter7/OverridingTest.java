package Chapter7;


class Point3 { 
	int x;
	int y;
	
	String getLocation() {
		return "x :"+x+", y+ :" + y;
	}
}
 
class point3d extends Point3 {
	int z;
	
	String getLocation() {
		return "x: " +x+", y :" +y+", z:" +z; //오버라이딩 
	}
}
public class OverridingTest {
	public static void main(String[] args) {
	 point3d p =new point3d();
	 p.x = 3;
	 p.y =3;
	 p.z =3;
	 System.out.println(p.getLocation());
	 
	
	 

	}

}

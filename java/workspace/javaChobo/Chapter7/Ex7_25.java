package Chapter7;

public class Ex7_25 {
	public static void main(String[] args) {
	     Tank t = new Tank();
	 Dropship d = new Dropship();
	 
	 Marine m = new Marine();
	    SVC s = new SVC();

	    s.repair(t);
	    s.repair(d);
	    s.repair(m);
	}
}
interface Repairable {}

class Unit2{
	int hitPoint;
	final int MAX_HP;
	Unit2(int HP) {
		MAX_HP = HP;
	}
}
class GroundUnit extends Unit2 {
	GroundUnit(int hp) {
		super(hp);
	}
}
class AirUnit extends Unit2 {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}
class Dropship extends GroundUnit implements Repairable {
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dorpship";
	}
}
class Marine extends GroundUnit implements Repairable {
	Marine() {
		super(100);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Marine";
	}
}
class SVC extends GroundUnit implements Repairable {
	SVC() {
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) {
		if (r instanceof Unit2) {
			Unit2 u = (Unit2)r;
			while(u.hitPoint!=u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "수리끝");
		}
	}
}


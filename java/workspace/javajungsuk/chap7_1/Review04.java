package chap7_1;

// ex 7-26

public class Review04 {
	public static void main(String[] args) {
		
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
	//	scv.repair(marine);
	}
}	
		interface Repairable{}
		
		class Unit {
			int hitPoint;
			final int MAX_HP;
			Unit(int hp){
				MAX_HP = hp;
			}
		}
		
		class GroundUnit extends Unit {
			GroundUnit(int hp){
				super(hp);
			}
		}
		
		class AirUnit extends Unit{
			 AirUnit(int hp) {
				super(hp);
			}
		}
		class Tank extends GroundUnit implements Repairable {
			Tank(){
				super(150);
				hitPoint = MAX_HP;
			}
			public String toString() {return "Tank " + hitPoint; }
		}
		
		class Dropship extends AirUnit implements Repairable {
			Dropship(){
				super(125);
				hitPoint = MAX_HP;
			}
			public String toString() {return "Dropship " + hitPoint; }
		}
		
		class Marine extends GroundUnit {
			Marine(){
				super(40);
				hitPoint = MAX_HP;
			}
			public String toString() {return "Marine"; }
		}
		
		class SCV extends GroundUnit implements Repairable {
			SCV(){
				super(60);
				hitPoint = MAX_HP;
			}
			void repair(Repairable r) {          // r을 구현한 클래스는 Tank Dropship이다 
				Unit u = (Unit) r;
				while(u.hitPoint!=u.MAX_HP) {     //  tank나 dropship의 hitpoint 와 max_hp가 같기 때문에 증가는 없다 . 
					u.hitPoint++;
				}
				System.out.println(u.toString() + "의 수리가 끝났습니다, ");
			}
		}

/*
 	 인터페이스 
 	
		* 구현된 것이 없는 기본 설계도 
		* 인터페이스는 구현부에 아무것도 갖고 있지 않기 때문에 다중상속시에도 충돌되지 않는다 때문에 다중상속이 가능하다. => 하지만 구현 경우 거의 없음 
		* 인터페이스에 정의된 추상메서드를 완성하는 것을 '구현'이라고 한다. 
 		* 인터페이스는 구현한 클래스의 조상이다. 해당 인터페이스 타입의 참조변수로 이를 구현한 클래스의 인스턴스를 참조할 수 있으며, 인터페이스 타입으로 형변환 가능 하다. 
 		* 장점 
 		  1) 개발 시간 단축  :  인터페이스의 선언부만알면 서로 다른 구현부 작성 가능 
 		  2) 표준화 가능    :   인터페이스가  표준을 만듦 
 		  3) 서로 관계 없는 클래스의 관계 맺기 가능  : 하나의 인터페이스를 주어 관계를 맺어줌 
 		  4) 독립적인 프로그래밍 가능   :  구현을 분리하여 구현하는 것이기 때문에 각 각 만든 클래스들이 영향이 없다. 
 	
 */

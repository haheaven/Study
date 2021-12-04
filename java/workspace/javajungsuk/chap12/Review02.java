package chap12;

public class Review02 {
	public static void main(String[] args) {
		
		
		// 연습문제3. 다음 중 올바르지 않은 문장을 모두 고르시오.
		/*
		    class Box<T extends Fruit> {
		    	 T item;
		    	 
		    	 void setItem(T item) {this.item = item }
		    	 T getItem()  { return item; }
		    	 
		  ------------------------------------------------------------------------
		    a. Box<?> b = new Box();             ==> 문제는 없지만 new Box<>()가 올바르다. 
			b. Box<?> b = new Box<>();           ==> Box의 최고는 Fruit이므로 ? 는 <? extend Fruit>
			c. Box<?> b = new Box<Object>();
			d. Box<Object> b = new Box<Fruit>(); 
			e. Box b = new Box<Fruit>();         ==> 문제는 없지만 Box<?>b가 올바르다.
			f. Box<? extends Fruit> b = new Box<Apple>();
			g. Box<? extends Object> b = new Box<? extends Fruit>();
			
			정답 
			  c. 문제 박스를 보면 class Box<T extend Fruit>로 Object의 사용은 볼 수 없다.
			    때문에 Box<?> 최고 조상은 Fruit이므로  new Box<Object>는 될 수 없다 
			    ==>  Box<?> b = new Box<Fruit>()
			    
			  d. <Object>  <Fruit>  => 타입 불일치    
			  
			  g. new 연산자를 통한 객체 생성은 타입이 명확해야한다. 
			   <? extends Fruit> => 타입이 Fruit, Apple, Grape  가능한 타입이 명확하지 (Apple, Grape은 Fruit의 자손이다. )
		 */
	}
}	

/*   와일드 카드 
    상속관계라도 지네릭타입이 다르면 오버로딩이 성립되지 않으며, 이와 같은 경우가 발생하면 '메서드의 중복 정의'이다.
     --> 상속관계에서 사용할 타입을 결정하지 못한 경우에 '와일드 카드' 를 사용하여 해결할 수 있다. 
     < ?  extends T >  T와 그 자손들 
     < ?  super T > T와 그 조상들 
     < ? >  제한 없음 == < ? extends Object >
  
 */
 







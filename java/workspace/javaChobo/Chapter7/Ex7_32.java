package Chapter7;

	class InnerEx3 {
		private int outerIv =0;
		static int outerCv = 0;
		
		class InstanceInner{
			int iiv = outerIv;   //외부클래스의 private 멤버 접근가능 
			int iiv2 = outerCv;
		}
		static class StaticInner {
			//스태틱클래스는 외부 클래스의 인스턴스 멤버에 접근할수없다.
	//		int siv =outerIv;
			static int scv =outerCv;
		}
		void myMethod() {
			int lv =0;
			final int LV = 0; //jdk1.8 부터 final 생략가능 
			
		    class LocalInner {
		    	int liv = outerIv;
		    	int liv2 = outerCv;
		    //외부 클래스의 지역변수는 final이 붙은 변수만 접근가능 
		    	int liv3 = lv;
		    	int liv4 = LV;
		    }
		}
	}
	
	
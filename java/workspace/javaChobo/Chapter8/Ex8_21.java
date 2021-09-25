package Chapter8;

import java.io.File;

public class Ex8_21 {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간 확보 후 다시 설치해주세요");
		} catch (MemoryException me) {
			System.out.println("에러 메시지 : " + me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("다시 설치 시도하세요");
		} finally {
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("설치공간 부족");
		if(!enoughMemory())
			throw new MemoryException("메모리 부족");
	}
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return false;
	}
}

    class SpaceException extends Exception { 
	  SpaceException(String msg) {
		super(msg);
	}
}
   class MemoryException extends Exception {
	  MemoryException(String msg) {
		super(msg);
	}
}
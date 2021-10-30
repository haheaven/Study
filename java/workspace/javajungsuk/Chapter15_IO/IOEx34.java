package ch15;

import java.io.File;
import java.io.FilenameFilter;

class IOEx34 {
	
	public static void main(String[] args)  {
		String currDir = System.getProperty("user.dir");
		currDir += "/src/ch15/";
		File dir = new File(currDir);
			final String pattern = "IOEx";
		
		String[] files = dir.list(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.indexOf(pattern) != -1;
				}
			});		
		for(int i=0; i<files.length; i++) {
			System.out.println(files[i]);
		}
	}
}
		 
		 
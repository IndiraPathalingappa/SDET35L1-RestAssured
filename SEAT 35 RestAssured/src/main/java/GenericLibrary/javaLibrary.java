package GenericLibrary;

import java.util.Random;

/**
 * This class is used to write the javaUtilities
 * @author indir
 *
 */
public class javaLibrary {
	
	public int getRandomNumber() {
		
		Random ran = new Random();
		int rannum = ran.nextInt(500);
		return rannum;
		
	}
	

}

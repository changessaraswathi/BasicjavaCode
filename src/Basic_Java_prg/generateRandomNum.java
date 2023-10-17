package Basic_Java_prg;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class generateRandomNum {

	public static void main(String[] args) {
		//Type One
		Random r = new Random();
		System.out.println(r.nextInt());
		
		//Type two
		System.out.println(Math.random());
		
		//Type three
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextDouble());

	}

}

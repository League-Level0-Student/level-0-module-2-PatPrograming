package _06_lottery_numbers;
import java.util.Random;
public class LotteryThatsNotSafeForKids {
public static void main(String[] args) {
	
	int ran=0;
	ran=new Random().nextInt(11);
	int ran1=0;
	ran1=new Random().nextInt(11);
	int ran2=0;
	ran2=new Random().nextInt(11);
	int ran3=0;
	ran3=new Random().nextInt(11);
	int ran4=0;
	ran4=new Random().nextInt(11);
	System.out.println(ran+""+ran1+ran2+ran3+ran4);
}
}

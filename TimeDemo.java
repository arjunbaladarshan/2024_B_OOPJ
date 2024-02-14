class Time{
	int hour;
	int minute;
	int seconds;

	public Time(){

	}

	public Time(int hour, int minute, int seconds){
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}


	public void timeDiff(Time temp){
		Time ans = new Time();
		ans.hour = this.hour - temp.hour;
		ans.minute = this.minute - temp.minute;
		ans.seconds = this.seconds - temp.seconds;

		System.out.println("Hour = "+ans.hour);
		System.out.println("Minute = "+ans.minute);
		System.out.println("Seconds = "+ans.seconds);
	}
}
public class TimeDemo{
	public static void main(String[] args) {
		Time t1 = new Time(11,59,0);
		Time t2 = new Time(12,00,0);

		t2.timeDiff(t1);
	}
}
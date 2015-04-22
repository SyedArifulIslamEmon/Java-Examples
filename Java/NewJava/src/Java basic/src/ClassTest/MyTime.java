package ClassTest;

public class MyTime {

	int hour;
	int minute;
	int second;

	public MyTime(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public String toString() {

		return hour + ":" + minute + ":" + second;
	}

	public MyTime nextSecond() { // error...............

		if (second > 0 && second < 60) {

			MyTime t1 = new MyTime(hour, minute, second + 1);

			return t1;
		} else {
			if (minute < 60) {
				MyTime t1 = new MyTime(hour, minute + 1, 0);
				return t1;
			} else {
				if (hour <24) {
					MyTime t1 = new MyTime(hour + 1, 0, 0);
					return t1;
				} else {

					MyTime t1 = new MyTime(1, 0, 0);
					return t1;

				}
			}
		}
	}

	public MyTime nextMinute() { // error..........
		if (minute >= 0 && minute < 60) {

			MyTime t1 = new MyTime(hour, minute + 1, second+1);

			return t1;
		} else {
			if (hour < 24) {
				MyTime t1 = new MyTime(hour + 1, 0, 0);
				return t1;
			} else {
				MyTime t1 = new MyTime(1, 0, 0);
				return t1;
			}
		}
	}

	public MyTime nextHour() {  //error.............
		if (hour > 0 && hour < 24) {
			MyTime t1 = new MyTime(hour + 1, minute, second);
			return t1;
		}
		 else {
			MyTime t1 = new MyTime(1, minute, second);
			return t1;

		}
	}

	public MyTime previousSecond() {
		if (second > 1) {

			MyTime t4 = new MyTime(hour, minute-1, second - 1);
			return t4;
		} else {
			if(minute>1){
			MyTime t4 = new MyTime(hour, minute-1, 60);
			return t4;
			}
			else{
				if(minute>1){
					MyTime t4=new MyTime(hour-1,60,60);
					return t4;
				}
				else{
					MyTime t4=new MyTime(24,60,60);
					return t4;	
					
				}
				
			}

		}

	}

	public MyTime previousMinute() {
		if (minute > 1) {

			MyTime t5 = new MyTime(hour, minute - 1, second);
			return t5;
		} else {
			if (hour>1) {
				MyTime t5 = new MyTime(hour - 1, 60, second);
				return t5;
			} else {
				MyTime t5 = new MyTime(24, 60, second);
				return t5;
				
			}

		}
	}

	public MyTime previousHour() {
		if (hour > 1) {
			MyTime t6 = new MyTime(hour - 1, minute, second);
			return t6;
		} else {
			MyTime t6 = new MyTime(24, minute, second);
			return t6;

		}

	}
}

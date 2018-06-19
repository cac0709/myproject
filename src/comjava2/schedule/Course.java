package comjava2.schedule;

public class Course {
	String id;
	String name;
	int weekDay;
	int hour;
	int duration;
	
	
	public Course(String id, String name, int weekDay, int hour, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.weekDay = weekDay;
		this.hour = hour;
		this.duration = duration;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(int weekDay) {
		this.weekDay = weekDay;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}

public class Clock{

       private int hour;
       private int minute;
       private int second;

    public Clock(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
	}


    public void setHour(int hour){
       if(hour < 23){
       this.hour = hour;
       }
        if(hour > 23){
       this.hour = 0;
       }
       }

    public int getHour(){
	return hour;
	}

    public void setMinute(int minute){
        if(minute < 59){
	this.minute = minute;
	}
	if(minute > 59){
	this.minute = 0;
	}
	}
    public int getMinute(){
       return minute;
	}

    public void setSecond(int second){
        if(second < 59){
 	this.second = second;
	}
	if(second > 59){
        this.second = 0;
	}
	}
	
    public int getSecond(){
        return second;
	}

    public void displayTime(){
	System.out.printf("The time is %d:%d:%d",  getHour(), getMinute(), getSecond());
 	}





















}
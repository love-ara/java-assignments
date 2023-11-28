 
  public class HeartRates{
	private String firstName;
	private String lastName;
	private int monthOfBirth;
        private int dayOfBirth;
	private int yearOfBirth;

    public HeartRates(){
        }

    public void setFirstName(String firstName){
         this.firstName = firstName;
       }
    public String getFirstName(){
        return firstName;
	}

    public void setLastName(String lastName){
         this.lastName = lastName;
       }
    public String getLastName(){
        return lastName;
	}

    public void setMonthOfBirth(int monthOfBirth){
         this.monthOfBirth = monthOfBirth;
       }
    public int getMonthOfBirth(){
        return monthOfBirth;
	}

    public void setDayOfBirth(int dayOfBirth){
         this.dayOfBirth = dayOfBirth;
       }
    public int getDayOfBirth(){
        return dayOfBirth;
	}
    public void setYearOfBirth(int yearOfBirth){
         this.yearOfBirth = yearOfBirth;
       }
    public int getYearOfBirth(){
        return yearOfBirth;
	}

    public int getAge(){
       int age = (2023 - getYearOfBirth());
       return age;
     }

    public double getMaximumHeartRate(){
       double maximumHeartRate = (220 - getAge());
       return maximumHeartRate;
     }

    public double getTargetHeartRate1(){
      double targetHeartRate1 = ( 0.05 * getMaximumHeartRate());
      return targetHeartRate1;
     }

    public double getTargetHeartRate2(){
      double targetHeartRate2 = ( 0.85 * getMaximumHeartRate());
      return targetHeartRate2;
     }














}
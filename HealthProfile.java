public class HealthProfile{
     private String firstName;
     private String lastName;
     private String gender;
     private int monthOfBirth;
     private int dayOfBirth;
     private int yearOfBirth;
     private double heightInInches;
     private double weightInPounds;
    
    public HealthProfile(){
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

     public void setGender(String gender){
        this.gender = gender;
	}
     public String getGender(){
          return gender;
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

     public void setHeightInInches(double heightInInches){
	   this.heightInInches = heightInInches;
        }
     public double getHeightInInches(){
	return heightInInches;
	} 
     public void setWeightInPounds(double weightInPounds){
	   this.weightInPounds = weightInPounds;
        }
     public double getWeightInPounds(){
	return weightInPounds;
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



     public double getBmi(){
       double bmi = ( getWeightInPounds() * 703) / (getHeightInInches()  * getHeightInInches());
           return bmi;
	}


       
























}
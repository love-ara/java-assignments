public class AccountFive{

       private int id;
       private double balance;
       private double annualInterestRate;
       private String dateCreated;

      public AccountFive(int id, double balance, double annualInterestRate, String datedCreated){
              this.id = id;
              this.balance = balance;
              this.annualInterestRate = annualInterestRate;
              this.dateCreated = dateCreated;
}

       public AccountFive(){ 
}
       public void setId(int id){
              this.id = id;
}

       public int getId(){
              return id;
}
       public void setDateCreated(String dateCreated){
                 this.dateCreated = dateCreated;
}

       public String getDateCreated(){
               return dateCreated;
}
       public void setBalance(double deposit ){
                if(balance > 0.0) 
		this.balance = balance;
}

       public double getBalance(){
              return balance;
}
       public void deposit(double depositAmount){
            if(depositAmount > 0.0){
           balance = balance + depositAmount;
}
}

        public void withdraw(double withdrawAmount){
        if(withdrawAmount < balance){
        balance = balance - withdrawAmount;
} 
}

        public void setAnnualInterestRate(double annualInterestRate){ 
              this.annualInterestRate = annualInterestRate;
}

        public double getAnnualInterestRate(){
                  return annualInterestRate;
}

        public double getMonthlyInterestRate(){
           double monthlyInterestRate = (getAnnualInterestRate() /100) / 12;
           return monthlyInterestRate;
}
     
        public double getMonthlyInterest(){
            double monthlyInterest = getBalance() * getMonthlyInterestRate();
            return monthlyInterest;
}

















}




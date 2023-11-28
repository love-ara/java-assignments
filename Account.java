public class Account {

        private String name;
        private double balance;

        public Account(String name, double balance){

            this.name = name;
            if(balance > 0.0){
            this.balance = balance;
	    }
        }
        public void setName(String name){
          this.name = name;
	}
     
        public String getName(){
            return name;
	}

        public void setBalance(double balance){
            if(balance > 0.0)
             this.balance = balance;
	}

        public double getBalance(){
            return balance;
         }

	public void deposit(double depositAmount){
	if(depositAmount > 0.0)
	balance = balance + depositAmount;
	}

	public void withdraw(double withdrawAmount){
	 if(withdrawAmount < balance){
	  balance = balance - withdrawAmount;
	 }
	 if(withdrawAmount > balance){
	   balance = balance;
	  System.out.println("Withdrawal exceeds balance");
	  }
       }
	


























}
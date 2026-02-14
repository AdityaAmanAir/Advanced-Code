import java.util.*;
public class bank {
    static Map<String, String> userData = new HashMap<>();
    public void create_acc(String usr, String pass){
            userData.put(usr,pass);
        }
    public  boolean  find_acc(String user){
            return ((userData.containsKey(user))? true:false);
        }
    public boolean checkPass(String user,String pass){
            String correctPass= userData.get(user);
            if(correctPass==pass){
                return true;
            }return false;
        }
public static class BankAcc{
        int userID;
        String pass;
        String user_name;
        int acc_pin;
        long balance=0;

        public BankAcc(int userID, String pass,String user_name,int acc_pin,long balance){
        this.userID=userID;
        this.pass=pass;
        this.user_name=user_name;
        this.acc_pin=acc_pin;
        this.balance=balance;
    }

        int dobYear= 0;
        String branch = "N/A";
        String Country = "N/A";
        int phone = 0;
        String email ="N/A";
        String panCard ="N/A";

        private boolean  addMoney(int amount){
            if(amount>0){
                balance+=amount;
                return true;
            }return false;
            
        }
        private boolean withdraw(int amount){
            if(balance-amount>0 && amount>0){
                balance-=amount;
                return true;
            }return false;
        }

        private long checkBal(){
            return balance;
        }

    };
    
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        bank myBank  = new bank();
        while(true){
        System.out.print("Welcome\nEnter you user ID (or press 0 to open Account): ");
        String usr= sc.nextLine();
            if(myBank.find_acc(usr)==true){
                System.out.println("Wlelcome Back! ");
            }else{
                System.out.println("Not Found!");
            }
        }
    }
}

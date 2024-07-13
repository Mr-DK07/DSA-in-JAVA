public class C6Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.tip = 8;
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();

        myAcc.userName = "Dev";
        System.out.println(myAcc.userName);

        // myAcc.Password = "xyz"; we cannot access it like this, because it is private.
        myAcc.setPassword("abc");
    }
}

// Access Modifiers
class BankAccount {
    public String userName;
    public String Password;

    String getPassword() {
        return this.Password;
    }

    public void setPassword(String pwd) {
        Password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

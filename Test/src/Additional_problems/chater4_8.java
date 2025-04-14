package Additional_problems;

public class chater4_8 {

    // 계좌에 돈을 집어넣고 각각 입력에 따른 은행처리를 하는 문제
    public static void main(String[] args) {
        Account a = new Account();

        a.deposit(5000);
        System.out.println("잔금은" + a.getBalance() + "원입니다.");

        int bulk[] = { 100, 500, 200, 700 };
        a.deposit(bulk);
        System.out.println("잔금은" + a.getBalance() + "원입니다.");

        int money = 1000;
        int wMoney = a.withdraw(money);
        if (wMoney < money) {
            System.out.println(wMoney + "원만 인출");// 잔금이 1000보다 크면?
        } else {
            System.out.println(wMoney + "원 인출");// 작으면?
        }

        System.out.println("잔금은" + a.getBalance() + "원입니다.");
    }
}

class Account {
    private int result;

    public Account() {
        this.result = 0;
    }

    void deposit(int money) {
        this.result += money;
    }

    int getBalance() {
        return result;
    }

    void deposit(int bulk[]) {
        for (int i = 0; i < bulk.length; i++) {
            this.result += bulk[i];
        }
    }

    int withdraw(int money) {
        if (result >= money) {
            result -= money;
            return money;
        } else {
            int temp = result;
            this.result = 0;
            return temp;
        }

    }

}

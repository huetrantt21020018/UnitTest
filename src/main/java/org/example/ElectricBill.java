package org.example;

public class ElectricBill {
    int[] limit = {50, 50, 100, 100, 100, 1000};
    int[] cost = {1800, 1900, 2200, 2700, 3000, 3200};
    public int calcElectricBill(int n) {
        int bill = 0;
        for(int i = 0; i < 6; i++) {
            if(n < limit[i]) {
                bill += n * cost[i];
                return bill;
            }
            n -= limit[i];
            bill += limit[i] * cost[i];
        }

        return bill;
    }

    public static void main(String[] args) {
        System.out.println(new ElectricBill().calcElectricBill(240));
        System.out.println(new ElectricBill().calcElectricBill(360));
        System.out.println(new ElectricBill().calcElectricBill(450));
        System.out.println(new ElectricBill().calcElectricBill(75));
        System.out.println(new ElectricBill().calcElectricBill(499));
        System.out.println(new ElectricBill().calcElectricBill(500));
    }
}

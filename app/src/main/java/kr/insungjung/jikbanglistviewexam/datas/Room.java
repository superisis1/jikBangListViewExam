package kr.insungjung.jikbanglistviewexam.datas;

public class Room {

    int deposit; // 보증금
    int month_pay; // 월세
    String location; // 지역
    int floor; // 층수 (만약 지하라면 음수값으로)
    String description; // 설명

    public Room(int deposit, int month_pay, String location, int floor, String description) {
        this.deposit = deposit;
        this.month_pay = month_pay;
        this.location = location;
        this.floor = floor;
        this.description = description;
    }
}

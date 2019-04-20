package kr.insungjung.jikbanglistviewexam.datas;

public class Room {

    public int deposit; // 보증금
    public int month_pay; // 월세
    public String location; // 지역
    public int floor; // 층수 (만약 지하라면 음수값으로)
    public String description; // 설명

    public Room(int deposit, int month_pay, String location, int floor, String description) {
        this.deposit = deposit;
        this.month_pay = month_pay;
        this.location = location;
        this.floor = floor;
        this.description = description;
    }
}

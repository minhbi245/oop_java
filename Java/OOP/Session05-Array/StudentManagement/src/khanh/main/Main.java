package khanh.main;

import khanh.data.Shelf;

public class Main {
    public static void main(String[] args) {
        /*
            Chơi menu: 1. Add...; 2. Print...; 3. Search...; 4...; 5...; 6.Quit
            Chờ người chơi chọn món 1 2 3 4 5 6 Ahihi - try-catch-do-while MyToys

            if chọn 1 thì tu.add()  2 thì tu.print()    3 thì ...
            Chư xỉn chưa về, chưa muốn dừng cuộc chơi, éo cho thoát -> do/wile
         */



    }

    public static void printMenu() {

    }
    public static void menuCaiTu() {
        Shelf svFPT = new Shelf("RED", "FPT");
        Shelf tuGD = new Shelf("RAINBOW", "GD MAJOR"); // 2 CÁI TỦ ĐỘC LẬP
                                                                    // 2 TỦ 2 GÓC PHÒNG
                                                                    // 2 VÙNG RAM KHÁC NHAU
        svFPT.inputAStudent();
        svFPT.inputAStudent();    // Giả bộ gọi menu add student lần 2
        tuGD.inputAStudent();

        svFPT.printStudentList();   // gọi menu in danh sách đã nhập
        tuGD.printStudentList();

    }
}

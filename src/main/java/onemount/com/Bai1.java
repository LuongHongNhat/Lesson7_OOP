package onemount.com;

import entities.PhanSo;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1
{
    public static void main(String[] args) {
        // PhanSo ps = new PhanSo();
        // ps.init(1, 3);
        // ps.print();
        // PhanSo.testStaticField("1/4");
        //
        // PhanSo ps2 = new PhanSo();
        // ps.init(2, 3);
        // ps.print();
        // PhanSo.testStaticField("1/5");

        Scanner sc = new Scanner(System.in);
        System.out.print("Phân số thứ 1 : ");
        String ps1 = sc.nextLine();

        // PhanSo ps = new PhanSo();
        // ps.fromString(input);
        // ps.print();

        PhanSo ps = PhanSo.fromString(ps1);
        //Bai_1a: Rút gọn phân số
        PhanSo pSo = PhanSo.rutGonPS(ps);
        pSo.print();

        //Bai_1b.1: Tổng 2 phân số
//        System.out.print("Phân số thứ 2 : ");
//        String ps2 = sc.nextLine();
//        ps = PhanSo.tongPhanSo(ps,PhanSo.fromString(ps2));
//        ps.print();

        //Bai_1b.2: Hiệu 2 phân số
//        System.out.print("Phân số thứ 2 : ");
//        String ps2 = sc.nextLine();
//        ps = PhanSo.hieuPhanSo(ps,PhanSo.fromString(ps2));
//        ps.print();

        //Bai_1b.3: Tích 2 phân số
//        System.out.print("Phân số thứ 2 : ");
//        String ps2 = sc.nextLine();
//        ps = PhanSo.tichPhanSo(ps,PhanSo.fromString(ps2));
//        ps.print();

        //Bai_1b.4: Thương 2 phân số
//        System.out.print("Phân số thứ 2 : ");
//        String ps2 = sc.nextLine();
//        ps = PhanSo.thuongPhanSo(ps,PhanSo.fromString(ps2));
//        ps.print();

//        //Bai_1c: Phân số tối giản
//        String result = PhanSo.phanSoToiGian(ps);
//        System.out.println(result);

         //Bai_1d: Quy đồng 2 phân số
//        System.out.print("Phân số thứ 2 : ");
//        String ps2 = sc.nextLine();
//        ArrayList<PhanSo> result = PhanSo.quyDongHaiPhanSo(ps, PhanSo.fromString(ps2));
//        result.get(0).print();
//        result.get(1).print();

        //Bai_1e: Kiểm tra phân số là âm hay dương
//        String rs = PhanSo.kiemTraPhanSo(ps);
//        System.out.println(rs);

        //Bai_1f: So sánh 2 phân số
//        System.out.print("Phân số thứ 2 : ");
//        String ps2 = sc.nextLine();
//        String result = PhanSo.soSanh2PhanSo(ps, PhanSo.fromString(ps2));
//        System.out.println(result);
    }
}

package entities;

import java.util.ArrayList;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    private static int staticField;

    public void init(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        staticField++;
    }
    public void print() {
        System.out.format("%d/%d\n", this.tuSo, this.mauSo);
    }

    public static PhanSo rutGonPS(PhanSo ps) {
        int i = UCLN(ps.tuSo, ps.mauSo);

        ps.tuSo = ps.tuSo/i;
        ps.mauSo = ps.mauSo/i;
        return ps;
    }
    public static PhanSo tongPhanSo(PhanSo ps1, PhanSo ps2) {
        int ts =  ps1.tuSo * ps2.mauSo + ps2.tuSo * ps1.mauSo;
        int ms = ps1.mauSo * ps2.mauSo;
        PhanSo psMoi = fromString(ts + "/" + ms);
        psMoi = rutGonPS(psMoi);
        return psMoi;
    }

    public static PhanSo hieuPhanSo(PhanSo ps1, PhanSo ps2) {
        int ts =  ps1.tuSo * ps2.mauSo - ps2.tuSo * ps1.mauSo;
        int ms = ps1.mauSo * ps2.mauSo;
        PhanSo psMoi = fromString(ts + "/" + ms);
        psMoi = rutGonPS(psMoi);
        return psMoi;
    }


    public static PhanSo tichPhanSo(PhanSo ps1, PhanSo ps2) {
        int ts =  ps1.tuSo * ps2.tuSo;
        int ms =  ps1.mauSo * ps2.mauSo;
        PhanSo psMoi = fromString(ts + "/" + ms);
        psMoi = rutGonPS(psMoi);
        return psMoi;
    }

    public static PhanSo thuongPhanSo(PhanSo ps1, PhanSo ps2) {
        int ts =  ps1.tuSo * ps2.mauSo;
        int ms =  ps1.mauSo * ps2.tuSo;
        PhanSo psMoi = fromString(ts + "/" + ms);
        psMoi = rutGonPS(psMoi);
        return psMoi;
    }
    public static String phanSoToiGian(PhanSo ps) {
        int i = UCLN(ps.tuSo, ps.mauSo);
        if(i == 1){
            return "Là phân số tối giản";
        }
        return "Không phải là phân số tối giản";

    }

    public static ArrayList quyDongHaiPhanSo(PhanSo ps1, PhanSo ps2) {
        ArrayList<PhanSo> result = new ArrayList<>();

        int BSCNN = (ps1.mauSo * ps2.mauSo) / UCLN(ps1.mauSo, ps2.mauSo);
        ps1.tuSo *= BSCNN /ps1.mauSo;
        ps1.mauSo = BSCNN;
        ps2.tuSo *= BSCNN / ps2.mauSo;
        ps2.mauSo = BSCNN;
        result.add(ps1);
        result.add(ps2);
        return result;
    }
    public static String soSanh2PhanSo(PhanSo ps1, PhanSo ps2) {
        ArrayList<PhanSo> result = new ArrayList<>();
        result = PhanSo.quyDongHaiPhanSo(ps1, ps2);
        if(result.get(0).tuSo > result.get(1).tuSo){
            return "Phân số " + ps1.tuSo+"/"+ps1.mauSo + " lớn hơn phân số " + ps2.tuSo+"/"+ps2.mauSo;
        }else if(result.get(0).tuSo < result.get(1).tuSo){
            return  "Phân số " + ps1.tuSo+"/"+ps1.mauSo + " bé hơn phân số " + ps2.tuSo+"/"+ps2.mauSo;
        }else{
            return "Phân số " + ps1.tuSo+"/"+ps1.mauSo + " bằng phân số " + ps2.tuSo+"/"+ps2.mauSo;
        }
    }
    public static String kiemTraPhanSo(PhanSo ps) {
        if(ps.tuSo < 0){
            if(ps.mauSo > 0){
                return "Đây là phân số âm";
            }else{
                return "Đây là phân số dương";
            }
        }else {
            if(ps.mauSo > 0){
                return "Đây là phân số dương";
            }else{
                return "Đây là phân số âm";
            }

        }

    }


    private static int UCLN(int tuSo, int mauSo) {
        while (tuSo != mauSo) {
            if (tuSo > mauSo) {
                tuSo -= mauSo;
            } else {
                mauSo -= tuSo;
            }
        }
        return tuSo;
    }

    public static void testStaticField(String str) {
        // staticField = 100;
        System.out.println(str);
        System.out.println(staticField);
    }

    public static PhanSo fromString(String str) {
        String[] parts = str.split("/");
        PhanSo ps = new PhanSo();
        ps.tuSo = Integer.parseInt(parts[0]);
        ps.mauSo = Integer.parseInt(parts[1]);
        return ps;
    }


    // public PhanSo fromString(String str) {
    //   String[] parts = str.split("/");
    //   this.tuSo = Integer.parseInt(parts[0]);
    //   this.mauSo = Integer.parseInt(parts[1]);
    //   return this;
    // }
}

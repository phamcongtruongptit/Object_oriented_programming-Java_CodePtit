import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import packet1.Danh_Sach_Nhan_Vien;

public class App {
    // public static void main(String[] args) throws Exception {
    //     Danh_Sach_Nhan_Vien t = new Danh_Sach_Nhan_Vien();
    //     t.input();
    //     t.sortBirth();
    //     t.output();
    // }
    public static void main(String[] args) {
        // Date date = new Date();
        String tmp  ; 
        Scanner scanner = new Scanner(System.in);
        tmp = scanner.nextLine();
        Date strDate = new SimpleDateFormat("dd/mm/yyyy").parse(tmp); 
    }
}
/* 
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333612347
22/08/2011
 */
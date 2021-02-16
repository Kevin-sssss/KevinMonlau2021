/*
Objetivo: GitHub
 */
package practicagithub.pzellerm5;

import java.util.Scanner;

/**
 *
 * @author kevinzamjim
 */
public class PracticaGitHubPzellerM5 {

   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int day = 13, month = 9;
        System.out.println("Can you give the year?");
        int year = sc.nextInt();
       year=  bisies( year,  day);
        String stDat = birthday_ZellerMonlau(day, month, year);
        System.out.println("Autor: Kevin Zambrano");
        System.out.println("International programmer's day: " + stDat + " september " +year +"\n");
            //    + day + "/" + month + "/" + year);
    }
private static int bisies(int year, int day){
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            day = 12;
        }else{
        day=13;
    }
    return day;
}
    
    
    
    private static String birthday_ZellerMonlau(int day, int month, int year) {
        String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return ArrayWeek[d];

    }
}

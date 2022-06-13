// To find out how much time will it take if you increase the speed of a video.
package Uploaded;
import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        float sp = sc.nextFloat();
        System.out.println(speed(hour,min,sp));
    }
    public static float speed(int h, int m, float s){
        while(h<12) {
            h = h * 60;
            h = h+ m;
            if(s<=2.0f){
                s = h * s;
                s = s - h;
                return s;
            }
        }
        if(s<=2.0f){
            s = h * s;
            s = s - h;
            return s;
        }
        h = h + m;
        return s;
    }
}

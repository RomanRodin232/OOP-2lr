import java.util.Scanner;
import java.util.regex.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите идентификатор цвета:");
        String color = in.nextLine();
        Pattern p = Pattern.compile("#{1}([a-f[0-9[A-F]]]{6})");
        Matcher M = p.matcher(color);
        boolean b = M.matches();
        if (b == true){
            System.out.printf("%s - идентификатор цвета", color);
        }
        else System.out.printf("%s - не идентификатор цвета", color);
    }
}
package roomNum;

import java.util.Scanner;

/**
 * Created by Volodymyr Dzhuhalyk on 08.07.2017.
 */
public class FloorEntr {
    public static void main(String args[]) {
        double room = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть номер квартири");

        room = in.nextInt();
        in.nextLine();
        if (room > 144) {
            System.out.println("В будинку немає такої квартири");
        } else {
            double ent = Math.ceil(room / 36);
            int entrance = (int) ent;

            int floor = (int) Math.ceil(room / entrance / 4);
            System.out.println(floor + " - поверх");
            System.out.println(entrance + " - підїзд");
        }
    }
}

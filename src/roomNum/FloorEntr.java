package roomNum;

import java.util.Scanner;

/**
 * Created by Volodymyr Dzhuhalyk on 08.07.2017.
 */
public class FloorEntr {
    public static void main(String args[]) {
        double room = 1;
        int q = 36;
        Scanner in = new Scanner(System.in);

        while(true)
        {
            try {
                System.out.println("Введіть номер квартири");;
                room = in.nextInt();
                in.nextLine();
                break;
            } catch (Exception e){
                System.out.println("Введено не номер!");
                in.nextLine();
            }
        }

        if (room > 144 || room <= 0) {
            System.out.println("В будинку немає такої квартири!");
        } else {
            double ent = Math.ceil(room / q);
            int entrance = (int) ent;

            int floor = (int) Math.ceil((room - (q * (entrance - 1))) / 4);
            System.out.println(floor + " - поверх");
            System.out.println(entrance + " - підїзд");
        }
    }
}

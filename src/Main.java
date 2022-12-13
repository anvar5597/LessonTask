import abstraction.task5.Pitcher;
import abstraction.task5.Player;

public class Main {
    public static void main(String[] args) {

        Player player = new Pitcher();
        Player player1 = new Pitcher();
        Player player2 = new Pitcher();
        Player player3 = new Pitcher();
        Player player4 = new Player();
        Player player5 = new Player();

        System.out.println(player.getId());
        System.out.println(player2.getId());
        System.out.println(player4.getId());
        System.out.println(player5.getId());

//        String s = "absd";
//        String ss = s.substring(1);
//        String s1 = "";
//        for (
//                int i = ss.length() - 1;
//                i >= 0; i--) {
//            s1+=(ss.charAt(i));
//        }
//
//        s1 += s;
//        System.out.println(s1);

    }
}
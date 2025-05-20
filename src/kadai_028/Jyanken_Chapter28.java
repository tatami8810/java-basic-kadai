package kadai_028;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    private final HashMap<String, String> handMap;

    public Jyanken_Chapter28() {
        handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
    }

    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String choice = scanner.nextLine().toLowerCase();
        return handMap.containsKey(choice) ? choice : null;
    }

    public String getRandom() {
        String[] choices = {"r", "s", "p"};
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }

    public void playGame() {
        String myChoice = getMyChoice();
        if (myChoice == null) {
            System.out.println("無効な入力です。正しい手を選択してください！");
            return;
        }

        String opponentChoice = getRandom();

        String myHand = handMap.get(myChoice);
        String opponentHand = handMap.get(opponentChoice);

        System.out.println("自分の手は " + myHand + ", 対戦相手の手は " + opponentHand);

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです！");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです！");
        } else {
            System.out.println("自分の負けです！");
        }
    }
}


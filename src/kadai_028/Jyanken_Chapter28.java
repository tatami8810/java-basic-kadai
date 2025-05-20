package kadai_028;

import java.util.HashMap;
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
        String choice;
        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            choice = scanner.nextLine().toLowerCase();
            if (handMap.containsKey(choice)) {
                break; // 有効な入力の場合、ループを抜ける
            } else {
                System.out.println("無効な入力です。もう一度入力してください！");
            }
        }
        return choice;
    }

    public String getRandom() {
        // Math.random()とMath.floor()を活用して乱数を生成
        int randomIndex = (int) Math.floor(Math.random() * 3); // 0から2の整数を生成
        String[] choices = {"r", "s", "p"};
        return choices[randomIndex];
    }

    public void playGame() {
        String myChoice = getMyChoice();
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


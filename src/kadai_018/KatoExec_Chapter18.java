package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        // 加藤太郎の紹介
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        taro.setGivenName();
        taro.execIntroduce();

        // 加藤一郎の紹介
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        ichiro.setGivenName();
        ichiro.execIntroduce();

        // 加藤花子の紹介
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        hanako.setGivenName();
        hanako.execIntroduce();
    }
}
package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
    private HashMap<String, String> dictionary;

    public Dictionary_Chapter21() {
        dictionary = new HashMap<>();
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    public String searchWord(String word) {
        // 正確な意味を取得し、見つからない場合はnullを返す
        return dictionary.get(word);
    }

    public boolean containsWord(String word) {
        // 指定された単語が辞書にあるかどうかをチェック
        return dictionary.containsKey(word);
    }
}

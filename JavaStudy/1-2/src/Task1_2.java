/**
 * Task1-2 : 課題内容
 *
 * 本課題では、配列の使い方を学んでいきましょう。
 * 問①から問⑥まであります。
 * 指定された値と変数名を守って記述してください。
 *
 * 問⑤,⑥については、コメントを入れてください。
 *
 */
public class Task1_2 {

    public static void main(String[] args) {

        // ①「JAPAN」、「AMERICA」、「KOREA」を要素の値（初期値）とする配列 countryを作成しなさい。
    	String[] country = {"JAPAN","AMERICA","KOREA"};
        // ② ①で作成した配列の要素数を出力してください。
    	System.out.println(country.length);
        /* ③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。
         *   1番目（先頭）の要素に 「りんご」 を代入
         *   2番目の要素に 「もも」 を代入
         *   3番目の要素に 「ぶどう」 を代入
         */
    	String[] strArray = {"りんご","もも","ぶどう"};
        // ④ ③で作成した配列の2番目の要素を出力しなさい。
    	System.out.println(strArray[1]);
        /* ⑤下記の処理について、何をしているのかコメントを記入してください。
         *  [int型配列intArrayを宣言し配列の値を代入している]
         */
        int[] intArray = { 10, 20, 30, 40, 50 };

        // ⑥下記の処理について、何をしているのかコメントを記入してください。
        // [配列の変数どうしを添字を指定し足している処理をしている]
        System.out.println(intArray[1] + intArray[4]);

    }
}

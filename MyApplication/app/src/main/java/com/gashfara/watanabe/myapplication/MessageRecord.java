//1つのセルにあるデータを保存するためのデータクラスです。
package com.gashfara.watanabe.myapplication;

public class MessageRecord {
    //保存するデータ全てを変数で定義します。
    private String imageUrl;
    private String comment;

    //データを１つ作成する関数です。項目が増えたら増やしましょう。
    public MessageRecord(String imageUrl, String comment) {
        this.imageUrl = imageUrl;
        this.comment = comment;
    }
    //それぞれの項目を返す関数です。項目が増えたら増やしましょう。
    public String getComment() {
        return comment;
    }
    public String getImageUrl() {
        return imageUrl;
    }
}

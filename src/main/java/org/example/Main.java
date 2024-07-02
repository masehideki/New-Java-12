package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

//    書籍情報をインスタンス化
    Book book1 = new Book("お金の大学", "両学長", 1);
    Book book2 = new Book("達人に学ぶDB設計徹底指南書", "ミック", 2);
    Book book3 = new Book("リーダブルコード", "Dustin Boswell", 3);

//    書籍リストを作成
    List<Book> bookList = new ArrayList<>();
    bookList.add(book1);
    bookList.add(book2);
    bookList.add(book3);

//    書籍ライブラリをインスタンス化
    Library library1 = new Library(bookList);

//    ライブラリへ書籍を追加
    Book book4 = new Book("NARUTO 72巻", "岸本斉史", 4);
    library1.setNewBook(book4);

//    ライブラリ検索機能
    library1.searchTitle("お金");
    library1.searchAuthor("ミック");
    library1.searchNumber(4);
  }
}

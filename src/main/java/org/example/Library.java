package org.example;

import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class Library {

  List<Book> bookList;
  Book newBook;

  public Library(List<Book> bookList) {
    this.bookList = bookList;
  }

//  書籍をタイトル中の文字列で検索する機能
  public void searchTitle(String titleString) {
    String regex = String.format(".*%s.*", Pattern.quote(titleString));
    System.out.println("タイトル検索結果：\n" + bookList.stream()
        .map(Book::getTitle)
        .filter(books -> books.matches(regex))
        .toList());
  }

//  書籍を作者・著者で検索する機能
  public void searchAuthor(String authorString) {
    String regex = String.format(".*%s.*", Pattern.quote(authorString));
    System.out.println("作者・著者検索結果：\n" + bookList.stream()
        .filter(books -> books.getAuthor().matches(regex))
        .map(Book::getTitle)
        .toList());
  }

//  書籍を番号で検索する機能
  public void searchNumber(Integer number) {
    System.out.println("番号検索結果：\n" + bookList.stream()
        .filter(books -> Objects.equals(books.getNumber(), number))
        .map(Book::getTitle)
        .toList());
  }

//  ライブラリに書籍を追加する機能
  public void setNewBook(Book newBook) {
    this.newBook = newBook;
    bookList.add(newBook);
  }
}

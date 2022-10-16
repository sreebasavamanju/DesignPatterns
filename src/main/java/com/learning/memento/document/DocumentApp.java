package com.learning.memento.document;

public class DocumentApp {
  public static void main(String[] args) {
    Document document = new Document();
    DocumentHistory history = new DocumentHistory();
    document.setContent("Hello");
    history.push(document.createState());
    document.setFontName("Font 1");
    history.push(document.createState());
    document.setFontSize(10);
    System.out.println(document);

    document.restore(history.pop());
    System.out.println(document);

    document.restore(history.pop());
    System.out.println(document);
  }
}

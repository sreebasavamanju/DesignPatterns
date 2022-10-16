package com.learning.memento.document;

import java.util.ArrayDeque;
import java.util.Deque;

public class DocumentHistory {
  private Deque<DocumentState> mementos = new ArrayDeque<DocumentState>();

  public void push(DocumentState state) {
    mementos.push(state);
  }

  public DocumentState pop() {
    return mementos.pop();
  }
}

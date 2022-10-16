package com.learning.memento.editor;

import java.util.Stack;

public class History {

  private Stack<EditorState> states = new Stack<EditorState>();

  public void push(EditorState state) {
    states.push(state);
  }

  public EditorState pop() {
    return states.pop();
  }
}

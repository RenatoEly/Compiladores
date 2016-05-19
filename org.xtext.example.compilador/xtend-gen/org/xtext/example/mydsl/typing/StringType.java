package org.xtext.example.mydsl.typing;

import org.xtext.example.mydsl.typing.ExpressionsType;

@SuppressWarnings("all")
public class StringType implements ExpressionsType {
  @Override
  public String toString() {
    return "string";
  }
}

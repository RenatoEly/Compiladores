package org.xtext.example.mydsl.typing;

import org.xtext.example.mydsl.typing.ExpressionsType;

@SuppressWarnings("all")
public class IntType implements ExpressionsType {
  @Override
  public String toString() {
    return "int";
  }
}

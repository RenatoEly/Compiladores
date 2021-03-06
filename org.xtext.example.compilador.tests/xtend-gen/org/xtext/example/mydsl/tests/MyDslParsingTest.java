/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.external_declaration;
import org.xtext.example.mydsl.myDsl.translation_unit;
import org.xtext.example.mydsl.tests.MyDslInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class MyDslParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("int ak[][]");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      EList<translation_unit> _declaracoes = result.getDeclaracoes();
      translation_unit _get = _declaracoes.get(0);
      external_declaration _external_declaration = _get.getExternal_declaration();
      InputOutput.<external_declaration>println(_external_declaration);
      EList<translation_unit> _declaracoes_1 = result.getDeclaracoes();
      translation_unit _get_1 = _declaracoes_1.get(0);
      Assert.assertNotNull(_get_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

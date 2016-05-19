package org.xtext.example.mydsl.typing;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.myDsl.ADD;
import org.xtext.example.mydsl.myDsl.booleanType;
import org.xtext.example.mydsl.myDsl.init_declarator;
import org.xtext.example.mydsl.myDsl.intType;
import org.xtext.example.mydsl.myDsl.simple_expression;
import org.xtext.example.mydsl.myDsl.stringType;
import org.xtext.example.mydsl.typing.BoolType;
import org.xtext.example.mydsl.typing.ExpressionsType;
import org.xtext.example.mydsl.typing.IntType;
import org.xtext.example.mydsl.typing.StringType;

@SuppressWarnings("all")
public class ExpressionsTypeProvider {
  public final static StringType stringType = new StringType();
  
  public final static IntType intType = new IntType();
  
  public final static BoolType boolType = new BoolType();
  
  protected ExpressionsType _typeFor(final simple_expression e) {
    ExpressionsType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof stringType) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.stringType;
      }
    }
    if (!_matched) {
      if (e instanceof intType) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof booleanType) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    return _switchResult;
  }
  
  protected ExpressionsType _typeFor(final ADD e) {
    ExpressionsType _xblockexpression = null;
    {
      simple_expression _left = e.getLeft();
      final ExpressionsType leftType = this.typeFor(_left);
      simple_expression _right = e.getRight();
      ExpressionsType _typeFor = null;
      if (_right!=null) {
        _typeFor=this.typeFor(_right);
      }
      final ExpressionsType rightType = _typeFor;
      ExpressionsType _xifexpression = null;
      boolean _or = false;
      boolean _equals = Objects.equal(leftType, ExpressionsTypeProvider.boolType);
      if (_equals) {
        _or = true;
      } else {
        boolean _equals_1 = Objects.equal(rightType, ExpressionsTypeProvider.boolType);
        _or = _equals_1;
      }
      if (_or) {
        _xifexpression = ExpressionsTypeProvider.boolType;
      } else {
        _xifexpression = ExpressionsTypeProvider.intType;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected ExpressionsType _typeFor(final init_declarator variable) {
    simple_expression _initializer = null;
    if (variable!=null) {
      _initializer=variable.getInitializer();
    }
    ExpressionsType _typeFor = null;
    if (_initializer!=null) {
      _typeFor=this.typeFor(_initializer);
    }
    return _typeFor;
  }
  
  public boolean isInt(final ExpressionsType type) {
    return Objects.equal(type, ExpressionsTypeProvider.intType);
  }
  
  public boolean isString(final ExpressionsType type) {
    return Objects.equal(type, ExpressionsTypeProvider.stringType);
  }
  
  public boolean isBoolean(final ExpressionsType type) {
    return Objects.equal(type, ExpressionsTypeProvider.boolType);
  }
  
  public ExpressionsType typeFor(final EObject e) {
    if (e instanceof ADD) {
      return _typeFor((ADD)e);
    } else if (e instanceof init_declarator) {
      return _typeFor((init_declarator)e);
    } else if (e instanceof simple_expression) {
      return _typeFor((simple_expression)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}

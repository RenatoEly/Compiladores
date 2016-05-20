package org.xtext.example.mydsl.typing;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.myDsl.ADD;
import org.xtext.example.mydsl.myDsl.AND;
import org.xtext.example.mydsl.myDsl.EQL;
import org.xtext.example.mydsl.myDsl.EXC_OR;
import org.xtext.example.mydsl.myDsl.INC_OR;
import org.xtext.example.mydsl.myDsl.LOG_AND;
import org.xtext.example.mydsl.myDsl.LOG_OR;
import org.xtext.example.mydsl.myDsl.MINUS;
import org.xtext.example.mydsl.myDsl.MUL;
import org.xtext.example.mydsl.myDsl.REL;
import org.xtext.example.mydsl.myDsl.booleanType;
import org.xtext.example.mydsl.myDsl.floatType;
import org.xtext.example.mydsl.myDsl.init_declarator;
import org.xtext.example.mydsl.myDsl.intType;
import org.xtext.example.mydsl.myDsl.simple_expression;
import org.xtext.example.mydsl.myDsl.stringType;
import org.xtext.example.mydsl.myDsl.type_specifier;
import org.xtext.example.mydsl.typing.BoolType;
import org.xtext.example.mydsl.typing.ExpressionsType;
import org.xtext.example.mydsl.typing.FloatType;
import org.xtext.example.mydsl.typing.IntType;
import org.xtext.example.mydsl.typing.StringType;

@SuppressWarnings("all")
public class ExpressionsTypeProvider {
  public final static StringType stringType = new StringType();
  
  public final static IntType intType = new IntType();
  
  public final static BoolType boolType = new BoolType();
  
  public final static FloatType floatType = new FloatType();
  
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
    if (!_matched) {
      if (e instanceof floatType) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.floatType;
      }
    }
    if (!_matched) {
      if (e instanceof REL) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof EQL) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof LOG_AND) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof AND) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof EXC_OR) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof INC_OR) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof LOG_OR) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    return _switchResult;
  }
  
  protected ExpressionsType _typeFor(final type_specifier e) {
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
    if (!_matched) {
      if (e instanceof floatType) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.floatType;
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
        ExpressionsType _xifexpression_1 = null;
        boolean _or_1 = false;
        boolean _equals_2 = Objects.equal(leftType, ExpressionsTypeProvider.stringType);
        if (_equals_2) {
          _or_1 = true;
        } else {
          boolean _equals_3 = Objects.equal(rightType, ExpressionsTypeProvider.stringType);
          _or_1 = _equals_3;
        }
        if (_or_1) {
          _xifexpression_1 = ExpressionsTypeProvider.stringType;
        } else {
          ExpressionsType _xifexpression_2 = null;
          boolean _or_2 = false;
          boolean _equals_4 = Objects.equal(leftType, ExpressionsTypeProvider.floatType);
          if (_equals_4) {
            _or_2 = true;
          } else {
            boolean _equals_5 = Objects.equal(rightType, ExpressionsTypeProvider.floatType);
            _or_2 = _equals_5;
          }
          if (_or_2) {
            _xifexpression_2 = ExpressionsTypeProvider.floatType;
          } else {
            _xifexpression_2 = ExpressionsTypeProvider.intType;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected ExpressionsType _typeFor(final MUL e) {
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
        ExpressionsType _xifexpression_1 = null;
        boolean _or_1 = false;
        boolean _equals_2 = Objects.equal(leftType, ExpressionsTypeProvider.stringType);
        if (_equals_2) {
          _or_1 = true;
        } else {
          boolean _equals_3 = Objects.equal(rightType, ExpressionsTypeProvider.stringType);
          _or_1 = _equals_3;
        }
        if (_or_1) {
          _xifexpression_1 = null;
        } else {
          ExpressionsType _xifexpression_2 = null;
          boolean _or_2 = false;
          boolean _equals_4 = Objects.equal(leftType, ExpressionsTypeProvider.floatType);
          if (_equals_4) {
            _or_2 = true;
          } else {
            boolean _equals_5 = Objects.equal(rightType, ExpressionsTypeProvider.floatType);
            _or_2 = _equals_5;
          }
          if (_or_2) {
            _xifexpression_2 = ExpressionsTypeProvider.floatType;
          } else {
            _xifexpression_2 = ExpressionsTypeProvider.intType;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected ExpressionsType _typeFor(final MINUS e) {
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
        ExpressionsType _xifexpression_1 = null;
        boolean _or_1 = false;
        boolean _equals_2 = Objects.equal(leftType, ExpressionsTypeProvider.stringType);
        if (_equals_2) {
          _or_1 = true;
        } else {
          boolean _equals_3 = Objects.equal(rightType, ExpressionsTypeProvider.stringType);
          _or_1 = _equals_3;
        }
        if (_or_1) {
          _xifexpression_1 = null;
        } else {
          ExpressionsType _xifexpression_2 = null;
          boolean _or_2 = false;
          boolean _equals_4 = Objects.equal(leftType, ExpressionsTypeProvider.floatType);
          if (_equals_4) {
            _or_2 = true;
          } else {
            boolean _equals_5 = Objects.equal(rightType, ExpressionsTypeProvider.floatType);
            _or_2 = _equals_5;
          }
          if (_or_2) {
            _xifexpression_2 = ExpressionsTypeProvider.floatType;
          } else {
            _xifexpression_2 = ExpressionsTypeProvider.intType;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
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
    } else if (e instanceof MINUS) {
      return _typeFor((MINUS)e);
    } else if (e instanceof MUL) {
      return _typeFor((MUL)e);
    } else if (e instanceof init_declarator) {
      return _typeFor((init_declarator)e);
    } else if (e instanceof simple_expression) {
      return _typeFor((simple_expression)e);
    } else if (e instanceof type_specifier) {
      return _typeFor((type_specifier)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}

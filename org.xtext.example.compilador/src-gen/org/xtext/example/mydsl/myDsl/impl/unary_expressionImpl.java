/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.cast_expression;
import org.xtext.example.mydsl.myDsl.postfix_expression;
import org.xtext.example.mydsl.myDsl.type_name;
import org.xtext.example.mydsl.myDsl.unary_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unary expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.unary_expressionImpl#getPostfix_expression <em>Postfix expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.unary_expressionImpl#getInc_op <em>Inc op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.unary_expressionImpl#getUnary_expression <em>Unary expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.unary_expressionImpl#getDec_op <em>Dec op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.unary_expressionImpl#getUnary_operator <em>Unary operator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.unary_expressionImpl#getCast_expression <em>Cast expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.unary_expressionImpl#getSizeof <em>Sizeof</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.unary_expressionImpl#getType_name <em>Type name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.unary_expressionImpl#getAlignof <em>Alignof</em>}</li>
 * </ul>
 *
 * @generated
 */
public class unary_expressionImpl extends MinimalEObjectImpl.Container implements unary_expression
{
  /**
   * The cached value of the '{@link #getPostfix_expression() <em>Postfix expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostfix_expression()
   * @generated
   * @ordered
   */
  protected postfix_expression postfix_expression;

  /**
   * The default value of the '{@link #getInc_op() <em>Inc op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInc_op()
   * @generated
   * @ordered
   */
  protected static final String INC_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInc_op() <em>Inc op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInc_op()
   * @generated
   * @ordered
   */
  protected String inc_op = INC_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getUnary_expression() <em>Unary expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary_expression()
   * @generated
   * @ordered
   */
  protected unary_expression unary_expression;

  /**
   * The default value of the '{@link #getDec_op() <em>Dec op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec_op()
   * @generated
   * @ordered
   */
  protected static final String DEC_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDec_op() <em>Dec op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec_op()
   * @generated
   * @ordered
   */
  protected String dec_op = DEC_OP_EDEFAULT;

  /**
   * The default value of the '{@link #getUnary_operator() <em>Unary operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary_operator()
   * @generated
   * @ordered
   */
  protected static final String UNARY_OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnary_operator() <em>Unary operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary_operator()
   * @generated
   * @ordered
   */
  protected String unary_operator = UNARY_OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getCast_expression() <em>Cast expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCast_expression()
   * @generated
   * @ordered
   */
  protected cast_expression cast_expression;

  /**
   * The default value of the '{@link #getSizeof() <em>Sizeof</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizeof()
   * @generated
   * @ordered
   */
  protected static final String SIZEOF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSizeof() <em>Sizeof</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizeof()
   * @generated
   * @ordered
   */
  protected String sizeof = SIZEOF_EDEFAULT;

  /**
   * The cached value of the '{@link #getType_name() <em>Type name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_name()
   * @generated
   * @ordered
   */
  protected type_name type_name;

  /**
   * The default value of the '{@link #getAlignof() <em>Alignof</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignof()
   * @generated
   * @ordered
   */
  protected static final String ALIGNOF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlignof() <em>Alignof</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignof()
   * @generated
   * @ordered
   */
  protected String alignof = ALIGNOF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unary_expressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.UNARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public postfix_expression getPostfix_expression()
  {
    return postfix_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostfix_expression(postfix_expression newPostfix_expression, NotificationChain msgs)
  {
    postfix_expression oldPostfix_expression = postfix_expression;
    postfix_expression = newPostfix_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__POSTFIX_EXPRESSION, oldPostfix_expression, newPostfix_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostfix_expression(postfix_expression newPostfix_expression)
  {
    if (newPostfix_expression != postfix_expression)
    {
      NotificationChain msgs = null;
      if (postfix_expression != null)
        msgs = ((InternalEObject)postfix_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION__POSTFIX_EXPRESSION, null, msgs);
      if (newPostfix_expression != null)
        msgs = ((InternalEObject)newPostfix_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION__POSTFIX_EXPRESSION, null, msgs);
      msgs = basicSetPostfix_expression(newPostfix_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__POSTFIX_EXPRESSION, newPostfix_expression, newPostfix_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInc_op()
  {
    return inc_op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInc_op(String newInc_op)
  {
    String oldInc_op = inc_op;
    inc_op = newInc_op;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__INC_OP, oldInc_op, inc_op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unary_expression getUnary_expression()
  {
    return unary_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnary_expression(unary_expression newUnary_expression, NotificationChain msgs)
  {
    unary_expression oldUnary_expression = unary_expression;
    unary_expression = newUnary_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__UNARY_EXPRESSION, oldUnary_expression, newUnary_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnary_expression(unary_expression newUnary_expression)
  {
    if (newUnary_expression != unary_expression)
    {
      NotificationChain msgs = null;
      if (unary_expression != null)
        msgs = ((InternalEObject)unary_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION__UNARY_EXPRESSION, null, msgs);
      if (newUnary_expression != null)
        msgs = ((InternalEObject)newUnary_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION__UNARY_EXPRESSION, null, msgs);
      msgs = basicSetUnary_expression(newUnary_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__UNARY_EXPRESSION, newUnary_expression, newUnary_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDec_op()
  {
    return dec_op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDec_op(String newDec_op)
  {
    String oldDec_op = dec_op;
    dec_op = newDec_op;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__DEC_OP, oldDec_op, dec_op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnary_operator()
  {
    return unary_operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnary_operator(String newUnary_operator)
  {
    String oldUnary_operator = unary_operator;
    unary_operator = newUnary_operator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__UNARY_OPERATOR, oldUnary_operator, unary_operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public cast_expression getCast_expression()
  {
    return cast_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCast_expression(cast_expression newCast_expression, NotificationChain msgs)
  {
    cast_expression oldCast_expression = cast_expression;
    cast_expression = newCast_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__CAST_EXPRESSION, oldCast_expression, newCast_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCast_expression(cast_expression newCast_expression)
  {
    if (newCast_expression != cast_expression)
    {
      NotificationChain msgs = null;
      if (cast_expression != null)
        msgs = ((InternalEObject)cast_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION__CAST_EXPRESSION, null, msgs);
      if (newCast_expression != null)
        msgs = ((InternalEObject)newCast_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION__CAST_EXPRESSION, null, msgs);
      msgs = basicSetCast_expression(newCast_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__CAST_EXPRESSION, newCast_expression, newCast_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSizeof()
  {
    return sizeof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSizeof(String newSizeof)
  {
    String oldSizeof = sizeof;
    sizeof = newSizeof;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__SIZEOF, oldSizeof, sizeof));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_name getType_name()
  {
    return type_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_name(type_name newType_name, NotificationChain msgs)
  {
    type_name oldType_name = type_name;
    type_name = newType_name;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__TYPE_NAME, oldType_name, newType_name);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_name(type_name newType_name)
  {
    if (newType_name != type_name)
    {
      NotificationChain msgs = null;
      if (type_name != null)
        msgs = ((InternalEObject)type_name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION__TYPE_NAME, null, msgs);
      if (newType_name != null)
        msgs = ((InternalEObject)newType_name).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION__TYPE_NAME, null, msgs);
      msgs = basicSetType_name(newType_name, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__TYPE_NAME, newType_name, newType_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlignof()
  {
    return alignof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignof(String newAlignof)
  {
    String oldAlignof = alignof;
    alignof = newAlignof;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION__ALIGNOF, oldAlignof, alignof));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.UNARY_EXPRESSION__POSTFIX_EXPRESSION:
        return basicSetPostfix_expression(null, msgs);
      case MyDslPackage.UNARY_EXPRESSION__UNARY_EXPRESSION:
        return basicSetUnary_expression(null, msgs);
      case MyDslPackage.UNARY_EXPRESSION__CAST_EXPRESSION:
        return basicSetCast_expression(null, msgs);
      case MyDslPackage.UNARY_EXPRESSION__TYPE_NAME:
        return basicSetType_name(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.UNARY_EXPRESSION__POSTFIX_EXPRESSION:
        return getPostfix_expression();
      case MyDslPackage.UNARY_EXPRESSION__INC_OP:
        return getInc_op();
      case MyDslPackage.UNARY_EXPRESSION__UNARY_EXPRESSION:
        return getUnary_expression();
      case MyDslPackage.UNARY_EXPRESSION__DEC_OP:
        return getDec_op();
      case MyDslPackage.UNARY_EXPRESSION__UNARY_OPERATOR:
        return getUnary_operator();
      case MyDslPackage.UNARY_EXPRESSION__CAST_EXPRESSION:
        return getCast_expression();
      case MyDslPackage.UNARY_EXPRESSION__SIZEOF:
        return getSizeof();
      case MyDslPackage.UNARY_EXPRESSION__TYPE_NAME:
        return getType_name();
      case MyDslPackage.UNARY_EXPRESSION__ALIGNOF:
        return getAlignof();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.UNARY_EXPRESSION__POSTFIX_EXPRESSION:
        setPostfix_expression((postfix_expression)newValue);
        return;
      case MyDslPackage.UNARY_EXPRESSION__INC_OP:
        setInc_op((String)newValue);
        return;
      case MyDslPackage.UNARY_EXPRESSION__UNARY_EXPRESSION:
        setUnary_expression((unary_expression)newValue);
        return;
      case MyDslPackage.UNARY_EXPRESSION__DEC_OP:
        setDec_op((String)newValue);
        return;
      case MyDslPackage.UNARY_EXPRESSION__UNARY_OPERATOR:
        setUnary_operator((String)newValue);
        return;
      case MyDslPackage.UNARY_EXPRESSION__CAST_EXPRESSION:
        setCast_expression((cast_expression)newValue);
        return;
      case MyDslPackage.UNARY_EXPRESSION__SIZEOF:
        setSizeof((String)newValue);
        return;
      case MyDslPackage.UNARY_EXPRESSION__TYPE_NAME:
        setType_name((type_name)newValue);
        return;
      case MyDslPackage.UNARY_EXPRESSION__ALIGNOF:
        setAlignof((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.UNARY_EXPRESSION__POSTFIX_EXPRESSION:
        setPostfix_expression((postfix_expression)null);
        return;
      case MyDslPackage.UNARY_EXPRESSION__INC_OP:
        setInc_op(INC_OP_EDEFAULT);
        return;
      case MyDslPackage.UNARY_EXPRESSION__UNARY_EXPRESSION:
        setUnary_expression((unary_expression)null);
        return;
      case MyDslPackage.UNARY_EXPRESSION__DEC_OP:
        setDec_op(DEC_OP_EDEFAULT);
        return;
      case MyDslPackage.UNARY_EXPRESSION__UNARY_OPERATOR:
        setUnary_operator(UNARY_OPERATOR_EDEFAULT);
        return;
      case MyDslPackage.UNARY_EXPRESSION__CAST_EXPRESSION:
        setCast_expression((cast_expression)null);
        return;
      case MyDslPackage.UNARY_EXPRESSION__SIZEOF:
        setSizeof(SIZEOF_EDEFAULT);
        return;
      case MyDslPackage.UNARY_EXPRESSION__TYPE_NAME:
        setType_name((type_name)null);
        return;
      case MyDslPackage.UNARY_EXPRESSION__ALIGNOF:
        setAlignof(ALIGNOF_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.UNARY_EXPRESSION__POSTFIX_EXPRESSION:
        return postfix_expression != null;
      case MyDslPackage.UNARY_EXPRESSION__INC_OP:
        return INC_OP_EDEFAULT == null ? inc_op != null : !INC_OP_EDEFAULT.equals(inc_op);
      case MyDslPackage.UNARY_EXPRESSION__UNARY_EXPRESSION:
        return unary_expression != null;
      case MyDslPackage.UNARY_EXPRESSION__DEC_OP:
        return DEC_OP_EDEFAULT == null ? dec_op != null : !DEC_OP_EDEFAULT.equals(dec_op);
      case MyDslPackage.UNARY_EXPRESSION__UNARY_OPERATOR:
        return UNARY_OPERATOR_EDEFAULT == null ? unary_operator != null : !UNARY_OPERATOR_EDEFAULT.equals(unary_operator);
      case MyDslPackage.UNARY_EXPRESSION__CAST_EXPRESSION:
        return cast_expression != null;
      case MyDslPackage.UNARY_EXPRESSION__SIZEOF:
        return SIZEOF_EDEFAULT == null ? sizeof != null : !SIZEOF_EDEFAULT.equals(sizeof);
      case MyDslPackage.UNARY_EXPRESSION__TYPE_NAME:
        return type_name != null;
      case MyDslPackage.UNARY_EXPRESSION__ALIGNOF:
        return ALIGNOF_EDEFAULT == null ? alignof != null : !ALIGNOF_EDEFAULT.equals(alignof);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (inc_op: ");
    result.append(inc_op);
    result.append(", dec_op: ");
    result.append(dec_op);
    result.append(", unary_operator: ");
    result.append(unary_operator);
    result.append(", sizeof: ");
    result.append(sizeof);
    result.append(", alignof: ");
    result.append(alignof);
    result.append(')');
    return result.toString();
  }

} //unary_expressionImpl

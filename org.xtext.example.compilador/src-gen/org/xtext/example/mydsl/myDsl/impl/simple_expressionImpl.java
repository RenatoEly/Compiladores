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
import org.xtext.example.mydsl.myDsl.simple_expression;
import org.xtext.example.mydsl.myDsl.type_name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.simple_expressionImpl#getType_name <em>Type name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.simple_expressionImpl#getCast_expression <em>Cast expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class simple_expressionImpl extends MinimalEObjectImpl.Container implements simple_expression
{
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
   * The cached value of the '{@link #getCast_expression() <em>Cast expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCast_expression()
   * @generated
   * @ordered
   */
  protected simple_expression cast_expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_expressionImpl()
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
    return MyDslPackage.Literals.SIMPLE_EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_EXPRESSION__TYPE_NAME, oldType_name, newType_name);
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
        msgs = ((InternalEObject)type_name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_EXPRESSION__TYPE_NAME, null, msgs);
      if (newType_name != null)
        msgs = ((InternalEObject)newType_name).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_EXPRESSION__TYPE_NAME, null, msgs);
      msgs = basicSetType_name(newType_name, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_EXPRESSION__TYPE_NAME, newType_name, newType_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_expression getCast_expression()
  {
    return cast_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCast_expression(simple_expression newCast_expression, NotificationChain msgs)
  {
    simple_expression oldCast_expression = cast_expression;
    cast_expression = newCast_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_EXPRESSION__CAST_EXPRESSION, oldCast_expression, newCast_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCast_expression(simple_expression newCast_expression)
  {
    if (newCast_expression != cast_expression)
    {
      NotificationChain msgs = null;
      if (cast_expression != null)
        msgs = ((InternalEObject)cast_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_EXPRESSION__CAST_EXPRESSION, null, msgs);
      if (newCast_expression != null)
        msgs = ((InternalEObject)newCast_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_EXPRESSION__CAST_EXPRESSION, null, msgs);
      msgs = basicSetCast_expression(newCast_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_EXPRESSION__CAST_EXPRESSION, newCast_expression, newCast_expression));
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
      case MyDslPackage.SIMPLE_EXPRESSION__TYPE_NAME:
        return basicSetType_name(null, msgs);
      case MyDslPackage.SIMPLE_EXPRESSION__CAST_EXPRESSION:
        return basicSetCast_expression(null, msgs);
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
      case MyDslPackage.SIMPLE_EXPRESSION__TYPE_NAME:
        return getType_name();
      case MyDslPackage.SIMPLE_EXPRESSION__CAST_EXPRESSION:
        return getCast_expression();
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
      case MyDslPackage.SIMPLE_EXPRESSION__TYPE_NAME:
        setType_name((type_name)newValue);
        return;
      case MyDslPackage.SIMPLE_EXPRESSION__CAST_EXPRESSION:
        setCast_expression((simple_expression)newValue);
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
      case MyDslPackage.SIMPLE_EXPRESSION__TYPE_NAME:
        setType_name((type_name)null);
        return;
      case MyDslPackage.SIMPLE_EXPRESSION__CAST_EXPRESSION:
        setCast_expression((simple_expression)null);
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
      case MyDslPackage.SIMPLE_EXPRESSION__TYPE_NAME:
        return type_name != null;
      case MyDslPackage.SIMPLE_EXPRESSION__CAST_EXPRESSION:
        return cast_expression != null;
    }
    return super.eIsSet(featureID);
  }

} //simple_expressionImpl
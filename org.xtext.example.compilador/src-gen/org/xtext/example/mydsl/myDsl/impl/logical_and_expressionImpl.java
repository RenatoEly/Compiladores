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
import org.xtext.example.mydsl.myDsl.inclusive_or_expression;
import org.xtext.example.mydsl.myDsl.logical_and_expression;
import org.xtext.example.mydsl.myDsl.logical_and_expression2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>logical and expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.logical_and_expressionImpl#getInclusive_or_expression <em>Inclusive or expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.logical_and_expressionImpl#getLogical_and_expression2 <em>Logical and expression2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class logical_and_expressionImpl extends MinimalEObjectImpl.Container implements logical_and_expression
{
  /**
   * The cached value of the '{@link #getInclusive_or_expression() <em>Inclusive or expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclusive_or_expression()
   * @generated
   * @ordered
   */
  protected inclusive_or_expression inclusive_or_expression;

  /**
   * The cached value of the '{@link #getLogical_and_expression2() <em>Logical and expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogical_and_expression2()
   * @generated
   * @ordered
   */
  protected logical_and_expression2 logical_and_expression2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected logical_and_expressionImpl()
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
    return MyDslPackage.Literals.LOGICAL_AND_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public inclusive_or_expression getInclusive_or_expression()
  {
    return inclusive_or_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInclusive_or_expression(inclusive_or_expression newInclusive_or_expression, NotificationChain msgs)
  {
    inclusive_or_expression oldInclusive_or_expression = inclusive_or_expression;
    inclusive_or_expression = newInclusive_or_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_AND_EXPRESSION__INCLUSIVE_OR_EXPRESSION, oldInclusive_or_expression, newInclusive_or_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInclusive_or_expression(inclusive_or_expression newInclusive_or_expression)
  {
    if (newInclusive_or_expression != inclusive_or_expression)
    {
      NotificationChain msgs = null;
      if (inclusive_or_expression != null)
        msgs = ((InternalEObject)inclusive_or_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGICAL_AND_EXPRESSION__INCLUSIVE_OR_EXPRESSION, null, msgs);
      if (newInclusive_or_expression != null)
        msgs = ((InternalEObject)newInclusive_or_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGICAL_AND_EXPRESSION__INCLUSIVE_OR_EXPRESSION, null, msgs);
      msgs = basicSetInclusive_or_expression(newInclusive_or_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_AND_EXPRESSION__INCLUSIVE_OR_EXPRESSION, newInclusive_or_expression, newInclusive_or_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_and_expression2 getLogical_and_expression2()
  {
    return logical_and_expression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLogical_and_expression2(logical_and_expression2 newLogical_and_expression2, NotificationChain msgs)
  {
    logical_and_expression2 oldLogical_and_expression2 = logical_and_expression2;
    logical_and_expression2 = newLogical_and_expression2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_AND_EXPRESSION__LOGICAL_AND_EXPRESSION2, oldLogical_and_expression2, newLogical_and_expression2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogical_and_expression2(logical_and_expression2 newLogical_and_expression2)
  {
    if (newLogical_and_expression2 != logical_and_expression2)
    {
      NotificationChain msgs = null;
      if (logical_and_expression2 != null)
        msgs = ((InternalEObject)logical_and_expression2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGICAL_AND_EXPRESSION__LOGICAL_AND_EXPRESSION2, null, msgs);
      if (newLogical_and_expression2 != null)
        msgs = ((InternalEObject)newLogical_and_expression2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LOGICAL_AND_EXPRESSION__LOGICAL_AND_EXPRESSION2, null, msgs);
      msgs = basicSetLogical_and_expression2(newLogical_and_expression2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LOGICAL_AND_EXPRESSION__LOGICAL_AND_EXPRESSION2, newLogical_and_expression2, newLogical_and_expression2));
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
      case MyDslPackage.LOGICAL_AND_EXPRESSION__INCLUSIVE_OR_EXPRESSION:
        return basicSetInclusive_or_expression(null, msgs);
      case MyDslPackage.LOGICAL_AND_EXPRESSION__LOGICAL_AND_EXPRESSION2:
        return basicSetLogical_and_expression2(null, msgs);
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
      case MyDslPackage.LOGICAL_AND_EXPRESSION__INCLUSIVE_OR_EXPRESSION:
        return getInclusive_or_expression();
      case MyDslPackage.LOGICAL_AND_EXPRESSION__LOGICAL_AND_EXPRESSION2:
        return getLogical_and_expression2();
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
      case MyDslPackage.LOGICAL_AND_EXPRESSION__INCLUSIVE_OR_EXPRESSION:
        setInclusive_or_expression((inclusive_or_expression)newValue);
        return;
      case MyDslPackage.LOGICAL_AND_EXPRESSION__LOGICAL_AND_EXPRESSION2:
        setLogical_and_expression2((logical_and_expression2)newValue);
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
      case MyDslPackage.LOGICAL_AND_EXPRESSION__INCLUSIVE_OR_EXPRESSION:
        setInclusive_or_expression((inclusive_or_expression)null);
        return;
      case MyDslPackage.LOGICAL_AND_EXPRESSION__LOGICAL_AND_EXPRESSION2:
        setLogical_and_expression2((logical_and_expression2)null);
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
      case MyDslPackage.LOGICAL_AND_EXPRESSION__INCLUSIVE_OR_EXPRESSION:
        return inclusive_or_expression != null;
      case MyDslPackage.LOGICAL_AND_EXPRESSION__LOGICAL_AND_EXPRESSION2:
        return logical_and_expression2 != null;
    }
    return super.eIsSet(featureID);
  }

} //logical_and_expressionImpl
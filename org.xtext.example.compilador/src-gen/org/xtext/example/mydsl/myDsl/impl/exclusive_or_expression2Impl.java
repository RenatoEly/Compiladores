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
import org.xtext.example.mydsl.myDsl.and_expression;
import org.xtext.example.mydsl.myDsl.exclusive_or_expression2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>exclusive or expression2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.exclusive_or_expression2Impl#getAnd_expression <em>And expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.exclusive_or_expression2Impl#getExclusive_or_expression2 <em>Exclusive or expression2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class exclusive_or_expression2Impl extends MinimalEObjectImpl.Container implements exclusive_or_expression2
{
  /**
   * The cached value of the '{@link #getAnd_expression() <em>And expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnd_expression()
   * @generated
   * @ordered
   */
  protected and_expression and_expression;

  /**
   * The cached value of the '{@link #getExclusive_or_expression2() <em>Exclusive or expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusive_or_expression2()
   * @generated
   * @ordered
   */
  protected exclusive_or_expression2 exclusive_or_expression2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected exclusive_or_expression2Impl()
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
    return MyDslPackage.Literals.EXCLUSIVE_OR_EXPRESSION2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public and_expression getAnd_expression()
  {
    return and_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnd_expression(and_expression newAnd_expression, NotificationChain msgs)
  {
    and_expression oldAnd_expression = and_expression;
    and_expression = newAnd_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__AND_EXPRESSION, oldAnd_expression, newAnd_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnd_expression(and_expression newAnd_expression)
  {
    if (newAnd_expression != and_expression)
    {
      NotificationChain msgs = null;
      if (and_expression != null)
        msgs = ((InternalEObject)and_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__AND_EXPRESSION, null, msgs);
      if (newAnd_expression != null)
        msgs = ((InternalEObject)newAnd_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__AND_EXPRESSION, null, msgs);
      msgs = basicSetAnd_expression(newAnd_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__AND_EXPRESSION, newAnd_expression, newAnd_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exclusive_or_expression2 getExclusive_or_expression2()
  {
    return exclusive_or_expression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExclusive_or_expression2(exclusive_or_expression2 newExclusive_or_expression2, NotificationChain msgs)
  {
    exclusive_or_expression2 oldExclusive_or_expression2 = exclusive_or_expression2;
    exclusive_or_expression2 = newExclusive_or_expression2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__EXCLUSIVE_OR_EXPRESSION2, oldExclusive_or_expression2, newExclusive_or_expression2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExclusive_or_expression2(exclusive_or_expression2 newExclusive_or_expression2)
  {
    if (newExclusive_or_expression2 != exclusive_or_expression2)
    {
      NotificationChain msgs = null;
      if (exclusive_or_expression2 != null)
        msgs = ((InternalEObject)exclusive_or_expression2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__EXCLUSIVE_OR_EXPRESSION2, null, msgs);
      if (newExclusive_or_expression2 != null)
        msgs = ((InternalEObject)newExclusive_or_expression2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__EXCLUSIVE_OR_EXPRESSION2, null, msgs);
      msgs = basicSetExclusive_or_expression2(newExclusive_or_expression2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__EXCLUSIVE_OR_EXPRESSION2, newExclusive_or_expression2, newExclusive_or_expression2));
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__AND_EXPRESSION:
        return basicSetAnd_expression(null, msgs);
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__EXCLUSIVE_OR_EXPRESSION2:
        return basicSetExclusive_or_expression2(null, msgs);
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__AND_EXPRESSION:
        return getAnd_expression();
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__EXCLUSIVE_OR_EXPRESSION2:
        return getExclusive_or_expression2();
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__AND_EXPRESSION:
        setAnd_expression((and_expression)newValue);
        return;
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__EXCLUSIVE_OR_EXPRESSION2:
        setExclusive_or_expression2((exclusive_or_expression2)newValue);
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__AND_EXPRESSION:
        setAnd_expression((and_expression)null);
        return;
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__EXCLUSIVE_OR_EXPRESSION2:
        setExclusive_or_expression2((exclusive_or_expression2)null);
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__AND_EXPRESSION:
        return and_expression != null;
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION2__EXCLUSIVE_OR_EXPRESSION2:
        return exclusive_or_expression2 != null;
    }
    return super.eIsSet(featureID);
  }

} //exclusive_or_expression2Impl
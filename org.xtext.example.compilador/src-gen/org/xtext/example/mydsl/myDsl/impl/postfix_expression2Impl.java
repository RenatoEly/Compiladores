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
import org.xtext.example.mydsl.myDsl.assignment_expression;
import org.xtext.example.mydsl.myDsl.postfix_expression2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>postfix expression2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.postfix_expression2Impl#getAssignment_expression <em>Assignment expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class postfix_expression2Impl extends MinimalEObjectImpl.Container implements postfix_expression2
{
  /**
   * The cached value of the '{@link #getAssignment_expression() <em>Assignment expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment_expression()
   * @generated
   * @ordered
   */
  protected assignment_expression assignment_expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected postfix_expression2Impl()
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
    return MyDslPackage.Literals.POSTFIX_EXPRESSION2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment_expression getAssignment_expression()
  {
    return assignment_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignment_expression(assignment_expression newAssignment_expression, NotificationChain msgs)
  {
    assignment_expression oldAssignment_expression = assignment_expression;
    assignment_expression = newAssignment_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.POSTFIX_EXPRESSION2__ASSIGNMENT_EXPRESSION, oldAssignment_expression, newAssignment_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment_expression(assignment_expression newAssignment_expression)
  {
    if (newAssignment_expression != assignment_expression)
    {
      NotificationChain msgs = null;
      if (assignment_expression != null)
        msgs = ((InternalEObject)assignment_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.POSTFIX_EXPRESSION2__ASSIGNMENT_EXPRESSION, null, msgs);
      if (newAssignment_expression != null)
        msgs = ((InternalEObject)newAssignment_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.POSTFIX_EXPRESSION2__ASSIGNMENT_EXPRESSION, null, msgs);
      msgs = basicSetAssignment_expression(newAssignment_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.POSTFIX_EXPRESSION2__ASSIGNMENT_EXPRESSION, newAssignment_expression, newAssignment_expression));
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
      case MyDslPackage.POSTFIX_EXPRESSION2__ASSIGNMENT_EXPRESSION:
        return basicSetAssignment_expression(null, msgs);
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
      case MyDslPackage.POSTFIX_EXPRESSION2__ASSIGNMENT_EXPRESSION:
        return getAssignment_expression();
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
      case MyDslPackage.POSTFIX_EXPRESSION2__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)newValue);
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
      case MyDslPackage.POSTFIX_EXPRESSION2__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)null);
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
      case MyDslPackage.POSTFIX_EXPRESSION2__ASSIGNMENT_EXPRESSION:
        return assignment_expression != null;
    }
    return super.eIsSet(featureID);
  }

} //postfix_expression2Impl

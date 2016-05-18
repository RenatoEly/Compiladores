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
import org.xtext.example.mydsl.myDsl.constant_expression;
import org.xtext.example.mydsl.myDsl.declarator;
import org.xtext.example.mydsl.myDsl.struct_declarator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>struct declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.struct_declaratorImpl#getConstant_expression <em>Constant expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.struct_declaratorImpl#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class struct_declaratorImpl extends MinimalEObjectImpl.Container implements struct_declarator
{
  /**
   * The cached value of the '{@link #getConstant_expression() <em>Constant expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant_expression()
   * @generated
   * @ordered
   */
  protected constant_expression constant_expression;

  /**
   * The cached value of the '{@link #getDeclarator() <em>Declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarator()
   * @generated
   * @ordered
   */
  protected declarator declarator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected struct_declaratorImpl()
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
    return MyDslPackage.Literals.STRUCT_DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_expression getConstant_expression()
  {
    return constant_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant_expression(constant_expression newConstant_expression, NotificationChain msgs)
  {
    constant_expression oldConstant_expression = constant_expression;
    constant_expression = newConstant_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION, oldConstant_expression, newConstant_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant_expression(constant_expression newConstant_expression)
  {
    if (newConstant_expression != constant_expression)
    {
      NotificationChain msgs = null;
      if (constant_expression != null)
        msgs = ((InternalEObject)constant_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION, null, msgs);
      if (newConstant_expression != null)
        msgs = ((InternalEObject)newConstant_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION, null, msgs);
      msgs = basicSetConstant_expression(newConstant_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION, newConstant_expression, newConstant_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declarator getDeclarator()
  {
    return declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclarator(declarator newDeclarator, NotificationChain msgs)
  {
    declarator oldDeclarator = declarator;
    declarator = newDeclarator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STRUCT_DECLARATOR__DECLARATOR, oldDeclarator, newDeclarator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclarator(declarator newDeclarator)
  {
    if (newDeclarator != declarator)
    {
      NotificationChain msgs = null;
      if (declarator != null)
        msgs = ((InternalEObject)declarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STRUCT_DECLARATOR__DECLARATOR, null, msgs);
      if (newDeclarator != null)
        msgs = ((InternalEObject)newDeclarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STRUCT_DECLARATOR__DECLARATOR, null, msgs);
      msgs = basicSetDeclarator(newDeclarator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STRUCT_DECLARATOR__DECLARATOR, newDeclarator, newDeclarator));
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
      case MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION:
        return basicSetConstant_expression(null, msgs);
      case MyDslPackage.STRUCT_DECLARATOR__DECLARATOR:
        return basicSetDeclarator(null, msgs);
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
      case MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION:
        return getConstant_expression();
      case MyDslPackage.STRUCT_DECLARATOR__DECLARATOR:
        return getDeclarator();
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
      case MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION:
        setConstant_expression((constant_expression)newValue);
        return;
      case MyDslPackage.STRUCT_DECLARATOR__DECLARATOR:
        setDeclarator((declarator)newValue);
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
      case MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION:
        setConstant_expression((constant_expression)null);
        return;
      case MyDslPackage.STRUCT_DECLARATOR__DECLARATOR:
        setDeclarator((declarator)null);
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
      case MyDslPackage.STRUCT_DECLARATOR__CONSTANT_EXPRESSION:
        return constant_expression != null;
      case MyDslPackage.STRUCT_DECLARATOR__DECLARATOR:
        return declarator != null;
    }
    return super.eIsSet(featureID);
  }

} //struct_declaratorImpl

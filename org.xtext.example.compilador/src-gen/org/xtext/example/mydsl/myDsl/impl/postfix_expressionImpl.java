/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.initializer_list;
import org.xtext.example.mydsl.myDsl.postfix_expression;
import org.xtext.example.mydsl.myDsl.postfix_expression2;
import org.xtext.example.mydsl.myDsl.simple_expression;
import org.xtext.example.mydsl.myDsl.type_name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>postfix expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.postfix_expressionImpl#getPrimary_expression <em>Primary expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.postfix_expressionImpl#getPostifx_expres <em>Postifx expres</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.postfix_expressionImpl#getType_name <em>Type name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.postfix_expressionImpl#getInitializer_list <em>Initializer list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class postfix_expressionImpl extends MinimalEObjectImpl.Container implements postfix_expression
{
  /**
   * The cached value of the '{@link #getPrimary_expression() <em>Primary expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimary_expression()
   * @generated
   * @ordered
   */
  protected simple_expression primary_expression;

  /**
   * The cached value of the '{@link #getPostifx_expres() <em>Postifx expres</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostifx_expres()
   * @generated
   * @ordered
   */
  protected EList<postfix_expression2> postifx_expres;

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
   * The cached value of the '{@link #getInitializer_list() <em>Initializer list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitializer_list()
   * @generated
   * @ordered
   */
  protected initializer_list initializer_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected postfix_expressionImpl()
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
    return MyDslPackage.Literals.POSTFIX_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_expression getPrimary_expression()
  {
    return primary_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimary_expression(simple_expression newPrimary_expression, NotificationChain msgs)
  {
    simple_expression oldPrimary_expression = primary_expression;
    primary_expression = newPrimary_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION, oldPrimary_expression, newPrimary_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimary_expression(simple_expression newPrimary_expression)
  {
    if (newPrimary_expression != primary_expression)
    {
      NotificationChain msgs = null;
      if (primary_expression != null)
        msgs = ((InternalEObject)primary_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION, null, msgs);
      if (newPrimary_expression != null)
        msgs = ((InternalEObject)newPrimary_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION, null, msgs);
      msgs = basicSetPrimary_expression(newPrimary_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION, newPrimary_expression, newPrimary_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<postfix_expression2> getPostifx_expres()
  {
    if (postifx_expres == null)
    {
      postifx_expres = new EObjectContainmentEList<postfix_expression2>(postfix_expression2.class, this, MyDslPackage.POSTFIX_EXPRESSION__POSTIFX_EXPRES);
    }
    return postifx_expres;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.POSTFIX_EXPRESSION__TYPE_NAME, oldType_name, newType_name);
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
        msgs = ((InternalEObject)type_name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.POSTFIX_EXPRESSION__TYPE_NAME, null, msgs);
      if (newType_name != null)
        msgs = ((InternalEObject)newType_name).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.POSTFIX_EXPRESSION__TYPE_NAME, null, msgs);
      msgs = basicSetType_name(newType_name, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.POSTFIX_EXPRESSION__TYPE_NAME, newType_name, newType_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public initializer_list getInitializer_list()
  {
    return initializer_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitializer_list(initializer_list newInitializer_list, NotificationChain msgs)
  {
    initializer_list oldInitializer_list = initializer_list;
    initializer_list = newInitializer_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.POSTFIX_EXPRESSION__INITIALIZER_LIST, oldInitializer_list, newInitializer_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitializer_list(initializer_list newInitializer_list)
  {
    if (newInitializer_list != initializer_list)
    {
      NotificationChain msgs = null;
      if (initializer_list != null)
        msgs = ((InternalEObject)initializer_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.POSTFIX_EXPRESSION__INITIALIZER_LIST, null, msgs);
      if (newInitializer_list != null)
        msgs = ((InternalEObject)newInitializer_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.POSTFIX_EXPRESSION__INITIALIZER_LIST, null, msgs);
      msgs = basicSetInitializer_list(newInitializer_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.POSTFIX_EXPRESSION__INITIALIZER_LIST, newInitializer_list, newInitializer_list));
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
      case MyDslPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION:
        return basicSetPrimary_expression(null, msgs);
      case MyDslPackage.POSTFIX_EXPRESSION__POSTIFX_EXPRES:
        return ((InternalEList<?>)getPostifx_expres()).basicRemove(otherEnd, msgs);
      case MyDslPackage.POSTFIX_EXPRESSION__TYPE_NAME:
        return basicSetType_name(null, msgs);
      case MyDslPackage.POSTFIX_EXPRESSION__INITIALIZER_LIST:
        return basicSetInitializer_list(null, msgs);
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
      case MyDslPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION:
        return getPrimary_expression();
      case MyDslPackage.POSTFIX_EXPRESSION__POSTIFX_EXPRES:
        return getPostifx_expres();
      case MyDslPackage.POSTFIX_EXPRESSION__TYPE_NAME:
        return getType_name();
      case MyDslPackage.POSTFIX_EXPRESSION__INITIALIZER_LIST:
        return getInitializer_list();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION:
        setPrimary_expression((simple_expression)newValue);
        return;
      case MyDslPackage.POSTFIX_EXPRESSION__POSTIFX_EXPRES:
        getPostifx_expres().clear();
        getPostifx_expres().addAll((Collection<? extends postfix_expression2>)newValue);
        return;
      case MyDslPackage.POSTFIX_EXPRESSION__TYPE_NAME:
        setType_name((type_name)newValue);
        return;
      case MyDslPackage.POSTFIX_EXPRESSION__INITIALIZER_LIST:
        setInitializer_list((initializer_list)newValue);
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
      case MyDslPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION:
        setPrimary_expression((simple_expression)null);
        return;
      case MyDslPackage.POSTFIX_EXPRESSION__POSTIFX_EXPRES:
        getPostifx_expres().clear();
        return;
      case MyDslPackage.POSTFIX_EXPRESSION__TYPE_NAME:
        setType_name((type_name)null);
        return;
      case MyDslPackage.POSTFIX_EXPRESSION__INITIALIZER_LIST:
        setInitializer_list((initializer_list)null);
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
      case MyDslPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION:
        return primary_expression != null;
      case MyDslPackage.POSTFIX_EXPRESSION__POSTIFX_EXPRES:
        return postifx_expres != null && !postifx_expres.isEmpty();
      case MyDslPackage.POSTFIX_EXPRESSION__TYPE_NAME:
        return type_name != null;
      case MyDslPackage.POSTFIX_EXPRESSION__INITIALIZER_LIST:
        return initializer_list != null;
    }
    return super.eIsSet(featureID);
  }

} //postfix_expressionImpl

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
import org.xtext.example.mydsl.myDsl.direct_abstract_declarator2;
import org.xtext.example.mydsl.myDsl.parameter_type_list;
import org.xtext.example.mydsl.myDsl.type_qualifier_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>direct abstract declarator2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.direct_abstract_declarator2Impl#getDirect_abstract_declarator2 <em>Direct abstract declarator2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.direct_abstract_declarator2Impl#getStatic <em>Static</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.direct_abstract_declarator2Impl#getType_qualifier_list <em>Type qualifier list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.direct_abstract_declarator2Impl#getAssignment_expression <em>Assignment expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.direct_abstract_declarator2Impl#getParameter_type_list <em>Parameter type list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class direct_abstract_declarator2Impl extends MinimalEObjectImpl.Container implements direct_abstract_declarator2
{
  /**
   * The cached value of the '{@link #getDirect_abstract_declarator2() <em>Direct abstract declarator2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirect_abstract_declarator2()
   * @generated
   * @ordered
   */
  protected direct_abstract_declarator2 direct_abstract_declarator2;

  /**
   * The default value of the '{@link #getStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatic()
   * @generated
   * @ordered
   */
  protected static final String STATIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatic()
   * @generated
   * @ordered
   */
  protected String static_ = STATIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getType_qualifier_list() <em>Type qualifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_qualifier_list()
   * @generated
   * @ordered
   */
  protected type_qualifier_list type_qualifier_list;

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
   * The cached value of the '{@link #getParameter_type_list() <em>Parameter type list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter_type_list()
   * @generated
   * @ordered
   */
  protected parameter_type_list parameter_type_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected direct_abstract_declarator2Impl()
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
    return MyDslPackage.Literals.DIRECT_ABSTRACT_DECLARATOR2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public direct_abstract_declarator2 getDirect_abstract_declarator2()
  {
    return direct_abstract_declarator2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirect_abstract_declarator2(direct_abstract_declarator2 newDirect_abstract_declarator2, NotificationChain msgs)
  {
    direct_abstract_declarator2 oldDirect_abstract_declarator2 = direct_abstract_declarator2;
    direct_abstract_declarator2 = newDirect_abstract_declarator2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__DIRECT_ABSTRACT_DECLARATOR2, oldDirect_abstract_declarator2, newDirect_abstract_declarator2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirect_abstract_declarator2(direct_abstract_declarator2 newDirect_abstract_declarator2)
  {
    if (newDirect_abstract_declarator2 != direct_abstract_declarator2)
    {
      NotificationChain msgs = null;
      if (direct_abstract_declarator2 != null)
        msgs = ((InternalEObject)direct_abstract_declarator2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__DIRECT_ABSTRACT_DECLARATOR2, null, msgs);
      if (newDirect_abstract_declarator2 != null)
        msgs = ((InternalEObject)newDirect_abstract_declarator2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__DIRECT_ABSTRACT_DECLARATOR2, null, msgs);
      msgs = basicSetDirect_abstract_declarator2(newDirect_abstract_declarator2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__DIRECT_ABSTRACT_DECLARATOR2, newDirect_abstract_declarator2, newDirect_abstract_declarator2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStatic()
  {
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatic(String newStatic)
  {
    String oldStatic = static_;
    static_ = newStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__STATIC, oldStatic, static_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_qualifier_list getType_qualifier_list()
  {
    return type_qualifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_qualifier_list(type_qualifier_list newType_qualifier_list, NotificationChain msgs)
  {
    type_qualifier_list oldType_qualifier_list = type_qualifier_list;
    type_qualifier_list = newType_qualifier_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__TYPE_QUALIFIER_LIST, oldType_qualifier_list, newType_qualifier_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_qualifier_list(type_qualifier_list newType_qualifier_list)
  {
    if (newType_qualifier_list != type_qualifier_list)
    {
      NotificationChain msgs = null;
      if (type_qualifier_list != null)
        msgs = ((InternalEObject)type_qualifier_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__TYPE_QUALIFIER_LIST, null, msgs);
      if (newType_qualifier_list != null)
        msgs = ((InternalEObject)newType_qualifier_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__TYPE_QUALIFIER_LIST, null, msgs);
      msgs = basicSetType_qualifier_list(newType_qualifier_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__TYPE_QUALIFIER_LIST, newType_qualifier_list, newType_qualifier_list));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__ASSIGNMENT_EXPRESSION, oldAssignment_expression, newAssignment_expression);
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
        msgs = ((InternalEObject)assignment_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__ASSIGNMENT_EXPRESSION, null, msgs);
      if (newAssignment_expression != null)
        msgs = ((InternalEObject)newAssignment_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__ASSIGNMENT_EXPRESSION, null, msgs);
      msgs = basicSetAssignment_expression(newAssignment_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__ASSIGNMENT_EXPRESSION, newAssignment_expression, newAssignment_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_type_list getParameter_type_list()
  {
    return parameter_type_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter_type_list(parameter_type_list newParameter_type_list, NotificationChain msgs)
  {
    parameter_type_list oldParameter_type_list = parameter_type_list;
    parameter_type_list = newParameter_type_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__PARAMETER_TYPE_LIST, oldParameter_type_list, newParameter_type_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter_type_list(parameter_type_list newParameter_type_list)
  {
    if (newParameter_type_list != parameter_type_list)
    {
      NotificationChain msgs = null;
      if (parameter_type_list != null)
        msgs = ((InternalEObject)parameter_type_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__PARAMETER_TYPE_LIST, null, msgs);
      if (newParameter_type_list != null)
        msgs = ((InternalEObject)newParameter_type_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__PARAMETER_TYPE_LIST, null, msgs);
      msgs = basicSetParameter_type_list(newParameter_type_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__PARAMETER_TYPE_LIST, newParameter_type_list, newParameter_type_list));
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
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__DIRECT_ABSTRACT_DECLARATOR2:
        return basicSetDirect_abstract_declarator2(null, msgs);
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__TYPE_QUALIFIER_LIST:
        return basicSetType_qualifier_list(null, msgs);
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__ASSIGNMENT_EXPRESSION:
        return basicSetAssignment_expression(null, msgs);
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__PARAMETER_TYPE_LIST:
        return basicSetParameter_type_list(null, msgs);
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
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__DIRECT_ABSTRACT_DECLARATOR2:
        return getDirect_abstract_declarator2();
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__STATIC:
        return getStatic();
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__TYPE_QUALIFIER_LIST:
        return getType_qualifier_list();
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__ASSIGNMENT_EXPRESSION:
        return getAssignment_expression();
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__PARAMETER_TYPE_LIST:
        return getParameter_type_list();
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
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__DIRECT_ABSTRACT_DECLARATOR2:
        setDirect_abstract_declarator2((direct_abstract_declarator2)newValue);
        return;
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__STATIC:
        setStatic((String)newValue);
        return;
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__TYPE_QUALIFIER_LIST:
        setType_qualifier_list((type_qualifier_list)newValue);
        return;
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)newValue);
        return;
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__PARAMETER_TYPE_LIST:
        setParameter_type_list((parameter_type_list)newValue);
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
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__DIRECT_ABSTRACT_DECLARATOR2:
        setDirect_abstract_declarator2((direct_abstract_declarator2)null);
        return;
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__STATIC:
        setStatic(STATIC_EDEFAULT);
        return;
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__TYPE_QUALIFIER_LIST:
        setType_qualifier_list((type_qualifier_list)null);
        return;
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)null);
        return;
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__PARAMETER_TYPE_LIST:
        setParameter_type_list((parameter_type_list)null);
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
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__DIRECT_ABSTRACT_DECLARATOR2:
        return direct_abstract_declarator2 != null;
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__STATIC:
        return STATIC_EDEFAULT == null ? static_ != null : !STATIC_EDEFAULT.equals(static_);
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__TYPE_QUALIFIER_LIST:
        return type_qualifier_list != null;
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__ASSIGNMENT_EXPRESSION:
        return assignment_expression != null;
      case MyDslPackage.DIRECT_ABSTRACT_DECLARATOR2__PARAMETER_TYPE_LIST:
        return parameter_type_list != null;
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
    result.append(" (static: ");
    result.append(static_);
    result.append(')');
    return result.toString();
  }

} //direct_abstract_declarator2Impl

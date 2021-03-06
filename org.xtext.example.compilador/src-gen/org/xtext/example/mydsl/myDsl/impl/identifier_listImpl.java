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
import org.xtext.example.mydsl.myDsl.identifier_list;
import org.xtext.example.mydsl.myDsl.identifier_list2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>identifier list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.identifier_listImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.identifier_listImpl#getIdentifier_list2 <em>Identifier list2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class identifier_listImpl extends MinimalEObjectImpl.Container implements identifier_list
{
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getIdentifier_list2() <em>Identifier list2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier_list2()
   * @generated
   * @ordered
   */
  protected identifier_list2 identifier_list2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected identifier_listImpl()
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
    return MyDslPackage.Literals.IDENTIFIER_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IDENTIFIER_LIST__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier_list2 getIdentifier_list2()
  {
    return identifier_list2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier_list2(identifier_list2 newIdentifier_list2, NotificationChain msgs)
  {
    identifier_list2 oldIdentifier_list2 = identifier_list2;
    identifier_list2 = newIdentifier_list2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IDENTIFIER_LIST__IDENTIFIER_LIST2, oldIdentifier_list2, newIdentifier_list2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier_list2(identifier_list2 newIdentifier_list2)
  {
    if (newIdentifier_list2 != identifier_list2)
    {
      NotificationChain msgs = null;
      if (identifier_list2 != null)
        msgs = ((InternalEObject)identifier_list2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IDENTIFIER_LIST__IDENTIFIER_LIST2, null, msgs);
      if (newIdentifier_list2 != null)
        msgs = ((InternalEObject)newIdentifier_list2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IDENTIFIER_LIST__IDENTIFIER_LIST2, null, msgs);
      msgs = basicSetIdentifier_list2(newIdentifier_list2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IDENTIFIER_LIST__IDENTIFIER_LIST2, newIdentifier_list2, newIdentifier_list2));
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
      case MyDslPackage.IDENTIFIER_LIST__IDENTIFIER_LIST2:
        return basicSetIdentifier_list2(null, msgs);
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
      case MyDslPackage.IDENTIFIER_LIST__IDENTIFIER:
        return getIdentifier();
      case MyDslPackage.IDENTIFIER_LIST__IDENTIFIER_LIST2:
        return getIdentifier_list2();
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
      case MyDslPackage.IDENTIFIER_LIST__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case MyDslPackage.IDENTIFIER_LIST__IDENTIFIER_LIST2:
        setIdentifier_list2((identifier_list2)newValue);
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
      case MyDslPackage.IDENTIFIER_LIST__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case MyDslPackage.IDENTIFIER_LIST__IDENTIFIER_LIST2:
        setIdentifier_list2((identifier_list2)null);
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
      case MyDslPackage.IDENTIFIER_LIST__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case MyDslPackage.IDENTIFIER_LIST__IDENTIFIER_LIST2:
        return identifier_list2 != null;
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //identifier_listImpl

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
import org.xtext.example.mydsl.myDsl.abstract_declarator;
import org.xtext.example.mydsl.myDsl.direct_abstract_declarator;
import org.xtext.example.mydsl.myDsl.pointer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>abstract declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.abstract_declaratorImpl#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.abstract_declaratorImpl#getDirect_abstract_declarator <em>Direct abstract declarator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class abstract_declaratorImpl extends MinimalEObjectImpl.Container implements abstract_declarator
{
  /**
   * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointer()
   * @generated
   * @ordered
   */
  protected pointer pointer;

  /**
   * The cached value of the '{@link #getDirect_abstract_declarator() <em>Direct abstract declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirect_abstract_declarator()
   * @generated
   * @ordered
   */
  protected direct_abstract_declarator direct_abstract_declarator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected abstract_declaratorImpl()
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
    return MyDslPackage.Literals.ABSTRACT_DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pointer getPointer()
  {
    return pointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointer(pointer newPointer, NotificationChain msgs)
  {
    pointer oldPointer = pointer;
    pointer = newPointer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ABSTRACT_DECLARATOR__POINTER, oldPointer, newPointer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointer(pointer newPointer)
  {
    if (newPointer != pointer)
    {
      NotificationChain msgs = null;
      if (pointer != null)
        msgs = ((InternalEObject)pointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ABSTRACT_DECLARATOR__POINTER, null, msgs);
      if (newPointer != null)
        msgs = ((InternalEObject)newPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ABSTRACT_DECLARATOR__POINTER, null, msgs);
      msgs = basicSetPointer(newPointer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ABSTRACT_DECLARATOR__POINTER, newPointer, newPointer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public direct_abstract_declarator getDirect_abstract_declarator()
  {
    return direct_abstract_declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirect_abstract_declarator(direct_abstract_declarator newDirect_abstract_declarator, NotificationChain msgs)
  {
    direct_abstract_declarator oldDirect_abstract_declarator = direct_abstract_declarator;
    direct_abstract_declarator = newDirect_abstract_declarator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ABSTRACT_DECLARATOR__DIRECT_ABSTRACT_DECLARATOR, oldDirect_abstract_declarator, newDirect_abstract_declarator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirect_abstract_declarator(direct_abstract_declarator newDirect_abstract_declarator)
  {
    if (newDirect_abstract_declarator != direct_abstract_declarator)
    {
      NotificationChain msgs = null;
      if (direct_abstract_declarator != null)
        msgs = ((InternalEObject)direct_abstract_declarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ABSTRACT_DECLARATOR__DIRECT_ABSTRACT_DECLARATOR, null, msgs);
      if (newDirect_abstract_declarator != null)
        msgs = ((InternalEObject)newDirect_abstract_declarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ABSTRACT_DECLARATOR__DIRECT_ABSTRACT_DECLARATOR, null, msgs);
      msgs = basicSetDirect_abstract_declarator(newDirect_abstract_declarator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ABSTRACT_DECLARATOR__DIRECT_ABSTRACT_DECLARATOR, newDirect_abstract_declarator, newDirect_abstract_declarator));
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
      case MyDslPackage.ABSTRACT_DECLARATOR__POINTER:
        return basicSetPointer(null, msgs);
      case MyDslPackage.ABSTRACT_DECLARATOR__DIRECT_ABSTRACT_DECLARATOR:
        return basicSetDirect_abstract_declarator(null, msgs);
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
      case MyDslPackage.ABSTRACT_DECLARATOR__POINTER:
        return getPointer();
      case MyDslPackage.ABSTRACT_DECLARATOR__DIRECT_ABSTRACT_DECLARATOR:
        return getDirect_abstract_declarator();
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
      case MyDslPackage.ABSTRACT_DECLARATOR__POINTER:
        setPointer((pointer)newValue);
        return;
      case MyDslPackage.ABSTRACT_DECLARATOR__DIRECT_ABSTRACT_DECLARATOR:
        setDirect_abstract_declarator((direct_abstract_declarator)newValue);
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
      case MyDslPackage.ABSTRACT_DECLARATOR__POINTER:
        setPointer((pointer)null);
        return;
      case MyDslPackage.ABSTRACT_DECLARATOR__DIRECT_ABSTRACT_DECLARATOR:
        setDirect_abstract_declarator((direct_abstract_declarator)null);
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
      case MyDslPackage.ABSTRACT_DECLARATOR__POINTER:
        return pointer != null;
      case MyDslPackage.ABSTRACT_DECLARATOR__DIRECT_ABSTRACT_DECLARATOR:
        return direct_abstract_declarator != null;
    }
    return super.eIsSet(featureID);
  }

} //abstract_declaratorImpl

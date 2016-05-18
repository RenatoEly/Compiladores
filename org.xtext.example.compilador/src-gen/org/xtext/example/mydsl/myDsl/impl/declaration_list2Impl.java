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
import org.xtext.example.mydsl.myDsl.declaration;
import org.xtext.example.mydsl.myDsl.declaration_list2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>declaration list2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaration_list2Impl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaration_list2Impl#getDeclaration_list2 <em>Declaration list2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class declaration_list2Impl extends MinimalEObjectImpl.Container implements declaration_list2
{
  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected declaration declaration;

  /**
   * The cached value of the '{@link #getDeclaration_list2() <em>Declaration list2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration_list2()
   * @generated
   * @ordered
   */
  protected declaration_list2 declaration_list2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected declaration_list2Impl()
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
    return MyDslPackage.Literals.DECLARATION_LIST2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration getDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration(declaration newDeclaration, NotificationChain msgs)
  {
    declaration oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_LIST2__DECLARATION, oldDeclaration, newDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(declaration newDeclaration)
  {
    if (newDeclaration != declaration)
    {
      NotificationChain msgs = null;
      if (declaration != null)
        msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_LIST2__DECLARATION, null, msgs);
      if (newDeclaration != null)
        msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_LIST2__DECLARATION, null, msgs);
      msgs = basicSetDeclaration(newDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_LIST2__DECLARATION, newDeclaration, newDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_list2 getDeclaration_list2()
  {
    return declaration_list2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration_list2(declaration_list2 newDeclaration_list2, NotificationChain msgs)
  {
    declaration_list2 oldDeclaration_list2 = declaration_list2;
    declaration_list2 = newDeclaration_list2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_LIST2__DECLARATION_LIST2, oldDeclaration_list2, newDeclaration_list2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration_list2(declaration_list2 newDeclaration_list2)
  {
    if (newDeclaration_list2 != declaration_list2)
    {
      NotificationChain msgs = null;
      if (declaration_list2 != null)
        msgs = ((InternalEObject)declaration_list2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_LIST2__DECLARATION_LIST2, null, msgs);
      if (newDeclaration_list2 != null)
        msgs = ((InternalEObject)newDeclaration_list2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_LIST2__DECLARATION_LIST2, null, msgs);
      msgs = basicSetDeclaration_list2(newDeclaration_list2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_LIST2__DECLARATION_LIST2, newDeclaration_list2, newDeclaration_list2));
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
      case MyDslPackage.DECLARATION_LIST2__DECLARATION:
        return basicSetDeclaration(null, msgs);
      case MyDslPackage.DECLARATION_LIST2__DECLARATION_LIST2:
        return basicSetDeclaration_list2(null, msgs);
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
      case MyDslPackage.DECLARATION_LIST2__DECLARATION:
        return getDeclaration();
      case MyDslPackage.DECLARATION_LIST2__DECLARATION_LIST2:
        return getDeclaration_list2();
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
      case MyDslPackage.DECLARATION_LIST2__DECLARATION:
        setDeclaration((declaration)newValue);
        return;
      case MyDslPackage.DECLARATION_LIST2__DECLARATION_LIST2:
        setDeclaration_list2((declaration_list2)newValue);
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
      case MyDslPackage.DECLARATION_LIST2__DECLARATION:
        setDeclaration((declaration)null);
        return;
      case MyDslPackage.DECLARATION_LIST2__DECLARATION_LIST2:
        setDeclaration_list2((declaration_list2)null);
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
      case MyDslPackage.DECLARATION_LIST2__DECLARATION:
        return declaration != null;
      case MyDslPackage.DECLARATION_LIST2__DECLARATION_LIST2:
        return declaration_list2 != null;
    }
    return super.eIsSet(featureID);
  }

} //declaration_list2Impl
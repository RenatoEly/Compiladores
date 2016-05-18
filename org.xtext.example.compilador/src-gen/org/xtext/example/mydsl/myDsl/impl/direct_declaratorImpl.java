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
import org.xtext.example.mydsl.myDsl.declarator;
import org.xtext.example.mydsl.myDsl.direct_declarator;
import org.xtext.example.mydsl.myDsl.direct_declarator2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>direct declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.direct_declaratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.direct_declaratorImpl#getDirect_declarator2 <em>Direct declarator2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.direct_declaratorImpl#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class direct_declaratorImpl extends MinimalEObjectImpl.Container implements direct_declarator
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDirect_declarator2() <em>Direct declarator2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirect_declarator2()
   * @generated
   * @ordered
   */
  protected direct_declarator2 direct_declarator2;

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
  protected direct_declaratorImpl()
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
    return MyDslPackage.Literals.DIRECT_DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_DECLARATOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public direct_declarator2 getDirect_declarator2()
  {
    return direct_declarator2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirect_declarator2(direct_declarator2 newDirect_declarator2, NotificationChain msgs)
  {
    direct_declarator2 oldDirect_declarator2 = direct_declarator2;
    direct_declarator2 = newDirect_declarator2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_DECLARATOR__DIRECT_DECLARATOR2, oldDirect_declarator2, newDirect_declarator2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirect_declarator2(direct_declarator2 newDirect_declarator2)
  {
    if (newDirect_declarator2 != direct_declarator2)
    {
      NotificationChain msgs = null;
      if (direct_declarator2 != null)
        msgs = ((InternalEObject)direct_declarator2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DIRECT_DECLARATOR__DIRECT_DECLARATOR2, null, msgs);
      if (newDirect_declarator2 != null)
        msgs = ((InternalEObject)newDirect_declarator2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DIRECT_DECLARATOR__DIRECT_DECLARATOR2, null, msgs);
      msgs = basicSetDirect_declarator2(newDirect_declarator2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_DECLARATOR__DIRECT_DECLARATOR2, newDirect_declarator2, newDirect_declarator2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_DECLARATOR__DECLARATOR, oldDeclarator, newDeclarator);
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
        msgs = ((InternalEObject)declarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DIRECT_DECLARATOR__DECLARATOR, null, msgs);
      if (newDeclarator != null)
        msgs = ((InternalEObject)newDeclarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DIRECT_DECLARATOR__DECLARATOR, null, msgs);
      msgs = basicSetDeclarator(newDeclarator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIRECT_DECLARATOR__DECLARATOR, newDeclarator, newDeclarator));
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
      case MyDslPackage.DIRECT_DECLARATOR__DIRECT_DECLARATOR2:
        return basicSetDirect_declarator2(null, msgs);
      case MyDslPackage.DIRECT_DECLARATOR__DECLARATOR:
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
      case MyDslPackage.DIRECT_DECLARATOR__NAME:
        return getName();
      case MyDslPackage.DIRECT_DECLARATOR__DIRECT_DECLARATOR2:
        return getDirect_declarator2();
      case MyDslPackage.DIRECT_DECLARATOR__DECLARATOR:
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
      case MyDslPackage.DIRECT_DECLARATOR__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.DIRECT_DECLARATOR__DIRECT_DECLARATOR2:
        setDirect_declarator2((direct_declarator2)newValue);
        return;
      case MyDslPackage.DIRECT_DECLARATOR__DECLARATOR:
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
      case MyDslPackage.DIRECT_DECLARATOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.DIRECT_DECLARATOR__DIRECT_DECLARATOR2:
        setDirect_declarator2((direct_declarator2)null);
        return;
      case MyDslPackage.DIRECT_DECLARATOR__DECLARATOR:
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
      case MyDslPackage.DIRECT_DECLARATOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.DIRECT_DECLARATOR__DIRECT_DECLARATOR2:
        return direct_declarator2 != null;
      case MyDslPackage.DIRECT_DECLARATOR__DECLARATOR:
        return declarator != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //direct_declaratorImpl
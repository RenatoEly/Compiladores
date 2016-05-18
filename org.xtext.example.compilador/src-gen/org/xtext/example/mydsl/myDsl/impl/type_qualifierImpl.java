/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.type_qualifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type qualifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.type_qualifierImpl#getConst <em>Const</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.type_qualifierImpl#getRestrict <em>Restrict</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.type_qualifierImpl#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.type_qualifierImpl#getAtomic <em>Atomic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class type_qualifierImpl extends MinimalEObjectImpl.Container implements type_qualifier
{
  /**
   * The default value of the '{@link #getConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst()
   * @generated
   * @ordered
   */
  protected static final String CONST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst()
   * @generated
   * @ordered
   */
  protected String const_ = CONST_EDEFAULT;

  /**
   * The default value of the '{@link #getRestrict() <em>Restrict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestrict()
   * @generated
   * @ordered
   */
  protected static final String RESTRICT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRestrict() <em>Restrict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestrict()
   * @generated
   * @ordered
   */
  protected String restrict = RESTRICT_EDEFAULT;

  /**
   * The default value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolatile()
   * @generated
   * @ordered
   */
  protected static final String VOLATILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolatile()
   * @generated
   * @ordered
   */
  protected String volatile_ = VOLATILE_EDEFAULT;

  /**
   * The default value of the '{@link #getAtomic() <em>Atomic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomic()
   * @generated
   * @ordered
   */
  protected static final String ATOMIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAtomic() <em>Atomic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomic()
   * @generated
   * @ordered
   */
  protected String atomic = ATOMIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected type_qualifierImpl()
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
    return MyDslPackage.Literals.TYPE_QUALIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConst()
  {
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConst(String newConst)
  {
    String oldConst = const_;
    const_ = newConst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_QUALIFIER__CONST, oldConst, const_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRestrict()
  {
    return restrict;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestrict(String newRestrict)
  {
    String oldRestrict = restrict;
    restrict = newRestrict;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_QUALIFIER__RESTRICT, oldRestrict, restrict));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVolatile()
  {
    return volatile_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVolatile(String newVolatile)
  {
    String oldVolatile = volatile_;
    volatile_ = newVolatile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_QUALIFIER__VOLATILE, oldVolatile, volatile_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAtomic()
  {
    return atomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtomic(String newAtomic)
  {
    String oldAtomic = atomic;
    atomic = newAtomic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_QUALIFIER__ATOMIC, oldAtomic, atomic));
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
      case MyDslPackage.TYPE_QUALIFIER__CONST:
        return getConst();
      case MyDslPackage.TYPE_QUALIFIER__RESTRICT:
        return getRestrict();
      case MyDslPackage.TYPE_QUALIFIER__VOLATILE:
        return getVolatile();
      case MyDslPackage.TYPE_QUALIFIER__ATOMIC:
        return getAtomic();
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
      case MyDslPackage.TYPE_QUALIFIER__CONST:
        setConst((String)newValue);
        return;
      case MyDslPackage.TYPE_QUALIFIER__RESTRICT:
        setRestrict((String)newValue);
        return;
      case MyDslPackage.TYPE_QUALIFIER__VOLATILE:
        setVolatile((String)newValue);
        return;
      case MyDslPackage.TYPE_QUALIFIER__ATOMIC:
        setAtomic((String)newValue);
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
      case MyDslPackage.TYPE_QUALIFIER__CONST:
        setConst(CONST_EDEFAULT);
        return;
      case MyDslPackage.TYPE_QUALIFIER__RESTRICT:
        setRestrict(RESTRICT_EDEFAULT);
        return;
      case MyDslPackage.TYPE_QUALIFIER__VOLATILE:
        setVolatile(VOLATILE_EDEFAULT);
        return;
      case MyDslPackage.TYPE_QUALIFIER__ATOMIC:
        setAtomic(ATOMIC_EDEFAULT);
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
      case MyDslPackage.TYPE_QUALIFIER__CONST:
        return CONST_EDEFAULT == null ? const_ != null : !CONST_EDEFAULT.equals(const_);
      case MyDslPackage.TYPE_QUALIFIER__RESTRICT:
        return RESTRICT_EDEFAULT == null ? restrict != null : !RESTRICT_EDEFAULT.equals(restrict);
      case MyDslPackage.TYPE_QUALIFIER__VOLATILE:
        return VOLATILE_EDEFAULT == null ? volatile_ != null : !VOLATILE_EDEFAULT.equals(volatile_);
      case MyDslPackage.TYPE_QUALIFIER__ATOMIC:
        return ATOMIC_EDEFAULT == null ? atomic != null : !ATOMIC_EDEFAULT.equals(atomic);
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
    result.append(" (const: ");
    result.append(const_);
    result.append(", restrict: ");
    result.append(restrict);
    result.append(", volatile: ");
    result.append(volatile_);
    result.append(", atomic: ");
    result.append(atomic);
    result.append(')');
    return result.toString();
  }

} //type_qualifierImpl

/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.signedType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>signed Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.signedTypeImpl#getSigned_type <em>Signed type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class signedTypeImpl extends type_specifierImpl implements signedType
{
  /**
   * The default value of the '{@link #getSigned_type() <em>Signed type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSigned_type()
   * @generated
   * @ordered
   */
  protected static final String SIGNED_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSigned_type() <em>Signed type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSigned_type()
   * @generated
   * @ordered
   */
  protected String signed_type = SIGNED_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected signedTypeImpl()
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
    return MyDslPackage.Literals.SIGNED_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSigned_type()
  {
    return signed_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSigned_type(String newSigned_type)
  {
    String oldSigned_type = signed_type;
    signed_type = newSigned_type;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIGNED_TYPE__SIGNED_TYPE, oldSigned_type, signed_type));
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
      case MyDslPackage.SIGNED_TYPE__SIGNED_TYPE:
        return getSigned_type();
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
      case MyDslPackage.SIGNED_TYPE__SIGNED_TYPE:
        setSigned_type((String)newValue);
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
      case MyDslPackage.SIGNED_TYPE__SIGNED_TYPE:
        setSigned_type(SIGNED_TYPE_EDEFAULT);
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
      case MyDslPackage.SIGNED_TYPE__SIGNED_TYPE:
        return SIGNED_TYPE_EDEFAULT == null ? signed_type != null : !SIGNED_TYPE_EDEFAULT.equals(signed_type);
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
    result.append(" (signed_type: ");
    result.append(signed_type);
    result.append(')');
    return result.toString();
  }

} //signedTypeImpl

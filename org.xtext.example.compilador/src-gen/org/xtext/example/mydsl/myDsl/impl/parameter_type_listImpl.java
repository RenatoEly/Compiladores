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
import org.xtext.example.mydsl.myDsl.parameter_list;
import org.xtext.example.mydsl.myDsl.parameter_type_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameter type list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.parameter_type_listImpl#getParameter_list <em>Parameter list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.parameter_type_listImpl#getEllipsis <em>Ellipsis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class parameter_type_listImpl extends MinimalEObjectImpl.Container implements parameter_type_list
{
  /**
   * The cached value of the '{@link #getParameter_list() <em>Parameter list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter_list()
   * @generated
   * @ordered
   */
  protected parameter_list parameter_list;

  /**
   * The default value of the '{@link #getEllipsis() <em>Ellipsis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEllipsis()
   * @generated
   * @ordered
   */
  protected static final String ELLIPSIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEllipsis() <em>Ellipsis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEllipsis()
   * @generated
   * @ordered
   */
  protected String ellipsis = ELLIPSIS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected parameter_type_listImpl()
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
    return MyDslPackage.Literals.PARAMETER_TYPE_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_list getParameter_list()
  {
    return parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter_list(parameter_list newParameter_list, NotificationChain msgs)
  {
    parameter_list oldParameter_list = parameter_list;
    parameter_list = newParameter_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_TYPE_LIST__PARAMETER_LIST, oldParameter_list, newParameter_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter_list(parameter_list newParameter_list)
  {
    if (newParameter_list != parameter_list)
    {
      NotificationChain msgs = null;
      if (parameter_list != null)
        msgs = ((InternalEObject)parameter_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETER_TYPE_LIST__PARAMETER_LIST, null, msgs);
      if (newParameter_list != null)
        msgs = ((InternalEObject)newParameter_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETER_TYPE_LIST__PARAMETER_LIST, null, msgs);
      msgs = basicSetParameter_list(newParameter_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_TYPE_LIST__PARAMETER_LIST, newParameter_list, newParameter_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEllipsis()
  {
    return ellipsis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEllipsis(String newEllipsis)
  {
    String oldEllipsis = ellipsis;
    ellipsis = newEllipsis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_TYPE_LIST__ELLIPSIS, oldEllipsis, ellipsis));
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
      case MyDslPackage.PARAMETER_TYPE_LIST__PARAMETER_LIST:
        return basicSetParameter_list(null, msgs);
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
      case MyDslPackage.PARAMETER_TYPE_LIST__PARAMETER_LIST:
        return getParameter_list();
      case MyDslPackage.PARAMETER_TYPE_LIST__ELLIPSIS:
        return getEllipsis();
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
      case MyDslPackage.PARAMETER_TYPE_LIST__PARAMETER_LIST:
        setParameter_list((parameter_list)newValue);
        return;
      case MyDslPackage.PARAMETER_TYPE_LIST__ELLIPSIS:
        setEllipsis((String)newValue);
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
      case MyDslPackage.PARAMETER_TYPE_LIST__PARAMETER_LIST:
        setParameter_list((parameter_list)null);
        return;
      case MyDslPackage.PARAMETER_TYPE_LIST__ELLIPSIS:
        setEllipsis(ELLIPSIS_EDEFAULT);
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
      case MyDslPackage.PARAMETER_TYPE_LIST__PARAMETER_LIST:
        return parameter_list != null;
      case MyDslPackage.PARAMETER_TYPE_LIST__ELLIPSIS:
        return ELLIPSIS_EDEFAULT == null ? ellipsis != null : !ELLIPSIS_EDEFAULT.equals(ellipsis);
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
    result.append(" (ellipsis: ");
    result.append(ellipsis);
    result.append(')');
    return result.toString();
  }

} //parameter_type_listImpl

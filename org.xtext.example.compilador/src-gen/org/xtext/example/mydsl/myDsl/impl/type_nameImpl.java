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
import org.xtext.example.mydsl.myDsl.specifier_qualifier_list;
import org.xtext.example.mydsl.myDsl.type_name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.type_nameImpl#getSpecifier_qualifier_list <em>Specifier qualifier list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.type_nameImpl#getAbstract_declarator <em>Abstract declarator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class type_nameImpl extends MinimalEObjectImpl.Container implements type_name
{
  /**
   * The cached value of the '{@link #getSpecifier_qualifier_list() <em>Specifier qualifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecifier_qualifier_list()
   * @generated
   * @ordered
   */
  protected specifier_qualifier_list specifier_qualifier_list;

  /**
   * The cached value of the '{@link #getAbstract_declarator() <em>Abstract declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract_declarator()
   * @generated
   * @ordered
   */
  protected abstract_declarator abstract_declarator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected type_nameImpl()
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
    return MyDslPackage.Literals.TYPE_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public specifier_qualifier_list getSpecifier_qualifier_list()
  {
    return specifier_qualifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpecifier_qualifier_list(specifier_qualifier_list newSpecifier_qualifier_list, NotificationChain msgs)
  {
    specifier_qualifier_list oldSpecifier_qualifier_list = specifier_qualifier_list;
    specifier_qualifier_list = newSpecifier_qualifier_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST, oldSpecifier_qualifier_list, newSpecifier_qualifier_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecifier_qualifier_list(specifier_qualifier_list newSpecifier_qualifier_list)
  {
    if (newSpecifier_qualifier_list != specifier_qualifier_list)
    {
      NotificationChain msgs = null;
      if (specifier_qualifier_list != null)
        msgs = ((InternalEObject)specifier_qualifier_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST, null, msgs);
      if (newSpecifier_qualifier_list != null)
        msgs = ((InternalEObject)newSpecifier_qualifier_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST, null, msgs);
      msgs = basicSetSpecifier_qualifier_list(newSpecifier_qualifier_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST, newSpecifier_qualifier_list, newSpecifier_qualifier_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public abstract_declarator getAbstract_declarator()
  {
    return abstract_declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstract_declarator(abstract_declarator newAbstract_declarator, NotificationChain msgs)
  {
    abstract_declarator oldAbstract_declarator = abstract_declarator;
    abstract_declarator = newAbstract_declarator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_NAME__ABSTRACT_DECLARATOR, oldAbstract_declarator, newAbstract_declarator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract_declarator(abstract_declarator newAbstract_declarator)
  {
    if (newAbstract_declarator != abstract_declarator)
    {
      NotificationChain msgs = null;
      if (abstract_declarator != null)
        msgs = ((InternalEObject)abstract_declarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_NAME__ABSTRACT_DECLARATOR, null, msgs);
      if (newAbstract_declarator != null)
        msgs = ((InternalEObject)newAbstract_declarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_NAME__ABSTRACT_DECLARATOR, null, msgs);
      msgs = basicSetAbstract_declarator(newAbstract_declarator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_NAME__ABSTRACT_DECLARATOR, newAbstract_declarator, newAbstract_declarator));
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
      case MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST:
        return basicSetSpecifier_qualifier_list(null, msgs);
      case MyDslPackage.TYPE_NAME__ABSTRACT_DECLARATOR:
        return basicSetAbstract_declarator(null, msgs);
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
      case MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST:
        return getSpecifier_qualifier_list();
      case MyDslPackage.TYPE_NAME__ABSTRACT_DECLARATOR:
        return getAbstract_declarator();
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
      case MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST:
        setSpecifier_qualifier_list((specifier_qualifier_list)newValue);
        return;
      case MyDslPackage.TYPE_NAME__ABSTRACT_DECLARATOR:
        setAbstract_declarator((abstract_declarator)newValue);
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
      case MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST:
        setSpecifier_qualifier_list((specifier_qualifier_list)null);
        return;
      case MyDslPackage.TYPE_NAME__ABSTRACT_DECLARATOR:
        setAbstract_declarator((abstract_declarator)null);
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
      case MyDslPackage.TYPE_NAME__SPECIFIER_QUALIFIER_LIST:
        return specifier_qualifier_list != null;
      case MyDslPackage.TYPE_NAME__ABSTRACT_DECLARATOR:
        return abstract_declarator != null;
    }
    return super.eIsSet(featureID);
  }

} //type_nameImpl

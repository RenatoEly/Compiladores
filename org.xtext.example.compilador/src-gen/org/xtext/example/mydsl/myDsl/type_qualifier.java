/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_qualifier#getConst <em>Const</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_qualifier#getRestrict <em>Restrict</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_qualifier#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_qualifier#getAtomic <em>Atomic</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_qualifier()
 * @model
 * @generated
 */
public interface type_qualifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' attribute.
   * @see #setConst(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_qualifier_Const()
   * @model
   * @generated
   */
  String getConst();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_qualifier#getConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #getConst()
   * @generated
   */
  void setConst(String value);

  /**
   * Returns the value of the '<em><b>Restrict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restrict</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restrict</em>' attribute.
   * @see #setRestrict(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_qualifier_Restrict()
   * @model
   * @generated
   */
  String getRestrict();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_qualifier#getRestrict <em>Restrict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Restrict</em>' attribute.
   * @see #getRestrict()
   * @generated
   */
  void setRestrict(String value);

  /**
   * Returns the value of the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Volatile</em>' attribute.
   * @see #setVolatile(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_qualifier_Volatile()
   * @model
   * @generated
   */
  String getVolatile();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_qualifier#getVolatile <em>Volatile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Volatile</em>' attribute.
   * @see #getVolatile()
   * @generated
   */
  void setVolatile(String value);

  /**
   * Returns the value of the '<em><b>Atomic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atomic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic</em>' attribute.
   * @see #setAtomic(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_qualifier_Atomic()
   * @model
   * @generated
   */
  String getAtomic();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_qualifier#getAtomic <em>Atomic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atomic</em>' attribute.
   * @see #getAtomic()
   * @generated
   */
  void setAtomic(String value);

} // type_qualifier

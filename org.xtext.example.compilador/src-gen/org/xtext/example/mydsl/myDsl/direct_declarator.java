/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>direct declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.direct_declarator#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.direct_declarator#getDirect_declarator2 <em>Direct declarator2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.direct_declarator#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdirect_declarator()
 * @model
 * @generated
 */
public interface direct_declarator extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdirect_declarator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.direct_declarator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Direct declarator2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direct declarator2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direct declarator2</em>' containment reference.
   * @see #setDirect_declarator2(direct_declarator2)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdirect_declarator_Direct_declarator2()
   * @model containment="true"
   * @generated
   */
  direct_declarator2 getDirect_declarator2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.direct_declarator#getDirect_declarator2 <em>Direct declarator2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direct declarator2</em>' containment reference.
   * @see #getDirect_declarator2()
   * @generated
   */
  void setDirect_declarator2(direct_declarator2 value);

  /**
   * Returns the value of the '<em><b>Declarator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarator</em>' containment reference.
   * @see #setDeclarator(declarator)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdirect_declarator_Declarator()
   * @model containment="true"
   * @generated
   */
  declarator getDeclarator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.direct_declarator#getDeclarator <em>Declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declarator</em>' containment reference.
   * @see #getDeclarator()
   * @generated
   */
  void setDeclarator(declarator value);

} // direct_declarator
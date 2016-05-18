/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.xtext.example.mydsl.myDsl.direct_declarator#getDirect_declarators <em>Direct declarators</em>}</li>
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
   * Returns the value of the '<em><b>Direct declarators</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.direct_declarator2}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direct declarators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direct declarators</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdirect_declarator_Direct_declarators()
   * @model containment="true"
   * @generated
   */
  EList<direct_declarator2> getDirect_declarators();

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

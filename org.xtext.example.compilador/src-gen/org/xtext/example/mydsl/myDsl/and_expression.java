/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>and expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.and_expression#getEquality_expression <em>Equality expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.and_expression#getAnd_expression2 <em>And expression2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getand_expression()
 * @model
 * @generated
 */
public interface and_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Equality expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equality expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equality expression</em>' containment reference.
   * @see #setEquality_expression(equality_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getand_expression_Equality_expression()
   * @model containment="true"
   * @generated
   */
  equality_expression getEquality_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.and_expression#getEquality_expression <em>Equality expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equality expression</em>' containment reference.
   * @see #getEquality_expression()
   * @generated
   */
  void setEquality_expression(equality_expression value);

  /**
   * Returns the value of the '<em><b>And expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And expression2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And expression2</em>' containment reference.
   * @see #setAnd_expression2(and_expression2)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getand_expression_And_expression2()
   * @model containment="true"
   * @generated
   */
  and_expression2 getAnd_expression2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.and_expression#getAnd_expression2 <em>And expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>And expression2</em>' containment reference.
   * @see #getAnd_expression2()
   * @generated
   */
  void setAnd_expression2(and_expression2 value);

} // and_expression

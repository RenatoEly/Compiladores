/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>equality expression2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.equality_expression2#getEq_op <em>Eq op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.equality_expression2#getRelational_expression <em>Relational expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.equality_expression2#getEquality_expression2 <em>Equality expression2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.equality_expression2#getNe_op <em>Ne op</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getequality_expression2()
 * @model
 * @generated
 */
public interface equality_expression2 extends EObject
{
  /**
   * Returns the value of the '<em><b>Eq op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eq op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eq op</em>' attribute.
   * @see #setEq_op(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getequality_expression2_Eq_op()
   * @model
   * @generated
   */
  String getEq_op();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.equality_expression2#getEq_op <em>Eq op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eq op</em>' attribute.
   * @see #getEq_op()
   * @generated
   */
  void setEq_op(String value);

  /**
   * Returns the value of the '<em><b>Relational expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relational expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relational expression</em>' containment reference.
   * @see #setRelational_expression(relational_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getequality_expression2_Relational_expression()
   * @model containment="true"
   * @generated
   */
  relational_expression getRelational_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.equality_expression2#getRelational_expression <em>Relational expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relational expression</em>' containment reference.
   * @see #getRelational_expression()
   * @generated
   */
  void setRelational_expression(relational_expression value);

  /**
   * Returns the value of the '<em><b>Equality expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equality expression2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equality expression2</em>' containment reference.
   * @see #setEquality_expression2(equality_expression2)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getequality_expression2_Equality_expression2()
   * @model containment="true"
   * @generated
   */
  equality_expression2 getEquality_expression2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.equality_expression2#getEquality_expression2 <em>Equality expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equality expression2</em>' containment reference.
   * @see #getEquality_expression2()
   * @generated
   */
  void setEquality_expression2(equality_expression2 value);

  /**
   * Returns the value of the '<em><b>Ne op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ne op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ne op</em>' attribute.
   * @see #setNe_op(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getequality_expression2_Ne_op()
   * @model
   * @generated
   */
  String getNe_op();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.equality_expression2#getNe_op <em>Ne op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ne op</em>' attribute.
   * @see #getNe_op()
   * @generated
   */
  void setNe_op(String value);

} // equality_expression2

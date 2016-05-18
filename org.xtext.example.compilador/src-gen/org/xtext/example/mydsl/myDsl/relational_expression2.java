/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>relational expression2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.relational_expression2#getShift_expression <em>Shift expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.relational_expression2#getRelational_expression2 <em>Relational expression2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.relational_expression2#getRelational_expression <em>Relational expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.relational_expression2#getLe_op <em>Le op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.relational_expression2#getGe_op <em>Ge op</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrelational_expression2()
 * @model
 * @generated
 */
public interface relational_expression2 extends EObject
{
  /**
   * Returns the value of the '<em><b>Shift expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shift expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift expression</em>' containment reference.
   * @see #setShift_expression(shift_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrelational_expression2_Shift_expression()
   * @model containment="true"
   * @generated
   */
  shift_expression getShift_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.relational_expression2#getShift_expression <em>Shift expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift expression</em>' containment reference.
   * @see #getShift_expression()
   * @generated
   */
  void setShift_expression(shift_expression value);

  /**
   * Returns the value of the '<em><b>Relational expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relational expression2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relational expression2</em>' containment reference.
   * @see #setRelational_expression2(relational_expression2)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrelational_expression2_Relational_expression2()
   * @model containment="true"
   * @generated
   */
  relational_expression2 getRelational_expression2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.relational_expression2#getRelational_expression2 <em>Relational expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relational expression2</em>' containment reference.
   * @see #getRelational_expression2()
   * @generated
   */
  void setRelational_expression2(relational_expression2 value);

  /**
   * Returns the value of the '<em><b>Relational expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relational expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relational expression</em>' containment reference.
   * @see #setRelational_expression(relational_expression2)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrelational_expression2_Relational_expression()
   * @model containment="true"
   * @generated
   */
  relational_expression2 getRelational_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.relational_expression2#getRelational_expression <em>Relational expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relational expression</em>' containment reference.
   * @see #getRelational_expression()
   * @generated
   */
  void setRelational_expression(relational_expression2 value);

  /**
   * Returns the value of the '<em><b>Le op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Le op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Le op</em>' attribute.
   * @see #setLe_op(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrelational_expression2_Le_op()
   * @model
   * @generated
   */
  String getLe_op();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.relational_expression2#getLe_op <em>Le op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Le op</em>' attribute.
   * @see #getLe_op()
   * @generated
   */
  void setLe_op(String value);

  /**
   * Returns the value of the '<em><b>Ge op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ge op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ge op</em>' attribute.
   * @see #setGe_op(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrelational_expression2_Ge_op()
   * @model
   * @generated
   */
  String getGe_op();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.relational_expression2#getGe_op <em>Ge op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ge op</em>' attribute.
   * @see #getGe_op()
   * @generated
   */
  void setGe_op(String value);

} // relational_expression2
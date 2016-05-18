/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>shift expression2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.shift_expression2#getLeft_op <em>Left op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.shift_expression2#getAdditive_expression <em>Additive expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.shift_expression2#getShift_expression2 <em>Shift expression2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.shift_expression2#getRight_op <em>Right op</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getshift_expression2()
 * @model
 * @generated
 */
public interface shift_expression2 extends EObject
{
  /**
   * Returns the value of the '<em><b>Left op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left op</em>' attribute.
   * @see #setLeft_op(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getshift_expression2_Left_op()
   * @model
   * @generated
   */
  String getLeft_op();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.shift_expression2#getLeft_op <em>Left op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left op</em>' attribute.
   * @see #getLeft_op()
   * @generated
   */
  void setLeft_op(String value);

  /**
   * Returns the value of the '<em><b>Additive expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additive expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additive expression</em>' containment reference.
   * @see #setAdditive_expression(additive_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getshift_expression2_Additive_expression()
   * @model containment="true"
   * @generated
   */
  additive_expression getAdditive_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.shift_expression2#getAdditive_expression <em>Additive expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Additive expression</em>' containment reference.
   * @see #getAdditive_expression()
   * @generated
   */
  void setAdditive_expression(additive_expression value);

  /**
   * Returns the value of the '<em><b>Shift expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shift expression2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift expression2</em>' containment reference.
   * @see #setShift_expression2(shift_expression2)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getshift_expression2_Shift_expression2()
   * @model containment="true"
   * @generated
   */
  shift_expression2 getShift_expression2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.shift_expression2#getShift_expression2 <em>Shift expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift expression2</em>' containment reference.
   * @see #getShift_expression2()
   * @generated
   */
  void setShift_expression2(shift_expression2 value);

  /**
   * Returns the value of the '<em><b>Right op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right op</em>' attribute.
   * @see #setRight_op(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getshift_expression2_Right_op()
   * @model
   * @generated
   */
  String getRight_op();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.shift_expression2#getRight_op <em>Right op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right op</em>' attribute.
   * @see #getRight_op()
   * @generated
   */
  void setRight_op(String value);

} // shift_expression2

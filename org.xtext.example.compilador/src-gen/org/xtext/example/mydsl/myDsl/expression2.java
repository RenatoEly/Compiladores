/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.expression2#getAssignment_expression <em>Assignment expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.expression2#getExpression2 <em>Expression2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getexpression2()
 * @model
 * @generated
 */
public interface expression2 extends EObject
{
  /**
   * Returns the value of the '<em><b>Assignment expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment expression</em>' containment reference.
   * @see #setAssignment_expression(assignment_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getexpression2_Assignment_expression()
   * @model containment="true"
   * @generated
   */
  assignment_expression getAssignment_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.expression2#getAssignment_expression <em>Assignment expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment expression</em>' containment reference.
   * @see #getAssignment_expression()
   * @generated
   */
  void setAssignment_expression(assignment_expression value);

  /**
   * Returns the value of the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression2</em>' containment reference.
   * @see #setExpression2(expression2)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getexpression2_Expression2()
   * @model containment="true"
   * @generated
   */
  expression2 getExpression2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.expression2#getExpression2 <em>Expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression2</em>' containment reference.
   * @see #getExpression2()
   * @generated
   */
  void setExpression2(expression2 value);

} // expression2

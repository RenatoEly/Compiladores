/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.variableRef#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getvariableRef()
 * @model
 * @generated
 */
public interface variableRef extends simple_expression
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(direct_declarator)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getvariableRef_Variable()
   * @model
   * @generated
   */
  direct_declarator getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.variableRef#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(direct_declarator value);

} // variableRef
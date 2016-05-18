/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.function_specifier#getInline <em>Inline</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.function_specifier#getNoreturn <em>Noreturn</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getfunction_specifier()
 * @model
 * @generated
 */
public interface function_specifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Inline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inline</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inline</em>' attribute.
   * @see #setInline(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getfunction_specifier_Inline()
   * @model
   * @generated
   */
  String getInline();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.function_specifier#getInline <em>Inline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inline</em>' attribute.
   * @see #getInline()
   * @generated
   */
  void setInline(String value);

  /**
   * Returns the value of the '<em><b>Noreturn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Noreturn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Noreturn</em>' attribute.
   * @see #setNoreturn(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getfunction_specifier_Noreturn()
   * @model
   * @generated
   */
  String getNoreturn();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.function_specifier#getNoreturn <em>Noreturn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Noreturn</em>' attribute.
   * @see #getNoreturn()
   * @generated
   */
  void setNoreturn(String value);

} // function_specifier

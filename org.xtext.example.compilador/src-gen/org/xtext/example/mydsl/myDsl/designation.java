/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>designation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.designation#getDesignator_list <em>Designator list</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdesignation()
 * @model
 * @generated
 */
public interface designation extends EObject
{
  /**
   * Returns the value of the '<em><b>Designator list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Designator list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Designator list</em>' containment reference.
   * @see #setDesignator_list(designator_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdesignation_Designator_list()
   * @model containment="true"
   * @generated
   */
  designator_list getDesignator_list();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.designation#getDesignator_list <em>Designator list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Designator list</em>' containment reference.
   * @see #getDesignator_list()
   * @generated
   */
  void setDesignator_list(designator_list value);

} // designation

/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>compound statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.compound_statement#getBlock_item_list <em>Block item list</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getcompound_statement()
 * @model
 * @generated
 */
public interface compound_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Block item list</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.block_item}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block item list</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block item list</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getcompound_statement_Block_item_list()
   * @model containment="true"
   * @generated
   */
  EList<block_item> getBlock_item_list();

} // compound_statement

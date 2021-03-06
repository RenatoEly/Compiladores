/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>direct declarator2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.direct_declarator2#getDeclarators <em>Declarators</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.direct_declarator2#getStatic <em>Static</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.direct_declarator2#getType_qualifier_list <em>Type qualifier list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.direct_declarator2#getAssignment_expression <em>Assignment expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.direct_declarator2#getParameter_type_list <em>Parameter type list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.direct_declarator2#getIdentifier_list <em>Identifier list</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdirect_declarator2()
 * @model
 * @generated
 */
public interface direct_declarator2 extends EObject
{
  /**
   * Returns the value of the '<em><b>Declarators</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.direct_declarator2}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarators</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdirect_declarator2_Declarators()
   * @model containment="true"
   * @generated
   */
  EList<direct_declarator2> getDeclarators();

  /**
   * Returns the value of the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' attribute.
   * @see #setStatic(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdirect_declarator2_Static()
   * @model
   * @generated
   */
  String getStatic();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.direct_declarator2#getStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #getStatic()
   * @generated
   */
  void setStatic(String value);

  /**
   * Returns the value of the '<em><b>Type qualifier list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type qualifier list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type qualifier list</em>' containment reference.
   * @see #setType_qualifier_list(type_qualifier_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdirect_declarator2_Type_qualifier_list()
   * @model containment="true"
   * @generated
   */
  type_qualifier_list getType_qualifier_list();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.direct_declarator2#getType_qualifier_list <em>Type qualifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type qualifier list</em>' containment reference.
   * @see #getType_qualifier_list()
   * @generated
   */
  void setType_qualifier_list(type_qualifier_list value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdirect_declarator2_Assignment_expression()
   * @model containment="true"
   * @generated
   */
  assignment_expression getAssignment_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.direct_declarator2#getAssignment_expression <em>Assignment expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment expression</em>' containment reference.
   * @see #getAssignment_expression()
   * @generated
   */
  void setAssignment_expression(assignment_expression value);

  /**
   * Returns the value of the '<em><b>Parameter type list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter type list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter type list</em>' containment reference.
   * @see #setParameter_type_list(parameter_type_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdirect_declarator2_Parameter_type_list()
   * @model containment="true"
   * @generated
   */
  parameter_type_list getParameter_type_list();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.direct_declarator2#getParameter_type_list <em>Parameter type list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter type list</em>' containment reference.
   * @see #getParameter_type_list()
   * @generated
   */
  void setParameter_type_list(parameter_type_list value);

  /**
   * Returns the value of the '<em><b>Identifier list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier list</em>' containment reference.
   * @see #setIdentifier_list(identifier_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdirect_declarator2_Identifier_list()
   * @model containment="true"
   * @generated
   */
  identifier_list getIdentifier_list();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.direct_declarator2#getIdentifier_list <em>Identifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier list</em>' containment reference.
   * @see #getIdentifier_list()
   * @generated
   */
  void setIdentifier_list(identifier_list value);

} // direct_declarator2

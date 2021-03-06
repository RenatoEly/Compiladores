/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct or union specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.struct_or_union_specifier#getStruct_or_union <em>Struct or union</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.struct_or_union_specifier#getStruct_declaration_list <em>Struct declaration list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.struct_or_union_specifier#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_or_union_specifier()
 * @model
 * @generated
 */
public interface struct_or_union_specifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Struct or union</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct or union</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct or union</em>' containment reference.
   * @see #setStruct_or_union(struct_or_union)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_or_union_specifier_Struct_or_union()
   * @model containment="true"
   * @generated
   */
  struct_or_union getStruct_or_union();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.struct_or_union_specifier#getStruct_or_union <em>Struct or union</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct or union</em>' containment reference.
   * @see #getStruct_or_union()
   * @generated
   */
  void setStruct_or_union(struct_or_union value);

  /**
   * Returns the value of the '<em><b>Struct declaration list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct declaration list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct declaration list</em>' containment reference.
   * @see #setStruct_declaration_list(struct_declaration_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_or_union_specifier_Struct_declaration_list()
   * @model containment="true"
   * @generated
   */
  struct_declaration_list getStruct_declaration_list();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.struct_or_union_specifier#getStruct_declaration_list <em>Struct declaration list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct declaration list</em>' containment reference.
   * @see #getStruct_declaration_list()
   * @generated
   */
  void setStruct_declaration_list(struct_declaration_list value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getstruct_or_union_specifier_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.struct_or_union_specifier#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

} // struct_or_union_specifier

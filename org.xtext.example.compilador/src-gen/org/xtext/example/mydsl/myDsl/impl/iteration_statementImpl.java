/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.declaration;
import org.xtext.example.mydsl.myDsl.expression_statement;
import org.xtext.example.mydsl.myDsl.iteration_statement;
import org.xtext.example.mydsl.myDsl.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>iteration statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.iteration_statementImpl#getWhile <em>While</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.iteration_statementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.iteration_statementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.iteration_statementImpl#getDo <em>Do</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.iteration_statementImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.iteration_statementImpl#getExpression_statement <em>Expression statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.iteration_statementImpl#getExpression_statement2 <em>Expression statement2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.iteration_statementImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class iteration_statementImpl extends MinimalEObjectImpl.Container implements iteration_statement
{
  /**
   * The default value of the '{@link #getWhile() <em>While</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhile()
   * @generated
   * @ordered
   */
  protected static final String WHILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWhile() <em>While</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhile()
   * @generated
   * @ordered
   */
  protected String while_ = WHILE_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EObject expression;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected statement statement;

  /**
   * The default value of the '{@link #getDo() <em>Do</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDo()
   * @generated
   * @ordered
   */
  protected static final String DO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDo() <em>Do</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDo()
   * @generated
   * @ordered
   */
  protected String do_ = DO_EDEFAULT;

  /**
   * The default value of the '{@link #getFor() <em>For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor()
   * @generated
   * @ordered
   */
  protected static final String FOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFor() <em>For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor()
   * @generated
   * @ordered
   */
  protected String for_ = FOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression_statement() <em>Expression statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression_statement()
   * @generated
   * @ordered
   */
  protected expression_statement expression_statement;

  /**
   * The cached value of the '{@link #getExpression_statement2() <em>Expression statement2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression_statement2()
   * @generated
   * @ordered
   */
  protected expression_statement expression_statement2;

  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected declaration declaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected iteration_statementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.ITERATION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWhile()
  {
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhile(String newWhile)
  {
    String oldWhile = while_;
    while_ = newWhile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__WHILE, oldWhile, while_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(EObject newExpression, NotificationChain msgs)
  {
    EObject oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(EObject newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITERATION_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITERATION_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(statement newStatement, NotificationChain msgs)
  {
    statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITERATION_STATEMENT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITERATION_STATEMENT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDo()
  {
    return do_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDo(String newDo)
  {
    String oldDo = do_;
    do_ = newDo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__DO, oldDo, do_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFor()
  {
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor(String newFor)
  {
    String oldFor = for_;
    for_ = newFor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__FOR, oldFor, for_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_statement getExpression_statement()
  {
    return expression_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression_statement(expression_statement newExpression_statement, NotificationChain msgs)
  {
    expression_statement oldExpression_statement = expression_statement;
    expression_statement = newExpression_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT, oldExpression_statement, newExpression_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression_statement(expression_statement newExpression_statement)
  {
    if (newExpression_statement != expression_statement)
    {
      NotificationChain msgs = null;
      if (expression_statement != null)
        msgs = ((InternalEObject)expression_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT, null, msgs);
      if (newExpression_statement != null)
        msgs = ((InternalEObject)newExpression_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT, null, msgs);
      msgs = basicSetExpression_statement(newExpression_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT, newExpression_statement, newExpression_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_statement getExpression_statement2()
  {
    return expression_statement2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression_statement2(expression_statement newExpression_statement2, NotificationChain msgs)
  {
    expression_statement oldExpression_statement2 = expression_statement2;
    expression_statement2 = newExpression_statement2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2, oldExpression_statement2, newExpression_statement2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression_statement2(expression_statement newExpression_statement2)
  {
    if (newExpression_statement2 != expression_statement2)
    {
      NotificationChain msgs = null;
      if (expression_statement2 != null)
        msgs = ((InternalEObject)expression_statement2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2, null, msgs);
      if (newExpression_statement2 != null)
        msgs = ((InternalEObject)newExpression_statement2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2, null, msgs);
      msgs = basicSetExpression_statement2(newExpression_statement2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2, newExpression_statement2, newExpression_statement2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration getDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration(declaration newDeclaration, NotificationChain msgs)
  {
    declaration oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__DECLARATION, oldDeclaration, newDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(declaration newDeclaration)
  {
    if (newDeclaration != declaration)
    {
      NotificationChain msgs = null;
      if (declaration != null)
        msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITERATION_STATEMENT__DECLARATION, null, msgs);
      if (newDeclaration != null)
        msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITERATION_STATEMENT__DECLARATION, null, msgs);
      msgs = basicSetDeclaration(newDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ITERATION_STATEMENT__DECLARATION, newDeclaration, newDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.ITERATION_STATEMENT__STATEMENT:
        return basicSetStatement(null, msgs);
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT:
        return basicSetExpression_statement(null, msgs);
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2:
        return basicSetExpression_statement2(null, msgs);
      case MyDslPackage.ITERATION_STATEMENT__DECLARATION:
        return basicSetDeclaration(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.ITERATION_STATEMENT__WHILE:
        return getWhile();
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION:
        return getExpression();
      case MyDslPackage.ITERATION_STATEMENT__STATEMENT:
        return getStatement();
      case MyDslPackage.ITERATION_STATEMENT__DO:
        return getDo();
      case MyDslPackage.ITERATION_STATEMENT__FOR:
        return getFor();
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT:
        return getExpression_statement();
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2:
        return getExpression_statement2();
      case MyDslPackage.ITERATION_STATEMENT__DECLARATION:
        return getDeclaration();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ITERATION_STATEMENT__WHILE:
        setWhile((String)newValue);
        return;
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION:
        setExpression((EObject)newValue);
        return;
      case MyDslPackage.ITERATION_STATEMENT__STATEMENT:
        setStatement((statement)newValue);
        return;
      case MyDslPackage.ITERATION_STATEMENT__DO:
        setDo((String)newValue);
        return;
      case MyDslPackage.ITERATION_STATEMENT__FOR:
        setFor((String)newValue);
        return;
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT:
        setExpression_statement((expression_statement)newValue);
        return;
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2:
        setExpression_statement2((expression_statement)newValue);
        return;
      case MyDslPackage.ITERATION_STATEMENT__DECLARATION:
        setDeclaration((declaration)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ITERATION_STATEMENT__WHILE:
        setWhile(WHILE_EDEFAULT);
        return;
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION:
        setExpression((EObject)null);
        return;
      case MyDslPackage.ITERATION_STATEMENT__STATEMENT:
        setStatement((statement)null);
        return;
      case MyDslPackage.ITERATION_STATEMENT__DO:
        setDo(DO_EDEFAULT);
        return;
      case MyDslPackage.ITERATION_STATEMENT__FOR:
        setFor(FOR_EDEFAULT);
        return;
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT:
        setExpression_statement((expression_statement)null);
        return;
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2:
        setExpression_statement2((expression_statement)null);
        return;
      case MyDslPackage.ITERATION_STATEMENT__DECLARATION:
        setDeclaration((declaration)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ITERATION_STATEMENT__WHILE:
        return WHILE_EDEFAULT == null ? while_ != null : !WHILE_EDEFAULT.equals(while_);
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION:
        return expression != null;
      case MyDslPackage.ITERATION_STATEMENT__STATEMENT:
        return statement != null;
      case MyDslPackage.ITERATION_STATEMENT__DO:
        return DO_EDEFAULT == null ? do_ != null : !DO_EDEFAULT.equals(do_);
      case MyDslPackage.ITERATION_STATEMENT__FOR:
        return FOR_EDEFAULT == null ? for_ != null : !FOR_EDEFAULT.equals(for_);
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT:
        return expression_statement != null;
      case MyDslPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2:
        return expression_statement2 != null;
      case MyDslPackage.ITERATION_STATEMENT__DECLARATION:
        return declaration != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (while: ");
    result.append(while_);
    result.append(", do: ");
    result.append(do_);
    result.append(", for: ");
    result.append(for_);
    result.append(')');
    return result.toString();
  }

} //iteration_statementImpl

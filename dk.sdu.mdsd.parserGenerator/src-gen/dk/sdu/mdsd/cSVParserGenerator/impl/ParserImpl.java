/**
 * generated by Xtext 2.21.0
 */
package dk.sdu.mdsd.cSVParserGenerator.impl;

import dk.sdu.mdsd.cSVParserGenerator.CSVParserGeneratorPackage;
import dk.sdu.mdsd.cSVParserGenerator.ColDecl;
import dk.sdu.mdsd.cSVParserGenerator.FileDecl;
import dk.sdu.mdsd.cSVParserGenerator.Modification;
import dk.sdu.mdsd.cSVParserGenerator.Output;
import dk.sdu.mdsd.cSVParserGenerator.Parser;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.cSVParserGenerator.impl.ParserImpl#getFile <em>File</em>}</li>
 *   <li>{@link dk.sdu.mdsd.cSVParserGenerator.impl.ParserImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link dk.sdu.mdsd.cSVParserGenerator.impl.ParserImpl#getMods <em>Mods</em>}</li>
 *   <li>{@link dk.sdu.mdsd.cSVParserGenerator.impl.ParserImpl#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParserImpl extends MinimalEObjectImpl.Container implements Parser
{
  /**
   * The cached value of the '{@link #getFile() <em>File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile()
   * @generated
   * @ordered
   */
  protected FileDecl file;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<ColDecl> columns;

  /**
   * The cached value of the '{@link #getMods() <em>Mods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMods()
   * @generated
   * @ordered
   */
  protected EList<Modification> mods;

  /**
   * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOut()
   * @generated
   * @ordered
   */
  protected Output out;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParserImpl()
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
    return CSVParserGeneratorPackage.Literals.PARSER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FileDecl getFile()
  {
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFile(FileDecl newFile, NotificationChain msgs)
  {
    FileDecl oldFile = file;
    file = newFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSVParserGeneratorPackage.PARSER__FILE, oldFile, newFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFile(FileDecl newFile)
  {
    if (newFile != file)
    {
      NotificationChain msgs = null;
      if (file != null)
        msgs = ((InternalEObject)file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSVParserGeneratorPackage.PARSER__FILE, null, msgs);
      if (newFile != null)
        msgs = ((InternalEObject)newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSVParserGeneratorPackage.PARSER__FILE, null, msgs);
      msgs = basicSetFile(newFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSVParserGeneratorPackage.PARSER__FILE, newFile, newFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ColDecl> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<ColDecl>(ColDecl.class, this, CSVParserGeneratorPackage.PARSER__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Modification> getMods()
  {
    if (mods == null)
    {
      mods = new EObjectContainmentEList<Modification>(Modification.class, this, CSVParserGeneratorPackage.PARSER__MODS);
    }
    return mods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Output getOut()
  {
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOut(Output newOut, NotificationChain msgs)
  {
    Output oldOut = out;
    out = newOut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSVParserGeneratorPackage.PARSER__OUT, oldOut, newOut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOut(Output newOut)
  {
    if (newOut != out)
    {
      NotificationChain msgs = null;
      if (out != null)
        msgs = ((InternalEObject)out).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSVParserGeneratorPackage.PARSER__OUT, null, msgs);
      if (newOut != null)
        msgs = ((InternalEObject)newOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSVParserGeneratorPackage.PARSER__OUT, null, msgs);
      msgs = basicSetOut(newOut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSVParserGeneratorPackage.PARSER__OUT, newOut, newOut));
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
      case CSVParserGeneratorPackage.PARSER__FILE:
        return basicSetFile(null, msgs);
      case CSVParserGeneratorPackage.PARSER__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
      case CSVParserGeneratorPackage.PARSER__MODS:
        return ((InternalEList<?>)getMods()).basicRemove(otherEnd, msgs);
      case CSVParserGeneratorPackage.PARSER__OUT:
        return basicSetOut(null, msgs);
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
      case CSVParserGeneratorPackage.PARSER__FILE:
        return getFile();
      case CSVParserGeneratorPackage.PARSER__COLUMNS:
        return getColumns();
      case CSVParserGeneratorPackage.PARSER__MODS:
        return getMods();
      case CSVParserGeneratorPackage.PARSER__OUT:
        return getOut();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CSVParserGeneratorPackage.PARSER__FILE:
        setFile((FileDecl)newValue);
        return;
      case CSVParserGeneratorPackage.PARSER__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends ColDecl>)newValue);
        return;
      case CSVParserGeneratorPackage.PARSER__MODS:
        getMods().clear();
        getMods().addAll((Collection<? extends Modification>)newValue);
        return;
      case CSVParserGeneratorPackage.PARSER__OUT:
        setOut((Output)newValue);
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
      case CSVParserGeneratorPackage.PARSER__FILE:
        setFile((FileDecl)null);
        return;
      case CSVParserGeneratorPackage.PARSER__COLUMNS:
        getColumns().clear();
        return;
      case CSVParserGeneratorPackage.PARSER__MODS:
        getMods().clear();
        return;
      case CSVParserGeneratorPackage.PARSER__OUT:
        setOut((Output)null);
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
      case CSVParserGeneratorPackage.PARSER__FILE:
        return file != null;
      case CSVParserGeneratorPackage.PARSER__COLUMNS:
        return columns != null && !columns.isEmpty();
      case CSVParserGeneratorPackage.PARSER__MODS:
        return mods != null && !mods.isEmpty();
      case CSVParserGeneratorPackage.PARSER__OUT:
        return out != null;
    }
    return super.eIsSet(featureID);
  }

} //ParserImpl

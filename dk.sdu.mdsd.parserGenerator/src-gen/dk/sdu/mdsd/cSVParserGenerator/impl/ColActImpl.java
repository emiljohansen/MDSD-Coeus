/**
 * generated by Xtext 2.21.0
 */
package dk.sdu.mdsd.cSVParserGenerator.impl;

import dk.sdu.mdsd.cSVParserGenerator.CSVParserGeneratorPackage;
import dk.sdu.mdsd.cSVParserGenerator.ColAct;
import dk.sdu.mdsd.cSVParserGenerator.ColumnAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Col Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.cSVParserGenerator.impl.ColActImpl#getMods <em>Mods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColActImpl extends ModificationImpl implements ColAct
{
  /**
   * The cached value of the '{@link #getMods() <em>Mods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMods()
   * @generated
   * @ordered
   */
  protected EList<ColumnAction> mods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColActImpl()
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
    return CSVParserGeneratorPackage.Literals.COL_ACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ColumnAction> getMods()
  {
    if (mods == null)
    {
      mods = new EObjectContainmentEList<ColumnAction>(ColumnAction.class, this, CSVParserGeneratorPackage.COL_ACT__MODS);
    }
    return mods;
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
      case CSVParserGeneratorPackage.COL_ACT__MODS:
        return ((InternalEList<?>)getMods()).basicRemove(otherEnd, msgs);
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
      case CSVParserGeneratorPackage.COL_ACT__MODS:
        return getMods();
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
      case CSVParserGeneratorPackage.COL_ACT__MODS:
        getMods().clear();
        getMods().addAll((Collection<? extends ColumnAction>)newValue);
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
      case CSVParserGeneratorPackage.COL_ACT__MODS:
        getMods().clear();
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
      case CSVParserGeneratorPackage.COL_ACT__MODS:
        return mods != null && !mods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ColActImpl

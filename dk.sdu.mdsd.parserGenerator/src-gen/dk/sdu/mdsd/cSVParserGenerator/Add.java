/**
 * generated by Xtext 2.21.0
 */
package dk.sdu.mdsd.cSVParserGenerator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.cSVParserGenerator.Add#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mdsd.cSVParserGenerator.Add#getType <em>Type</em>}</li>
 *   <li>{@link dk.sdu.mdsd.cSVParserGenerator.Add#getMod <em>Mod</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mdsd.cSVParserGenerator.CSVParserGeneratorPackage#getAdd()
 * @model
 * @generated
 */
public interface Add extends ColumnAction
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mdsd.cSVParserGenerator.CSVParserGeneratorPackage#getAdd_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.cSVParserGenerator.Add#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see dk.sdu.mdsd.cSVParserGenerator.CSVParserGeneratorPackage#getAdd_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.cSVParserGenerator.Add#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod</em>' containment reference.
   * @see #setMod(Expression)
   * @see dk.sdu.mdsd.cSVParserGenerator.CSVParserGeneratorPackage#getAdd_Mod()
   * @model containment="true"
   * @generated
   */
  Expression getMod();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.cSVParserGenerator.Add#getMod <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod</em>' containment reference.
   * @see #getMod()
   * @generated
   */
  void setMod(Expression value);

} // Add

/**
 */
package mof;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.Association#getRole <em>Role</em>}</li>
 *   <li>{@link mof.Association#getSourceMultiplicity <em>Source Multiplicity</em>}</li>
 *   <li>{@link mof.Association#getTargetMultiplicity <em>Target Multiplicity</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getAssociation()
 * @model annotation="gmf.link source='source' target='target' label='role' style='solid' source.label='sourceMultiplicity' target.label='targetMultiplicity' tool.name='Association'"
 * @generated
 */
public interface Association extends Relationship {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The default value is <code>"uses"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see mof.MofPackage#getAssociation_Role()
	 * @model default="uses"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link mof.Association#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Source Multiplicity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Multiplicity</em>' attribute.
	 * @see #setSourceMultiplicity(String)
	 * @see mof.MofPackage#getAssociation_SourceMultiplicity()
	 * @model default="1"
	 *        annotation="gmf.label placement='external'"
	 * @generated
	 */
	String getSourceMultiplicity();

	/**
	 * Sets the value of the '{@link mof.Association#getSourceMultiplicity <em>Source Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Multiplicity</em>' attribute.
	 * @see #getSourceMultiplicity()
	 * @generated
	 */
	void setSourceMultiplicity(String value);

	/**
	 * Returns the value of the '<em><b>Target Multiplicity</b></em>' attribute.
	 * The default value is <code>"*"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Multiplicity</em>' attribute.
	 * @see #setTargetMultiplicity(String)
	 * @see mof.MofPackage#getAssociation_TargetMultiplicity()
	 * @model default="*"
	 *        annotation="gmf.label placement='external'"
	 * @generated
	 */
	String getTargetMultiplicity();

	/**
	 * Sets the value of the '{@link mof.Association#getTargetMultiplicity <em>Target Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Multiplicity</em>' attribute.
	 * @see #getTargetMultiplicity()
	 * @generated
	 */
	void setTargetMultiplicity(String value);

} // Association

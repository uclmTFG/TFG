/**
 */
package mof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.Enumeration#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link mof.Enumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getEnumeration()
 * @model annotation="gmf.node label='name' figure='rectangle' color='200,255,200'"
 * @generated
 */
public interface Enumeration extends Classifier {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The default value is <code>"<<enumeration>>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see mof.MofPackage#getEnumeration_Stereotype()
	 * @model default="&lt;&lt;enumeration&gt;&gt;"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link mof.Enumeration#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link mof.EnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see mof.MofPackage#getEnumeration_Literals()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<EnumLiteral> getLiterals();

} // Enumeration

/**
 */
package components;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link components.Dependency#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 *
 * @see components.ComponentsPackage#getDependency()
 * @model annotation="gmf.link source='source' target='target' target.decoration='arrow' style='dash' tool.name='Dependency'"
 * @generated
 */
public interface Dependency extends Relationship {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The default value is <code>"<<use>>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see components.ComponentsPackage#getDependency_Stereotype()
	 * @model default="&lt;&lt;use&gt;&gt;"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link components.Dependency#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

} // Dependency

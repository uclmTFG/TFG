/**
 */
package components;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link components.Package#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see components.ComponentsPackage#getPackage()
 * @model annotation="gmf.node label='name' figure='rectangle'"
 * @generated
 */
public interface Package extends Classifier {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link components.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see components.ComponentsPackage#getPackage_Elements()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Classifier> getElements();

} // Package

/**
 */
package mof;

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
 *   <li>{@link mof.Package#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getPackage()
 * @model annotation="gmf.node label='name' figure='rectangle'"
 * @generated
 */
public interface Package extends Classifier {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link mof.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see mof.MofPackage#getPackage_Elements()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Classifier> getElements();

} // Package

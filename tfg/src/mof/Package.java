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
 *   <li>{@link mof.Package#getNodos <em>Nodos</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getPackage()
 * @model annotation="gmf.node label='nombre' figure='rectangle'"
 * @generated
 */
public interface Package extends Nodo {
	/**
	 * Returns the value of the '<em><b>Nodos</b></em>' containment reference list.
	 * The list contents are of type {@link mof.Nodo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodos</em>' containment reference list.
	 * @see mof.MofPackage#getPackage_Nodos()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Nodo> getNodos();

} // Package

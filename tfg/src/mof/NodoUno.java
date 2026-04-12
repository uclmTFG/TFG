/**
 */
package mof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodo Uno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.NodoUno#getNodosDos <em>Nodos Dos</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getNodoUno()
 * @model annotation="gmf.node label='nombre' figure='rectangle'"
 * @generated
 */
public interface NodoUno extends Nodo {
	/**
	 * Returns the value of the '<em><b>Nodos Dos</b></em>' containment reference list.
	 * The list contents are of type {@link mof.NodoDos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodos Dos</em>' containment reference list.
	 * @see mof.MofPackage#getNodoUno_NodosDos()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<NodoDos> getNodosDos();

} // NodoUno

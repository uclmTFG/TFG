/**
 */
package mof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodo Dos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.NodoDos#getAtributometodo <em>Atributometodo</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getNodoDos()
 * @model annotation="gmf.node label='nombre'"
 * @generated
 */
public interface NodoDos extends Nodo {
	/**
	 * Returns the value of the '<em><b>Atributometodo</b></em>' containment reference list.
	 * The list contents are of type {@link mof.AtributosMetodos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributometodo</em>' containment reference list.
	 * @see mof.MofPackage#getNodoDos_Atributometodo()
	 * @model containment="true"
	 *        annotation="gmf.compartiment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<AtributosMetodos> getAtributometodo();

} // NodoDos

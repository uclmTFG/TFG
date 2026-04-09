/**
 */
package mof;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enlace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.Enlace#getOrigen <em>Origen</em>}</li>
 *   <li>{@link mof.Enlace#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getEnlace()
 * @model annotation="gmf.link source='origen' target='destino' style='solid' target.decoration='arrow'"
 * @generated
 */
public interface Enlace extends EObject {
	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Nodo)
	 * @see mof.MofPackage#getEnlace_Origen()
	 * @model required="true"
	 * @generated
	 */
	Nodo getOrigen();

	/**
	 * Sets the value of the '{@link mof.Enlace#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Nodo value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Nodo)
	 * @see mof.MofPackage#getEnlace_Destino()
	 * @model required="true"
	 * @generated
	 */
	Nodo getDestino();

	/**
	 * Sets the value of the '{@link mof.Enlace#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Nodo value);

} // Enlace

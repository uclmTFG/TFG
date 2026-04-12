/**
 */
package mof;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.Nodo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link mof.Nodo#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getNodo()
 * @model abstract="true"
 * @generated
 */
public interface Nodo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see mof.MofPackage#getNodo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link mof.Nodo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"Blanco"</code>.
	 * The literals are from the enumeration {@link mof.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see mof.Color
	 * @see #setColor(Color)
	 * @see mof.MofPackage#getNodo_Color()
	 * @model default="Blanco"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link mof.Nodo#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see mof.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // Nodo

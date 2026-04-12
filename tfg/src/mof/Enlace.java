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
 *   <li>{@link mof.Enlace#getTexto <em>Texto</em>}</li>
 *   <li>{@link mof.Enlace#getOrigen <em>Origen</em>}</li>
 *   <li>{@link mof.Enlace#getDestino <em>Destino</em>}</li>
 *   <li>{@link mof.Enlace#getLinea <em>Linea</em>}</li>
 *   <li>{@link mof.Enlace#getTextoExtremoOrigen <em>Texto Extremo Origen</em>}</li>
 *   <li>{@link mof.Enlace#getTextoExtremoDestino <em>Texto Extremo Destino</em>}</li>
 *   <li>{@link mof.Enlace#getFormaExtremoOrigen <em>Forma Extremo Origen</em>}</li>
 *   <li>{@link mof.Enlace#getFormaExtremoDestino <em>Forma Extremo Destino</em>}</li>
 *   <li>{@link mof.Enlace#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getEnlace()
 * @model annotation="gmf.link source='origen' target='destino' style='solid' target.decoration='arrow' label='texto'"
 * @generated
 */
public interface Enlace extends EObject {
	/**
	 * Returns the value of the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texto</em>' attribute.
	 * @see #setTexto(String)
	 * @see mof.MofPackage#getEnlace_Texto()
	 * @model
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link mof.Enlace#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

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

	/**
	 * Returns the value of the '<em><b>Linea</b></em>' attribute.
	 * The default value is <code>"Continua"</code>.
	 * The literals are from the enumeration {@link mof.Linea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linea</em>' attribute.
	 * @see mof.Linea
	 * @see #setLinea(Linea)
	 * @see mof.MofPackage#getEnlace_Linea()
	 * @model default="Continua"
	 * @generated
	 */
	Linea getLinea();

	/**
	 * Sets the value of the '{@link mof.Enlace#getLinea <em>Linea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linea</em>' attribute.
	 * @see mof.Linea
	 * @see #getLinea()
	 * @generated
	 */
	void setLinea(Linea value);

	/**
	 * Returns the value of the '<em><b>Texto Extremo Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texto Extremo Origen</em>' attribute.
	 * @see #setTextoExtremoOrigen(String)
	 * @see mof.MofPackage#getEnlace_TextoExtremoOrigen()
	 * @model
	 * @generated
	 */
	String getTextoExtremoOrigen();

	/**
	 * Sets the value of the '{@link mof.Enlace#getTextoExtremoOrigen <em>Texto Extremo Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto Extremo Origen</em>' attribute.
	 * @see #getTextoExtremoOrigen()
	 * @generated
	 */
	void setTextoExtremoOrigen(String value);

	/**
	 * Returns the value of the '<em><b>Texto Extremo Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texto Extremo Destino</em>' attribute.
	 * @see #setTextoExtremoDestino(String)
	 * @see mof.MofPackage#getEnlace_TextoExtremoDestino()
	 * @model
	 * @generated
	 */
	String getTextoExtremoDestino();

	/**
	 * Sets the value of the '{@link mof.Enlace#getTextoExtremoDestino <em>Texto Extremo Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto Extremo Destino</em>' attribute.
	 * @see #getTextoExtremoDestino()
	 * @generated
	 */
	void setTextoExtremoDestino(String value);

	/**
	 * Returns the value of the '<em><b>Forma Extremo Origen</b></em>' attribute.
	 * The default value is <code>"Ninguna"</code>.
	 * The literals are from the enumeration {@link mof.FormaExtremoOrigen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forma Extremo Origen</em>' attribute.
	 * @see mof.FormaExtremoOrigen
	 * @see #setFormaExtremoOrigen(FormaExtremoOrigen)
	 * @see mof.MofPackage#getEnlace_FormaExtremoOrigen()
	 * @model default="Ninguna"
	 * @generated
	 */
	FormaExtremoOrigen getFormaExtremoOrigen();

	/**
	 * Sets the value of the '{@link mof.Enlace#getFormaExtremoOrigen <em>Forma Extremo Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forma Extremo Origen</em>' attribute.
	 * @see mof.FormaExtremoOrigen
	 * @see #getFormaExtremoOrigen()
	 * @generated
	 */
	void setFormaExtremoOrigen(FormaExtremoOrigen value);

	/**
	 * Returns the value of the '<em><b>Forma Extremo Destino</b></em>' attribute.
	 * The default value is <code>"Ninguna"</code>.
	 * The literals are from the enumeration {@link mof.FormaExtremoDestino}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forma Extremo Destino</em>' attribute.
	 * @see mof.FormaExtremoDestino
	 * @see #setFormaExtremoDestino(FormaExtremoDestino)
	 * @see mof.MofPackage#getEnlace_FormaExtremoDestino()
	 * @model default="Ninguna"
	 * @generated
	 */
	FormaExtremoDestino getFormaExtremoDestino();

	/**
	 * Sets the value of the '{@link mof.Enlace#getFormaExtremoDestino <em>Forma Extremo Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forma Extremo Destino</em>' attribute.
	 * @see mof.FormaExtremoDestino
	 * @see #getFormaExtremoDestino()
	 * @generated
	 */
	void setFormaExtremoDestino(FormaExtremoDestino value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"Blanco"</code>.
	 * The literals are from the enumeration {@link mof.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see mof.Color
	 * @see #setColor(Color)
	 * @see mof.MofPackage#getEnlace_Color()
	 * @model default="Blanco"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link mof.Enlace#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see mof.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // Enlace

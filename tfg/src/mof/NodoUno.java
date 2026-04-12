/**
 */
package mof;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodo Uno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.NodoUno#getForma <em>Forma</em>}</li>
 *   <li>{@link mof.NodoUno#getColorBorde <em>Color Borde</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getNodoUno()
 * @model annotation="gmf.node label='nombre'"
 * @generated
 */
public interface NodoUno extends Nodo {
	/**
	 * Returns the value of the '<em><b>Forma</b></em>' attribute.
	 * The default value is <code>"Rectangulo"</code>.
	 * The literals are from the enumeration {@link mof.Forma}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forma</em>' attribute.
	 * @see mof.Forma
	 * @see #setForma(Forma)
	 * @see mof.MofPackage#getNodoUno_Forma()
	 * @model default="Rectangulo"
	 * @generated
	 */
	Forma getForma();

	/**
	 * Sets the value of the '{@link mof.NodoUno#getForma <em>Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forma</em>' attribute.
	 * @see mof.Forma
	 * @see #getForma()
	 * @generated
	 */
	void setForma(Forma value);

	/**
	 * Returns the value of the '<em><b>Color Borde</b></em>' attribute.
	 * The default value is <code>"Blanco"</code>.
	 * The literals are from the enumeration {@link mof.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Borde</em>' attribute.
	 * @see mof.Color
	 * @see #setColorBorde(Color)
	 * @see mof.MofPackage#getNodoUno_ColorBorde()
	 * @model default="Blanco"
	 * @generated
	 */
	Color getColorBorde();

	/**
	 * Sets the value of the '{@link mof.NodoUno#getColorBorde <em>Color Borde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Borde</em>' attribute.
	 * @see mof.Color
	 * @see #getColorBorde()
	 * @generated
	 */
	void setColorBorde(Color value);

} // NodoUno

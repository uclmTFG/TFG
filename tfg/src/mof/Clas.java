/**
 */
package mof;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.Clas#getColor <em>Color</em>}</li>
 *   <li>{@link mof.Clas#getColorborde <em>Colorborde</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getClas()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Clas extends Nodeone {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"Blanco"</code>.
	 * The literals are from the enumeration {@link mof.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see mof.Color
	 * @see #setColor(Color)
	 * @see mof.MofPackage#getClas_Color()
	 * @model default="Blanco"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link mof.Clas#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see mof.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Colorborde</b></em>' attribute.
	 * The default value is <code>"Blanco"</code>.
	 * The literals are from the enumeration {@link mof.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colorborde</em>' attribute.
	 * @see mof.Color
	 * @see #setColorborde(Color)
	 * @see mof.MofPackage#getClas_Colorborde()
	 * @model default="Blanco"
	 * @generated
	 */
	Color getColorborde();

	/**
	 * Sets the value of the '{@link mof.Clas#getColorborde <em>Colorborde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colorborde</em>' attribute.
	 * @see mof.Color
	 * @see #getColorborde()
	 * @generated
	 */
	void setColorborde(Color value);

} // Clas

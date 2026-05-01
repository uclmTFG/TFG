/**
 */
package mof;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodo Dos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.NodoDos#getForma <em>Forma</em>}</li>
 *   <li>{@link mof.NodoDos#getLinea <em>Linea</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getNodoDos()
 * @model annotation="gmf.node label='nombre'"
 * @generated
 */
public interface NodoDos extends Nodo {
	/**
	 * Returns the value of the '<em><b>Forma</b></em>' attribute.
	 * The default value is <code>"Rectangulo"</code>.
	 * The literals are from the enumeration {@link mof.Forma}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forma</em>' attribute.
	 * @see mof.Forma
	 * @see #setForma(Forma)
	 * @see mof.MofPackage#getNodoDos_Forma()
	 * @model default="Rectangulo"
	 * @generated
	 */
	Forma getForma();

	/**
	 * Sets the value of the '{@link mof.NodoDos#getForma <em>Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forma</em>' attribute.
	 * @see mof.Forma
	 * @see #getForma()
	 * @generated
	 */
	void setForma(Forma value);

	/**
	 * Returns the value of the '<em><b>Linea</b></em>' attribute.
	 * The default value is <code>"Continua"</code>.
	 * The literals are from the enumeration {@link mof.Linea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linea</em>' attribute.
	 * @see mof.Linea
	 * @see #setLinea(Linea)
	 * @see mof.MofPackage#getNodoDos_Linea()
	 * @model default="Continua"
	 * @generated
	 */
	Linea getLinea();

	/**
	 * Sets the value of the '{@link mof.NodoDos#getLinea <em>Linea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linea</em>' attribute.
	 * @see mof.Linea
	 * @see #getLinea()
	 * @generated
	 */
	void setLinea(Linea value);

} // NodoDos

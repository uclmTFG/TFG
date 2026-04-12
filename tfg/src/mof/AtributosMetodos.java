/**
 */
package mof;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributos Metodos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.AtributosMetodos#getTipo <em>Tipo</em>}</li>
 *   <li>{@link mof.AtributosMetodos#getVisibilidad <em>Visibilidad</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getAtributosMetodos()
 * @model annotation="gmf.node label='nombre'"
 * @generated
 */
public interface AtributosMetodos extends Nodo {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The default value is <code>"Atributo"</code>.
	 * The literals are from the enumeration {@link mof.Tipo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see mof.Tipo
	 * @see #setTipo(Tipo)
	 * @see mof.MofPackage#getAtributosMetodos_Tipo()
	 * @model default="Atributo"
	 * @generated
	 */
	Tipo getTipo();

	/**
	 * Sets the value of the '{@link mof.AtributosMetodos#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see mof.Tipo
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(Tipo value);

	/**
	 * Returns the value of the '<em><b>Visibilidad</b></em>' attribute.
	 * The default value is <code>"Publico"</code>.
	 * The literals are from the enumeration {@link mof.Visibilidad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibilidad</em>' attribute.
	 * @see mof.Visibilidad
	 * @see #setVisibilidad(Visibilidad)
	 * @see mof.MofPackage#getAtributosMetodos_Visibilidad()
	 * @model default="Publico"
	 * @generated
	 */
	Visibilidad getVisibilidad();

	/**
	 * Sets the value of the '{@link mof.AtributosMetodos#getVisibilidad <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilidad</em>' attribute.
	 * @see mof.Visibilidad
	 * @see #getVisibilidad()
	 * @generated
	 */
	void setVisibilidad(Visibilidad value);

} // AtributosMetodos

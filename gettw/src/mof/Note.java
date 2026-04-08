/**
 */
package mof;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.Note#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getNote()
 * @model annotation="gmf.node label='text' figure='polygon' polygon.x='0 80 100 100 0' polygon.y='0 0 20 100 100' color='255,255,200'"
 * @generated
 */
public interface Note extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"Contenido de tu nota..."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see mof.MofPackage#getNote_Text()
	 * @model default="Contenido de tu nota..."
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link mof.Note#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Note

/**
 */
package mof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.Clas#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link mof.Clas#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link mof.Clas#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getClas()
 * @model annotation="gmf.node label='name' figure='rectangle' border.color='0,0,0'"
 * @generated
 */
public interface Clas extends Classifier {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The default value is <code>"<<class>>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see mof.MofPackage#getClas_Stereotype()
	 * @model default="&lt;&lt;class&gt;&gt;"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link mof.Clas#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link mof.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see mof.MofPackage#getClas_Attributes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<Property> getAttributes();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link mof.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see mof.MofPackage#getClas_Operations()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<Method> getOperations();

} // Clas

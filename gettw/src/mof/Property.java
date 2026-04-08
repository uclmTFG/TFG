/**
 */
package mof;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.Property#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link mof.Property#getName <em>Name</em>}</li>
 *   <li>{@link mof.Property#getType <em>Type</em>}</li>
 *   <li>{@link mof.Property#isIsStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getProperty()
 * @model annotation="gmf.node label='visibility,name,type' label.view='{0}{1} : {2}' label.edit='{1}:{2}' figure='rectangle' tool.name='Attribute'"
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"public"</code>.
	 * The literals are from the enumeration {@link mof.Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see mof.Visibility
	 * @see #setVisibility(Visibility)
	 * @see mof.MofPackage#getProperty_Visibility()
	 * @model default="public"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link mof.Property#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see mof.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"attribute"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mof.MofPackage#getProperty_Name()
	 * @model default="attribute"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mof.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"String"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mof.MofPackage#getProperty_Type()
	 * @model default="String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mof.Property#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see mof.MofPackage#getProperty_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link mof.Property#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

} // Property

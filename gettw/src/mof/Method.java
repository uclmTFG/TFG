/**
 */
package mof;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.Method#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link mof.Method#getName <em>Name</em>}</li>
 *   <li>{@link mof.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link mof.Method#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getMethod()
 * @model annotation="gmf.node label='visibility,name, returnType' label.view='{0}{1}{2}()' figure='rectangle' tool.name='Operation'"
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"public"</code>.
	 * The literals are from the enumeration {@link mof.Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see mof.Visibility
	 * @see #setVisibility(Visibility)
	 * @see mof.MofPackage#getMethod_Visibility()
	 * @model default="public"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link mof.Method#getVisibility <em>Visibility</em>}' attribute.
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
	 * The default value is <code>"operation"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mof.MofPackage#getMethod_Name()
	 * @model default="operation"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mof.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The default value is <code>"void"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see mof.MofPackage#getMethod_ReturnType()
	 * @model default="void"
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link mof.Method#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link mof.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see mof.MofPackage#getMethod_Parameter()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // Method

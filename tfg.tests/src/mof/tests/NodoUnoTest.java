/**
 */
package mof.tests;

import junit.textui.TestRunner;

import mof.MofFactory;
import mof.NodoUno;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nodo Uno</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodoUnoTest extends NodoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodoUnoTest.class);
	}

	/**
	 * Constructs a new Nodo Uno test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodoUnoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Nodo Uno test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NodoUno getFixture() {
		return (NodoUno)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MofFactory.eINSTANCE.createNodoUno());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NodoUnoTest

/**
 */
package mof.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mof.MofFactory;
import mof.Nodo;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nodo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodoTest extends TestCase {

	/**
	 * The fixture for this Nodo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nodo fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodoTest.class);
	}

	/**
	 * Constructs a new Nodo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Nodo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Nodo fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Nodo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nodo getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MofFactory.eINSTANCE.createNodo());
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

} //NodoTest

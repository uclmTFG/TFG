/**
 */
package mof.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mof.MofFactory;
import mof.UMLDiagram;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UML Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLDiagramTest extends TestCase {

	/**
	 * The fixture for this UML Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLDiagram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UMLDiagramTest.class);
	}

	/**
	 * Constructs a new UML Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLDiagramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this UML Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UMLDiagram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this UML Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLDiagram getFixture() {
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
		setFixture(MofFactory.eINSTANCE.createUMLDiagram());
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

} //UMLDiagramTest

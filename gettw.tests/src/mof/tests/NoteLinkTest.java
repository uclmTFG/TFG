/**
 */
package mof.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mof.MofFactory;
import mof.NoteLink;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Note Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NoteLinkTest extends TestCase {

	/**
	 * The fixture for this Note Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteLink fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NoteLinkTest.class);
	}

	/**
	 * Constructs a new Note Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteLinkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Note Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NoteLink fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Note Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteLink getFixture() {
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
		setFixture(MofFactory.eINSTANCE.createNoteLink());
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

} //NoteLinkTest

/**
 */
package MyER.tests;

import MyER.ClaveAjena;
import MyER.MyERFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clave Ajena</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClaveAjenaTest extends TestCase {

	/**
	 * The fixture for this Clave Ajena test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaveAjena fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClaveAjenaTest.class);
	}

	/**
	 * Constructs a new Clave Ajena test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaveAjenaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Clave Ajena test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ClaveAjena fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Clave Ajena test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaveAjena getFixture() {
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
		setFixture(MyERFactory.eINSTANCE.createClaveAjena());
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

} //ClaveAjenaTest

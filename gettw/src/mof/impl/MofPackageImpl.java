/**
 */
package mof.impl;

import mof.Aggregation;
import mof.Association;
import mof.Clas;
import mof.Classifier;
import mof.Composition;
import mof.Dependency;
import mof.EnumLiteral;
import mof.Enumeration;
import mof.Generalization;
import mof.Implementation;
import mof.Interface;
import mof.Method;
import mof.MofFactory;
import mof.MofPackage;
import mof.Note;
import mof.NoteLink;
import mof.Parameter;
import mof.Property;
import mof.Relationship;
import mof.UMLDiagram;
import mof.Visibility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MofPackageImpl extends EPackageImpl implements MofPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mof.MofPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MofPackageImpl() {
		super(eNS_URI, MofFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MofPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MofPackage init() {
		if (isInited) return (MofPackage)EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMofPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MofPackageImpl theMofPackage = registeredMofPackage instanceof MofPackageImpl ? (MofPackageImpl)registeredMofPackage : new MofPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMofPackage.createPackageContents();

		// Initialize created meta-data
		theMofPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMofPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MofPackage.eNS_URI, theMofPackage);
		return theMofPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLDiagram() {
		return umlDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLDiagram_Elements() {
		return (EReference)umlDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLDiagram_Links() {
		return (EReference)umlDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLDiagram_Notes() {
		return (EReference)umlDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLDiagram_NoteLinks() {
		return (EReference)umlDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassifier_Name() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassifier_IsAbstract() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Elements() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClas() {
		return clasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClas_Stereotype() {
		return (EAttribute)clasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClas_Attributes() {
		return (EReference)clasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClas_Operations() {
		return (EReference)clasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterface_Stereotype() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface_Operations() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumeration_Stereotype() {
		return (EAttribute)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeration_Literals() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumLiteral() {
		return enumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumLiteral_Name() {
		return (EAttribute)enumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Visibility() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Type() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_IsStatic() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethod_Visibility() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethod_Name() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethod_ReturnType() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethod_Parameter() {
		return (EReference)methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_Role() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_SourceMultiplicity() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_TargetMultiplicity() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAggregation() {
		return aggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependency_Stereotype() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Text() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoteLink() {
		return noteLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNoteLink_Note() {
		return (EReference)noteLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNoteLink_Element() {
		return (EReference)noteLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MofFactory getMofFactory() {
		return (MofFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		umlDiagramEClass = createEClass(UML_DIAGRAM);
		createEReference(umlDiagramEClass, UML_DIAGRAM__ELEMENTS);
		createEReference(umlDiagramEClass, UML_DIAGRAM__LINKS);
		createEReference(umlDiagramEClass, UML_DIAGRAM__NOTES);
		createEReference(umlDiagramEClass, UML_DIAGRAM__NOTE_LINKS);

		classifierEClass = createEClass(CLASSIFIER);
		createEAttribute(classifierEClass, CLASSIFIER__NAME);
		createEAttribute(classifierEClass, CLASSIFIER__IS_ABSTRACT);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__ELEMENTS);

		clasEClass = createEClass(CLAS);
		createEAttribute(clasEClass, CLAS__STEREOTYPE);
		createEReference(clasEClass, CLAS__ATTRIBUTES);
		createEReference(clasEClass, CLAS__OPERATIONS);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__STEREOTYPE);
		createEReference(interfaceEClass, INTERFACE__OPERATIONS);

		enumerationEClass = createEClass(ENUMERATION);
		createEAttribute(enumerationEClass, ENUMERATION__STEREOTYPE);
		createEReference(enumerationEClass, ENUMERATION__LITERALS);

		enumLiteralEClass = createEClass(ENUM_LITERAL);
		createEAttribute(enumLiteralEClass, ENUM_LITERAL__NAME);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__VISIBILITY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__TYPE);
		createEAttribute(propertyEClass, PROPERTY__IS_STATIC);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__VISIBILITY);
		createEAttribute(methodEClass, METHOD__NAME);
		createEAttribute(methodEClass, METHOD__RETURN_TYPE);
		createEReference(methodEClass, METHOD__PARAMETER);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);

		generalizationEClass = createEClass(GENERALIZATION);

		implementationEClass = createEClass(IMPLEMENTATION);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__ROLE);
		createEAttribute(associationEClass, ASSOCIATION__SOURCE_MULTIPLICITY);
		createEAttribute(associationEClass, ASSOCIATION__TARGET_MULTIPLICITY);

		aggregationEClass = createEClass(AGGREGATION);

		compositionEClass = createEClass(COMPOSITION);

		dependencyEClass = createEClass(DEPENDENCY);
		createEAttribute(dependencyEClass, DEPENDENCY__STEREOTYPE);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__TEXT);

		noteLinkEClass = createEClass(NOTE_LINK);
		createEReference(noteLinkEClass, NOTE_LINK__NOTE);
		createEReference(noteLinkEClass, NOTE_LINK__ELEMENT);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		packageEClass.getESuperTypes().add(this.getClassifier());
		clasEClass.getESuperTypes().add(this.getClassifier());
		interfaceEClass.getESuperTypes().add(this.getClassifier());
		enumerationEClass.getESuperTypes().add(this.getClassifier());
		generalizationEClass.getESuperTypes().add(this.getRelationship());
		implementationEClass.getESuperTypes().add(this.getRelationship());
		associationEClass.getESuperTypes().add(this.getRelationship());
		aggregationEClass.getESuperTypes().add(this.getRelationship());
		compositionEClass.getESuperTypes().add(this.getRelationship());
		dependencyEClass.getESuperTypes().add(this.getRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(umlDiagramEClass, UMLDiagram.class, "UMLDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLDiagram_Elements(), this.getClassifier(), null, "elements", null, 0, -1, UMLDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLDiagram_Links(), this.getRelationship(), null, "links", null, 0, -1, UMLDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLDiagram_Notes(), this.getNote(), null, "notes", null, 0, -1, UMLDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLDiagram_NoteLinks(), this.getNoteLink(), null, "noteLinks", null, 0, -1, UMLDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifier_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, mof.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Elements(), this.getClassifier(), null, "elements", null, 0, -1, mof.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clasEClass, Clas.class, "Clas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClas_Stereotype(), ecorePackage.getEString(), "stereotype", "<<class>>", 0, 1, Clas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClas_Attributes(), this.getProperty(), null, "attributes", null, 0, -1, Clas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClas_Operations(), this.getMethod(), null, "operations", null, 0, -1, Clas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_Stereotype(), ecorePackage.getEString(), "stereotype", "<<interface>>", 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Operations(), this.getMethod(), null, "operations", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumeration_Stereotype(), ecorePackage.getEString(), "stereotype", "<<enumeration>>", 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeration_Literals(), this.getEnumLiteral(), null, "literals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Visibility(), this.getVisibility(), "visibility", "public", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", "attribute", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Type(), ecorePackage.getEString(), "type", "String", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Visibility(), this.getVisibility(), "visibility", "public", 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", "operation", 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_ReturnType(), ecorePackage.getEString(), "returnType", "void", 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Source(), this.getClassifier(), null, "source", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target(), this.getClassifier(), null, "target", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_Role(), ecorePackage.getEString(), "role", "uses", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_SourceMultiplicity(), ecorePackage.getEString(), "sourceMultiplicity", "1", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_TargetMultiplicity(), ecorePackage.getEString(), "targetMultiplicity", "*", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationEClass, Aggregation.class, "Aggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependency_Stereotype(), ecorePackage.getEString(), "stereotype", "<<use>>", 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Text(), ecorePackage.getEString(), "text", "Contenido de tu nota...", 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteLinkEClass, NoteLink.class, "NoteLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNoteLink_Note(), this.getNote(), null, "note", null, 1, 1, NoteLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNoteLink_Element(), this.getClassifier(), null, "element", null, 1, 1, NoteLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
		addEEnumLiteral(visibilityEEnum, Visibility.PROTECTED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
		// gmf.label
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (umlDiagramEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (packageEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "rectangle"
		   });
		addAnnotation
		  (clasEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "rectangle",
			   "border.color", "0,0,0"
		   });
		addAnnotation
		  (interfaceEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "rectangle",
			   "border.color", "0,0,0",
			   "color", "240,240,240"
		   });
		addAnnotation
		  (enumerationEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "rectangle",
			   "color", "200,255,200"
		   });
		addAnnotation
		  (enumLiteralEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
		addAnnotation
		  (propertyEClass,
		   source,
		   new String[] {
			   "label", "visibility,name,type",
			   "label.view", "{0}{1} : {2}",
			   "label.edit", "{1}:{2}",
			   "figure", "rectangle",
			   "tool.name", "Attribute"
		   });
		addAnnotation
		  (methodEClass,
		   source,
		   new String[] {
			   "label", "visibility,name, returnType",
			   "label.view", "{0}{1}{2}()",
			   "figure", "rectangle",
			   "tool.name", "Operation"
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "label", "name,type",
			   "label.view", "{0} : {1}",
			   "tool.name", "Parameter"
		   });
		addAnnotation
		  (noteEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "figure", "polygon",
			   "polygon.x", "0 80 100 100 0",
			   "polygon.y", "0 0 20 100 100",
			   "color", "255,255,200"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getPackage_Elements(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getClas_Attributes(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getClas_Operations(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getInterface_Operations(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "true"
		   });
		addAnnotation
		  (getEnumeration_Literals(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getMethod_Parameter(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (generalizationEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "target.decoration", "closedarrow",
			   "style", "solid",
			   "tool.name", "Generatization"
		   });
		addAnnotation
		  (implementationEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "target.decoration", "closedarrow",
			   "style", "dash",
			   "tool.name", "Interface Realization"
		   });
		addAnnotation
		  (associationEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "label", "role",
			   "style", "solid",
			   "source.label", "sourceMultiplicity",
			   "target.label", "targetMultiplicity",
			   "tool.name", "Association"
		   });
		addAnnotation
		  (aggregationEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "source.decoration", "rhomb",
			   "style", "solid",
			   "tool.name", "Aggregation"
		   });
		addAnnotation
		  (compositionEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "source.decoration", "filledrhomb",
			   "style", "solid",
			   "tool.name", "Composition"
		   });
		addAnnotation
		  (dependencyEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "target.decoration", "arrow",
			   "style", "dash",
			   "tool.name", "Dependency"
		   });
		addAnnotation
		  (noteLinkEClass,
		   source,
		   new String[] {
			   "source", "note",
			   "target", "element",
			   "style", "dash",
			   "color", "150,150,150",
			   "tool.name", "Note Link"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.label</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.label";
		addAnnotation
		  (getAssociation_SourceMultiplicity(),
		   source,
		   new String[] {
			   "placement", "external"
		   });
		addAnnotation
		  (getAssociation_TargetMultiplicity(),
		   source,
		   new String[] {
			   "placement", "external"
		   });
	}

} //MofPackageImpl

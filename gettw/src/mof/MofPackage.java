/**
 */
package mof;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mof.MofFactory
 * @model kind="package"
 * @generated
 */
public interface MofPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mof";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mof";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mof";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MofPackage eINSTANCE = mof.impl.MofPackageImpl.init();

	/**
	 * The meta object id for the '{@link mof.impl.UMLDiagramImpl <em>UML Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.UMLDiagramImpl
	 * @see mof.impl.MofPackageImpl#getUMLDiagram()
	 * @generated
	 */
	int UML_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__LINKS = 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__NOTES = 2;

	/**
	 * The feature id for the '<em><b>Note Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__NOTE_LINKS = 3;

	/**
	 * The number of structural features of the '<em>UML Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mof.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.ClassifierImpl
	 * @see mof.impl.MofPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_ABSTRACT = 1;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mof.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.PackageImpl
	 * @see mof.impl.MofPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENTS = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mof.impl.ClasImpl <em>Clas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.ClasImpl
	 * @see mof.impl.MofPackageImpl#getClas()
	 * @generated
	 */
	int CLAS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAS__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAS__STEREOTYPE = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAS__ATTRIBUTES = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAS__OPERATIONS = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Clas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mof.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.InterfaceImpl
	 * @see mof.impl.MofPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__STEREOTYPE = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERATIONS = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mof.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.EnumerationImpl
	 * @see mof.impl.MofPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__STEREOTYPE = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mof.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.EnumLiteralImpl
	 * @see mof.impl.MofPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mof.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.PropertyImpl
	 * @see mof.impl.MofPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VISIBILITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_STATIC = 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mof.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.MethodImpl
	 * @see mof.impl.MofPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 8;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETER = 3;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mof.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.ParameterImpl
	 * @see mof.impl.MofPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mof.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.RelationshipImpl
	 * @see mof.impl.MofPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mof.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.GeneralizationImpl
	 * @see mof.impl.MofPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mof.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.ImplementationImpl
	 * @see mof.impl.MofPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mof.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.AssociationImpl
	 * @see mof.impl.MofPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ROLE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_MULTIPLICITY = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_MULTIPLICITY = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mof.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.AggregationImpl
	 * @see mof.impl.MofPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mof.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.CompositionImpl
	 * @see mof.impl.MofPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mof.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.DependencyImpl
	 * @see mof.impl.MofPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__STEREOTYPE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mof.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.NoteImpl
	 * @see mof.impl.MofPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 17;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mof.impl.NoteLinkImpl <em>Note Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.NoteLinkImpl
	 * @see mof.impl.MofPackageImpl#getNoteLink()
	 * @generated
	 */
	int NOTE_LINK = 18;

	/**
	 * The feature id for the '<em><b>Note</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_LINK__NOTE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_LINK__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Note Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mof.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.Visibility
	 * @see mof.impl.MofPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 19;


	/**
	 * Returns the meta object for class '{@link mof.UMLDiagram <em>UML Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Diagram</em>'.
	 * @see mof.UMLDiagram
	 * @generated
	 */
	EClass getUMLDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.UMLDiagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see mof.UMLDiagram#getElements()
	 * @see #getUMLDiagram()
	 * @generated
	 */
	EReference getUMLDiagram_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.UMLDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see mof.UMLDiagram#getLinks()
	 * @see #getUMLDiagram()
	 * @generated
	 */
	EReference getUMLDiagram_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.UMLDiagram#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see mof.UMLDiagram#getNotes()
	 * @see #getUMLDiagram()
	 * @generated
	 */
	EReference getUMLDiagram_Notes();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.UMLDiagram#getNoteLinks <em>Note Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note Links</em>'.
	 * @see mof.UMLDiagram#getNoteLinks()
	 * @see #getUMLDiagram()
	 * @generated
	 */
	EReference getUMLDiagram_NoteLinks();

	/**
	 * Returns the meta object for class '{@link mof.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see mof.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link mof.Classifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mof.Classifier#getName()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Name();

	/**
	 * Returns the meta object for the attribute '{@link mof.Classifier#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see mof.Classifier#isIsAbstract()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsAbstract();

	/**
	 * Returns the meta object for class '{@link mof.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see mof.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.Package#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see mof.Package#getElements()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Elements();

	/**
	 * Returns the meta object for class '{@link mof.Clas <em>Clas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clas</em>'.
	 * @see mof.Clas
	 * @generated
	 */
	EClass getClas();

	/**
	 * Returns the meta object for the attribute '{@link mof.Clas#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see mof.Clas#getStereotype()
	 * @see #getClas()
	 * @generated
	 */
	EAttribute getClas_Stereotype();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.Clas#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see mof.Clas#getAttributes()
	 * @see #getClas()
	 * @generated
	 */
	EReference getClas_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.Clas#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see mof.Clas#getOperations()
	 * @see #getClas()
	 * @generated
	 */
	EReference getClas_Operations();

	/**
	 * Returns the meta object for class '{@link mof.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see mof.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link mof.Interface#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see mof.Interface#getStereotype()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Stereotype();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.Interface#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see mof.Interface#getOperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Operations();

	/**
	 * Returns the meta object for class '{@link mof.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see mof.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link mof.Enumeration#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see mof.Enumeration#getStereotype()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Stereotype();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see mof.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link mof.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see mof.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link mof.EnumLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mof.EnumLiteral#getName()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_Name();

	/**
	 * Returns the meta object for class '{@link mof.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see mof.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link mof.Property#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see mof.Property#getVisibility()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link mof.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mof.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link mof.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mof.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link mof.Property#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see mof.Property#isIsStatic()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsStatic();

	/**
	 * Returns the meta object for class '{@link mof.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see mof.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link mof.Method#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see mof.Method#getVisibility()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link mof.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mof.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link mof.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see mof.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.Method#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see mof.Method#getParameter()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameter();

	/**
	 * Returns the meta object for class '{@link mof.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see mof.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link mof.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mof.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link mof.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mof.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link mof.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see mof.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link mof.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see mof.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link mof.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see mof.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for class '{@link mof.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see mof.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for class '{@link mof.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see mof.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for class '{@link mof.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see mof.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link mof.Association#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see mof.Association#getRole()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Role();

	/**
	 * Returns the meta object for the attribute '{@link mof.Association#getSourceMultiplicity <em>Source Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Multiplicity</em>'.
	 * @see mof.Association#getSourceMultiplicity()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_SourceMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link mof.Association#getTargetMultiplicity <em>Target Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Multiplicity</em>'.
	 * @see mof.Association#getTargetMultiplicity()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetMultiplicity();

	/**
	 * Returns the meta object for class '{@link mof.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see mof.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for class '{@link mof.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see mof.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for class '{@link mof.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see mof.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link mof.Dependency#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see mof.Dependency#getStereotype()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Stereotype();

	/**
	 * Returns the meta object for class '{@link mof.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see mof.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link mof.Note#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see mof.Note#getText()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Text();

	/**
	 * Returns the meta object for class '{@link mof.NoteLink <em>Note Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note Link</em>'.
	 * @see mof.NoteLink
	 * @generated
	 */
	EClass getNoteLink();

	/**
	 * Returns the meta object for the reference '{@link mof.NoteLink#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Note</em>'.
	 * @see mof.NoteLink#getNote()
	 * @see #getNoteLink()
	 * @generated
	 */
	EReference getNoteLink_Note();

	/**
	 * Returns the meta object for the reference '{@link mof.NoteLink#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see mof.NoteLink#getElement()
	 * @see #getNoteLink()
	 * @generated
	 */
	EReference getNoteLink_Element();

	/**
	 * Returns the meta object for enum '{@link mof.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see mof.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MofFactory getMofFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mof.impl.UMLDiagramImpl <em>UML Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.UMLDiagramImpl
		 * @see mof.impl.MofPackageImpl#getUMLDiagram()
		 * @generated
		 */
		EClass UML_DIAGRAM = eINSTANCE.getUMLDiagram();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DIAGRAM__ELEMENTS = eINSTANCE.getUMLDiagram_Elements();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DIAGRAM__LINKS = eINSTANCE.getUMLDiagram_Links();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DIAGRAM__NOTES = eINSTANCE.getUMLDiagram_Notes();

		/**
		 * The meta object literal for the '<em><b>Note Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DIAGRAM__NOTE_LINKS = eINSTANCE.getUMLDiagram_NoteLinks();

		/**
		 * The meta object literal for the '{@link mof.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.ClassifierImpl
		 * @see mof.impl.MofPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__NAME = eINSTANCE.getClassifier_Name();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_ABSTRACT = eINSTANCE.getClassifier_IsAbstract();

		/**
		 * The meta object literal for the '{@link mof.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.PackageImpl
		 * @see mof.impl.MofPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ELEMENTS = eINSTANCE.getPackage_Elements();

		/**
		 * The meta object literal for the '{@link mof.impl.ClasImpl <em>Clas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.ClasImpl
		 * @see mof.impl.MofPackageImpl#getClas()
		 * @generated
		 */
		EClass CLAS = eINSTANCE.getClas();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAS__STEREOTYPE = eINSTANCE.getClas_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAS__ATTRIBUTES = eINSTANCE.getClas_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAS__OPERATIONS = eINSTANCE.getClas_Operations();

		/**
		 * The meta object literal for the '{@link mof.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.InterfaceImpl
		 * @see mof.impl.MofPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__STEREOTYPE = eINSTANCE.getInterface_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__OPERATIONS = eINSTANCE.getInterface_Operations();

		/**
		 * The meta object literal for the '{@link mof.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.EnumerationImpl
		 * @see mof.impl.MofPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__STEREOTYPE = eINSTANCE.getEnumeration_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link mof.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.EnumLiteralImpl
		 * @see mof.impl.MofPackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__NAME = eINSTANCE.getEnumLiteral_Name();

		/**
		 * The meta object literal for the '{@link mof.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.PropertyImpl
		 * @see mof.impl.MofPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VISIBILITY = eINSTANCE.getProperty_Visibility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_STATIC = eINSTANCE.getProperty_IsStatic();

		/**
		 * The meta object literal for the '{@link mof.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.MethodImpl
		 * @see mof.impl.MofPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETER = eINSTANCE.getMethod_Parameter();

		/**
		 * The meta object literal for the '{@link mof.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.ParameterImpl
		 * @see mof.impl.MofPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link mof.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.RelationshipImpl
		 * @see mof.impl.MofPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '{@link mof.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.GeneralizationImpl
		 * @see mof.impl.MofPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '{@link mof.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.ImplementationImpl
		 * @see mof.impl.MofPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '{@link mof.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.AssociationImpl
		 * @see mof.impl.MofPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__ROLE = eINSTANCE.getAssociation_Role();

		/**
		 * The meta object literal for the '<em><b>Source Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__SOURCE_MULTIPLICITY = eINSTANCE.getAssociation_SourceMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Target Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_MULTIPLICITY = eINSTANCE.getAssociation_TargetMultiplicity();

		/**
		 * The meta object literal for the '{@link mof.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.AggregationImpl
		 * @see mof.impl.MofPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link mof.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.CompositionImpl
		 * @see mof.impl.MofPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '{@link mof.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.DependencyImpl
		 * @see mof.impl.MofPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__STEREOTYPE = eINSTANCE.getDependency_Stereotype();

		/**
		 * The meta object literal for the '{@link mof.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.NoteImpl
		 * @see mof.impl.MofPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__TEXT = eINSTANCE.getNote_Text();

		/**
		 * The meta object literal for the '{@link mof.impl.NoteLinkImpl <em>Note Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.NoteLinkImpl
		 * @see mof.impl.MofPackageImpl#getNoteLink()
		 * @generated
		 */
		EClass NOTE_LINK = eINSTANCE.getNoteLink();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE_LINK__NOTE = eINSTANCE.getNoteLink_Note();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE_LINK__ELEMENT = eINSTANCE.getNoteLink_Element();

		/**
		 * The meta object literal for the '{@link mof.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.Visibility
		 * @see mof.impl.MofPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

	}

} //MofPackage

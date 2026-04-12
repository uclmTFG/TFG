/**
 */
package mof.impl;

import mof.AtributosMetodos;
import mof.Color;
import mof.Enlace;
import mof.Forma;
import mof.FormaExtremoDestino;
import mof.FormaExtremoOrigen;
import mof.Linea;
import mof.MofFactory;
import mof.MofPackage;
import mof.NodoDos;
import mof.NodoUno;
import mof.Tipo;
import mof.UMLDiagram;
import mof.Visibilidad;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MofFactoryImpl extends EFactoryImpl implements MofFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MofFactory init() {
		try {
			MofFactory theMofFactory = (MofFactory)EPackage.Registry.INSTANCE.getEFactory(MofPackage.eNS_URI);
			if (theMofFactory != null) {
				return theMofFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MofFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MofPackage.UML_DIAGRAM: return createUMLDiagram();
			case MofPackage.PACKAGE: return createPackage();
			case MofPackage.NODO_UNO: return createNodoUno();
			case MofPackage.NODO_DOS: return createNodoDos();
			case MofPackage.ATRIBUTOS_METODOS: return createAtributosMetodos();
			case MofPackage.ENLACE: return createEnlace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MofPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case MofPackage.FORMA:
				return createFormaFromString(eDataType, initialValue);
			case MofPackage.LINEA:
				return createLineaFromString(eDataType, initialValue);
			case MofPackage.TIPO:
				return createTipoFromString(eDataType, initialValue);
			case MofPackage.VISIBILIDAD:
				return createVisibilidadFromString(eDataType, initialValue);
			case MofPackage.FORMA_EXTREMO_ORIGEN:
				return createFormaExtremoOrigenFromString(eDataType, initialValue);
			case MofPackage.FORMA_EXTREMO_DESTINO:
				return createFormaExtremoDestinoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MofPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case MofPackage.FORMA:
				return convertFormaToString(eDataType, instanceValue);
			case MofPackage.LINEA:
				return convertLineaToString(eDataType, instanceValue);
			case MofPackage.TIPO:
				return convertTipoToString(eDataType, instanceValue);
			case MofPackage.VISIBILIDAD:
				return convertVisibilidadToString(eDataType, instanceValue);
			case MofPackage.FORMA_EXTREMO_ORIGEN:
				return convertFormaExtremoOrigenToString(eDataType, instanceValue);
			case MofPackage.FORMA_EXTREMO_DESTINO:
				return convertFormaExtremoDestinoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLDiagram createUMLDiagram() {
		UMLDiagramImpl umlDiagram = new UMLDiagramImpl();
		return umlDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public mof.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodoUno createNodoUno() {
		NodoUnoImpl nodoUno = new NodoUnoImpl();
		return nodoUno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodoDos createNodoDos() {
		NodoDosImpl nodoDos = new NodoDosImpl();
		return nodoDos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtributosMetodos createAtributosMetodos() {
		AtributosMetodosImpl atributosMetodos = new AtributosMetodosImpl();
		return atributosMetodos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enlace createEnlace() {
		EnlaceImpl enlace = new EnlaceImpl();
		return enlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forma createFormaFromString(EDataType eDataType, String initialValue) {
		Forma result = Forma.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linea createLineaFromString(EDataType eDataType, String initialValue) {
		Linea result = Linea.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo createTipoFromString(EDataType eDataType, String initialValue) {
		Tipo result = Tipo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibilidad createVisibilidadFromString(EDataType eDataType, String initialValue) {
		Visibilidad result = Visibilidad.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormaExtremoOrigen createFormaExtremoOrigenFromString(EDataType eDataType, String initialValue) {
		FormaExtremoOrigen result = FormaExtremoOrigen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormaExtremoOrigenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormaExtremoDestino createFormaExtremoDestinoFromString(EDataType eDataType, String initialValue) {
		FormaExtremoDestino result = FormaExtremoDestino.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormaExtremoDestinoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MofPackage getMofPackage() {
		return (MofPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MofPackage getPackage() {
		return MofPackage.eINSTANCE;
	}

} //MofFactoryImpl

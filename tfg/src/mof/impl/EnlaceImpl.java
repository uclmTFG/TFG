/**
 */
package mof.impl;

import mof.Color;
import mof.Enlace;
import mof.FormaExtremoDestino;
import mof.FormaExtremoOrigen;
import mof.Linea;
import mof.MofPackage;
import mof.Nodo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enlace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mof.impl.EnlaceImpl#getTexto <em>Texto</em>}</li>
 *   <li>{@link mof.impl.EnlaceImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link mof.impl.EnlaceImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link mof.impl.EnlaceImpl#getLinea <em>Linea</em>}</li>
 *   <li>{@link mof.impl.EnlaceImpl#getTextoExtremoOrigen <em>Texto Extremo Origen</em>}</li>
 *   <li>{@link mof.impl.EnlaceImpl#getTextoExtremoDestino <em>Texto Extremo Destino</em>}</li>
 *   <li>{@link mof.impl.EnlaceImpl#getFormaExtremoOrigen <em>Forma Extremo Origen</em>}</li>
 *   <li>{@link mof.impl.EnlaceImpl#getFormaExtremoDestino <em>Forma Extremo Destino</em>}</li>
 *   <li>{@link mof.impl.EnlaceImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnlaceImpl extends EObjectImpl implements Enlace {
	/**
	 * The default value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected String texto = TEXTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected Nodo origen;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Nodo destino;

	/**
	 * The default value of the '{@link #getLinea() <em>Linea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinea()
	 * @generated
	 * @ordered
	 */
	protected static final Linea LINEA_EDEFAULT = Linea.CONTINUA;

	/**
	 * The cached value of the '{@link #getLinea() <em>Linea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinea()
	 * @generated
	 * @ordered
	 */
	protected Linea linea = LINEA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextoExtremoOrigen() <em>Texto Extremo Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextoExtremoOrigen()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTO_EXTREMO_ORIGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextoExtremoOrigen() <em>Texto Extremo Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextoExtremoOrigen()
	 * @generated
	 * @ordered
	 */
	protected String textoExtremoOrigen = TEXTO_EXTREMO_ORIGEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextoExtremoDestino() <em>Texto Extremo Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextoExtremoDestino()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTO_EXTREMO_DESTINO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextoExtremoDestino() <em>Texto Extremo Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextoExtremoDestino()
	 * @generated
	 * @ordered
	 */
	protected String textoExtremoDestino = TEXTO_EXTREMO_DESTINO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormaExtremoOrigen() <em>Forma Extremo Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormaExtremoOrigen()
	 * @generated
	 * @ordered
	 */
	protected static final FormaExtremoOrigen FORMA_EXTREMO_ORIGEN_EDEFAULT = FormaExtremoOrigen.NINGUNA;

	/**
	 * The cached value of the '{@link #getFormaExtremoOrigen() <em>Forma Extremo Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormaExtremoOrigen()
	 * @generated
	 * @ordered
	 */
	protected FormaExtremoOrigen formaExtremoOrigen = FORMA_EXTREMO_ORIGEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormaExtremoDestino() <em>Forma Extremo Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormaExtremoDestino()
	 * @generated
	 * @ordered
	 */
	protected static final FormaExtremoDestino FORMA_EXTREMO_DESTINO_EDEFAULT = FormaExtremoDestino.NINGUNA;

	/**
	 * The cached value of the '{@link #getFormaExtremoDestino() <em>Forma Extremo Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormaExtremoDestino()
	 * @generated
	 * @ordered
	 */
	protected FormaExtremoDestino formaExtremoDestino = FORMA_EXTREMO_DESTINO_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.BLANCO;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MofPackage.Literals.ENLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTexto() {
		return texto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTexto(String newTexto) {
		String oldTexto = texto;
		texto = newTexto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.ENLACE__TEXTO, oldTexto, texto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nodo getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject)origen;
			origen = (Nodo)eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MofPackage.ENLACE__ORIGEN, oldOrigen, origen));
			}
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodo basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigen(Nodo newOrigen) {
		Nodo oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.ENLACE__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nodo getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject)destino;
			destino = (Nodo)eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MofPackage.ENLACE__DESTINO, oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodo basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestino(Nodo newDestino) {
		Nodo oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.ENLACE__DESTINO, oldDestino, destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linea getLinea() {
		return linea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinea(Linea newLinea) {
		Linea oldLinea = linea;
		linea = newLinea == null ? LINEA_EDEFAULT : newLinea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.ENLACE__LINEA, oldLinea, linea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextoExtremoOrigen() {
		return textoExtremoOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextoExtremoOrigen(String newTextoExtremoOrigen) {
		String oldTextoExtremoOrigen = textoExtremoOrigen;
		textoExtremoOrigen = newTextoExtremoOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.ENLACE__TEXTO_EXTREMO_ORIGEN, oldTextoExtremoOrigen, textoExtremoOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextoExtremoDestino() {
		return textoExtremoDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextoExtremoDestino(String newTextoExtremoDestino) {
		String oldTextoExtremoDestino = textoExtremoDestino;
		textoExtremoDestino = newTextoExtremoDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.ENLACE__TEXTO_EXTREMO_DESTINO, oldTextoExtremoDestino, textoExtremoDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormaExtremoOrigen getFormaExtremoOrigen() {
		return formaExtremoOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormaExtremoOrigen(FormaExtremoOrigen newFormaExtremoOrigen) {
		FormaExtremoOrigen oldFormaExtremoOrigen = formaExtremoOrigen;
		formaExtremoOrigen = newFormaExtremoOrigen == null ? FORMA_EXTREMO_ORIGEN_EDEFAULT : newFormaExtremoOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.ENLACE__FORMA_EXTREMO_ORIGEN, oldFormaExtremoOrigen, formaExtremoOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormaExtremoDestino getFormaExtremoDestino() {
		return formaExtremoDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormaExtremoDestino(FormaExtremoDestino newFormaExtremoDestino) {
		FormaExtremoDestino oldFormaExtremoDestino = formaExtremoDestino;
		formaExtremoDestino = newFormaExtremoDestino == null ? FORMA_EXTREMO_DESTINO_EDEFAULT : newFormaExtremoDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.ENLACE__FORMA_EXTREMO_DESTINO, oldFormaExtremoDestino, formaExtremoDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.ENLACE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MofPackage.ENLACE__TEXTO:
				return getTexto();
			case MofPackage.ENLACE__ORIGEN:
				if (resolve) return getOrigen();
				return basicGetOrigen();
			case MofPackage.ENLACE__DESTINO:
				if (resolve) return getDestino();
				return basicGetDestino();
			case MofPackage.ENLACE__LINEA:
				return getLinea();
			case MofPackage.ENLACE__TEXTO_EXTREMO_ORIGEN:
				return getTextoExtremoOrigen();
			case MofPackage.ENLACE__TEXTO_EXTREMO_DESTINO:
				return getTextoExtremoDestino();
			case MofPackage.ENLACE__FORMA_EXTREMO_ORIGEN:
				return getFormaExtremoOrigen();
			case MofPackage.ENLACE__FORMA_EXTREMO_DESTINO:
				return getFormaExtremoDestino();
			case MofPackage.ENLACE__COLOR:
				return getColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MofPackage.ENLACE__TEXTO:
				setTexto((String)newValue);
				return;
			case MofPackage.ENLACE__ORIGEN:
				setOrigen((Nodo)newValue);
				return;
			case MofPackage.ENLACE__DESTINO:
				setDestino((Nodo)newValue);
				return;
			case MofPackage.ENLACE__LINEA:
				setLinea((Linea)newValue);
				return;
			case MofPackage.ENLACE__TEXTO_EXTREMO_ORIGEN:
				setTextoExtremoOrigen((String)newValue);
				return;
			case MofPackage.ENLACE__TEXTO_EXTREMO_DESTINO:
				setTextoExtremoDestino((String)newValue);
				return;
			case MofPackage.ENLACE__FORMA_EXTREMO_ORIGEN:
				setFormaExtremoOrigen((FormaExtremoOrigen)newValue);
				return;
			case MofPackage.ENLACE__FORMA_EXTREMO_DESTINO:
				setFormaExtremoDestino((FormaExtremoDestino)newValue);
				return;
			case MofPackage.ENLACE__COLOR:
				setColor((Color)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MofPackage.ENLACE__TEXTO:
				setTexto(TEXTO_EDEFAULT);
				return;
			case MofPackage.ENLACE__ORIGEN:
				setOrigen((Nodo)null);
				return;
			case MofPackage.ENLACE__DESTINO:
				setDestino((Nodo)null);
				return;
			case MofPackage.ENLACE__LINEA:
				setLinea(LINEA_EDEFAULT);
				return;
			case MofPackage.ENLACE__TEXTO_EXTREMO_ORIGEN:
				setTextoExtremoOrigen(TEXTO_EXTREMO_ORIGEN_EDEFAULT);
				return;
			case MofPackage.ENLACE__TEXTO_EXTREMO_DESTINO:
				setTextoExtremoDestino(TEXTO_EXTREMO_DESTINO_EDEFAULT);
				return;
			case MofPackage.ENLACE__FORMA_EXTREMO_ORIGEN:
				setFormaExtremoOrigen(FORMA_EXTREMO_ORIGEN_EDEFAULT);
				return;
			case MofPackage.ENLACE__FORMA_EXTREMO_DESTINO:
				setFormaExtremoDestino(FORMA_EXTREMO_DESTINO_EDEFAULT);
				return;
			case MofPackage.ENLACE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MofPackage.ENLACE__TEXTO:
				return TEXTO_EDEFAULT == null ? texto != null : !TEXTO_EDEFAULT.equals(texto);
			case MofPackage.ENLACE__ORIGEN:
				return origen != null;
			case MofPackage.ENLACE__DESTINO:
				return destino != null;
			case MofPackage.ENLACE__LINEA:
				return linea != LINEA_EDEFAULT;
			case MofPackage.ENLACE__TEXTO_EXTREMO_ORIGEN:
				return TEXTO_EXTREMO_ORIGEN_EDEFAULT == null ? textoExtremoOrigen != null : !TEXTO_EXTREMO_ORIGEN_EDEFAULT.equals(textoExtremoOrigen);
			case MofPackage.ENLACE__TEXTO_EXTREMO_DESTINO:
				return TEXTO_EXTREMO_DESTINO_EDEFAULT == null ? textoExtremoDestino != null : !TEXTO_EXTREMO_DESTINO_EDEFAULT.equals(textoExtremoDestino);
			case MofPackage.ENLACE__FORMA_EXTREMO_ORIGEN:
				return formaExtremoOrigen != FORMA_EXTREMO_ORIGEN_EDEFAULT;
			case MofPackage.ENLACE__FORMA_EXTREMO_DESTINO:
				return formaExtremoDestino != FORMA_EXTREMO_DESTINO_EDEFAULT;
			case MofPackage.ENLACE__COLOR:
				return color != COLOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (texto: ");
		result.append(texto);
		result.append(", linea: ");
		result.append(linea);
		result.append(", textoExtremoOrigen: ");
		result.append(textoExtremoOrigen);
		result.append(", textoExtremoDestino: ");
		result.append(textoExtremoDestino);
		result.append(", formaExtremoOrigen: ");
		result.append(formaExtremoOrigen);
		result.append(", formaExtremoDestino: ");
		result.append(formaExtremoDestino);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //EnlaceImpl

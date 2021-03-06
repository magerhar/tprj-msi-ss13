/**
 */
package org.eclipselabs.spray.shapes.shape.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.shapes.shape.Point;
import org.eclipselabs.spray.shapes.shape.ShapePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.PointImpl#getXcor <em>Xcor</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.PointImpl#getYcor <em>Ycor</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.PointImpl#getCurveBefore <em>Curve Before</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.impl.PointImpl#getCurveAfter <em>Curve After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointImpl extends MinimalEObjectImpl.Container implements Point
{
  /**
   * The default value of the '{@link #getXcor() <em>Xcor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXcor()
   * @generated
   * @ordered
   */
  protected static final String XCOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXcor() <em>Xcor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXcor()
   * @generated
   * @ordered
   */
  protected String xcor = XCOR_EDEFAULT;

  /**
   * The default value of the '{@link #getYcor() <em>Ycor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYcor()
   * @generated
   * @ordered
   */
  protected static final String YCOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYcor() <em>Ycor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYcor()
   * @generated
   * @ordered
   */
  protected String ycor = YCOR_EDEFAULT;

  /**
   * The default value of the '{@link #getCurveBefore() <em>Curve Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurveBefore()
   * @generated
   * @ordered
   */
  protected static final int CURVE_BEFORE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCurveBefore() <em>Curve Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurveBefore()
   * @generated
   * @ordered
   */
  protected int curveBefore = CURVE_BEFORE_EDEFAULT;

  /**
   * The default value of the '{@link #getCurveAfter() <em>Curve After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurveAfter()
   * @generated
   * @ordered
   */
  protected static final int CURVE_AFTER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCurveAfter() <em>Curve After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurveAfter()
   * @generated
   * @ordered
   */
  protected int curveAfter = CURVE_AFTER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PointImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ShapePackage.Literals.POINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getXcor()
  {
    return xcor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXcor(String newXcor)
  {
    String oldXcor = xcor;
    xcor = newXcor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.POINT__XCOR, oldXcor, xcor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getYcor()
  {
    return ycor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYcor(String newYcor)
  {
    String oldYcor = ycor;
    ycor = newYcor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.POINT__YCOR, oldYcor, ycor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCurveBefore()
  {
    return curveBefore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurveBefore(int newCurveBefore)
  {
    int oldCurveBefore = curveBefore;
    curveBefore = newCurveBefore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.POINT__CURVE_BEFORE, oldCurveBefore, curveBefore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCurveAfter()
  {
    return curveAfter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurveAfter(int newCurveAfter)
  {
    int oldCurveAfter = curveAfter;
    curveAfter = newCurveAfter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.POINT__CURVE_AFTER, oldCurveAfter, curveAfter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ShapePackage.POINT__XCOR:
        return getXcor();
      case ShapePackage.POINT__YCOR:
        return getYcor();
      case ShapePackage.POINT__CURVE_BEFORE:
        return getCurveBefore();
      case ShapePackage.POINT__CURVE_AFTER:
        return getCurveAfter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ShapePackage.POINT__XCOR:
        setXcor((String)newValue);
        return;
      case ShapePackage.POINT__YCOR:
        setYcor((String)newValue);
        return;
      case ShapePackage.POINT__CURVE_BEFORE:
        setCurveBefore((Integer)newValue);
        return;
      case ShapePackage.POINT__CURVE_AFTER:
        setCurveAfter((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ShapePackage.POINT__XCOR:
        setXcor(XCOR_EDEFAULT);
        return;
      case ShapePackage.POINT__YCOR:
        setYcor(YCOR_EDEFAULT);
        return;
      case ShapePackage.POINT__CURVE_BEFORE:
        setCurveBefore(CURVE_BEFORE_EDEFAULT);
        return;
      case ShapePackage.POINT__CURVE_AFTER:
        setCurveAfter(CURVE_AFTER_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ShapePackage.POINT__XCOR:
        return XCOR_EDEFAULT == null ? xcor != null : !XCOR_EDEFAULT.equals(xcor);
      case ShapePackage.POINT__YCOR:
        return YCOR_EDEFAULT == null ? ycor != null : !YCOR_EDEFAULT.equals(ycor);
      case ShapePackage.POINT__CURVE_BEFORE:
        return curveBefore != CURVE_BEFORE_EDEFAULT;
      case ShapePackage.POINT__CURVE_AFTER:
        return curveAfter != CURVE_AFTER_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (xcor: ");
    result.append(xcor);
    result.append(", ycor: ");
    result.append(ycor);
    result.append(", curveBefore: ");
    result.append(curveBefore);
    result.append(", curveAfter: ");
    result.append(curveAfter);
    result.append(')');
    return result.toString();
  }

} //PointImpl

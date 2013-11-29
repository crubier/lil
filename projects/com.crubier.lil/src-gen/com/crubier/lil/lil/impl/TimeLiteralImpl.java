/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.TimeLiteral;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.TimeLiteralImpl#getYear <em>Year</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.TimeLiteralImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.TimeLiteralImpl#getDay <em>Day</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.TimeLiteralImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.TimeLiteralImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.TimeLiteralImpl#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeLiteralImpl extends ExpressionImpl implements TimeLiteral
{
  /**
   * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected static final double YEAR_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected double year = YEAR_EDEFAULT;

  /**
   * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected static final double MONTH_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected double month = MONTH_EDEFAULT;

  /**
   * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected static final double DAY_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected double day = DAY_EDEFAULT;

  /**
   * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHour()
   * @generated
   * @ordered
   */
  protected static final double HOUR_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHour()
   * @generated
   * @ordered
   */
  protected double hour = HOUR_EDEFAULT;

  /**
   * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinute()
   * @generated
   * @ordered
   */
  protected static final double MINUTE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinute()
   * @generated
   * @ordered
   */
  protected double minute = MINUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected static final double SECOND_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected double second = SECOND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeLiteralImpl()
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
    return LilPackage.Literals.TIME_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getYear()
  {
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYear(double newYear)
  {
    double oldYear = year;
    year = newYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.TIME_LITERAL__YEAR, oldYear, year));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getMonth()
  {
    return month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonth(double newMonth)
  {
    double oldMonth = month;
    month = newMonth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.TIME_LITERAL__MONTH, oldMonth, month));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getDay()
  {
    return day;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDay(double newDay)
  {
    double oldDay = day;
    day = newDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.TIME_LITERAL__DAY, oldDay, day));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getHour()
  {
    return hour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHour(double newHour)
  {
    double oldHour = hour;
    hour = newHour;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.TIME_LITERAL__HOUR, oldHour, hour));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getMinute()
  {
    return minute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinute(double newMinute)
  {
    double oldMinute = minute;
    minute = newMinute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.TIME_LITERAL__MINUTE, oldMinute, minute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getSecond()
  {
    return second;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecond(double newSecond)
  {
    double oldSecond = second;
    second = newSecond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.TIME_LITERAL__SECOND, oldSecond, second));
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
      case LilPackage.TIME_LITERAL__YEAR:
        return getYear();
      case LilPackage.TIME_LITERAL__MONTH:
        return getMonth();
      case LilPackage.TIME_LITERAL__DAY:
        return getDay();
      case LilPackage.TIME_LITERAL__HOUR:
        return getHour();
      case LilPackage.TIME_LITERAL__MINUTE:
        return getMinute();
      case LilPackage.TIME_LITERAL__SECOND:
        return getSecond();
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
      case LilPackage.TIME_LITERAL__YEAR:
        setYear((Double)newValue);
        return;
      case LilPackage.TIME_LITERAL__MONTH:
        setMonth((Double)newValue);
        return;
      case LilPackage.TIME_LITERAL__DAY:
        setDay((Double)newValue);
        return;
      case LilPackage.TIME_LITERAL__HOUR:
        setHour((Double)newValue);
        return;
      case LilPackage.TIME_LITERAL__MINUTE:
        setMinute((Double)newValue);
        return;
      case LilPackage.TIME_LITERAL__SECOND:
        setSecond((Double)newValue);
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
      case LilPackage.TIME_LITERAL__YEAR:
        setYear(YEAR_EDEFAULT);
        return;
      case LilPackage.TIME_LITERAL__MONTH:
        setMonth(MONTH_EDEFAULT);
        return;
      case LilPackage.TIME_LITERAL__DAY:
        setDay(DAY_EDEFAULT);
        return;
      case LilPackage.TIME_LITERAL__HOUR:
        setHour(HOUR_EDEFAULT);
        return;
      case LilPackage.TIME_LITERAL__MINUTE:
        setMinute(MINUTE_EDEFAULT);
        return;
      case LilPackage.TIME_LITERAL__SECOND:
        setSecond(SECOND_EDEFAULT);
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
      case LilPackage.TIME_LITERAL__YEAR:
        return year != YEAR_EDEFAULT;
      case LilPackage.TIME_LITERAL__MONTH:
        return month != MONTH_EDEFAULT;
      case LilPackage.TIME_LITERAL__DAY:
        return day != DAY_EDEFAULT;
      case LilPackage.TIME_LITERAL__HOUR:
        return hour != HOUR_EDEFAULT;
      case LilPackage.TIME_LITERAL__MINUTE:
        return minute != MINUTE_EDEFAULT;
      case LilPackage.TIME_LITERAL__SECOND:
        return second != SECOND_EDEFAULT;
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
    result.append(" (year: ");
    result.append(year);
    result.append(", month: ");
    result.append(month);
    result.append(", day: ");
    result.append(day);
    result.append(", hour: ");
    result.append(hour);
    result.append(", minute: ");
    result.append(minute);
    result.append(", second: ");
    result.append(second);
    result.append(')');
    return result.toString();
  }

} //TimeLiteralImpl

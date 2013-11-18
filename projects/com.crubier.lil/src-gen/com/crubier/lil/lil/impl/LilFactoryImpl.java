/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.*;

import org.eclipse.emf.ecore.EClass;
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
public class LilFactoryImpl extends EFactoryImpl implements LilFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LilFactory init()
  {
    try
    {
      LilFactory theLilFactory = (LilFactory)EPackage.Registry.INSTANCE.getEFactory(LilPackage.eNS_URI);
      if (theLilFactory != null)
      {
        return theLilFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LilFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LilPackage.LIL_MODEL: return createLilModel();
      case LilPackage.INTERACTOR: return createInteractor();
      case LilPackage.ACCESSIBLE_ENTITY: return createAccessibleEntity();
      case LilPackage.ENTITY: return createEntity();
      case LilPackage.ACTOR: return createActor();
      case LilPackage.ACTOR_ALIAS: return createActorAlias();
      case LilPackage.COMPONENT: return createComponent();
      case LilPackage.SIGNAL_RECEPTION: return createSignalReception();
      case LilPackage.SIGNAL_EMISSION: return createSignalEmission();
      case LilPackage.SIGNAL: return createSignal();
      case LilPackage.DEFINITION_SET: return createDefinitionSet();
      case LilPackage.SIGNAL_ALIAS: return createSignalAlias();
      case LilPackage.DATA_TYPE: return createDataType();
      case LilPackage.DATA_TYPE_COMPOUND: return createDataTypeCompound();
      case LilPackage.DATA_TYPE_COMPOUND_FIELD: return createDataTypeCompoundField();
      case LilPackage.BEHAVIOR: return createBehavior();
      case LilPackage.CAUSE: return createCause();
      case LilPackage.ON_CAUSE: return createOnCause();
      case LilPackage.WHEN_CAUSE: return createWhenCause();
      case LilPackage.EFFECT: return createEffect();
      case LilPackage.ALWAYS_EFFECT: return createAlwaysEffect();
      case LilPackage.SET_EFFECT: return createSetEffect();
      case LilPackage.TRIGGER_EFFECT: return createTriggerEffect();
      case LilPackage.XEXPRESSION: return createXExpression();
      case LilPackage.XCOLLECTION_LITERAL: return createXCollectionLiteral();
      case LilPackage.XSET_LITERAL: return createXSetLiteral();
      case LilPackage.XLIST_LITERAL: return createXListLiteral();
      case LilPackage.XCASE_PART: return createXCasePart();
      case LilPackage.XENUM_ELEMENT: return createXEnumElement();
      case LilPackage.ENUM_DEFINITION_SET: return createEnumDefinitionSet();
      case LilPackage.NUMBER_DEFINITION_SET: return createNumberDefinitionSet();
      case LilPackage.NUMBER_DEFINITION_INTERVAL: return createNumberDefinitionInterval();
      case LilPackage.XBINARY_OPERATION: return createXBinaryOperation();
      case LilPackage.XUNARY_OPERATION: return createXUnaryOperation();
      case LilPackage.XENUM_LITERAL: return createXEnumLiteral();
      case LilPackage.XSIGNAL_LITERAL: return createXSignalLiteral();
      case LilPackage.XIF_EXPRESSION: return createXIfExpression();
      case LilPackage.XSWITCH_EXPRESSION: return createXSwitchExpression();
      case LilPackage.XFOR_EACH_EXPRESSION: return createXForEachExpression();
      case LilPackage.XFUNCTION_CALL_EXPRESSION: return createXFunctionCallExpression();
      case LilPackage.XBOOLEAN_LITERAL: return createXBooleanLiteral();
      case LilPackage.XNULL_LITERAL: return createXNullLiteral();
      case LilPackage.XNUMBER_LITERAL: return createXNumberLiteral();
      case LilPackage.XSTRING_LITERAL: return createXStringLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilModel createLilModel()
  {
    LilModelImpl lilModel = new LilModelImpl();
    return lilModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interactor createInteractor()
  {
    InteractorImpl interactor = new InteractorImpl();
    return interactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessibleEntity createAccessibleEntity()
  {
    AccessibleEntityImpl accessibleEntity = new AccessibleEntityImpl();
    return accessibleEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor createActor()
  {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorAlias createActorAlias()
  {
    ActorAliasImpl actorAlias = new ActorAliasImpl();
    return actorAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalReception createSignalReception()
  {
    SignalReceptionImpl signalReception = new SignalReceptionImpl();
    return signalReception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalEmission createSignalEmission()
  {
    SignalEmissionImpl signalEmission = new SignalEmissionImpl();
    return signalEmission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal createSignal()
  {
    SignalImpl signal = new SignalImpl();
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionSet createDefinitionSet()
  {
    DefinitionSetImpl definitionSet = new DefinitionSetImpl();
    return definitionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalAlias createSignalAlias()
  {
    SignalAliasImpl signalAlias = new SignalAliasImpl();
    return signalAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeCompound createDataTypeCompound()
  {
    DataTypeCompoundImpl dataTypeCompound = new DataTypeCompoundImpl();
    return dataTypeCompound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeCompoundField createDataTypeCompoundField()
  {
    DataTypeCompoundFieldImpl dataTypeCompoundField = new DataTypeCompoundFieldImpl();
    return dataTypeCompoundField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Behavior createBehavior()
  {
    BehaviorImpl behavior = new BehaviorImpl();
    return behavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cause createCause()
  {
    CauseImpl cause = new CauseImpl();
    return cause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnCause createOnCause()
  {
    OnCauseImpl onCause = new OnCauseImpl();
    return onCause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenCause createWhenCause()
  {
    WhenCauseImpl whenCause = new WhenCauseImpl();
    return whenCause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Effect createEffect()
  {
    EffectImpl effect = new EffectImpl();
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlwaysEffect createAlwaysEffect()
  {
    AlwaysEffectImpl alwaysEffect = new AlwaysEffectImpl();
    return alwaysEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetEffect createSetEffect()
  {
    SetEffectImpl setEffect = new SetEffectImpl();
    return setEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggerEffect createTriggerEffect()
  {
    TriggerEffectImpl triggerEffect = new TriggerEffectImpl();
    return triggerEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression createXExpression()
  {
    XExpressionImpl xExpression = new XExpressionImpl();
    return xExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XCollectionLiteral createXCollectionLiteral()
  {
    XCollectionLiteralImpl xCollectionLiteral = new XCollectionLiteralImpl();
    return xCollectionLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XSetLiteral createXSetLiteral()
  {
    XSetLiteralImpl xSetLiteral = new XSetLiteralImpl();
    return xSetLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XListLiteral createXListLiteral()
  {
    XListLiteralImpl xListLiteral = new XListLiteralImpl();
    return xListLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XCasePart createXCasePart()
  {
    XCasePartImpl xCasePart = new XCasePartImpl();
    return xCasePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XEnumElement createXEnumElement()
  {
    XEnumElementImpl xEnumElement = new XEnumElementImpl();
    return xEnumElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDefinitionSet createEnumDefinitionSet()
  {
    EnumDefinitionSetImpl enumDefinitionSet = new EnumDefinitionSetImpl();
    return enumDefinitionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberDefinitionSet createNumberDefinitionSet()
  {
    NumberDefinitionSetImpl numberDefinitionSet = new NumberDefinitionSetImpl();
    return numberDefinitionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberDefinitionInterval createNumberDefinitionInterval()
  {
    NumberDefinitionIntervalImpl numberDefinitionInterval = new NumberDefinitionIntervalImpl();
    return numberDefinitionInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBinaryOperation createXBinaryOperation()
  {
    XBinaryOperationImpl xBinaryOperation = new XBinaryOperationImpl();
    return xBinaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XUnaryOperation createXUnaryOperation()
  {
    XUnaryOperationImpl xUnaryOperation = new XUnaryOperationImpl();
    return xUnaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XEnumLiteral createXEnumLiteral()
  {
    XEnumLiteralImpl xEnumLiteral = new XEnumLiteralImpl();
    return xEnumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XSignalLiteral createXSignalLiteral()
  {
    XSignalLiteralImpl xSignalLiteral = new XSignalLiteralImpl();
    return xSignalLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XIfExpression createXIfExpression()
  {
    XIfExpressionImpl xIfExpression = new XIfExpressionImpl();
    return xIfExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XSwitchExpression createXSwitchExpression()
  {
    XSwitchExpressionImpl xSwitchExpression = new XSwitchExpressionImpl();
    return xSwitchExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XForEachExpression createXForEachExpression()
  {
    XForEachExpressionImpl xForEachExpression = new XForEachExpressionImpl();
    return xForEachExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XFunctionCallExpression createXFunctionCallExpression()
  {
    XFunctionCallExpressionImpl xFunctionCallExpression = new XFunctionCallExpressionImpl();
    return xFunctionCallExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBooleanLiteral createXBooleanLiteral()
  {
    XBooleanLiteralImpl xBooleanLiteral = new XBooleanLiteralImpl();
    return xBooleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XNullLiteral createXNullLiteral()
  {
    XNullLiteralImpl xNullLiteral = new XNullLiteralImpl();
    return xNullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XNumberLiteral createXNumberLiteral()
  {
    XNumberLiteralImpl xNumberLiteral = new XNumberLiteralImpl();
    return xNumberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XStringLiteral createXStringLiteral()
  {
    XStringLiteralImpl xStringLiteral = new XStringLiteralImpl();
    return xStringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilPackage getLilPackage()
  {
    return (LilPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LilPackage getPackage()
  {
    return LilPackage.eINSTANCE;
  }

} //LilFactoryImpl

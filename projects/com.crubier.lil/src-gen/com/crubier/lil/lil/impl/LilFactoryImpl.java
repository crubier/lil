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
      case LilPackage.DATA_TYPE_DEFINITION: return createDataTypeDefinition();
      case LilPackage.DATA_TYPE_STRUCTURE: return createDataTypeStructure();
      case LilPackage.DATA_TYPE_STRUCTURE_FIELD: return createDataTypeStructureField();
      case LilPackage.BEHAVIOR: return createBehavior();
      case LilPackage.CAUSE: return createCause();
      case LilPackage.ON_CAUSE: return createOnCause();
      case LilPackage.WHEN_CAUSE: return createWhenCause();
      case LilPackage.EFFECT: return createEffect();
      case LilPackage.ALWAYS_EFFECT: return createAlwaysEffect();
      case LilPackage.SET_EFFECT: return createSetEffect();
      case LilPackage.TRIGGER_EFFECT: return createTriggerEffect();
      case LilPackage.EXPRESSION: return createExpression();
      case LilPackage.COLLECTION_LITERAL: return createCollectionLiteral();
      case LilPackage.SET_LITERAL: return createSetLiteral();
      case LilPackage.LIST_LITERAL: return createListLiteral();
      case LilPackage.CASE_PART: return createCasePart();
      case LilPackage.ENUM_ELEMENT: return createEnumElement();
      case LilPackage.ENUM_DEFINITION_SET: return createEnumDefinitionSet();
      case LilPackage.NUMBER_DEFINITION_SET: return createNumberDefinitionSet();
      case LilPackage.NUMBER_DEFINITION_INTERVAL: return createNumberDefinitionInterval();
      case LilPackage.DATA_TYPE_BASE: return createDataTypeBase();
      case LilPackage.DATA_TYPE_COLLECTION: return createDataTypeCollection();
      case LilPackage.DATA_TYPE_COMPOUND: return createDataTypeCompound();
      case LilPackage.XBINARY_OPERATION: return createXBinaryOperation();
      case LilPackage.UNARY_OPERATION: return createUnaryOperation();
      case LilPackage.ENUM_LITERAL: return createEnumLiteral();
      case LilPackage.SIGNAL_LITERAL: return createSignalLiteral();
      case LilPackage.IF_EXPRESSION: return createIfExpression();
      case LilPackage.SWITCH_EXPRESSION: return createSwitchExpression();
      case LilPackage.FOR_EACH_EXPRESSION: return createForEachExpression();
      case LilPackage.FUNCTION_CALL_EXPRESSION: return createFunctionCallExpression();
      case LilPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case LilPackage.NULL_LITERAL: return createNullLiteral();
      case LilPackage.NUMBER_LITERAL: return createNumberLiteral();
      case LilPackage.STRING_LITERAL: return createStringLiteral();
      case LilPackage.TIME_LITERAL_NOW: return createTimeLiteralNow();
      case LilPackage.TIME_LITERAL: return createTimeLiteral();
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
  public DataTypeDefinition createDataTypeDefinition()
  {
    DataTypeDefinitionImpl dataTypeDefinition = new DataTypeDefinitionImpl();
    return dataTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeStructure createDataTypeStructure()
  {
    DataTypeStructureImpl dataTypeStructure = new DataTypeStructureImpl();
    return dataTypeStructure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeStructureField createDataTypeStructureField()
  {
    DataTypeStructureFieldImpl dataTypeStructureField = new DataTypeStructureFieldImpl();
    return dataTypeStructureField;
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
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionLiteral createCollectionLiteral()
  {
    CollectionLiteralImpl collectionLiteral = new CollectionLiteralImpl();
    return collectionLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetLiteral createSetLiteral()
  {
    SetLiteralImpl setLiteral = new SetLiteralImpl();
    return setLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListLiteral createListLiteral()
  {
    ListLiteralImpl listLiteral = new ListLiteralImpl();
    return listLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CasePart createCasePart()
  {
    CasePartImpl casePart = new CasePartImpl();
    return casePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumElement createEnumElement()
  {
    EnumElementImpl enumElement = new EnumElementImpl();
    return enumElement;
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
  public DataTypeBase createDataTypeBase()
  {
    DataTypeBaseImpl dataTypeBase = new DataTypeBaseImpl();
    return dataTypeBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeCollection createDataTypeCollection()
  {
    DataTypeCollectionImpl dataTypeCollection = new DataTypeCollectionImpl();
    return dataTypeCollection;
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
  public UnaryOperation createUnaryOperation()
  {
    UnaryOperationImpl unaryOperation = new UnaryOperationImpl();
    return unaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumLiteral createEnumLiteral()
  {
    EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
    return enumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalLiteral createSignalLiteral()
  {
    SignalLiteralImpl signalLiteral = new SignalLiteralImpl();
    return signalLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfExpression createIfExpression()
  {
    IfExpressionImpl ifExpression = new IfExpressionImpl();
    return ifExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchExpression createSwitchExpression()
  {
    SwitchExpressionImpl switchExpression = new SwitchExpressionImpl();
    return switchExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForEachExpression createForEachExpression()
  {
    ForEachExpressionImpl forEachExpression = new ForEachExpressionImpl();
    return forEachExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCallExpression createFunctionCallExpression()
  {
    FunctionCallExpressionImpl functionCallExpression = new FunctionCallExpressionImpl();
    return functionCallExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeLiteralNow createTimeLiteralNow()
  {
    TimeLiteralNowImpl timeLiteralNow = new TimeLiteralNowImpl();
    return timeLiteralNow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeLiteral createTimeLiteral()
  {
    TimeLiteralImpl timeLiteral = new TimeLiteralImpl();
    return timeLiteral;
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

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
      case LilPackage.MODEL: return createModel();
      case LilPackage.INTERACTOR_DECLARATION: return createInteractorDeclaration();
      case LilPackage.ACCESSIBLE_ENTITY: return createAccessibleEntity();
      case LilPackage.ENTITY: return createEntity();
      case LilPackage.ACTOR: return createActor();
      case LilPackage.COMPONENT: return createComponent();
      case LilPackage.ENTITY_DECLARATION: return createEntityDeclaration();
      case LilPackage.ACTOR_DECLARATION: return createActorDeclaration();
      case LilPackage.ACTOR_ALIAS: return createActorAlias();
      case LilPackage.COMPONENT_DECLARATION: return createComponentDeclaration();
      case LilPackage.EVENT_RECEPTION: return createEventReception();
      case LilPackage.FLOW_RECEPTION: return createFlowReception();
      case LilPackage.EVENT_EMISSION: return createEventEmission();
      case LilPackage.FLOW_EMISSION: return createFlowEmission();
      case LilPackage.SIGNAL_DECLARATION: return createSignalDeclaration();
      case LilPackage.EVENT_DECLARATION: return createEventDeclaration();
      case LilPackage.FLOW_DECLARATION: return createFlowDeclaration();
      case LilPackage.BEHAVIOR_DECLARATION: return createBehaviorDeclaration();
      case LilPackage.CAUSE: return createCause();
      case LilPackage.ON_CAUSE: return createOnCause();
      case LilPackage.WHEN_CAUSE: return createWhenCause();
      case LilPackage.EFFECT: return createEffect();
      case LilPackage.ALWAYS_EFFECT: return createAlwaysEffect();
      case LilPackage.SET_EFFECT: return createSetEffect();
      case LilPackage.TRIGGER_EFFECT: return createTriggerEffect();
      case LilPackage.EXPRESSION: return createExpression();
      case LilPackage.DATA_TYPE_DECLARATION: return createDataTypeDeclaration();
      case LilPackage.FIELD: return createField();
      case LilPackage.DATA_TYPE: return createDataType();
      case LilPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case LilPackage.NUMBER_EXPRESSION: return createNumberExpression();
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE: return createNumberSwitchExpressionNumberCase();
      case LilPackage.BOOLEAN_DISJONCTION: return createBooleanDisjonction();
      case LilPackage.BOOLEAN_CONJONCTION: return createBooleanConjonction();
      case LilPackage.BOOLEAN_NEGATION: return createBooleanNegation();
      case LilPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case LilPackage.NUMBER_IF_EXPRESSION: return createNumberIfExpression();
      case LilPackage.NUMBER_SWITCH_EXPRESSION: return createNumberSwitchExpression();
      case LilPackage.NUMBER_ADDITION: return createNumberAddition();
      case LilPackage.NUMBER_SUBSTRACTION: return createNumberSubstraction();
      case LilPackage.NUMBER_MULTIPLICATION: return createNumberMultiplication();
      case LilPackage.NUMBER_DIVISION: return createNumberDivision();
      case LilPackage.NUMBER_MODULO: return createNumberModulo();
      case LilPackage.NUMBER_POWER: return createNumberPower();
      case LilPackage.NUMBER_OPPOSITION: return createNumberOpposition();
      case LilPackage.NUMBER_LITERAL: return createNumberLiteral();
      case LilPackage.NUMBER_FUNCTION_EXPRESSION: return createNumberFunctionExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDeclaration createInteractorDeclaration()
  {
    InteractorDeclarationImpl interactorDeclaration = new InteractorDeclarationImpl();
    return interactorDeclaration;
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
  public EntityDeclaration createEntityDeclaration()
  {
    EntityDeclarationImpl entityDeclaration = new EntityDeclarationImpl();
    return entityDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorDeclaration createActorDeclaration()
  {
    ActorDeclarationImpl actorDeclaration = new ActorDeclarationImpl();
    return actorDeclaration;
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
  public ComponentDeclaration createComponentDeclaration()
  {
    ComponentDeclarationImpl componentDeclaration = new ComponentDeclarationImpl();
    return componentDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventReception createEventReception()
  {
    EventReceptionImpl eventReception = new EventReceptionImpl();
    return eventReception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowReception createFlowReception()
  {
    FlowReceptionImpl flowReception = new FlowReceptionImpl();
    return flowReception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventEmission createEventEmission()
  {
    EventEmissionImpl eventEmission = new EventEmissionImpl();
    return eventEmission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowEmission createFlowEmission()
  {
    FlowEmissionImpl flowEmission = new FlowEmissionImpl();
    return flowEmission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalDeclaration createSignalDeclaration()
  {
    SignalDeclarationImpl signalDeclaration = new SignalDeclarationImpl();
    return signalDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDeclaration createEventDeclaration()
  {
    EventDeclarationImpl eventDeclaration = new EventDeclarationImpl();
    return eventDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowDeclaration createFlowDeclaration()
  {
    FlowDeclarationImpl flowDeclaration = new FlowDeclarationImpl();
    return flowDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorDeclaration createBehaviorDeclaration()
  {
    BehaviorDeclarationImpl behaviorDeclaration = new BehaviorDeclarationImpl();
    return behaviorDeclaration;
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
  public DataTypeDeclaration createDataTypeDeclaration()
  {
    DataTypeDeclarationImpl dataTypeDeclaration = new DataTypeDeclarationImpl();
    return dataTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
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
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpression createNumberExpression()
  {
    NumberExpressionImpl numberExpression = new NumberExpressionImpl();
    return numberExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberSwitchExpressionNumberCase createNumberSwitchExpressionNumberCase()
  {
    NumberSwitchExpressionNumberCaseImpl numberSwitchExpressionNumberCase = new NumberSwitchExpressionNumberCaseImpl();
    return numberSwitchExpressionNumberCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanDisjonction createBooleanDisjonction()
  {
    BooleanDisjonctionImpl booleanDisjonction = new BooleanDisjonctionImpl();
    return booleanDisjonction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanConjonction createBooleanConjonction()
  {
    BooleanConjonctionImpl booleanConjonction = new BooleanConjonctionImpl();
    return booleanConjonction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanNegation createBooleanNegation()
  {
    BooleanNegationImpl booleanNegation = new BooleanNegationImpl();
    return booleanNegation;
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
  public NumberIfExpression createNumberIfExpression()
  {
    NumberIfExpressionImpl numberIfExpression = new NumberIfExpressionImpl();
    return numberIfExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberSwitchExpression createNumberSwitchExpression()
  {
    NumberSwitchExpressionImpl numberSwitchExpression = new NumberSwitchExpressionImpl();
    return numberSwitchExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberAddition createNumberAddition()
  {
    NumberAdditionImpl numberAddition = new NumberAdditionImpl();
    return numberAddition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberSubstraction createNumberSubstraction()
  {
    NumberSubstractionImpl numberSubstraction = new NumberSubstractionImpl();
    return numberSubstraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberMultiplication createNumberMultiplication()
  {
    NumberMultiplicationImpl numberMultiplication = new NumberMultiplicationImpl();
    return numberMultiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberDivision createNumberDivision()
  {
    NumberDivisionImpl numberDivision = new NumberDivisionImpl();
    return numberDivision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberModulo createNumberModulo()
  {
    NumberModuloImpl numberModulo = new NumberModuloImpl();
    return numberModulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberPower createNumberPower()
  {
    NumberPowerImpl numberPower = new NumberPowerImpl();
    return numberPower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberOpposition createNumberOpposition()
  {
    NumberOppositionImpl numberOpposition = new NumberOppositionImpl();
    return numberOpposition;
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
  public NumberFunctionExpression createNumberFunctionExpression()
  {
    NumberFunctionExpressionImpl numberFunctionExpression = new NumberFunctionExpressionImpl();
    return numberFunctionExpression;
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

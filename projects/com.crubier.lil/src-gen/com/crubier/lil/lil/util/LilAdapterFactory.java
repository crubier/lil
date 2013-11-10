/**
 */
package com.crubier.lil.lil.util;

import com.crubier.lil.lil.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.crubier.lil.lil.LilPackage
 * @generated
 */
public class LilAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LilPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LilPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LilSwitch<Adapter> modelSwitch =
    new LilSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseInteractorDeclaration(InteractorDeclaration object)
      {
        return createInteractorDeclarationAdapter();
      }
      @Override
      public Adapter caseAccessibleEntity(AccessibleEntity object)
      {
        return createAccessibleEntityAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseEntityDeclaration(EntityDeclaration object)
      {
        return createEntityDeclarationAdapter();
      }
      @Override
      public Adapter caseActorDeclaration(ActorDeclaration object)
      {
        return createActorDeclarationAdapter();
      }
      @Override
      public Adapter caseActorAlias(ActorAlias object)
      {
        return createActorAliasAdapter();
      }
      @Override
      public Adapter caseComponentDeclaration(ComponentDeclaration object)
      {
        return createComponentDeclarationAdapter();
      }
      @Override
      public Adapter caseEventReception(EventReception object)
      {
        return createEventReceptionAdapter();
      }
      @Override
      public Adapter caseFlowReception(FlowReception object)
      {
        return createFlowReceptionAdapter();
      }
      @Override
      public Adapter caseEventEmission(EventEmission object)
      {
        return createEventEmissionAdapter();
      }
      @Override
      public Adapter caseFlowEmission(FlowEmission object)
      {
        return createFlowEmissionAdapter();
      }
      @Override
      public Adapter caseSignalDeclaration(SignalDeclaration object)
      {
        return createSignalDeclarationAdapter();
      }
      @Override
      public Adapter caseEventDeclaration(EventDeclaration object)
      {
        return createEventDeclarationAdapter();
      }
      @Override
      public Adapter caseFlowDeclaration(FlowDeclaration object)
      {
        return createFlowDeclarationAdapter();
      }
      @Override
      public Adapter caseBehaviorDeclaration(BehaviorDeclaration object)
      {
        return createBehaviorDeclarationAdapter();
      }
      @Override
      public Adapter caseCause(Cause object)
      {
        return createCauseAdapter();
      }
      @Override
      public Adapter caseOnCause(OnCause object)
      {
        return createOnCauseAdapter();
      }
      @Override
      public Adapter caseWhenCause(WhenCause object)
      {
        return createWhenCauseAdapter();
      }
      @Override
      public Adapter caseEffect(Effect object)
      {
        return createEffectAdapter();
      }
      @Override
      public Adapter caseAlwaysEffect(AlwaysEffect object)
      {
        return createAlwaysEffectAdapter();
      }
      @Override
      public Adapter caseSetEffect(SetEffect object)
      {
        return createSetEffectAdapter();
      }
      @Override
      public Adapter caseTriggerEffect(TriggerEffect object)
      {
        return createTriggerEffectAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseDataTypeDeclaration(DataTypeDeclaration object)
      {
        return createDataTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseBooleanExpression(BooleanExpression object)
      {
        return createBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseNumberExpression(NumberExpression object)
      {
        return createNumberExpressionAdapter();
      }
      @Override
      public Adapter caseNumberSwitchExpressionNumberCase(NumberSwitchExpressionNumberCase object)
      {
        return createNumberSwitchExpressionNumberCaseAdapter();
      }
      @Override
      public Adapter caseNumberSwitchExpressionTextCase(NumberSwitchExpressionTextCase object)
      {
        return createNumberSwitchExpressionTextCaseAdapter();
      }
      @Override
      public Adapter caseTextExpression(TextExpression object)
      {
        return createTextExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanDisjonction(BooleanDisjonction object)
      {
        return createBooleanDisjonctionAdapter();
      }
      @Override
      public Adapter caseBooleanConjonction(BooleanConjonction object)
      {
        return createBooleanConjonctionAdapter();
      }
      @Override
      public Adapter caseBooleanNegation(BooleanNegation object)
      {
        return createBooleanNegationAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseNumberIfExpression(NumberIfExpression object)
      {
        return createNumberIfExpressionAdapter();
      }
      @Override
      public Adapter caseNumberSwitchExpressionNumber(NumberSwitchExpressionNumber object)
      {
        return createNumberSwitchExpressionNumberAdapter();
      }
      @Override
      public Adapter caseNumberSwitchExpressionText(NumberSwitchExpressionText object)
      {
        return createNumberSwitchExpressionTextAdapter();
      }
      @Override
      public Adapter caseNumberAddition(NumberAddition object)
      {
        return createNumberAdditionAdapter();
      }
      @Override
      public Adapter caseNumberSubstraction(NumberSubstraction object)
      {
        return createNumberSubstractionAdapter();
      }
      @Override
      public Adapter caseNumberMultiplication(NumberMultiplication object)
      {
        return createNumberMultiplicationAdapter();
      }
      @Override
      public Adapter caseNumberDivision(NumberDivision object)
      {
        return createNumberDivisionAdapter();
      }
      @Override
      public Adapter caseNumberModulo(NumberModulo object)
      {
        return createNumberModuloAdapter();
      }
      @Override
      public Adapter caseNumberPower(NumberPower object)
      {
        return createNumberPowerAdapter();
      }
      @Override
      public Adapter caseNumberOpposition(NumberOpposition object)
      {
        return createNumberOppositionAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseNumberFunctionExpression(NumberFunctionExpression object)
      {
        return createNumberFunctionExpressionAdapter();
      }
      @Override
      public Adapter caseTextJoin(TextJoin object)
      {
        return createTextJoinAdapter();
      }
      @Override
      public Adapter caseTextLiteral(TextLiteral object)
      {
        return createTextLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDeclaration <em>Interactor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDeclaration
   * @generated
   */
  public Adapter createInteractorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.AccessibleEntity <em>Accessible Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.AccessibleEntity
   * @generated
   */
  public Adapter createAccessibleEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.Actor
   * @generated
   */
  public Adapter createActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.EntityDeclaration <em>Entity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.EntityDeclaration
   * @generated
   */
  public Adapter createEntityDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ActorDeclaration <em>Actor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ActorDeclaration
   * @generated
   */
  public Adapter createActorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ActorAlias <em>Actor Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ActorAlias
   * @generated
   */
  public Adapter createActorAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ComponentDeclaration <em>Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ComponentDeclaration
   * @generated
   */
  public Adapter createComponentDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.EventReception <em>Event Reception</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.EventReception
   * @generated
   */
  public Adapter createEventReceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.FlowReception <em>Flow Reception</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.FlowReception
   * @generated
   */
  public Adapter createFlowReceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.EventEmission <em>Event Emission</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.EventEmission
   * @generated
   */
  public Adapter createEventEmissionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.FlowEmission <em>Flow Emission</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.FlowEmission
   * @generated
   */
  public Adapter createFlowEmissionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.SignalDeclaration <em>Signal Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.SignalDeclaration
   * @generated
   */
  public Adapter createSignalDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.EventDeclaration <em>Event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.EventDeclaration
   * @generated
   */
  public Adapter createEventDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.FlowDeclaration <em>Flow Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.FlowDeclaration
   * @generated
   */
  public Adapter createFlowDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.BehaviorDeclaration <em>Behavior Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.BehaviorDeclaration
   * @generated
   */
  public Adapter createBehaviorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.Cause <em>Cause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.Cause
   * @generated
   */
  public Adapter createCauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.OnCause <em>On Cause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.OnCause
   * @generated
   */
  public Adapter createOnCauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.WhenCause <em>When Cause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.WhenCause
   * @generated
   */
  public Adapter createWhenCauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.Effect
   * @generated
   */
  public Adapter createEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.AlwaysEffect <em>Always Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.AlwaysEffect
   * @generated
   */
  public Adapter createAlwaysEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.SetEffect <em>Set Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.SetEffect
   * @generated
   */
  public Adapter createSetEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.TriggerEffect <em>Trigger Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.TriggerEffect
   * @generated
   */
  public Adapter createTriggerEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeDeclaration <em>Data Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeDeclaration
   * @generated
   */
  public Adapter createDataTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.BooleanExpression
   * @generated
   */
  public Adapter createBooleanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberExpression <em>Number Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberExpression
   * @generated
   */
  public Adapter createNumberExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberSwitchExpressionNumberCase <em>Number Switch Expression Number Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberSwitchExpressionNumberCase
   * @generated
   */
  public Adapter createNumberSwitchExpressionNumberCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberSwitchExpressionTextCase <em>Number Switch Expression Text Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberSwitchExpressionTextCase
   * @generated
   */
  public Adapter createNumberSwitchExpressionTextCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.TextExpression <em>Text Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.TextExpression
   * @generated
   */
  public Adapter createTextExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.BooleanDisjonction <em>Boolean Disjonction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.BooleanDisjonction
   * @generated
   */
  public Adapter createBooleanDisjonctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.BooleanConjonction <em>Boolean Conjonction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.BooleanConjonction
   * @generated
   */
  public Adapter createBooleanConjonctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.BooleanNegation <em>Boolean Negation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.BooleanNegation
   * @generated
   */
  public Adapter createBooleanNegationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberIfExpression <em>Number If Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberIfExpression
   * @generated
   */
  public Adapter createNumberIfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberSwitchExpressionNumber <em>Number Switch Expression Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberSwitchExpressionNumber
   * @generated
   */
  public Adapter createNumberSwitchExpressionNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberSwitchExpressionText <em>Number Switch Expression Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberSwitchExpressionText
   * @generated
   */
  public Adapter createNumberSwitchExpressionTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberAddition <em>Number Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberAddition
   * @generated
   */
  public Adapter createNumberAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberSubstraction <em>Number Substraction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberSubstraction
   * @generated
   */
  public Adapter createNumberSubstractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberMultiplication <em>Number Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberMultiplication
   * @generated
   */
  public Adapter createNumberMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberDivision <em>Number Division</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberDivision
   * @generated
   */
  public Adapter createNumberDivisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberModulo <em>Number Modulo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberModulo
   * @generated
   */
  public Adapter createNumberModuloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberPower <em>Number Power</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberPower
   * @generated
   */
  public Adapter createNumberPowerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberOpposition <em>Number Opposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberOpposition
   * @generated
   */
  public Adapter createNumberOppositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.NumberFunctionExpression <em>Number Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.NumberFunctionExpression
   * @generated
   */
  public Adapter createNumberFunctionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.TextJoin <em>Text Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.TextJoin
   * @generated
   */
  public Adapter createTextJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.TextLiteral <em>Text Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.TextLiteral
   * @generated
   */
  public Adapter createTextLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LilAdapterFactory

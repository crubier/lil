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
      public Adapter caseLilModel(LilModel object)
      {
        return createLilModelAdapter();
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
      public Adapter caseSignalReception(SignalReception object)
      {
        return createSignalReceptionAdapter();
      }
      @Override
      public Adapter caseSignalEmission(SignalEmission object)
      {
        return createSignalEmissionAdapter();
      }
      @Override
      public Adapter caseSignalDeclaration(SignalDeclaration object)
      {
        return createSignalDeclarationAdapter();
      }
      @Override
      public Adapter caseSignalAlias(SignalAlias object)
      {
        return createSignalAliasAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseDataTypeCompoundDeclaration(DataTypeCompoundDeclaration object)
      {
        return createDataTypeCompoundDeclarationAdapter();
      }
      @Override
      public Adapter caseDataTypeCompoundField(DataTypeCompoundField object)
      {
        return createDataTypeCompoundFieldAdapter();
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
      public Adapter caseXExpression(XExpression object)
      {
        return createXExpressionAdapter();
      }
      @Override
      public Adapter caseXCollectionLiteral(XCollectionLiteral object)
      {
        return createXCollectionLiteralAdapter();
      }
      @Override
      public Adapter caseXSetLiteral(XSetLiteral object)
      {
        return createXSetLiteralAdapter();
      }
      @Override
      public Adapter caseXListLiteral(XListLiteral object)
      {
        return createXListLiteralAdapter();
      }
      @Override
      public Adapter caseXCasePart(XCasePart object)
      {
        return createXCasePartAdapter();
      }
      @Override
      public Adapter caseDataTypeCompound(DataTypeCompound object)
      {
        return createDataTypeCompoundAdapter();
      }
      @Override
      public Adapter caseDataTypeBase(DataTypeBase object)
      {
        return createDataTypeBaseAdapter();
      }
      @Override
      public Adapter caseXBinaryOperation(XBinaryOperation object)
      {
        return createXBinaryOperationAdapter();
      }
      @Override
      public Adapter caseXUnaryOperation(XUnaryOperation object)
      {
        return createXUnaryOperationAdapter();
      }
      @Override
      public Adapter caseXIfExpression(XIfExpression object)
      {
        return createXIfExpressionAdapter();
      }
      @Override
      public Adapter caseXSwitchExpression(XSwitchExpression object)
      {
        return createXSwitchExpressionAdapter();
      }
      @Override
      public Adapter caseXForEachExpression(XForEachExpression object)
      {
        return createXForEachExpressionAdapter();
      }
      @Override
      public Adapter caseXFunctionCallExpression(XFunctionCallExpression object)
      {
        return createXFunctionCallExpressionAdapter();
      }
      @Override
      public Adapter caseXBooleanLiteral(XBooleanLiteral object)
      {
        return createXBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseXNullLiteral(XNullLiteral object)
      {
        return createXNullLiteralAdapter();
      }
      @Override
      public Adapter caseXNumberLiteral(XNumberLiteral object)
      {
        return createXNumberLiteralAdapter();
      }
      @Override
      public Adapter caseXStringLiteral(XStringLiteral object)
      {
        return createXStringLiteralAdapter();
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
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.LilModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.LilModel
   * @generated
   */
  public Adapter createLilModelAdapter()
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
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.SignalReception <em>Signal Reception</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.SignalReception
   * @generated
   */
  public Adapter createSignalReceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.SignalEmission <em>Signal Emission</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.SignalEmission
   * @generated
   */
  public Adapter createSignalEmissionAdapter()
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
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.SignalAlias <em>Signal Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.SignalAlias
   * @generated
   */
  public Adapter createSignalAliasAdapter()
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
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeCompoundDeclaration <em>Data Type Compound Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeCompoundDeclaration
   * @generated
   */
  public Adapter createDataTypeCompoundDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeCompoundField <em>Data Type Compound Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeCompoundField
   * @generated
   */
  public Adapter createDataTypeCompoundFieldAdapter()
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
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XExpression
   * @generated
   */
  public Adapter createXExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XCollectionLiteral <em>XCollection Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XCollectionLiteral
   * @generated
   */
  public Adapter createXCollectionLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XSetLiteral <em>XSet Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XSetLiteral
   * @generated
   */
  public Adapter createXSetLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XListLiteral <em>XList Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XListLiteral
   * @generated
   */
  public Adapter createXListLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XCasePart <em>XCase Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XCasePart
   * @generated
   */
  public Adapter createXCasePartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeCompound <em>Data Type Compound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeCompound
   * @generated
   */
  public Adapter createDataTypeCompoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeBase <em>Data Type Base</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeBase
   * @generated
   */
  public Adapter createDataTypeBaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XBinaryOperation <em>XBinary Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XBinaryOperation
   * @generated
   */
  public Adapter createXBinaryOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XUnaryOperation <em>XUnary Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XUnaryOperation
   * @generated
   */
  public Adapter createXUnaryOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XIfExpression <em>XIf Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XIfExpression
   * @generated
   */
  public Adapter createXIfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XSwitchExpression <em>XSwitch Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XSwitchExpression
   * @generated
   */
  public Adapter createXSwitchExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XForEachExpression <em>XFor Each Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XForEachExpression
   * @generated
   */
  public Adapter createXForEachExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XFunctionCallExpression <em>XFunction Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XFunctionCallExpression
   * @generated
   */
  public Adapter createXFunctionCallExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XBooleanLiteral <em>XBoolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XBooleanLiteral
   * @generated
   */
  public Adapter createXBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XNullLiteral <em>XNull Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XNullLiteral
   * @generated
   */
  public Adapter createXNullLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XNumberLiteral <em>XNumber Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XNumberLiteral
   * @generated
   */
  public Adapter createXNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.XStringLiteral <em>XString Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.XStringLiteral
   * @generated
   */
  public Adapter createXStringLiteralAdapter()
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

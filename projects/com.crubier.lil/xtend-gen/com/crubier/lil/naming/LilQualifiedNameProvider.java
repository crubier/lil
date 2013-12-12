package com.crubier.lil.naming;

import com.crubier.lil.lil.ActorTypeDefinition;
import com.crubier.lil.lil.DataTypeDefinition;
import com.crubier.lil.lil.InteractorTypeDefinition;
import com.crubier.lil.lil.LilModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class LilQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  public QualifiedName qualifiedName(final LilModel t) {
    String _name = t.getName();
    return QualifiedName.create(_name);
  }
  
  public QualifiedName qualifiedName(final ActorTypeDefinition t) {
    EObject _eContainer = t.eContainer();
    String _name = ((LilModel) _eContainer).getName();
    String _name_1 = t.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final DataTypeDefinition t) {
    EObject _eContainer = t.eContainer();
    String _name = ((LilModel) _eContainer).getName();
    String _name_1 = t.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final InteractorTypeDefinition t) {
    EObject _eContainer = t.eContainer();
    String _name = ((LilModel) _eContainer).getName();
    String _name_1 = t.getName();
    return QualifiedName.create(_name, _name_1);
  }
}

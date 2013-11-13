package com.crubier.lil.tests;

import com.crubier.lil.LilInjectorProvider;
import com.crubier.lil.lil.Interactor;
import com.crubier.lil.lil.LilModel;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(LilInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class BasicTest {
  @Inject
  private ParseHelper<LilModel> parser;
  
  @Test
  public void parseLil() {
    try {
      final LilModel model = this.parser.parse(
        "\n\t\t\t\tinteractor test1234testInteractor :\n\n\t\t\t");
      EList<Interactor> _interactors = model.getInteractors();
      Interactor _head = IterableExtensions.<Interactor>head(_interactors);
      final Interactor entity = ((Interactor) _head);
      String _name = entity.getName();
      Assert.assertEquals(_name, "test1234testInteractor");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

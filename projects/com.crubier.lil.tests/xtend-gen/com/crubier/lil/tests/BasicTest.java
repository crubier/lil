package com.crubier.lil.tests;

import com.crubier.lil.LilInjectorProvider;
import com.crubier.lil.lil.LilModel;
import javax.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.runner.RunWith;

@InjectWith(LilInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class BasicTest {
  @Inject
  private ParseHelper<LilModel> parser;
}

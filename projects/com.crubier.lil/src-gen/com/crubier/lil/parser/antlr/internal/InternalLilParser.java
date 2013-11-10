package com.crubier.lil.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.crubier.lil.services.LilGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLilParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interactor'", "':'", "'any'", "'self'", "'other'", "'parent'", "'child'", "'all'", "'actors'", "'actor'", "'as'", "'with'", "','", "'from'", "'init'", "'to'", "'event'", "'flow'", "'on'", "'if'", "'when'", "'always'", "'='", "'set'", "'trigger'", "'data'", "'type'", "'void'", "'symbol'", "'number'", "'text'", "'time'", "'reference'", "'or'", "'and'", "'!'", "'('", "')'", "'else'", "'switch'", "'default'", "'case'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'<>'", "'true'", "'yes'", "'false'", "'no'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLilParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLilParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLilParser.tokenNames; }
    public String getGrammarFileName() { return "../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g"; }



     	private LilGrammarAccess grammarAccess;
     	
        public InternalLilParser(TokenStream input, LilGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected LilGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_interactors_0_0= ruleInteractorDeclaration ) ) | ( (lv_dataTypes_1_0= ruleDataTypeDeclaration ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_interactors_0_0 = null;

        EObject lv_dataTypes_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:79:28: ( ( ( (lv_interactors_0_0= ruleInteractorDeclaration ) ) | ( (lv_dataTypes_1_0= ruleDataTypeDeclaration ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:1: ( ( (lv_interactors_0_0= ruleInteractorDeclaration ) ) | ( (lv_dataTypes_1_0= ruleDataTypeDeclaration ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:1: ( ( (lv_interactors_0_0= ruleInteractorDeclaration ) ) | ( (lv_dataTypes_1_0= ruleDataTypeDeclaration ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }
                else if ( (LA1_0==36) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:2: ( (lv_interactors_0_0= ruleInteractorDeclaration ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:2: ( (lv_interactors_0_0= ruleInteractorDeclaration ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:81:1: (lv_interactors_0_0= ruleInteractorDeclaration )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:81:1: (lv_interactors_0_0= ruleInteractorDeclaration )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:82:3: lv_interactors_0_0= ruleInteractorDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getInteractorsInteractorDeclarationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorDeclaration_in_ruleModel131);
            	    lv_interactors_0_0=ruleInteractorDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"interactors",
            	              		lv_interactors_0_0, 
            	              		"InteractorDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:99:6: ( (lv_dataTypes_1_0= ruleDataTypeDeclaration ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:99:6: ( (lv_dataTypes_1_0= ruleDataTypeDeclaration ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:100:1: (lv_dataTypes_1_0= ruleDataTypeDeclaration )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:100:1: (lv_dataTypes_1_0= ruleDataTypeDeclaration )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:101:3: lv_dataTypes_1_0= ruleDataTypeDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getDataTypesDataTypeDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDataTypeDeclaration_in_ruleModel158);
            	    lv_dataTypes_1_0=ruleDataTypeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dataTypes",
            	              		lv_dataTypes_1_0, 
            	              		"DataTypeDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInteractorDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:125:1: entryRuleInteractorDeclaration returns [EObject current=null] : iv_ruleInteractorDeclaration= ruleInteractorDeclaration EOF ;
    public final EObject entryRuleInteractorDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:126:2: (iv_ruleInteractorDeclaration= ruleInteractorDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:127:2: iv_ruleInteractorDeclaration= ruleInteractorDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorDeclaration_in_entryRuleInteractorDeclaration195);
            iv_ruleInteractorDeclaration=ruleInteractorDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorDeclaration205); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractorDeclaration"


    // $ANTLR start "ruleInteractorDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:134:1: ruleInteractorDeclaration returns [EObject current=null] : (otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntityDeclaration ) ) | ( (lv_signals_4_0= ruleSignalDeclaration ) ) | ( (lv_behaviors_5_0= ruleBehaviorDeclaration ) ) )* ) ;
    public final EObject ruleInteractorDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_entities_3_0 = null;

        EObject lv_signals_4_0 = null;

        EObject lv_behaviors_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:137:28: ( (otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntityDeclaration ) ) | ( (lv_signals_4_0= ruleSignalDeclaration ) ) | ( (lv_behaviors_5_0= ruleBehaviorDeclaration ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:138:1: (otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntityDeclaration ) ) | ( (lv_signals_4_0= ruleSignalDeclaration ) ) | ( (lv_behaviors_5_0= ruleBehaviorDeclaration ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:138:1: (otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntityDeclaration ) ) | ( (lv_signals_4_0= ruleSignalDeclaration ) ) | ( (lv_behaviors_5_0= ruleBehaviorDeclaration ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:138:3: otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntityDeclaration ) ) | ( (lv_signals_4_0= ruleSignalDeclaration ) ) | ( (lv_behaviors_5_0= ruleBehaviorDeclaration ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleInteractorDeclaration242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorDeclarationAccess().getInteractorKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:142:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:143:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:143:1: (lv_name_1_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:144:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorDeclaration259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getInteractorDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInteractorDeclaration276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:164:1: ( ( (lv_entities_3_0= ruleEntityDeclaration ) ) | ( (lv_signals_4_0= ruleSignalDeclaration ) ) | ( (lv_behaviors_5_0= ruleBehaviorDeclaration ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    alt2=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA2_3 = input.LA(2);

                    if ( ((LA2_3>=27 && LA2_3<=28)) ) {
                        alt2=2;
                    }
                    else if ( (LA2_3==RULE_ID) ) {
                        alt2=1;
                    }


                    }
                    break;
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                    {
                    alt2=2;
                    }
                    break;
                case 29:
                case 31:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:164:2: ( (lv_entities_3_0= ruleEntityDeclaration ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:164:2: ( (lv_entities_3_0= ruleEntityDeclaration ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:165:1: (lv_entities_3_0= ruleEntityDeclaration )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:165:1: (lv_entities_3_0= ruleEntityDeclaration )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:166:3: lv_entities_3_0= ruleEntityDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorDeclarationAccess().getEntitiesEntityDeclarationParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEntityDeclaration_in_ruleInteractorDeclaration298);
            	    lv_entities_3_0=ruleEntityDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entities",
            	              		lv_entities_3_0, 
            	              		"EntityDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:183:6: ( (lv_signals_4_0= ruleSignalDeclaration ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:183:6: ( (lv_signals_4_0= ruleSignalDeclaration ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:184:1: (lv_signals_4_0= ruleSignalDeclaration )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:184:1: (lv_signals_4_0= ruleSignalDeclaration )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:185:3: lv_signals_4_0= ruleSignalDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorDeclarationAccess().getSignalsSignalDeclarationParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignalDeclaration_in_ruleInteractorDeclaration325);
            	    lv_signals_4_0=ruleSignalDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"signals",
            	              		lv_signals_4_0, 
            	              		"SignalDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:202:6: ( (lv_behaviors_5_0= ruleBehaviorDeclaration ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:202:6: ( (lv_behaviors_5_0= ruleBehaviorDeclaration ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:203:1: (lv_behaviors_5_0= ruleBehaviorDeclaration )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:203:1: (lv_behaviors_5_0= ruleBehaviorDeclaration )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:204:3: lv_behaviors_5_0= ruleBehaviorDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorDeclarationAccess().getBehaviorsBehaviorDeclarationParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBehaviorDeclaration_in_ruleInteractorDeclaration352);
            	    lv_behaviors_5_0=ruleBehaviorDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"behaviors",
            	              		lv_behaviors_5_0, 
            	              		"BehaviorDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteractorDeclaration"


    // $ANTLR start "entryRuleAccessibleEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:228:1: entryRuleAccessibleEntity returns [EObject current=null] : iv_ruleAccessibleEntity= ruleAccessibleEntity EOF ;
    public final EObject entryRuleAccessibleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessibleEntity = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:229:2: (iv_ruleAccessibleEntity= ruleAccessibleEntity EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:230:2: iv_ruleAccessibleEntity= ruleAccessibleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessibleEntityRule()); 
            }
            pushFollow(FOLLOW_ruleAccessibleEntity_in_entryRuleAccessibleEntity390);
            iv_ruleAccessibleEntity=ruleAccessibleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessibleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessibleEntity400); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccessibleEntity"


    // $ANTLR start "ruleAccessibleEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:237:1: ruleAccessibleEntity returns [EObject current=null] : ( ( ( (lv_generic_0_1= 'any' | lv_generic_0_2= 'self' | lv_generic_0_3= 'other' | lv_generic_0_4= 'parent' | lv_generic_0_5= 'child' | lv_generic_0_6= 'all' | lv_generic_0_7= 'actors' ) ) ) | ( (lv_specific_1_0= ruleEntity ) ) ) ;
    public final EObject ruleAccessibleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_generic_0_1=null;
        Token lv_generic_0_2=null;
        Token lv_generic_0_3=null;
        Token lv_generic_0_4=null;
        Token lv_generic_0_5=null;
        Token lv_generic_0_6=null;
        Token lv_generic_0_7=null;
        EObject lv_specific_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:240:28: ( ( ( ( (lv_generic_0_1= 'any' | lv_generic_0_2= 'self' | lv_generic_0_3= 'other' | lv_generic_0_4= 'parent' | lv_generic_0_5= 'child' | lv_generic_0_6= 'all' | lv_generic_0_7= 'actors' ) ) ) | ( (lv_specific_1_0= ruleEntity ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:1: ( ( ( (lv_generic_0_1= 'any' | lv_generic_0_2= 'self' | lv_generic_0_3= 'other' | lv_generic_0_4= 'parent' | lv_generic_0_5= 'child' | lv_generic_0_6= 'all' | lv_generic_0_7= 'actors' ) ) ) | ( (lv_specific_1_0= ruleEntity ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:1: ( ( ( (lv_generic_0_1= 'any' | lv_generic_0_2= 'self' | lv_generic_0_3= 'other' | lv_generic_0_4= 'parent' | lv_generic_0_5= 'child' | lv_generic_0_6= 'all' | lv_generic_0_7= 'actors' ) ) ) | ( (lv_specific_1_0= ruleEntity ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=19)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:2: ( ( (lv_generic_0_1= 'any' | lv_generic_0_2= 'self' | lv_generic_0_3= 'other' | lv_generic_0_4= 'parent' | lv_generic_0_5= 'child' | lv_generic_0_6= 'all' | lv_generic_0_7= 'actors' ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:2: ( ( (lv_generic_0_1= 'any' | lv_generic_0_2= 'self' | lv_generic_0_3= 'other' | lv_generic_0_4= 'parent' | lv_generic_0_5= 'child' | lv_generic_0_6= 'all' | lv_generic_0_7= 'actors' ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:242:1: ( (lv_generic_0_1= 'any' | lv_generic_0_2= 'self' | lv_generic_0_3= 'other' | lv_generic_0_4= 'parent' | lv_generic_0_5= 'child' | lv_generic_0_6= 'all' | lv_generic_0_7= 'actors' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:242:1: ( (lv_generic_0_1= 'any' | lv_generic_0_2= 'self' | lv_generic_0_3= 'other' | lv_generic_0_4= 'parent' | lv_generic_0_5= 'child' | lv_generic_0_6= 'all' | lv_generic_0_7= 'actors' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:243:1: (lv_generic_0_1= 'any' | lv_generic_0_2= 'self' | lv_generic_0_3= 'other' | lv_generic_0_4= 'parent' | lv_generic_0_5= 'child' | lv_generic_0_6= 'all' | lv_generic_0_7= 'actors' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:243:1: (lv_generic_0_1= 'any' | lv_generic_0_2= 'self' | lv_generic_0_3= 'other' | lv_generic_0_4= 'parent' | lv_generic_0_5= 'child' | lv_generic_0_6= 'all' | lv_generic_0_7= 'actors' )
                    int alt3=7;
                    switch ( input.LA(1) ) {
                    case 13:
                        {
                        alt3=1;
                        }
                        break;
                    case 14:
                        {
                        alt3=2;
                        }
                        break;
                    case 15:
                        {
                        alt3=3;
                        }
                        break;
                    case 16:
                        {
                        alt3=4;
                        }
                        break;
                    case 17:
                        {
                        alt3=5;
                        }
                        break;
                    case 18:
                        {
                        alt3=6;
                        }
                        break;
                    case 19:
                        {
                        alt3=7;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }

                    switch (alt3) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:244:3: lv_generic_0_1= 'any'
                            {
                            lv_generic_0_1=(Token)match(input,13,FOLLOW_13_in_ruleAccessibleEntity445); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_generic_0_1, grammarAccess.getAccessibleEntityAccess().getGenericAnyKeyword_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAccessibleEntityRule());
                              	        }
                                     		setWithLastConsumed(current, "generic", lv_generic_0_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:256:8: lv_generic_0_2= 'self'
                            {
                            lv_generic_0_2=(Token)match(input,14,FOLLOW_14_in_ruleAccessibleEntity474); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_generic_0_2, grammarAccess.getAccessibleEntityAccess().getGenericSelfKeyword_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAccessibleEntityRule());
                              	        }
                                     		setWithLastConsumed(current, "generic", lv_generic_0_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:268:8: lv_generic_0_3= 'other'
                            {
                            lv_generic_0_3=(Token)match(input,15,FOLLOW_15_in_ruleAccessibleEntity503); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_generic_0_3, grammarAccess.getAccessibleEntityAccess().getGenericOtherKeyword_0_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAccessibleEntityRule());
                              	        }
                                     		setWithLastConsumed(current, "generic", lv_generic_0_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:280:8: lv_generic_0_4= 'parent'
                            {
                            lv_generic_0_4=(Token)match(input,16,FOLLOW_16_in_ruleAccessibleEntity532); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_generic_0_4, grammarAccess.getAccessibleEntityAccess().getGenericParentKeyword_0_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAccessibleEntityRule());
                              	        }
                                     		setWithLastConsumed(current, "generic", lv_generic_0_4, null);
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:292:8: lv_generic_0_5= 'child'
                            {
                            lv_generic_0_5=(Token)match(input,17,FOLLOW_17_in_ruleAccessibleEntity561); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_generic_0_5, grammarAccess.getAccessibleEntityAccess().getGenericChildKeyword_0_0_4());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAccessibleEntityRule());
                              	        }
                                     		setWithLastConsumed(current, "generic", lv_generic_0_5, null);
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:304:8: lv_generic_0_6= 'all'
                            {
                            lv_generic_0_6=(Token)match(input,18,FOLLOW_18_in_ruleAccessibleEntity590); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_generic_0_6, grammarAccess.getAccessibleEntityAccess().getGenericAllKeyword_0_0_5());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAccessibleEntityRule());
                              	        }
                                     		setWithLastConsumed(current, "generic", lv_generic_0_6, null);
                              	    
                            }

                            }
                            break;
                        case 7 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:316:8: lv_generic_0_7= 'actors'
                            {
                            lv_generic_0_7=(Token)match(input,19,FOLLOW_19_in_ruleAccessibleEntity619); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_generic_0_7, grammarAccess.getAccessibleEntityAccess().getGenericActorsKeyword_0_0_6());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAccessibleEntityRule());
                              	        }
                                     		setWithLastConsumed(current, "generic", lv_generic_0_7, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:332:6: ( (lv_specific_1_0= ruleEntity ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:332:6: ( (lv_specific_1_0= ruleEntity ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:333:1: (lv_specific_1_0= ruleEntity )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:333:1: (lv_specific_1_0= ruleEntity )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:334:3: lv_specific_1_0= ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAccessibleEntityAccess().getSpecificEntityParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEntity_in_ruleAccessibleEntity662);
                    lv_specific_1_0=ruleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAccessibleEntityRule());
                      	        }
                             		set(
                             			current, 
                             			"specific",
                              		lv_specific_1_0, 
                              		"Entity");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessibleEntity"


    // $ANTLR start "entryRuleEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:358:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:359:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:360:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity698);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity708); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:367:1: ruleEntity returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:370:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:371:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:371:1: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:372:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:372:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:373:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntityRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getInstanceEntityDeclarationCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleActor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:392:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:393:2: (iv_ruleActor= ruleActor EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:394:2: iv_ruleActor= ruleActor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorRule()); 
            }
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor787);
            iv_ruleActor=ruleActor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor797); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:401:1: ruleActor returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:404:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:405:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:405:1: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:406:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:406:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:407:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActorRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor841); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getActorAccess().getInstanceActorDeclarationCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:426:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:427:2: (iv_ruleComponent= ruleComponent EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:428:2: iv_ruleComponent= ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent876);
            iv_ruleComponent=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent886); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:435:1: ruleComponent returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:438:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:439:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:439:1: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:440:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:440:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:441:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getInstanceComponentDeclarationCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleEntityDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:460:1: entryRuleEntityDeclaration returns [EObject current=null] : iv_ruleEntityDeclaration= ruleEntityDeclaration EOF ;
    public final EObject entryRuleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:461:2: (iv_ruleEntityDeclaration= ruleEntityDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:462:2: iv_ruleEntityDeclaration= ruleEntityDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleEntityDeclaration_in_entryRuleEntityDeclaration965);
            iv_ruleEntityDeclaration=ruleEntityDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntityDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityDeclaration975); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityDeclaration"


    // $ANTLR start "ruleEntityDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:469:1: ruleEntityDeclaration returns [EObject current=null] : (this_ActorDeclaration_0= ruleActorDeclaration | this_ComponentDeclaration_1= ruleComponentDeclaration ) ;
    public final EObject ruleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ActorDeclaration_0 = null;

        EObject this_ComponentDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:472:28: ( (this_ActorDeclaration_0= ruleActorDeclaration | this_ComponentDeclaration_1= ruleComponentDeclaration ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:473:1: (this_ActorDeclaration_0= ruleActorDeclaration | this_ComponentDeclaration_1= ruleComponentDeclaration )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:473:1: (this_ActorDeclaration_0= ruleActorDeclaration | this_ComponentDeclaration_1= ruleComponentDeclaration )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:474:5: this_ActorDeclaration_0= ruleActorDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityDeclarationAccess().getActorDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActorDeclaration_in_ruleEntityDeclaration1022);
                    this_ActorDeclaration_0=ruleActorDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ActorDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:484:5: this_ComponentDeclaration_1= ruleComponentDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityDeclarationAccess().getComponentDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComponentDeclaration_in_ruleEntityDeclaration1049);
                    this_ComponentDeclaration_1=ruleComponentDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComponentDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityDeclaration"


    // $ANTLR start "entryRuleActorDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:500:1: entryRuleActorDeclaration returns [EObject current=null] : iv_ruleActorDeclaration= ruleActorDeclaration EOF ;
    public final EObject entryRuleActorDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:501:2: (iv_ruleActorDeclaration= ruleActorDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:502:2: iv_ruleActorDeclaration= ruleActorDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleActorDeclaration_in_entryRuleActorDeclaration1084);
            iv_ruleActorDeclaration=ruleActorDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorDeclaration1094); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActorDeclaration"


    // $ANTLR start "ruleActorDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:509:1: ruleActorDeclaration returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleActorDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:512:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:513:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:513:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:513:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleActorDeclaration1131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getActorDeclarationAccess().getActorKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:517:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:518:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:518:1: (lv_name_1_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:519:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorDeclaration1148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getActorDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActorDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActorDeclaration"


    // $ANTLR start "entryRuleActorAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:543:1: entryRuleActorAlias returns [EObject current=null] : iv_ruleActorAlias= ruleActorAlias EOF ;
    public final EObject entryRuleActorAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorAlias = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:544:2: (iv_ruleActorAlias= ruleActorAlias EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:545:2: iv_ruleActorAlias= ruleActorAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorAliasRule()); 
            }
            pushFollow(FOLLOW_ruleActorAlias_in_entryRuleActorAlias1189);
            iv_ruleActorAlias=ruleActorAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorAlias1199); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActorAlias"


    // $ANTLR start "ruleActorAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:552:1: ruleActorAlias returns [EObject current=null] : ( ( (lv_source_0_0= ruleActor ) ) otherlv_1= 'as' ( (lv_remote_2_0= ruleActor ) ) ) ;
    public final EObject ruleActorAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_source_0_0 = null;

        EObject lv_remote_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:555:28: ( ( ( (lv_source_0_0= ruleActor ) ) otherlv_1= 'as' ( (lv_remote_2_0= ruleActor ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:556:1: ( ( (lv_source_0_0= ruleActor ) ) otherlv_1= 'as' ( (lv_remote_2_0= ruleActor ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:556:1: ( ( (lv_source_0_0= ruleActor ) ) otherlv_1= 'as' ( (lv_remote_2_0= ruleActor ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:556:2: ( (lv_source_0_0= ruleActor ) ) otherlv_1= 'as' ( (lv_remote_2_0= ruleActor ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:556:2: ( (lv_source_0_0= ruleActor ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:557:1: (lv_source_0_0= ruleActor )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:557:1: (lv_source_0_0= ruleActor )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:558:3: lv_source_0_0= ruleActor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActorAliasAccess().getSourceActorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActor_in_ruleActorAlias1245);
            lv_source_0_0=ruleActor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActorAliasRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_0_0, 
                      		"Actor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleActorAlias1257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorAliasAccess().getAsKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:578:1: ( (lv_remote_2_0= ruleActor ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:579:1: (lv_remote_2_0= ruleActor )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:579:1: (lv_remote_2_0= ruleActor )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:580:3: lv_remote_2_0= ruleActor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActorAliasAccess().getRemoteActorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActor_in_ruleActorAlias1278);
            lv_remote_2_0=ruleActor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActorAliasRule());
              	        }
                     		set(
                     			current, 
                     			"remote",
                      		lv_remote_2_0, 
                      		"Actor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActorAlias"


    // $ANTLR start "entryRuleComponentDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:604:1: entryRuleComponentDeclaration returns [EObject current=null] : iv_ruleComponentDeclaration= ruleComponentDeclaration EOF ;
    public final EObject entryRuleComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:605:2: (iv_ruleComponentDeclaration= ruleComponentDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:606:2: iv_ruleComponentDeclaration= ruleComponentDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleComponentDeclaration_in_entryRuleComponentDeclaration1314);
            iv_ruleComponentDeclaration=ruleComponentDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentDeclaration1324); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentDeclaration"


    // $ANTLR start "ruleComponentDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:613:1: ruleComponentDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_aliases_3_0= ruleActorAlias ) ) (otherlv_4= ',' ( (lv_aliases_5_0= ruleActorAlias ) ) )* )? ) ;
    public final EObject ruleComponentDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_aliases_3_0 = null;

        EObject lv_aliases_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:616:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_aliases_3_0= ruleActorAlias ) ) (otherlv_4= ',' ( (lv_aliases_5_0= ruleActorAlias ) ) )* )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:617:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_aliases_3_0= ruleActorAlias ) ) (otherlv_4= ',' ( (lv_aliases_5_0= ruleActorAlias ) ) )* )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:617:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_aliases_3_0= ruleActorAlias ) ) (otherlv_4= ',' ( (lv_aliases_5_0= ruleActorAlias ) ) )* )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:617:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_aliases_3_0= ruleActorAlias ) ) (otherlv_4= ',' ( (lv_aliases_5_0= ruleActorAlias ) ) )* )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:617:2: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:618:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:618:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:619:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentDeclarationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDeclaration1369); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getComponentDeclarationAccess().getInteractorInteractorDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:630:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:631:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:631:1: (lv_name_1_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:632:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentDeclaration1386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getComponentDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:648:2: (otherlv_2= 'with' ( (lv_aliases_3_0= ruleActorAlias ) ) (otherlv_4= ',' ( (lv_aliases_5_0= ruleActorAlias ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:648:4: otherlv_2= 'with' ( (lv_aliases_3_0= ruleActorAlias ) ) (otherlv_4= ',' ( (lv_aliases_5_0= ruleActorAlias ) ) )*
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleComponentDeclaration1404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getComponentDeclarationAccess().getWithKeyword_2_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:652:1: ( (lv_aliases_3_0= ruleActorAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:653:1: (lv_aliases_3_0= ruleActorAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:653:1: (lv_aliases_3_0= ruleActorAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:654:3: lv_aliases_3_0= ruleActorAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentDeclarationAccess().getAliasesActorAliasParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleActorAlias_in_ruleComponentDeclaration1425);
                    lv_aliases_3_0=ruleActorAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"aliases",
                              		lv_aliases_3_0, 
                              		"ActorAlias");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:670:2: (otherlv_4= ',' ( (lv_aliases_5_0= ruleActorAlias ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==23) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:670:4: otherlv_4= ',' ( (lv_aliases_5_0= ruleActorAlias ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleComponentDeclaration1438); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getComponentDeclarationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:1: ( (lv_aliases_5_0= ruleActorAlias ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:675:1: (lv_aliases_5_0= ruleActorAlias )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:675:1: (lv_aliases_5_0= ruleActorAlias )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:676:3: lv_aliases_5_0= ruleActorAlias
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getComponentDeclarationAccess().getAliasesActorAliasParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleActorAlias_in_ruleComponentDeclaration1459);
                    	    lv_aliases_5_0=ruleActorAlias();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getComponentDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"aliases",
                    	              		lv_aliases_5_0, 
                    	              		"ActorAlias");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentDeclaration"


    // $ANTLR start "entryRuleEventReception"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:700:1: entryRuleEventReception returns [EObject current=null] : iv_ruleEventReception= ruleEventReception EOF ;
    public final EObject entryRuleEventReception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventReception = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:701:2: (iv_ruleEventReception= ruleEventReception EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:702:2: iv_ruleEventReception= ruleEventReception EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventReceptionRule()); 
            }
            pushFollow(FOLLOW_ruleEventReception_in_entryRuleEventReception1499);
            iv_ruleEventReception=ruleEventReception();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventReception; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventReception1509); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventReception"


    // $ANTLR start "ruleEventReception"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:709:1: ruleEventReception returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleComponent ) ) )? ) | ( (lv_base_3_0= 'init' ) ) ) ;
    public final EObject ruleEventReception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_base_3_0=null;
        EObject lv_source_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:712:28: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleComponent ) ) )? ) | ( (lv_base_3_0= 'init' ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:713:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleComponent ) ) )? ) | ( (lv_base_3_0= 'init' ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:713:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleComponent ) ) )? ) | ( (lv_base_3_0= 'init' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:713:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleComponent ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:713:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleComponent ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:713:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleComponent ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:713:3: ( (otherlv_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:714:1: (otherlv_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:714:1: (otherlv_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:715:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventReceptionRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventReception1555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getEventReceptionAccess().getInstanceEventDeclarationCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:726:2: (otherlv_1= 'from' ( (lv_source_2_0= ruleComponent ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==24) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:726:4: otherlv_1= 'from' ( (lv_source_2_0= ruleComponent ) )
                            {
                            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEventReception1568); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getEventReceptionAccess().getFromKeyword_0_1_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:730:1: ( (lv_source_2_0= ruleComponent ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:731:1: (lv_source_2_0= ruleComponent )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:731:1: (lv_source_2_0= ruleComponent )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:732:3: lv_source_2_0= ruleComponent
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEventReceptionAccess().getSourceComponentParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleComponent_in_ruleEventReception1589);
                            lv_source_2_0=ruleComponent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEventReceptionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"source",
                                      		lv_source_2_0, 
                                      		"Component");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:749:6: ( (lv_base_3_0= 'init' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:749:6: ( (lv_base_3_0= 'init' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:750:1: (lv_base_3_0= 'init' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:750:1: (lv_base_3_0= 'init' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:751:3: lv_base_3_0= 'init'
                    {
                    lv_base_3_0=(Token)match(input,25,FOLLOW_25_in_ruleEventReception1616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_base_3_0, grammarAccess.getEventReceptionAccess().getBaseInitKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventReceptionRule());
                      	        }
                             		setWithLastConsumed(current, "base", lv_base_3_0, "init");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventReception"


    // $ANTLR start "entryRuleEventEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:774:1: entryRuleEventEmission returns [EObject current=null] : iv_ruleEventEmission= ruleEventEmission EOF ;
    public final EObject entryRuleEventEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventEmission = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:775:2: (iv_ruleEventEmission= ruleEventEmission EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:776:2: iv_ruleEventEmission= ruleEventEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleEventEmission_in_entryRuleEventEmission1667);
            iv_ruleEventEmission=ruleEventEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventEmission1677); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventEmission"


    // $ANTLR start "ruleEventEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:783:1: ruleEventEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) ) )? ) ;
    public final EObject ruleEventEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_destination_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:786:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:787:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:787:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:787:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:787:2: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:788:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:788:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:789:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventEmission1722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEventEmissionAccess().getInstanceEventDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:800:2: (otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:800:4: otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleEventEmission1735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEventEmissionAccess().getToKeyword_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:804:1: ( (lv_destination_2_0= ruleComponent ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:805:1: (lv_destination_2_0= ruleComponent )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:805:1: (lv_destination_2_0= ruleComponent )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:806:3: lv_destination_2_0= ruleComponent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventEmissionAccess().getDestinationComponentParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComponent_in_ruleEventEmission1756);
                    lv_destination_2_0=ruleComponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventEmissionRule());
                      	        }
                             		set(
                             			current, 
                             			"destination",
                              		lv_destination_2_0, 
                              		"Component");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventEmission"


    // $ANTLR start "entryRuleFlowEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:830:1: entryRuleFlowEmission returns [EObject current=null] : iv_ruleFlowEmission= ruleFlowEmission EOF ;
    public final EObject entryRuleFlowEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowEmission = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:831:2: (iv_ruleFlowEmission= ruleFlowEmission EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:832:2: iv_ruleFlowEmission= ruleFlowEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleFlowEmission_in_entryRuleFlowEmission1794);
            iv_ruleFlowEmission=ruleFlowEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlowEmission1804); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlowEmission"


    // $ANTLR start "ruleFlowEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:839:1: ruleFlowEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) ) )? ) ;
    public final EObject ruleFlowEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_destination_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:842:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:843:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:843:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:843:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:843:2: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:844:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:844:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:845:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFlowEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFlowEmission1849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getFlowEmissionAccess().getInstanceFlowDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:856:2: (otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:856:4: otherlv_1= 'to' ( (lv_destination_2_0= ruleComponent ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleFlowEmission1862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFlowEmissionAccess().getToKeyword_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:860:1: ( (lv_destination_2_0= ruleComponent ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:861:1: (lv_destination_2_0= ruleComponent )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:861:1: (lv_destination_2_0= ruleComponent )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:862:3: lv_destination_2_0= ruleComponent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFlowEmissionAccess().getDestinationComponentParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComponent_in_ruleFlowEmission1883);
                    lv_destination_2_0=ruleComponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFlowEmissionRule());
                      	        }
                             		set(
                             			current, 
                             			"destination",
                              		lv_destination_2_0, 
                              		"Component");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlowEmission"


    // $ANTLR start "entryRuleSignalDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:886:1: entryRuleSignalDeclaration returns [EObject current=null] : iv_ruleSignalDeclaration= ruleSignalDeclaration EOF ;
    public final EObject entryRuleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:887:2: (iv_ruleSignalDeclaration= ruleSignalDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:888:2: iv_ruleSignalDeclaration= ruleSignalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration1921);
            iv_ruleSignalDeclaration=ruleSignalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDeclaration1931); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalDeclaration"


    // $ANTLR start "ruleSignalDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:895:1: ruleSignalDeclaration returns [EObject current=null] : (this_EventDeclaration_0= ruleEventDeclaration | this_FlowDeclaration_1= ruleFlowDeclaration ) ;
    public final EObject ruleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_EventDeclaration_0 = null;

        EObject this_FlowDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:898:28: ( (this_EventDeclaration_0= ruleEventDeclaration | this_FlowDeclaration_1= ruleFlowDeclaration ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:899:1: (this_EventDeclaration_0= ruleEventDeclaration | this_FlowDeclaration_1= ruleFlowDeclaration )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:899:1: (this_EventDeclaration_0= ruleEventDeclaration | this_FlowDeclaration_1= ruleFlowDeclaration )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:900:5: this_EventDeclaration_0= ruleEventDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignalDeclarationAccess().getEventDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventDeclaration_in_ruleSignalDeclaration1978);
                    this_EventDeclaration_0=ruleEventDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EventDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:910:5: this_FlowDeclaration_1= ruleFlowDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignalDeclarationAccess().getFlowDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFlowDeclaration_in_ruleSignalDeclaration2005);
                    this_FlowDeclaration_1=ruleFlowDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FlowDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignalDeclaration"


    // $ANTLR start "entryRuleEventDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:926:1: entryRuleEventDeclaration returns [EObject current=null] : iv_ruleEventDeclaration= ruleEventDeclaration EOF ;
    public final EObject entryRuleEventDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:927:2: (iv_ruleEventDeclaration= ruleEventDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:928:2: iv_ruleEventDeclaration= ruleEventDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclaration_in_entryRuleEventDeclaration2040);
            iv_ruleEventDeclaration=ruleEventDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclaration2050); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventDeclaration"


    // $ANTLR start "ruleEventDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:935:1: ruleEventDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) ) )? (otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) ) )* ) ;
    public final EObject ruleEventDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_0_0 = null;

        EObject lv_source_4_0 = null;

        EObject lv_destinations_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:938:28: ( ( ( (lv_type_0_0= ruleDataType ) ) otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) ) )? (otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:939:1: ( ( (lv_type_0_0= ruleDataType ) ) otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) ) )? (otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:939:1: ( ( (lv_type_0_0= ruleDataType ) ) otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) ) )? (otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:939:2: ( (lv_type_0_0= ruleDataType ) ) otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) ) )? (otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:939:2: ( (lv_type_0_0= ruleDataType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:940:1: (lv_type_0_0= ruleDataType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:940:1: (lv_type_0_0= ruleDataType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:941:3: lv_type_0_0= ruleDataType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDeclarationAccess().getTypeDataTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataType_in_ruleEventDeclaration2096);
            lv_type_0_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"DataType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleEventDeclaration2108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDeclarationAccess().getEventKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:961:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:962:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:962:1: (lv_name_2_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:963:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDeclaration2125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEventDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:979:2: (otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:979:4: otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleEventDeclaration2143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDeclarationAccess().getFromKeyword_3_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:983:1: ( (lv_source_4_0= ruleAccessibleEntity ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:984:1: (lv_source_4_0= ruleAccessibleEntity )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:984:1: (lv_source_4_0= ruleAccessibleEntity )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:985:3: lv_source_4_0= ruleAccessibleEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDeclarationAccess().getSourceAccessibleEntityParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessibleEntity_in_ruleEventDeclaration2164);
                    lv_source_4_0=ruleAccessibleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"source",
                              		lv_source_4_0, 
                              		"AccessibleEntity");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1001:4: (otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1001:6: otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) )
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleEventDeclaration2179); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getEventDeclarationAccess().getToKeyword_4_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1005:1: ( (lv_destinations_6_0= ruleAccessibleEntity ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1006:1: (lv_destinations_6_0= ruleAccessibleEntity )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1006:1: (lv_destinations_6_0= ruleAccessibleEntity )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1007:3: lv_destinations_6_0= ruleAccessibleEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEventDeclarationAccess().getDestinationsAccessibleEntityParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAccessibleEntity_in_ruleEventDeclaration2200);
            	    lv_destinations_6_0=ruleAccessibleEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEventDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"destinations",
            	              		lv_destinations_6_0, 
            	              		"AccessibleEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventDeclaration"


    // $ANTLR start "entryRuleFlowDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1031:1: entryRuleFlowDeclaration returns [EObject current=null] : iv_ruleFlowDeclaration= ruleFlowDeclaration EOF ;
    public final EObject entryRuleFlowDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1032:2: (iv_ruleFlowDeclaration= ruleFlowDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1033:2: iv_ruleFlowDeclaration= ruleFlowDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFlowDeclaration_in_entryRuleFlowDeclaration2238);
            iv_ruleFlowDeclaration=ruleFlowDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlowDeclaration2248); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlowDeclaration"


    // $ANTLR start "ruleFlowDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1040:1: ruleFlowDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) otherlv_1= 'flow' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) ) )? (otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) ) )* ) ;
    public final EObject ruleFlowDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_0_0 = null;

        EObject lv_source_4_0 = null;

        EObject lv_destinations_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1043:28: ( ( ( (lv_type_0_0= ruleDataType ) ) otherlv_1= 'flow' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) ) )? (otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1044:1: ( ( (lv_type_0_0= ruleDataType ) ) otherlv_1= 'flow' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) ) )? (otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1044:1: ( ( (lv_type_0_0= ruleDataType ) ) otherlv_1= 'flow' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) ) )? (otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1044:2: ( (lv_type_0_0= ruleDataType ) ) otherlv_1= 'flow' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) ) )? (otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1044:2: ( (lv_type_0_0= ruleDataType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1045:1: (lv_type_0_0= ruleDataType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1045:1: (lv_type_0_0= ruleDataType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1046:3: lv_type_0_0= ruleDataType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFlowDeclarationAccess().getTypeDataTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataType_in_ruleFlowDeclaration2294);
            lv_type_0_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFlowDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"DataType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleFlowDeclaration2306); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFlowDeclarationAccess().getFlowKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1066:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1067:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1067:1: (lv_name_2_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1068:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFlowDeclaration2323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getFlowDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFlowDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1084:2: (otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1084:4: otherlv_3= 'from' ( (lv_source_4_0= ruleAccessibleEntity ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleFlowDeclaration2341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFlowDeclarationAccess().getFromKeyword_3_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1088:1: ( (lv_source_4_0= ruleAccessibleEntity ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1089:1: (lv_source_4_0= ruleAccessibleEntity )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1089:1: (lv_source_4_0= ruleAccessibleEntity )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1090:3: lv_source_4_0= ruleAccessibleEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFlowDeclarationAccess().getSourceAccessibleEntityParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAccessibleEntity_in_ruleFlowDeclaration2362);
                    lv_source_4_0=ruleAccessibleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFlowDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"source",
                              		lv_source_4_0, 
                              		"AccessibleEntity");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1106:4: (otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1106:6: otherlv_5= 'to' ( (lv_destinations_6_0= ruleAccessibleEntity ) )
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleFlowDeclaration2377); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getFlowDeclarationAccess().getToKeyword_4_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1110:1: ( (lv_destinations_6_0= ruleAccessibleEntity ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1111:1: (lv_destinations_6_0= ruleAccessibleEntity )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1111:1: (lv_destinations_6_0= ruleAccessibleEntity )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1112:3: lv_destinations_6_0= ruleAccessibleEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFlowDeclarationAccess().getDestinationsAccessibleEntityParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAccessibleEntity_in_ruleFlowDeclaration2398);
            	    lv_destinations_6_0=ruleAccessibleEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFlowDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"destinations",
            	              		lv_destinations_6_0, 
            	              		"AccessibleEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlowDeclaration"


    // $ANTLR start "entryRuleBehaviorDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1136:1: entryRuleBehaviorDeclaration returns [EObject current=null] : iv_ruleBehaviorDeclaration= ruleBehaviorDeclaration EOF ;
    public final EObject entryRuleBehaviorDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1137:2: (iv_ruleBehaviorDeclaration= ruleBehaviorDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1138:2: iv_ruleBehaviorDeclaration= ruleBehaviorDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBehaviorDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleBehaviorDeclaration_in_entryRuleBehaviorDeclaration2436);
            iv_ruleBehaviorDeclaration=ruleBehaviorDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBehaviorDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehaviorDeclaration2446); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviorDeclaration"


    // $ANTLR start "ruleBehaviorDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1145:1: ruleBehaviorDeclaration returns [EObject current=null] : ( ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+ ) ;
    public final EObject ruleBehaviorDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cause_0_0 = null;

        EObject lv_effects_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1148:28: ( ( ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+ ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1149:1: ( ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+ )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1149:1: ( ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+ )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1149:2: ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1149:2: ( (lv_cause_0_0= ruleCause ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1150:1: (lv_cause_0_0= ruleCause )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1150:1: (lv_cause_0_0= ruleCause )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1151:3: lv_cause_0_0= ruleCause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBehaviorDeclarationAccess().getCauseCauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCause_in_ruleBehaviorDeclaration2492);
            lv_cause_0_0=ruleCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBehaviorDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"cause",
                      		lv_cause_0_0, 
                      		"Cause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleBehaviorDeclaration2504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBehaviorDeclarationAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1171:1: ( (lv_effects_2_0= ruleEffect ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32||(LA17_0>=34 && LA17_0<=35)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1172:1: (lv_effects_2_0= ruleEffect )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1172:1: (lv_effects_2_0= ruleEffect )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1173:3: lv_effects_2_0= ruleEffect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBehaviorDeclarationAccess().getEffectsEffectParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEffect_in_ruleBehaviorDeclaration2525);
            	    lv_effects_2_0=ruleEffect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBehaviorDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"effects",
            	              		lv_effects_2_0, 
            	              		"Effect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorDeclaration"


    // $ANTLR start "entryRuleCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1197:1: entryRuleCause returns [EObject current=null] : iv_ruleCause= ruleCause EOF ;
    public final EObject entryRuleCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1198:2: (iv_ruleCause= ruleCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1199:2: iv_ruleCause= ruleCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCauseRule()); 
            }
            pushFollow(FOLLOW_ruleCause_in_entryRuleCause2562);
            iv_ruleCause=ruleCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCause2572); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCause"


    // $ANTLR start "ruleCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1206:1: ruleCause returns [EObject current=null] : (this_OnCause_0= ruleOnCause | this_WhenCause_1= ruleWhenCause ) ;
    public final EObject ruleCause() throws RecognitionException {
        EObject current = null;

        EObject this_OnCause_0 = null;

        EObject this_WhenCause_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1209:28: ( (this_OnCause_0= ruleOnCause | this_WhenCause_1= ruleWhenCause ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1210:1: (this_OnCause_0= ruleOnCause | this_WhenCause_1= ruleWhenCause )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1210:1: (this_OnCause_0= ruleOnCause | this_WhenCause_1= ruleWhenCause )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            else if ( (LA18_0==31) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1211:5: this_OnCause_0= ruleOnCause
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCauseAccess().getOnCauseParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCause_in_ruleCause2619);
                    this_OnCause_0=ruleOnCause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OnCause_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1221:5: this_WhenCause_1= ruleWhenCause
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCauseAccess().getWhenCauseParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhenCause_in_ruleCause2646);
                    this_WhenCause_1=ruleWhenCause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WhenCause_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCause"


    // $ANTLR start "entryRuleOnCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1237:1: entryRuleOnCause returns [EObject current=null] : iv_ruleOnCause= ruleOnCause EOF ;
    public final EObject entryRuleOnCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1238:2: (iv_ruleOnCause= ruleOnCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1239:2: iv_ruleOnCause= ruleOnCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCauseRule()); 
            }
            pushFollow(FOLLOW_ruleOnCause_in_entryRuleOnCause2681);
            iv_ruleOnCause=ruleOnCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCause2691); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnCause"


    // $ANTLR start "ruleOnCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1246:1: ruleOnCause returns [EObject current=null] : (otherlv_0= 'on' ( (lv_event_1_0= ruleEventReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleOnCause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_event_1_0 = null;

        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1249:28: ( (otherlv_0= 'on' ( (lv_event_1_0= ruleEventReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1250:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleEventReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1250:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleEventReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1250:3: otherlv_0= 'on' ( (lv_event_1_0= ruleEventReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleOnCause2728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOnCauseAccess().getOnKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1254:1: ( (lv_event_1_0= ruleEventReception ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1255:1: (lv_event_1_0= ruleEventReception )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1255:1: (lv_event_1_0= ruleEventReception )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1256:3: lv_event_1_0= ruleEventReception
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOnCauseAccess().getEventEventReceptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEventReception_in_ruleOnCause2749);
            lv_event_1_0=ruleEventReception();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOnCauseRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_1_0, 
                      		"EventReception");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1272:2: (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1272:4: otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleOnCause2762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOnCauseAccess().getIfKeyword_2_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1276:1: ( (lv_guard_3_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1277:1: (lv_guard_3_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1277:1: (lv_guard_3_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1278:3: lv_guard_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOnCauseAccess().getGuardExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleOnCause2783);
                    lv_guard_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOnCauseRule());
                      	        }
                             		set(
                             			current, 
                             			"guard",
                              		lv_guard_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnCause"


    // $ANTLR start "entryRuleWhenCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1302:1: entryRuleWhenCause returns [EObject current=null] : iv_ruleWhenCause= ruleWhenCause EOF ;
    public final EObject entryRuleWhenCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1303:2: (iv_ruleWhenCause= ruleWhenCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1304:2: iv_ruleWhenCause= ruleWhenCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhenCauseRule()); 
            }
            pushFollow(FOLLOW_ruleWhenCause_in_entryRuleWhenCause2821);
            iv_ruleWhenCause=ruleWhenCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhenCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenCause2831); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenCause"


    // $ANTLR start "ruleWhenCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1311:1: ruleWhenCause returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleWhenCause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1314:28: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1315:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1315:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1315:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleWhenCause2868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhenCauseAccess().getWhenKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1319:1: ( (lv_condition_1_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1320:1: (lv_condition_1_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1320:1: (lv_condition_1_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1321:3: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhenCauseAccess().getConditionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhenCause2889);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhenCauseRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1337:2: (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1337:4: otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleWhenCause2902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getWhenCauseAccess().getIfKeyword_2_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1341:1: ( (lv_guard_3_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1342:1: (lv_guard_3_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1342:1: (lv_guard_3_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1343:3: lv_guard_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhenCauseAccess().getGuardExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleWhenCause2923);
                    lv_guard_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhenCauseRule());
                      	        }
                             		set(
                             			current, 
                             			"guard",
                              		lv_guard_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenCause"


    // $ANTLR start "entryRuleEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1367:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1368:2: (iv_ruleEffect= ruleEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1369:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect2961);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect2971); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1376:1: ruleEffect returns [EObject current=null] : (this_AlwaysEffect_0= ruleAlwaysEffect | this_SetEffect_1= ruleSetEffect | this_TriggerEffect_2= ruleTriggerEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_AlwaysEffect_0 = null;

        EObject this_SetEffect_1 = null;

        EObject this_TriggerEffect_2 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1379:28: ( (this_AlwaysEffect_0= ruleAlwaysEffect | this_SetEffect_1= ruleSetEffect | this_TriggerEffect_2= ruleTriggerEffect ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1380:1: (this_AlwaysEffect_0= ruleAlwaysEffect | this_SetEffect_1= ruleSetEffect | this_TriggerEffect_2= ruleTriggerEffect )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1380:1: (this_AlwaysEffect_0= ruleAlwaysEffect | this_SetEffect_1= ruleSetEffect | this_TriggerEffect_2= ruleTriggerEffect )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1381:5: this_AlwaysEffect_0= ruleAlwaysEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAlwaysEffectParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEffect_in_ruleEffect3018);
                    this_AlwaysEffect_0=ruleAlwaysEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlwaysEffect_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1391:5: this_SetEffect_1= ruleSetEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getSetEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetEffect_in_ruleEffect3045);
                    this_SetEffect_1=ruleSetEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetEffect_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1401:5: this_TriggerEffect_2= ruleTriggerEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getTriggerEffectParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTriggerEffect_in_ruleEffect3072);
                    this_TriggerEffect_2=ruleTriggerEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TriggerEffect_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleAlwaysEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1417:1: entryRuleAlwaysEffect returns [EObject current=null] : iv_ruleAlwaysEffect= ruleAlwaysEffect EOF ;
    public final EObject entryRuleAlwaysEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1418:2: (iv_ruleAlwaysEffect= ruleAlwaysEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1419:2: iv_ruleAlwaysEffect= ruleAlwaysEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEffectRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEffect_in_entryRuleAlwaysEffect3107);
            iv_ruleAlwaysEffect=ruleAlwaysEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEffect3117); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlwaysEffect"


    // $ANTLR start "ruleAlwaysEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1426:1: ruleAlwaysEffect returns [EObject current=null] : (otherlv_0= 'always' ( (lv_target_1_0= ruleFlowEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleAlwaysEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1429:28: ( (otherlv_0= 'always' ( (lv_target_1_0= ruleFlowEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1430:1: (otherlv_0= 'always' ( (lv_target_1_0= ruleFlowEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1430:1: (otherlv_0= 'always' ( (lv_target_1_0= ruleFlowEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1430:3: otherlv_0= 'always' ( (lv_target_1_0= ruleFlowEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleAlwaysEffect3154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlwaysEffectAccess().getAlwaysKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1434:1: ( (lv_target_1_0= ruleFlowEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1435:1: (lv_target_1_0= ruleFlowEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1435:1: (lv_target_1_0= ruleFlowEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1436:3: lv_target_1_0= ruleFlowEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlwaysEffectAccess().getTargetFlowEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFlowEmission_in_ruleAlwaysEffect3175);
            lv_target_1_0=ruleFlowEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAlwaysEffectRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"FlowEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleAlwaysEffect3187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlwaysEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1456:1: ( (lv_value_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1457:1: (lv_value_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1457:1: (lv_value_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1458:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlwaysEffectAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAlwaysEffect3208);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAlwaysEffectRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlwaysEffect"


    // $ANTLR start "entryRuleSetEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1482:1: entryRuleSetEffect returns [EObject current=null] : iv_ruleSetEffect= ruleSetEffect EOF ;
    public final EObject entryRuleSetEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1483:2: (iv_ruleSetEffect= ruleSetEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1484:2: iv_ruleSetEffect= ruleSetEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetEffectRule()); 
            }
            pushFollow(FOLLOW_ruleSetEffect_in_entryRuleSetEffect3244);
            iv_ruleSetEffect=ruleSetEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetEffect3254); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetEffect"


    // $ANTLR start "ruleSetEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1491:1: ruleSetEffect returns [EObject current=null] : (otherlv_0= 'set' ( (lv_target_1_0= ruleFlowEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleSetEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1494:28: ( (otherlv_0= 'set' ( (lv_target_1_0= ruleFlowEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1495:1: (otherlv_0= 'set' ( (lv_target_1_0= ruleFlowEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1495:1: (otherlv_0= 'set' ( (lv_target_1_0= ruleFlowEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1495:3: otherlv_0= 'set' ( (lv_target_1_0= ruleFlowEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleSetEffect3291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSetEffectAccess().getSetKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1499:1: ( (lv_target_1_0= ruleFlowEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1500:1: (lv_target_1_0= ruleFlowEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1500:1: (lv_target_1_0= ruleFlowEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1501:3: lv_target_1_0= ruleFlowEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetEffectAccess().getTargetFlowEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFlowEmission_in_ruleSetEffect3312);
            lv_target_1_0=ruleFlowEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetEffectRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"FlowEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleSetEffect3324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSetEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1521:1: ( (lv_value_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1522:1: (lv_value_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1522:1: (lv_value_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1523:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetEffectAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSetEffect3345);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetEffectRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetEffect"


    // $ANTLR start "entryRuleTriggerEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1547:1: entryRuleTriggerEffect returns [EObject current=null] : iv_ruleTriggerEffect= ruleTriggerEffect EOF ;
    public final EObject entryRuleTriggerEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1548:2: (iv_ruleTriggerEffect= ruleTriggerEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1549:2: iv_ruleTriggerEffect= ruleTriggerEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerEffectRule()); 
            }
            pushFollow(FOLLOW_ruleTriggerEffect_in_entryRuleTriggerEffect3381);
            iv_ruleTriggerEffect=ruleTriggerEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTriggerEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTriggerEffect3391); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerEffect"


    // $ANTLR start "ruleTriggerEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1556:1: ruleTriggerEffect returns [EObject current=null] : (otherlv_0= 'trigger' ( (lv_target_1_0= ruleEventEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleTriggerEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1559:28: ( (otherlv_0= 'trigger' ( (lv_target_1_0= ruleEventEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1560:1: (otherlv_0= 'trigger' ( (lv_target_1_0= ruleEventEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1560:1: (otherlv_0= 'trigger' ( (lv_target_1_0= ruleEventEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1560:3: otherlv_0= 'trigger' ( (lv_target_1_0= ruleEventEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleTriggerEffect3428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTriggerEffectAccess().getTriggerKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1564:1: ( (lv_target_1_0= ruleEventEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1565:1: (lv_target_1_0= ruleEventEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1565:1: (lv_target_1_0= ruleEventEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1566:3: lv_target_1_0= ruleEventEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTriggerEffectAccess().getTargetEventEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEventEmission_in_ruleTriggerEffect3449);
            lv_target_1_0=ruleEventEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTriggerEffectRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"EventEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleTriggerEffect3461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTriggerEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1586:1: ( (lv_value_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1587:1: (lv_value_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1587:1: (lv_value_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1588:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTriggerEffectAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleTriggerEffect3482);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTriggerEffectRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerEffect"


    // $ANTLR start "entryRuleExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1612:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1613:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1614:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3518);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3528); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1621:1: ruleExpression returns [EObject current=null] : this_NumberExpression_0= ruleNumberExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1624:28: (this_NumberExpression_0= ruleNumberExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1626:5: this_NumberExpression_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getNumberExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExpression3574);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleDataTypeDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1642:1: entryRuleDataTypeDeclaration returns [EObject current=null] : iv_ruleDataTypeDeclaration= ruleDataTypeDeclaration EOF ;
    public final EObject entryRuleDataTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1643:2: (iv_ruleDataTypeDeclaration= ruleDataTypeDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1644:2: iv_ruleDataTypeDeclaration= ruleDataTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeDeclaration_in_entryRuleDataTypeDeclaration3608);
            iv_ruleDataTypeDeclaration=ruleDataTypeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeDeclaration3618); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeDeclaration"


    // $ANTLR start "ruleDataTypeDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1651:1: ruleDataTypeDeclaration returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_fields_4_0= ruleField ) )* ) ;
    public final EObject ruleDataTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_fields_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1654:28: ( (otherlv_0= 'data' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_fields_4_0= ruleField ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1655:1: (otherlv_0= 'data' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_fields_4_0= ruleField ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1655:1: (otherlv_0= 'data' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_fields_4_0= ruleField ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1655:3: otherlv_0= 'data' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_fields_4_0= ruleField ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleDataTypeDeclaration3655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDataTypeDeclarationAccess().getDataKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleDataTypeDeclaration3667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataTypeDeclarationAccess().getTypeKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1663:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1664:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1664:1: (lv_name_2_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1665:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeDeclaration3684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDataTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataTypeDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDataTypeDeclaration3701); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDataTypeDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1685:1: ( (lv_fields_4_0= ruleField ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=38 && LA22_0<=43)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1686:1: (lv_fields_4_0= ruleField )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1686:1: (lv_fields_4_0= ruleField )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1687:3: lv_fields_4_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataTypeDeclarationAccess().getFieldsFieldParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_in_ruleDataTypeDeclaration3722);
            	    lv_fields_4_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataTypeDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_4_0, 
            	              		"Field");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeDeclaration"


    // $ANTLR start "entryRuleField"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1711:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1712:2: (iv_ruleField= ruleField EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1713:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField3759);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField3769); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1720:1: ruleField returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1723:28: ( ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1724:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1724:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1724:2: ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1724:2: ( (lv_type_0_0= ruleDataType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1725:1: (lv_type_0_0= ruleDataType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1725:1: (lv_type_0_0= ruleDataType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1726:3: lv_type_0_0= ruleDataType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getTypeDataTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataType_in_ruleField3815);
            lv_type_0_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"DataType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1742:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1743:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1743:1: (lv_name_1_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1744:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField3832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleDataType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1768:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1769:2: (iv_ruleDataType= ruleDataType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1770:2: iv_ruleDataType= ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType3873);
            iv_ruleDataType=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType3883); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1777:1: ruleDataType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_base_1_0= ruleDataTypeBase ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_base_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1780:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_base_1_0= ruleDataTypeBase ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1781:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_base_1_0= ruleDataTypeBase ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1781:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_base_1_0= ruleDataTypeBase ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=38 && LA23_0<=43)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1781:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1781:2: ( (otherlv_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1782:1: (otherlv_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1782:1: (otherlv_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1783:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType3928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getCompoundDataTypeDeclarationCrossReference_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1795:6: ( (lv_base_1_0= ruleDataTypeBase ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1795:6: ( (lv_base_1_0= ruleDataTypeBase ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1796:1: (lv_base_1_0= ruleDataTypeBase )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1796:1: (lv_base_1_0= ruleDataTypeBase )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1797:3: lv_base_1_0= ruleDataTypeBase
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeAccess().getBaseDataTypeBaseParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataTypeBase_in_ruleDataType3955);
                    lv_base_1_0=ruleDataTypeBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"base",
                              		lv_base_1_0, 
                              		"DataTypeBase");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleDataTypeBase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1821:1: entryRuleDataTypeBase returns [String current=null] : iv_ruleDataTypeBase= ruleDataTypeBase EOF ;
    public final String entryRuleDataTypeBase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataTypeBase = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1822:2: (iv_ruleDataTypeBase= ruleDataTypeBase EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1823:2: iv_ruleDataTypeBase= ruleDataTypeBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeBaseRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeBase_in_entryRuleDataTypeBase3992);
            iv_ruleDataTypeBase=ruleDataTypeBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeBase.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeBase4003); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeBase"


    // $ANTLR start "ruleDataTypeBase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1830:1: ruleDataTypeBase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'reference' ) ;
    public final AntlrDatatypeRuleToken ruleDataTypeBase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1833:28: ( (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'reference' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1834:1: (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'reference' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1834:1: (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'reference' )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt24=1;
                }
                break;
            case 39:
                {
                alt24=2;
                }
                break;
            case 40:
                {
                alt24=3;
                }
                break;
            case 41:
                {
                alt24=4;
                }
                break;
            case 42:
                {
                alt24=5;
                }
                break;
            case 43:
                {
                alt24=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1835:2: kw= 'void'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleDataTypeBase4041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataTypeBaseAccess().getVoidKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1842:2: kw= 'symbol'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleDataTypeBase4060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataTypeBaseAccess().getSymbolKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1849:2: kw= 'number'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleDataTypeBase4079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataTypeBaseAccess().getNumberKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1856:2: kw= 'text'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleDataTypeBase4098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataTypeBaseAccess().getTextKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1863:2: kw= 'time'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleDataTypeBase4117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataTypeBaseAccess().getTimeKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1870:2: kw= 'reference'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleDataTypeBase4136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataTypeBaseAccess().getReferenceKeyword_5()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeBase"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1883:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1884:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1885:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression4176);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression4186); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1892:1: ruleBooleanExpression returns [EObject current=null] : this_BooleanDisjonction_0= ruleBooleanDisjonction ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanDisjonction_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1895:28: (this_BooleanDisjonction_0= ruleBooleanDisjonction )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1897:5: this_BooleanDisjonction_0= ruleBooleanDisjonction
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanDisjonctionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanDisjonction_in_ruleBooleanExpression4232);
            this_BooleanDisjonction_0=ruleBooleanDisjonction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanDisjonction_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanDisjonction"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1913:1: entryRuleBooleanDisjonction returns [EObject current=null] : iv_ruleBooleanDisjonction= ruleBooleanDisjonction EOF ;
    public final EObject entryRuleBooleanDisjonction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanDisjonction = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1914:2: (iv_ruleBooleanDisjonction= ruleBooleanDisjonction EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1915:2: iv_ruleBooleanDisjonction= ruleBooleanDisjonction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanDisjonctionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanDisjonction_in_entryRuleBooleanDisjonction4266);
            iv_ruleBooleanDisjonction=ruleBooleanDisjonction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanDisjonction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanDisjonction4276); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanDisjonction"


    // $ANTLR start "ruleBooleanDisjonction"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1922:1: ruleBooleanDisjonction returns [EObject current=null] : (this_BooleanConjonction_0= ruleBooleanConjonction ( ( () otherlv_2= 'or' ) ( (lv_right_3_0= ruleBooleanConjonction ) ) )* ) ;
    public final EObject ruleBooleanDisjonction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BooleanConjonction_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1925:28: ( (this_BooleanConjonction_0= ruleBooleanConjonction ( ( () otherlv_2= 'or' ) ( (lv_right_3_0= ruleBooleanConjonction ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1926:1: (this_BooleanConjonction_0= ruleBooleanConjonction ( ( () otherlv_2= 'or' ) ( (lv_right_3_0= ruleBooleanConjonction ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1926:1: (this_BooleanConjonction_0= ruleBooleanConjonction ( ( () otherlv_2= 'or' ) ( (lv_right_3_0= ruleBooleanConjonction ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1927:5: this_BooleanConjonction_0= ruleBooleanConjonction ( ( () otherlv_2= 'or' ) ( (lv_right_3_0= ruleBooleanConjonction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBooleanDisjonctionAccess().getBooleanConjonctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanConjonction_in_ruleBooleanDisjonction4323);
            this_BooleanConjonction_0=ruleBooleanConjonction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanConjonction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1935:1: ( ( () otherlv_2= 'or' ) ( (lv_right_3_0= ruleBooleanConjonction ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1935:2: ( () otherlv_2= 'or' ) ( (lv_right_3_0= ruleBooleanConjonction ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1935:2: ( () otherlv_2= 'or' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1935:3: () otherlv_2= 'or'
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1935:3: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1936:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBooleanDisjonctionAccess().getBooleanDisjonctionLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleBooleanDisjonction4345); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBooleanDisjonctionAccess().getOrKeyword_1_0_1());
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1945:2: ( (lv_right_3_0= ruleBooleanConjonction ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1946:1: (lv_right_3_0= ruleBooleanConjonction )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1946:1: (lv_right_3_0= ruleBooleanConjonction )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1947:3: lv_right_3_0= ruleBooleanConjonction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBooleanDisjonctionAccess().getRightBooleanConjonctionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanConjonction_in_ruleBooleanDisjonction4367);
            	    lv_right_3_0=ruleBooleanConjonction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBooleanDisjonctionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BooleanConjonction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanDisjonction"


    // $ANTLR start "entryRuleBooleanConjonction"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1971:1: entryRuleBooleanConjonction returns [EObject current=null] : iv_ruleBooleanConjonction= ruleBooleanConjonction EOF ;
    public final EObject entryRuleBooleanConjonction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConjonction = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1972:2: (iv_ruleBooleanConjonction= ruleBooleanConjonction EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1973:2: iv_ruleBooleanConjonction= ruleBooleanConjonction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanConjonctionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanConjonction_in_entryRuleBooleanConjonction4405);
            iv_ruleBooleanConjonction=ruleBooleanConjonction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanConjonction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanConjonction4415); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanConjonction"


    // $ANTLR start "ruleBooleanConjonction"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1980:1: ruleBooleanConjonction returns [EObject current=null] : (this_BooleanUnary_0= ruleBooleanUnary ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleBooleanUnary ) ) )* ) ;
    public final EObject ruleBooleanConjonction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BooleanUnary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1983:28: ( (this_BooleanUnary_0= ruleBooleanUnary ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleBooleanUnary ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1984:1: (this_BooleanUnary_0= ruleBooleanUnary ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleBooleanUnary ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1984:1: (this_BooleanUnary_0= ruleBooleanUnary ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleBooleanUnary ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1985:5: this_BooleanUnary_0= ruleBooleanUnary ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleBooleanUnary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBooleanConjonctionAccess().getBooleanUnaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnary_in_ruleBooleanConjonction4462);
            this_BooleanUnary_0=ruleBooleanUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1993:1: ( ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleBooleanUnary ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1993:2: ( () otherlv_2= 'and' ) ( (lv_right_3_0= ruleBooleanUnary ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1993:2: ( () otherlv_2= 'and' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1993:3: () otherlv_2= 'and'
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1993:3: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1994:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBooleanConjonctionAccess().getBooleanConjonctionLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleBooleanConjonction4484); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBooleanConjonctionAccess().getAndKeyword_1_0_1());
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2003:2: ( (lv_right_3_0= ruleBooleanUnary ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2004:1: (lv_right_3_0= ruleBooleanUnary )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2004:1: (lv_right_3_0= ruleBooleanUnary )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2005:3: lv_right_3_0= ruleBooleanUnary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBooleanConjonctionAccess().getRightBooleanUnaryParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnary_in_ruleBooleanConjonction4506);
            	    lv_right_3_0=ruleBooleanUnary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBooleanConjonctionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BooleanUnary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanConjonction"


    // $ANTLR start "entryRuleBooleanUnary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2029:1: entryRuleBooleanUnary returns [EObject current=null] : iv_ruleBooleanUnary= ruleBooleanUnary EOF ;
    public final EObject entryRuleBooleanUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnary = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2030:2: (iv_ruleBooleanUnary= ruleBooleanUnary EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2031:2: iv_ruleBooleanUnary= ruleBooleanUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnary_in_entryRuleBooleanUnary4544);
            iv_ruleBooleanUnary=ruleBooleanUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnary4554); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanUnary"


    // $ANTLR start "ruleBooleanUnary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2038:1: ruleBooleanUnary returns [EObject current=null] : (this_BooleanTerminalExpression_0= ruleBooleanTerminalExpression | ( ( () otherlv_2= '!' ) ( (lv_operand_3_0= ruleBooleanTerminalExpression ) ) ) ) ;
    public final EObject ruleBooleanUnary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BooleanTerminalExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2041:28: ( (this_BooleanTerminalExpression_0= ruleBooleanTerminalExpression | ( ( () otherlv_2= '!' ) ( (lv_operand_3_0= ruleBooleanTerminalExpression ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:1: (this_BooleanTerminalExpression_0= ruleBooleanTerminalExpression | ( ( () otherlv_2= '!' ) ( (lv_operand_3_0= ruleBooleanTerminalExpression ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:1: (this_BooleanTerminalExpression_0= ruleBooleanTerminalExpression | ( ( () otherlv_2= '!' ) ( (lv_operand_3_0= ruleBooleanTerminalExpression ) ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47||(LA27_0>=60 && LA27_0<=63)) ) {
                alt27=1;
            }
            else if ( (LA27_0==46) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2043:5: this_BooleanTerminalExpression_0= ruleBooleanTerminalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnaryAccess().getBooleanTerminalExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanTerminalExpression_in_ruleBooleanUnary4601);
                    this_BooleanTerminalExpression_0=ruleBooleanTerminalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanTerminalExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2052:6: ( ( () otherlv_2= '!' ) ( (lv_operand_3_0= ruleBooleanTerminalExpression ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2052:6: ( ( () otherlv_2= '!' ) ( (lv_operand_3_0= ruleBooleanTerminalExpression ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2052:7: ( () otherlv_2= '!' ) ( (lv_operand_3_0= ruleBooleanTerminalExpression ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2052:7: ( () otherlv_2= '!' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2052:8: () otherlv_2= '!'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2052:8: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2053:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBooleanUnaryAccess().getBooleanNegationAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleBooleanUnary4629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBooleanUnaryAccess().getExclamationMarkKeyword_1_0_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2062:2: ( (lv_operand_3_0= ruleBooleanTerminalExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2063:1: (lv_operand_3_0= ruleBooleanTerminalExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2063:1: (lv_operand_3_0= ruleBooleanTerminalExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2064:3: lv_operand_3_0= ruleBooleanTerminalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBooleanUnaryAccess().getOperandBooleanTerminalExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanTerminalExpression_in_ruleBooleanUnary4651);
                    lv_operand_3_0=ruleBooleanTerminalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBooleanUnaryRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"BooleanTerminalExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanUnary"


    // $ANTLR start "entryRuleBooleanTerminalExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2088:1: entryRuleBooleanTerminalExpression returns [EObject current=null] : iv_ruleBooleanTerminalExpression= ruleBooleanTerminalExpression EOF ;
    public final EObject entryRuleBooleanTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanTerminalExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2089:2: (iv_ruleBooleanTerminalExpression= ruleBooleanTerminalExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2090:2: iv_ruleBooleanTerminalExpression= ruleBooleanTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanTerminalExpression_in_entryRuleBooleanTerminalExpression4688);
            iv_ruleBooleanTerminalExpression=ruleBooleanTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanTerminalExpression4698); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanTerminalExpression"


    // $ANTLR start "ruleBooleanTerminalExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2097:1: ruleBooleanTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_BooleanExpression_1= ruleBooleanExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleBooleanLiteral ) ) ) ) ;
    public final EObject ruleBooleanTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_BooleanExpression_1 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2100:28: ( ( (otherlv_0= '(' this_BooleanExpression_1= ruleBooleanExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleBooleanLiteral ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2101:1: ( (otherlv_0= '(' this_BooleanExpression_1= ruleBooleanExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleBooleanLiteral ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2101:1: ( (otherlv_0= '(' this_BooleanExpression_1= ruleBooleanExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleBooleanLiteral ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=60 && LA28_0<=63)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2101:2: (otherlv_0= '(' this_BooleanExpression_1= ruleBooleanExpression otherlv_2= ')' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2101:2: (otherlv_0= '(' this_BooleanExpression_1= ruleBooleanExpression otherlv_2= ')' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2101:4: otherlv_0= '(' this_BooleanExpression_1= ruleBooleanExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleBooleanTerminalExpression4736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getBooleanTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanTerminalExpressionAccess().getBooleanExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleBooleanTerminalExpression4758);
                    this_BooleanExpression_1=ruleBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleBooleanTerminalExpression4769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBooleanTerminalExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2119:6: ( () ( (lv_value_4_0= ruleBooleanLiteral ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2119:6: ( () ( (lv_value_4_0= ruleBooleanLiteral ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2119:7: () ( (lv_value_4_0= ruleBooleanLiteral ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2119:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2120:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBooleanTerminalExpressionAccess().getBooleanLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2125:2: ( (lv_value_4_0= ruleBooleanLiteral ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2126:1: (lv_value_4_0= ruleBooleanLiteral )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2126:1: (lv_value_4_0= ruleBooleanLiteral )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2127:3: lv_value_4_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBooleanTerminalExpressionAccess().getValueBooleanLiteralParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanTerminalExpression4807);
                    lv_value_4_0=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBooleanTerminalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"BooleanLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanTerminalExpression"


    // $ANTLR start "entryRuleNumberExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2151:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2152:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2153:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression4844);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression4854); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberExpression"


    // $ANTLR start "ruleNumberExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2160:1: ruleNumberExpression returns [EObject current=null] : this_NumberCompoundExpression_0= ruleNumberCompoundExpression ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberCompoundExpression_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2163:28: (this_NumberCompoundExpression_0= ruleNumberCompoundExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2165:5: this_NumberCompoundExpression_0= ruleNumberCompoundExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberCompoundExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberCompoundExpression_in_ruleNumberExpression4900);
            this_NumberCompoundExpression_0=ruleNumberCompoundExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberCompoundExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberExpression"


    // $ANTLR start "entryRuleNumberCompoundExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2181:1: entryRuleNumberCompoundExpression returns [EObject current=null] : iv_ruleNumberCompoundExpression= ruleNumberCompoundExpression EOF ;
    public final EObject entryRuleNumberCompoundExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberCompoundExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2182:2: (iv_ruleNumberCompoundExpression= ruleNumberCompoundExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2183:2: iv_ruleNumberCompoundExpression= ruleNumberCompoundExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberCompoundExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberCompoundExpression_in_entryRuleNumberCompoundExpression4934);
            iv_ruleNumberCompoundExpression=ruleNumberCompoundExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberCompoundExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberCompoundExpression4944); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberCompoundExpression"


    // $ANTLR start "ruleNumberCompoundExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2190:1: ruleNumberCompoundExpression returns [EObject current=null] : (this_NumberAddition_0= ruleNumberAddition | ( () otherlv_2= 'if' otherlv_3= '(' ( (lv_if_4_0= ruleBooleanExpression ) ) otherlv_5= ')' ( (lv_then_6_0= ruleNumberAddition ) ) ( ( ( 'else' )=>otherlv_7= 'else' ) ( (lv_else_8_0= ruleNumberAddition ) ) )? ) | ( () otherlv_10= 'switch' otherlv_11= '(' ( (lv_switch_12_0= ruleNumberExpression ) ) otherlv_13= ')' ( ( ( ruleNumberSwitchExpressionNumberCase ) )=> (lv_cases_14_0= ruleNumberSwitchExpressionNumberCase ) )+ ( ( ( 'default' )=>otherlv_15= 'default' ) otherlv_16= ':' ( (lv_default_17_0= ruleNumberExpression ) ) )? ) | ( () otherlv_19= 'switch' otherlv_20= '(' ( (lv_switch_21_0= ruleTextExpression ) ) otherlv_22= ')' ( ( ( ruleNumberSwitchExpressionTextCase ) )=> (lv_cases_23_0= ruleNumberSwitchExpressionTextCase ) )+ ( ( ( 'default' )=>otherlv_24= 'default' ) otherlv_25= ':' ( (lv_default_26_0= ruleNumberExpression ) ) )? ) ) ;
    public final EObject ruleNumberCompoundExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject this_NumberAddition_0 = null;

        EObject lv_if_4_0 = null;

        EObject lv_then_6_0 = null;

        EObject lv_else_8_0 = null;

        EObject lv_switch_12_0 = null;

        EObject lv_cases_14_0 = null;

        EObject lv_default_17_0 = null;

        EObject lv_switch_21_0 = null;

        EObject lv_cases_23_0 = null;

        EObject lv_default_26_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2193:28: ( (this_NumberAddition_0= ruleNumberAddition | ( () otherlv_2= 'if' otherlv_3= '(' ( (lv_if_4_0= ruleBooleanExpression ) ) otherlv_5= ')' ( (lv_then_6_0= ruleNumberAddition ) ) ( ( ( 'else' )=>otherlv_7= 'else' ) ( (lv_else_8_0= ruleNumberAddition ) ) )? ) | ( () otherlv_10= 'switch' otherlv_11= '(' ( (lv_switch_12_0= ruleNumberExpression ) ) otherlv_13= ')' ( ( ( ruleNumberSwitchExpressionNumberCase ) )=> (lv_cases_14_0= ruleNumberSwitchExpressionNumberCase ) )+ ( ( ( 'default' )=>otherlv_15= 'default' ) otherlv_16= ':' ( (lv_default_17_0= ruleNumberExpression ) ) )? ) | ( () otherlv_19= 'switch' otherlv_20= '(' ( (lv_switch_21_0= ruleTextExpression ) ) otherlv_22= ')' ( ( ( ruleNumberSwitchExpressionTextCase ) )=> (lv_cases_23_0= ruleNumberSwitchExpressionTextCase ) )+ ( ( ( 'default' )=>otherlv_24= 'default' ) otherlv_25= ':' ( (lv_default_26_0= ruleNumberExpression ) ) )? ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2194:1: (this_NumberAddition_0= ruleNumberAddition | ( () otherlv_2= 'if' otherlv_3= '(' ( (lv_if_4_0= ruleBooleanExpression ) ) otherlv_5= ')' ( (lv_then_6_0= ruleNumberAddition ) ) ( ( ( 'else' )=>otherlv_7= 'else' ) ( (lv_else_8_0= ruleNumberAddition ) ) )? ) | ( () otherlv_10= 'switch' otherlv_11= '(' ( (lv_switch_12_0= ruleNumberExpression ) ) otherlv_13= ')' ( ( ( ruleNumberSwitchExpressionNumberCase ) )=> (lv_cases_14_0= ruleNumberSwitchExpressionNumberCase ) )+ ( ( ( 'default' )=>otherlv_15= 'default' ) otherlv_16= ':' ( (lv_default_17_0= ruleNumberExpression ) ) )? ) | ( () otherlv_19= 'switch' otherlv_20= '(' ( (lv_switch_21_0= ruleTextExpression ) ) otherlv_22= ')' ( ( ( ruleNumberSwitchExpressionTextCase ) )=> (lv_cases_23_0= ruleNumberSwitchExpressionTextCase ) )+ ( ( ( 'default' )=>otherlv_24= 'default' ) otherlv_25= ':' ( (lv_default_26_0= ruleNumberExpression ) ) )? ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2194:1: (this_NumberAddition_0= ruleNumberAddition | ( () otherlv_2= 'if' otherlv_3= '(' ( (lv_if_4_0= ruleBooleanExpression ) ) otherlv_5= ')' ( (lv_then_6_0= ruleNumberAddition ) ) ( ( ( 'else' )=>otherlv_7= 'else' ) ( (lv_else_8_0= ruleNumberAddition ) ) )? ) | ( () otherlv_10= 'switch' otherlv_11= '(' ( (lv_switch_12_0= ruleNumberExpression ) ) otherlv_13= ')' ( ( ( ruleNumberSwitchExpressionNumberCase ) )=> (lv_cases_14_0= ruleNumberSwitchExpressionNumberCase ) )+ ( ( ( 'default' )=>otherlv_15= 'default' ) otherlv_16= ':' ( (lv_default_17_0= ruleNumberExpression ) ) )? ) | ( () otherlv_19= 'switch' otherlv_20= '(' ( (lv_switch_21_0= ruleTextExpression ) ) otherlv_22= ')' ( ( ( ruleNumberSwitchExpressionTextCase ) )=> (lv_cases_23_0= ruleNumberSwitchExpressionTextCase ) )+ ( ( ( 'default' )=>otherlv_24= 'default' ) otherlv_25= ':' ( (lv_default_26_0= ruleNumberExpression ) ) )? ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case 47:
            case 54:
                {
                alt34=1;
                }
                break;
            case 30:
                {
                alt34=2;
                }
                break;
            case 50:
                {
                int LA34_3 = input.LA(2);

                if ( (LA34_3==47) ) {
                    int LA34_4 = input.LA(3);

                    if ( ((LA34_4>=RULE_ID && LA34_4<=RULE_INT)||LA34_4==30||LA34_4==47||LA34_4==50||LA34_4==54) ) {
                        alt34=3;
                    }
                    else if ( (LA34_4==RULE_STRING) ) {
                        alt34=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2195:5: this_NumberAddition_0= ruleNumberAddition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberCompoundExpressionAccess().getNumberAdditionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberAddition_in_ruleNumberCompoundExpression4991);
                    this_NumberAddition_0=ruleNumberAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberAddition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2204:6: ( () otherlv_2= 'if' otherlv_3= '(' ( (lv_if_4_0= ruleBooleanExpression ) ) otherlv_5= ')' ( (lv_then_6_0= ruleNumberAddition ) ) ( ( ( 'else' )=>otherlv_7= 'else' ) ( (lv_else_8_0= ruleNumberAddition ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2204:6: ( () otherlv_2= 'if' otherlv_3= '(' ( (lv_if_4_0= ruleBooleanExpression ) ) otherlv_5= ')' ( (lv_then_6_0= ruleNumberAddition ) ) ( ( ( 'else' )=>otherlv_7= 'else' ) ( (lv_else_8_0= ruleNumberAddition ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2204:7: () otherlv_2= 'if' otherlv_3= '(' ( (lv_if_4_0= ruleBooleanExpression ) ) otherlv_5= ')' ( (lv_then_6_0= ruleNumberAddition ) ) ( ( ( 'else' )=>otherlv_7= 'else' ) ( (lv_else_8_0= ruleNumberAddition ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2204:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2205:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumberCompoundExpressionAccess().getNumberIfExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleNumberCompoundExpression5018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNumberCompoundExpressionAccess().getIfKeyword_1_1());
                          
                    }
                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleNumberCompoundExpression5030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNumberCompoundExpressionAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2218:1: ( (lv_if_4_0= ruleBooleanExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2219:1: (lv_if_4_0= ruleBooleanExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2219:1: (lv_if_4_0= ruleBooleanExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2220:3: lv_if_4_0= ruleBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberCompoundExpressionAccess().getIfBooleanExpressionParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleNumberCompoundExpression5051);
                    lv_if_4_0=ruleBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberCompoundExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"if",
                              		lv_if_4_0, 
                              		"BooleanExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleNumberCompoundExpression5063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNumberCompoundExpressionAccess().getRightParenthesisKeyword_1_4());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2240:1: ( (lv_then_6_0= ruleNumberAddition ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2241:1: (lv_then_6_0= ruleNumberAddition )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2241:1: (lv_then_6_0= ruleNumberAddition )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2242:3: lv_then_6_0= ruleNumberAddition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberCompoundExpressionAccess().getThenNumberAdditionParserRuleCall_1_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberAddition_in_ruleNumberCompoundExpression5084);
                    lv_then_6_0=ruleNumberAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberCompoundExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"then",
                              		lv_then_6_0, 
                              		"NumberAddition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2258:2: ( ( ( 'else' )=>otherlv_7= 'else' ) ( (lv_else_8_0= ruleNumberAddition ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==49) && (synpred1_InternalLil())) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2258:3: ( ( 'else' )=>otherlv_7= 'else' ) ( (lv_else_8_0= ruleNumberAddition ) )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2258:3: ( ( 'else' )=>otherlv_7= 'else' )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2258:4: ( 'else' )=>otherlv_7= 'else'
                            {
                            otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleNumberCompoundExpression5105); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getNumberCompoundExpressionAccess().getElseKeyword_1_6_0());
                                  
                            }

                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2263:2: ( (lv_else_8_0= ruleNumberAddition ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2264:1: (lv_else_8_0= ruleNumberAddition )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2264:1: (lv_else_8_0= ruleNumberAddition )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2265:3: lv_else_8_0= ruleNumberAddition
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNumberCompoundExpressionAccess().getElseNumberAdditionParserRuleCall_1_6_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNumberAddition_in_ruleNumberCompoundExpression5127);
                            lv_else_8_0=ruleNumberAddition();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNumberCompoundExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"else",
                                      		lv_else_8_0, 
                                      		"NumberAddition");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2282:6: ( () otherlv_10= 'switch' otherlv_11= '(' ( (lv_switch_12_0= ruleNumberExpression ) ) otherlv_13= ')' ( ( ( ruleNumberSwitchExpressionNumberCase ) )=> (lv_cases_14_0= ruleNumberSwitchExpressionNumberCase ) )+ ( ( ( 'default' )=>otherlv_15= 'default' ) otherlv_16= ':' ( (lv_default_17_0= ruleNumberExpression ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2282:6: ( () otherlv_10= 'switch' otherlv_11= '(' ( (lv_switch_12_0= ruleNumberExpression ) ) otherlv_13= ')' ( ( ( ruleNumberSwitchExpressionNumberCase ) )=> (lv_cases_14_0= ruleNumberSwitchExpressionNumberCase ) )+ ( ( ( 'default' )=>otherlv_15= 'default' ) otherlv_16= ':' ( (lv_default_17_0= ruleNumberExpression ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2282:7: () otherlv_10= 'switch' otherlv_11= '(' ( (lv_switch_12_0= ruleNumberExpression ) ) otherlv_13= ')' ( ( ( ruleNumberSwitchExpressionNumberCase ) )=> (lv_cases_14_0= ruleNumberSwitchExpressionNumberCase ) )+ ( ( ( 'default' )=>otherlv_15= 'default' ) otherlv_16= ':' ( (lv_default_17_0= ruleNumberExpression ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2282:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2283:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumberCompoundExpressionAccess().getNumberSwitchExpressionNumberAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_10=(Token)match(input,50,FOLLOW_50_in_ruleNumberCompoundExpression5158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getNumberCompoundExpressionAccess().getSwitchKeyword_2_1());
                          
                    }
                    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleNumberCompoundExpression5170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getNumberCompoundExpressionAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2296:1: ( (lv_switch_12_0= ruleNumberExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2297:1: (lv_switch_12_0= ruleNumberExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2297:1: (lv_switch_12_0= ruleNumberExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2298:3: lv_switch_12_0= ruleNumberExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberCompoundExpressionAccess().getSwitchNumberExpressionParserRuleCall_2_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberExpression_in_ruleNumberCompoundExpression5191);
                    lv_switch_12_0=ruleNumberExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberCompoundExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_12_0, 
                              		"NumberExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,48,FOLLOW_48_in_ruleNumberCompoundExpression5203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getNumberCompoundExpressionAccess().getRightParenthesisKeyword_2_4());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2318:1: ( ( ( ruleNumberSwitchExpressionNumberCase ) )=> (lv_cases_14_0= ruleNumberSwitchExpressionNumberCase ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==52) ) {
                            int LA30_2 = input.LA(2);

                            if ( (synpred2_InternalLil()) ) {
                                alt30=1;
                            }


                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2318:2: ( ( ruleNumberSwitchExpressionNumberCase ) )=> (lv_cases_14_0= ruleNumberSwitchExpressionNumberCase )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2323:1: (lv_cases_14_0= ruleNumberSwitchExpressionNumberCase )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2324:3: lv_cases_14_0= ruleNumberSwitchExpressionNumberCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNumberCompoundExpressionAccess().getCasesNumberSwitchExpressionNumberCaseParserRuleCall_2_5_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleNumberSwitchExpressionNumberCase_in_ruleNumberCompoundExpression5234);
                    	    lv_cases_14_0=ruleNumberSwitchExpressionNumberCase();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNumberCompoundExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"cases",
                    	              		lv_cases_14_0, 
                    	              		"NumberSwitchExpressionNumberCase");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2340:3: ( ( ( 'default' )=>otherlv_15= 'default' ) otherlv_16= ':' ( (lv_default_17_0= ruleNumberExpression ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==51) ) {
                        int LA31_1 = input.LA(2);

                        if ( (synpred3_InternalLil()) ) {
                            alt31=1;
                        }
                    }
                    switch (alt31) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2340:4: ( ( 'default' )=>otherlv_15= 'default' ) otherlv_16= ':' ( (lv_default_17_0= ruleNumberExpression ) )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2340:4: ( ( 'default' )=>otherlv_15= 'default' )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2340:5: ( 'default' )=>otherlv_15= 'default'
                            {
                            otherlv_15=(Token)match(input,51,FOLLOW_51_in_ruleNumberCompoundExpression5256); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_15, grammarAccess.getNumberCompoundExpressionAccess().getDefaultKeyword_2_6_0());
                                  
                            }

                            }

                            otherlv_16=(Token)match(input,12,FOLLOW_12_in_ruleNumberCompoundExpression5269); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getNumberCompoundExpressionAccess().getColonKeyword_2_6_1());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2349:1: ( (lv_default_17_0= ruleNumberExpression ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2350:1: (lv_default_17_0= ruleNumberExpression )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2350:1: (lv_default_17_0= ruleNumberExpression )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2351:3: lv_default_17_0= ruleNumberExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNumberCompoundExpressionAccess().getDefaultNumberExpressionParserRuleCall_2_6_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNumberCompoundExpression5290);
                            lv_default_17_0=ruleNumberExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNumberCompoundExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"default",
                                      		lv_default_17_0, 
                                      		"NumberExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2368:6: ( () otherlv_19= 'switch' otherlv_20= '(' ( (lv_switch_21_0= ruleTextExpression ) ) otherlv_22= ')' ( ( ( ruleNumberSwitchExpressionTextCase ) )=> (lv_cases_23_0= ruleNumberSwitchExpressionTextCase ) )+ ( ( ( 'default' )=>otherlv_24= 'default' ) otherlv_25= ':' ( (lv_default_26_0= ruleNumberExpression ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2368:6: ( () otherlv_19= 'switch' otherlv_20= '(' ( (lv_switch_21_0= ruleTextExpression ) ) otherlv_22= ')' ( ( ( ruleNumberSwitchExpressionTextCase ) )=> (lv_cases_23_0= ruleNumberSwitchExpressionTextCase ) )+ ( ( ( 'default' )=>otherlv_24= 'default' ) otherlv_25= ':' ( (lv_default_26_0= ruleNumberExpression ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2368:7: () otherlv_19= 'switch' otherlv_20= '(' ( (lv_switch_21_0= ruleTextExpression ) ) otherlv_22= ')' ( ( ( ruleNumberSwitchExpressionTextCase ) )=> (lv_cases_23_0= ruleNumberSwitchExpressionTextCase ) )+ ( ( ( 'default' )=>otherlv_24= 'default' ) otherlv_25= ':' ( (lv_default_26_0= ruleNumberExpression ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2368:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2369:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumberCompoundExpressionAccess().getNumberSwitchExpressionTextAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_19=(Token)match(input,50,FOLLOW_50_in_ruleNumberCompoundExpression5321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getNumberCompoundExpressionAccess().getSwitchKeyword_3_1());
                          
                    }
                    otherlv_20=(Token)match(input,47,FOLLOW_47_in_ruleNumberCompoundExpression5333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getNumberCompoundExpressionAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2382:1: ( (lv_switch_21_0= ruleTextExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2383:1: (lv_switch_21_0= ruleTextExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2383:1: (lv_switch_21_0= ruleTextExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2384:3: lv_switch_21_0= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberCompoundExpressionAccess().getSwitchTextExpressionParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleNumberCompoundExpression5354);
                    lv_switch_21_0=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberCompoundExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_21_0, 
                              		"TextExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,48,FOLLOW_48_in_ruleNumberCompoundExpression5366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getNumberCompoundExpressionAccess().getRightParenthesisKeyword_3_4());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2404:1: ( ( ( ruleNumberSwitchExpressionTextCase ) )=> (lv_cases_23_0= ruleNumberSwitchExpressionTextCase ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==52) ) {
                            int LA32_2 = input.LA(2);

                            if ( (synpred4_InternalLil()) ) {
                                alt32=1;
                            }


                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2404:2: ( ( ruleNumberSwitchExpressionTextCase ) )=> (lv_cases_23_0= ruleNumberSwitchExpressionTextCase )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2409:1: (lv_cases_23_0= ruleNumberSwitchExpressionTextCase )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2410:3: lv_cases_23_0= ruleNumberSwitchExpressionTextCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNumberCompoundExpressionAccess().getCasesNumberSwitchExpressionTextCaseParserRuleCall_3_5_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleNumberSwitchExpressionTextCase_in_ruleNumberCompoundExpression5397);
                    	    lv_cases_23_0=ruleNumberSwitchExpressionTextCase();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNumberCompoundExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"cases",
                    	              		lv_cases_23_0, 
                    	              		"NumberSwitchExpressionTextCase");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2426:3: ( ( ( 'default' )=>otherlv_24= 'default' ) otherlv_25= ':' ( (lv_default_26_0= ruleNumberExpression ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==51) ) {
                        int LA33_1 = input.LA(2);

                        if ( (synpred5_InternalLil()) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2426:4: ( ( 'default' )=>otherlv_24= 'default' ) otherlv_25= ':' ( (lv_default_26_0= ruleNumberExpression ) )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2426:4: ( ( 'default' )=>otherlv_24= 'default' )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2426:5: ( 'default' )=>otherlv_24= 'default'
                            {
                            otherlv_24=(Token)match(input,51,FOLLOW_51_in_ruleNumberCompoundExpression5419); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_24, grammarAccess.getNumberCompoundExpressionAccess().getDefaultKeyword_3_6_0());
                                  
                            }

                            }

                            otherlv_25=(Token)match(input,12,FOLLOW_12_in_ruleNumberCompoundExpression5432); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_25, grammarAccess.getNumberCompoundExpressionAccess().getColonKeyword_3_6_1());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2435:1: ( (lv_default_26_0= ruleNumberExpression ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2436:1: (lv_default_26_0= ruleNumberExpression )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2436:1: (lv_default_26_0= ruleNumberExpression )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2437:3: lv_default_26_0= ruleNumberExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNumberCompoundExpressionAccess().getDefaultNumberExpressionParserRuleCall_3_6_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNumberCompoundExpression5453);
                            lv_default_26_0=ruleNumberExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNumberCompoundExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"default",
                                      		lv_default_26_0, 
                                      		"NumberExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberCompoundExpression"


    // $ANTLR start "entryRuleNumberSwitchExpressionNumberCase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2461:1: entryRuleNumberSwitchExpressionNumberCase returns [EObject current=null] : iv_ruleNumberSwitchExpressionNumberCase= ruleNumberSwitchExpressionNumberCase EOF ;
    public final EObject entryRuleNumberSwitchExpressionNumberCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberSwitchExpressionNumberCase = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2462:2: (iv_ruleNumberSwitchExpressionNumberCase= ruleNumberSwitchExpressionNumberCase EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2463:2: iv_ruleNumberSwitchExpressionNumberCase= ruleNumberSwitchExpressionNumberCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberSwitchExpressionNumberCaseRule()); 
            }
            pushFollow(FOLLOW_ruleNumberSwitchExpressionNumberCase_in_entryRuleNumberSwitchExpressionNumberCase5492);
            iv_ruleNumberSwitchExpressionNumberCase=ruleNumberSwitchExpressionNumberCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberSwitchExpressionNumberCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberSwitchExpressionNumberCase5502); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberSwitchExpressionNumberCase"


    // $ANTLR start "ruleNumberSwitchExpressionNumberCase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2470:1: ruleNumberSwitchExpressionNumberCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_condition_1_0= ruleNumberExpression ) ) otherlv_2= ':' ( (lv_value_3_0= ruleNumberExpression ) ) ) ;
    public final EObject ruleNumberSwitchExpressionNumberCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2473:28: ( (otherlv_0= 'case' ( (lv_condition_1_0= ruleNumberExpression ) ) otherlv_2= ':' ( (lv_value_3_0= ruleNumberExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2474:1: (otherlv_0= 'case' ( (lv_condition_1_0= ruleNumberExpression ) ) otherlv_2= ':' ( (lv_value_3_0= ruleNumberExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2474:1: (otherlv_0= 'case' ( (lv_condition_1_0= ruleNumberExpression ) ) otherlv_2= ':' ( (lv_value_3_0= ruleNumberExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2474:3: otherlv_0= 'case' ( (lv_condition_1_0= ruleNumberExpression ) ) otherlv_2= ':' ( (lv_value_3_0= ruleNumberExpression ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleNumberSwitchExpressionNumberCase5539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNumberSwitchExpressionNumberCaseAccess().getCaseKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2478:1: ( (lv_condition_1_0= ruleNumberExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2479:1: (lv_condition_1_0= ruleNumberExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2479:1: (lv_condition_1_0= ruleNumberExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2480:3: lv_condition_1_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberSwitchExpressionNumberCaseAccess().getConditionNumberExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNumberSwitchExpressionNumberCase5560);
            lv_condition_1_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberSwitchExpressionNumberCaseRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"NumberExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNumberSwitchExpressionNumberCase5572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNumberSwitchExpressionNumberCaseAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2500:1: ( (lv_value_3_0= ruleNumberExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2501:1: (lv_value_3_0= ruleNumberExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2501:1: (lv_value_3_0= ruleNumberExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2502:3: lv_value_3_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberSwitchExpressionNumberCaseAccess().getValueNumberExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNumberSwitchExpressionNumberCase5593);
            lv_value_3_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberSwitchExpressionNumberCaseRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"NumberExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberSwitchExpressionNumberCase"


    // $ANTLR start "entryRuleNumberSwitchExpressionTextCase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2526:1: entryRuleNumberSwitchExpressionTextCase returns [EObject current=null] : iv_ruleNumberSwitchExpressionTextCase= ruleNumberSwitchExpressionTextCase EOF ;
    public final EObject entryRuleNumberSwitchExpressionTextCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberSwitchExpressionTextCase = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2527:2: (iv_ruleNumberSwitchExpressionTextCase= ruleNumberSwitchExpressionTextCase EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2528:2: iv_ruleNumberSwitchExpressionTextCase= ruleNumberSwitchExpressionTextCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberSwitchExpressionTextCaseRule()); 
            }
            pushFollow(FOLLOW_ruleNumberSwitchExpressionTextCase_in_entryRuleNumberSwitchExpressionTextCase5629);
            iv_ruleNumberSwitchExpressionTextCase=ruleNumberSwitchExpressionTextCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberSwitchExpressionTextCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberSwitchExpressionTextCase5639); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberSwitchExpressionTextCase"


    // $ANTLR start "ruleNumberSwitchExpressionTextCase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2535:1: ruleNumberSwitchExpressionTextCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_condition_1_0= ruleTextExpression ) ) otherlv_2= ':' ( (lv_value_3_0= ruleNumberExpression ) ) ) ;
    public final EObject ruleNumberSwitchExpressionTextCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2538:28: ( (otherlv_0= 'case' ( (lv_condition_1_0= ruleTextExpression ) ) otherlv_2= ':' ( (lv_value_3_0= ruleNumberExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2539:1: (otherlv_0= 'case' ( (lv_condition_1_0= ruleTextExpression ) ) otherlv_2= ':' ( (lv_value_3_0= ruleNumberExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2539:1: (otherlv_0= 'case' ( (lv_condition_1_0= ruleTextExpression ) ) otherlv_2= ':' ( (lv_value_3_0= ruleNumberExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2539:3: otherlv_0= 'case' ( (lv_condition_1_0= ruleTextExpression ) ) otherlv_2= ':' ( (lv_value_3_0= ruleNumberExpression ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleNumberSwitchExpressionTextCase5676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNumberSwitchExpressionTextCaseAccess().getCaseKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2543:1: ( (lv_condition_1_0= ruleTextExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2544:1: (lv_condition_1_0= ruleTextExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2544:1: (lv_condition_1_0= ruleTextExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2545:3: lv_condition_1_0= ruleTextExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberSwitchExpressionTextCaseAccess().getConditionTextExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTextExpression_in_ruleNumberSwitchExpressionTextCase5697);
            lv_condition_1_0=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberSwitchExpressionTextCaseRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"TextExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNumberSwitchExpressionTextCase5709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNumberSwitchExpressionTextCaseAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2565:1: ( (lv_value_3_0= ruleNumberExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2566:1: (lv_value_3_0= ruleNumberExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2566:1: (lv_value_3_0= ruleNumberExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2567:3: lv_value_3_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberSwitchExpressionTextCaseAccess().getValueNumberExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNumberSwitchExpressionTextCase5730);
            lv_value_3_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberSwitchExpressionTextCaseRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"NumberExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberSwitchExpressionTextCase"


    // $ANTLR start "entryRuleNumberAddition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2591:1: entryRuleNumberAddition returns [EObject current=null] : iv_ruleNumberAddition= ruleNumberAddition EOF ;
    public final EObject entryRuleNumberAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberAddition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2592:2: (iv_ruleNumberAddition= ruleNumberAddition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2593:2: iv_ruleNumberAddition= ruleNumberAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberAddition_in_entryRuleNumberAddition5766);
            iv_ruleNumberAddition=ruleNumberAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberAddition5776); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberAddition"


    // $ANTLR start "ruleNumberAddition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2600:1: ruleNumberAddition returns [EObject current=null] : (this_NumberMultiplication_0= ruleNumberMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleNumberMultiplication ) ) )* ) ;
    public final EObject ruleNumberAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_NumberMultiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2603:28: ( (this_NumberMultiplication_0= ruleNumberMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleNumberMultiplication ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2604:1: (this_NumberMultiplication_0= ruleNumberMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleNumberMultiplication ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2604:1: (this_NumberMultiplication_0= ruleNumberMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleNumberMultiplication ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2605:5: this_NumberMultiplication_0= ruleNumberMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleNumberMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumberAdditionAccess().getNumberMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberMultiplication_in_ruleNumberAddition5823);
            this_NumberMultiplication_0=ruleNumberMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberMultiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2613:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleNumberMultiplication ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=53 && LA36_0<=54)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2613:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleNumberMultiplication ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2613:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==53) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==54) ) {
            	        alt35=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2613:3: ( () otherlv_2= '+' )
            	            {
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2613:3: ( () otherlv_2= '+' )
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2613:4: () otherlv_2= '+'
            	            {
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2613:4: ()
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2614:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleNumberAddition5846); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getNumberAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2624:6: ( () otherlv_4= '-' )
            	            {
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2624:6: ( () otherlv_4= '-' )
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2624:7: () otherlv_4= '-'
            	            {
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2624:7: ()
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2625:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleNumberAddition5875); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getNumberAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2634:3: ( (lv_right_5_0= ruleNumberMultiplication ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2635:1: (lv_right_5_0= ruleNumberMultiplication )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2635:1: (lv_right_5_0= ruleNumberMultiplication )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2636:3: lv_right_5_0= ruleNumberMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumberAdditionAccess().getRightNumberMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberMultiplication_in_ruleNumberAddition5898);
            	    lv_right_5_0=ruleNumberMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumberAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"NumberMultiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberAddition"


    // $ANTLR start "entryRuleNumberMultiplication"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2660:1: entryRuleNumberMultiplication returns [EObject current=null] : iv_ruleNumberMultiplication= ruleNumberMultiplication EOF ;
    public final EObject entryRuleNumberMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberMultiplication = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2661:2: (iv_ruleNumberMultiplication= ruleNumberMultiplication EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2662:2: iv_ruleNumberMultiplication= ruleNumberMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleNumberMultiplication_in_entryRuleNumberMultiplication5936);
            iv_ruleNumberMultiplication=ruleNumberMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberMultiplication5946); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberMultiplication"


    // $ANTLR start "ruleNumberMultiplication"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2669:1: ruleNumberMultiplication returns [EObject current=null] : (this_NumberPower_0= ruleNumberPower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleNumberPower ) ) )* ) ;
    public final EObject ruleNumberMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_NumberPower_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2672:28: ( (this_NumberPower_0= ruleNumberPower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleNumberPower ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2673:1: (this_NumberPower_0= ruleNumberPower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleNumberPower ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2673:1: (this_NumberPower_0= ruleNumberPower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleNumberPower ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2674:5: this_NumberPower_0= ruleNumberPower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleNumberPower ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumberMultiplicationAccess().getNumberPowerParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberPower_in_ruleNumberMultiplication5993);
            this_NumberPower_0=ruleNumberPower();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberPower_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2682:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleNumberPower ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=55 && LA38_0<=57)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2682:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleNumberPower ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2682:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt37=3;
            	    switch ( input.LA(1) ) {
            	    case 55:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt37=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt37) {
            	        case 1 :
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2682:3: ( () otherlv_2= '*' )
            	            {
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2682:3: ( () otherlv_2= '*' )
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2682:4: () otherlv_2= '*'
            	            {
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2682:4: ()
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2683:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleNumberMultiplication6016); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getNumberMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2693:6: ( () otherlv_4= '/' )
            	            {
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2693:6: ( () otherlv_4= '/' )
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2693:7: () otherlv_4= '/'
            	            {
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2693:7: ()
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2694:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleNumberMultiplication6045); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getNumberMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2704:6: ( () otherlv_6= '%' )
            	            {
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2704:6: ( () otherlv_6= '%' )
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2704:7: () otherlv_6= '%'
            	            {
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2704:7: ()
            	            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2705:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleNumberMultiplication6074); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getNumberMultiplicationAccess().getPercentSignKeyword_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2714:3: ( (lv_right_7_0= ruleNumberPower ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2715:1: (lv_right_7_0= ruleNumberPower )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2715:1: (lv_right_7_0= ruleNumberPower )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2716:3: lv_right_7_0= ruleNumberPower
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumberMultiplicationAccess().getRightNumberPowerParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberPower_in_ruleNumberMultiplication6097);
            	    lv_right_7_0=ruleNumberPower();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumberMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_7_0, 
            	              		"NumberPower");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberMultiplication"


    // $ANTLR start "entryRuleNumberPower"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2740:1: entryRuleNumberPower returns [EObject current=null] : iv_ruleNumberPower= ruleNumberPower EOF ;
    public final EObject entryRuleNumberPower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberPower = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2741:2: (iv_ruleNumberPower= ruleNumberPower EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2742:2: iv_ruleNumberPower= ruleNumberPower EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberPowerRule()); 
            }
            pushFollow(FOLLOW_ruleNumberPower_in_entryRuleNumberPower6135);
            iv_ruleNumberPower=ruleNumberPower();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberPower; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberPower6145); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberPower"


    // $ANTLR start "ruleNumberPower"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2749:1: ruleNumberPower returns [EObject current=null] : (this_NumberUnary_0= ruleNumberUnary ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleNumberUnary ) ) )* ) ;
    public final EObject ruleNumberPower() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NumberUnary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:28: ( (this_NumberUnary_0= ruleNumberUnary ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleNumberUnary ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2753:1: (this_NumberUnary_0= ruleNumberUnary ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleNumberUnary ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2753:1: (this_NumberUnary_0= ruleNumberUnary ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleNumberUnary ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2754:5: this_NumberUnary_0= ruleNumberUnary ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleNumberUnary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumberPowerAccess().getNumberUnaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberUnary_in_ruleNumberPower6192);
            this_NumberUnary_0=ruleNumberUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberUnary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2762:1: ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleNumberUnary ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==58) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2762:2: ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleNumberUnary ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2762:2: ( () otherlv_2= '^' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2762:3: () otherlv_2= '^'
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2762:3: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2763:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleNumberPower6214); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNumberPowerAccess().getCircumflexAccentKeyword_1_0_1());
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2772:2: ( (lv_right_3_0= ruleNumberUnary ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2773:1: (lv_right_3_0= ruleNumberUnary )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2773:1: (lv_right_3_0= ruleNumberUnary )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2774:3: lv_right_3_0= ruleNumberUnary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumberPowerAccess().getRightNumberUnaryParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberUnary_in_ruleNumberPower6236);
            	    lv_right_3_0=ruleNumberUnary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumberPowerRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"NumberUnary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberPower"


    // $ANTLR start "entryRuleNumberUnary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2798:1: entryRuleNumberUnary returns [EObject current=null] : iv_ruleNumberUnary= ruleNumberUnary EOF ;
    public final EObject entryRuleNumberUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberUnary = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2799:2: (iv_ruleNumberUnary= ruleNumberUnary EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2800:2: iv_ruleNumberUnary= ruleNumberUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleNumberUnary_in_entryRuleNumberUnary6274);
            iv_ruleNumberUnary=ruleNumberUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberUnary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberUnary6284); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberUnary"


    // $ANTLR start "ruleNumberUnary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2807:1: ruleNumberUnary returns [EObject current=null] : (this_NumberTerminalExpression_0= ruleNumberTerminalExpression | ( ( () otherlv_2= '-' ) ( (lv_operand_3_0= ruleNumberTerminalExpression ) ) ) ) ;
    public final EObject ruleNumberUnary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NumberTerminalExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2810:28: ( (this_NumberTerminalExpression_0= ruleNumberTerminalExpression | ( ( () otherlv_2= '-' ) ( (lv_operand_3_0= ruleNumberTerminalExpression ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2811:1: (this_NumberTerminalExpression_0= ruleNumberTerminalExpression | ( ( () otherlv_2= '-' ) ( (lv_operand_3_0= ruleNumberTerminalExpression ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2811:1: (this_NumberTerminalExpression_0= ruleNumberTerminalExpression | ( ( () otherlv_2= '-' ) ( (lv_operand_3_0= ruleNumberTerminalExpression ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_INT)||LA40_0==47) ) {
                alt40=1;
            }
            else if ( (LA40_0==54) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2812:5: this_NumberTerminalExpression_0= ruleNumberTerminalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberUnaryAccess().getNumberTerminalExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberTerminalExpression_in_ruleNumberUnary6331);
                    this_NumberTerminalExpression_0=ruleNumberTerminalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberTerminalExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2821:6: ( ( () otherlv_2= '-' ) ( (lv_operand_3_0= ruleNumberTerminalExpression ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2821:6: ( ( () otherlv_2= '-' ) ( (lv_operand_3_0= ruleNumberTerminalExpression ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2821:7: ( () otherlv_2= '-' ) ( (lv_operand_3_0= ruleNumberTerminalExpression ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2821:7: ( () otherlv_2= '-' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2821:8: () otherlv_2= '-'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2821:8: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2822:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumberUnaryAccess().getNumberOppositionAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleNumberUnary6359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNumberUnaryAccess().getHyphenMinusKeyword_1_0_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2831:2: ( (lv_operand_3_0= ruleNumberTerminalExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2832:1: (lv_operand_3_0= ruleNumberTerminalExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2832:1: (lv_operand_3_0= ruleNumberTerminalExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2833:3: lv_operand_3_0= ruleNumberTerminalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberUnaryAccess().getOperandNumberTerminalExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberTerminalExpression_in_ruleNumberUnary6381);
                    lv_operand_3_0=ruleNumberTerminalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberUnaryRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"NumberTerminalExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberUnary"


    // $ANTLR start "entryRuleNumberTerminalExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2857:1: entryRuleNumberTerminalExpression returns [EObject current=null] : iv_ruleNumberTerminalExpression= ruleNumberTerminalExpression EOF ;
    public final EObject entryRuleNumberTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberTerminalExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2858:2: (iv_ruleNumberTerminalExpression= ruleNumberTerminalExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2859:2: iv_ruleNumberTerminalExpression= ruleNumberTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberTerminalExpression_in_entryRuleNumberTerminalExpression6418);
            iv_ruleNumberTerminalExpression=ruleNumberTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberTerminalExpression6428); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberTerminalExpression"


    // $ANTLR start "ruleNumberTerminalExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2866:1: ruleNumberTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_NumberExpression_1= ruleNumberExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleNumberLiteral ) ) ) | ( () ( (lv_function_6_0= RULE_ID ) ) (otherlv_7= '(' ( (lv_arguments_8_0= ruleNumberExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleNumberExpression ) ) )* otherlv_11= ')' )? ) ) ;
    public final EObject ruleNumberTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_function_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_NumberExpression_1 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_arguments_8_0 = null;

        EObject lv_arguments_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2869:28: ( ( (otherlv_0= '(' this_NumberExpression_1= ruleNumberExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleNumberLiteral ) ) ) | ( () ( (lv_function_6_0= RULE_ID ) ) (otherlv_7= '(' ( (lv_arguments_8_0= ruleNumberExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleNumberExpression ) ) )* otherlv_11= ')' )? ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2870:1: ( (otherlv_0= '(' this_NumberExpression_1= ruleNumberExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleNumberLiteral ) ) ) | ( () ( (lv_function_6_0= RULE_ID ) ) (otherlv_7= '(' ( (lv_arguments_8_0= ruleNumberExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleNumberExpression ) ) )* otherlv_11= ')' )? ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2870:1: ( (otherlv_0= '(' this_NumberExpression_1= ruleNumberExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleNumberLiteral ) ) ) | ( () ( (lv_function_6_0= RULE_ID ) ) (otherlv_7= '(' ( (lv_arguments_8_0= ruleNumberExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleNumberExpression ) ) )* otherlv_11= ')' )? ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt43=1;
                }
                break;
            case RULE_INT:
                {
                alt43=2;
                }
                break;
            case RULE_ID:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2870:2: (otherlv_0= '(' this_NumberExpression_1= ruleNumberExpression otherlv_2= ')' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2870:2: (otherlv_0= '(' this_NumberExpression_1= ruleNumberExpression otherlv_2= ')' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2870:4: otherlv_0= '(' this_NumberExpression_1= ruleNumberExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleNumberTerminalExpression6466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getNumberTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberTerminalExpressionAccess().getNumberExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberExpression_in_ruleNumberTerminalExpression6488);
                    this_NumberExpression_1=ruleNumberExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleNumberTerminalExpression6499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNumberTerminalExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2888:6: ( () ( (lv_value_4_0= ruleNumberLiteral ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2888:6: ( () ( (lv_value_4_0= ruleNumberLiteral ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2888:7: () ( (lv_value_4_0= ruleNumberLiteral ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2888:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2889:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumberTerminalExpressionAccess().getNumberLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2894:2: ( (lv_value_4_0= ruleNumberLiteral ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2895:1: (lv_value_4_0= ruleNumberLiteral )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2895:1: (lv_value_4_0= ruleNumberLiteral )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2896:3: lv_value_4_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberTerminalExpressionAccess().getValueNumberLiteralParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberTerminalExpression6537);
                    lv_value_4_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberTerminalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"NumberLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2913:6: ( () ( (lv_function_6_0= RULE_ID ) ) (otherlv_7= '(' ( (lv_arguments_8_0= ruleNumberExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleNumberExpression ) ) )* otherlv_11= ')' )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2913:6: ( () ( (lv_function_6_0= RULE_ID ) ) (otherlv_7= '(' ( (lv_arguments_8_0= ruleNumberExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleNumberExpression ) ) )* otherlv_11= ')' )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2913:7: () ( (lv_function_6_0= RULE_ID ) ) (otherlv_7= '(' ( (lv_arguments_8_0= ruleNumberExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleNumberExpression ) ) )* otherlv_11= ')' )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2913:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2914:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumberTerminalExpressionAccess().getNumberFunctionExpressionAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2919:2: ( (lv_function_6_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2920:1: (lv_function_6_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2920:1: (lv_function_6_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2921:3: lv_function_6_0= RULE_ID
                    {
                    lv_function_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNumberTerminalExpression6571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_function_6_0, grammarAccess.getNumberTerminalExpressionAccess().getFunctionIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumberTerminalExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"function",
                              		lv_function_6_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2937:2: (otherlv_7= '(' ( (lv_arguments_8_0= ruleNumberExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleNumberExpression ) ) )* otherlv_11= ')' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==47) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2937:4: otherlv_7= '(' ( (lv_arguments_8_0= ruleNumberExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleNumberExpression ) ) )* otherlv_11= ')'
                            {
                            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleNumberTerminalExpression6589); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getNumberTerminalExpressionAccess().getLeftParenthesisKeyword_2_2_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2941:1: ( (lv_arguments_8_0= ruleNumberExpression ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2942:1: (lv_arguments_8_0= ruleNumberExpression )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2942:1: (lv_arguments_8_0= ruleNumberExpression )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2943:3: lv_arguments_8_0= ruleNumberExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNumberTerminalExpressionAccess().getArgumentsNumberExpressionParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNumberTerminalExpression6610);
                            lv_arguments_8_0=ruleNumberExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNumberTerminalExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_8_0, 
                                      		"NumberExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2959:2: (otherlv_9= ',' ( (lv_arguments_10_0= ruleNumberExpression ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==23) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2959:4: otherlv_9= ',' ( (lv_arguments_10_0= ruleNumberExpression ) )
                            	    {
                            	    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleNumberTerminalExpression6623); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getNumberTerminalExpressionAccess().getCommaKeyword_2_2_2_0());
                            	          
                            	    }
                            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2963:1: ( (lv_arguments_10_0= ruleNumberExpression ) )
                            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2964:1: (lv_arguments_10_0= ruleNumberExpression )
                            	    {
                            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2964:1: (lv_arguments_10_0= ruleNumberExpression )
                            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2965:3: lv_arguments_10_0= ruleNumberExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getNumberTerminalExpressionAccess().getArgumentsNumberExpressionParserRuleCall_2_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleNumberTerminalExpression6644);
                            	    lv_arguments_10_0=ruleNumberExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getNumberTerminalExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_10_0, 
                            	              		"NumberExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,48,FOLLOW_48_in_ruleNumberTerminalExpression6658); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getNumberTerminalExpressionAccess().getRightParenthesisKeyword_2_2_3());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberTerminalExpression"


    // $ANTLR start "entryRuleTextExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2993:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2994:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2995:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression6697);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression6707); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3002:1: ruleTextExpression returns [EObject current=null] : this_TextJoin_0= ruleTextJoin ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TextJoin_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3005:28: (this_TextJoin_0= ruleTextJoin )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3007:5: this_TextJoin_0= ruleTextJoin
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTextExpressionAccess().getTextJoinParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleTextJoin_in_ruleTextExpression6753);
            this_TextJoin_0=ruleTextJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TextJoin_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleTextJoin"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3023:1: entryRuleTextJoin returns [EObject current=null] : iv_ruleTextJoin= ruleTextJoin EOF ;
    public final EObject entryRuleTextJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextJoin = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3024:2: (iv_ruleTextJoin= ruleTextJoin EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3025:2: iv_ruleTextJoin= ruleTextJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextJoinRule()); 
            }
            pushFollow(FOLLOW_ruleTextJoin_in_entryRuleTextJoin6787);
            iv_ruleTextJoin=ruleTextJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextJoin6797); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextJoin"


    // $ANTLR start "ruleTextJoin"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3032:1: ruleTextJoin returns [EObject current=null] : (this_TextTerminalExpression_0= ruleTextTerminalExpression ( ( () otherlv_2= '<>' ) ( (lv_right_3_0= ruleTextTerminalExpression ) ) )* ) ;
    public final EObject ruleTextJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TextTerminalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3035:28: ( (this_TextTerminalExpression_0= ruleTextTerminalExpression ( ( () otherlv_2= '<>' ) ( (lv_right_3_0= ruleTextTerminalExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3036:1: (this_TextTerminalExpression_0= ruleTextTerminalExpression ( ( () otherlv_2= '<>' ) ( (lv_right_3_0= ruleTextTerminalExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3036:1: (this_TextTerminalExpression_0= ruleTextTerminalExpression ( ( () otherlv_2= '<>' ) ( (lv_right_3_0= ruleTextTerminalExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3037:5: this_TextTerminalExpression_0= ruleTextTerminalExpression ( ( () otherlv_2= '<>' ) ( (lv_right_3_0= ruleTextTerminalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTextJoinAccess().getTextTerminalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTextTerminalExpression_in_ruleTextJoin6844);
            this_TextTerminalExpression_0=ruleTextTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TextTerminalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3045:1: ( ( () otherlv_2= '<>' ) ( (lv_right_3_0= ruleTextTerminalExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==59) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3045:2: ( () otherlv_2= '<>' ) ( (lv_right_3_0= ruleTextTerminalExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3045:2: ( () otherlv_2= '<>' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3045:3: () otherlv_2= '<>'
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3045:3: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3046:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTextJoinAccess().getTextJoinLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleTextJoin6866); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTextJoinAccess().getLessThanSignGreaterThanSignKeyword_1_0_1());
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3055:2: ( (lv_right_3_0= ruleTextTerminalExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3056:1: (lv_right_3_0= ruleTextTerminalExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3056:1: (lv_right_3_0= ruleTextTerminalExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3057:3: lv_right_3_0= ruleTextTerminalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTextJoinAccess().getRightTextTerminalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTextTerminalExpression_in_ruleTextJoin6888);
            	    lv_right_3_0=ruleTextTerminalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTextJoinRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"TextTerminalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextJoin"


    // $ANTLR start "entryRuleTextTerminalExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3081:1: entryRuleTextTerminalExpression returns [EObject current=null] : iv_ruleTextTerminalExpression= ruleTextTerminalExpression EOF ;
    public final EObject entryRuleTextTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextTerminalExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3082:2: (iv_ruleTextTerminalExpression= ruleTextTerminalExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3083:2: iv_ruleTextTerminalExpression= ruleTextTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTextTerminalExpression_in_entryRuleTextTerminalExpression6926);
            iv_ruleTextTerminalExpression=ruleTextTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextTerminalExpression6936); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextTerminalExpression"


    // $ANTLR start "ruleTextTerminalExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3090:1: ruleTextTerminalExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleTextLiteral ) ) ) ;
    public final EObject ruleTextTerminalExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3093:28: ( ( () ( (lv_value_1_0= ruleTextLiteral ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3094:1: ( () ( (lv_value_1_0= ruleTextLiteral ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3094:1: ( () ( (lv_value_1_0= ruleTextLiteral ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3094:2: () ( (lv_value_1_0= ruleTextLiteral ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3094:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3095:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTextTerminalExpressionAccess().getTextLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3100:2: ( (lv_value_1_0= ruleTextLiteral ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3101:1: (lv_value_1_0= ruleTextLiteral )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3101:1: (lv_value_1_0= ruleTextLiteral )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3102:3: lv_value_1_0= ruleTextLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextTerminalExpressionAccess().getValueTextLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTextLiteral_in_ruleTextTerminalExpression6991);
            lv_value_1_0=ruleTextLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTextTerminalExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"TextLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextTerminalExpression"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3128:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3129:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3130:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral7030);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral7041); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3137:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'yes' | kw= 'false' | kw= 'no' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3140:28: ( (kw= 'true' | kw= 'yes' | kw= 'false' | kw= 'no' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3141:1: (kw= 'true' | kw= 'yes' | kw= 'false' | kw= 'no' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3141:1: (kw= 'true' | kw= 'yes' | kw= 'false' | kw= 'no' )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt45=1;
                }
                break;
            case 61:
                {
                alt45=2;
                }
                break;
            case 62:
                {
                alt45=3;
                }
                break;
            case 63:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3142:2: kw= 'true'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleBooleanLiteral7079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3149:2: kw= 'yes'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleBooleanLiteral7098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getYesKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3156:2: kw= 'false'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleBooleanLiteral7117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3163:2: kw= 'no'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleBooleanLiteral7136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getNoKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3176:1: entryRuleNumberLiteral returns [String current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final String entryRuleNumberLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3177:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3178:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral7177);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral7188); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3185:1: ruleNumberLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumberLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3188:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3189:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3189:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3189:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberLiteral7228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3196:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==64) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3197:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleNumberLiteral7247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumberLiteralAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberLiteral7262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleTextLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3217:1: entryRuleTextLiteral returns [String current=null] : iv_ruleTextLiteral= ruleTextLiteral EOF ;
    public final String entryRuleTextLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3218:2: (iv_ruleTextLiteral= ruleTextLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3219:2: iv_ruleTextLiteral= ruleTextLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleTextLiteral_in_entryRuleTextLiteral7310);
            iv_ruleTextLiteral=ruleTextLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextLiteral7321); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextLiteral"


    // $ANTLR start "ruleTextLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3226:1: ruleTextLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleTextLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3229:28: (this_STRING_0= RULE_STRING )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3230:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextLiteral7360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_0, grammarAccess.getTextLiteralAccess().getSTRINGTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextLiteral"

    // $ANTLR start synpred1_InternalLil
    public final void synpred1_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2258:4: ( 'else' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2258:6: 'else'
        {
        match(input,49,FOLLOW_49_in_synpred1_InternalLil5097); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalLil

    // $ANTLR start synpred2_InternalLil
    public final void synpred2_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2318:2: ( ( ruleNumberSwitchExpressionNumberCase ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2319:1: ( ruleNumberSwitchExpressionNumberCase )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2319:1: ( ruleNumberSwitchExpressionNumberCase )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2320:1: ruleNumberSwitchExpressionNumberCase
        {
        pushFollow(FOLLOW_ruleNumberSwitchExpressionNumberCase_in_synpred2_InternalLil5217);
        ruleNumberSwitchExpressionNumberCase();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalLil

    // $ANTLR start synpred3_InternalLil
    public final void synpred3_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2340:5: ( 'default' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2340:7: 'default'
        {
        match(input,51,FOLLOW_51_in_synpred3_InternalLil5248); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalLil

    // $ANTLR start synpred4_InternalLil
    public final void synpred4_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2404:2: ( ( ruleNumberSwitchExpressionTextCase ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2405:1: ( ruleNumberSwitchExpressionTextCase )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2405:1: ( ruleNumberSwitchExpressionTextCase )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2406:1: ruleNumberSwitchExpressionTextCase
        {
        pushFollow(FOLLOW_ruleNumberSwitchExpressionTextCase_in_synpred4_InternalLil5380);
        ruleNumberSwitchExpressionTextCase();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalLil

    // $ANTLR start synpred5_InternalLil
    public final void synpred5_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2426:5: ( 'default' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2426:7: 'default'
        {
        match(input,51,FOLLOW_51_in_synpred5_InternalLil5411); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalLil

    // Delegated rules

    public final boolean synpred4_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\1\4\7\33\2\uffff";
    static final String DFA12_maxS =
        "\1\53\7\34\2\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\41\uffff\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "899:1: (this_EventDeclaration_0= ruleEventDeclaration | this_FlowDeclaration_1= ruleFlowDeclaration )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorDeclaration_in_ruleModel131 = new BitSet(new long[]{0x0000001000000802L});
    public static final BitSet FOLLOW_ruleDataTypeDeclaration_in_ruleModel158 = new BitSet(new long[]{0x0000001000000802L});
    public static final BitSet FOLLOW_ruleInteractorDeclaration_in_entryRuleInteractorDeclaration195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorDeclaration205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInteractorDeclaration242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorDeclaration259 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractorDeclaration276 = new BitSet(new long[]{0x00000FC0A0100012L});
    public static final BitSet FOLLOW_ruleEntityDeclaration_in_ruleInteractorDeclaration298 = new BitSet(new long[]{0x00000FC0A0100012L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_ruleInteractorDeclaration325 = new BitSet(new long[]{0x00000FC0A0100012L});
    public static final BitSet FOLLOW_ruleBehaviorDeclaration_in_ruleInteractorDeclaration352 = new BitSet(new long[]{0x00000FC0A0100012L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_entryRuleAccessibleEntity390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessibleEntity400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAccessibleEntity445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAccessibleEntity474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAccessibleEntity503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAccessibleEntity532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAccessibleEntity561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAccessibleEntity590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAccessibleEntity619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAccessibleEntity662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityDeclaration_in_entryRuleEntityDeclaration965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityDeclaration975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorDeclaration_in_ruleEntityDeclaration1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDeclaration_in_ruleEntityDeclaration1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorDeclaration_in_entryRuleActorDeclaration1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorDeclaration1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleActorDeclaration1131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorDeclaration1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorAlias_in_entryRuleActorAlias1189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorAlias1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleActorAlias1245 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActorAlias1257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActor_in_ruleActorAlias1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentDeclaration_in_entryRuleComponentDeclaration1314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentDeclaration1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDeclaration1369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentDeclaration1386 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleComponentDeclaration1404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActorAlias_in_ruleComponentDeclaration1425 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleComponentDeclaration1438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActorAlias_in_ruleComponentDeclaration1459 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleEventReception_in_entryRuleEventReception1499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventReception1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventReception1555 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleEventReception1568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleEventReception1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEventReception1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventEmission_in_entryRuleEventEmission1667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventEmission1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventEmission1722 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleEventEmission1735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleEventEmission1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlowEmission_in_entryRuleFlowEmission1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlowEmission1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFlowEmission1849 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleFlowEmission1862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleFlowEmission1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_ruleSignalDeclaration1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlowDeclaration_in_ruleSignalDeclaration2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_entryRuleEventDeclaration2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclaration2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleEventDeclaration2096 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEventDeclaration2108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDeclaration2125 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_24_in_ruleEventDeclaration2143 = new BitSet(new long[]{0x00000000000FE010L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_ruleEventDeclaration2164 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleEventDeclaration2179 = new BitSet(new long[]{0x00000000000FE010L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_ruleEventDeclaration2200 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleFlowDeclaration_in_entryRuleFlowDeclaration2238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlowDeclaration2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFlowDeclaration2294 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFlowDeclaration2306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFlowDeclaration2323 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_24_in_ruleFlowDeclaration2341 = new BitSet(new long[]{0x00000000000FE010L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_ruleFlowDeclaration2362 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleFlowDeclaration2377 = new BitSet(new long[]{0x00000000000FE010L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_ruleFlowDeclaration2398 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleBehaviorDeclaration_in_entryRuleBehaviorDeclaration2436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehaviorDeclaration2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCause_in_ruleBehaviorDeclaration2492 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBehaviorDeclaration2504 = new BitSet(new long[]{0x0000000D00000000L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleBehaviorDeclaration2525 = new BitSet(new long[]{0x0000000D00000002L});
    public static final BitSet FOLLOW_ruleCause_in_entryRuleCause2562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCause2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCause_in_ruleCause2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenCause_in_ruleCause2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCause_in_entryRuleOnCause2681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCause2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOnCause2728 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleEventReception_in_ruleOnCause2749 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleOnCause2762 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleOnCause2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenCause_in_entryRuleWhenCause2821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenCause2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleWhenCause2868 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhenCause2889 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleWhenCause2902 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhenCause2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect2961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEffect_in_ruleEffect3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetEffect_in_ruleEffect3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerEffect_in_ruleEffect3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEffect_in_entryRuleAlwaysEffect3107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEffect3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAlwaysEffect3154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFlowEmission_in_ruleAlwaysEffect3175 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAlwaysEffect3187 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAlwaysEffect3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetEffect_in_entryRuleSetEffect3244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetEffect3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSetEffect3291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFlowEmission_in_ruleSetEffect3312 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSetEffect3324 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSetEffect3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerEffect_in_entryRuleTriggerEffect3381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTriggerEffect3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTriggerEffect3428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventEmission_in_ruleTriggerEffect3449 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTriggerEffect3461 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTriggerEffect3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExpression3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDeclaration_in_entryRuleDataTypeDeclaration3608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDeclaration3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDataTypeDeclaration3655 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDataTypeDeclaration3667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeDeclaration3684 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataTypeDeclaration3701 = new BitSet(new long[]{0x00000FC000000012L});
    public static final BitSet FOLLOW_ruleField_in_ruleDataTypeDeclaration3722 = new BitSet(new long[]{0x00000FC000000012L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField3759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleField3815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType3873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeBase_in_ruleDataType3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeBase_in_entryRuleDataTypeBase3992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeBase4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataTypeBase4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDataTypeBase4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDataTypeBase4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDataTypeBase4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDataTypeBase4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDataTypeBase4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression4176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDisjonction_in_ruleBooleanExpression4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDisjonction_in_entryRuleBooleanDisjonction4266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanDisjonction4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanConjonction_in_ruleBooleanDisjonction4323 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleBooleanDisjonction4345 = new BitSet(new long[]{0xF000C00000000000L});
    public static final BitSet FOLLOW_ruleBooleanConjonction_in_ruleBooleanDisjonction4367 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleBooleanConjonction_in_entryRuleBooleanConjonction4405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanConjonction4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnary_in_ruleBooleanConjonction4462 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleBooleanConjonction4484 = new BitSet(new long[]{0xF000C00000000000L});
    public static final BitSet FOLLOW_ruleBooleanUnary_in_ruleBooleanConjonction4506 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnary_in_entryRuleBooleanUnary4544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnary4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanTerminalExpression_in_ruleBooleanUnary4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBooleanUnary4629 = new BitSet(new long[]{0xF000800000000000L});
    public static final BitSet FOLLOW_ruleBooleanTerminalExpression_in_ruleBooleanUnary4651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanTerminalExpression_in_entryRuleBooleanTerminalExpression4688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanTerminalExpression4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleBooleanTerminalExpression4736 = new BitSet(new long[]{0xF000C00000000000L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleBooleanTerminalExpression4758 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleBooleanTerminalExpression4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanTerminalExpression4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression4844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberCompoundExpression_in_ruleNumberExpression4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberCompoundExpression_in_entryRuleNumberCompoundExpression4934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberCompoundExpression4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberAddition_in_ruleNumberCompoundExpression4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleNumberCompoundExpression5018 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleNumberCompoundExpression5030 = new BitSet(new long[]{0xF000C00000000000L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleNumberCompoundExpression5051 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleNumberCompoundExpression5063 = new BitSet(new long[]{0x0040800000000030L});
    public static final BitSet FOLLOW_ruleNumberAddition_in_ruleNumberCompoundExpression5084 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNumberCompoundExpression5105 = new BitSet(new long[]{0x0040800000000030L});
    public static final BitSet FOLLOW_ruleNumberAddition_in_ruleNumberCompoundExpression5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleNumberCompoundExpression5158 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleNumberCompoundExpression5170 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNumberCompoundExpression5191 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleNumberCompoundExpression5203 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleNumberSwitchExpressionNumberCase_in_ruleNumberCompoundExpression5234 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNumberCompoundExpression5256 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNumberCompoundExpression5269 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNumberCompoundExpression5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleNumberCompoundExpression5321 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleNumberCompoundExpression5333 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleNumberCompoundExpression5354 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleNumberCompoundExpression5366 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleNumberSwitchExpressionTextCase_in_ruleNumberCompoundExpression5397 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNumberCompoundExpression5419 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNumberCompoundExpression5432 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNumberCompoundExpression5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberSwitchExpressionNumberCase_in_entryRuleNumberSwitchExpressionNumberCase5492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberSwitchExpressionNumberCase5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNumberSwitchExpressionNumberCase5539 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNumberSwitchExpressionNumberCase5560 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNumberSwitchExpressionNumberCase5572 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNumberSwitchExpressionNumberCase5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberSwitchExpressionTextCase_in_entryRuleNumberSwitchExpressionTextCase5629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberSwitchExpressionTextCase5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNumberSwitchExpressionTextCase5676 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleNumberSwitchExpressionTextCase5697 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNumberSwitchExpressionTextCase5709 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNumberSwitchExpressionTextCase5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberAddition_in_entryRuleNumberAddition5766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberAddition5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberMultiplication_in_ruleNumberAddition5823 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_53_in_ruleNumberAddition5846 = new BitSet(new long[]{0x0040800000000030L});
    public static final BitSet FOLLOW_54_in_ruleNumberAddition5875 = new BitSet(new long[]{0x0040800000000030L});
    public static final BitSet FOLLOW_ruleNumberMultiplication_in_ruleNumberAddition5898 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleNumberMultiplication_in_entryRuleNumberMultiplication5936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberMultiplication5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberPower_in_ruleNumberMultiplication5993 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNumberMultiplication6016 = new BitSet(new long[]{0x0040800000000030L});
    public static final BitSet FOLLOW_56_in_ruleNumberMultiplication6045 = new BitSet(new long[]{0x0040800000000030L});
    public static final BitSet FOLLOW_57_in_ruleNumberMultiplication6074 = new BitSet(new long[]{0x0040800000000030L});
    public static final BitSet FOLLOW_ruleNumberPower_in_ruleNumberMultiplication6097 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleNumberPower_in_entryRuleNumberPower6135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberPower6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberUnary_in_ruleNumberPower6192 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNumberPower6214 = new BitSet(new long[]{0x0040800000000030L});
    public static final BitSet FOLLOW_ruleNumberUnary_in_ruleNumberPower6236 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleNumberUnary_in_entryRuleNumberUnary6274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberUnary6284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTerminalExpression_in_ruleNumberUnary6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNumberUnary6359 = new BitSet(new long[]{0x0000800000000030L});
    public static final BitSet FOLLOW_ruleNumberTerminalExpression_in_ruleNumberUnary6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTerminalExpression_in_entryRuleNumberTerminalExpression6418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberTerminalExpression6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNumberTerminalExpression6466 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNumberTerminalExpression6488 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleNumberTerminalExpression6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberTerminalExpression6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNumberTerminalExpression6571 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleNumberTerminalExpression6589 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNumberTerminalExpression6610 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_23_in_ruleNumberTerminalExpression6623 = new BitSet(new long[]{0x0044800040000030L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNumberTerminalExpression6644 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_48_in_ruleNumberTerminalExpression6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression6697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextJoin_in_ruleTextExpression6753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextJoin_in_entryRuleTextJoin6787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextJoin6797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextTerminalExpression_in_ruleTextJoin6844 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTextJoin6866 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTextTerminalExpression_in_ruleTextJoin6888 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleTextTerminalExpression_in_entryRuleTextTerminalExpression6926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextTerminalExpression6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextLiteral_in_ruleTextTerminalExpression6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral7030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBooleanLiteral7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBooleanLiteral7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBooleanLiteral7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBooleanLiteral7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral7177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberLiteral7228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleNumberLiteral7247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberLiteral7262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextLiteral_in_entryRuleTextLiteral7310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextLiteral7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextLiteral7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred1_InternalLil5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberSwitchExpressionNumberCase_in_synpred2_InternalLil5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred3_InternalLil5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberSwitchExpressionTextCase_in_synpred4_InternalLil5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred5_InternalLil5411 = new BitSet(new long[]{0x0000000000000002L});

}
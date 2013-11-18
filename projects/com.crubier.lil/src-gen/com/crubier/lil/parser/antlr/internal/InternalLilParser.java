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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interactor'", "':'", "'any'", "'self'", "'other'", "'parent'", "'child'", "'all'", "'actors'", "'actor'", "'as'", "'with'", "','", "'from'", "'init'", "'to'", "'in'", "'{'", "'}'", "'['", "']'", "'event'", "'flow'", "'void'", "'symbol'", "'number'", "'text'", "'time'", "'reference'", "'structure'", "'on'", "'if'", "'when'", "'always'", "'='", "'set'", "'trigger'", "'or'", "'and'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'<>'", "'?:'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'#'", "'('", "')'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'each'", "'Math.abs'", "'Math.acos'", "'Math.acosh'", "'Math.asin'", "'Math.asinh'", "'Math.atan'", "'Math.atanh'", "'Math.atan2'", "'Math.ceil'", "'Math.clip'", "'Math.cos'", "'Math.cosh'", "'Math.exp'", "'Math.floor'", "'Math.fround'", "'Math.hypot'", "'Math.log'", "'Math.log10'", "'Math.log2'", "'Math.max'", "'Math.min'", "'Math.pow'", "'Math.random'", "'Math.round'", "'Math.sign'", "'Math.sin'", "'Math.sinh'", "'Math.sqrt'", "'Math.tan'", "'Math.tanh'", "'Math.trunc'", "'Set.orderby'", "'Set.add'", "'Set.find'", "'Set.change'", "'Set.remove'", "'false'", "'true'", "'null'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=6;
    public static final int T__112=112;
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
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
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
        	return "LilModel";	
       	}
       	
       	@Override
       	protected LilGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLilModel"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:67:1: entryRuleLilModel returns [EObject current=null] : iv_ruleLilModel= ruleLilModel EOF ;
    public final EObject entryRuleLilModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLilModel = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:68:2: (iv_ruleLilModel= ruleLilModel EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:69:2: iv_ruleLilModel= ruleLilModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLilModelRule()); 
            }
            pushFollow(FOLLOW_ruleLilModel_in_entryRuleLilModel75);
            iv_ruleLilModel=ruleLilModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLilModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLilModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLilModel"


    // $ANTLR start "ruleLilModel"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:76:1: ruleLilModel returns [EObject current=null] : ( ( (lv_interactors_0_0= ruleInteractor ) ) | ( (lv_dataTypes_1_0= ruleDataTypeCompound ) ) )* ;
    public final EObject ruleLilModel() throws RecognitionException {
        EObject current = null;

        EObject lv_interactors_0_0 = null;

        EObject lv_dataTypes_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:79:28: ( ( ( (lv_interactors_0_0= ruleInteractor ) ) | ( (lv_dataTypes_1_0= ruleDataTypeCompound ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:1: ( ( (lv_interactors_0_0= ruleInteractor ) ) | ( (lv_dataTypes_1_0= ruleDataTypeCompound ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:1: ( ( (lv_interactors_0_0= ruleInteractor ) ) | ( (lv_dataTypes_1_0= ruleDataTypeCompound ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }
                else if ( (LA1_0==40) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:2: ( (lv_interactors_0_0= ruleInteractor ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:2: ( (lv_interactors_0_0= ruleInteractor ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:81:1: (lv_interactors_0_0= ruleInteractor )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:81:1: (lv_interactors_0_0= ruleInteractor )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:82:3: lv_interactors_0_0= ruleInteractor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getInteractorsInteractorParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractor_in_ruleLilModel131);
            	    lv_interactors_0_0=ruleInteractor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"interactors",
            	              		lv_interactors_0_0, 
            	              		"Interactor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:99:6: ( (lv_dataTypes_1_0= ruleDataTypeCompound ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:99:6: ( (lv_dataTypes_1_0= ruleDataTypeCompound ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:100:1: (lv_dataTypes_1_0= ruleDataTypeCompound )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:100:1: (lv_dataTypes_1_0= ruleDataTypeCompound )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:101:3: lv_dataTypes_1_0= ruleDataTypeCompound
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getDataTypesDataTypeCompoundParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDataTypeCompound_in_ruleLilModel158);
            	    lv_dataTypes_1_0=ruleDataTypeCompound();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dataTypes",
            	              		lv_dataTypes_1_0, 
            	              		"DataTypeCompound");
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
    // $ANTLR end "ruleLilModel"


    // $ANTLR start "entryRuleInteractor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:125:1: entryRuleInteractor returns [EObject current=null] : iv_ruleInteractor= ruleInteractor EOF ;
    public final EObject entryRuleInteractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractor = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:126:2: (iv_ruleInteractor= ruleInteractor EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:127:2: iv_ruleInteractor= ruleInteractor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorRule()); 
            }
            pushFollow(FOLLOW_ruleInteractor_in_entryRuleInteractor195);
            iv_ruleInteractor=ruleInteractor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractor205); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractor"


    // $ANTLR start "ruleInteractor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:134:1: ruleInteractor returns [EObject current=null] : (otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_signals_4_0= ruleSignal ) ) | ( (lv_behaviors_5_0= ruleBehavior ) ) )* ) ;
    public final EObject ruleInteractor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_entities_3_0 = null;

        EObject lv_signals_4_0 = null;

        EObject lv_behaviors_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:137:28: ( (otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_signals_4_0= ruleSignal ) ) | ( (lv_behaviors_5_0= ruleBehavior ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:138:1: (otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_signals_4_0= ruleSignal ) ) | ( (lv_behaviors_5_0= ruleBehavior ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:138:1: (otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_signals_4_0= ruleSignal ) ) | ( (lv_behaviors_5_0= ruleBehavior ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:138:3: otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_signals_4_0= ruleSignal ) ) | ( (lv_behaviors_5_0= ruleBehavior ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleInteractor242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorAccess().getInteractorKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:142:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:143:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:143:1: (lv_name_1_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:144:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractor259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getInteractorAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInteractor276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:164:1: ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_signals_4_0= ruleSignal ) ) | ( (lv_behaviors_5_0= ruleBehavior ) ) )*
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==12) ) {
                        switch ( input.LA(3) ) {
                        case 20:
                            {
                            alt2=1;
                            }
                            break;
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            {
                            alt2=2;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA2_7 = input.LA(4);

                            if ( (LA2_7==EOF||LA2_7==RULE_ID||LA2_7==11||LA2_7==22||(LA2_7>=40 && LA2_7<=41)||LA2_7==43) ) {
                                alt2=1;
                            }
                            else if ( (LA2_7==27||(LA2_7>=32 && LA2_7<=33)) ) {
                                alt2=2;
                            }


                            }
                            break;

                        }

                    }


                }
                else if ( (LA2_0==41||LA2_0==43) ) {
                    alt2=3;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:164:2: ( (lv_entities_3_0= ruleEntity ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:164:2: ( (lv_entities_3_0= ruleEntity ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:165:1: (lv_entities_3_0= ruleEntity )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:165:1: (lv_entities_3_0= ruleEntity )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:166:3: lv_entities_3_0= ruleEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorAccess().getEntitiesEntityParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEntity_in_ruleInteractor298);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entities",
            	              		lv_entities_3_0, 
            	              		"Entity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:183:6: ( (lv_signals_4_0= ruleSignal ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:183:6: ( (lv_signals_4_0= ruleSignal ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:184:1: (lv_signals_4_0= ruleSignal )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:184:1: (lv_signals_4_0= ruleSignal )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:185:3: lv_signals_4_0= ruleSignal
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorAccess().getSignalsSignalParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleInteractor325);
            	    lv_signals_4_0=ruleSignal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"signals",
            	              		lv_signals_4_0, 
            	              		"Signal");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:202:6: ( (lv_behaviors_5_0= ruleBehavior ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:202:6: ( (lv_behaviors_5_0= ruleBehavior ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:203:1: (lv_behaviors_5_0= ruleBehavior )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:203:1: (lv_behaviors_5_0= ruleBehavior )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:204:3: lv_behaviors_5_0= ruleBehavior
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorAccess().getBehaviorsBehaviorParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBehavior_in_ruleInteractor352);
            	    lv_behaviors_5_0=ruleBehavior();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"behaviors",
            	              		lv_behaviors_5_0, 
            	              		"Behavior");
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
    // $ANTLR end "ruleInteractor"


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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:237:1: ruleAccessibleEntity returns [EObject current=null] : ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAccessibleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_generic_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:240:28: ( ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:1: ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:1: ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=19)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:2: ( (lv_generic_0_0= ruleGenericEntity ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:2: ( (lv_generic_0_0= ruleGenericEntity ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:242:1: (lv_generic_0_0= ruleGenericEntity )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:242:1: (lv_generic_0_0= ruleGenericEntity )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:243:3: lv_generic_0_0= ruleGenericEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAccessibleEntityAccess().getGenericGenericEntityParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGenericEntity_in_ruleAccessibleEntity446);
                    lv_generic_0_0=ruleGenericEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAccessibleEntityRule());
                      	        }
                             		set(
                             			current, 
                             			"generic",
                              		lv_generic_0_0, 
                              		"GenericEntity");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:260:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:260:6: ( (otherlv_1= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:261:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:261:1: (otherlv_1= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:262:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAccessibleEntityRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAccessibleEntity472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getAccessibleEntityAccess().getSpecificEntityCrossReference_1_0()); 
                      	
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


    // $ANTLR start "entryRuleGenericEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:281:1: entryRuleGenericEntity returns [String current=null] : iv_ruleGenericEntity= ruleGenericEntity EOF ;
    public final String entryRuleGenericEntity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGenericEntity = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:282:2: (iv_ruleGenericEntity= ruleGenericEntity EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:283:2: iv_ruleGenericEntity= ruleGenericEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenericEntityRule()); 
            }
            pushFollow(FOLLOW_ruleGenericEntity_in_entryRuleGenericEntity509);
            iv_ruleGenericEntity=ruleGenericEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenericEntity.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericEntity520); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenericEntity"


    // $ANTLR start "ruleGenericEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:290:1: ruleGenericEntity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' ) ;
    public final AntlrDatatypeRuleToken ruleGenericEntity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:293:28: ( (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:294:1: (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:294:1: (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:295:2: kw= 'any'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleGenericEntity558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getAnyKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:302:2: kw= 'self'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleGenericEntity577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getSelfKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:309:2: kw= 'other'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleGenericEntity596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getOtherKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:316:2: kw= 'parent'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleGenericEntity615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getParentKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:323:2: kw= 'child'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleGenericEntity634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getChildKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:330:2: kw= 'all'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleGenericEntity653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getAllKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:337:2: kw= 'actors'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleGenericEntity672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getActorsKeyword_6()); 
                          
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
    // $ANTLR end "ruleGenericEntity"


    // $ANTLR start "entryRuleEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:350:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:351:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:352:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity712);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity722); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:359:1: ruleEntity returns [EObject current=null] : (this_Actor_0= ruleActor | this_Component_1= ruleComponent ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Component_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:362:28: ( (this_Actor_0= ruleActor | this_Component_1= ruleComponent ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:363:1: (this_Actor_0= ruleActor | this_Component_1= ruleComponent )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:363:1: (this_Actor_0= ruleActor | this_Component_1= ruleComponent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==12) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==20) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==RULE_ID) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:364:5: this_Actor_0= ruleActor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityAccess().getActorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActor_in_ruleEntity769);
                    this_Actor_0=ruleActor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Actor_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:374:5: this_Component_1= ruleComponent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityAccess().getComponentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComponent_in_ruleEntity796);
                    this_Component_1=ruleComponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Component_1; 
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleActor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:390:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:391:2: (iv_ruleActor= ruleActor EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:392:2: iv_ruleActor= ruleActor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorRule()); 
            }
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor831);
            iv_ruleActor=ruleActor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor841); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:399:1: ruleActor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'actor' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:402:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'actor' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:403:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'actor' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:403:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'actor' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:403:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'actor'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:403:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:404:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:404:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:405:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleActor900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleActor912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getActorKeyword_2());
                  
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


    // $ANTLR start "entryRuleActorAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:437:1: entryRuleActorAlias returns [EObject current=null] : iv_ruleActorAlias= ruleActorAlias EOF ;
    public final EObject entryRuleActorAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorAlias = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:438:2: (iv_ruleActorAlias= ruleActorAlias EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:439:2: iv_ruleActorAlias= ruleActorAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorAliasRule()); 
            }
            pushFollow(FOLLOW_ruleActorAlias_in_entryRuleActorAlias948);
            iv_ruleActorAlias=ruleActorAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorAlias958); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:446:1: ruleActorAlias returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleActorAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:449:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:450:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:450:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:450:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:450:2: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:451:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:451:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:452:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActorAliasRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorAlias1003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getActorAliasAccess().getSourceActorCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleActorAlias1015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorAliasAccess().getAsKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:467:1: ( (otherlv_2= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:468:1: (otherlv_2= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:468:1: (otherlv_2= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:469:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActorAliasRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorAlias1035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getActorAliasAccess().getAliasActorCrossReference_2_0()); 
              	
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


    // $ANTLR start "entryRuleComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:488:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:489:2: (iv_ruleComponent= ruleComponent EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:490:2: iv_ruleComponent= ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent1071);
            iv_ruleComponent=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent1081); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:497:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )* )? ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_actors_4_0 = null;

        EObject lv_actors_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:500:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )* )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:501:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )* )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:501:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )* )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:501:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )* )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:501:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:502:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:502:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:503:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent1123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleComponent1140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:523:1: ( (otherlv_2= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:524:1: (otherlv_2= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:524:1: (otherlv_2= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:525:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent1160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getInteractorInteractorCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:536:2: (otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:536:4: otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )*
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleComponent1173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getWithKeyword_3_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:540:1: ( (lv_actors_4_0= ruleActorAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:541:1: (lv_actors_4_0= ruleActorAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:541:1: (lv_actors_4_0= ruleActorAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:542:3: lv_actors_4_0= ruleActorAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentAccess().getActorsActorAliasParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleActorAlias_in_ruleComponent1194);
                    lv_actors_4_0=ruleActorAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentRule());
                      	        }
                             		add(
                             			current, 
                             			"actors",
                              		lv_actors_4_0, 
                              		"ActorAlias");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:558:2: (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==23) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:558:4: otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleComponent1207); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:562:1: ( (lv_actors_6_0= ruleActorAlias ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:563:1: (lv_actors_6_0= ruleActorAlias )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:563:1: (lv_actors_6_0= ruleActorAlias )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:564:3: lv_actors_6_0= ruleActorAlias
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getComponentAccess().getActorsActorAliasParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleActorAlias_in_ruleComponent1228);
                    	    lv_actors_6_0=ruleActorAlias();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"actors",
                    	              		lv_actors_6_0, 
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleSignalReception"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:588:1: entryRuleSignalReception returns [EObject current=null] : iv_ruleSignalReception= ruleSignalReception EOF ;
    public final EObject entryRuleSignalReception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReception = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:589:2: (iv_ruleSignalReception= ruleSignalReception EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:590:2: iv_ruleSignalReception= ruleSignalReception EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalReceptionRule()); 
            }
            pushFollow(FOLLOW_ruleSignalReception_in_entryRuleSignalReception1268);
            iv_ruleSignalReception=ruleSignalReception();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalReception; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReception1278); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignalReception"


    // $ANTLR start "ruleSignalReception"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:597:1: ruleSignalReception returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) ) ;
    public final EObject ruleSignalReception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_init_3_0=null;
        EObject lv_source_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:600:28: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:601:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:601:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) )
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:601:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:601:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:601:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:601:3: ( (otherlv_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:602:1: (otherlv_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:602:1: (otherlv_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:603:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalReceptionRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalReception1324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getSignalReceptionAccess().getInstanceSignalCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:614:2: (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==24) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:614:4: otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) )
                            {
                            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleSignalReception1337); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getSignalReceptionAccess().getFromKeyword_0_1_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:618:1: ( (lv_source_2_0= ruleSignalAlias ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:619:1: (lv_source_2_0= ruleSignalAlias )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:619:1: (lv_source_2_0= ruleSignalAlias )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:620:3: lv_source_2_0= ruleSignalAlias
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalReceptionAccess().getSourceSignalAliasParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSignalAlias_in_ruleSignalReception1358);
                            lv_source_2_0=ruleSignalAlias();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSignalReceptionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"source",
                                      		lv_source_2_0, 
                                      		"SignalAlias");
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:637:6: ( (lv_init_3_0= 'init' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:637:6: ( (lv_init_3_0= 'init' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:638:1: (lv_init_3_0= 'init' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:638:1: (lv_init_3_0= 'init' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:639:3: lv_init_3_0= 'init'
                    {
                    lv_init_3_0=(Token)match(input,25,FOLLOW_25_in_ruleSignalReception1385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_init_3_0, grammarAccess.getSignalReceptionAccess().getInitInitKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalReceptionRule());
                      	        }
                             		setWithLastConsumed(current, "init", true, "init");
                      	    
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
    // $ANTLR end "ruleSignalReception"


    // $ANTLR start "entryRuleSignalEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:660:1: entryRuleSignalEmission returns [EObject current=null] : iv_ruleSignalEmission= ruleSignalEmission EOF ;
    public final EObject entryRuleSignalEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalEmission = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:661:2: (iv_ruleSignalEmission= ruleSignalEmission EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:662:2: iv_ruleSignalEmission= ruleSignalEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleSignalEmission_in_entryRuleSignalEmission1434);
            iv_ruleSignalEmission=ruleSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalEmission1444); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignalEmission"


    // $ANTLR start "ruleSignalEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:669:1: ruleSignalEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) ) )? ) ;
    public final EObject ruleSignalEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_destination_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:672:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:673:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:673:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:673:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:673:2: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:675:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSignalEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalEmission1489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getSignalEmissionAccess().getInstanceSignalCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:686:2: (otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:686:4: otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSignalEmission1502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSignalEmissionAccess().getToKeyword_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:690:1: ( (lv_destination_2_0= ruleSignalAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:691:1: (lv_destination_2_0= ruleSignalAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:691:1: (lv_destination_2_0= ruleSignalAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:692:3: lv_destination_2_0= ruleSignalAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignalEmissionAccess().getDestinationSignalAliasParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignalAlias_in_ruleSignalEmission1523);
                    lv_destination_2_0=ruleSignalAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignalEmissionRule());
                      	        }
                             		set(
                             			current, 
                             			"destination",
                              		lv_destination_2_0, 
                              		"SignalAlias");
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
    // $ANTLR end "ruleSignalEmission"


    // $ANTLR start "entryRuleSignal"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:716:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:717:2: (iv_ruleSignal= ruleSignal EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:718:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalRule()); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal1561);
            iv_ruleSignal=ruleSignal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal1571); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:725:1: ruleSignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) (otherlv_3= 'in' ( (lv_definitionSet_4_0= ruleDefinitionSet ) ) )? ( (lv_mode_5_0= ruleSignalMode ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleSignalAlias ) ) )? (otherlv_8= 'to' ( (lv_destinations_9_0= ruleSignalAlias ) ) )* ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_type_2_0 = null;

        EObject lv_definitionSet_4_0 = null;

        AntlrDatatypeRuleToken lv_mode_5_0 = null;

        EObject lv_source_7_0 = null;

        EObject lv_destinations_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:728:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) (otherlv_3= 'in' ( (lv_definitionSet_4_0= ruleDefinitionSet ) ) )? ( (lv_mode_5_0= ruleSignalMode ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleSignalAlias ) ) )? (otherlv_8= 'to' ( (lv_destinations_9_0= ruleSignalAlias ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:729:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) (otherlv_3= 'in' ( (lv_definitionSet_4_0= ruleDefinitionSet ) ) )? ( (lv_mode_5_0= ruleSignalMode ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleSignalAlias ) ) )? (otherlv_8= 'to' ( (lv_destinations_9_0= ruleSignalAlias ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:729:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) (otherlv_3= 'in' ( (lv_definitionSet_4_0= ruleDefinitionSet ) ) )? ( (lv_mode_5_0= ruleSignalMode ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleSignalAlias ) ) )? (otherlv_8= 'to' ( (lv_destinations_9_0= ruleSignalAlias ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:729:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) (otherlv_3= 'in' ( (lv_definitionSet_4_0= ruleDefinitionSet ) ) )? ( (lv_mode_5_0= ruleSignalMode ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleSignalAlias ) ) )? (otherlv_8= 'to' ( (lv_destinations_9_0= ruleSignalAlias ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:729:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:730:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:730:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:731:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSignalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleSignal1630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSignalAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:751:1: ( (lv_type_2_0= ruleDataType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:752:1: (lv_type_2_0= ruleDataType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:752:1: (lv_type_2_0= ruleDataType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:753:3: lv_type_2_0= ruleDataType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignalAccess().getTypeDataTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataType_in_ruleSignal1651);
            lv_type_2_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignalRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"DataType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:769:2: (otherlv_3= 'in' ( (lv_definitionSet_4_0= ruleDefinitionSet ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:769:4: otherlv_3= 'in' ( (lv_definitionSet_4_0= ruleDefinitionSet ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleSignal1664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSignalAccess().getInKeyword_3_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:773:1: ( (lv_definitionSet_4_0= ruleDefinitionSet ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:774:1: (lv_definitionSet_4_0= ruleDefinitionSet )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:774:1: (lv_definitionSet_4_0= ruleDefinitionSet )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:775:3: lv_definitionSet_4_0= ruleDefinitionSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignalAccess().getDefinitionSetDefinitionSetParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefinitionSet_in_ruleSignal1685);
                    lv_definitionSet_4_0=ruleDefinitionSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignalRule());
                      	        }
                             		set(
                             			current, 
                             			"definitionSet",
                              		lv_definitionSet_4_0, 
                              		"DefinitionSet");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:791:4: ( (lv_mode_5_0= ruleSignalMode ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:792:1: (lv_mode_5_0= ruleSignalMode )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:792:1: (lv_mode_5_0= ruleSignalMode )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:793:3: lv_mode_5_0= ruleSignalMode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignalAccess().getModeSignalModeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalMode_in_ruleSignal1708);
            lv_mode_5_0=ruleSignalMode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignalRule());
              	        }
                     		set(
                     			current, 
                     			"mode",
                      		lv_mode_5_0, 
                      		"SignalMode");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:809:2: (otherlv_6= 'from' ( (lv_source_7_0= ruleSignalAlias ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:809:4: otherlv_6= 'from' ( (lv_source_7_0= ruleSignalAlias ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleSignal1721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSignalAccess().getFromKeyword_5_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:813:1: ( (lv_source_7_0= ruleSignalAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:814:1: (lv_source_7_0= ruleSignalAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:814:1: (lv_source_7_0= ruleSignalAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:815:3: lv_source_7_0= ruleSignalAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignalAccess().getSourceSignalAliasParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignalAlias_in_ruleSignal1742);
                    lv_source_7_0=ruleSignalAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignalRule());
                      	        }
                             		set(
                             			current, 
                             			"source",
                              		lv_source_7_0, 
                              		"SignalAlias");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:831:4: (otherlv_8= 'to' ( (lv_destinations_9_0= ruleSignalAlias ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:831:6: otherlv_8= 'to' ( (lv_destinations_9_0= ruleSignalAlias ) )
            	    {
            	    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleSignal1757); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getSignalAccess().getToKeyword_6_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:835:1: ( (lv_destinations_9_0= ruleSignalAlias ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:836:1: (lv_destinations_9_0= ruleSignalAlias )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:836:1: (lv_destinations_9_0= ruleSignalAlias )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:837:3: lv_destinations_9_0= ruleSignalAlias
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSignalAccess().getDestinationsSignalAliasParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignalAlias_in_ruleSignal1778);
            	    lv_destinations_9_0=ruleSignalAlias();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSignalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"destinations",
            	              		lv_destinations_9_0, 
            	              		"SignalAlias");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:861:1: entryRuleDefinitionSet returns [EObject current=null] : iv_ruleDefinitionSet= ruleDefinitionSet EOF ;
    public final EObject entryRuleDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:862:2: (iv_ruleDefinitionSet= ruleDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:863:2: iv_ruleDefinitionSet= ruleDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDefinitionSet_in_entryRuleDefinitionSet1816);
            iv_ruleDefinitionSet=ruleDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionSet1826); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinitionSet"


    // $ANTLR start "ruleDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:870:1: ruleDefinitionSet returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_elements_2_0= ruleXEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXEnumElement ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '{' ( (lv_elements_8_0= ruleXNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleXNumberLiteral ) ) )* otherlv_11= '}' ) | ( () otherlv_13= '[' ( (lv_inf_14_0= ruleXNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleXNumberLiteral ) ) otherlv_17= ']' ) ) ;
    public final EObject ruleDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_inf_14_0 = null;

        EObject lv_sup_16_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:873:28: ( ( ( () otherlv_1= '{' ( (lv_elements_2_0= ruleXEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXEnumElement ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '{' ( (lv_elements_8_0= ruleXNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleXNumberLiteral ) ) )* otherlv_11= '}' ) | ( () otherlv_13= '[' ( (lv_inf_14_0= ruleXNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleXNumberLiteral ) ) otherlv_17= ']' ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:874:1: ( ( () otherlv_1= '{' ( (lv_elements_2_0= ruleXEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXEnumElement ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '{' ( (lv_elements_8_0= ruleXNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleXNumberLiteral ) ) )* otherlv_11= '}' ) | ( () otherlv_13= '[' ( (lv_inf_14_0= ruleXNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleXNumberLiteral ) ) otherlv_17= ']' ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:874:1: ( ( () otherlv_1= '{' ( (lv_elements_2_0= ruleXEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXEnumElement ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '{' ( (lv_elements_8_0= ruleXNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleXNumberLiteral ) ) )* otherlv_11= '}' ) | ( () otherlv_13= '[' ( (lv_inf_14_0= ruleXNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleXNumberLiteral ) ) otherlv_17= ']' ) )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_INT) ) {
                    alt16=2;
                }
                else if ( (LA16_1==64) ) {
                    alt16=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0==30) ) {
                alt16=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:874:2: ( () otherlv_1= '{' ( (lv_elements_2_0= ruleXEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXEnumElement ) ) )* otherlv_5= '}' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:874:2: ( () otherlv_1= '{' ( (lv_elements_2_0= ruleXEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXEnumElement ) ) )* otherlv_5= '}' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:874:3: () otherlv_1= '{' ( (lv_elements_2_0= ruleXEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXEnumElement ) ) )* otherlv_5= '}'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:874:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:875:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefinitionSetAccess().getEnumDefinitionSetAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleDefinitionSet1873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefinitionSetAccess().getLeftCurlyBracketKeyword_0_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:884:1: ( (lv_elements_2_0= ruleXEnumElement ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:885:1: (lv_elements_2_0= ruleXEnumElement )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:885:1: (lv_elements_2_0= ruleXEnumElement )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:886:3: lv_elements_2_0= ruleXEnumElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionSetAccess().getElementsXEnumElementParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXEnumElement_in_ruleDefinitionSet1894);
                    lv_elements_2_0=ruleXEnumElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionSetRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"XEnumElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:902:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleXEnumElement ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==23) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:902:4: otherlv_3= ',' ( (lv_elements_4_0= ruleXEnumElement ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleDefinitionSet1907); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getDefinitionSetAccess().getCommaKeyword_0_3_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:906:1: ( (lv_elements_4_0= ruleXEnumElement ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:907:1: (lv_elements_4_0= ruleXEnumElement )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:907:1: (lv_elements_4_0= ruleXEnumElement )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:908:3: lv_elements_4_0= ruleXEnumElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefinitionSetAccess().getElementsXEnumElementParserRuleCall_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXEnumElement_in_ruleDefinitionSet1928);
                    	    lv_elements_4_0=ruleXEnumElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefinitionSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_4_0, 
                    	              		"XEnumElement");
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

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleDefinitionSet1942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDefinitionSetAccess().getRightCurlyBracketKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:929:6: ( () otherlv_7= '{' ( (lv_elements_8_0= ruleXNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleXNumberLiteral ) ) )* otherlv_11= '}' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:929:6: ( () otherlv_7= '{' ( (lv_elements_8_0= ruleXNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleXNumberLiteral ) ) )* otherlv_11= '}' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:929:7: () otherlv_7= '{' ( (lv_elements_8_0= ruleXNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleXNumberLiteral ) ) )* otherlv_11= '}'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:929:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:930:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefinitionSetAccess().getNumberDefinitionSetAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleDefinitionSet1971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDefinitionSetAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:939:1: ( (lv_elements_8_0= ruleXNumberLiteral ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:940:1: (lv_elements_8_0= ruleXNumberLiteral )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:940:1: (lv_elements_8_0= ruleXNumberLiteral )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:941:3: lv_elements_8_0= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionSetAccess().getElementsXNumberLiteralParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleDefinitionSet1992);
                    lv_elements_8_0=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionSetRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_8_0, 
                              		"XNumberLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:957:2: (otherlv_9= ',' ( (lv_elements_10_0= ruleXNumberLiteral ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==23) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:957:4: otherlv_9= ',' ( (lv_elements_10_0= ruleXNumberLiteral ) )
                    	    {
                    	    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleDefinitionSet2005); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getDefinitionSetAccess().getCommaKeyword_1_3_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:961:1: ( (lv_elements_10_0= ruleXNumberLiteral ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:962:1: (lv_elements_10_0= ruleXNumberLiteral )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:962:1: (lv_elements_10_0= ruleXNumberLiteral )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:963:3: lv_elements_10_0= ruleXNumberLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefinitionSetAccess().getElementsXNumberLiteralParserRuleCall_1_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleDefinitionSet2026);
                    	    lv_elements_10_0=ruleXNumberLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefinitionSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_10_0, 
                    	              		"XNumberLiteral");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleDefinitionSet2040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDefinitionSetAccess().getRightCurlyBracketKeyword_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:984:6: ( () otherlv_13= '[' ( (lv_inf_14_0= ruleXNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleXNumberLiteral ) ) otherlv_17= ']' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:984:6: ( () otherlv_13= '[' ( (lv_inf_14_0= ruleXNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleXNumberLiteral ) ) otherlv_17= ']' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:984:7: () otherlv_13= '[' ( (lv_inf_14_0= ruleXNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleXNumberLiteral ) ) otherlv_17= ']'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:984:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:985:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefinitionSetAccess().getNumberDefinitionIntervalAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleDefinitionSet2069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getDefinitionSetAccess().getLeftSquareBracketKeyword_2_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:994:1: ( (lv_inf_14_0= ruleXNumberLiteral ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:995:1: (lv_inf_14_0= ruleXNumberLiteral )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:995:1: (lv_inf_14_0= ruleXNumberLiteral )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:996:3: lv_inf_14_0= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionSetAccess().getInfXNumberLiteralParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleDefinitionSet2090);
                    lv_inf_14_0=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"inf",
                              		lv_inf_14_0, 
                              		"XNumberLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleDefinitionSet2102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getDefinitionSetAccess().getCommaKeyword_2_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1016:1: ( (lv_sup_16_0= ruleXNumberLiteral ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1017:1: (lv_sup_16_0= ruleXNumberLiteral )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1017:1: (lv_sup_16_0= ruleXNumberLiteral )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1018:3: lv_sup_16_0= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionSetAccess().getSupXNumberLiteralParserRuleCall_2_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleDefinitionSet2123);
                    lv_sup_16_0=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"sup",
                              		lv_sup_16_0, 
                              		"XNumberLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,31,FOLLOW_31_in_ruleDefinitionSet2135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getDefinitionSetAccess().getRightSquareBracketKeyword_2_5());
                          
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
    // $ANTLR end "ruleDefinitionSet"


    // $ANTLR start "entryRuleSignalAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1046:1: entryRuleSignalAlias returns [EObject current=null] : iv_ruleSignalAlias= ruleSignalAlias EOF ;
    public final EObject entryRuleSignalAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalAlias = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1047:2: (iv_ruleSignalAlias= ruleSignalAlias EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1048:2: iv_ruleSignalAlias= ruleSignalAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalAliasRule()); 
            }
            pushFollow(FOLLOW_ruleSignalAlias_in_entryRuleSignalAlias2172);
            iv_ruleSignalAlias=ruleSignalAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalAlias2182); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignalAlias"


    // $ANTLR start "ruleSignalAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1055:1: ruleSignalAlias returns [EObject current=null] : ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleSignalAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_source_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1058:28: ( ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1059:1: ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1059:1: ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1059:2: ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1059:2: ( (lv_source_0_0= ruleAccessibleEntity ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1060:1: (lv_source_0_0= ruleAccessibleEntity )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1060:1: (lv_source_0_0= ruleAccessibleEntity )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1061:3: lv_source_0_0= ruleAccessibleEntity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignalAliasAccess().getSourceAccessibleEntityParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAccessibleEntity_in_ruleSignalAlias2228);
            lv_source_0_0=ruleAccessibleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignalAliasRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_0_0, 
                      		"AccessibleEntity");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1077:2: (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1077:4: otherlv_1= 'as' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSignalAlias2241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSignalAliasAccess().getAsKeyword_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1081:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1082:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1082:1: (otherlv_2= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1083:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalAliasRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalAlias2261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getSignalAliasAccess().getAliasSignalCrossReference_1_1_0()); 
                      	
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
    // $ANTLR end "ruleSignalAlias"


    // $ANTLR start "entryRuleSignalMode"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1102:1: entryRuleSignalMode returns [String current=null] : iv_ruleSignalMode= ruleSignalMode EOF ;
    public final String entryRuleSignalMode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignalMode = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1103:2: (iv_ruleSignalMode= ruleSignalMode EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1104:2: iv_ruleSignalMode= ruleSignalMode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalModeRule()); 
            }
            pushFollow(FOLLOW_ruleSignalMode_in_entryRuleSignalMode2300);
            iv_ruleSignalMode=ruleSignalMode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalMode.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalMode2311); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignalMode"


    // $ANTLR start "ruleSignalMode"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1111:1: ruleSignalMode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'event' | kw= 'flow' ) ;
    public final AntlrDatatypeRuleToken ruleSignalMode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1114:28: ( (kw= 'event' | kw= 'flow' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1115:1: (kw= 'event' | kw= 'flow' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1115:1: (kw= 'event' | kw= 'flow' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1116:2: kw= 'event'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleSignalMode2349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignalModeAccess().getEventKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1123:2: kw= 'flow'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleSignalMode2368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignalModeAccess().getFlowKeyword_1()); 
                          
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
    // $ANTLR end "ruleSignalMode"


    // $ANTLR start "entryRuleDataType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1136:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1137:2: (iv_ruleDataType= ruleDataType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1138:2: iv_ruleDataType= ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType2408);
            iv_ruleDataType=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType2418); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1145:1: ruleDataType returns [EObject current=null] : ( ( (lv_base_0_0= ruleDataTypeBase ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_base_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1148:28: ( ( ( (lv_base_0_0= ruleDataTypeBase ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1149:1: ( ( (lv_base_0_0= ruleDataTypeBase ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1149:1: ( ( (lv_base_0_0= ruleDataTypeBase ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=34 && LA19_0<=39)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1149:2: ( (lv_base_0_0= ruleDataTypeBase ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1149:2: ( (lv_base_0_0= ruleDataTypeBase ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1150:1: (lv_base_0_0= ruleDataTypeBase )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1150:1: (lv_base_0_0= ruleDataTypeBase )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1151:3: lv_base_0_0= ruleDataTypeBase
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeAccess().getBaseDataTypeBaseParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataTypeBase_in_ruleDataType2464);
                    lv_base_0_0=ruleDataTypeBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"base",
                              		lv_base_0_0, 
                              		"DataTypeBase");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1168:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1168:6: ( (otherlv_1= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1169:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1169:1: (otherlv_1= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1170:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType2490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getCompoundDataTypeCompoundCrossReference_1_0()); 
                      	
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1189:1: entryRuleDataTypeBase returns [String current=null] : iv_ruleDataTypeBase= ruleDataTypeBase EOF ;
    public final String entryRuleDataTypeBase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataTypeBase = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1190:2: (iv_ruleDataTypeBase= ruleDataTypeBase EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1191:2: iv_ruleDataTypeBase= ruleDataTypeBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeBaseRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeBase_in_entryRuleDataTypeBase2527);
            iv_ruleDataTypeBase=ruleDataTypeBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeBase.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeBase2538); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1198:1: ruleDataTypeBase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'reference' ) ;
    public final AntlrDatatypeRuleToken ruleDataTypeBase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1201:28: ( (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'reference' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1202:1: (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'reference' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1202:1: (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'reference' )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt20=1;
                }
                break;
            case 35:
                {
                alt20=2;
                }
                break;
            case 36:
                {
                alt20=3;
                }
                break;
            case 37:
                {
                alt20=4;
                }
                break;
            case 38:
                {
                alt20=5;
                }
                break;
            case 39:
                {
                alt20=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1203:2: kw= 'void'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleDataTypeBase2576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataTypeBaseAccess().getVoidKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1210:2: kw= 'symbol'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleDataTypeBase2595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataTypeBaseAccess().getSymbolKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1217:2: kw= 'number'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleDataTypeBase2614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataTypeBaseAccess().getNumberKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1224:2: kw= 'text'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleDataTypeBase2633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataTypeBaseAccess().getTextKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1231:2: kw= 'time'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleDataTypeBase2652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataTypeBaseAccess().getTimeKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1238:2: kw= 'reference'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleDataTypeBase2671); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDataTypeCompound"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1251:1: entryRuleDataTypeCompound returns [EObject current=null] : iv_ruleDataTypeCompound= ruleDataTypeCompound EOF ;
    public final EObject entryRuleDataTypeCompound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeCompound = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1252:2: (iv_ruleDataTypeCompound= ruleDataTypeCompound EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1253:2: iv_ruleDataTypeCompound= ruleDataTypeCompound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeCompoundRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeCompound_in_entryRuleDataTypeCompound2711);
            iv_ruleDataTypeCompound=ruleDataTypeCompound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeCompound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeCompound2721); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeCompound"


    // $ANTLR start "ruleDataTypeCompound"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1260:1: ruleDataTypeCompound returns [EObject current=null] : (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fields_3_0= ruleDataTypeCompoundField ) )* ) ;
    public final EObject ruleDataTypeCompound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1263:28: ( (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fields_3_0= ruleDataTypeCompoundField ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1264:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fields_3_0= ruleDataTypeCompoundField ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1264:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fields_3_0= ruleDataTypeCompoundField ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1264:3: otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fields_3_0= ruleDataTypeCompoundField ) )*
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleDataTypeCompound2758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDataTypeCompoundAccess().getStructureKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1268:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1269:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1269:1: (lv_name_1_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1270:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeCompound2775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeCompoundAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataTypeCompoundRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDataTypeCompound2792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDataTypeCompoundAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1290:1: ( (lv_fields_3_0= ruleDataTypeCompoundField ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1291:1: (lv_fields_3_0= ruleDataTypeCompoundField )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1291:1: (lv_fields_3_0= ruleDataTypeCompoundField )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1292:3: lv_fields_3_0= ruleDataTypeCompoundField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataTypeCompoundAccess().getFieldsDataTypeCompoundFieldParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDataTypeCompoundField_in_ruleDataTypeCompound2813);
            	    lv_fields_3_0=ruleDataTypeCompoundField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataTypeCompoundRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_3_0, 
            	              		"DataTypeCompoundField");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleDataTypeCompound"


    // $ANTLR start "entryRuleDataTypeCompoundField"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1316:1: entryRuleDataTypeCompoundField returns [EObject current=null] : iv_ruleDataTypeCompoundField= ruleDataTypeCompoundField EOF ;
    public final EObject entryRuleDataTypeCompoundField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeCompoundField = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1317:2: (iv_ruleDataTypeCompoundField= ruleDataTypeCompoundField EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1318:2: iv_ruleDataTypeCompoundField= ruleDataTypeCompoundField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeCompoundFieldRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeCompoundField_in_entryRuleDataTypeCompoundField2850);
            iv_ruleDataTypeCompoundField=ruleDataTypeCompoundField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeCompoundField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeCompoundField2860); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeCompoundField"


    // $ANTLR start "ruleDataTypeCompoundField"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1325:1: ruleDataTypeCompoundField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleDataTypeCompoundField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1328:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1329:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1329:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1329:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1329:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1330:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1330:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1331:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeCompoundField2902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getDataTypeCompoundFieldAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataTypeCompoundFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleDataTypeCompoundField2919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataTypeCompoundFieldAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1351:1: ( (lv_type_2_0= ruleDataType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1352:1: (lv_type_2_0= ruleDataType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1352:1: (lv_type_2_0= ruleDataType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1353:3: lv_type_2_0= ruleDataType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataTypeCompoundFieldAccess().getTypeDataTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataType_in_ruleDataTypeCompoundField2940);
            lv_type_2_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataTypeCompoundFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"DataType");
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
    // $ANTLR end "ruleDataTypeCompoundField"


    // $ANTLR start "entryRuleBehavior"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1377:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1378:2: (iv_ruleBehavior= ruleBehavior EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1379:2: iv_ruleBehavior= ruleBehavior EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBehaviorRule()); 
            }
            pushFollow(FOLLOW_ruleBehavior_in_entryRuleBehavior2976);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBehavior; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehavior2986); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1386:1: ruleBehavior returns [EObject current=null] : ( ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+ ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cause_0_0 = null;

        EObject lv_effects_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1389:28: ( ( ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+ ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1390:1: ( ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+ )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1390:1: ( ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+ )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1390:2: ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1390:2: ( (lv_cause_0_0= ruleCause ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1391:1: (lv_cause_0_0= ruleCause )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1391:1: (lv_cause_0_0= ruleCause )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1392:3: lv_cause_0_0= ruleCause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBehaviorAccess().getCauseCauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCause_in_ruleBehavior3032);
            lv_cause_0_0=ruleCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleBehavior3044); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBehaviorAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1412:1: ( (lv_effects_2_0= ruleEffect ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44||(LA22_0>=46 && LA22_0<=47)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1413:1: (lv_effects_2_0= ruleEffect )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1413:1: (lv_effects_2_0= ruleEffect )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1414:3: lv_effects_2_0= ruleEffect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBehaviorAccess().getEffectsEffectParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEffect_in_ruleBehavior3065);
            	    lv_effects_2_0=ruleEffect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
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
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1438:1: entryRuleCause returns [EObject current=null] : iv_ruleCause= ruleCause EOF ;
    public final EObject entryRuleCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1439:2: (iv_ruleCause= ruleCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1440:2: iv_ruleCause= ruleCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCauseRule()); 
            }
            pushFollow(FOLLOW_ruleCause_in_entryRuleCause3102);
            iv_ruleCause=ruleCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCause3112); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1447:1: ruleCause returns [EObject current=null] : (this_OnCause_0= ruleOnCause | this_WhenCause_1= ruleWhenCause ) ;
    public final EObject ruleCause() throws RecognitionException {
        EObject current = null;

        EObject this_OnCause_0 = null;

        EObject this_WhenCause_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1450:28: ( (this_OnCause_0= ruleOnCause | this_WhenCause_1= ruleWhenCause ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1451:1: (this_OnCause_0= ruleOnCause | this_WhenCause_1= ruleWhenCause )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1451:1: (this_OnCause_0= ruleOnCause | this_WhenCause_1= ruleWhenCause )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            else if ( (LA23_0==43) ) {
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1452:5: this_OnCause_0= ruleOnCause
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCauseAccess().getOnCauseParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCause_in_ruleCause3159);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1462:5: this_WhenCause_1= ruleWhenCause
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCauseAccess().getWhenCauseParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhenCause_in_ruleCause3186);
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1478:1: entryRuleOnCause returns [EObject current=null] : iv_ruleOnCause= ruleOnCause EOF ;
    public final EObject entryRuleOnCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1479:2: (iv_ruleOnCause= ruleOnCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1480:2: iv_ruleOnCause= ruleOnCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCauseRule()); 
            }
            pushFollow(FOLLOW_ruleOnCause_in_entryRuleOnCause3221);
            iv_ruleOnCause=ruleOnCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCause3231); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1487:1: ruleOnCause returns [EObject current=null] : (otherlv_0= 'on' ( (lv_event_1_0= ruleSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleOnCause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_event_1_0 = null;

        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1490:28: ( (otherlv_0= 'on' ( (lv_event_1_0= ruleSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1491:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1491:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1491:3: otherlv_0= 'on' ( (lv_event_1_0= ruleSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleOnCause3268); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOnCauseAccess().getOnKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1495:1: ( (lv_event_1_0= ruleSignalReception ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1496:1: (lv_event_1_0= ruleSignalReception )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1496:1: (lv_event_1_0= ruleSignalReception )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1497:3: lv_event_1_0= ruleSignalReception
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOnCauseAccess().getEventSignalReceptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalReception_in_ruleOnCause3289);
            lv_event_1_0=ruleSignalReception();

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
                      		"SignalReception");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1513:2: (otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1513:4: otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleOnCause3302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOnCauseAccess().getIfKeyword_2_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1517:1: ( (lv_guard_3_0= ruleXExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1518:1: (lv_guard_3_0= ruleXExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1518:1: (lv_guard_3_0= ruleXExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1519:3: lv_guard_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOnCauseAccess().getGuardXExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleOnCause3323);
                    lv_guard_3_0=ruleXExpression();

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
                              		"XExpression");
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1543:1: entryRuleWhenCause returns [EObject current=null] : iv_ruleWhenCause= ruleWhenCause EOF ;
    public final EObject entryRuleWhenCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1544:2: (iv_ruleWhenCause= ruleWhenCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1545:2: iv_ruleWhenCause= ruleWhenCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhenCauseRule()); 
            }
            pushFollow(FOLLOW_ruleWhenCause_in_entryRuleWhenCause3361);
            iv_ruleWhenCause=ruleWhenCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhenCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenCause3371); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1552:1: ruleWhenCause returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleXExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleWhenCause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1555:28: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleXExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1556:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleXExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1556:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleXExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1556:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleXExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleWhenCause3408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhenCauseAccess().getWhenKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1560:1: ( (lv_condition_1_0= ruleXExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1561:1: (lv_condition_1_0= ruleXExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1561:1: (lv_condition_1_0= ruleXExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1562:3: lv_condition_1_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhenCauseAccess().getConditionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleWhenCause3429);
            lv_condition_1_0=ruleXExpression();

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
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1578:2: (otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1578:4: otherlv_2= 'if' ( (lv_guard_3_0= ruleXExpression ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleWhenCause3442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getWhenCauseAccess().getIfKeyword_2_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1582:1: ( (lv_guard_3_0= ruleXExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1583:1: (lv_guard_3_0= ruleXExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1583:1: (lv_guard_3_0= ruleXExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1584:3: lv_guard_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhenCauseAccess().getGuardXExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleWhenCause3463);
                    lv_guard_3_0=ruleXExpression();

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
                              		"XExpression");
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1608:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1609:2: (iv_ruleEffect= ruleEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1610:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect3501);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect3511); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1617:1: ruleEffect returns [EObject current=null] : (this_AlwaysEffect_0= ruleAlwaysEffect | this_SetEffect_1= ruleSetEffect | this_TriggerEffect_2= ruleTriggerEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_AlwaysEffect_0 = null;

        EObject this_SetEffect_1 = null;

        EObject this_TriggerEffect_2 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1620:28: ( (this_AlwaysEffect_0= ruleAlwaysEffect | this_SetEffect_1= ruleSetEffect | this_TriggerEffect_2= ruleTriggerEffect ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1621:1: (this_AlwaysEffect_0= ruleAlwaysEffect | this_SetEffect_1= ruleSetEffect | this_TriggerEffect_2= ruleTriggerEffect )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1621:1: (this_AlwaysEffect_0= ruleAlwaysEffect | this_SetEffect_1= ruleSetEffect | this_TriggerEffect_2= ruleTriggerEffect )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt26=1;
                }
                break;
            case 46:
                {
                alt26=2;
                }
                break;
            case 47:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1622:5: this_AlwaysEffect_0= ruleAlwaysEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAlwaysEffectParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEffect_in_ruleEffect3558);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1632:5: this_SetEffect_1= ruleSetEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getSetEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetEffect_in_ruleEffect3585);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1642:5: this_TriggerEffect_2= ruleTriggerEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getTriggerEffectParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTriggerEffect_in_ruleEffect3612);
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1658:1: entryRuleAlwaysEffect returns [EObject current=null] : iv_ruleAlwaysEffect= ruleAlwaysEffect EOF ;
    public final EObject entryRuleAlwaysEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1659:2: (iv_ruleAlwaysEffect= ruleAlwaysEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1660:2: iv_ruleAlwaysEffect= ruleAlwaysEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEffectRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEffect_in_entryRuleAlwaysEffect3647);
            iv_ruleAlwaysEffect=ruleAlwaysEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEffect3657); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1667:1: ruleAlwaysEffect returns [EObject current=null] : (otherlv_0= 'always' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) ) ) ;
    public final EObject ruleAlwaysEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1670:28: ( (otherlv_0= 'always' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1671:1: (otherlv_0= 'always' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1671:1: (otherlv_0= 'always' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1671:3: otherlv_0= 'always' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleAlwaysEffect3694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlwaysEffectAccess().getAlwaysKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1675:1: ( (lv_target_1_0= ruleSignalEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1676:1: (lv_target_1_0= ruleSignalEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1676:1: (lv_target_1_0= ruleSignalEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1677:3: lv_target_1_0= ruleSignalEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlwaysEffectAccess().getTargetSignalEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalEmission_in_ruleAlwaysEffect3715);
            lv_target_1_0=ruleSignalEmission();

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
                      		"SignalEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleAlwaysEffect3727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlwaysEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1697:1: ( (lv_value_3_0= ruleXExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1698:1: (lv_value_3_0= ruleXExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1698:1: (lv_value_3_0= ruleXExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1699:3: lv_value_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlwaysEffectAccess().getValueXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleAlwaysEffect3748);
            lv_value_3_0=ruleXExpression();

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
                      		"XExpression");
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1723:1: entryRuleSetEffect returns [EObject current=null] : iv_ruleSetEffect= ruleSetEffect EOF ;
    public final EObject entryRuleSetEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1724:2: (iv_ruleSetEffect= ruleSetEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1725:2: iv_ruleSetEffect= ruleSetEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetEffectRule()); 
            }
            pushFollow(FOLLOW_ruleSetEffect_in_entryRuleSetEffect3784);
            iv_ruleSetEffect=ruleSetEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetEffect3794); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1732:1: ruleSetEffect returns [EObject current=null] : (otherlv_0= 'set' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) ) ) ;
    public final EObject ruleSetEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1735:28: ( (otherlv_0= 'set' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1736:1: (otherlv_0= 'set' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1736:1: (otherlv_0= 'set' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1736:3: otherlv_0= 'set' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleSetEffect3831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSetEffectAccess().getSetKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1740:1: ( (lv_target_1_0= ruleSignalEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1741:1: (lv_target_1_0= ruleSignalEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1741:1: (lv_target_1_0= ruleSignalEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1742:3: lv_target_1_0= ruleSignalEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetEffectAccess().getTargetSignalEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalEmission_in_ruleSetEffect3852);
            lv_target_1_0=ruleSignalEmission();

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
                      		"SignalEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleSetEffect3864); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSetEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1762:1: ( (lv_value_3_0= ruleXExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1763:1: (lv_value_3_0= ruleXExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1763:1: (lv_value_3_0= ruleXExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1764:3: lv_value_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetEffectAccess().getValueXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleSetEffect3885);
            lv_value_3_0=ruleXExpression();

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
                      		"XExpression");
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1788:1: entryRuleTriggerEffect returns [EObject current=null] : iv_ruleTriggerEffect= ruleTriggerEffect EOF ;
    public final EObject entryRuleTriggerEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1789:2: (iv_ruleTriggerEffect= ruleTriggerEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1790:2: iv_ruleTriggerEffect= ruleTriggerEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerEffectRule()); 
            }
            pushFollow(FOLLOW_ruleTriggerEffect_in_entryRuleTriggerEffect3921);
            iv_ruleTriggerEffect=ruleTriggerEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTriggerEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTriggerEffect3931); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1797:1: ruleTriggerEffect returns [EObject current=null] : (otherlv_0= 'trigger' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) ) ) ;
    public final EObject ruleTriggerEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1800:28: ( (otherlv_0= 'trigger' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1801:1: (otherlv_0= 'trigger' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1801:1: (otherlv_0= 'trigger' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1801:3: otherlv_0= 'trigger' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleXExpression ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleTriggerEffect3968); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTriggerEffectAccess().getTriggerKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1805:1: ( (lv_target_1_0= ruleSignalEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1806:1: (lv_target_1_0= ruleSignalEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1806:1: (lv_target_1_0= ruleSignalEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1807:3: lv_target_1_0= ruleSignalEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTriggerEffectAccess().getTargetSignalEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalEmission_in_ruleTriggerEffect3989);
            lv_target_1_0=ruleSignalEmission();

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
                      		"SignalEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleTriggerEffect4001); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTriggerEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1827:1: ( (lv_value_3_0= ruleXExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1828:1: (lv_value_3_0= ruleXExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1828:1: (lv_value_3_0= ruleXExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1829:3: lv_value_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTriggerEffectAccess().getValueXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleTriggerEffect4022);
            lv_value_3_0=ruleXExpression();

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
                      		"XExpression");
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


    // $ANTLR start "entryRuleXExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1853:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1854:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1855:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression4058);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression4068); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1862:1: ruleXExpression returns [EObject current=null] : this_XOrExpression_0= ruleXOrExpression ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1865:28: (this_XOrExpression_0= ruleXOrExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1867:5: this_XOrExpression_0= ruleXOrExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_ruleXExpression4114);
            this_XOrExpression_0=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOrExpression_0; 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXOrExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1883:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1884:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1885:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression4148);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression4158); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1892:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1895:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1896:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1896:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1897:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression4205);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1905:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==48) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred1_InternalLil()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1905:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1905:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1905:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1910:6: ( () ( (lv_feature_2_0= ruleOpOr ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1910:7: () ( (lv_feature_2_0= ruleOpOr ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1910:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1911:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1916:2: ( (lv_feature_2_0= ruleOpOr ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1917:1: (lv_feature_2_0= ruleOpOr )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1917:1: (lv_feature_2_0= ruleOpOr )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1918:3: lv_feature_2_0= ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureOpOrParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression4254);
            	    lv_feature_2_0=ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpOr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1934:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1935:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1935:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1936:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression4277);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1960:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1961:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1962:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr4316);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr4327); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1969:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'or' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1972:28: (kw= 'or' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1974:2: kw= 'or'
            {
            kw=(Token)match(input,48,FOLLOW_48_in_ruleOpOr4364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getOrKeyword()); 
                  
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1987:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1988:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1989:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression4403);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression4413); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1996:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1999:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2000:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2000:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2001:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4460);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2009:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==49) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred2_InternalLil()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2009:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2009:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2009:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2014:6: ( () ( (lv_feature_2_0= ruleOpAnd ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2014:7: () ( (lv_feature_2_0= ruleOpAnd ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2014:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2015:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2020:2: ( (lv_feature_2_0= ruleOpAnd ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2021:1: (lv_feature_2_0= ruleOpAnd )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2021:1: (lv_feature_2_0= ruleOpAnd )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2022:3: lv_feature_2_0= ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureOpAndParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression4509);
            	    lv_feature_2_0=ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpAnd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2038:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2039:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2039:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2040:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4532);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2064:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2065:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2066:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd4571);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd4582); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2073:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2076:28: (kw= 'and' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2078:2: kw= 'and'
            {
            kw=(Token)match(input,49,FOLLOW_49_in_ruleOpAnd4619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAndKeyword()); 
                  
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2091:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2092:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2093:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression4658);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression4668); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2100:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2103:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2104:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2104:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2105:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4715);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2113:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==50) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred3_InternalLil()) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==51) ) {
                    int LA29_3 = input.LA(2);

                    if ( (synpred3_InternalLil()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2113:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2113:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2113:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2118:6: ( () ( (lv_feature_2_0= ruleOpEquality ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2118:7: () ( (lv_feature_2_0= ruleOpEquality ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2118:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2119:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2124:2: ( (lv_feature_2_0= ruleOpEquality ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2125:1: (lv_feature_2_0= ruleOpEquality )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2125:1: (lv_feature_2_0= ruleOpEquality )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2126:3: lv_feature_2_0= ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureOpEqualityParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression4764);
            	    lv_feature_2_0=ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpEquality");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2142:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2143:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2143:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2144:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4787);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2168:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2169:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2170:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality4826);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality4837); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2177:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2180:28: ( (kw= '==' | kw= '!=' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2181:1: (kw= '==' | kw= '!=' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2181:1: (kw= '==' | kw= '!=' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            else if ( (LA30_0==51) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2182:2: kw= '=='
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOpEquality4875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2189:2: kw= '!='
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleOpEquality4894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2202:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2203:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2204:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4934);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression4944); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2211:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XOtherOperatorExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2214:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2215:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2215:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2216:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4991);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2224:1: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred4_InternalLil()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 53:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred4_InternalLil()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 54:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred4_InternalLil()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 55:
                    {
                    int LA31_5 = input.LA(2);

                    if ( (synpred4_InternalLil()) ) {
                        alt31=1;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2224:2: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2224:2: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2224:3: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2229:6: ( () ( (lv_feature_2_0= ruleOpCompare ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2229:7: () ( (lv_feature_2_0= ruleOpCompare ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2229:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2230:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2235:2: ( (lv_feature_2_0= ruleOpCompare ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2236:1: (lv_feature_2_0= ruleOpCompare )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2236:1: (lv_feature_2_0= ruleOpCompare )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2237:3: lv_feature_2_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureOpCompareParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression5040);
            	    lv_feature_2_0=ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpCompare");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2253:4: ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2254:1: (lv_rightOperand_3_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2254:1: (lv_rightOperand_3_0= ruleXOtherOperatorExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2255:3: lv_rightOperand_3_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression5063);
            	    lv_rightOperand_3_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2279:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2280:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2281:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare5102);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare5113); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2288:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2291:28: ( (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2292:1: (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2292:1: (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt32=1;
                }
                break;
            case 53:
                {
                alt32=2;
                }
                break;
            case 54:
                {
                alt32=3;
                }
                break;
            case 55:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2293:2: kw= '<='
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleOpCompare5151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2300:2: kw= '>='
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleOpCompare5170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2307:2: kw= '<'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleOpCompare5189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2314:2: kw= '>'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleOpCompare5208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2327:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2328:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2329:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression5248);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression5258); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2336:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2339:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2340:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2340:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2341:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5305);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2349:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==56) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred5_InternalLil()) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==57) ) {
                    int LA33_3 = input.LA(2);

                    if ( (synpred5_InternalLil()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2349:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2349:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2349:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2354:6: ( () ( (lv_feature_2_0= ruleOpOther ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2354:7: () ( (lv_feature_2_0= ruleOpOther ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2354:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2355:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2360:2: ( (lv_feature_2_0= ruleOpOther ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:1: (lv_feature_2_0= ruleOpOther )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:1: (lv_feature_2_0= ruleOpOther )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2362:3: lv_feature_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureOpOtherParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression5354);
            	    lv_feature_2_0=ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpOther");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2378:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2379:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2379:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2380:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5377);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2404:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2405:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2406:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther5416);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther5427); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2413:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<>' | kw= '?:' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2416:28: ( (kw= '<>' | kw= '?:' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2417:1: (kw= '<>' | kw= '?:' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2417:1: (kw= '<>' | kw= '?:' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==56) ) {
                alt34=1;
            }
            else if ( (LA34_0==57) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2418:2: kw= '<>'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleOpOther5465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2425:2: kw= '?:'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleOpOther5484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2438:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2439:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2440:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression5524);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression5534); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2447:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2450:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2451:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2451:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2452:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5581);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2460:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==58) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred6_InternalLil()) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==59) ) {
                    int LA35_3 = input.LA(2);

                    if ( (synpred6_InternalLil()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2460:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2460:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2460:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2465:6: ( () ( (lv_feature_2_0= ruleOpAdd ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2465:7: () ( (lv_feature_2_0= ruleOpAdd ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2465:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2466:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2471:2: ( (lv_feature_2_0= ruleOpAdd ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2472:1: (lv_feature_2_0= ruleOpAdd )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2472:1: (lv_feature_2_0= ruleOpAdd )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2473:3: lv_feature_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureOpAddParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression5630);
            	    lv_feature_2_0=ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpAdd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2489:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2490:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2490:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2491:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5653);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2515:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2516:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2517:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd5692);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd5703); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2524:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2527:28: ( (kw= '+' | kw= '-' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2528:1: (kw= '+' | kw= '-' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2528:1: (kw= '+' | kw= '-' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            else if ( (LA36_0==59) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2529:2: kw= '+'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOpAdd5741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2536:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleOpAdd5760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2549:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2550:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2551:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression5800);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression5810); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2558:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2561:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2562:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2562:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2563:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5857);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2571:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case 60:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred7_InternalLil()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 61:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred7_InternalLil()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 62:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred7_InternalLil()) ) {
                        alt37=1;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2571:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2571:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2571:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2576:6: ( () ( (lv_feature_2_0= ruleOpMulti ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2576:7: () ( (lv_feature_2_0= ruleOpMulti ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2576:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2577:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2582:2: ( (lv_feature_2_0= ruleOpMulti ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2583:1: (lv_feature_2_0= ruleOpMulti )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2583:1: (lv_feature_2_0= ruleOpMulti )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2584:3: lv_feature_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureOpMultiParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5906);
            	    lv_feature_2_0=ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpMulti");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2600:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2601:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2601:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2602:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5929);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2626:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2627:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2628:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti5968);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti5979); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2635:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2638:28: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2639:1: (kw= '*' | kw= '/' | kw= '%' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2639:1: (kw= '*' | kw= '/' | kw= '%' )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt38=1;
                }
                break;
            case 61:
                {
                alt38=2;
                }
                break;
            case 62:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2640:2: kw= '*'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleOpMulti6017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2647:2: kw= '/'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleOpMulti6036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2654:2: kw= '%'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleOpMulti6055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_2()); 
                          
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2667:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2668:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2669:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation6095);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation6105); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2676:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleXPrimaryExpression ) ) ) | this_XPrimaryExpression_3= ruleXPrimaryExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_feature_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_XPrimaryExpression_3 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2679:28: ( ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleXPrimaryExpression ) ) ) | this_XPrimaryExpression_3= ruleXPrimaryExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2680:1: ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleXPrimaryExpression ) ) ) | this_XPrimaryExpression_3= ruleXPrimaryExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2680:1: ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleXPrimaryExpression ) ) ) | this_XPrimaryExpression_3= ruleXPrimaryExpression )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=58 && LA39_0<=59)||LA39_0==63) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_INT)||LA39_0==28||LA39_0==30||LA39_0==42||(LA39_0>=64 && LA39_0<=65)||LA39_0==68||LA39_0==71||(LA39_0>=73 && LA39_0<=111)) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2680:2: ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleXPrimaryExpression ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2680:2: ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleXPrimaryExpression ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2680:3: () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleXPrimaryExpression ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2680:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2681:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2686:2: ( (lv_feature_1_0= ruleOpUnary ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2687:1: (lv_feature_1_0= ruleOpUnary )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2687:1: (lv_feature_1_0= ruleOpUnary )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2688:3: lv_feature_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureOpUnaryParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation6161);
                    lv_feature_1_0=ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"feature",
                              		lv_feature_1_0, 
                              		"OpUnary");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2704:2: ( (lv_operand_2_0= ruleXPrimaryExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2705:1: (lv_operand_2_0= ruleXPrimaryExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2705:1: (lv_operand_2_0= ruleXPrimaryExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2706:3: lv_operand_2_0= ruleXPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXPrimaryExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXUnaryOperation6182);
                    lv_operand_2_0=ruleXPrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XPrimaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2724:5: this_XPrimaryExpression_3= ruleXPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXPrimaryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXUnaryOperation6211);
                    this_XPrimaryExpression_3=ruleXPrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XPrimaryExpression_3; 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2740:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2741:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2742:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary6247);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary6258); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2749:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2753:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2753:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt40=1;
                }
                break;
            case 59:
                {
                alt40=2;
                }
                break;
            case 58:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2754:2: kw= '!'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleOpUnary6296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2761:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleOpUnary6315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2768:2: kw= '+'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOpUnary6334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2781:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2782:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2783:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6374);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression6384); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2790:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XSwitchExpression_0= ruleXSwitchExpression | this_XIfExpression_1= ruleXIfExpression | this_XLiteral_2= ruleXLiteral | this_XForEachExpression_3= ruleXForEachExpression | this_XFunctionCallExpression_4= ruleXFunctionCallExpression | this_XParenthesizedExpression_5= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XSwitchExpression_0 = null;

        EObject this_XIfExpression_1 = null;

        EObject this_XLiteral_2 = null;

        EObject this_XForEachExpression_3 = null;

        EObject this_XFunctionCallExpression_4 = null;

        EObject this_XParenthesizedExpression_5 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2793:28: ( (this_XSwitchExpression_0= ruleXSwitchExpression | this_XIfExpression_1= ruleXIfExpression | this_XLiteral_2= ruleXLiteral | this_XForEachExpression_3= ruleXForEachExpression | this_XFunctionCallExpression_4= ruleXFunctionCallExpression | this_XParenthesizedExpression_5= ruleXParenthesizedExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2794:1: (this_XSwitchExpression_0= ruleXSwitchExpression | this_XIfExpression_1= ruleXIfExpression | this_XLiteral_2= ruleXLiteral | this_XForEachExpression_3= ruleXForEachExpression | this_XFunctionCallExpression_4= ruleXFunctionCallExpression | this_XParenthesizedExpression_5= ruleXParenthesizedExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2794:1: (this_XSwitchExpression_0= ruleXSwitchExpression | this_XIfExpression_1= ruleXIfExpression | this_XLiteral_2= ruleXLiteral | this_XForEachExpression_3= ruleXForEachExpression | this_XFunctionCallExpression_4= ruleXFunctionCallExpression | this_XParenthesizedExpression_5= ruleXParenthesizedExpression )
            int alt41=6;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt41=1;
                }
                break;
            case 42:
                {
                alt41=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 28:
            case 30:
            case 64:
            case 109:
            case 110:
            case 111:
                {
                alt41=3;
                }
                break;
            case 71:
                {
                alt41=4;
                }
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                {
                alt41=5;
                }
                break;
            case 65:
                {
                alt41=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2795:5: this_XSwitchExpression_0= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6431);
                    this_XSwitchExpression_0=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2805:5: this_XIfExpression_1= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6458);
                    this_XIfExpression_1=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2815:5: this_XLiteral_2= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6485);
                    this_XLiteral_2=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2825:5: this_XForEachExpression_3= ruleXForEachExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForEachExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForEachExpression_in_ruleXPrimaryExpression6512);
                    this_XForEachExpression_3=ruleXForEachExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForEachExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2835:5: this_XFunctionCallExpression_4= ruleXFunctionCallExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFunctionCallExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionCallExpression_in_ruleXPrimaryExpression6539);
                    this_XFunctionCallExpression_4=ruleXFunctionCallExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionCallExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2845:5: this_XParenthesizedExpression_5= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6566);
                    this_XParenthesizedExpression_5=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_5; 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2861:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2862:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2863:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral6601);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral6611); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2870:1: ruleXLiteral returns [EObject current=null] : (this_XCollectionLiteral_0= ruleXCollectionLiteral | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | ( () otherlv_6= '#' ( (otherlv_7= RULE_ID ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_XCollectionLiteral_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2873:28: ( (this_XCollectionLiteral_0= ruleXCollectionLiteral | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | ( () otherlv_6= '#' ( (otherlv_7= RULE_ID ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2874:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | ( () otherlv_6= '#' ( (otherlv_7= RULE_ID ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2874:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | ( () otherlv_6= '#' ( (otherlv_7= RULE_ID ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) )
            int alt42=7;
            switch ( input.LA(1) ) {
            case 28:
            case 30:
                {
                alt42=1;
                }
                break;
            case 109:
            case 110:
                {
                alt42=2;
                }
                break;
            case RULE_INT:
                {
                alt42=3;
                }
                break;
            case 111:
                {
                alt42=4;
                }
                break;
            case RULE_STRING:
                {
                alt42=5;
                }
                break;
            case 64:
                {
                alt42=6;
                }
                break;
            case RULE_ID:
                {
                alt42=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2875:5: this_XCollectionLiteral_0= ruleXCollectionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXCollectionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral6658);
                    this_XCollectionLiteral_0=ruleXCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCollectionLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2885:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6685);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2895:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral6712);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2905:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6739);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2915:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6766);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2924:6: ( () otherlv_6= '#' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2924:6: ( () otherlv_6= '#' ( (otherlv_7= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2924:7: () otherlv_6= '#' ( (otherlv_7= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2924:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2925:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXLiteralAccess().getXEnumLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,64,FOLLOW_64_in_ruleXLiteral6793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXLiteralAccess().getNumberSignKeyword_5_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2934:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2935:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2935:1: (otherlv_7= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2936:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXLiteralRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXLiteral6813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getXLiteralAccess().getElementXEnumElementCrossReference_5_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2948:6: ( () ( (otherlv_9= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2948:6: ( () ( (otherlv_9= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2948:7: () ( (otherlv_9= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2948:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2949:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXLiteralAccess().getXSignalLiteralAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2954:2: ( (otherlv_9= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2955:1: (otherlv_9= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2955:1: (otherlv_9= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2956:3: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXLiteralRule());
                      	        }
                              
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXLiteral6850); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_9, grammarAccess.getXLiteralAccess().getSignalSignalCrossReference_6_1_0()); 
                      	
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXCollectionLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2975:1: entryRuleXCollectionLiteral returns [EObject current=null] : iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF ;
    public final EObject entryRuleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCollectionLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2976:2: (iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2977:2: iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCollectionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXCollectionLiteral_in_entryRuleXCollectionLiteral6887);
            iv_ruleXCollectionLiteral=ruleXCollectionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCollectionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCollectionLiteral6897); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCollectionLiteral"


    // $ANTLR start "ruleXCollectionLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2984:1: ruleXCollectionLiteral returns [EObject current=null] : (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) ;
    public final EObject ruleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XSetLiteral_0 = null;

        EObject this_XListLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2987:28: ( (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2988:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2988:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==28) ) {
                alt43=1;
            }
            else if ( (LA43_0==30) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2989:5: this_XSetLiteral_0= ruleXSetLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXSetLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral6944);
                    this_XSetLiteral_0=ruleXSetLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSetLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2999:5: this_XListLiteral_1= ruleXListLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXListLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral6971);
                    this_XListLiteral_1=ruleXListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XListLiteral_1; 
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
    // $ANTLR end "ruleXCollectionLiteral"


    // $ANTLR start "entryRuleXSetLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3015:1: entryRuleXSetLiteral returns [EObject current=null] : iv_ruleXSetLiteral= ruleXSetLiteral EOF ;
    public final EObject entryRuleXSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSetLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3016:2: (iv_ruleXSetLiteral= ruleXSetLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3017:2: iv_ruleXSetLiteral= ruleXSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSetLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXSetLiteral_in_entryRuleXSetLiteral7006);
            iv_ruleXSetLiteral=ruleXSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSetLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSetLiteral7016); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSetLiteral"


    // $ANTLR start "ruleXSetLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3024:1: ruleXSetLiteral returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleXSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3027:28: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )* )? otherlv_5= '}' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3028:1: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )* )? otherlv_5= '}' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3028:1: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )* )? otherlv_5= '}' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3028:2: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )* )? otherlv_5= '}'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3028:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3029:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSetLiteralAccess().getXSetLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleXSetLiteral7062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSetLiteralAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3038:1: ( ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_INT)||LA45_0==28||LA45_0==30||LA45_0==42||(LA45_0>=58 && LA45_0<=59)||(LA45_0>=63 && LA45_0<=65)||LA45_0==68||LA45_0==71||(LA45_0>=73 && LA45_0<=111)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3038:2: ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3038:2: ( (lv_elements_2_0= ruleXExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3039:1: (lv_elements_2_0= ruleXExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3039:1: (lv_elements_2_0= ruleXExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3040:3: lv_elements_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral7084);
                    lv_elements_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSetLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3056:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==23) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3056:4: otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleXSetLiteral7097); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXSetLiteralAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3060:1: ( (lv_elements_4_0= ruleXExpression ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3061:1: (lv_elements_4_0= ruleXExpression )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3061:1: (lv_elements_4_0= ruleXExpression )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3062:3: lv_elements_4_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral7118);
                    	    lv_elements_4_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXSetLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_4_0, 
                    	              		"XExpression");
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
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleXSetLiteral7134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSetLiteralAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleXSetLiteral"


    // $ANTLR start "entryRuleXListLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3090:1: entryRuleXListLiteral returns [EObject current=null] : iv_ruleXListLiteral= ruleXListLiteral EOF ;
    public final EObject entryRuleXListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXListLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3091:2: (iv_ruleXListLiteral= ruleXListLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3092:2: iv_ruleXListLiteral= ruleXListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXListLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXListLiteral_in_entryRuleXListLiteral7170);
            iv_ruleXListLiteral=ruleXListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXListLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXListLiteral7180); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXListLiteral"


    // $ANTLR start "ruleXListLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3099:1: ruleXListLiteral returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleXListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3102:28: ( ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )* )? otherlv_5= ']' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3103:1: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )* )? otherlv_5= ']' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3103:1: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )* )? otherlv_5= ']' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3103:2: () otherlv_1= '[' ( ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )* )? otherlv_5= ']'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3103:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3104:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXListLiteralAccess().getXListLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleXListLiteral7226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXListLiteralAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3113:1: ( ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_INT)||LA47_0==28||LA47_0==30||LA47_0==42||(LA47_0>=58 && LA47_0<=59)||(LA47_0>=63 && LA47_0<=65)||LA47_0==68||LA47_0==71||(LA47_0>=73 && LA47_0<=111)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3113:2: ( (lv_elements_2_0= ruleXExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3113:2: ( (lv_elements_2_0= ruleXExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3114:1: (lv_elements_2_0= ruleXExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3114:1: (lv_elements_2_0= ruleXExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3115:3: lv_elements_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral7248);
                    lv_elements_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXListLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3131:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==23) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3131:4: otherlv_3= ',' ( (lv_elements_4_0= ruleXExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleXListLiteral7261); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXListLiteralAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3135:1: ( (lv_elements_4_0= ruleXExpression ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3136:1: (lv_elements_4_0= ruleXExpression )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3136:1: (lv_elements_4_0= ruleXExpression )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3137:3: lv_elements_4_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral7282);
                    	    lv_elements_4_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXListLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_4_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleXListLiteral7298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXListLiteralAccess().getRightSquareBracketKeyword_3());
                  
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
    // $ANTLR end "ruleXListLiteral"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3165:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3166:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3167:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7334);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression7344); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3174:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3177:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3178:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3178:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3178:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleXParenthesizedExpression7381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7403);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleXParenthesizedExpression7414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3203:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3204:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3205:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7450);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression7460); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3212:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) ) ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3215:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3216:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3216:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3216:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3216:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3217:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXIfExpression7506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleXIfExpression7518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3230:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3231:1: (lv_if_3_0= ruleXExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3231:1: (lv_if_3_0= ruleXExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3232:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7539);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3248:2: ( ( ')' )=>otherlv_4= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3248:3: ( ')' )=>otherlv_4= ')'
            {
            otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleXIfExpression7559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3253:2: ( (lv_then_5_0= ruleXExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3254:1: (lv_then_5_0= ruleXExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3254:1: (lv_then_5_0= ruleXExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3255:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7581);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3271:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3271:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3271:3: ( ( 'else' )=>otherlv_6= 'else' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3271:4: ( 'else' )=>otherlv_6= 'else'
            {
            otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleXIfExpression7602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3276:2: ( (lv_else_7_0= ruleXExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3277:1: (lv_else_7_0= ruleXExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3277:1: (lv_else_7_0= ruleXExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3278:3: lv_else_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7624);
            lv_else_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"else",
                      		lv_else_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3302:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3303:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3304:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7661);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7671); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3311:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleXExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleXCasePart ) )=> (lv_cases_5_0= ruleXCasePart ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_switch_3_0 = null;

        EObject lv_cases_5_0 = null;

        EObject lv_default_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3314:28: ( ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleXExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleXCasePart ) )=> (lv_cases_5_0= ruleXCasePart ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleXExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3315:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleXExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleXCasePart ) )=> (lv_cases_5_0= ruleXCasePart ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleXExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3315:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleXExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleXCasePart ) )=> (lv_cases_5_0= ruleXCasePart ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleXExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3315:2: () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleXExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleXCasePart ) )=> (lv_cases_5_0= ruleXCasePart ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleXExpression ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3315:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3316:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXSwitchExpression7717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleXSwitchExpression7729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3329:1: ( (lv_switch_3_0= ruleXExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3330:1: (lv_switch_3_0= ruleXExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3330:1: (lv_switch_3_0= ruleXExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3331:3: lv_switch_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7750);
            lv_switch_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3347:2: ( ( ')' )=>otherlv_4= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3347:3: ( ')' )=>otherlv_4= ')'
            {
            otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleXSwitchExpression7770); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_4());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3352:2: ( ( ( ruleXCasePart ) )=> (lv_cases_5_0= ruleXCasePart ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==70) ) {
                    int LA48_2 = input.LA(2);

                    if ( (synpred11_InternalLil()) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3352:3: ( ( ruleXCasePart ) )=> (lv_cases_5_0= ruleXCasePart )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3357:1: (lv_cases_5_0= ruleXCasePart )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3358:3: lv_cases_5_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7802);
            	    lv_cases_5_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_5_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3374:3: ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==69) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred12_InternalLil()) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3374:4: ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleXExpression ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3374:4: ( ( 'default' )=>otherlv_6= 'default' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3374:5: ( 'default' )=>otherlv_6= 'default'
                    {
                    otherlv_6=(Token)match(input,69,FOLLOW_69_in_ruleXSwitchExpression7824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }

                    }

                    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleXSwitchExpression7837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3383:1: ( (lv_default_8_0= ruleXExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3384:1: (lv_default_8_0= ruleXExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3384:1: (lv_default_8_0= ruleXExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3385:3: lv_default_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7858);
                    lv_default_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_8_0, 
                              		"XExpression");
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3409:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3410:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3411:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7896);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7906); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3418:1: ruleXCasePart returns [EObject current=null] : (otherlv_0= 'case' ( (lv_case_1_0= ruleXExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_case_1_0 = null;

        EObject lv_then_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3421:28: ( (otherlv_0= 'case' ( (lv_case_1_0= ruleXExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleXExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3422:1: (otherlv_0= 'case' ( (lv_case_1_0= ruleXExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleXExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3422:1: (otherlv_0= 'case' ( (lv_case_1_0= ruleXExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleXExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3422:3: otherlv_0= 'case' ( (lv_case_1_0= ruleXExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleXExpression ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleXCasePart7943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCasePartAccess().getCaseKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3426:1: ( (lv_case_1_0= ruleXExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3427:1: (lv_case_1_0= ruleXExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3427:1: (lv_case_1_0= ruleXExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3428:3: lv_case_1_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7964);
            lv_case_1_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"case",
                      		lv_case_1_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleXCasePart7976); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3448:1: ( (lv_then_3_0= ruleXExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3449:1: (lv_then_3_0= ruleXExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3449:1: (lv_then_3_0= ruleXExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3450:3: lv_then_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7997);
            lv_then_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_3_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForEachExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3474:1: entryRuleXForEachExpression returns [EObject current=null] : iv_ruleXForEachExpression= ruleXForEachExpression EOF ;
    public final EObject entryRuleXForEachExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForEachExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3475:2: (iv_ruleXForEachExpression= ruleXForEachExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3476:2: iv_ruleXForEachExpression= ruleXForEachExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForEachExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForEachExpression_in_entryRuleXForEachExpression8033);
            iv_ruleXForEachExpression=ruleXForEachExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForEachExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForEachExpression8043); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForEachExpression"


    // $ANTLR start "ruleXForEachExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3483:1: ruleXForEachExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleXExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForEachExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_forExpression_4_0 = null;

        EObject lv_eachExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3486:28: ( ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleXExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleXExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3487:1: ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleXExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleXExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3487:1: ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleXExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleXExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3487:2: () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleXExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleXExpression ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3487:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3488:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForEachExpressionAccess().getXForEachExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXForEachExpression8089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForEachExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,72,FOLLOW_72_in_ruleXForEachExpression8101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForEachExpressionAccess().getEachKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleXForEachExpression8113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXForEachExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3505:1: ( (lv_forExpression_4_0= ruleXExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3506:1: (lv_forExpression_4_0= ruleXExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3506:1: (lv_forExpression_4_0= ruleXExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3507:3: lv_forExpression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForEachExpressionAccess().getForExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForEachExpression8134);
            lv_forExpression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForEachExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,66,FOLLOW_66_in_ruleXForEachExpression8146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXForEachExpressionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3527:1: ( (lv_eachExpression_6_0= ruleXExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3528:1: (lv_eachExpression_6_0= ruleXExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3528:1: (lv_eachExpression_6_0= ruleXExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3529:3: lv_eachExpression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForEachExpressionAccess().getEachExpressionXExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForEachExpression8167);
            lv_eachExpression_6_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForEachExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_6_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXForEachExpression"


    // $ANTLR start "entryRuleXFunctionCallExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3553:1: entryRuleXFunctionCallExpression returns [EObject current=null] : iv_ruleXFunctionCallExpression= ruleXFunctionCallExpression EOF ;
    public final EObject entryRuleXFunctionCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionCallExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3554:2: (iv_ruleXFunctionCallExpression= ruleXFunctionCallExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3555:2: iv_ruleXFunctionCallExpression= ruleXFunctionCallExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionCallExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionCallExpression_in_entryRuleXFunctionCallExpression8203);
            iv_ruleXFunctionCallExpression=ruleXFunctionCallExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionCallExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionCallExpression8213); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionCallExpression"


    // $ANTLR start "ruleXFunctionCallExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3562:1: ruleXFunctionCallExpression returns [EObject current=null] : ( () ( (lv_function_1_0= ruleBuiltInFunction ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleXExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleXExpression ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleXFunctionCallExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_function_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3565:28: ( ( () ( (lv_function_1_0= ruleBuiltInFunction ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleXExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleXExpression ) ) )* otherlv_6= ')' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3566:1: ( () ( (lv_function_1_0= ruleBuiltInFunction ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleXExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleXExpression ) ) )* otherlv_6= ')' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3566:1: ( () ( (lv_function_1_0= ruleBuiltInFunction ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleXExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleXExpression ) ) )* otherlv_6= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3566:2: () ( (lv_function_1_0= ruleBuiltInFunction ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleXExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleXExpression ) ) )* otherlv_6= ')'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3566:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3567:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFunctionCallExpressionAccess().getXFunctionCallExpressionAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3572:2: ( (lv_function_1_0= ruleBuiltInFunction ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3573:1: (lv_function_1_0= ruleBuiltInFunction )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3573:1: (lv_function_1_0= ruleBuiltInFunction )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3574:3: lv_function_1_0= ruleBuiltInFunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionCallExpressionAccess().getFunctionBuiltInFunctionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBuiltInFunction_in_ruleXFunctionCallExpression8268);
            lv_function_1_0=ruleBuiltInFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionCallExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"function",
                      		lv_function_1_0, 
                      		"BuiltInFunction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleXFunctionCallExpression8280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXFunctionCallExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3594:1: ( (lv_arguments_3_0= ruleXExpression ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_INT)||LA50_0==28||LA50_0==30||LA50_0==42||(LA50_0>=58 && LA50_0<=59)||(LA50_0>=63 && LA50_0<=65)||LA50_0==68||LA50_0==71||(LA50_0>=73 && LA50_0<=111)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3595:1: (lv_arguments_3_0= ruleXExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3595:1: (lv_arguments_3_0= ruleXExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3596:3: lv_arguments_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionCallExpressionAccess().getArgumentsXExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXFunctionCallExpression8301);
                    lv_arguments_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionCallExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_3_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3612:3: (otherlv_4= ',' ( (lv_arguments_5_0= ruleXExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==23) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3612:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleXExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXFunctionCallExpression8315); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getXFunctionCallExpressionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3616:1: ( (lv_arguments_5_0= ruleXExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3617:1: (lv_arguments_5_0= ruleXExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3617:1: (lv_arguments_5_0= ruleXExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3618:3: lv_arguments_5_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXFunctionCallExpressionAccess().getArgumentsXExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFunctionCallExpression8336);
            	    lv_arguments_5_0=ruleXExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXFunctionCallExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arguments",
            	              		lv_arguments_5_0, 
            	              		"XExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_6=(Token)match(input,66,FOLLOW_66_in_ruleXFunctionCallExpression8350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXFunctionCallExpressionAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleXFunctionCallExpression"


    // $ANTLR start "entryRuleBuiltInFunction"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3646:1: entryRuleBuiltInFunction returns [String current=null] : iv_ruleBuiltInFunction= ruleBuiltInFunction EOF ;
    public final String entryRuleBuiltInFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBuiltInFunction = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3647:2: (iv_ruleBuiltInFunction= ruleBuiltInFunction EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3648:2: iv_ruleBuiltInFunction= ruleBuiltInFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltInFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltInFunction_in_entryRuleBuiltInFunction8387);
            iv_ruleBuiltInFunction=ruleBuiltInFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltInFunction.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInFunction8398); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBuiltInFunction"


    // $ANTLR start "ruleBuiltInFunction"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3655:1: ruleBuiltInFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Math.abs' | kw= 'Math.acos' | kw= 'Math.acosh' | kw= 'Math.asin' | kw= 'Math.asinh' | kw= 'Math.atan' | kw= 'Math.atanh' | kw= 'Math.atan2' | kw= 'Math.ceil' | kw= 'Math.clip' | kw= 'Math.cos' | kw= 'Math.cosh' | kw= 'Math.exp' | kw= 'Math.floor' | kw= 'Math.fround' | kw= 'Math.hypot' | kw= 'Math.log' | kw= 'Math.log10' | kw= 'Math.log2' | kw= 'Math.max' | kw= 'Math.min' | kw= 'Math.pow' | kw= 'Math.random' | kw= 'Math.round' | kw= 'Math.sign' | kw= 'Math.sin' | kw= 'Math.sinh' | kw= 'Math.sqrt' | kw= 'Math.tan' | kw= 'Math.tanh' | kw= 'Math.trunc' | kw= 'Set.orderby' | kw= 'Set.add' | kw= 'Set.find' | kw= 'Set.change' | kw= 'Set.remove' ) ;
    public final AntlrDatatypeRuleToken ruleBuiltInFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3658:28: ( (kw= 'Math.abs' | kw= 'Math.acos' | kw= 'Math.acosh' | kw= 'Math.asin' | kw= 'Math.asinh' | kw= 'Math.atan' | kw= 'Math.atanh' | kw= 'Math.atan2' | kw= 'Math.ceil' | kw= 'Math.clip' | kw= 'Math.cos' | kw= 'Math.cosh' | kw= 'Math.exp' | kw= 'Math.floor' | kw= 'Math.fround' | kw= 'Math.hypot' | kw= 'Math.log' | kw= 'Math.log10' | kw= 'Math.log2' | kw= 'Math.max' | kw= 'Math.min' | kw= 'Math.pow' | kw= 'Math.random' | kw= 'Math.round' | kw= 'Math.sign' | kw= 'Math.sin' | kw= 'Math.sinh' | kw= 'Math.sqrt' | kw= 'Math.tan' | kw= 'Math.tanh' | kw= 'Math.trunc' | kw= 'Set.orderby' | kw= 'Set.add' | kw= 'Set.find' | kw= 'Set.change' | kw= 'Set.remove' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3659:1: (kw= 'Math.abs' | kw= 'Math.acos' | kw= 'Math.acosh' | kw= 'Math.asin' | kw= 'Math.asinh' | kw= 'Math.atan' | kw= 'Math.atanh' | kw= 'Math.atan2' | kw= 'Math.ceil' | kw= 'Math.clip' | kw= 'Math.cos' | kw= 'Math.cosh' | kw= 'Math.exp' | kw= 'Math.floor' | kw= 'Math.fround' | kw= 'Math.hypot' | kw= 'Math.log' | kw= 'Math.log10' | kw= 'Math.log2' | kw= 'Math.max' | kw= 'Math.min' | kw= 'Math.pow' | kw= 'Math.random' | kw= 'Math.round' | kw= 'Math.sign' | kw= 'Math.sin' | kw= 'Math.sinh' | kw= 'Math.sqrt' | kw= 'Math.tan' | kw= 'Math.tanh' | kw= 'Math.trunc' | kw= 'Set.orderby' | kw= 'Set.add' | kw= 'Set.find' | kw= 'Set.change' | kw= 'Set.remove' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3659:1: (kw= 'Math.abs' | kw= 'Math.acos' | kw= 'Math.acosh' | kw= 'Math.asin' | kw= 'Math.asinh' | kw= 'Math.atan' | kw= 'Math.atanh' | kw= 'Math.atan2' | kw= 'Math.ceil' | kw= 'Math.clip' | kw= 'Math.cos' | kw= 'Math.cosh' | kw= 'Math.exp' | kw= 'Math.floor' | kw= 'Math.fround' | kw= 'Math.hypot' | kw= 'Math.log' | kw= 'Math.log10' | kw= 'Math.log2' | kw= 'Math.max' | kw= 'Math.min' | kw= 'Math.pow' | kw= 'Math.random' | kw= 'Math.round' | kw= 'Math.sign' | kw= 'Math.sin' | kw= 'Math.sinh' | kw= 'Math.sqrt' | kw= 'Math.tan' | kw= 'Math.tanh' | kw= 'Math.trunc' | kw= 'Set.orderby' | kw= 'Set.add' | kw= 'Set.find' | kw= 'Set.change' | kw= 'Set.remove' )
            int alt52=36;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt52=1;
                }
                break;
            case 74:
                {
                alt52=2;
                }
                break;
            case 75:
                {
                alt52=3;
                }
                break;
            case 76:
                {
                alt52=4;
                }
                break;
            case 77:
                {
                alt52=5;
                }
                break;
            case 78:
                {
                alt52=6;
                }
                break;
            case 79:
                {
                alt52=7;
                }
                break;
            case 80:
                {
                alt52=8;
                }
                break;
            case 81:
                {
                alt52=9;
                }
                break;
            case 82:
                {
                alt52=10;
                }
                break;
            case 83:
                {
                alt52=11;
                }
                break;
            case 84:
                {
                alt52=12;
                }
                break;
            case 85:
                {
                alt52=13;
                }
                break;
            case 86:
                {
                alt52=14;
                }
                break;
            case 87:
                {
                alt52=15;
                }
                break;
            case 88:
                {
                alt52=16;
                }
                break;
            case 89:
                {
                alt52=17;
                }
                break;
            case 90:
                {
                alt52=18;
                }
                break;
            case 91:
                {
                alt52=19;
                }
                break;
            case 92:
                {
                alt52=20;
                }
                break;
            case 93:
                {
                alt52=21;
                }
                break;
            case 94:
                {
                alt52=22;
                }
                break;
            case 95:
                {
                alt52=23;
                }
                break;
            case 96:
                {
                alt52=24;
                }
                break;
            case 97:
                {
                alt52=25;
                }
                break;
            case 98:
                {
                alt52=26;
                }
                break;
            case 99:
                {
                alt52=27;
                }
                break;
            case 100:
                {
                alt52=28;
                }
                break;
            case 101:
                {
                alt52=29;
                }
                break;
            case 102:
                {
                alt52=30;
                }
                break;
            case 103:
                {
                alt52=31;
                }
                break;
            case 104:
                {
                alt52=32;
                }
                break;
            case 105:
                {
                alt52=33;
                }
                break;
            case 106:
                {
                alt52=34;
                }
                break;
            case 107:
                {
                alt52=35;
                }
                break;
            case 108:
                {
                alt52=36;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3660:2: kw= 'Math.abs'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleBuiltInFunction8436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAbsKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3667:2: kw= 'Math.acos'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleBuiltInFunction8455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAcosKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3674:2: kw= 'Math.acosh'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleBuiltInFunction8474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAcoshKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3681:2: kw= 'Math.asin'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleBuiltInFunction8493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAsinKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3688:2: kw= 'Math.asinh'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleBuiltInFunction8512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAsinhKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3695:2: kw= 'Math.atan'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleBuiltInFunction8531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAtanKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3702:2: kw= 'Math.atanh'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleBuiltInFunction8550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAtanhKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3709:2: kw= 'Math.atan2'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleBuiltInFunction8569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAtan2Keyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3716:2: kw= 'Math.ceil'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleBuiltInFunction8588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathCeilKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3723:2: kw= 'Math.clip'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleBuiltInFunction8607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathClipKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3730:2: kw= 'Math.cos'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleBuiltInFunction8626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathCosKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3737:2: kw= 'Math.cosh'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleBuiltInFunction8645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathCoshKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3744:2: kw= 'Math.exp'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleBuiltInFunction8664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathExpKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3751:2: kw= 'Math.floor'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleBuiltInFunction8683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathFloorKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3758:2: kw= 'Math.fround'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleBuiltInFunction8702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathFroundKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3765:2: kw= 'Math.hypot'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleBuiltInFunction8721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathHypotKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3772:2: kw= 'Math.log'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleBuiltInFunction8740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathLogKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3779:2: kw= 'Math.log10'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleBuiltInFunction8759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathLog10Keyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3786:2: kw= 'Math.log2'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleBuiltInFunction8778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathLog2Keyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3793:2: kw= 'Math.max'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleBuiltInFunction8797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathMaxKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3800:2: kw= 'Math.min'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleBuiltInFunction8816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathMinKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3807:2: kw= 'Math.pow'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleBuiltInFunction8835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathPowKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3814:2: kw= 'Math.random'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleBuiltInFunction8854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathRandomKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3821:2: kw= 'Math.round'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleBuiltInFunction8873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathRoundKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3828:2: kw= 'Math.sign'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleBuiltInFunction8892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathSignKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3835:2: kw= 'Math.sin'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleBuiltInFunction8911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathSinKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3842:2: kw= 'Math.sinh'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleBuiltInFunction8930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathSinhKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3849:2: kw= 'Math.sqrt'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleBuiltInFunction8949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathSqrtKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3856:2: kw= 'Math.tan'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleBuiltInFunction8968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathTanKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3863:2: kw= 'Math.tanh'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleBuiltInFunction8987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathTanhKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3870:2: kw= 'Math.trunc'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleBuiltInFunction9006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathTruncKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3877:2: kw= 'Set.orderby'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleBuiltInFunction9025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getSetOrderbyKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3884:2: kw= 'Set.add'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleBuiltInFunction9044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getSetAddKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3891:2: kw= 'Set.find'
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleBuiltInFunction9063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getSetFindKeyword_33()); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3898:2: kw= 'Set.change'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleBuiltInFunction9082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getSetChangeKeyword_34()); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3905:2: kw= 'Set.remove'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleBuiltInFunction9101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getSetRemoveKeyword_35()); 
                          
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
    // $ANTLR end "ruleBuiltInFunction"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3918:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3919:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3920:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9141);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9151); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3927:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3930:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3931:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3931:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3931:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3931:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3932:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3937:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==109) ) {
                alt53=1;
            }
            else if ( (LA53_0==110) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3937:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,109,FOLLOW_109_in_ruleXBooleanLiteral9198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3942:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3942:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3943:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3943:1: (lv_isTrue_2_0= 'true' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3944:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,110,FOLLOW_110_in_ruleXBooleanLiteral9222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3965:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3966:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3967:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9272);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9282); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3974:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3977:28: ( ( () otherlv_1= 'null' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3978:1: ( () otherlv_1= 'null' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3978:1: ( () otherlv_1= 'null' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3978:2: () otherlv_1= 'null'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3978:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3979:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,111,FOLLOW_111_in_ruleXNullLiteral9328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3996:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3997:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3998:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9364);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9374); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4005:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNUMBER ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4008:28: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4009:1: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4009:1: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4009:2: () ( (lv_value_1_0= ruleNUMBER ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4009:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4010:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4015:2: ( (lv_value_1_0= ruleNUMBER ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4016:1: (lv_value_1_0= ruleNUMBER )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4016:1: (lv_value_1_0= ruleNUMBER )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4017:3: lv_value_1_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNUMBERParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNUMBER_in_ruleXNumberLiteral9429);
            lv_value_1_0=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"NUMBER");
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
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4041:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4042:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4043:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9465);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9475); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4050:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4053:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4054:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4054:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4054:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4054:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4055:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4060:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4061:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4061:1: (lv_value_1_0= RULE_STRING )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4062:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXEnumElement"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4086:1: entryRuleXEnumElement returns [EObject current=null] : iv_ruleXEnumElement= ruleXEnumElement EOF ;
    public final EObject entryRuleXEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEnumElement = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4087:2: (iv_ruleXEnumElement= ruleXEnumElement EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4088:2: iv_ruleXEnumElement= ruleXEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleXEnumElement_in_entryRuleXEnumElement9567);
            iv_ruleXEnumElement=ruleXEnumElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEnumElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEnumElement9577); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEnumElement"


    // $ANTLR start "ruleXEnumElement"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4095:1: ruleXEnumElement returns [EObject current=null] : ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleXEnumElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4098:28: ( ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4099:1: ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4099:1: ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4099:2: () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4099:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4100:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXEnumElementAccess().getXEnumLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXEnumElement9623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXEnumElementAccess().getNumberSignKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4109:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4110:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4110:1: (lv_name_2_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4111:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXEnumElement9640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getXEnumElementAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXEnumElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
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
    // $ANTLR end "ruleXEnumElement"


    // $ANTLR start "entryRuleNUMBER"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4135:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4136:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4137:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER9682);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER9693); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4144:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4147:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4148:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4148:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4148:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER9733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4155:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==112) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4156:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,112,FOLLOW_112_in_ruleNUMBER9752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER9767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
                          
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
    // $ANTLR end "ruleNUMBER"

    // $ANTLR start synpred1_InternalLil
    public final void synpred1_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1905:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1905:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1905:4: ( () ( ( ruleOpOr ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1905:5: () ( ( ruleOpOr ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1905:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1906:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1906:2: ( ( ruleOpOr ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1907:1: ( ruleOpOr )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1907:1: ( ruleOpOr )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1908:1: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred1_InternalLil4224);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalLil

    // $ANTLR start synpred2_InternalLil
    public final void synpred2_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2009:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2009:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2009:4: ( () ( ( ruleOpAnd ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2009:5: () ( ( ruleOpAnd ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2009:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2010:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2010:2: ( ( ruleOpAnd ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2011:1: ( ruleOpAnd )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2011:1: ( ruleOpAnd )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2012:1: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred2_InternalLil4479);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalLil

    // $ANTLR start synpred3_InternalLil
    public final void synpred3_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2113:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2113:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2113:4: ( () ( ( ruleOpEquality ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2113:5: () ( ( ruleOpEquality ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2113:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2114:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2114:2: ( ( ruleOpEquality ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2115:1: ( ruleOpEquality )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2115:1: ( ruleOpEquality )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2116:1: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred3_InternalLil4734);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalLil

    // $ANTLR start synpred4_InternalLil
    public final void synpred4_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2224:3: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2224:4: ( () ( ( ruleOpCompare ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2224:4: ( () ( ( ruleOpCompare ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2224:5: () ( ( ruleOpCompare ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2224:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2225:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2225:2: ( ( ruleOpCompare ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2226:1: ( ruleOpCompare )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2226:1: ( ruleOpCompare )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2227:1: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred4_InternalLil5010);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalLil

    // $ANTLR start synpred5_InternalLil
    public final void synpred5_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2349:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2349:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2349:4: ( () ( ( ruleOpOther ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2349:5: () ( ( ruleOpOther ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2349:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2350:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2350:2: ( ( ruleOpOther ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2351:1: ( ruleOpOther )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2351:1: ( ruleOpOther )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2352:1: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred5_InternalLil5324);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalLil

    // $ANTLR start synpred6_InternalLil
    public final void synpred6_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2460:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2460:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2460:4: ( () ( ( ruleOpAdd ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2460:5: () ( ( ruleOpAdd ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2460:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2461:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2461:2: ( ( ruleOpAdd ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2462:1: ( ruleOpAdd )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2462:1: ( ruleOpAdd )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2463:1: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred6_InternalLil5600);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalLil

    // $ANTLR start synpred7_InternalLil
    public final void synpred7_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2571:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2571:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2571:4: ( () ( ( ruleOpMulti ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2571:5: () ( ( ruleOpMulti ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2571:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2572:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2572:2: ( ( ruleOpMulti ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2573:1: ( ruleOpMulti )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2573:1: ( ruleOpMulti )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2574:1: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred7_InternalLil5876);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalLil

    // $ANTLR start synpred11_InternalLil
    public final void synpred11_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3352:3: ( ( ruleXCasePart ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3353:1: ( ruleXCasePart )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3353:1: ( ruleXCasePart )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3354:1: ruleXCasePart
        {
        pushFollow(FOLLOW_ruleXCasePart_in_synpred11_InternalLil7785);
        ruleXCasePart();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalLil

    // $ANTLR start synpred12_InternalLil
    public final void synpred12_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3374:5: ( 'default' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3374:7: 'default'
        {
        match(input,69,FOLLOW_69_in_synpred12_InternalLil7816); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalLil

    // Delegated rules

    public final boolean synpred6_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred7_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalLil_fragment(); // can never throw exception
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
    public final boolean synpred11_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalLil_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_ruleLilModel_in_entryRuleLilModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractor_in_ruleLilModel131 = new BitSet(new long[]{0x0000010000000802L});
    public static final BitSet FOLLOW_ruleDataTypeCompound_in_ruleLilModel158 = new BitSet(new long[]{0x0000010000000802L});
    public static final BitSet FOLLOW_ruleInteractor_in_entryRuleInteractor195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractor205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInteractor242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractor259 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractor276 = new BitSet(new long[]{0x00000A0000000012L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleInteractor298 = new BitSet(new long[]{0x00000A0000000012L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInteractor325 = new BitSet(new long[]{0x00000A0000000012L});
    public static final BitSet FOLLOW_ruleBehavior_in_ruleInteractor352 = new BitSet(new long[]{0x00000A0000000012L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_entryRuleAccessibleEntity390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessibleEntity400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericEntity_in_ruleAccessibleEntity446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAccessibleEntity472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericEntity_in_entryRuleGenericEntity509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericEntity520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGenericEntity558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGenericEntity577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGenericEntity596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleGenericEntity615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleGenericEntity634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGenericEntity653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGenericEntity672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleEntity769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleEntity796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor883 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActor900 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActor912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorAlias_in_entryRuleActorAlias948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorAlias958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorAlias1003 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActorAlias1015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorAlias1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent1071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent1123 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComponent1140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent1160 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleComponent1173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActorAlias_in_ruleComponent1194 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleComponent1207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActorAlias_in_ruleComponent1228 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleSignalReception_in_entryRuleSignalReception1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReception1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalReception1324 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleSignalReception1337 = new BitSet(new long[]{0x00000000000FE010L});
    public static final BitSet FOLLOW_ruleSignalAlias_in_ruleSignalReception1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSignalReception1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalEmission_in_entryRuleSignalEmission1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalEmission1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalEmission1489 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleSignalEmission1502 = new BitSet(new long[]{0x00000000000FE010L});
    public static final BitSet FOLLOW_ruleSignalAlias_in_ruleSignalEmission1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1613 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSignal1630 = new BitSet(new long[]{0x000000FC00000010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleSignal1651 = new BitSet(new long[]{0x0000000308000000L});
    public static final BitSet FOLLOW_27_in_ruleSignal1664 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_ruleDefinitionSet_in_ruleSignal1685 = new BitSet(new long[]{0x0000000308000000L});
    public static final BitSet FOLLOW_ruleSignalMode_in_ruleSignal1708 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_24_in_ruleSignal1721 = new BitSet(new long[]{0x00000000000FE010L});
    public static final BitSet FOLLOW_ruleSignalAlias_in_ruleSignal1742 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleSignal1757 = new BitSet(new long[]{0x00000000000FE010L});
    public static final BitSet FOLLOW_ruleSignalAlias_in_ruleSignal1778 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleDefinitionSet_in_entryRuleDefinitionSet1816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionSet1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDefinitionSet1873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXEnumElement_in_ruleDefinitionSet1894 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_23_in_ruleDefinitionSet1907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXEnumElement_in_ruleDefinitionSet1928 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_29_in_ruleDefinitionSet1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDefinitionSet1971 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleDefinitionSet1992 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_23_in_ruleDefinitionSet2005 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleDefinitionSet2026 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_29_in_ruleDefinitionSet2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDefinitionSet2069 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleDefinitionSet2090 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDefinitionSet2102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleDefinitionSet2123 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDefinitionSet2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalAlias_in_entryRuleSignalAlias2172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalAlias2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_ruleSignalAlias2228 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleSignalAlias2241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalAlias2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalMode_in_entryRuleSignalMode2300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalMode2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSignalMode2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSignalMode2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType2408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeBase_in_ruleDataType2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeBase_in_entryRuleDataTypeBase2527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeBase2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDataTypeBase2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDataTypeBase2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDataTypeBase2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDataTypeBase2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataTypeBase2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDataTypeBase2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeCompound_in_entryRuleDataTypeCompound2711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeCompound2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDataTypeCompound2758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeCompound2775 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataTypeCompound2792 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDataTypeCompoundField_in_ruleDataTypeCompound2813 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDataTypeCompoundField_in_entryRuleDataTypeCompoundField2850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeCompoundField2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeCompoundField2902 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataTypeCompoundField2919 = new BitSet(new long[]{0x000000FC00000010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataTypeCompoundField2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehavior_in_entryRuleBehavior2976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehavior2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCause_in_ruleBehavior3032 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBehavior3044 = new BitSet(new long[]{0x0000D00000000000L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleBehavior3065 = new BitSet(new long[]{0x0000D00000000002L});
    public static final BitSet FOLLOW_ruleCause_in_entryRuleCause3102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCause3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCause_in_ruleCause3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenCause_in_ruleCause3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCause_in_entryRuleOnCause3221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCause3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOnCause3268 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleSignalReception_in_ruleOnCause3289 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleOnCause3302 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleOnCause3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenCause_in_entryRuleWhenCause3361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenCause3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleWhenCause3408 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleWhenCause3429 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleWhenCause3442 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleWhenCause3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect3501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEffect_in_ruleEffect3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetEffect_in_ruleEffect3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerEffect_in_ruleEffect3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEffect_in_entryRuleAlwaysEffect3647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEffect3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAlwaysEffect3694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalEmission_in_ruleAlwaysEffect3715 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleAlwaysEffect3727 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleAlwaysEffect3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetEffect_in_entryRuleSetEffect3784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetEffect3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSetEffect3831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalEmission_in_ruleSetEffect3852 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleSetEffect3864 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleSetEffect3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerEffect_in_entryRuleTriggerEffect3921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTriggerEffect3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTriggerEffect3968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalEmission_in_ruleTriggerEffect3989 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleTriggerEffect4001 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleTriggerEffect4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression4058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXExpression4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression4148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression4205 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression4254 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression4277 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr4316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpOr4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression4403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4460 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression4509 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression4532 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd4571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpAnd4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression4658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4715 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression4764 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression4787 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality4826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpEquality4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOpEquality4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4991 = new BitSet(new long[]{0x00F0000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression5040 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression5063 = new BitSet(new long[]{0x00F0000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare5102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOpCompare5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOpCompare5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOpCompare5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOpCompare5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression5248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5305 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression5354 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression5377 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther5416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOpOther5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOpOther5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression5524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5581 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression5630 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5653 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd5692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOpAdd5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOpAdd5760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression5800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression5810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5857 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5906 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5929 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti5968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOpMulti6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOpMulti6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOpMulti6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation6095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation6161 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXUnaryOperation6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXUnaryOperation6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary6247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOpUnary6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOpUnary6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOpUnary6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForEachExpression_in_ruleXPrimaryExpression6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionCallExpression_in_ruleXPrimaryExpression6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral6601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral6712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXLiteral6793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXLiteral6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXLiteral6850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_entryRuleXCollectionLiteral6887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCollectionLiteral6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral6944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_entryRuleXSetLiteral7006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSetLiteral7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleXSetLiteral7062 = new BitSet(new long[]{0x8C00040070000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral7084 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_23_in_ruleXSetLiteral7097 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral7118 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_29_in_ruleXSetLiteral7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_entryRuleXListLiteral7170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXListLiteral7180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleXListLiteral7226 = new BitSet(new long[]{0x8C000400D0000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral7248 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_23_in_ruleXListLiteral7261 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral7282 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_31_in_ruleXListLiteral7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXParenthesizedExpression7381 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXParenthesizedExpression7414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression7460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXIfExpression7506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXIfExpression7518 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXIfExpression7559 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleXIfExpression7602 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXSwitchExpression7717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXSwitchExpression7729 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXSwitchExpression7770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleXSwitchExpression7824 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleXSwitchExpression7837 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXCasePart7943 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7964 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleXCasePart7976 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForEachExpression_in_entryRuleXForEachExpression8033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForEachExpression8043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXForEachExpression8089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleXForEachExpression8101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXForEachExpression8113 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForEachExpression8134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXForEachExpression8146 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForEachExpression8167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionCallExpression_in_entryRuleXFunctionCallExpression8203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionCallExpression8213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInFunction_in_ruleXFunctionCallExpression8268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXFunctionCallExpression8280 = new BitSet(new long[]{0x8C00040050800070L,0x0000FFFFFFFFFE97L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFunctionCallExpression8301 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_23_in_ruleXFunctionCallExpression8315 = new BitSet(new long[]{0x8C00040050000070L,0x0000FFFFFFFFFE93L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFunctionCallExpression8336 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXFunctionCallExpression8350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInFunction_in_entryRuleBuiltInFunction8387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInFunction8398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleBuiltInFunction8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleBuiltInFunction8455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleBuiltInFunction8474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBuiltInFunction8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleBuiltInFunction8512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleBuiltInFunction8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleBuiltInFunction8550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleBuiltInFunction8569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleBuiltInFunction8588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleBuiltInFunction8607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleBuiltInFunction8626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleBuiltInFunction8645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleBuiltInFunction8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleBuiltInFunction8683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleBuiltInFunction8702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleBuiltInFunction8721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleBuiltInFunction8740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleBuiltInFunction8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleBuiltInFunction8778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleBuiltInFunction8797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleBuiltInFunction8816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleBuiltInFunction8835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleBuiltInFunction8854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleBuiltInFunction8873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleBuiltInFunction8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleBuiltInFunction8911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleBuiltInFunction8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleBuiltInFunction8949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleBuiltInFunction8968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleBuiltInFunction8987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleBuiltInFunction9006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleBuiltInFunction9025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleBuiltInFunction9044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleBuiltInFunction9063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleBuiltInFunction9082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleBuiltInFunction9101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleXBooleanLiteral9198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleXBooleanLiteral9222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleXNullLiteral9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleXNumberLiteral9429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEnumElement_in_entryRuleXEnumElement9567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEnumElement9577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXEnumElement9623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXEnumElement9640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER9682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER9693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER9733 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleNUMBER9752 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER9767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred1_InternalLil4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred2_InternalLil4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred3_InternalLil4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred4_InternalLil5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred5_InternalLil5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred6_InternalLil5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred7_InternalLil5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_synpred11_InternalLil7785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred12_InternalLil7816 = new BitSet(new long[]{0x0000000000000002L});

}
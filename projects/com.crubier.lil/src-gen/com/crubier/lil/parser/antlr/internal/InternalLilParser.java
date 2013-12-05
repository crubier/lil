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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'actor'", "':'", "'input'", "'output'", "'data'", "'in'", "'{'", "','", "'}'", "'['", "']'", "'#'", "'void'", "'symbol'", "'number'", "'text'", "'time'", "'identifier'", "'collection'", "'set'", "'list'", "'queue'", "'map'", "'by'", "'interactor'", "'from'", "'to'", "'as'", "'event'", "'flow'", "'constant'", "'with'", "'any'", "'self'", "'other'", "'parent'", "'child'", "'all'", "'actors'", "'init'", "'on'", "'if'", "'when'", "'always'", "'='", "'trigger'", "'or'", "'and'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'<>'", "'?:'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'('", "')'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'each'", "'math.abs'", "'math.acos'", "'math.acosh'", "'math.asin'", "'math.asinh'", "'math.atan'", "'math.atanh'", "'math.atan2'", "'math.ceil'", "'math.clip'", "'math.cos'", "'math.cosh'", "'math.exp'", "'math.floor'", "'math.fround'", "'math.hypot'", "'math.log'", "'math.log10'", "'math.log2'", "'math.max'", "'math.min'", "'math.pow'", "'math.random'", "'math.round'", "'math.sign'", "'math.sin'", "'math.sinh'", "'math.sqrt'", "'math.tan'", "'math.tanh'", "'math.trunc'", "'false'", "'true'", "'null'", "'now'", "'year'", "'month'", "'day'", "'hour'", "'m'", "'minute'", "'s'", "'second'", "'.'"
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
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
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
    public static final int T__113=113;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:76:1: ruleLilModel returns [EObject current=null] : ( ( (lv_actorType_0_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_1_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_2_0= ruleInteractorTypeDefinition ) ) )* ;
    public final EObject ruleLilModel() throws RecognitionException {
        EObject current = null;

        EObject lv_actorType_0_0 = null;

        EObject lv_dataType_1_0 = null;

        EObject lv_interactorType_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:79:28: ( ( ( (lv_actorType_0_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_1_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_2_0= ruleInteractorTypeDefinition ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:1: ( ( (lv_actorType_0_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_1_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_2_0= ruleInteractorTypeDefinition ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:1: ( ( (lv_actorType_0_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_1_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_2_0= ruleInteractorTypeDefinition ) ) )*
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    switch ( input.LA(2) ) {
                    case 35:
                        {
                        alt1=3;
                        }
                        break;
                    case 15:
                        {
                        alt1=2;
                        }
                        break;
                    case 11:
                        {
                        alt1=1;
                        }
                        break;

                    }

                }


                switch (alt1) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:2: ( (lv_actorType_0_0= ruleActorTypeDefinition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:2: ( (lv_actorType_0_0= ruleActorTypeDefinition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:81:1: (lv_actorType_0_0= ruleActorTypeDefinition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:81:1: (lv_actorType_0_0= ruleActorTypeDefinition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:82:3: lv_actorType_0_0= ruleActorTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getActorTypeActorTypeDefinitionParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleActorTypeDefinition_in_ruleLilModel131);
            	    lv_actorType_0_0=ruleActorTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actorType",
            	              		lv_actorType_0_0, 
            	              		"ActorTypeDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:99:6: ( (lv_dataType_1_0= ruleDataTypeDefinition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:99:6: ( (lv_dataType_1_0= ruleDataTypeDefinition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:100:1: (lv_dataType_1_0= ruleDataTypeDefinition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:100:1: (lv_dataType_1_0= ruleDataTypeDefinition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:101:3: lv_dataType_1_0= ruleDataTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getDataTypeDataTypeDefinitionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDataTypeDefinition_in_ruleLilModel158);
            	    lv_dataType_1_0=ruleDataTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dataType",
            	              		lv_dataType_1_0, 
            	              		"DataTypeDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:118:6: ( (lv_interactorType_2_0= ruleInteractorTypeDefinition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:118:6: ( (lv_interactorType_2_0= ruleInteractorTypeDefinition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:119:1: (lv_interactorType_2_0= ruleInteractorTypeDefinition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:119:1: (lv_interactorType_2_0= ruleInteractorTypeDefinition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:120:3: lv_interactorType_2_0= ruleInteractorTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getInteractorTypeInteractorTypeDefinitionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorTypeDefinition_in_ruleLilModel185);
            	    lv_interactorType_2_0=ruleInteractorTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"interactorType",
            	              		lv_interactorType_2_0, 
            	              		"InteractorTypeDefinition");
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


    // $ANTLR start "entryRuleActorTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:144:1: entryRuleActorTypeDefinition returns [EObject current=null] : iv_ruleActorTypeDefinition= ruleActorTypeDefinition EOF ;
    public final EObject entryRuleActorTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorTypeDefinition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:145:2: (iv_ruleActorTypeDefinition= ruleActorTypeDefinition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:146:2: iv_ruleActorTypeDefinition= ruleActorTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleActorTypeDefinition_in_entryRuleActorTypeDefinition222);
            iv_ruleActorTypeDefinition=ruleActorTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorTypeDefinition232); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActorTypeDefinition"


    // $ANTLR start "ruleActorTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:153:1: ruleActorTypeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorComponent ) )* ) ;
    public final EObject ruleActorTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_component_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:156:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorComponent ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:157:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorComponent ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:157:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorComponent ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:157:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorComponent ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:157:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:158:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:158:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:159:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorTypeDefinition274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getActorTypeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActorTypeDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleActorTypeDefinition291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorTypeDefinitionAccess().getActorKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActorTypeDefinition303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActorTypeDefinitionAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:183:1: ( (lv_component_3_0= ruleActorComponent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==12) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:184:1: (lv_component_3_0= ruleActorComponent )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:184:1: (lv_component_3_0= ruleActorComponent )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:185:3: lv_component_3_0= ruleActorComponent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getActorTypeDefinitionAccess().getComponentActorComponentParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleActorComponent_in_ruleActorTypeDefinition324);
            	    lv_component_3_0=ruleActorComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getActorTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"component",
            	              		lv_component_3_0, 
            	              		"ActorComponent");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleActorTypeDefinition"


    // $ANTLR start "entryRuleActorType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:209:1: entryRuleActorType returns [EObject current=null] : iv_ruleActorType= ruleActorType EOF ;
    public final EObject entryRuleActorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:210:2: (iv_ruleActorType= ruleActorType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:211:2: iv_ruleActorType= ruleActorType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorTypeRule()); 
            }
            pushFollow(FOLLOW_ruleActorType_in_entryRuleActorType361);
            iv_ruleActorType=ruleActorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorType371); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActorType"


    // $ANTLR start "ruleActorType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:218:1: ruleActorType returns [EObject current=null] : ( ( (lv_base_0_0= ruleActorBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleActorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_base_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:221:28: ( ( ( (lv_base_0_0= ruleActorBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:222:1: ( ( (lv_base_0_0= ruleActorBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:222:1: ( ( (lv_base_0_0= ruleActorBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=14)) ) {
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:222:2: ( (lv_base_0_0= ruleActorBaseType ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:222:2: ( (lv_base_0_0= ruleActorBaseType ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:223:1: (lv_base_0_0= ruleActorBaseType )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:223:1: (lv_base_0_0= ruleActorBaseType )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:224:3: lv_base_0_0= ruleActorBaseType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getActorTypeAccess().getBaseActorBaseTypeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleActorBaseType_in_ruleActorType417);
                    lv_base_0_0=ruleActorBaseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getActorTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"base",
                              		lv_base_0_0, 
                              		"ActorBaseType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:6: ( (otherlv_1= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:242:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:242:1: (otherlv_1= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:243:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getActorTypeRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorType443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getActorTypeAccess().getCustomActorTypeDefinitionCrossReference_1_0()); 
                      	
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
    // $ANTLR end "ruleActorType"


    // $ANTLR start "entryRuleActorBaseType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:262:1: entryRuleActorBaseType returns [String current=null] : iv_ruleActorBaseType= ruleActorBaseType EOF ;
    public final String entryRuleActorBaseType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActorBaseType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:263:2: (iv_ruleActorBaseType= ruleActorBaseType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:264:2: iv_ruleActorBaseType= ruleActorBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleActorBaseType_in_entryRuleActorBaseType480);
            iv_ruleActorBaseType=ruleActorBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorBaseType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorBaseType491); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActorBaseType"


    // $ANTLR start "ruleActorBaseType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:271:1: ruleActorBaseType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'input' | kw= 'output' ) ;
    public final AntlrDatatypeRuleToken ruleActorBaseType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:274:28: ( (kw= 'input' | kw= 'output' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:275:1: (kw= 'input' | kw= 'output' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:275:1: (kw= 'input' | kw= 'output' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:276:2: kw= 'input'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleActorBaseType529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getActorBaseTypeAccess().getInputKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:283:2: kw= 'output'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleActorBaseType548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getActorBaseTypeAccess().getOutputKeyword_1()); 
                          
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
    // $ANTLR end "ruleActorBaseType"


    // $ANTLR start "entryRuleActorComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:296:1: entryRuleActorComponent returns [EObject current=null] : iv_ruleActorComponent= ruleActorComponent EOF ;
    public final EObject entryRuleActorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorComponent = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:297:2: (iv_ruleActorComponent= ruleActorComponent EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:298:2: iv_ruleActorComponent= ruleActorComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorComponentRule()); 
            }
            pushFollow(FOLLOW_ruleActorComponent_in_entryRuleActorComponent588);
            iv_ruleActorComponent=ruleActorComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorComponent598); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActorComponent"


    // $ANTLR start "ruleActorComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:305:1: ruleActorComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) ) ;
    public final EObject ruleActorComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:308:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:309:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:309:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:309:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:309:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:310:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:310:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:311:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorComponent640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getActorComponentAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActorComponentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleActorComponent657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorComponentAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:331:1: ( (lv_type_2_0= ruleActorType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:332:1: (lv_type_2_0= ruleActorType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:332:1: (lv_type_2_0= ruleActorType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:333:3: lv_type_2_0= ruleActorType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActorComponentAccess().getTypeActorTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActorType_in_ruleActorComponent678);
            lv_type_2_0=ruleActorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActorComponentRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ActorType");
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
    // $ANTLR end "ruleActorComponent"


    // $ANTLR start "entryRuleDataTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:357:1: entryRuleDataTypeDefinition returns [EObject current=null] : iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF ;
    public final EObject entryRuleDataTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDefinition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:358:2: (iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:359:2: iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeDefinition_in_entryRuleDataTypeDefinition714);
            iv_ruleDataTypeDefinition=ruleDataTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeDefinition724); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeDefinition"


    // $ANTLR start "ruleDataTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:366:1: ruleDataTypeDefinition returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponent ) )* ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) ) ) ;
    public final EObject ruleDataTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_component_4_0 = null;

        EObject lv_alias_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:369:28: ( ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponent ) )* ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:370:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponent ) )* ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:370:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponent ) )* ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==15) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==12) ) {
                        switch ( input.LA(4) ) {
                        case RULE_ID:
                            {
                            int LA6_4 = input.LA(5);

                            if ( (LA6_4==EOF||LA6_4==RULE_ID||(LA6_4>=29 && LA6_4<=33)) ) {
                                alt6=2;
                            }
                            else if ( ((LA6_4>=11 && LA6_4<=12)||LA6_4==15||LA6_4==35) ) {
                                alt6=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                            {
                            alt6=1;
                            }
                            break;
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            {
                            alt6=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:370:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponent ) )* )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:370:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponent ) )* )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:370:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponent ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:370:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:371:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeDefinitionAccess().getDataTypeDefinitionCompoundAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:376:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:377:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:377:1: (lv_name_1_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:378:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeDefinition776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeDefinitionAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleDataTypeDefinition793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDataTypeDefinitionAccess().getDataKeyword_0_2());
                          
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDataTypeDefinition805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDataTypeDefinitionAccess().getColonKeyword_0_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:402:1: ( (lv_component_4_0= ruleDataComponent ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            int LA5_2 = input.LA(2);

                            if ( (LA5_2==12) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:403:1: (lv_component_4_0= ruleDataComponent )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:403:1: (lv_component_4_0= ruleDataComponent )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:404:3: lv_component_4_0= ruleDataComponent
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getComponentDataComponentParserRuleCall_0_4_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDataComponent_in_ruleDataTypeDefinition826);
                    	    lv_component_4_0=ruleDataComponent();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDataTypeDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"component",
                    	              		lv_component_4_0, 
                    	              		"DataComponent");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:421:6: ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:421:6: ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:421:7: () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:421:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:422:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeDefinitionAccess().getDataTypeDefinitionAliasAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:427:2: ( (lv_name_6_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:428:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:428:1: (lv_name_6_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:429:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeDefinition861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_6_0, grammarAccess.getDataTypeDefinitionAccess().getNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_6_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleDataTypeDefinition878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDataTypeDefinitionAccess().getDataKeyword_1_2());
                          
                    }
                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleDataTypeDefinition890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getDataTypeDefinitionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:453:1: ( (lv_alias_9_0= ruleDataType ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:454:1: (lv_alias_9_0= ruleDataType )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:454:1: (lv_alias_9_0= ruleDataType )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:455:3: lv_alias_9_0= ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getAliasDataTypeParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataType_in_ruleDataTypeDefinition911);
                    lv_alias_9_0=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"alias",
                              		lv_alias_9_0, 
                              		"DataType");
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
    // $ANTLR end "ruleDataTypeDefinition"


    // $ANTLR start "entryRuleDataType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:479:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:480:2: (iv_ruleDataType= ruleDataType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:481:2: iv_ruleDataType= ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType948);
            iv_ruleDataType=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType958); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:488:1: ruleDataType returns [EObject current=null] : ( ( ( ( (lv_base_0_0= ruleDataBaseType ) ) (otherlv_1= 'in' ( (lv_definitionSet_2_0= ruleDataDefinitionSet ) ) )? ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_collection_4_0= ruleDataCollectionType ) )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_base_0_0 = null;

        EObject lv_definitionSet_2_0 = null;

        EObject lv_collection_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:491:28: ( ( ( ( ( (lv_base_0_0= ruleDataBaseType ) ) (otherlv_1= 'in' ( (lv_definitionSet_2_0= ruleDataDefinitionSet ) ) )? ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_collection_4_0= ruleDataCollectionType ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:492:1: ( ( ( ( (lv_base_0_0= ruleDataBaseType ) ) (otherlv_1= 'in' ( (lv_definitionSet_2_0= ruleDataDefinitionSet ) ) )? ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_collection_4_0= ruleDataCollectionType ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:492:1: ( ( ( ( (lv_base_0_0= ruleDataBaseType ) ) (otherlv_1= 'in' ( (lv_definitionSet_2_0= ruleDataDefinitionSet ) ) )? ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_collection_4_0= ruleDataCollectionType ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:492:2: ( ( ( (lv_base_0_0= ruleDataBaseType ) ) (otherlv_1= 'in' ( (lv_definitionSet_2_0= ruleDataDefinitionSet ) ) )? ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_collection_4_0= ruleDataCollectionType ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:492:2: ( ( ( (lv_base_0_0= ruleDataBaseType ) ) (otherlv_1= 'in' ( (lv_definitionSet_2_0= ruleDataDefinitionSet ) ) )? ) | ( (otherlv_3= RULE_ID ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=23 && LA8_0<=28)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:492:3: ( ( (lv_base_0_0= ruleDataBaseType ) ) (otherlv_1= 'in' ( (lv_definitionSet_2_0= ruleDataDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:492:3: ( ( (lv_base_0_0= ruleDataBaseType ) ) (otherlv_1= 'in' ( (lv_definitionSet_2_0= ruleDataDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:492:4: ( (lv_base_0_0= ruleDataBaseType ) ) (otherlv_1= 'in' ( (lv_definitionSet_2_0= ruleDataDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:492:4: ( (lv_base_0_0= ruleDataBaseType ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:493:1: (lv_base_0_0= ruleDataBaseType )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:493:1: (lv_base_0_0= ruleDataBaseType )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:494:3: lv_base_0_0= ruleDataBaseType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeAccess().getBaseDataBaseTypeParserRuleCall_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataBaseType_in_ruleDataType1006);
                    lv_base_0_0=ruleDataBaseType();

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
                              		"DataBaseType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:510:2: (otherlv_1= 'in' ( (lv_definitionSet_2_0= ruleDataDefinitionSet ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==16) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:510:4: otherlv_1= 'in' ( (lv_definitionSet_2_0= ruleDataDefinitionSet ) )
                            {
                            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleDataType1019); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getInKeyword_0_0_1_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:514:1: ( (lv_definitionSet_2_0= ruleDataDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:515:1: (lv_definitionSet_2_0= ruleDataDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:515:1: (lv_definitionSet_2_0= ruleDataDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:516:3: lv_definitionSet_2_0= ruleDataDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDataDefinitionSetParserRuleCall_0_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDataDefinitionSet_in_ruleDataType1040);
                            lv_definitionSet_2_0=ruleDataDefinitionSet();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definitionSet",
                                      		lv_definitionSet_2_0, 
                                      		"DataDefinitionSet");
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:533:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:533:6: ( (otherlv_3= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:534:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:534:1: (otherlv_3= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:535:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType1069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getCustomDataTypeDefinitionCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:546:3: ( (lv_collection_4_0= ruleDataCollectionType ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=29 && LA9_0<=33)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:547:1: (lv_collection_4_0= ruleDataCollectionType )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:547:1: (lv_collection_4_0= ruleDataCollectionType )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:548:3: lv_collection_4_0= ruleDataCollectionType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeAccess().getCollectionDataCollectionTypeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataCollectionType_in_ruleDataType1091);
                    lv_collection_4_0=ruleDataCollectionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"collection",
                              		lv_collection_4_0, 
                              		"DataCollectionType");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleDataDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:572:1: entryRuleDataDefinitionSet returns [EObject current=null] : iv_ruleDataDefinitionSet= ruleDataDefinitionSet EOF ;
    public final EObject entryRuleDataDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:573:2: (iv_ruleDataDefinitionSet= ruleDataDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:574:2: iv_ruleDataDefinitionSet= ruleDataDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDataDefinitionSet_in_entryRuleDataDefinitionSet1128);
            iv_ruleDataDefinitionSet=ruleDataDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinitionSet1138); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataDefinitionSet"


    // $ANTLR start "ruleDataDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:581:1: ruleDataDefinitionSet returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleDataDefinitionEnumElement ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleDataDefinitionEnumElement ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '{' ( (lv_element_8_0= ruleLiteralNumber ) ) (otherlv_9= ',' ( (lv_element_10_0= ruleLiteralNumber ) ) )* otherlv_11= '}' ) | ( () otherlv_13= '[' ( (lv_inf_14_0= ruleLiteralNumber ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleLiteralNumber ) ) otherlv_17= ']' ) ) ;
    public final EObject ruleDataDefinitionSet() throws RecognitionException {
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
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;

        EObject lv_element_8_0 = null;

        EObject lv_element_10_0 = null;

        EObject lv_inf_14_0 = null;

        EObject lv_sup_16_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:584:28: ( ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleDataDefinitionEnumElement ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleDataDefinitionEnumElement ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '{' ( (lv_element_8_0= ruleLiteralNumber ) ) (otherlv_9= ',' ( (lv_element_10_0= ruleLiteralNumber ) ) )* otherlv_11= '}' ) | ( () otherlv_13= '[' ( (lv_inf_14_0= ruleLiteralNumber ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleLiteralNumber ) ) otherlv_17= ']' ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:585:1: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleDataDefinitionEnumElement ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleDataDefinitionEnumElement ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '{' ( (lv_element_8_0= ruleLiteralNumber ) ) (otherlv_9= ',' ( (lv_element_10_0= ruleLiteralNumber ) ) )* otherlv_11= '}' ) | ( () otherlv_13= '[' ( (lv_inf_14_0= ruleLiteralNumber ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleLiteralNumber ) ) otherlv_17= ']' ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:585:1: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleDataDefinitionEnumElement ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleDataDefinitionEnumElement ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '{' ( (lv_element_8_0= ruleLiteralNumber ) ) (otherlv_9= ',' ( (lv_element_10_0= ruleLiteralNumber ) ) )* otherlv_11= '}' ) | ( () otherlv_13= '[' ( (lv_inf_14_0= ruleLiteralNumber ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleLiteralNumber ) ) otherlv_17= ']' ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_INT) ) {
                    alt12=2;
                }
                else if ( (LA12_1==22) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==20) ) {
                alt12=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:585:2: ( () otherlv_1= '{' ( (lv_element_2_0= ruleDataDefinitionEnumElement ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleDataDefinitionEnumElement ) ) )* otherlv_5= '}' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:585:2: ( () otherlv_1= '{' ( (lv_element_2_0= ruleDataDefinitionEnumElement ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleDataDefinitionEnumElement ) ) )* otherlv_5= '}' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:585:3: () otherlv_1= '{' ( (lv_element_2_0= ruleDataDefinitionEnumElement ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleDataDefinitionEnumElement ) ) )* otherlv_5= '}'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:585:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:586:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataDefinitionSetAccess().getDataDefinitionSetEnumAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleDataDefinitionSet1185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDataDefinitionSetAccess().getLeftCurlyBracketKeyword_0_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:595:1: ( (lv_element_2_0= ruleDataDefinitionEnumElement ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:596:1: (lv_element_2_0= ruleDataDefinitionEnumElement )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:596:1: (lv_element_2_0= ruleDataDefinitionEnumElement )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:597:3: lv_element_2_0= ruleDataDefinitionEnumElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionSetAccess().getElementDataDefinitionEnumElementParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataDefinitionEnumElement_in_ruleDataDefinitionSet1206);
                    lv_element_2_0=ruleDataDefinitionEnumElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionSetRule());
                      	        }
                             		add(
                             			current, 
                             			"element",
                              		lv_element_2_0, 
                              		"DataDefinitionEnumElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:613:2: (otherlv_3= ',' ( (lv_element_4_0= ruleDataDefinitionEnumElement ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:613:4: otherlv_3= ',' ( (lv_element_4_0= ruleDataDefinitionEnumElement ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleDataDefinitionSet1219); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getDataDefinitionSetAccess().getCommaKeyword_0_3_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:617:1: ( (lv_element_4_0= ruleDataDefinitionEnumElement ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:618:1: (lv_element_4_0= ruleDataDefinitionEnumElement )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:618:1: (lv_element_4_0= ruleDataDefinitionEnumElement )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:619:3: lv_element_4_0= ruleDataDefinitionEnumElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDataDefinitionSetAccess().getElementDataDefinitionEnumElementParserRuleCall_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDataDefinitionEnumElement_in_ruleDataDefinitionSet1240);
                    	    lv_element_4_0=ruleDataDefinitionEnumElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDataDefinitionSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"element",
                    	              		lv_element_4_0, 
                    	              		"DataDefinitionEnumElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDataDefinitionSet1254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDataDefinitionSetAccess().getRightCurlyBracketKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:640:6: ( () otherlv_7= '{' ( (lv_element_8_0= ruleLiteralNumber ) ) (otherlv_9= ',' ( (lv_element_10_0= ruleLiteralNumber ) ) )* otherlv_11= '}' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:640:6: ( () otherlv_7= '{' ( (lv_element_8_0= ruleLiteralNumber ) ) (otherlv_9= ',' ( (lv_element_10_0= ruleLiteralNumber ) ) )* otherlv_11= '}' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:640:7: () otherlv_7= '{' ( (lv_element_8_0= ruleLiteralNumber ) ) (otherlv_9= ',' ( (lv_element_10_0= ruleLiteralNumber ) ) )* otherlv_11= '}'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:640:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:641:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataDefinitionSetAccess().getDataDefinitionSetNumberAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleDataDefinitionSet1283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDataDefinitionSetAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:650:1: ( (lv_element_8_0= ruleLiteralNumber ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:651:1: (lv_element_8_0= ruleLiteralNumber )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:651:1: (lv_element_8_0= ruleLiteralNumber )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:652:3: lv_element_8_0= ruleLiteralNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionSetAccess().getElementLiteralNumberParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataDefinitionSet1304);
                    lv_element_8_0=ruleLiteralNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionSetRule());
                      	        }
                             		add(
                             			current, 
                             			"element",
                              		lv_element_8_0, 
                              		"LiteralNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:668:2: (otherlv_9= ',' ( (lv_element_10_0= ruleLiteralNumber ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:668:4: otherlv_9= ',' ( (lv_element_10_0= ruleLiteralNumber ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleDataDefinitionSet1317); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getDataDefinitionSetAccess().getCommaKeyword_1_3_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:672:1: ( (lv_element_10_0= ruleLiteralNumber ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:673:1: (lv_element_10_0= ruleLiteralNumber )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:673:1: (lv_element_10_0= ruleLiteralNumber )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:3: lv_element_10_0= ruleLiteralNumber
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDataDefinitionSetAccess().getElementLiteralNumberParserRuleCall_1_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataDefinitionSet1338);
                    	    lv_element_10_0=ruleLiteralNumber();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDataDefinitionSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"element",
                    	              		lv_element_10_0, 
                    	              		"LiteralNumber");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleDataDefinitionSet1352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDataDefinitionSetAccess().getRightCurlyBracketKeyword_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:695:6: ( () otherlv_13= '[' ( (lv_inf_14_0= ruleLiteralNumber ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleLiteralNumber ) ) otherlv_17= ']' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:695:6: ( () otherlv_13= '[' ( (lv_inf_14_0= ruleLiteralNumber ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleLiteralNumber ) ) otherlv_17= ']' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:695:7: () otherlv_13= '[' ( (lv_inf_14_0= ruleLiteralNumber ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleLiteralNumber ) ) otherlv_17= ']'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:695:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:696:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataDefinitionSetAccess().getDataDefinitionSetIntervalAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleDataDefinitionSet1381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getDataDefinitionSetAccess().getLeftSquareBracketKeyword_2_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:705:1: ( (lv_inf_14_0= ruleLiteralNumber ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:706:1: (lv_inf_14_0= ruleLiteralNumber )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:706:1: (lv_inf_14_0= ruleLiteralNumber )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:707:3: lv_inf_14_0= ruleLiteralNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionSetAccess().getInfLiteralNumberParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataDefinitionSet1402);
                    lv_inf_14_0=ruleLiteralNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"inf",
                              		lv_inf_14_0, 
                              		"LiteralNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleDataDefinitionSet1414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getDataDefinitionSetAccess().getCommaKeyword_2_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:727:1: ( (lv_sup_16_0= ruleLiteralNumber ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:728:1: (lv_sup_16_0= ruleLiteralNumber )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:728:1: (lv_sup_16_0= ruleLiteralNumber )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:729:3: lv_sup_16_0= ruleLiteralNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionSetAccess().getSupLiteralNumberParserRuleCall_2_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataDefinitionSet1435);
                    lv_sup_16_0=ruleLiteralNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"sup",
                              		lv_sup_16_0, 
                              		"LiteralNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,21,FOLLOW_21_in_ruleDataDefinitionSet1447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getDataDefinitionSetAccess().getRightSquareBracketKeyword_2_5());
                          
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
    // $ANTLR end "ruleDataDefinitionSet"


    // $ANTLR start "entryRuleDataDefinitionEnumElement"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:757:1: entryRuleDataDefinitionEnumElement returns [EObject current=null] : iv_ruleDataDefinitionEnumElement= ruleDataDefinitionEnumElement EOF ;
    public final EObject entryRuleDataDefinitionEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinitionEnumElement = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:758:2: (iv_ruleDataDefinitionEnumElement= ruleDataDefinitionEnumElement EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:759:2: iv_ruleDataDefinitionEnumElement= ruleDataDefinitionEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDefinitionEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleDataDefinitionEnumElement_in_entryRuleDataDefinitionEnumElement1484);
            iv_ruleDataDefinitionEnumElement=ruleDataDefinitionEnumElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDefinitionEnumElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinitionEnumElement1494); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataDefinitionEnumElement"


    // $ANTLR start "ruleDataDefinitionEnumElement"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:766:1: ruleDataDefinitionEnumElement returns [EObject current=null] : ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDataDefinitionEnumElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:769:28: ( ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:770:1: ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:770:1: ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:770:2: () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:770:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:771:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataDefinitionEnumElementAccess().getDataDefinitionEnumElementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleDataDefinitionEnumElement1540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataDefinitionEnumElementAccess().getNumberSignKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:780:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:781:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:781:1: (lv_name_2_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:782:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataDefinitionEnumElement1557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDataDefinitionEnumElementAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataDefinitionEnumElementRule());
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
    // $ANTLR end "ruleDataDefinitionEnumElement"


    // $ANTLR start "entryRuleDataBaseType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:806:1: entryRuleDataBaseType returns [String current=null] : iv_ruleDataBaseType= ruleDataBaseType EOF ;
    public final String entryRuleDataBaseType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataBaseType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:807:2: (iv_ruleDataBaseType= ruleDataBaseType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:808:2: iv_ruleDataBaseType= ruleDataBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleDataBaseType_in_entryRuleDataBaseType1599);
            iv_ruleDataBaseType=ruleDataBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataBaseType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataBaseType1610); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataBaseType"


    // $ANTLR start "ruleDataBaseType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:815:1: ruleDataBaseType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'identifier' ) ;
    public final AntlrDatatypeRuleToken ruleDataBaseType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:818:28: ( (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'identifier' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:819:1: (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'identifier' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:819:1: (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'identifier' )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt13=1;
                }
                break;
            case 24:
                {
                alt13=2;
                }
                break;
            case 25:
                {
                alt13=3;
                }
                break;
            case 26:
                {
                alt13=4;
                }
                break;
            case 27:
                {
                alt13=5;
                }
                break;
            case 28:
                {
                alt13=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:820:2: kw= 'void'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleDataBaseType1648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataBaseTypeAccess().getVoidKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:827:2: kw= 'symbol'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleDataBaseType1667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataBaseTypeAccess().getSymbolKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:834:2: kw= 'number'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleDataBaseType1686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataBaseTypeAccess().getNumberKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:841:2: kw= 'text'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleDataBaseType1705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataBaseTypeAccess().getTextKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:848:2: kw= 'time'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleDataBaseType1724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataBaseTypeAccess().getTimeKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:855:2: kw= 'identifier'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleDataBaseType1743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDataBaseTypeAccess().getIdentifierKeyword_5()); 
                          
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
    // $ANTLR end "ruleDataBaseType"


    // $ANTLR start "entryRuleDataCollectionType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:868:1: entryRuleDataCollectionType returns [EObject current=null] : iv_ruleDataCollectionType= ruleDataCollectionType EOF ;
    public final EObject entryRuleDataCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataCollectionType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:869:2: (iv_ruleDataCollectionType= ruleDataCollectionType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:870:2: iv_ruleDataCollectionType= ruleDataCollectionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataCollectionTypeRule()); 
            }
            pushFollow(FOLLOW_ruleDataCollectionType_in_entryRuleDataCollectionType1783);
            iv_ruleDataCollectionType=ruleDataCollectionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataCollectionType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataCollectionType1793); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataCollectionType"


    // $ANTLR start "ruleDataCollectionType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:877:1: ruleDataCollectionType returns [EObject current=null] : ( ( (lv_type_0_0= 'collection' ) ) | ( (lv_type_1_0= 'set' ) ) | ( (lv_type_2_0= 'list' ) ) | ( (lv_type_3_0= 'queue' ) ) | ( ( (lv_type_4_0= 'map' ) ) ( ( ( 'by' )=>otherlv_5= 'by' ) ( (lv_mapping_6_0= ruleDataType ) ) ) ) ) ;
    public final EObject ruleDataCollectionType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_1_0=null;
        Token lv_type_2_0=null;
        Token lv_type_3_0=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        EObject lv_mapping_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:880:28: ( ( ( (lv_type_0_0= 'collection' ) ) | ( (lv_type_1_0= 'set' ) ) | ( (lv_type_2_0= 'list' ) ) | ( (lv_type_3_0= 'queue' ) ) | ( ( (lv_type_4_0= 'map' ) ) ( ( ( 'by' )=>otherlv_5= 'by' ) ( (lv_mapping_6_0= ruleDataType ) ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:881:1: ( ( (lv_type_0_0= 'collection' ) ) | ( (lv_type_1_0= 'set' ) ) | ( (lv_type_2_0= 'list' ) ) | ( (lv_type_3_0= 'queue' ) ) | ( ( (lv_type_4_0= 'map' ) ) ( ( ( 'by' )=>otherlv_5= 'by' ) ( (lv_mapping_6_0= ruleDataType ) ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:881:1: ( ( (lv_type_0_0= 'collection' ) ) | ( (lv_type_1_0= 'set' ) ) | ( (lv_type_2_0= 'list' ) ) | ( (lv_type_3_0= 'queue' ) ) | ( ( (lv_type_4_0= 'map' ) ) ( ( ( 'by' )=>otherlv_5= 'by' ) ( (lv_mapping_6_0= ruleDataType ) ) ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            case 33:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:881:2: ( (lv_type_0_0= 'collection' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:881:2: ( (lv_type_0_0= 'collection' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:882:1: (lv_type_0_0= 'collection' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:882:1: (lv_type_0_0= 'collection' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:883:3: lv_type_0_0= 'collection'
                    {
                    lv_type_0_0=(Token)match(input,29,FOLLOW_29_in_ruleDataCollectionType1836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_0_0, grammarAccess.getDataCollectionTypeAccess().getTypeCollectionKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataCollectionTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_0_0, "collection");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:897:6: ( (lv_type_1_0= 'set' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:897:6: ( (lv_type_1_0= 'set' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:898:1: (lv_type_1_0= 'set' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:898:1: (lv_type_1_0= 'set' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:899:3: lv_type_1_0= 'set'
                    {
                    lv_type_1_0=(Token)match(input,30,FOLLOW_30_in_ruleDataCollectionType1873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_1_0, grammarAccess.getDataCollectionTypeAccess().getTypeSetKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataCollectionTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_1_0, "set");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:913:6: ( (lv_type_2_0= 'list' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:913:6: ( (lv_type_2_0= 'list' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:914:1: (lv_type_2_0= 'list' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:914:1: (lv_type_2_0= 'list' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:915:3: lv_type_2_0= 'list'
                    {
                    lv_type_2_0=(Token)match(input,31,FOLLOW_31_in_ruleDataCollectionType1910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_2_0, grammarAccess.getDataCollectionTypeAccess().getTypeListKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataCollectionTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_2_0, "list");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:929:6: ( (lv_type_3_0= 'queue' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:929:6: ( (lv_type_3_0= 'queue' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:930:1: (lv_type_3_0= 'queue' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:930:1: (lv_type_3_0= 'queue' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:931:3: lv_type_3_0= 'queue'
                    {
                    lv_type_3_0=(Token)match(input,32,FOLLOW_32_in_ruleDataCollectionType1947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_3_0, grammarAccess.getDataCollectionTypeAccess().getTypeQueueKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataCollectionTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_3_0, "queue");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:945:6: ( ( (lv_type_4_0= 'map' ) ) ( ( ( 'by' )=>otherlv_5= 'by' ) ( (lv_mapping_6_0= ruleDataType ) ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:945:6: ( ( (lv_type_4_0= 'map' ) ) ( ( ( 'by' )=>otherlv_5= 'by' ) ( (lv_mapping_6_0= ruleDataType ) ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:945:7: ( (lv_type_4_0= 'map' ) ) ( ( ( 'by' )=>otherlv_5= 'by' ) ( (lv_mapping_6_0= ruleDataType ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:945:7: ( (lv_type_4_0= 'map' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:946:1: (lv_type_4_0= 'map' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:946:1: (lv_type_4_0= 'map' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:947:3: lv_type_4_0= 'map'
                    {
                    lv_type_4_0=(Token)match(input,33,FOLLOW_33_in_ruleDataCollectionType1985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_4_0, grammarAccess.getDataCollectionTypeAccess().getTypeMapKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataCollectionTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_4_0, "map");
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:960:2: ( ( ( 'by' )=>otherlv_5= 'by' ) ( (lv_mapping_6_0= ruleDataType ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:960:3: ( ( 'by' )=>otherlv_5= 'by' ) ( (lv_mapping_6_0= ruleDataType ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:960:3: ( ( 'by' )=>otherlv_5= 'by' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:960:4: ( 'by' )=>otherlv_5= 'by'
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleDataCollectionType2019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDataCollectionTypeAccess().getByKeyword_4_1_0());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:965:2: ( (lv_mapping_6_0= ruleDataType ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:966:1: (lv_mapping_6_0= ruleDataType )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:966:1: (lv_mapping_6_0= ruleDataType )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:967:3: lv_mapping_6_0= ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataCollectionTypeAccess().getMappingDataTypeParserRuleCall_4_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataType_in_ruleDataCollectionType2041);
                    lv_mapping_6_0=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataCollectionTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"mapping",
                              		lv_mapping_6_0, 
                              		"DataType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleDataCollectionType"


    // $ANTLR start "entryRuleDataComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:991:1: entryRuleDataComponent returns [EObject current=null] : iv_ruleDataComponent= ruleDataComponent EOF ;
    public final EObject entryRuleDataComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataComponent = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:992:2: (iv_ruleDataComponent= ruleDataComponent EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:993:2: iv_ruleDataComponent= ruleDataComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataComponentRule()); 
            }
            pushFollow(FOLLOW_ruleDataComponent_in_entryRuleDataComponent2079);
            iv_ruleDataComponent=ruleDataComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataComponent2089); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataComponent"


    // $ANTLR start "ruleDataComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1000:1: ruleDataComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleDataComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1003:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1004:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1004:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1004:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1004:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1005:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1005:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1006:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataComponent2131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getDataComponentAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataComponentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleDataComponent2148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataComponentAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1026:1: ( (lv_type_2_0= ruleDataType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1027:1: (lv_type_2_0= ruleDataType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1027:1: (lv_type_2_0= ruleDataType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1028:3: lv_type_2_0= ruleDataType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataComponentAccess().getTypeDataTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataType_in_ruleDataComponent2169);
            lv_type_2_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataComponentRule());
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
    // $ANTLR end "ruleDataComponent"


    // $ANTLR start "entryRuleInteractorTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1052:1: entryRuleInteractorTypeDefinition returns [EObject current=null] : iv_ruleInteractorTypeDefinition= ruleInteractorTypeDefinition EOF ;
    public final EObject entryRuleInteractorTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorTypeDefinition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1053:2: (iv_ruleInteractorTypeDefinition= ruleInteractorTypeDefinition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1054:2: iv_ruleInteractorTypeDefinition= ruleInteractorTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorTypeDefinition_in_entryRuleInteractorTypeDefinition2205);
            iv_ruleInteractorTypeDefinition=ruleInteractorTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorTypeDefinition2215); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorTypeDefinition"


    // $ANTLR start "ruleInteractorTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1061:1: ruleInteractorTypeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActor ) ) | ( (lv_data_4_0= ruleInteractorData ) ) | ( (lv_component_5_0= ruleInteractorComponent ) ) | ( (lv_behavior_6_0= ruleInteractorBehavior ) ) )* ) ;
    public final EObject ruleInteractorTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_actor_3_0 = null;

        EObject lv_data_4_0 = null;

        EObject lv_component_5_0 = null;

        EObject lv_behavior_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1064:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActor ) ) | ( (lv_data_4_0= ruleInteractorData ) ) | ( (lv_component_5_0= ruleInteractorComponent ) ) | ( (lv_behavior_6_0= ruleInteractorBehavior ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1065:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActor ) ) | ( (lv_data_4_0= ruleInteractorData ) ) | ( (lv_component_5_0= ruleInteractorComponent ) ) | ( (lv_behavior_6_0= ruleInteractorBehavior ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1065:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActor ) ) | ( (lv_data_4_0= ruleInteractorData ) ) | ( (lv_component_5_0= ruleInteractorComponent ) ) | ( (lv_behavior_6_0= ruleInteractorBehavior ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1065:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActor ) ) | ( (lv_data_4_0= ruleInteractorData ) ) | ( (lv_component_5_0= ruleInteractorComponent ) ) | ( (lv_behavior_6_0= ruleInteractorBehavior ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1065:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1066:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1066:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1067:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorTypeDefinition2257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getInteractorTypeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorTypeDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleInteractorTypeDefinition2274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractorTypeDefinitionAccess().getInteractorKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInteractorTypeDefinition2286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorTypeDefinitionAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1091:1: ( ( (lv_actor_3_0= ruleInteractorActor ) ) | ( (lv_data_4_0= ruleInteractorData ) ) | ( (lv_component_5_0= ruleInteractorComponent ) ) | ( (lv_behavior_6_0= ruleInteractorBehavior ) ) )*
            loop15:
            do {
                int alt15=5;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==12) ) {
                        switch ( input.LA(3) ) {
                        case 13:
                        case 14:
                            {
                            alt15=1;
                            }
                            break;
                        case RULE_ID:
                            {
                            switch ( input.LA(4) ) {
                            case 35:
                                {
                                alt15=3;
                                }
                                break;
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 39:
                            case 40:
                            case 41:
                                {
                                alt15=2;
                                }
                                break;
                            case 11:
                                {
                                alt15=1;
                                }
                                break;

                            }

                            }
                            break;
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            {
                            alt15=2;
                            }
                            break;

                        }

                    }


                }
                else if ( (LA15_0==51||LA15_0==53) ) {
                    alt15=4;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1091:2: ( (lv_actor_3_0= ruleInteractorActor ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1091:2: ( (lv_actor_3_0= ruleInteractorActor ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1092:1: (lv_actor_3_0= ruleInteractorActor )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1092:1: (lv_actor_3_0= ruleInteractorActor )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1093:3: lv_actor_3_0= ruleInteractorActor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorTypeDefinitionAccess().getActorInteractorActorParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorActor_in_ruleInteractorTypeDefinition2308);
            	    lv_actor_3_0=ruleInteractorActor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actor",
            	              		lv_actor_3_0, 
            	              		"InteractorActor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1110:6: ( (lv_data_4_0= ruleInteractorData ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1110:6: ( (lv_data_4_0= ruleInteractorData ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1111:1: (lv_data_4_0= ruleInteractorData )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1111:1: (lv_data_4_0= ruleInteractorData )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1112:3: lv_data_4_0= ruleInteractorData
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorTypeDefinitionAccess().getDataInteractorDataParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorData_in_ruleInteractorTypeDefinition2335);
            	    lv_data_4_0=ruleInteractorData();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"data",
            	              		lv_data_4_0, 
            	              		"InteractorData");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1129:6: ( (lv_component_5_0= ruleInteractorComponent ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1129:6: ( (lv_component_5_0= ruleInteractorComponent ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1130:1: (lv_component_5_0= ruleInteractorComponent )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1130:1: (lv_component_5_0= ruleInteractorComponent )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1131:3: lv_component_5_0= ruleInteractorComponent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorTypeDefinitionAccess().getComponentInteractorComponentParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorComponent_in_ruleInteractorTypeDefinition2362);
            	    lv_component_5_0=ruleInteractorComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"component",
            	              		lv_component_5_0, 
            	              		"InteractorComponent");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1148:6: ( (lv_behavior_6_0= ruleInteractorBehavior ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1148:6: ( (lv_behavior_6_0= ruleInteractorBehavior ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1149:1: (lv_behavior_6_0= ruleInteractorBehavior )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1149:1: (lv_behavior_6_0= ruleInteractorBehavior )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1150:3: lv_behavior_6_0= ruleInteractorBehavior
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorTypeDefinitionAccess().getBehaviorInteractorBehaviorParserRuleCall_3_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorBehavior_in_ruleInteractorTypeDefinition2389);
            	    lv_behavior_6_0=ruleInteractorBehavior();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"behavior",
            	              		lv_behavior_6_0, 
            	              		"InteractorBehavior");
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
    // $ANTLR end "ruleInteractorTypeDefinition"


    // $ANTLR start "entryRuleInteractorType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1174:1: entryRuleInteractorType returns [EObject current=null] : iv_ruleInteractorType= ruleInteractorType EOF ;
    public final EObject entryRuleInteractorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1175:2: (iv_ruleInteractorType= ruleInteractorType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1176:2: iv_ruleInteractorType= ruleInteractorType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorTypeRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorType_in_entryRuleInteractorType2427);
            iv_ruleInteractorType=ruleInteractorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorType2437); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorType"


    // $ANTLR start "ruleInteractorType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1183:1: ruleInteractorType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleInteractorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1186:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1187:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1187:1: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1188:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1188:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1189:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorTypeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorType2481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getInteractorTypeAccess().getCustomInteractorTypeDefinitionCrossReference_0()); 
              	
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
    // $ANTLR end "ruleInteractorType"


    // $ANTLR start "entryRuleInteractorActor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1208:1: entryRuleInteractorActor returns [EObject current=null] : iv_ruleInteractorActor= ruleInteractorActor EOF ;
    public final EObject entryRuleInteractorActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorActor = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1209:2: (iv_ruleInteractorActor= ruleInteractorActor EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1210:2: iv_ruleInteractorActor= ruleInteractorActor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorActorRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorActor_in_entryRuleInteractorActor2516);
            iv_ruleInteractorActor=ruleInteractorActor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorActor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorActor2526); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorActor"


    // $ANTLR start "ruleInteractorActor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1217:1: ruleInteractorActor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) otherlv_3= 'actor' ) ;
    public final EObject ruleInteractorActor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1220:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) otherlv_3= 'actor' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1221:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) otherlv_3= 'actor' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1221:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) otherlv_3= 'actor' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1221:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) otherlv_3= 'actor'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1221:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1222:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1222:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1223:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorActor2568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getInteractorActorAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorActorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInteractorActor2585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractorActorAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1243:1: ( (lv_type_2_0= ruleActorType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1244:1: (lv_type_2_0= ruleActorType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1244:1: (lv_type_2_0= ruleActorType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1245:3: lv_type_2_0= ruleActorType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorActorAccess().getTypeActorTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActorType_in_ruleInteractorActor2606);
            lv_type_2_0=ruleActorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorActorRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ActorType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleInteractorActor2618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInteractorActorAccess().getActorKeyword_3());
                  
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
    // $ANTLR end "ruleInteractorActor"


    // $ANTLR start "entryRuleInteractorData"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1273:1: entryRuleInteractorData returns [EObject current=null] : iv_ruleInteractorData= ruleInteractorData EOF ;
    public final EObject entryRuleInteractorData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorData = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1274:2: (iv_ruleInteractorData= ruleInteractorData EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1275:2: iv_ruleInteractorData= ruleInteractorData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorDataRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorData_in_entryRuleInteractorData2654);
            iv_ruleInteractorData=ruleInteractorData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorData; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorData2664); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorData"


    // $ANTLR start "ruleInteractorData"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1282:1: ruleInteractorData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleInteractorDataComponentMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) ) )* ) ;
    public final EObject ruleInteractorData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_mode_3_0 = null;

        EObject lv_source_5_0 = null;

        EObject lv_destinations_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1285:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleInteractorDataComponentMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1286:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleInteractorDataComponentMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1286:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleInteractorDataComponentMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1286:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleInteractorDataComponentMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1286:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1287:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1287:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1288:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorData2706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getInteractorDataAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorDataRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInteractorData2723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractorDataAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1308:1: ( (lv_type_2_0= ruleDataType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1309:1: (lv_type_2_0= ruleDataType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1309:1: (lv_type_2_0= ruleDataType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1310:3: lv_type_2_0= ruleDataType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorDataAccess().getTypeDataTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataType_in_ruleInteractorData2744);
            lv_type_2_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorDataRule());
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1326:2: ( (lv_mode_3_0= ruleInteractorDataComponentMode ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1327:1: (lv_mode_3_0= ruleInteractorDataComponentMode )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1327:1: (lv_mode_3_0= ruleInteractorDataComponentMode )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1328:3: lv_mode_3_0= ruleInteractorDataComponentMode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorDataAccess().getModeInteractorDataComponentModeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorDataComponentMode_in_ruleInteractorData2765);
            lv_mode_3_0=ruleInteractorDataComponentMode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorDataRule());
              	        }
                     		set(
                     			current, 
                     			"mode",
                      		lv_mode_3_0, 
                      		"InteractorDataComponentMode");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1344:2: (otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1344:4: otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleInteractorData2778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInteractorDataAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1348:1: ( (lv_source_5_0= ruleInteractorSignalAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1349:1: (lv_source_5_0= ruleInteractorSignalAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1349:1: (lv_source_5_0= ruleInteractorSignalAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1350:3: lv_source_5_0= ruleInteractorSignalAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorDataAccess().getSourceInteractorSignalAliasParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorData2799);
                    lv_source_5_0=ruleInteractorSignalAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorDataRule());
                      	        }
                             		set(
                             			current, 
                             			"source",
                              		lv_source_5_0, 
                              		"InteractorSignalAlias");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1366:4: (otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1366:6: otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) )
            	    {
            	    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleInteractorData2814); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getInteractorDataAccess().getToKeyword_5_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1370:1: ( (lv_destinations_7_0= ruleInteractorSignalAlias ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1371:1: (lv_destinations_7_0= ruleInteractorSignalAlias )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1371:1: (lv_destinations_7_0= ruleInteractorSignalAlias )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1372:3: lv_destinations_7_0= ruleInteractorSignalAlias
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorDataAccess().getDestinationsInteractorSignalAliasParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorData2835);
            	    lv_destinations_7_0=ruleInteractorSignalAlias();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorDataRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"destinations",
            	              		lv_destinations_7_0, 
            	              		"InteractorSignalAlias");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleInteractorData"


    // $ANTLR start "entryRuleInteractorSignalAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1396:1: entryRuleInteractorSignalAlias returns [EObject current=null] : iv_ruleInteractorSignalAlias= ruleInteractorSignalAlias EOF ;
    public final EObject entryRuleInteractorSignalAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorSignalAlias = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1397:2: (iv_ruleInteractorSignalAlias= ruleInteractorSignalAlias EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1398:2: iv_ruleInteractorSignalAlias= ruleInteractorSignalAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorSignalAliasRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorSignalAlias_in_entryRuleInteractorSignalAlias2873);
            iv_ruleInteractorSignalAlias=ruleInteractorSignalAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorSignalAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorSignalAlias2883); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorSignalAlias"


    // $ANTLR start "ruleInteractorSignalAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1405:1: ruleInteractorSignalAlias returns [EObject current=null] : ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleInteractorSignalAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_source_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1408:28: ( ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1409:1: ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1409:1: ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1409:2: ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1409:2: ( (lv_source_0_0= ruleAccessibleEntity ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1410:1: (lv_source_0_0= ruleAccessibleEntity )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1410:1: (lv_source_0_0= ruleAccessibleEntity )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1411:3: lv_source_0_0= ruleAccessibleEntity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorSignalAliasAccess().getSourceAccessibleEntityParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAccessibleEntity_in_ruleInteractorSignalAlias2929);
            lv_source_0_0=ruleAccessibleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorSignalAliasRule());
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1427:2: (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1427:4: otherlv_1= 'as' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleInteractorSignalAlias2942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getInteractorSignalAliasAccess().getAsKeyword_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1431:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1432:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1432:1: (otherlv_2= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1433:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorSignalAliasRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorSignalAlias2962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getInteractorSignalAliasAccess().getAliasInteractorDataCrossReference_1_1_0()); 
                      	
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
    // $ANTLR end "ruleInteractorSignalAlias"


    // $ANTLR start "entryRuleInteractorDataComponentMode"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1452:1: entryRuleInteractorDataComponentMode returns [String current=null] : iv_ruleInteractorDataComponentMode= ruleInteractorDataComponentMode EOF ;
    public final String entryRuleInteractorDataComponentMode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteractorDataComponentMode = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1453:2: (iv_ruleInteractorDataComponentMode= ruleInteractorDataComponentMode EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1454:2: iv_ruleInteractorDataComponentMode= ruleInteractorDataComponentMode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorDataComponentModeRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorDataComponentMode_in_entryRuleInteractorDataComponentMode3001);
            iv_ruleInteractorDataComponentMode=ruleInteractorDataComponentMode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorDataComponentMode.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorDataComponentMode3012); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorDataComponentMode"


    // $ANTLR start "ruleInteractorDataComponentMode"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1461:1: ruleInteractorDataComponentMode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'event' | kw= 'flow' | kw= 'constant' ) ;
    public final AntlrDatatypeRuleToken ruleInteractorDataComponentMode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1464:28: ( (kw= 'event' | kw= 'flow' | kw= 'constant' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1465:1: (kw= 'event' | kw= 'flow' | kw= 'constant' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1465:1: (kw= 'event' | kw= 'flow' | kw= 'constant' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt19=1;
                }
                break;
            case 40:
                {
                alt19=2;
                }
                break;
            case 41:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1466:2: kw= 'event'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleInteractorDataComponentMode3050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInteractorDataComponentModeAccess().getEventKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1473:2: kw= 'flow'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleInteractorDataComponentMode3069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInteractorDataComponentModeAccess().getFlowKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1480:2: kw= 'constant'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleInteractorDataComponentMode3088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInteractorDataComponentModeAccess().getConstantKeyword_2()); 
                          
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
    // $ANTLR end "ruleInteractorDataComponentMode"


    // $ANTLR start "entryRuleInteractorComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1493:1: entryRuleInteractorComponent returns [EObject current=null] : iv_ruleInteractorComponent= ruleInteractorComponent EOF ;
    public final EObject entryRuleInteractorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorComponent = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1494:2: (iv_ruleInteractorComponent= ruleInteractorComponent EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1495:2: iv_ruleInteractorComponent= ruleInteractorComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorComponentRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorComponent_in_entryRuleInteractorComponent3128);
            iv_ruleInteractorComponent=ruleInteractorComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorComponent3138); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorComponent"


    // $ANTLR start "ruleInteractorComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1502:1: ruleInteractorComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleInteractorType ) ) otherlv_3= 'interactor' (otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )* )? ) ;
    public final EObject ruleInteractorComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_2_0 = null;

        EObject lv_actors_5_0 = null;

        EObject lv_actors_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1505:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleInteractorType ) ) otherlv_3= 'interactor' (otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )* )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1506:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleInteractorType ) ) otherlv_3= 'interactor' (otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )* )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1506:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleInteractorType ) ) otherlv_3= 'interactor' (otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )* )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1506:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleInteractorType ) ) otherlv_3= 'interactor' (otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )* )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1506:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1507:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1507:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1508:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorComponent3180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getInteractorComponentAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorComponentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInteractorComponent3197); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractorComponentAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1528:1: ( (lv_type_2_0= ruleInteractorType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1529:1: (lv_type_2_0= ruleInteractorType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1529:1: (lv_type_2_0= ruleInteractorType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1530:3: lv_type_2_0= ruleInteractorType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorComponentAccess().getTypeInteractorTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorType_in_ruleInteractorComponent3218);
            lv_type_2_0=ruleInteractorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorComponentRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"InteractorType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleInteractorComponent3230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInteractorComponentAccess().getInteractorKeyword_3());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1550:1: (otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1550:3: otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )*
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleInteractorComponent3243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInteractorComponentAccess().getWithKeyword_4_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1554:1: ( (lv_actors_5_0= ruleActorAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1555:1: (lv_actors_5_0= ruleActorAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1555:1: (lv_actors_5_0= ruleActorAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1556:3: lv_actors_5_0= ruleActorAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorComponentAccess().getActorsActorAliasParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleActorAlias_in_ruleInteractorComponent3264);
                    lv_actors_5_0=ruleActorAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorComponentRule());
                      	        }
                             		add(
                             			current, 
                             			"actors",
                              		lv_actors_5_0, 
                              		"ActorAlias");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1572:2: (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==18) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1572:4: otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleInteractorComponent3277); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getInteractorComponentAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1576:1: ( (lv_actors_7_0= ruleActorAlias ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1577:1: (lv_actors_7_0= ruleActorAlias )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1577:1: (lv_actors_7_0= ruleActorAlias )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1578:3: lv_actors_7_0= ruleActorAlias
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInteractorComponentAccess().getActorsActorAliasParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleActorAlias_in_ruleInteractorComponent3298);
                    	    lv_actors_7_0=ruleActorAlias();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInteractorComponentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"actors",
                    	              		lv_actors_7_0, 
                    	              		"ActorAlias");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
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
    // $ANTLR end "ruleInteractorComponent"


    // $ANTLR start "entryRuleAccessibleEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1602:1: entryRuleAccessibleEntity returns [EObject current=null] : iv_ruleAccessibleEntity= ruleAccessibleEntity EOF ;
    public final EObject entryRuleAccessibleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessibleEntity = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1603:2: (iv_ruleAccessibleEntity= ruleAccessibleEntity EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1604:2: iv_ruleAccessibleEntity= ruleAccessibleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessibleEntityRule()); 
            }
            pushFollow(FOLLOW_ruleAccessibleEntity_in_entryRuleAccessibleEntity3338);
            iv_ruleAccessibleEntity=ruleAccessibleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessibleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessibleEntity3348); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1611:1: ruleAccessibleEntity returns [EObject current=null] : ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAccessibleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_generic_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1614:28: ( ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1615:1: ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1615:1: ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=43 && LA22_0<=49)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1615:2: ( (lv_generic_0_0= ruleGenericEntity ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1615:2: ( (lv_generic_0_0= ruleGenericEntity ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1616:1: (lv_generic_0_0= ruleGenericEntity )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1616:1: (lv_generic_0_0= ruleGenericEntity )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1617:3: lv_generic_0_0= ruleGenericEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAccessibleEntityAccess().getGenericGenericEntityParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGenericEntity_in_ruleAccessibleEntity3394);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1634:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1634:6: ( (otherlv_1= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1635:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1635:1: (otherlv_1= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1636:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAccessibleEntityRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAccessibleEntity3420); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1655:1: entryRuleGenericEntity returns [String current=null] : iv_ruleGenericEntity= ruleGenericEntity EOF ;
    public final String entryRuleGenericEntity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGenericEntity = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1656:2: (iv_ruleGenericEntity= ruleGenericEntity EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1657:2: iv_ruleGenericEntity= ruleGenericEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenericEntityRule()); 
            }
            pushFollow(FOLLOW_ruleGenericEntity_in_entryRuleGenericEntity3457);
            iv_ruleGenericEntity=ruleGenericEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenericEntity.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericEntity3468); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1664:1: ruleGenericEntity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' ) ;
    public final AntlrDatatypeRuleToken ruleGenericEntity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1667:28: ( (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1668:1: (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1668:1: (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' )
            int alt23=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt23=1;
                }
                break;
            case 44:
                {
                alt23=2;
                }
                break;
            case 45:
                {
                alt23=3;
                }
                break;
            case 46:
                {
                alt23=4;
                }
                break;
            case 47:
                {
                alt23=5;
                }
                break;
            case 48:
                {
                alt23=6;
                }
                break;
            case 49:
                {
                alt23=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1669:2: kw= 'any'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleGenericEntity3506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getAnyKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1676:2: kw= 'self'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleGenericEntity3525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getSelfKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1683:2: kw= 'other'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleGenericEntity3544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getOtherKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1690:2: kw= 'parent'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleGenericEntity3563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getParentKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1697:2: kw= 'child'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleGenericEntity3582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getChildKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1704:2: kw= 'all'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleGenericEntity3601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getAllKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1711:2: kw= 'actors'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleGenericEntity3620); if (state.failed) return current;
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


    // $ANTLR start "entryRuleActorAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1726:1: entryRuleActorAlias returns [EObject current=null] : iv_ruleActorAlias= ruleActorAlias EOF ;
    public final EObject entryRuleActorAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorAlias = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1727:2: (iv_ruleActorAlias= ruleActorAlias EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1728:2: iv_ruleActorAlias= ruleActorAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorAliasRule()); 
            }
            pushFollow(FOLLOW_ruleActorAlias_in_entryRuleActorAlias3662);
            iv_ruleActorAlias=ruleActorAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorAlias3672); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1735:1: ruleActorAlias returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleActorAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1738:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1739:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1739:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1739:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1739:2: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1740:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1740:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1741:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActorAliasRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorAlias3717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getActorAliasAccess().getSourceInteractorActorCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleActorAlias3729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorAliasAccess().getAsKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1756:1: ( (otherlv_2= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1757:1: (otherlv_2= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1757:1: (otherlv_2= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1758:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActorAliasRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorAlias3749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getActorAliasAccess().getAliasInteractorActorCrossReference_2_0()); 
              	
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


    // $ANTLR start "entryRuleInteractorSignalReception"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1777:1: entryRuleInteractorSignalReception returns [EObject current=null] : iv_ruleInteractorSignalReception= ruleInteractorSignalReception EOF ;
    public final EObject entryRuleInteractorSignalReception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorSignalReception = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1778:2: (iv_ruleInteractorSignalReception= ruleInteractorSignalReception EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1779:2: iv_ruleInteractorSignalReception= ruleInteractorSignalReception EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorSignalReceptionRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorSignalReception_in_entryRuleInteractorSignalReception3785);
            iv_ruleInteractorSignalReception=ruleInteractorSignalReception();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorSignalReception; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorSignalReception3795); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorSignalReception"


    // $ANTLR start "ruleInteractorSignalReception"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1786:1: ruleInteractorSignalReception returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) ) ;
    public final EObject ruleInteractorSignalReception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_init_3_0=null;
        EObject lv_source_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1789:28: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1790:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1790:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==50) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1790:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1790:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1790:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1790:3: ( (otherlv_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1791:1: (otherlv_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1791:1: (otherlv_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1792:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorSignalReceptionRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorSignalReception3841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getInteractorSignalReceptionAccess().getInstanceInteractorDataCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1803:2: (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==36) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1803:4: otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) )
                            {
                            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleInteractorSignalReception3854); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getInteractorSignalReceptionAccess().getFromKeyword_0_1_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1807:1: ( (lv_source_2_0= ruleInteractorSignalAlias ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1808:1: (lv_source_2_0= ruleInteractorSignalAlias )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1808:1: (lv_source_2_0= ruleInteractorSignalAlias )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1809:3: lv_source_2_0= ruleInteractorSignalAlias
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInteractorSignalReceptionAccess().getSourceInteractorSignalAliasParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorSignalReception3875);
                            lv_source_2_0=ruleInteractorSignalAlias();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInteractorSignalReceptionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"source",
                                      		lv_source_2_0, 
                                      		"InteractorSignalAlias");
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1826:6: ( (lv_init_3_0= 'init' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1826:6: ( (lv_init_3_0= 'init' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1827:1: (lv_init_3_0= 'init' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1827:1: (lv_init_3_0= 'init' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1828:3: lv_init_3_0= 'init'
                    {
                    lv_init_3_0=(Token)match(input,50,FOLLOW_50_in_ruleInteractorSignalReception3902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_init_3_0, grammarAccess.getInteractorSignalReceptionAccess().getInitInitKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorSignalReceptionRule());
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
    // $ANTLR end "ruleInteractorSignalReception"


    // $ANTLR start "entryRuleInteractorSignalEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1849:1: entryRuleInteractorSignalEmission returns [EObject current=null] : iv_ruleInteractorSignalEmission= ruleInteractorSignalEmission EOF ;
    public final EObject entryRuleInteractorSignalEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorSignalEmission = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1850:2: (iv_ruleInteractorSignalEmission= ruleInteractorSignalEmission EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1851:2: iv_ruleInteractorSignalEmission= ruleInteractorSignalEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorSignalEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorSignalEmission_in_entryRuleInteractorSignalEmission3951);
            iv_ruleInteractorSignalEmission=ruleInteractorSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorSignalEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorSignalEmission3961); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorSignalEmission"


    // $ANTLR start "ruleInteractorSignalEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1858:1: ruleInteractorSignalEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) ) )? ) ;
    public final EObject ruleInteractorSignalEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_destination_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1861:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1862:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1862:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1862:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1862:2: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1863:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1863:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1864:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorSignalEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorSignalEmission4006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getInteractorSignalEmissionAccess().getInstanceInteractorDataCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1875:2: (otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1875:4: otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleInteractorSignalEmission4019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getInteractorSignalEmissionAccess().getToKeyword_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1879:1: ( (lv_destination_2_0= ruleInteractorSignalAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1880:1: (lv_destination_2_0= ruleInteractorSignalAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1880:1: (lv_destination_2_0= ruleInteractorSignalAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1881:3: lv_destination_2_0= ruleInteractorSignalAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorSignalEmissionAccess().getDestinationInteractorSignalAliasParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorSignalEmission4040);
                    lv_destination_2_0=ruleInteractorSignalAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorSignalEmissionRule());
                      	        }
                             		set(
                             			current, 
                             			"destination",
                              		lv_destination_2_0, 
                              		"InteractorSignalAlias");
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
    // $ANTLR end "ruleInteractorSignalEmission"


    // $ANTLR start "entryRuleInteractorBehavior"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1905:1: entryRuleInteractorBehavior returns [EObject current=null] : iv_ruleInteractorBehavior= ruleInteractorBehavior EOF ;
    public final EObject entryRuleInteractorBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehavior = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1906:2: (iv_ruleInteractorBehavior= ruleInteractorBehavior EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1907:2: iv_ruleInteractorBehavior= ruleInteractorBehavior EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehavior_in_entryRuleInteractorBehavior4078);
            iv_ruleInteractorBehavior=ruleInteractorBehavior();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehavior; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehavior4088); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehavior"


    // $ANTLR start "ruleInteractorBehavior"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1914:1: ruleInteractorBehavior returns [EObject current=null] : ( ( (lv_cause_0_0= ruleInteractorBehaviorCause ) ) otherlv_1= ':' ( (lv_effect_2_0= ruleInteractorBehaviorEffect ) )+ ) ;
    public final EObject ruleInteractorBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cause_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1917:28: ( ( ( (lv_cause_0_0= ruleInteractorBehaviorCause ) ) otherlv_1= ':' ( (lv_effect_2_0= ruleInteractorBehaviorEffect ) )+ ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1918:1: ( ( (lv_cause_0_0= ruleInteractorBehaviorCause ) ) otherlv_1= ':' ( (lv_effect_2_0= ruleInteractorBehaviorEffect ) )+ )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1918:1: ( ( (lv_cause_0_0= ruleInteractorBehaviorCause ) ) otherlv_1= ':' ( (lv_effect_2_0= ruleInteractorBehaviorEffect ) )+ )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1918:2: ( (lv_cause_0_0= ruleInteractorBehaviorCause ) ) otherlv_1= ':' ( (lv_effect_2_0= ruleInteractorBehaviorEffect ) )+
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1918:2: ( (lv_cause_0_0= ruleInteractorBehaviorCause ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1919:1: (lv_cause_0_0= ruleInteractorBehaviorCause )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1919:1: (lv_cause_0_0= ruleInteractorBehaviorCause )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1920:3: lv_cause_0_0= ruleInteractorBehaviorCause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorAccess().getCauseInteractorBehaviorCauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorCause_in_ruleInteractorBehavior4134);
            lv_cause_0_0=ruleInteractorBehaviorCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorRule());
              	        }
                     		set(
                     			current, 
                     			"cause",
                      		lv_cause_0_0, 
                      		"InteractorBehaviorCause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInteractorBehavior4146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractorBehaviorAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1940:1: ( (lv_effect_2_0= ruleInteractorBehaviorEffect ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30||LA27_0==54||LA27_0==56) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1941:1: (lv_effect_2_0= ruleInteractorBehaviorEffect )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1941:1: (lv_effect_2_0= ruleInteractorBehaviorEffect )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1942:3: lv_effect_2_0= ruleInteractorBehaviorEffect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorBehaviorAccess().getEffectInteractorBehaviorEffectParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorBehaviorEffect_in_ruleInteractorBehavior4167);
            	    lv_effect_2_0=ruleInteractorBehaviorEffect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"effect",
            	              		lv_effect_2_0, 
            	              		"InteractorBehaviorEffect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // $ANTLR end "ruleInteractorBehavior"


    // $ANTLR start "entryRuleInteractorBehaviorCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1966:1: entryRuleInteractorBehaviorCause returns [EObject current=null] : iv_ruleInteractorBehaviorCause= ruleInteractorBehaviorCause EOF ;
    public final EObject entryRuleInteractorBehaviorCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1967:2: (iv_ruleInteractorBehaviorCause= ruleInteractorBehaviorCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1968:2: iv_ruleInteractorBehaviorCause= ruleInteractorBehaviorCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorCauseRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorCause_in_entryRuleInteractorBehaviorCause4204);
            iv_ruleInteractorBehaviorCause=ruleInteractorBehaviorCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorCause4214); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorCause"


    // $ANTLR start "ruleInteractorBehaviorCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1975:1: ruleInteractorBehaviorCause returns [EObject current=null] : (this_InteractorBehaviorOnCause_0= ruleInteractorBehaviorOnCause | this_InteractorBehaviorWhenCause_1= ruleInteractorBehaviorWhenCause ) ;
    public final EObject ruleInteractorBehaviorCause() throws RecognitionException {
        EObject current = null;

        EObject this_InteractorBehaviorOnCause_0 = null;

        EObject this_InteractorBehaviorWhenCause_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1978:28: ( (this_InteractorBehaviorOnCause_0= ruleInteractorBehaviorOnCause | this_InteractorBehaviorWhenCause_1= ruleInteractorBehaviorWhenCause ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1979:1: (this_InteractorBehaviorOnCause_0= ruleInteractorBehaviorOnCause | this_InteractorBehaviorWhenCause_1= ruleInteractorBehaviorWhenCause )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1979:1: (this_InteractorBehaviorOnCause_0= ruleInteractorBehaviorOnCause | this_InteractorBehaviorWhenCause_1= ruleInteractorBehaviorWhenCause )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            else if ( (LA28_0==53) ) {
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1980:5: this_InteractorBehaviorOnCause_0= ruleInteractorBehaviorOnCause
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInteractorBehaviorCauseAccess().getInteractorBehaviorOnCauseParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteractorBehaviorOnCause_in_ruleInteractorBehaviorCause4261);
                    this_InteractorBehaviorOnCause_0=ruleInteractorBehaviorOnCause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InteractorBehaviorOnCause_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1990:5: this_InteractorBehaviorWhenCause_1= ruleInteractorBehaviorWhenCause
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInteractorBehaviorCauseAccess().getInteractorBehaviorWhenCauseParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteractorBehaviorWhenCause_in_ruleInteractorBehaviorCause4288);
                    this_InteractorBehaviorWhenCause_1=ruleInteractorBehaviorWhenCause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InteractorBehaviorWhenCause_1; 
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
    // $ANTLR end "ruleInteractorBehaviorCause"


    // $ANTLR start "entryRuleInteractorBehaviorOnCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2006:1: entryRuleInteractorBehaviorOnCause returns [EObject current=null] : iv_ruleInteractorBehaviorOnCause= ruleInteractorBehaviorOnCause EOF ;
    public final EObject entryRuleInteractorBehaviorOnCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorOnCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2007:2: (iv_ruleInteractorBehaviorOnCause= ruleInteractorBehaviorOnCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2008:2: iv_ruleInteractorBehaviorOnCause= ruleInteractorBehaviorOnCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorOnCauseRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorOnCause_in_entryRuleInteractorBehaviorOnCause4323);
            iv_ruleInteractorBehaviorOnCause=ruleInteractorBehaviorOnCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorOnCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorOnCause4333); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorOnCause"


    // $ANTLR start "ruleInteractorBehaviorOnCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2015:1: ruleInteractorBehaviorOnCause returns [EObject current=null] : (otherlv_0= 'on' ( (lv_event_1_0= ruleInteractorSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleInteractorBehaviorOnCause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_event_1_0 = null;

        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2018:28: ( (otherlv_0= 'on' ( (lv_event_1_0= ruleInteractorSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2019:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleInteractorSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2019:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleInteractorSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2019:3: otherlv_0= 'on' ( (lv_event_1_0= ruleInteractorSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleInteractorBehaviorOnCause4370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorBehaviorOnCauseAccess().getOnKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2023:1: ( (lv_event_1_0= ruleInteractorSignalReception ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2024:1: (lv_event_1_0= ruleInteractorSignalReception )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2024:1: (lv_event_1_0= ruleInteractorSignalReception )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2025:3: lv_event_1_0= ruleInteractorSignalReception
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorOnCauseAccess().getEventInteractorSignalReceptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorSignalReception_in_ruleInteractorBehaviorOnCause4391);
            lv_event_1_0=ruleInteractorSignalReception();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorOnCauseRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_1_0, 
                      		"InteractorSignalReception");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2041:2: (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2041:4: otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleInteractorBehaviorOnCause4404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInteractorBehaviorOnCauseAccess().getIfKeyword_2_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2045:1: ( (lv_guard_3_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2046:1: (lv_guard_3_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2046:1: (lv_guard_3_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2047:3: lv_guard_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorBehaviorOnCauseAccess().getGuardExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorOnCause4425);
                    lv_guard_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorOnCauseRule());
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
    // $ANTLR end "ruleInteractorBehaviorOnCause"


    // $ANTLR start "entryRuleInteractorBehaviorWhenCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2071:1: entryRuleInteractorBehaviorWhenCause returns [EObject current=null] : iv_ruleInteractorBehaviorWhenCause= ruleInteractorBehaviorWhenCause EOF ;
    public final EObject entryRuleInteractorBehaviorWhenCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorWhenCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2072:2: (iv_ruleInteractorBehaviorWhenCause= ruleInteractorBehaviorWhenCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2073:2: iv_ruleInteractorBehaviorWhenCause= ruleInteractorBehaviorWhenCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorWhenCauseRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorWhenCause_in_entryRuleInteractorBehaviorWhenCause4463);
            iv_ruleInteractorBehaviorWhenCause=ruleInteractorBehaviorWhenCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorWhenCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorWhenCause4473); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorWhenCause"


    // $ANTLR start "ruleInteractorBehaviorWhenCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2080:1: ruleInteractorBehaviorWhenCause returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleInteractorBehaviorWhenCause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2083:28: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2084:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2084:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2084:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleInteractorBehaviorWhenCause4510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorBehaviorWhenCauseAccess().getWhenKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2088:1: ( (lv_condition_1_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2089:1: (lv_condition_1_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2089:1: (lv_condition_1_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2090:3: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorWhenCauseAccess().getConditionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorWhenCause4531);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorWhenCauseRule());
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2106:2: (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2106:4: otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleInteractorBehaviorWhenCause4544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInteractorBehaviorWhenCauseAccess().getIfKeyword_2_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2110:1: ( (lv_guard_3_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2111:1: (lv_guard_3_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2111:1: (lv_guard_3_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2112:3: lv_guard_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorBehaviorWhenCauseAccess().getGuardExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorWhenCause4565);
                    lv_guard_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorWhenCauseRule());
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
    // $ANTLR end "ruleInteractorBehaviorWhenCause"


    // $ANTLR start "entryRuleInteractorBehaviorEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2136:1: entryRuleInteractorBehaviorEffect returns [EObject current=null] : iv_ruleInteractorBehaviorEffect= ruleInteractorBehaviorEffect EOF ;
    public final EObject entryRuleInteractorBehaviorEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2137:2: (iv_ruleInteractorBehaviorEffect= ruleInteractorBehaviorEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2138:2: iv_ruleInteractorBehaviorEffect= ruleInteractorBehaviorEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorEffectRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorEffect_in_entryRuleInteractorBehaviorEffect4603);
            iv_ruleInteractorBehaviorEffect=ruleInteractorBehaviorEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorEffect4613); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorEffect"


    // $ANTLR start "ruleInteractorBehaviorEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2145:1: ruleInteractorBehaviorEffect returns [EObject current=null] : (this_InteractorBehaviorAlwaysEffect_0= ruleInteractorBehaviorAlwaysEffect | this_InteractorBehaviorSetEffect_1= ruleInteractorBehaviorSetEffect | this_InteractorBehaviorTriggerEffect_2= ruleInteractorBehaviorTriggerEffect ) ;
    public final EObject ruleInteractorBehaviorEffect() throws RecognitionException {
        EObject current = null;

        EObject this_InteractorBehaviorAlwaysEffect_0 = null;

        EObject this_InteractorBehaviorSetEffect_1 = null;

        EObject this_InteractorBehaviorTriggerEffect_2 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2148:28: ( (this_InteractorBehaviorAlwaysEffect_0= ruleInteractorBehaviorAlwaysEffect | this_InteractorBehaviorSetEffect_1= ruleInteractorBehaviorSetEffect | this_InteractorBehaviorTriggerEffect_2= ruleInteractorBehaviorTriggerEffect ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2149:1: (this_InteractorBehaviorAlwaysEffect_0= ruleInteractorBehaviorAlwaysEffect | this_InteractorBehaviorSetEffect_1= ruleInteractorBehaviorSetEffect | this_InteractorBehaviorTriggerEffect_2= ruleInteractorBehaviorTriggerEffect )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2149:1: (this_InteractorBehaviorAlwaysEffect_0= ruleInteractorBehaviorAlwaysEffect | this_InteractorBehaviorSetEffect_1= ruleInteractorBehaviorSetEffect | this_InteractorBehaviorTriggerEffect_2= ruleInteractorBehaviorTriggerEffect )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt31=1;
                }
                break;
            case 30:
                {
                alt31=2;
                }
                break;
            case 56:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2150:5: this_InteractorBehaviorAlwaysEffect_0= ruleInteractorBehaviorAlwaysEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInteractorBehaviorEffectAccess().getInteractorBehaviorAlwaysEffectParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteractorBehaviorAlwaysEffect_in_ruleInteractorBehaviorEffect4660);
                    this_InteractorBehaviorAlwaysEffect_0=ruleInteractorBehaviorAlwaysEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InteractorBehaviorAlwaysEffect_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2160:5: this_InteractorBehaviorSetEffect_1= ruleInteractorBehaviorSetEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInteractorBehaviorEffectAccess().getInteractorBehaviorSetEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteractorBehaviorSetEffect_in_ruleInteractorBehaviorEffect4687);
                    this_InteractorBehaviorSetEffect_1=ruleInteractorBehaviorSetEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InteractorBehaviorSetEffect_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2170:5: this_InteractorBehaviorTriggerEffect_2= ruleInteractorBehaviorTriggerEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInteractorBehaviorEffectAccess().getInteractorBehaviorTriggerEffectParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteractorBehaviorTriggerEffect_in_ruleInteractorBehaviorEffect4714);
                    this_InteractorBehaviorTriggerEffect_2=ruleInteractorBehaviorTriggerEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InteractorBehaviorTriggerEffect_2; 
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
    // $ANTLR end "ruleInteractorBehaviorEffect"


    // $ANTLR start "entryRuleInteractorBehaviorAlwaysEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2186:1: entryRuleInteractorBehaviorAlwaysEffect returns [EObject current=null] : iv_ruleInteractorBehaviorAlwaysEffect= ruleInteractorBehaviorAlwaysEffect EOF ;
    public final EObject entryRuleInteractorBehaviorAlwaysEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorAlwaysEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2187:2: (iv_ruleInteractorBehaviorAlwaysEffect= ruleInteractorBehaviorAlwaysEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2188:2: iv_ruleInteractorBehaviorAlwaysEffect= ruleInteractorBehaviorAlwaysEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorAlwaysEffectRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorAlwaysEffect_in_entryRuleInteractorBehaviorAlwaysEffect4749);
            iv_ruleInteractorBehaviorAlwaysEffect=ruleInteractorBehaviorAlwaysEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorAlwaysEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorAlwaysEffect4759); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorAlwaysEffect"


    // $ANTLR start "ruleInteractorBehaviorAlwaysEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2195:1: ruleInteractorBehaviorAlwaysEffect returns [EObject current=null] : (otherlv_0= 'always' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleInteractorBehaviorAlwaysEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2198:28: ( (otherlv_0= 'always' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2199:1: (otherlv_0= 'always' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2199:1: (otherlv_0= 'always' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2199:3: otherlv_0= 'always' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleInteractorBehaviorAlwaysEffect4796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorBehaviorAlwaysEffectAccess().getAlwaysKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2203:1: ( (lv_target_1_0= ruleInteractorSignalEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2204:1: (lv_target_1_0= ruleInteractorSignalEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2204:1: (lv_target_1_0= ruleInteractorSignalEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2205:3: lv_target_1_0= ruleInteractorSignalEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorAlwaysEffectAccess().getTargetInteractorSignalEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorSignalEmission_in_ruleInteractorBehaviorAlwaysEffect4817);
            lv_target_1_0=ruleInteractorSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorAlwaysEffectRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"InteractorSignalEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleInteractorBehaviorAlwaysEffect4829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorBehaviorAlwaysEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2225:1: ( (lv_value_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2226:1: (lv_value_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2226:1: (lv_value_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2227:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorAlwaysEffectAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorAlwaysEffect4850);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorAlwaysEffectRule());
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
    // $ANTLR end "ruleInteractorBehaviorAlwaysEffect"


    // $ANTLR start "entryRuleInteractorBehaviorSetEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2251:1: entryRuleInteractorBehaviorSetEffect returns [EObject current=null] : iv_ruleInteractorBehaviorSetEffect= ruleInteractorBehaviorSetEffect EOF ;
    public final EObject entryRuleInteractorBehaviorSetEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorSetEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2252:2: (iv_ruleInteractorBehaviorSetEffect= ruleInteractorBehaviorSetEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2253:2: iv_ruleInteractorBehaviorSetEffect= ruleInteractorBehaviorSetEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorSetEffectRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorSetEffect_in_entryRuleInteractorBehaviorSetEffect4886);
            iv_ruleInteractorBehaviorSetEffect=ruleInteractorBehaviorSetEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorSetEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorSetEffect4896); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorSetEffect"


    // $ANTLR start "ruleInteractorBehaviorSetEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2260:1: ruleInteractorBehaviorSetEffect returns [EObject current=null] : (otherlv_0= 'set' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleInteractorBehaviorSetEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2263:28: ( (otherlv_0= 'set' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2264:1: (otherlv_0= 'set' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2264:1: (otherlv_0= 'set' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2264:3: otherlv_0= 'set' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleInteractorBehaviorSetEffect4933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorBehaviorSetEffectAccess().getSetKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2268:1: ( (lv_target_1_0= ruleInteractorSignalEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2269:1: (lv_target_1_0= ruleInteractorSignalEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2269:1: (lv_target_1_0= ruleInteractorSignalEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2270:3: lv_target_1_0= ruleInteractorSignalEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorSetEffectAccess().getTargetInteractorSignalEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorSignalEmission_in_ruleInteractorBehaviorSetEffect4954);
            lv_target_1_0=ruleInteractorSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorSetEffectRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"InteractorSignalEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleInteractorBehaviorSetEffect4966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorBehaviorSetEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2290:1: ( (lv_value_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2291:1: (lv_value_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2291:1: (lv_value_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2292:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorSetEffectAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorSetEffect4987);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorSetEffectRule());
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
    // $ANTLR end "ruleInteractorBehaviorSetEffect"


    // $ANTLR start "entryRuleInteractorBehaviorTriggerEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2316:1: entryRuleInteractorBehaviorTriggerEffect returns [EObject current=null] : iv_ruleInteractorBehaviorTriggerEffect= ruleInteractorBehaviorTriggerEffect EOF ;
    public final EObject entryRuleInteractorBehaviorTriggerEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorTriggerEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2317:2: (iv_ruleInteractorBehaviorTriggerEffect= ruleInteractorBehaviorTriggerEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2318:2: iv_ruleInteractorBehaviorTriggerEffect= ruleInteractorBehaviorTriggerEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorTriggerEffectRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorTriggerEffect_in_entryRuleInteractorBehaviorTriggerEffect5023);
            iv_ruleInteractorBehaviorTriggerEffect=ruleInteractorBehaviorTriggerEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorTriggerEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorTriggerEffect5033); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorTriggerEffect"


    // $ANTLR start "ruleInteractorBehaviorTriggerEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2325:1: ruleInteractorBehaviorTriggerEffect returns [EObject current=null] : (otherlv_0= 'trigger' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleInteractorBehaviorTriggerEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2328:28: ( (otherlv_0= 'trigger' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2329:1: (otherlv_0= 'trigger' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2329:1: (otherlv_0= 'trigger' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2329:3: otherlv_0= 'trigger' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleInteractorBehaviorTriggerEffect5070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorBehaviorTriggerEffectAccess().getTriggerKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2333:1: ( (lv_target_1_0= ruleInteractorSignalEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2334:1: (lv_target_1_0= ruleInteractorSignalEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2334:1: (lv_target_1_0= ruleInteractorSignalEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2335:3: lv_target_1_0= ruleInteractorSignalEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorTriggerEffectAccess().getTargetInteractorSignalEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorSignalEmission_in_ruleInteractorBehaviorTriggerEffect5091);
            lv_target_1_0=ruleInteractorSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorTriggerEffectRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"InteractorSignalEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleInteractorBehaviorTriggerEffect5103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorBehaviorTriggerEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2355:1: ( (lv_value_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2356:1: (lv_value_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2356:1: (lv_value_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2357:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorTriggerEffectAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorTriggerEffect5124);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorTriggerEffectRule());
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
    // $ANTLR end "ruleInteractorBehaviorTriggerEffect"


    // $ANTLR start "entryRuleExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2381:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2382:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2383:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5160);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5170); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2390:1: ruleExpression returns [EObject current=null] : this_ExpressionOr_0= ruleExpressionOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionOr_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2393:28: (this_ExpressionOr_0= ruleExpressionOr )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2395:5: this_ExpressionOr_0= ruleExpressionOr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getExpressionOrParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionOr_in_ruleExpression5216);
            this_ExpressionOr_0=ruleExpressionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionOr_0; 
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


    // $ANTLR start "entryRuleExpressionOr"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2411:1: entryRuleExpressionOr returns [EObject current=null] : iv_ruleExpressionOr= ruleExpressionOr EOF ;
    public final EObject entryRuleExpressionOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionOr = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2412:2: (iv_ruleExpressionOr= ruleExpressionOr EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2413:2: iv_ruleExpressionOr= ruleExpressionOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOrRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionOr_in_entryRuleExpressionOr5250);
            iv_ruleExpressionOr=ruleExpressionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOr5260); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionOr"


    // $ANTLR start "ruleExpressionOr"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2420:1: ruleExpressionOr returns [EObject current=null] : (this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )* ) ;
    public final EObject ruleExpressionOr() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionAnd_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2423:28: ( (this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2424:1: (this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2424:1: (this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2425:5: this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionOrAccess().getExpressionAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionAnd_in_ruleExpressionOr5307);
            this_ExpressionAnd_0=ruleExpressionAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2433:1: ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==57) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred2_InternalLil()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2433:2: ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2433:2: ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2433:3: ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2438:6: ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2438:7: () ( (lv_feature_2_0= ruleExpressionOrOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2438:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2439:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2444:2: ( (lv_feature_2_0= ruleExpressionOrOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2445:1: (lv_feature_2_0= ruleExpressionOrOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2445:1: (lv_feature_2_0= ruleExpressionOrOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2446:3: lv_feature_2_0= ruleExpressionOrOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOrAccess().getFeatureExpressionOrOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionOrOp_in_ruleExpressionOr5356);
            	    lv_feature_2_0=ruleExpressionOrOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionOrOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2462:4: ( (lv_rightOperand_3_0= ruleExpressionAnd ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2463:1: (lv_rightOperand_3_0= ruleExpressionAnd )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2463:1: (lv_rightOperand_3_0= ruleExpressionAnd )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2464:3: lv_rightOperand_3_0= ruleExpressionAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOrAccess().getRightOperandExpressionAndParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionAnd_in_ruleExpressionOr5379);
            	    lv_rightOperand_3_0=ruleExpressionAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionAnd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end "ruleExpressionOr"


    // $ANTLR start "entryRuleExpressionOrOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2488:1: entryRuleExpressionOrOp returns [String current=null] : iv_ruleExpressionOrOp= ruleExpressionOrOp EOF ;
    public final String entryRuleExpressionOrOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionOrOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2489:2: (iv_ruleExpressionOrOp= ruleExpressionOrOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2490:2: iv_ruleExpressionOrOp= ruleExpressionOrOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOrOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionOrOp_in_entryRuleExpressionOrOp5418);
            iv_ruleExpressionOrOp=ruleExpressionOrOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOrOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOrOp5429); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionOrOp"


    // $ANTLR start "ruleExpressionOrOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2497:1: ruleExpressionOrOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'or' ;
    public final AntlrDatatypeRuleToken ruleExpressionOrOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2500:28: (kw= 'or' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2502:2: kw= 'or'
            {
            kw=(Token)match(input,57,FOLLOW_57_in_ruleExpressionOrOp5466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getExpressionOrOpAccess().getOrKeyword()); 
                  
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
    // $ANTLR end "ruleExpressionOrOp"


    // $ANTLR start "entryRuleExpressionAnd"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2515:1: entryRuleExpressionAnd returns [EObject current=null] : iv_ruleExpressionAnd= ruleExpressionAnd EOF ;
    public final EObject entryRuleExpressionAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionAnd = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2516:2: (iv_ruleExpressionAnd= ruleExpressionAnd EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2517:2: iv_ruleExpressionAnd= ruleExpressionAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAndRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionAnd_in_entryRuleExpressionAnd5505);
            iv_ruleExpressionAnd=ruleExpressionAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionAnd5515); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionAnd"


    // $ANTLR start "ruleExpressionAnd"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2524:1: ruleExpressionAnd returns [EObject current=null] : (this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )* ) ;
    public final EObject ruleExpressionAnd() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionEquality_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2527:28: ( (this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2528:1: (this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2528:1: (this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2529:5: this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAndAccess().getExpressionEqualityParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionEquality_in_ruleExpressionAnd5562);
            this_ExpressionEquality_0=ruleExpressionEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionEquality_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2537:1: ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==58) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred3_InternalLil()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2537:2: ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2537:2: ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2537:3: ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2542:6: ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2542:7: () ( (lv_feature_2_0= ruleExpressionAndOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2542:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2543:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2548:2: ( (lv_feature_2_0= ruleExpressionAndOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2549:1: (lv_feature_2_0= ruleExpressionAndOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2549:1: (lv_feature_2_0= ruleExpressionAndOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2550:3: lv_feature_2_0= ruleExpressionAndOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAndAccess().getFeatureExpressionAndOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionAndOp_in_ruleExpressionAnd5611);
            	    lv_feature_2_0=ruleExpressionAndOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionAndOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2566:4: ( (lv_rightOperand_3_0= ruleExpressionEquality ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2567:1: (lv_rightOperand_3_0= ruleExpressionEquality )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2567:1: (lv_rightOperand_3_0= ruleExpressionEquality )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2568:3: lv_rightOperand_3_0= ruleExpressionEquality
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAndAccess().getRightOperandExpressionEqualityParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionEquality_in_ruleExpressionAnd5634);
            	    lv_rightOperand_3_0=ruleExpressionEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionEquality");
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
    // $ANTLR end "ruleExpressionAnd"


    // $ANTLR start "entryRuleExpressionAndOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2592:1: entryRuleExpressionAndOp returns [String current=null] : iv_ruleExpressionAndOp= ruleExpressionAndOp EOF ;
    public final String entryRuleExpressionAndOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionAndOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2593:2: (iv_ruleExpressionAndOp= ruleExpressionAndOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2594:2: iv_ruleExpressionAndOp= ruleExpressionAndOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAndOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionAndOp_in_entryRuleExpressionAndOp5673);
            iv_ruleExpressionAndOp=ruleExpressionAndOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAndOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionAndOp5684); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionAndOp"


    // $ANTLR start "ruleExpressionAndOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2601:1: ruleExpressionAndOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleExpressionAndOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2604:28: (kw= 'and' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2606:2: kw= 'and'
            {
            kw=(Token)match(input,58,FOLLOW_58_in_ruleExpressionAndOp5721); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getExpressionAndOpAccess().getAndKeyword()); 
                  
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
    // $ANTLR end "ruleExpressionAndOp"


    // $ANTLR start "entryRuleExpressionEquality"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2619:1: entryRuleExpressionEquality returns [EObject current=null] : iv_ruleExpressionEquality= ruleExpressionEquality EOF ;
    public final EObject entryRuleExpressionEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionEquality = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2620:2: (iv_ruleExpressionEquality= ruleExpressionEquality EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2621:2: iv_ruleExpressionEquality= ruleExpressionEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionEquality_in_entryRuleExpressionEquality5760);
            iv_ruleExpressionEquality=ruleExpressionEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionEquality; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionEquality5770); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionEquality"


    // $ANTLR start "ruleExpressionEquality"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2628:1: ruleExpressionEquality returns [EObject current=null] : (this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )* ) ;
    public final EObject ruleExpressionEquality() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionCompare_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2631:28: ( (this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2632:1: (this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2632:1: (this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2633:5: this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionEqualityAccess().getExpressionCompareParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionCompare_in_ruleExpressionEquality5817);
            this_ExpressionCompare_0=ruleExpressionCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionCompare_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2641:1: ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==59) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred4_InternalLil()) ) {
                        alt34=1;
                    }


                }
                else if ( (LA34_0==60) ) {
                    int LA34_3 = input.LA(2);

                    if ( (synpred4_InternalLil()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2641:2: ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2641:2: ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2641:3: ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2646:6: ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2646:7: () ( (lv_feature_2_0= ruleExpressionEqualityOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2646:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2647:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2652:2: ( (lv_feature_2_0= ruleExpressionEqualityOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2653:1: (lv_feature_2_0= ruleExpressionEqualityOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2653:1: (lv_feature_2_0= ruleExpressionEqualityOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2654:3: lv_feature_2_0= ruleExpressionEqualityOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionEqualityAccess().getFeatureExpressionEqualityOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionEqualityOp_in_ruleExpressionEquality5866);
            	    lv_feature_2_0=ruleExpressionEqualityOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionEqualityRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionEqualityOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2670:4: ( (lv_rightOperand_3_0= ruleExpressionCompare ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2671:1: (lv_rightOperand_3_0= ruleExpressionCompare )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2671:1: (lv_rightOperand_3_0= ruleExpressionCompare )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2672:3: lv_rightOperand_3_0= ruleExpressionCompare
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionEqualityAccess().getRightOperandExpressionCompareParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionCompare_in_ruleExpressionEquality5889);
            	    lv_rightOperand_3_0=ruleExpressionCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionEqualityRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionCompare");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleExpressionEquality"


    // $ANTLR start "entryRuleExpressionEqualityOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2696:1: entryRuleExpressionEqualityOp returns [String current=null] : iv_ruleExpressionEqualityOp= ruleExpressionEqualityOp EOF ;
    public final String entryRuleExpressionEqualityOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionEqualityOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2697:2: (iv_ruleExpressionEqualityOp= ruleExpressionEqualityOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2698:2: iv_ruleExpressionEqualityOp= ruleExpressionEqualityOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionEqualityOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionEqualityOp_in_entryRuleExpressionEqualityOp5928);
            iv_ruleExpressionEqualityOp=ruleExpressionEqualityOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionEqualityOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionEqualityOp5939); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionEqualityOp"


    // $ANTLR start "ruleExpressionEqualityOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2705:1: ruleExpressionEqualityOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionEqualityOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2708:28: ( (kw= '==' | kw= '!=' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2709:1: (kw= '==' | kw= '!=' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2709:1: (kw= '==' | kw= '!=' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==59) ) {
                alt35=1;
            }
            else if ( (LA35_0==60) ) {
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2710:2: kw= '=='
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleExpressionEqualityOp5977); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionEqualityOpAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2717:2: kw= '!='
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleExpressionEqualityOp5996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionEqualityOpAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
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
    // $ANTLR end "ruleExpressionEqualityOp"


    // $ANTLR start "entryRuleExpressionCompare"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2730:1: entryRuleExpressionCompare returns [EObject current=null] : iv_ruleExpressionCompare= ruleExpressionCompare EOF ;
    public final EObject entryRuleExpressionCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionCompare = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2731:2: (iv_ruleExpressionCompare= ruleExpressionCompare EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2732:2: iv_ruleExpressionCompare= ruleExpressionCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionCompareRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionCompare_in_entryRuleExpressionCompare6036);
            iv_ruleExpressionCompare=ruleExpressionCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionCompare; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionCompare6046); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionCompare"


    // $ANTLR start "ruleExpressionCompare"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2739:1: ruleExpressionCompare returns [EObject current=null] : (this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )* ) ;
    public final EObject ruleExpressionCompare() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionOther_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2742:28: ( (this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2743:1: (this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2743:1: (this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2744:5: this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionCompareAccess().getExpressionOtherParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionOther_in_ruleExpressionCompare6093);
            this_ExpressionOther_0=ruleExpressionOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionOther_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:1: ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )*
            loop36:
            do {
                int alt36=2;
                switch ( input.LA(1) ) {
                case 61:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred5_InternalLil()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 62:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred5_InternalLil()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 63:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred5_InternalLil()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 64:
                    {
                    int LA36_5 = input.LA(2);

                    if ( (synpred5_InternalLil()) ) {
                        alt36=1;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:2: ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:2: ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:3: ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2757:6: ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2757:7: () ( (lv_feature_2_0= ruleExpressionCompareOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2757:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2758:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2763:2: ( (lv_feature_2_0= ruleExpressionCompareOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2764:1: (lv_feature_2_0= ruleExpressionCompareOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2764:1: (lv_feature_2_0= ruleExpressionCompareOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2765:3: lv_feature_2_0= ruleExpressionCompareOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionCompareAccess().getFeatureExpressionCompareOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionCompareOp_in_ruleExpressionCompare6142);
            	    lv_feature_2_0=ruleExpressionCompareOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionCompareRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionCompareOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2781:4: ( (lv_rightOperand_3_0= ruleExpressionOther ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2782:1: (lv_rightOperand_3_0= ruleExpressionOther )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2782:1: (lv_rightOperand_3_0= ruleExpressionOther )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2783:3: lv_rightOperand_3_0= ruleExpressionOther
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionCompareAccess().getRightOperandExpressionOtherParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionOther_in_ruleExpressionCompare6165);
            	    lv_rightOperand_3_0=ruleExpressionOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionCompareRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionOther");
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
    // $ANTLR end "ruleExpressionCompare"


    // $ANTLR start "entryRuleExpressionCompareOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2807:1: entryRuleExpressionCompareOp returns [String current=null] : iv_ruleExpressionCompareOp= ruleExpressionCompareOp EOF ;
    public final String entryRuleExpressionCompareOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionCompareOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2808:2: (iv_ruleExpressionCompareOp= ruleExpressionCompareOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2809:2: iv_ruleExpressionCompareOp= ruleExpressionCompareOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionCompareOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionCompareOp_in_entryRuleExpressionCompareOp6204);
            iv_ruleExpressionCompareOp=ruleExpressionCompareOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionCompareOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionCompareOp6215); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionCompareOp"


    // $ANTLR start "ruleExpressionCompareOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2816:1: ruleExpressionCompareOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionCompareOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2819:28: ( (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2820:1: (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2820:1: (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt37=1;
                }
                break;
            case 62:
                {
                alt37=2;
                }
                break;
            case 63:
                {
                alt37=3;
                }
                break;
            case 64:
                {
                alt37=4;
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2821:2: kw= '<='
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleExpressionCompareOp6253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionCompareOpAccess().getLessThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2828:2: kw= '>='
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleExpressionCompareOp6272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionCompareOpAccess().getGreaterThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2835:2: kw= '<'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleExpressionCompareOp6291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionCompareOpAccess().getLessThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2842:2: kw= '>'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleExpressionCompareOp6310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionCompareOpAccess().getGreaterThanSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleExpressionCompareOp"


    // $ANTLR start "entryRuleExpressionOther"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2855:1: entryRuleExpressionOther returns [EObject current=null] : iv_ruleExpressionOther= ruleExpressionOther EOF ;
    public final EObject entryRuleExpressionOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionOther = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2856:2: (iv_ruleExpressionOther= ruleExpressionOther EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2857:2: iv_ruleExpressionOther= ruleExpressionOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOtherRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionOther_in_entryRuleExpressionOther6350);
            iv_ruleExpressionOther=ruleExpressionOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOther; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOther6360); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionOther"


    // $ANTLR start "ruleExpressionOther"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2864:1: ruleExpressionOther returns [EObject current=null] : (this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )* ) ;
    public final EObject ruleExpressionOther() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionAddition_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2867:28: ( (this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2868:1: (this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2868:1: (this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2869:5: this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionOtherAccess().getExpressionAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionAddition_in_ruleExpressionOther6407);
            this_ExpressionAddition_0=ruleExpressionAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionAddition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2877:1: ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==65) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred6_InternalLil()) ) {
                        alt38=1;
                    }


                }
                else if ( (LA38_0==66) ) {
                    int LA38_3 = input.LA(2);

                    if ( (synpred6_InternalLil()) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2877:2: ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2877:2: ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2877:3: ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2882:6: ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2882:7: () ( (lv_feature_2_0= ruleExpressionOtherOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2882:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2883:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2888:2: ( (lv_feature_2_0= ruleExpressionOtherOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2889:1: (lv_feature_2_0= ruleExpressionOtherOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2889:1: (lv_feature_2_0= ruleExpressionOtherOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2890:3: lv_feature_2_0= ruleExpressionOtherOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOtherAccess().getFeatureExpressionOtherOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionOtherOp_in_ruleExpressionOther6456);
            	    lv_feature_2_0=ruleExpressionOtherOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionOtherRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionOtherOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2906:4: ( (lv_rightOperand_3_0= ruleExpressionAddition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2907:1: (lv_rightOperand_3_0= ruleExpressionAddition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2907:1: (lv_rightOperand_3_0= ruleExpressionAddition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2908:3: lv_rightOperand_3_0= ruleExpressionAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOtherAccess().getRightOperandExpressionAdditionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionAddition_in_ruleExpressionOther6479);
            	    lv_rightOperand_3_0=ruleExpressionAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionOtherRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionAddition");
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
    // $ANTLR end "ruleExpressionOther"


    // $ANTLR start "entryRuleExpressionOtherOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2932:1: entryRuleExpressionOtherOp returns [String current=null] : iv_ruleExpressionOtherOp= ruleExpressionOtherOp EOF ;
    public final String entryRuleExpressionOtherOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionOtherOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2933:2: (iv_ruleExpressionOtherOp= ruleExpressionOtherOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2934:2: iv_ruleExpressionOtherOp= ruleExpressionOtherOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOtherOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionOtherOp_in_entryRuleExpressionOtherOp6518);
            iv_ruleExpressionOtherOp=ruleExpressionOtherOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOtherOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOtherOp6529); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionOtherOp"


    // $ANTLR start "ruleExpressionOtherOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2941:1: ruleExpressionOtherOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<>' | kw= '?:' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionOtherOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2944:28: ( (kw= '<>' | kw= '?:' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2945:1: (kw= '<>' | kw= '?:' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2945:1: (kw= '<>' | kw= '?:' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==65) ) {
                alt39=1;
            }
            else if ( (LA39_0==66) ) {
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2946:2: kw= '<>'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleExpressionOtherOp6567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionOtherOpAccess().getLessThanSignGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2953:2: kw= '?:'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleExpressionOtherOp6586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionOtherOpAccess().getQuestionMarkColonKeyword_1()); 
                          
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
    // $ANTLR end "ruleExpressionOtherOp"


    // $ANTLR start "entryRuleExpressionAddition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2966:1: entryRuleExpressionAddition returns [EObject current=null] : iv_ruleExpressionAddition= ruleExpressionAddition EOF ;
    public final EObject entryRuleExpressionAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionAddition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2967:2: (iv_ruleExpressionAddition= ruleExpressionAddition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2968:2: iv_ruleExpressionAddition= ruleExpressionAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionAddition_in_entryRuleExpressionAddition6626);
            iv_ruleExpressionAddition=ruleExpressionAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionAddition6636); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionAddition"


    // $ANTLR start "ruleExpressionAddition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2975:1: ruleExpressionAddition returns [EObject current=null] : (this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )* ) ;
    public final EObject ruleExpressionAddition() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionMultiplication_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2978:28: ( (this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2979:1: (this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2979:1: (this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2980:5: this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAdditionAccess().getExpressionMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionMultiplication_in_ruleExpressionAddition6683);
            this_ExpressionMultiplication_0=ruleExpressionMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionMultiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2988:1: ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==67) ) {
                    int LA40_2 = input.LA(2);

                    if ( (synpred7_InternalLil()) ) {
                        alt40=1;
                    }


                }
                else if ( (LA40_0==68) ) {
                    int LA40_3 = input.LA(2);

                    if ( (synpred7_InternalLil()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2988:2: ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2988:2: ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2988:3: ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2993:6: ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2993:7: () ( (lv_feature_2_0= ruleExpressionAdditionOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2993:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2994:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2999:2: ( (lv_feature_2_0= ruleExpressionAdditionOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3000:1: (lv_feature_2_0= ruleExpressionAdditionOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3000:1: (lv_feature_2_0= ruleExpressionAdditionOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3001:3: lv_feature_2_0= ruleExpressionAdditionOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAdditionAccess().getFeatureExpressionAdditionOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionAdditionOp_in_ruleExpressionAddition6732);
            	    lv_feature_2_0=ruleExpressionAdditionOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionAdditionOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3017:4: ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3018:1: (lv_rightOperand_3_0= ruleExpressionMultiplication )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3018:1: (lv_rightOperand_3_0= ruleExpressionMultiplication )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3019:3: lv_rightOperand_3_0= ruleExpressionMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAdditionAccess().getRightOperandExpressionMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionMultiplication_in_ruleExpressionAddition6755);
            	    lv_rightOperand_3_0=ruleExpressionMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionMultiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "ruleExpressionAddition"


    // $ANTLR start "entryRuleExpressionAdditionOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3043:1: entryRuleExpressionAdditionOp returns [String current=null] : iv_ruleExpressionAdditionOp= ruleExpressionAdditionOp EOF ;
    public final String entryRuleExpressionAdditionOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionAdditionOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3044:2: (iv_ruleExpressionAdditionOp= ruleExpressionAdditionOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3045:2: iv_ruleExpressionAdditionOp= ruleExpressionAdditionOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAdditionOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionAdditionOp_in_entryRuleExpressionAdditionOp6794);
            iv_ruleExpressionAdditionOp=ruleExpressionAdditionOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAdditionOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionAdditionOp6805); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionAdditionOp"


    // $ANTLR start "ruleExpressionAdditionOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3052:1: ruleExpressionAdditionOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionAdditionOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3055:28: ( (kw= '+' | kw= '-' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3056:1: (kw= '+' | kw= '-' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3056:1: (kw= '+' | kw= '-' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==67) ) {
                alt41=1;
            }
            else if ( (LA41_0==68) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3057:2: kw= '+'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleExpressionAdditionOp6843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionAdditionOpAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3064:2: kw= '-'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleExpressionAdditionOp6862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionAdditionOpAccess().getHyphenMinusKeyword_1()); 
                          
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
    // $ANTLR end "ruleExpressionAdditionOp"


    // $ANTLR start "entryRuleExpressionMultiplication"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3077:1: entryRuleExpressionMultiplication returns [EObject current=null] : iv_ruleExpressionMultiplication= ruleExpressionMultiplication EOF ;
    public final EObject entryRuleExpressionMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMultiplication = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3078:2: (iv_ruleExpressionMultiplication= ruleExpressionMultiplication EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3079:2: iv_ruleExpressionMultiplication= ruleExpressionMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionMultiplication_in_entryRuleExpressionMultiplication6902);
            iv_ruleExpressionMultiplication=ruleExpressionMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionMultiplication6912); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionMultiplication"


    // $ANTLR start "ruleExpressionMultiplication"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3086:1: ruleExpressionMultiplication returns [EObject current=null] : (this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )* ) ;
    public final EObject ruleExpressionMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionUnary_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3089:28: ( (this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3090:1: (this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3090:1: (this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3091:5: this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionMultiplicationAccess().getExpressionUnaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionUnary_in_ruleExpressionMultiplication6959);
            this_ExpressionUnary_0=ruleExpressionUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionUnary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3099:1: ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )*
            loop42:
            do {
                int alt42=2;
                switch ( input.LA(1) ) {
                case 69:
                    {
                    int LA42_2 = input.LA(2);

                    if ( (synpred8_InternalLil()) ) {
                        alt42=1;
                    }


                    }
                    break;
                case 70:
                    {
                    int LA42_3 = input.LA(2);

                    if ( (synpred8_InternalLil()) ) {
                        alt42=1;
                    }


                    }
                    break;
                case 71:
                    {
                    int LA42_4 = input.LA(2);

                    if ( (synpred8_InternalLil()) ) {
                        alt42=1;
                    }


                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3099:2: ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3099:2: ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3099:3: ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3104:6: ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3104:7: () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3104:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3105:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3110:2: ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3111:1: (lv_feature_2_0= ruleExpressionMultiplicationOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3111:1: (lv_feature_2_0= ruleExpressionMultiplicationOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3112:3: lv_feature_2_0= ruleExpressionMultiplicationOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionMultiplicationAccess().getFeatureExpressionMultiplicationOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionMultiplicationOp_in_ruleExpressionMultiplication7008);
            	    lv_feature_2_0=ruleExpressionMultiplicationOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionMultiplicationOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3128:4: ( (lv_rightOperand_3_0= ruleExpressionUnary ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3129:1: (lv_rightOperand_3_0= ruleExpressionUnary )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3129:1: (lv_rightOperand_3_0= ruleExpressionUnary )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3130:3: lv_rightOperand_3_0= ruleExpressionUnary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionMultiplicationAccess().getRightOperandExpressionUnaryParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionUnary_in_ruleExpressionMultiplication7031);
            	    lv_rightOperand_3_0=ruleExpressionUnary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionUnary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "ruleExpressionMultiplication"


    // $ANTLR start "entryRuleExpressionMultiplicationOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3154:1: entryRuleExpressionMultiplicationOp returns [String current=null] : iv_ruleExpressionMultiplicationOp= ruleExpressionMultiplicationOp EOF ;
    public final String entryRuleExpressionMultiplicationOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionMultiplicationOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3155:2: (iv_ruleExpressionMultiplicationOp= ruleExpressionMultiplicationOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3156:2: iv_ruleExpressionMultiplicationOp= ruleExpressionMultiplicationOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionMultiplicationOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionMultiplicationOp_in_entryRuleExpressionMultiplicationOp7070);
            iv_ruleExpressionMultiplicationOp=ruleExpressionMultiplicationOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionMultiplicationOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionMultiplicationOp7081); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionMultiplicationOp"


    // $ANTLR start "ruleExpressionMultiplicationOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3163:1: ruleExpressionMultiplicationOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionMultiplicationOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3166:28: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3167:1: (kw= '*' | kw= '/' | kw= '%' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3167:1: (kw= '*' | kw= '/' | kw= '%' )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt43=1;
                }
                break;
            case 70:
                {
                alt43=2;
                }
                break;
            case 71:
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3168:2: kw= '*'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleExpressionMultiplicationOp7119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionMultiplicationOpAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3175:2: kw= '/'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleExpressionMultiplicationOp7138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionMultiplicationOpAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3182:2: kw= '%'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleExpressionMultiplicationOp7157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionMultiplicationOpAccess().getPercentSignKeyword_2()); 
                          
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
    // $ANTLR end "ruleExpressionMultiplicationOp"


    // $ANTLR start "entryRuleExpressionUnary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3195:1: entryRuleExpressionUnary returns [EObject current=null] : iv_ruleExpressionUnary= ruleExpressionUnary EOF ;
    public final EObject entryRuleExpressionUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionUnary = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3196:2: (iv_ruleExpressionUnary= ruleExpressionUnary EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3197:2: iv_ruleExpressionUnary= ruleExpressionUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionUnary_in_entryRuleExpressionUnary7197);
            iv_ruleExpressionUnary=ruleExpressionUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionUnary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionUnary7207); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionUnary"


    // $ANTLR start "ruleExpressionUnary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3204:1: ruleExpressionUnary returns [EObject current=null] : ( ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) ) | this_ExpressionPrimary_3= ruleExpressionPrimary ) ;
    public final EObject ruleExpressionUnary() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_feature_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_ExpressionPrimary_3 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3207:28: ( ( ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) ) | this_ExpressionPrimary_3= ruleExpressionPrimary ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3208:1: ( ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) ) | this_ExpressionPrimary_3= ruleExpressionPrimary )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3208:1: ( ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) ) | this_ExpressionPrimary_3= ruleExpressionPrimary )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=67 && LA44_0<=68)||LA44_0==72) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_INT)||LA44_0==17||LA44_0==20||LA44_0==22||LA44_0==52||LA44_0==73||LA44_0==76||LA44_0==79||(LA44_0>=81 && LA44_0<=115)) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3208:2: ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3208:2: ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3208:3: () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3208:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3209:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionUnaryAccess().getUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3214:2: ( (lv_feature_1_0= ruleExpressionUnaryOp ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3215:1: (lv_feature_1_0= ruleExpressionUnaryOp )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3215:1: (lv_feature_1_0= ruleExpressionUnaryOp )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3216:3: lv_feature_1_0= ruleExpressionUnaryOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionUnaryAccess().getFeatureExpressionUnaryOpParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionUnaryOp_in_ruleExpressionUnary7263);
                    lv_feature_1_0=ruleExpressionUnaryOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionUnaryRule());
                      	        }
                             		set(
                             			current, 
                             			"feature",
                              		lv_feature_1_0, 
                              		"ExpressionUnaryOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3232:2: ( (lv_operand_2_0= ruleExpressionPrimary ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3233:1: (lv_operand_2_0= ruleExpressionPrimary )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3233:1: (lv_operand_2_0= ruleExpressionPrimary )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3234:3: lv_operand_2_0= ruleExpressionPrimary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionUnaryAccess().getOperandExpressionPrimaryParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionPrimary_in_ruleExpressionUnary7284);
                    lv_operand_2_0=ruleExpressionPrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionUnaryRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"ExpressionPrimary");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3252:5: this_ExpressionPrimary_3= ruleExpressionPrimary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionUnaryAccess().getExpressionPrimaryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionPrimary_in_ruleExpressionUnary7313);
                    this_ExpressionPrimary_3=ruleExpressionPrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionPrimary_3; 
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
    // $ANTLR end "ruleExpressionUnary"


    // $ANTLR start "entryRuleExpressionUnaryOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3268:1: entryRuleExpressionUnaryOp returns [String current=null] : iv_ruleExpressionUnaryOp= ruleExpressionUnaryOp EOF ;
    public final String entryRuleExpressionUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionUnaryOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3269:2: (iv_ruleExpressionUnaryOp= ruleExpressionUnaryOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3270:2: iv_ruleExpressionUnaryOp= ruleExpressionUnaryOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionUnaryOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionUnaryOp_in_entryRuleExpressionUnaryOp7349);
            iv_ruleExpressionUnaryOp=ruleExpressionUnaryOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionUnaryOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionUnaryOp7360); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionUnaryOp"


    // $ANTLR start "ruleExpressionUnaryOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3277:1: ruleExpressionUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3280:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3281:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3281:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt45=1;
                }
                break;
            case 68:
                {
                alt45=2;
                }
                break;
            case 67:
                {
                alt45=3;
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3282:2: kw= '!'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleExpressionUnaryOp7398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionUnaryOpAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3289:2: kw= '-'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleExpressionUnaryOp7417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionUnaryOpAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3296:2: kw= '+'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleExpressionUnaryOp7436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionUnaryOpAccess().getPlusSignKeyword_2()); 
                          
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
    // $ANTLR end "ruleExpressionUnaryOp"


    // $ANTLR start "entryRuleExpressionPrimary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3309:1: entryRuleExpressionPrimary returns [EObject current=null] : iv_ruleExpressionPrimary= ruleExpressionPrimary EOF ;
    public final EObject entryRuleExpressionPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionPrimary = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3310:2: (iv_ruleExpressionPrimary= ruleExpressionPrimary EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3311:2: iv_ruleExpressionPrimary= ruleExpressionPrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionPrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionPrimary_in_entryRuleExpressionPrimary7476);
            iv_ruleExpressionPrimary=ruleExpressionPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionPrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionPrimary7486); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionPrimary"


    // $ANTLR start "ruleExpressionPrimary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3318:1: ruleExpressionPrimary returns [EObject current=null] : (this_ExpressionSwitch_0= ruleExpressionSwitch | this_ExpressionIf_1= ruleExpressionIf | this_ExpressionLiteral_2= ruleExpressionLiteral | this_ExpressionForEach_3= ruleExpressionForEach | this_ExpressionFunctionCall_4= ruleExpressionFunctionCall | this_ExpressionParenthesized_5= ruleExpressionParenthesized ) ;
    public final EObject ruleExpressionPrimary() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionSwitch_0 = null;

        EObject this_ExpressionIf_1 = null;

        EObject this_ExpressionLiteral_2 = null;

        EObject this_ExpressionForEach_3 = null;

        EObject this_ExpressionFunctionCall_4 = null;

        EObject this_ExpressionParenthesized_5 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3321:28: ( (this_ExpressionSwitch_0= ruleExpressionSwitch | this_ExpressionIf_1= ruleExpressionIf | this_ExpressionLiteral_2= ruleExpressionLiteral | this_ExpressionForEach_3= ruleExpressionForEach | this_ExpressionFunctionCall_4= ruleExpressionFunctionCall | this_ExpressionParenthesized_5= ruleExpressionParenthesized ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3322:1: (this_ExpressionSwitch_0= ruleExpressionSwitch | this_ExpressionIf_1= ruleExpressionIf | this_ExpressionLiteral_2= ruleExpressionLiteral | this_ExpressionForEach_3= ruleExpressionForEach | this_ExpressionFunctionCall_4= ruleExpressionFunctionCall | this_ExpressionParenthesized_5= ruleExpressionParenthesized )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3322:1: (this_ExpressionSwitch_0= ruleExpressionSwitch | this_ExpressionIf_1= ruleExpressionIf | this_ExpressionLiteral_2= ruleExpressionLiteral | this_ExpressionForEach_3= ruleExpressionForEach | this_ExpressionFunctionCall_4= ruleExpressionFunctionCall | this_ExpressionParenthesized_5= ruleExpressionParenthesized )
            int alt46=6;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt46=1;
                }
                break;
            case 52:
                {
                alt46=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 17:
            case 20:
            case 22:
            case 112:
            case 113:
            case 114:
            case 115:
                {
                alt46=3;
                }
                break;
            case 79:
                {
                alt46=4;
                }
                break;
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
            case 109:
            case 110:
            case 111:
                {
                alt46=5;
                }
                break;
            case 73:
                {
                alt46=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3323:5: this_ExpressionSwitch_0= ruleExpressionSwitch
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionSwitchParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionSwitch_in_ruleExpressionPrimary7533);
                    this_ExpressionSwitch_0=ruleExpressionSwitch();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionSwitch_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3333:5: this_ExpressionIf_1= ruleExpressionIf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionIfParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionIf_in_ruleExpressionPrimary7560);
                    this_ExpressionIf_1=ruleExpressionIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionIf_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3343:5: this_ExpressionLiteral_2= ruleExpressionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionLiteral_in_ruleExpressionPrimary7587);
                    this_ExpressionLiteral_2=ruleExpressionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3353:5: this_ExpressionForEach_3= ruleExpressionForEach
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionForEachParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionForEach_in_ruleExpressionPrimary7614);
                    this_ExpressionForEach_3=ruleExpressionForEach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionForEach_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3363:5: this_ExpressionFunctionCall_4= ruleExpressionFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionFunctionCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionFunctionCall_in_ruleExpressionPrimary7641);
                    this_ExpressionFunctionCall_4=ruleExpressionFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionFunctionCall_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3373:5: this_ExpressionParenthesized_5= ruleExpressionParenthesized
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionParenthesizedParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionParenthesized_in_ruleExpressionPrimary7668);
                    this_ExpressionParenthesized_5=ruleExpressionParenthesized();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionParenthesized_5; 
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
    // $ANTLR end "ruleExpressionPrimary"


    // $ANTLR start "entryRuleExpressionLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3389:1: entryRuleExpressionLiteral returns [EObject current=null] : iv_ruleExpressionLiteral= ruleExpressionLiteral EOF ;
    public final EObject entryRuleExpressionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3390:2: (iv_ruleExpressionLiteral= ruleExpressionLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3391:2: iv_ruleExpressionLiteral= ruleExpressionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionLiteral_in_entryRuleExpressionLiteral7703);
            iv_ruleExpressionLiteral=ruleExpressionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionLiteral7713); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLiteral"


    // $ANTLR start "ruleExpressionLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3398:1: ruleExpressionLiteral returns [EObject current=null] : (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralString_4= ruleLiteralString | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | ( () ( (otherlv_8= RULE_ID ) ) ) ) ;
    public final EObject ruleExpressionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_8=null;
        EObject this_ExpressionLiteralCollection_0 = null;

        EObject this_LiteralBoolean_1 = null;

        EObject this_LiteralNumber_2 = null;

        EObject this_LiteralNull_3 = null;

        EObject this_LiteralString_4 = null;

        EObject this_LiteralTime_5 = null;

        EObject this_LiteralEnum_6 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3401:28: ( (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralString_4= ruleLiteralString | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | ( () ( (otherlv_8= RULE_ID ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3402:1: (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralString_4= ruleLiteralString | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | ( () ( (otherlv_8= RULE_ID ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3402:1: (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralString_4= ruleLiteralString | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | ( () ( (otherlv_8= RULE_ID ) ) ) )
            int alt47=8;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3403:5: this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getExpressionLiteralCollectionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionLiteralCollection_in_ruleExpressionLiteral7760);
                    this_ExpressionLiteralCollection_0=ruleExpressionLiteralCollection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionLiteralCollection_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3413:5: this_LiteralBoolean_1= ruleLiteralBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralBooleanParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralBoolean_in_ruleExpressionLiteral7787);
                    this_LiteralBoolean_1=ruleLiteralBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralBoolean_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3423:5: this_LiteralNumber_2= ruleLiteralNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralNumberParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleExpressionLiteral7814);
                    this_LiteralNumber_2=ruleLiteralNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralNumber_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3433:5: this_LiteralNull_3= ruleLiteralNull
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralNullParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralNull_in_ruleExpressionLiteral7841);
                    this_LiteralNull_3=ruleLiteralNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralNull_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3443:5: this_LiteralString_4= ruleLiteralString
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralStringParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralString_in_ruleExpressionLiteral7868);
                    this_LiteralString_4=ruleLiteralString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralString_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3453:5: this_LiteralTime_5= ruleLiteralTime
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralTimeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralTime_in_ruleExpressionLiteral7895);
                    this_LiteralTime_5=ruleLiteralTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralTime_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3463:5: this_LiteralEnum_6= ruleLiteralEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralEnumParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralEnum_in_ruleExpressionLiteral7922);
                    this_LiteralEnum_6=ruleLiteralEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralEnum_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3472:6: ( () ( (otherlv_8= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3472:6: ( () ( (otherlv_8= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3472:7: () ( (otherlv_8= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3472:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3473:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionLiteralAccess().getLiteralDataAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3478:2: ( (otherlv_8= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3479:1: (otherlv_8= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3479:1: (otherlv_8= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3480:3: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionLiteralRule());
                      	        }
                              
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpressionLiteral7957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_8, grammarAccess.getExpressionLiteralAccess().getDataInteractorDataCrossReference_7_1_0()); 
                      	
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
    // $ANTLR end "ruleExpressionLiteral"


    // $ANTLR start "entryRuleExpressionLiteralCollection"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3499:1: entryRuleExpressionLiteralCollection returns [EObject current=null] : iv_ruleExpressionLiteralCollection= ruleExpressionLiteralCollection EOF ;
    public final EObject entryRuleExpressionLiteralCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLiteralCollection = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3500:2: (iv_ruleExpressionLiteralCollection= ruleExpressionLiteralCollection EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3501:2: iv_ruleExpressionLiteralCollection= ruleExpressionLiteralCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLiteralCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionLiteralCollection_in_entryRuleExpressionLiteralCollection7994);
            iv_ruleExpressionLiteralCollection=ruleExpressionLiteralCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLiteralCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionLiteralCollection8004); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLiteralCollection"


    // $ANTLR start "ruleExpressionLiteralCollection"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3508:1: ruleExpressionLiteralCollection returns [EObject current=null] : (this_ExpressionLiteralSet_0= ruleExpressionLiteralSet | this_ExpressionLiteralList_1= ruleExpressionLiteralList ) ;
    public final EObject ruleExpressionLiteralCollection() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLiteralSet_0 = null;

        EObject this_ExpressionLiteralList_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3511:28: ( (this_ExpressionLiteralSet_0= ruleExpressionLiteralSet | this_ExpressionLiteralList_1= ruleExpressionLiteralList ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3512:1: (this_ExpressionLiteralSet_0= ruleExpressionLiteralSet | this_ExpressionLiteralList_1= ruleExpressionLiteralList )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3512:1: (this_ExpressionLiteralSet_0= ruleExpressionLiteralSet | this_ExpressionLiteralList_1= ruleExpressionLiteralList )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==17) ) {
                alt48=1;
            }
            else if ( (LA48_0==20) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3513:5: this_ExpressionLiteralSet_0= ruleExpressionLiteralSet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralCollectionAccess().getExpressionLiteralSetParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionLiteralSet_in_ruleExpressionLiteralCollection8051);
                    this_ExpressionLiteralSet_0=ruleExpressionLiteralSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionLiteralSet_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3523:5: this_ExpressionLiteralList_1= ruleExpressionLiteralList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralCollectionAccess().getExpressionLiteralListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionLiteralList_in_ruleExpressionLiteralCollection8078);
                    this_ExpressionLiteralList_1=ruleExpressionLiteralList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionLiteralList_1; 
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
    // $ANTLR end "ruleExpressionLiteralCollection"


    // $ANTLR start "entryRuleExpressionLiteralSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3539:1: entryRuleExpressionLiteralSet returns [EObject current=null] : iv_ruleExpressionLiteralSet= ruleExpressionLiteralSet EOF ;
    public final EObject entryRuleExpressionLiteralSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLiteralSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3540:2: (iv_ruleExpressionLiteralSet= ruleExpressionLiteralSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3541:2: iv_ruleExpressionLiteralSet= ruleExpressionLiteralSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLiteralSetRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionLiteralSet_in_entryRuleExpressionLiteralSet8113);
            iv_ruleExpressionLiteralSet=ruleExpressionLiteralSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLiteralSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionLiteralSet8123); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLiteralSet"


    // $ANTLR start "ruleExpressionLiteralSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3548:1: ruleExpressionLiteralSet returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleExpressionLiteralSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3551:28: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3552:1: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3552:1: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3552:2: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3552:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3553:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionLiteralSetAccess().getExpressionLiteralSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleExpressionLiteralSet8169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionLiteralSetAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3562:1: ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_INT)||LA50_0==17||LA50_0==20||LA50_0==22||LA50_0==52||(LA50_0>=67 && LA50_0<=68)||(LA50_0>=72 && LA50_0<=73)||LA50_0==76||LA50_0==79||(LA50_0>=81 && LA50_0<=115)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3562:2: ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3562:2: ( (lv_elements_2_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3563:1: (lv_elements_2_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3563:1: (lv_elements_2_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3564:3: lv_elements_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionLiteralSetAccess().getElementsExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionLiteralSet8191);
                    lv_elements_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionLiteralSetRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3580:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==18) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3580:4: otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleExpressionLiteralSet8204); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getExpressionLiteralSetAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3584:1: ( (lv_elements_4_0= ruleExpression ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3585:1: (lv_elements_4_0= ruleExpression )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3585:1: (lv_elements_4_0= ruleExpression )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3586:3: lv_elements_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionLiteralSetAccess().getElementsExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionLiteralSet8225);
                    	    lv_elements_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpressionLiteralSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_4_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleExpressionLiteralSet8241); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExpressionLiteralSetAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleExpressionLiteralSet"


    // $ANTLR start "entryRuleExpressionLiteralList"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3614:1: entryRuleExpressionLiteralList returns [EObject current=null] : iv_ruleExpressionLiteralList= ruleExpressionLiteralList EOF ;
    public final EObject entryRuleExpressionLiteralList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLiteralList = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3615:2: (iv_ruleExpressionLiteralList= ruleExpressionLiteralList EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3616:2: iv_ruleExpressionLiteralList= ruleExpressionLiteralList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLiteralListRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionLiteralList_in_entryRuleExpressionLiteralList8277);
            iv_ruleExpressionLiteralList=ruleExpressionLiteralList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLiteralList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionLiteralList8287); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLiteralList"


    // $ANTLR start "ruleExpressionLiteralList"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3623:1: ruleExpressionLiteralList returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleExpressionLiteralList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3626:28: ( ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3627:1: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3627:1: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3627:2: () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3627:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3628:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionLiteralListAccess().getExpressionLiteralListAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleExpressionLiteralList8333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionLiteralListAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3637:1: ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_INT)||LA52_0==17||LA52_0==20||LA52_0==22||LA52_0==52||(LA52_0>=67 && LA52_0<=68)||(LA52_0>=72 && LA52_0<=73)||LA52_0==76||LA52_0==79||(LA52_0>=81 && LA52_0<=115)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3637:2: ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3637:2: ( (lv_elements_2_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3638:1: (lv_elements_2_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3638:1: (lv_elements_2_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3639:3: lv_elements_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionLiteralListAccess().getElementsExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionLiteralList8355);
                    lv_elements_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionLiteralListRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3655:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==18) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3655:4: otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleExpressionLiteralList8368); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getExpressionLiteralListAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3659:1: ( (lv_elements_4_0= ruleExpression ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3660:1: (lv_elements_4_0= ruleExpression )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3660:1: (lv_elements_4_0= ruleExpression )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3661:3: lv_elements_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionLiteralListAccess().getElementsExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionLiteralList8389);
                    	    lv_elements_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpressionLiteralListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_4_0, 
                    	              		"Expression");
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


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleExpressionLiteralList8405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExpressionLiteralListAccess().getRightSquareBracketKeyword_3());
                  
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
    // $ANTLR end "ruleExpressionLiteralList"


    // $ANTLR start "entryRuleExpressionParenthesized"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3689:1: entryRuleExpressionParenthesized returns [EObject current=null] : iv_ruleExpressionParenthesized= ruleExpressionParenthesized EOF ;
    public final EObject entryRuleExpressionParenthesized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionParenthesized = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3690:2: (iv_ruleExpressionParenthesized= ruleExpressionParenthesized EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3691:2: iv_ruleExpressionParenthesized= ruleExpressionParenthesized EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionParenthesizedRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionParenthesized_in_entryRuleExpressionParenthesized8441);
            iv_ruleExpressionParenthesized=ruleExpressionParenthesized();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionParenthesized; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionParenthesized8451); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionParenthesized"


    // $ANTLR start "ruleExpressionParenthesized"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3698:1: ruleExpressionParenthesized returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleExpressionParenthesized() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3701:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3702:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3702:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3702:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleExpressionParenthesized8488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpressionParenthesizedAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionParenthesizedAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionParenthesized8510);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleExpressionParenthesized8521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionParenthesizedAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleExpressionParenthesized"


    // $ANTLR start "entryRuleExpressionIf"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3727:1: entryRuleExpressionIf returns [EObject current=null] : iv_ruleExpressionIf= ruleExpressionIf EOF ;
    public final EObject entryRuleExpressionIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionIf = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3728:2: (iv_ruleExpressionIf= ruleExpressionIf EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3729:2: iv_ruleExpressionIf= ruleExpressionIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionIfRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionIf_in_entryRuleExpressionIf8557);
            iv_ruleExpressionIf=ruleExpressionIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionIf8567); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionIf"


    // $ANTLR start "ruleExpressionIf"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3736:1: ruleExpressionIf returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) ) ;
    public final EObject ruleExpressionIf() throws RecognitionException {
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
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3739:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3740:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3740:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3740:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3740:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3741:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionIfAccess().getExpressionIfAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleExpressionIf8613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionIfAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleExpressionIf8625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionIfAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3754:1: ( (lv_if_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3755:1: (lv_if_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3755:1: (lv_if_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3756:3: lv_if_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionIfAccess().getIfExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionIf8646);
            lv_if_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionIfRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3772:2: ( ( ')' )=>otherlv_4= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3772:3: ( ')' )=>otherlv_4= ')'
            {
            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleExpressionIf8666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExpressionIfAccess().getRightParenthesisKeyword_4());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3777:2: ( (lv_then_5_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3778:1: (lv_then_5_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3778:1: (lv_then_5_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3779:3: lv_then_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionIfAccess().getThenExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionIf8688);
            lv_then_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionIfRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3795:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3795:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3795:3: ( ( 'else' )=>otherlv_6= 'else' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3795:4: ( 'else' )=>otherlv_6= 'else'
            {
            otherlv_6=(Token)match(input,75,FOLLOW_75_in_ruleExpressionIf8709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getExpressionIfAccess().getElseKeyword_6_0());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3800:2: ( (lv_else_7_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3801:1: (lv_else_7_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3801:1: (lv_else_7_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3802:3: lv_else_7_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionIfAccess().getElseExpressionParserRuleCall_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionIf8731);
            lv_else_7_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionIfRule());
              	        }
                     		set(
                     			current, 
                     			"else",
                      		lv_else_7_0, 
                      		"Expression");
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
    // $ANTLR end "ruleExpressionIf"


    // $ANTLR start "entryRuleExpressionSwitch"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3826:1: entryRuleExpressionSwitch returns [EObject current=null] : iv_ruleExpressionSwitch= ruleExpressionSwitch EOF ;
    public final EObject entryRuleExpressionSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionSwitch = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3827:2: (iv_ruleExpressionSwitch= ruleExpressionSwitch EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3828:2: iv_ruleExpressionSwitch= ruleExpressionSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionSwitchRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionSwitch_in_entryRuleExpressionSwitch8768);
            iv_ruleExpressionSwitch=ruleExpressionSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionSwitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionSwitch8778); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionSwitch"


    // $ANTLR start "ruleExpressionSwitch"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3835:1: ruleExpressionSwitch returns [EObject current=null] : ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpressionSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_switch_3_0 = null;

        EObject lv_case_5_0 = null;

        EObject lv_default_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3838:28: ( ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3839:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3839:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3839:2: () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3839:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3840:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionSwitchAccess().getExpressionSwitchAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleExpressionSwitch8824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionSwitchAccess().getSwitchKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleExpressionSwitch8836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionSwitchAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3853:1: ( (lv_switch_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3854:1: (lv_switch_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3854:1: (lv_switch_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3855:3: lv_switch_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionSwitchAccess().getSwitchExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSwitch8857);
            lv_switch_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionSwitchRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3871:2: ( ( ')' )=>otherlv_4= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3871:3: ( ')' )=>otherlv_4= ')'
            {
            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleExpressionSwitch8877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExpressionSwitchAccess().getRightParenthesisKeyword_4());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3876:2: ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==78) ) {
                    int LA53_2 = input.LA(2);

                    if ( (synpred12_InternalLil()) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3876:3: ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3881:1: (lv_case_5_0= ruleExpressionCase )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3882:3: lv_case_5_0= ruleExpressionCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionSwitchAccess().getCaseExpressionCaseParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionCase_in_ruleExpressionSwitch8909);
            	    lv_case_5_0=ruleExpressionCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionSwitchRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"case",
            	              		lv_case_5_0, 
            	              		"ExpressionCase");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3898:3: ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==77) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred13_InternalLil()) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3898:4: ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3898:4: ( ( 'default' )=>otherlv_6= 'default' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3898:5: ( 'default' )=>otherlv_6= 'default'
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleExpressionSwitch8931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExpressionSwitchAccess().getDefaultKeyword_6_0());
                          
                    }

                    }

                    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleExpressionSwitch8944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExpressionSwitchAccess().getColonKeyword_6_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3907:1: ( (lv_default_8_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3908:1: (lv_default_8_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3908:1: (lv_default_8_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3909:3: lv_default_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionSwitchAccess().getDefaultExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSwitch8965);
                    lv_default_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionSwitchRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_8_0, 
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
    // $ANTLR end "ruleExpressionSwitch"


    // $ANTLR start "entryRuleExpressionCase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3933:1: entryRuleExpressionCase returns [EObject current=null] : iv_ruleExpressionCase= ruleExpressionCase EOF ;
    public final EObject entryRuleExpressionCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionCase = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3934:2: (iv_ruleExpressionCase= ruleExpressionCase EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3935:2: iv_ruleExpressionCase= ruleExpressionCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionCaseRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionCase_in_entryRuleExpressionCase9003);
            iv_ruleExpressionCase=ruleExpressionCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionCase9013); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionCase"


    // $ANTLR start "ruleExpressionCase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3942:1: ruleExpressionCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) ) ;
    public final EObject ruleExpressionCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_case_1_0 = null;

        EObject lv_then_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3945:28: ( (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3946:1: (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3946:1: (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3946:3: otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleExpressionCase9050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpressionCaseAccess().getCaseKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3950:1: ( (lv_case_1_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3951:1: (lv_case_1_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3951:1: (lv_case_1_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3952:3: lv_case_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionCaseAccess().getCaseExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionCase9071);
            lv_case_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionCaseRule());
              	        }
                     		set(
                     			current, 
                     			"case",
                      		lv_case_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleExpressionCase9083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionCaseAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3972:1: ( (lv_then_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3973:1: (lv_then_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3973:1: (lv_then_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3974:3: lv_then_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionCaseAccess().getThenExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionCase9104);
            lv_then_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionCaseRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_3_0, 
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
    // $ANTLR end "ruleExpressionCase"


    // $ANTLR start "entryRuleExpressionForEach"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3998:1: entryRuleExpressionForEach returns [EObject current=null] : iv_ruleExpressionForEach= ruleExpressionForEach EOF ;
    public final EObject entryRuleExpressionForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionForEach = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3999:2: (iv_ruleExpressionForEach= ruleExpressionForEach EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4000:2: iv_ruleExpressionForEach= ruleExpressionForEach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionForEachRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionForEach_in_entryRuleExpressionForEach9140);
            iv_ruleExpressionForEach=ruleExpressionForEach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionForEach; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionForEach9150); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionForEach"


    // $ANTLR start "ruleExpressionForEach"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4007:1: ruleExpressionForEach returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleExpressionForEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_forExpression_4_0 = null;

        EObject lv_eachExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4010:28: ( ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4011:1: ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4011:1: ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4011:2: () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4011:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4012:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionForEachAccess().getExpressionForEachAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleExpressionForEach9196); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionForEachAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleExpressionForEach9208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionForEachAccess().getEachKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,73,FOLLOW_73_in_ruleExpressionForEach9220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExpressionForEachAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4029:1: ( (lv_forExpression_4_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4030:1: (lv_forExpression_4_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4030:1: (lv_forExpression_4_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4031:3: lv_forExpression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionForEachAccess().getForExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionForEach9241);
            lv_forExpression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionForEachRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleExpressionForEach9253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExpressionForEachAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4051:1: ( (lv_eachExpression_6_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4052:1: (lv_eachExpression_6_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4052:1: (lv_eachExpression_6_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4053:3: lv_eachExpression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionForEachAccess().getEachExpressionExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionForEach9274);
            lv_eachExpression_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionForEachRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_6_0, 
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
    // $ANTLR end "ruleExpressionForEach"


    // $ANTLR start "entryRuleExpressionFunctionCall"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4077:1: entryRuleExpressionFunctionCall returns [EObject current=null] : iv_ruleExpressionFunctionCall= ruleExpressionFunctionCall EOF ;
    public final EObject entryRuleExpressionFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionFunctionCall = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4078:2: (iv_ruleExpressionFunctionCall= ruleExpressionFunctionCall EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4079:2: iv_ruleExpressionFunctionCall= ruleExpressionFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionFunctionCall_in_entryRuleExpressionFunctionCall9310);
            iv_ruleExpressionFunctionCall=ruleExpressionFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionFunctionCall9320); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionFunctionCall"


    // $ANTLR start "ruleExpressionFunctionCall"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4086:1: ruleExpressionFunctionCall returns [EObject current=null] : ( () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExpressionFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_function_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4089:28: ( ( () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4090:1: ( () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4090:1: ( () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4090:2: () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4090:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4091:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionFunctionCallAccess().getExpressionFunctionCallAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4096:2: ( (lv_function_1_0= ruleExpressionFunctionCallBase ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4097:1: (lv_function_1_0= ruleExpressionFunctionCallBase )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4097:1: (lv_function_1_0= ruleExpressionFunctionCallBase )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4098:3: lv_function_1_0= ruleExpressionFunctionCallBase
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionFunctionCallAccess().getFunctionExpressionFunctionCallBaseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionFunctionCallBase_in_ruleExpressionFunctionCall9375);
            lv_function_1_0=ruleExpressionFunctionCallBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionFunctionCallRule());
              	        }
                     		set(
                     			current, 
                     			"function",
                      		lv_function_1_0, 
                      		"ExpressionFunctionCallBase");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleExpressionFunctionCall9387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionFunctionCallAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4118:1: ( (lv_arguments_3_0= ruleExpression ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_INT)||LA55_0==17||LA55_0==20||LA55_0==22||LA55_0==52||(LA55_0>=67 && LA55_0<=68)||(LA55_0>=72 && LA55_0<=73)||LA55_0==76||LA55_0==79||(LA55_0>=81 && LA55_0<=115)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4119:1: (lv_arguments_3_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4119:1: (lv_arguments_3_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4120:3: lv_arguments_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionFunctionCallAccess().getArgumentsExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionFunctionCall9408);
                    lv_arguments_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionFunctionCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4136:3: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==18) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4136:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleExpressionFunctionCall9422); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getExpressionFunctionCallAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4140:1: ( (lv_arguments_5_0= ruleExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4141:1: (lv_arguments_5_0= ruleExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4141:1: (lv_arguments_5_0= ruleExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4142:3: lv_arguments_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionFunctionCallAccess().getArgumentsExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionFunctionCall9443);
            	    lv_arguments_5_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionFunctionCallRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arguments",
            	              		lv_arguments_5_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleExpressionFunctionCall9457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getExpressionFunctionCallAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleExpressionFunctionCall"


    // $ANTLR start "entryRuleExpressionFunctionCallBase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4170:1: entryRuleExpressionFunctionCallBase returns [String current=null] : iv_ruleExpressionFunctionCallBase= ruleExpressionFunctionCallBase EOF ;
    public final String entryRuleExpressionFunctionCallBase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionFunctionCallBase = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4171:2: (iv_ruleExpressionFunctionCallBase= ruleExpressionFunctionCallBase EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4172:2: iv_ruleExpressionFunctionCallBase= ruleExpressionFunctionCallBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionFunctionCallBaseRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionFunctionCallBase_in_entryRuleExpressionFunctionCallBase9494);
            iv_ruleExpressionFunctionCallBase=ruleExpressionFunctionCallBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionFunctionCallBase.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionFunctionCallBase9505); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionFunctionCallBase"


    // $ANTLR start "ruleExpressionFunctionCallBase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4179:1: ruleExpressionFunctionCallBase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'math.abs' | kw= 'math.acos' | kw= 'math.acosh' | kw= 'math.asin' | kw= 'math.asinh' | kw= 'math.atan' | kw= 'math.atanh' | kw= 'math.atan2' | kw= 'math.ceil' | kw= 'math.clip' | kw= 'math.cos' | kw= 'math.cosh' | kw= 'math.exp' | kw= 'math.floor' | kw= 'math.fround' | kw= 'math.hypot' | kw= 'math.log' | kw= 'math.log10' | kw= 'math.log2' | kw= 'math.max' | kw= 'math.min' | kw= 'math.pow' | kw= 'math.random' | kw= 'math.round' | kw= 'math.sign' | kw= 'math.sin' | kw= 'math.sinh' | kw= 'math.sqrt' | kw= 'math.tan' | kw= 'math.tanh' | kw= 'math.trunc' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionFunctionCallBase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4182:28: ( (kw= 'math.abs' | kw= 'math.acos' | kw= 'math.acosh' | kw= 'math.asin' | kw= 'math.asinh' | kw= 'math.atan' | kw= 'math.atanh' | kw= 'math.atan2' | kw= 'math.ceil' | kw= 'math.clip' | kw= 'math.cos' | kw= 'math.cosh' | kw= 'math.exp' | kw= 'math.floor' | kw= 'math.fround' | kw= 'math.hypot' | kw= 'math.log' | kw= 'math.log10' | kw= 'math.log2' | kw= 'math.max' | kw= 'math.min' | kw= 'math.pow' | kw= 'math.random' | kw= 'math.round' | kw= 'math.sign' | kw= 'math.sin' | kw= 'math.sinh' | kw= 'math.sqrt' | kw= 'math.tan' | kw= 'math.tanh' | kw= 'math.trunc' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4183:1: (kw= 'math.abs' | kw= 'math.acos' | kw= 'math.acosh' | kw= 'math.asin' | kw= 'math.asinh' | kw= 'math.atan' | kw= 'math.atanh' | kw= 'math.atan2' | kw= 'math.ceil' | kw= 'math.clip' | kw= 'math.cos' | kw= 'math.cosh' | kw= 'math.exp' | kw= 'math.floor' | kw= 'math.fround' | kw= 'math.hypot' | kw= 'math.log' | kw= 'math.log10' | kw= 'math.log2' | kw= 'math.max' | kw= 'math.min' | kw= 'math.pow' | kw= 'math.random' | kw= 'math.round' | kw= 'math.sign' | kw= 'math.sin' | kw= 'math.sinh' | kw= 'math.sqrt' | kw= 'math.tan' | kw= 'math.tanh' | kw= 'math.trunc' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4183:1: (kw= 'math.abs' | kw= 'math.acos' | kw= 'math.acosh' | kw= 'math.asin' | kw= 'math.asinh' | kw= 'math.atan' | kw= 'math.atanh' | kw= 'math.atan2' | kw= 'math.ceil' | kw= 'math.clip' | kw= 'math.cos' | kw= 'math.cosh' | kw= 'math.exp' | kw= 'math.floor' | kw= 'math.fround' | kw= 'math.hypot' | kw= 'math.log' | kw= 'math.log10' | kw= 'math.log2' | kw= 'math.max' | kw= 'math.min' | kw= 'math.pow' | kw= 'math.random' | kw= 'math.round' | kw= 'math.sign' | kw= 'math.sin' | kw= 'math.sinh' | kw= 'math.sqrt' | kw= 'math.tan' | kw= 'math.tanh' | kw= 'math.trunc' )
            int alt57=31;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt57=1;
                }
                break;
            case 82:
                {
                alt57=2;
                }
                break;
            case 83:
                {
                alt57=3;
                }
                break;
            case 84:
                {
                alt57=4;
                }
                break;
            case 85:
                {
                alt57=5;
                }
                break;
            case 86:
                {
                alt57=6;
                }
                break;
            case 87:
                {
                alt57=7;
                }
                break;
            case 88:
                {
                alt57=8;
                }
                break;
            case 89:
                {
                alt57=9;
                }
                break;
            case 90:
                {
                alt57=10;
                }
                break;
            case 91:
                {
                alt57=11;
                }
                break;
            case 92:
                {
                alt57=12;
                }
                break;
            case 93:
                {
                alt57=13;
                }
                break;
            case 94:
                {
                alt57=14;
                }
                break;
            case 95:
                {
                alt57=15;
                }
                break;
            case 96:
                {
                alt57=16;
                }
                break;
            case 97:
                {
                alt57=17;
                }
                break;
            case 98:
                {
                alt57=18;
                }
                break;
            case 99:
                {
                alt57=19;
                }
                break;
            case 100:
                {
                alt57=20;
                }
                break;
            case 101:
                {
                alt57=21;
                }
                break;
            case 102:
                {
                alt57=22;
                }
                break;
            case 103:
                {
                alt57=23;
                }
                break;
            case 104:
                {
                alt57=24;
                }
                break;
            case 105:
                {
                alt57=25;
                }
                break;
            case 106:
                {
                alt57=26;
                }
                break;
            case 107:
                {
                alt57=27;
                }
                break;
            case 108:
                {
                alt57=28;
                }
                break;
            case 109:
                {
                alt57=29;
                }
                break;
            case 110:
                {
                alt57=30;
                }
                break;
            case 111:
                {
                alt57=31;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4184:2: kw= 'math.abs'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleExpressionFunctionCallBase9543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAbsKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4191:2: kw= 'math.acos'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleExpressionFunctionCallBase9562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAcosKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4198:2: kw= 'math.acosh'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleExpressionFunctionCallBase9581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAcoshKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4205:2: kw= 'math.asin'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleExpressionFunctionCallBase9600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAsinKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4212:2: kw= 'math.asinh'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleExpressionFunctionCallBase9619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAsinhKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4219:2: kw= 'math.atan'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleExpressionFunctionCallBase9638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAtanKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4226:2: kw= 'math.atanh'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleExpressionFunctionCallBase9657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAtanhKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4233:2: kw= 'math.atan2'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleExpressionFunctionCallBase9676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAtan2Keyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4240:2: kw= 'math.ceil'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleExpressionFunctionCallBase9695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathCeilKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4247:2: kw= 'math.clip'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleExpressionFunctionCallBase9714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathClipKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4254:2: kw= 'math.cos'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleExpressionFunctionCallBase9733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathCosKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4261:2: kw= 'math.cosh'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleExpressionFunctionCallBase9752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathCoshKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4268:2: kw= 'math.exp'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleExpressionFunctionCallBase9771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathExpKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4275:2: kw= 'math.floor'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleExpressionFunctionCallBase9790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathFloorKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4282:2: kw= 'math.fround'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleExpressionFunctionCallBase9809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathFroundKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4289:2: kw= 'math.hypot'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleExpressionFunctionCallBase9828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathHypotKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4296:2: kw= 'math.log'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleExpressionFunctionCallBase9847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathLogKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4303:2: kw= 'math.log10'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleExpressionFunctionCallBase9866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathLog10Keyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4310:2: kw= 'math.log2'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleExpressionFunctionCallBase9885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathLog2Keyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4317:2: kw= 'math.max'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleExpressionFunctionCallBase9904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathMaxKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4324:2: kw= 'math.min'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleExpressionFunctionCallBase9923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathMinKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4331:2: kw= 'math.pow'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleExpressionFunctionCallBase9942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathPowKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4338:2: kw= 'math.random'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleExpressionFunctionCallBase9961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathRandomKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4345:2: kw= 'math.round'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleExpressionFunctionCallBase9980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathRoundKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4352:2: kw= 'math.sign'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleExpressionFunctionCallBase9999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathSignKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4359:2: kw= 'math.sin'
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleExpressionFunctionCallBase10018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathSinKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4366:2: kw= 'math.sinh'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleExpressionFunctionCallBase10037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathSinhKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4373:2: kw= 'math.sqrt'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleExpressionFunctionCallBase10056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathSqrtKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4380:2: kw= 'math.tan'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleExpressionFunctionCallBase10075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathTanKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4387:2: kw= 'math.tanh'
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleExpressionFunctionCallBase10094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathTanhKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4394:2: kw= 'math.trunc'
                    {
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleExpressionFunctionCallBase10113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathTruncKeyword_30()); 
                          
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
    // $ANTLR end "ruleExpressionFunctionCallBase"


    // $ANTLR start "entryRuleLiteralBoolean"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4407:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4408:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4409:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean10153);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralBoolean10163); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4416:1: ruleLiteralBoolean returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4419:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4420:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4420:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4420:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4420:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4421:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralBooleanAccess().getLiteralBooleanAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4426:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==112) ) {
                alt58=1;
            }
            else if ( (LA58_0==113) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4426:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,112,FOLLOW_112_in_ruleLiteralBoolean10210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLiteralBooleanAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4431:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4431:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4432:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4432:1: (lv_isTrue_2_0= 'true' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4433:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,113,FOLLOW_113_in_ruleLiteralBoolean10234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getLiteralBooleanAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralBooleanRule());
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
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleLiteralNull"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4454:1: entryRuleLiteralNull returns [EObject current=null] : iv_ruleLiteralNull= ruleLiteralNull EOF ;
    public final EObject entryRuleLiteralNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNull = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4455:2: (iv_ruleLiteralNull= ruleLiteralNull EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4456:2: iv_ruleLiteralNull= ruleLiteralNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNullRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull10284);
            iv_ruleLiteralNull=ruleLiteralNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralNull; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNull10294); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralNull"


    // $ANTLR start "ruleLiteralNull"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4463:1: ruleLiteralNull returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleLiteralNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4466:28: ( ( () otherlv_1= 'null' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4467:1: ( () otherlv_1= 'null' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4467:1: ( () otherlv_1= 'null' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4467:2: () otherlv_1= 'null'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4467:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4468:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralNullAccess().getLiteralNullAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,114,FOLLOW_114_in_ruleLiteralNull10340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralNullAccess().getNullKeyword_1());
                  
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
    // $ANTLR end "ruleLiteralNull"


    // $ANTLR start "entryRuleLiteralNumber"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4485:1: entryRuleLiteralNumber returns [EObject current=null] : iv_ruleLiteralNumber= ruleLiteralNumber EOF ;
    public final EObject entryRuleLiteralNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNumber = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4486:2: (iv_ruleLiteralNumber= ruleLiteralNumber EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4487:2: iv_ruleLiteralNumber= ruleLiteralNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNumberRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralNumber_in_entryRuleLiteralNumber10376);
            iv_ruleLiteralNumber=ruleLiteralNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNumber10386); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralNumber"


    // $ANTLR start "ruleLiteralNumber"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4494:1: ruleLiteralNumber returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNUMBER ) ) ) ;
    public final EObject ruleLiteralNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4497:28: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4498:1: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4498:1: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4498:2: () ( (lv_value_1_0= ruleNUMBER ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4498:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4499:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralNumberAccess().getLiteralNumberAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4504:2: ( (lv_value_1_0= ruleNUMBER ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4505:1: (lv_value_1_0= ruleNUMBER )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4505:1: (lv_value_1_0= ruleNUMBER )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4506:3: lv_value_1_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralNumberAccess().getValueNUMBERParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralNumber10441);
            lv_value_1_0=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLiteralNumberRule());
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
    // $ANTLR end "ruleLiteralNumber"


    // $ANTLR start "entryRuleLiteralString"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4530:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4531:2: (iv_ruleLiteralString= ruleLiteralString EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4532:2: iv_ruleLiteralString= ruleLiteralString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralStringRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralString_in_entryRuleLiteralString10477);
            iv_ruleLiteralString=ruleLiteralString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralString10487); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralString"


    // $ANTLR start "ruleLiteralString"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4539:1: ruleLiteralString returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4542:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4543:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4543:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4543:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4543:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4544:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralStringAccess().getLiteralStringAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4549:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4550:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4550:1: (lv_value_1_0= RULE_STRING )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4551:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralString10538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getLiteralStringAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralStringRule());
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
    // $ANTLR end "ruleLiteralString"


    // $ANTLR start "entryRuleLiteralEnum"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4575:1: entryRuleLiteralEnum returns [EObject current=null] : iv_ruleLiteralEnum= ruleLiteralEnum EOF ;
    public final EObject entryRuleLiteralEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralEnum = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4576:2: (iv_ruleLiteralEnum= ruleLiteralEnum EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4577:2: iv_ruleLiteralEnum= ruleLiteralEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralEnumRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralEnum_in_entryRuleLiteralEnum10579);
            iv_ruleLiteralEnum=ruleLiteralEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralEnum10589); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralEnum"


    // $ANTLR start "ruleLiteralEnum"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4584:1: ruleLiteralEnum returns [EObject current=null] : ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLiteralEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4587:28: ( ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4588:1: ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4588:1: ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4588:2: () otherlv_1= '#' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4588:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4589:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralEnumAccess().getLiteralEnumAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleLiteralEnum10635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralEnumAccess().getNumberSignKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4598:1: ( (otherlv_2= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4599:1: (otherlv_2= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4599:1: (otherlv_2= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4600:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralEnumRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralEnum10655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getLiteralEnumAccess().getValueDataDefinitionEnumElementCrossReference_2_0()); 
              	
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
    // $ANTLR end "ruleLiteralEnum"


    // $ANTLR start "entryRuleLiteralTime"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4619:1: entryRuleLiteralTime returns [EObject current=null] : iv_ruleLiteralTime= ruleLiteralTime EOF ;
    public final EObject entryRuleLiteralTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralTime = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4620:2: (iv_ruleLiteralTime= ruleLiteralTime EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4621:2: iv_ruleLiteralTime= ruleLiteralTime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralTimeRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralTime_in_entryRuleLiteralTime10691);
            iv_ruleLiteralTime=ruleLiteralTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralTime; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralTime10701); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralTime"


    // $ANTLR start "ruleLiteralTime"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4628:1: ruleLiteralTime returns [EObject current=null] : ( ( () ( (lv_now_1_0= 'now' ) ) ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) ) ;
    public final EObject ruleLiteralTime() throws RecognitionException {
        EObject current = null;

        Token lv_now_1_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        AntlrDatatypeRuleToken lv_year_3_0 = null;

        AntlrDatatypeRuleToken lv_month_5_0 = null;

        AntlrDatatypeRuleToken lv_day_7_0 = null;

        AntlrDatatypeRuleToken lv_hour_9_0 = null;

        AntlrDatatypeRuleToken lv_minute_11_0 = null;

        AntlrDatatypeRuleToken lv_second_14_0 = null;

        AntlrDatatypeRuleToken lv_month_18_0 = null;

        AntlrDatatypeRuleToken lv_day_20_0 = null;

        AntlrDatatypeRuleToken lv_hour_22_0 = null;

        AntlrDatatypeRuleToken lv_minute_24_0 = null;

        AntlrDatatypeRuleToken lv_second_27_0 = null;

        AntlrDatatypeRuleToken lv_day_31_0 = null;

        AntlrDatatypeRuleToken lv_hour_33_0 = null;

        AntlrDatatypeRuleToken lv_minute_35_0 = null;

        AntlrDatatypeRuleToken lv_second_38_0 = null;

        AntlrDatatypeRuleToken lv_hour_42_0 = null;

        AntlrDatatypeRuleToken lv_minute_44_0 = null;

        AntlrDatatypeRuleToken lv_second_47_0 = null;

        AntlrDatatypeRuleToken lv_minute_51_0 = null;

        AntlrDatatypeRuleToken lv_second_54_0 = null;

        AntlrDatatypeRuleToken lv_second_58_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4631:28: ( ( ( () ( (lv_now_1_0= 'now' ) ) ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4632:1: ( ( () ( (lv_now_1_0= 'now' ) ) ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4632:1: ( ( () ( (lv_now_1_0= 'now' ) ) ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) )
            int alt85=7;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4632:2: ( () ( (lv_now_1_0= 'now' ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4632:2: ( () ( (lv_now_1_0= 'now' ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4632:3: () ( (lv_now_1_0= 'now' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4632:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4633:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4638:2: ( (lv_now_1_0= 'now' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4639:1: (lv_now_1_0= 'now' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4639:1: (lv_now_1_0= 'now' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4640:3: lv_now_1_0= 'now'
                    {
                    lv_now_1_0=(Token)match(input,115,FOLLOW_115_in_ruleLiteralTime10754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_now_1_0, grammarAccess.getLiteralTimeAccess().getNowNowKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralTimeRule());
                      	        }
                             		setWithLastConsumed(current, "now", true, "now");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4654:6: ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4654:6: ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4654:7: () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4654:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4655:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4660:2: ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4660:3: ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4660:3: ( (lv_year_3_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4661:1: (lv_year_3_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4661:1: (lv_year_3_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4662:3: lv_year_3_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getYearNUMBERParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime10806);
                    lv_year_3_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                      	        }
                             		set(
                             			current, 
                             			"year",
                              		lv_year_3_0, 
                              		"NUMBER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,116,FOLLOW_116_in_ruleLiteralTime10818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getLiteralTimeAccess().getYearKeyword_1_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4682:2: ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==RULE_INT) ) {
                        int LA59_1 = input.LA(2);

                        if ( (LA59_1==124) ) {
                            int LA59_3 = input.LA(3);

                            if ( (LA59_3==RULE_INT) ) {
                                int LA59_5 = input.LA(4);

                                if ( (LA59_5==117) ) {
                                    alt59=1;
                                }
                            }
                        }
                        else if ( (LA59_1==117) ) {
                            alt59=1;
                        }
                    }
                    switch (alt59) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4682:3: ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4682:3: ( (lv_month_5_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4683:1: (lv_month_5_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4683:1: (lv_month_5_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4684:3: lv_month_5_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMonthNUMBERParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime10841);
                            lv_month_5_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"month",
                                      		lv_month_5_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_6=(Token)match(input,117,FOLLOW_117_in_ruleLiteralTime10853); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getLiteralTimeAccess().getMonthKeyword_1_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4704:3: ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_INT) ) {
                        int LA60_1 = input.LA(2);

                        if ( (LA60_1==124) ) {
                            int LA60_3 = input.LA(3);

                            if ( (LA60_3==RULE_INT) ) {
                                int LA60_5 = input.LA(4);

                                if ( (LA60_5==118) ) {
                                    alt60=1;
                                }
                            }
                        }
                        else if ( (LA60_1==118) ) {
                            alt60=1;
                        }
                    }
                    switch (alt60) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4704:4: ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4704:4: ( (lv_day_7_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4705:1: (lv_day_7_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4705:1: (lv_day_7_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4706:3: lv_day_7_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getDayNUMBERParserRuleCall_1_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime10877);
                            lv_day_7_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"day",
                                      		lv_day_7_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,118,FOLLOW_118_in_ruleLiteralTime10889); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getLiteralTimeAccess().getDayKeyword_1_3_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4726:3: ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_INT) ) {
                        int LA61_1 = input.LA(2);

                        if ( (LA61_1==124) ) {
                            int LA61_3 = input.LA(3);

                            if ( (LA61_3==RULE_INT) ) {
                                int LA61_5 = input.LA(4);

                                if ( (LA61_5==119) ) {
                                    alt61=1;
                                }
                            }
                        }
                        else if ( (LA61_1==119) ) {
                            alt61=1;
                        }
                    }
                    switch (alt61) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4726:4: ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4726:4: ( (lv_hour_9_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4727:1: (lv_hour_9_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4727:1: (lv_hour_9_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4728:3: lv_hour_9_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getHourNUMBERParserRuleCall_1_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime10913);
                            lv_hour_9_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"hour",
                                      		lv_hour_9_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime10925); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getLiteralTimeAccess().getHourKeyword_1_4_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4748:3: ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_INT) ) {
                        int LA63_1 = input.LA(2);

                        if ( (LA63_1==124) ) {
                            int LA63_3 = input.LA(3);

                            if ( (LA63_3==RULE_INT) ) {
                                int LA63_5 = input.LA(4);

                                if ( ((LA63_5>=120 && LA63_5<=121)) ) {
                                    alt63=1;
                                }
                            }
                        }
                        else if ( ((LA63_1>=120 && LA63_1<=121)) ) {
                            alt63=1;
                        }
                    }
                    switch (alt63) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4748:4: ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4748:4: ( (lv_minute_11_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4749:1: (lv_minute_11_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4749:1: (lv_minute_11_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4750:3: lv_minute_11_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime10949);
                            lv_minute_11_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minute",
                                      		lv_minute_11_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4766:2: (otherlv_12= 'm' | otherlv_13= 'minute' )
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==120) ) {
                                alt62=1;
                            }
                            else if ( (LA62_0==121) ) {
                                alt62=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 62, 0, input);

                                throw nvae;
                            }
                            switch (alt62) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4766:4: otherlv_12= 'm'
                                    {
                                    otherlv_12=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime10962); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_12, grammarAccess.getLiteralTimeAccess().getMKeyword_1_5_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4771:7: otherlv_13= 'minute'
                                    {
                                    otherlv_13=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime10980); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_13, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_1_5_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4775:4: ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_INT) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4775:5: ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4775:5: ( (lv_second_14_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4776:1: (lv_second_14_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4776:1: (lv_second_14_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4777:3: lv_second_14_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_1_6_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11005);
                            lv_second_14_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"second",
                                      		lv_second_14_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4793:2: (otherlv_15= 's' | otherlv_16= 'second' )
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==122) ) {
                                alt64=1;
                            }
                            else if ( (LA64_0==123) ) {
                                alt64=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 64, 0, input);

                                throw nvae;
                            }
                            switch (alt64) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4793:4: otherlv_15= 's'
                                    {
                                    otherlv_15=(Token)match(input,122,FOLLOW_122_in_ruleLiteralTime11018); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_15, grammarAccess.getLiteralTimeAccess().getSKeyword_1_6_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4798:7: otherlv_16= 'second'
                                    {
                                    otherlv_16=(Token)match(input,123,FOLLOW_123_in_ruleLiteralTime11036); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_16, grammarAccess.getLiteralTimeAccess().getSecondKeyword_1_6_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4803:6: ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4803:6: ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4803:7: () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4803:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4804:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4809:2: ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4809:3: ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4809:3: ( (lv_month_18_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4810:1: (lv_month_18_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4810:1: (lv_month_18_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4811:3: lv_month_18_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMonthNUMBERParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11078);
                    lv_month_18_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                      	        }
                             		set(
                             			current, 
                             			"month",
                              		lv_month_18_0, 
                              		"NUMBER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,117,FOLLOW_117_in_ruleLiteralTime11090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getLiteralTimeAccess().getMonthKeyword_2_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4831:2: ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_INT) ) {
                        int LA66_1 = input.LA(2);

                        if ( (LA66_1==124) ) {
                            int LA66_3 = input.LA(3);

                            if ( (LA66_3==RULE_INT) ) {
                                int LA66_5 = input.LA(4);

                                if ( (LA66_5==118) ) {
                                    alt66=1;
                                }
                            }
                        }
                        else if ( (LA66_1==118) ) {
                            alt66=1;
                        }
                    }
                    switch (alt66) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4831:3: ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4831:3: ( (lv_day_20_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4832:1: (lv_day_20_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4832:1: (lv_day_20_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4833:3: lv_day_20_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getDayNUMBERParserRuleCall_2_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11113);
                            lv_day_20_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"day",
                                      		lv_day_20_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_21=(Token)match(input,118,FOLLOW_118_in_ruleLiteralTime11125); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_21, grammarAccess.getLiteralTimeAccess().getDayKeyword_2_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4853:3: ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_INT) ) {
                        int LA67_1 = input.LA(2);

                        if ( (LA67_1==124) ) {
                            int LA67_3 = input.LA(3);

                            if ( (LA67_3==RULE_INT) ) {
                                int LA67_5 = input.LA(4);

                                if ( (LA67_5==119) ) {
                                    alt67=1;
                                }
                            }
                        }
                        else if ( (LA67_1==119) ) {
                            alt67=1;
                        }
                    }
                    switch (alt67) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4853:4: ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4853:4: ( (lv_hour_22_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4854:1: (lv_hour_22_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4854:1: (lv_hour_22_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4855:3: lv_hour_22_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getHourNUMBERParserRuleCall_2_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11149);
                            lv_hour_22_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"hour",
                                      		lv_hour_22_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_23=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime11161); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_23, grammarAccess.getLiteralTimeAccess().getHourKeyword_2_3_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4875:3: ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_INT) ) {
                        int LA69_1 = input.LA(2);

                        if ( (LA69_1==124) ) {
                            int LA69_3 = input.LA(3);

                            if ( (LA69_3==RULE_INT) ) {
                                int LA69_5 = input.LA(4);

                                if ( ((LA69_5>=120 && LA69_5<=121)) ) {
                                    alt69=1;
                                }
                            }
                        }
                        else if ( ((LA69_1>=120 && LA69_1<=121)) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4875:4: ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4875:4: ( (lv_minute_24_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4876:1: (lv_minute_24_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4876:1: (lv_minute_24_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4877:3: lv_minute_24_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_2_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11185);
                            lv_minute_24_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minute",
                                      		lv_minute_24_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4893:2: (otherlv_25= 'm' | otherlv_26= 'minute' )
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==120) ) {
                                alt68=1;
                            }
                            else if ( (LA68_0==121) ) {
                                alt68=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 68, 0, input);

                                throw nvae;
                            }
                            switch (alt68) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4893:4: otherlv_25= 'm'
                                    {
                                    otherlv_25=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime11198); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_25, grammarAccess.getLiteralTimeAccess().getMKeyword_2_4_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4898:7: otherlv_26= 'minute'
                                    {
                                    otherlv_26=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime11216); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_26, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_2_4_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4902:4: ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_INT) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4902:5: ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4902:5: ( (lv_second_27_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4903:1: (lv_second_27_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4903:1: (lv_second_27_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4904:3: lv_second_27_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_2_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11241);
                            lv_second_27_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"second",
                                      		lv_second_27_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4920:2: (otherlv_28= 's' | otherlv_29= 'second' )
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==122) ) {
                                alt70=1;
                            }
                            else if ( (LA70_0==123) ) {
                                alt70=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 70, 0, input);

                                throw nvae;
                            }
                            switch (alt70) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4920:4: otherlv_28= 's'
                                    {
                                    otherlv_28=(Token)match(input,122,FOLLOW_122_in_ruleLiteralTime11254); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_28, grammarAccess.getLiteralTimeAccess().getSKeyword_2_5_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4925:7: otherlv_29= 'second'
                                    {
                                    otherlv_29=(Token)match(input,123,FOLLOW_123_in_ruleLiteralTime11272); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_29, grammarAccess.getLiteralTimeAccess().getSecondKeyword_2_5_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4930:6: ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4930:6: ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4930:7: () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4930:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4931:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4936:2: ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4936:3: ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4936:3: ( (lv_day_31_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4937:1: (lv_day_31_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4937:1: (lv_day_31_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4938:3: lv_day_31_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getDayNUMBERParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11314);
                    lv_day_31_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                      	        }
                             		set(
                             			current, 
                             			"day",
                              		lv_day_31_0, 
                              		"NUMBER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,118,FOLLOW_118_in_ruleLiteralTime11326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getLiteralTimeAccess().getDayKeyword_3_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4958:2: ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==RULE_INT) ) {
                        int LA72_1 = input.LA(2);

                        if ( (LA72_1==124) ) {
                            int LA72_3 = input.LA(3);

                            if ( (LA72_3==RULE_INT) ) {
                                int LA72_5 = input.LA(4);

                                if ( (LA72_5==119) ) {
                                    alt72=1;
                                }
                            }
                        }
                        else if ( (LA72_1==119) ) {
                            alt72=1;
                        }
                    }
                    switch (alt72) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4958:3: ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4958:3: ( (lv_hour_33_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4959:1: (lv_hour_33_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4959:1: (lv_hour_33_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4960:3: lv_hour_33_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getHourNUMBERParserRuleCall_3_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11349);
                            lv_hour_33_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"hour",
                                      		lv_hour_33_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_34=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime11361); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_34, grammarAccess.getLiteralTimeAccess().getHourKeyword_3_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4980:3: ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_INT) ) {
                        int LA74_1 = input.LA(2);

                        if ( (LA74_1==124) ) {
                            int LA74_3 = input.LA(3);

                            if ( (LA74_3==RULE_INT) ) {
                                int LA74_5 = input.LA(4);

                                if ( ((LA74_5>=120 && LA74_5<=121)) ) {
                                    alt74=1;
                                }
                            }
                        }
                        else if ( ((LA74_1>=120 && LA74_1<=121)) ) {
                            alt74=1;
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4980:4: ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4980:4: ( (lv_minute_35_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4981:1: (lv_minute_35_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4981:1: (lv_minute_35_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4982:3: lv_minute_35_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_3_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11385);
                            lv_minute_35_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minute",
                                      		lv_minute_35_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4998:2: (otherlv_36= 'm' | otherlv_37= 'minute' )
                            int alt73=2;
                            int LA73_0 = input.LA(1);

                            if ( (LA73_0==120) ) {
                                alt73=1;
                            }
                            else if ( (LA73_0==121) ) {
                                alt73=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 73, 0, input);

                                throw nvae;
                            }
                            switch (alt73) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4998:4: otherlv_36= 'm'
                                    {
                                    otherlv_36=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime11398); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_36, grammarAccess.getLiteralTimeAccess().getMKeyword_3_3_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5003:7: otherlv_37= 'minute'
                                    {
                                    otherlv_37=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime11416); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_37, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_3_3_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5007:4: ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==RULE_INT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5007:5: ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5007:5: ( (lv_second_38_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5008:1: (lv_second_38_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5008:1: (lv_second_38_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5009:3: lv_second_38_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_3_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11441);
                            lv_second_38_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"second",
                                      		lv_second_38_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5025:2: (otherlv_39= 's' | otherlv_40= 'second' )
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==122) ) {
                                alt75=1;
                            }
                            else if ( (LA75_0==123) ) {
                                alt75=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 75, 0, input);

                                throw nvae;
                            }
                            switch (alt75) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5025:4: otherlv_39= 's'
                                    {
                                    otherlv_39=(Token)match(input,122,FOLLOW_122_in_ruleLiteralTime11454); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_39, grammarAccess.getLiteralTimeAccess().getSKeyword_3_4_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5030:7: otherlv_40= 'second'
                                    {
                                    otherlv_40=(Token)match(input,123,FOLLOW_123_in_ruleLiteralTime11472); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_40, grammarAccess.getLiteralTimeAccess().getSecondKeyword_3_4_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5035:6: ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5035:6: ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5035:7: () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5035:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5036:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5041:2: ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5041:3: ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5041:3: ( (lv_hour_42_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5042:1: (lv_hour_42_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5042:1: (lv_hour_42_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5043:3: lv_hour_42_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getHourNUMBERParserRuleCall_4_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11514);
                    lv_hour_42_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                      	        }
                             		set(
                             			current, 
                             			"hour",
                              		lv_hour_42_0, 
                              		"NUMBER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_43=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime11526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getLiteralTimeAccess().getHourKeyword_4_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5063:2: ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==RULE_INT) ) {
                        int LA78_1 = input.LA(2);

                        if ( (LA78_1==124) ) {
                            int LA78_3 = input.LA(3);

                            if ( (LA78_3==RULE_INT) ) {
                                int LA78_5 = input.LA(4);

                                if ( ((LA78_5>=120 && LA78_5<=121)) ) {
                                    alt78=1;
                                }
                            }
                        }
                        else if ( ((LA78_1>=120 && LA78_1<=121)) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5063:3: ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5063:3: ( (lv_minute_44_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5064:1: (lv_minute_44_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5064:1: (lv_minute_44_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5065:3: lv_minute_44_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_4_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11549);
                            lv_minute_44_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minute",
                                      		lv_minute_44_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5081:2: (otherlv_45= 'm' | otherlv_46= 'minute' )
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==120) ) {
                                alt77=1;
                            }
                            else if ( (LA77_0==121) ) {
                                alt77=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 77, 0, input);

                                throw nvae;
                            }
                            switch (alt77) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5081:4: otherlv_45= 'm'
                                    {
                                    otherlv_45=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime11562); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_45, grammarAccess.getLiteralTimeAccess().getMKeyword_4_2_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5086:7: otherlv_46= 'minute'
                                    {
                                    otherlv_46=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime11580); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_46, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_4_2_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5090:4: ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_INT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5090:5: ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5090:5: ( (lv_second_47_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5091:1: (lv_second_47_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5091:1: (lv_second_47_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5092:3: lv_second_47_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_4_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11605);
                            lv_second_47_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"second",
                                      		lv_second_47_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5108:2: (otherlv_48= 's' | otherlv_49= 'second' )
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==122) ) {
                                alt79=1;
                            }
                            else if ( (LA79_0==123) ) {
                                alt79=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 79, 0, input);

                                throw nvae;
                            }
                            switch (alt79) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5108:4: otherlv_48= 's'
                                    {
                                    otherlv_48=(Token)match(input,122,FOLLOW_122_in_ruleLiteralTime11618); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_48, grammarAccess.getLiteralTimeAccess().getSKeyword_4_3_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5113:7: otherlv_49= 'second'
                                    {
                                    otherlv_49=(Token)match(input,123,FOLLOW_123_in_ruleLiteralTime11636); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_49, grammarAccess.getLiteralTimeAccess().getSecondKeyword_4_3_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5118:6: ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5118:6: ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5118:7: () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5118:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5119:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5124:2: ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5124:3: ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5124:3: ( (lv_minute_51_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5125:1: (lv_minute_51_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5125:1: (lv_minute_51_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5126:3: lv_minute_51_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11678);
                    lv_minute_51_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                      	        }
                             		set(
                             			current, 
                             			"minute",
                              		lv_minute_51_0, 
                              		"NUMBER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5142:2: (otherlv_52= 'm' | otherlv_53= 'minute' )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==120) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==121) ) {
                        alt81=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5142:4: otherlv_52= 'm'
                            {
                            otherlv_52=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime11691); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_52, grammarAccess.getLiteralTimeAccess().getMKeyword_5_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5147:7: otherlv_53= 'minute'
                            {
                            otherlv_53=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime11709); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_53, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_5_1_1_1());
                                  
                            }

                            }
                            break;

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5151:3: ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_INT) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5151:4: ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5151:4: ( (lv_second_54_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5152:1: (lv_second_54_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5152:1: (lv_second_54_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5153:3: lv_second_54_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_5_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11733);
                            lv_second_54_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"second",
                                      		lv_second_54_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5169:2: (otherlv_55= 's' | otherlv_56= 'second' )
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==122) ) {
                                alt82=1;
                            }
                            else if ( (LA82_0==123) ) {
                                alt82=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 82, 0, input);

                                throw nvae;
                            }
                            switch (alt82) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5169:4: otherlv_55= 's'
                                    {
                                    otherlv_55=(Token)match(input,122,FOLLOW_122_in_ruleLiteralTime11746); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_55, grammarAccess.getLiteralTimeAccess().getSKeyword_5_2_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5174:7: otherlv_56= 'second'
                                    {
                                    otherlv_56=(Token)match(input,123,FOLLOW_123_in_ruleLiteralTime11764); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_56, grammarAccess.getLiteralTimeAccess().getSecondKeyword_5_2_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5179:6: ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5179:6: ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5179:7: () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5179:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5180:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5185:2: ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5185:3: ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5185:3: ( (lv_second_58_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5186:1: (lv_second_58_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5186:1: (lv_second_58_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5187:3: lv_second_58_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_6_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11806);
                    lv_second_58_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
                      	        }
                             		set(
                             			current, 
                             			"second",
                              		lv_second_58_0, 
                              		"NUMBER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5203:2: (otherlv_59= 's' | otherlv_60= 'second' )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==122) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==123) ) {
                        alt84=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5203:4: otherlv_59= 's'
                            {
                            otherlv_59=(Token)match(input,122,FOLLOW_122_in_ruleLiteralTime11819); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_59, grammarAccess.getLiteralTimeAccess().getSKeyword_6_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5208:7: otherlv_60= 'second'
                            {
                            otherlv_60=(Token)match(input,123,FOLLOW_123_in_ruleLiteralTime11837); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_60, grammarAccess.getLiteralTimeAccess().getSecondKeyword_6_1_1_1());
                                  
                            }

                            }
                            break;

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
    // $ANTLR end "ruleLiteralTime"


    // $ANTLR start "entryRuleNUMBER"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5220:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5221:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5222:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER11877);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER11888); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5229:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5232:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5233:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5233:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5233:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER11928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5240:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==124) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5241:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,124,FOLLOW_124_in_ruleNUMBER11947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER11962); if (state.failed) return current;
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

    // $ANTLR start synpred2_InternalLil
    public final void synpred2_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2433:3: ( ( () ( ( ruleExpressionOrOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2433:4: ( () ( ( ruleExpressionOrOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2433:4: ( () ( ( ruleExpressionOrOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2433:5: () ( ( ruleExpressionOrOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2433:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2434:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2434:2: ( ( ruleExpressionOrOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2435:1: ( ruleExpressionOrOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2435:1: ( ruleExpressionOrOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2436:1: ruleExpressionOrOp
        {
        pushFollow(FOLLOW_ruleExpressionOrOp_in_synpred2_InternalLil5326);
        ruleExpressionOrOp();

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
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2537:3: ( ( () ( ( ruleExpressionAndOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2537:4: ( () ( ( ruleExpressionAndOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2537:4: ( () ( ( ruleExpressionAndOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2537:5: () ( ( ruleExpressionAndOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2537:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2538:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2538:2: ( ( ruleExpressionAndOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2539:1: ( ruleExpressionAndOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2539:1: ( ruleExpressionAndOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2540:1: ruleExpressionAndOp
        {
        pushFollow(FOLLOW_ruleExpressionAndOp_in_synpred3_InternalLil5581);
        ruleExpressionAndOp();

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
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2641:3: ( ( () ( ( ruleExpressionEqualityOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2641:4: ( () ( ( ruleExpressionEqualityOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2641:4: ( () ( ( ruleExpressionEqualityOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2641:5: () ( ( ruleExpressionEqualityOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2641:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2642:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2642:2: ( ( ruleExpressionEqualityOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2643:1: ( ruleExpressionEqualityOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2643:1: ( ruleExpressionEqualityOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2644:1: ruleExpressionEqualityOp
        {
        pushFollow(FOLLOW_ruleExpressionEqualityOp_in_synpred4_InternalLil5836);
        ruleExpressionEqualityOp();

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
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:3: ( ( () ( ( ruleExpressionCompareOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:4: ( () ( ( ruleExpressionCompareOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:4: ( () ( ( ruleExpressionCompareOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:5: () ( ( ruleExpressionCompareOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2753:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2753:2: ( ( ruleExpressionCompareOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2754:1: ( ruleExpressionCompareOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2754:1: ( ruleExpressionCompareOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2755:1: ruleExpressionCompareOp
        {
        pushFollow(FOLLOW_ruleExpressionCompareOp_in_synpred5_InternalLil6112);
        ruleExpressionCompareOp();

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
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2877:3: ( ( () ( ( ruleExpressionOtherOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2877:4: ( () ( ( ruleExpressionOtherOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2877:4: ( () ( ( ruleExpressionOtherOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2877:5: () ( ( ruleExpressionOtherOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2877:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2878:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2878:2: ( ( ruleExpressionOtherOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2879:1: ( ruleExpressionOtherOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2879:1: ( ruleExpressionOtherOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2880:1: ruleExpressionOtherOp
        {
        pushFollow(FOLLOW_ruleExpressionOtherOp_in_synpred6_InternalLil6426);
        ruleExpressionOtherOp();

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
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2988:3: ( ( () ( ( ruleExpressionAdditionOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2988:4: ( () ( ( ruleExpressionAdditionOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2988:4: ( () ( ( ruleExpressionAdditionOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2988:5: () ( ( ruleExpressionAdditionOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2988:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2989:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2989:2: ( ( ruleExpressionAdditionOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2990:1: ( ruleExpressionAdditionOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2990:1: ( ruleExpressionAdditionOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2991:1: ruleExpressionAdditionOp
        {
        pushFollow(FOLLOW_ruleExpressionAdditionOp_in_synpred7_InternalLil6702);
        ruleExpressionAdditionOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalLil

    // $ANTLR start synpred8_InternalLil
    public final void synpred8_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3099:3: ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3099:4: ( () ( ( ruleExpressionMultiplicationOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3099:4: ( () ( ( ruleExpressionMultiplicationOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3099:5: () ( ( ruleExpressionMultiplicationOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3099:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3100:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3100:2: ( ( ruleExpressionMultiplicationOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3101:1: ( ruleExpressionMultiplicationOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3101:1: ( ruleExpressionMultiplicationOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3102:1: ruleExpressionMultiplicationOp
        {
        pushFollow(FOLLOW_ruleExpressionMultiplicationOp_in_synpred8_InternalLil6978);
        ruleExpressionMultiplicationOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalLil

    // $ANTLR start synpred12_InternalLil
    public final void synpred12_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3876:3: ( ( ruleExpressionCase ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3877:1: ( ruleExpressionCase )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3877:1: ( ruleExpressionCase )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3878:1: ruleExpressionCase
        {
        pushFollow(FOLLOW_ruleExpressionCase_in_synpred12_InternalLil8892);
        ruleExpressionCase();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalLil

    // $ANTLR start synpred13_InternalLil
    public final void synpred13_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3898:5: ( 'default' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3898:7: 'default'
        {
        match(input,77,FOLLOW_77_in_synpred13_InternalLil8923); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalLil

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
    public final boolean synpred8_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalLil_fragment(); // can never throw exception
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


    protected DFA47 dfa47 = new DFA47(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String DFA47_eotS =
        "\14\uffff";
    static final String DFA47_eofS =
        "\3\uffff\1\12\7\uffff\1\12";
    static final String DFA47_minS =
        "\1\4\2\uffff\1\4\5\uffff\1\6\1\uffff\1\4";
    static final String DFA47_maxS =
        "\1\163\2\uffff\1\174\5\uffff\1\6\1\uffff\1\173";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\3\1\uffff";
    static final String DFA47_specialS =
        "\14\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\10\1\5\1\3\12\uffff\1\1\2\uffff\1\1\1\uffff\1\7\131\uffff"+
            "\2\2\1\4\1\6",
            "",
            "",
            "\1\12\7\uffff\1\12\5\uffff\2\12\1\uffff\1\12\10\uffff\1\12"+
            "\24\uffff\4\12\1\uffff\20\12\2\uffff\2\12\1\uffff\2\12\45\uffff"+
            "\10\6\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "\1\12\7\uffff\1\12\5\uffff\2\12\1\uffff\1\12\10\uffff\1\12"+
            "\24\uffff\4\12\1\uffff\20\12\2\uffff\2\12\1\uffff\2\12\45\uffff"+
            "\10\6"
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "3402:1: (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralString_4= ruleLiteralString | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | ( () ( (otherlv_8= RULE_ID ) ) ) )";
        }
    }
    static final String DFA85_eotS =
        "\13\uffff";
    static final String DFA85_eofS =
        "\13\uffff";
    static final String DFA85_minS =
        "\1\6\1\uffff\1\164\1\6\6\uffff\1\164";
    static final String DFA85_maxS =
        "\1\163\1\uffff\1\174\1\6\6\uffff\1\173";
    static final String DFA85_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\1\3\1\4\1\7\1\6\1\2\1\uffff";
    static final String DFA85_specialS =
        "\13\uffff}>";
    static final String[] DFA85_transitionS = {
            "\1\2\154\uffff\1\1",
            "",
            "\1\11\1\5\1\6\1\4\2\10\2\7\1\3",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\5\1\6\1\4\2\10\2\7"
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "4632:1: ( ( () ( (lv_now_1_0= 'now' ) ) ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLilModel_in_entryRuleLilModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorTypeDefinition_in_ruleLilModel131 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDataTypeDefinition_in_ruleLilModel158 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInteractorTypeDefinition_in_ruleLilModel185 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleActorTypeDefinition_in_entryRuleActorTypeDefinition222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorTypeDefinition232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorTypeDefinition274 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleActorTypeDefinition291 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActorTypeDefinition303 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleActorComponent_in_ruleActorTypeDefinition324 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleActorType_in_entryRuleActorType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorType371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorBaseType_in_ruleActorType417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorType443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorBaseType_in_entryRuleActorBaseType480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorBaseType491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleActorBaseType529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleActorBaseType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorComponent_in_entryRuleActorComponent588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorComponent598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorComponent640 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActorComponent657 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_ruleActorType_in_ruleActorComponent678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDefinition_in_entryRuleDataTypeDefinition714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDefinition724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeDefinition776 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataTypeDefinition793 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataTypeDefinition805 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDataComponent_in_ruleDataTypeDefinition826 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeDefinition861 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataTypeDefinition878 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataTypeDefinition890 = new BitSet(new long[]{0x000000001F800010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataTypeDefinition911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataBaseType_in_ruleDataType1006 = new BitSet(new long[]{0x00000003E0010002L});
    public static final BitSet FOLLOW_16_in_ruleDataType1019 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_ruleDataDefinitionSet_in_ruleDataType1040 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1069 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_ruleDataCollectionType_in_ruleDataType1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinitionSet_in_entryRuleDataDefinitionSet1128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinitionSet1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDataDefinitionSet1185 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleDataDefinitionEnumElement_in_ruleDataDefinitionSet1206 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleDataDefinitionSet1219 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleDataDefinitionEnumElement_in_ruleDataDefinitionSet1240 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleDataDefinitionSet1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDataDefinitionSet1283 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataDefinitionSet1304 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleDataDefinitionSet1317 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataDefinitionSet1338 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleDataDefinitionSet1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDataDefinitionSet1381 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataDefinitionSet1402 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataDefinitionSet1414 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataDefinitionSet1435 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDataDefinitionSet1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinitionEnumElement_in_entryRuleDataDefinitionEnumElement1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinitionEnumElement1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDataDefinitionEnumElement1540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataDefinitionEnumElement1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataBaseType_in_entryRuleDataBaseType1599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataBaseType1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDataBaseType1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDataBaseType1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDataBaseType1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDataBaseType1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDataBaseType1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDataBaseType1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataCollectionType_in_entryRuleDataCollectionType1783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataCollectionType1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDataCollectionType1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDataCollectionType1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDataCollectionType1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDataCollectionType1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDataCollectionType1985 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDataCollectionType2019 = new BitSet(new long[]{0x000000001F800010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataCollectionType2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataComponent_in_entryRuleDataComponent2079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataComponent2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataComponent2131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataComponent2148 = new BitSet(new long[]{0x000000001F800010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataComponent2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorTypeDefinition_in_entryRuleInteractorTypeDefinition2205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorTypeDefinition2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorTypeDefinition2257 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInteractorTypeDefinition2274 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractorTypeDefinition2286 = new BitSet(new long[]{0x0028000000000012L});
    public static final BitSet FOLLOW_ruleInteractorActor_in_ruleInteractorTypeDefinition2308 = new BitSet(new long[]{0x0028000000000012L});
    public static final BitSet FOLLOW_ruleInteractorData_in_ruleInteractorTypeDefinition2335 = new BitSet(new long[]{0x0028000000000012L});
    public static final BitSet FOLLOW_ruleInteractorComponent_in_ruleInteractorTypeDefinition2362 = new BitSet(new long[]{0x0028000000000012L});
    public static final BitSet FOLLOW_ruleInteractorBehavior_in_ruleInteractorTypeDefinition2389 = new BitSet(new long[]{0x0028000000000012L});
    public static final BitSet FOLLOW_ruleInteractorType_in_entryRuleInteractorType2427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorType2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorType2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorActor_in_entryRuleInteractorActor2516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorActor2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorActor2568 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractorActor2585 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_ruleActorType_in_ruleInteractorActor2606 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleInteractorActor2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorData_in_entryRuleInteractorData2654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorData2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorData2706 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractorData2723 = new BitSet(new long[]{0x000000001F800010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleInteractorData2744 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_ruleInteractorDataComponentMode_in_ruleInteractorData2765 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleInteractorData2778 = new BitSet(new long[]{0x0003F80000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorData2799 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleInteractorData2814 = new BitSet(new long[]{0x0003F80000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorData2835 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleInteractorSignalAlias_in_entryRuleInteractorSignalAlias2873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorSignalAlias2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_ruleInteractorSignalAlias2929 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleInteractorSignalAlias2942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorSignalAlias2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorDataComponentMode_in_entryRuleInteractorDataComponentMode3001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorDataComponentMode3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInteractorDataComponentMode3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInteractorDataComponentMode3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleInteractorDataComponentMode3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorComponent_in_entryRuleInteractorComponent3128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorComponent3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorComponent3180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractorComponent3197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorType_in_ruleInteractorComponent3218 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInteractorComponent3230 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleInteractorComponent3243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActorAlias_in_ruleInteractorComponent3264 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleInteractorComponent3277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActorAlias_in_ruleInteractorComponent3298 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_entryRuleAccessibleEntity3338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessibleEntity3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericEntity_in_ruleAccessibleEntity3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAccessibleEntity3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericEntity_in_entryRuleGenericEntity3457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericEntity3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleGenericEntity3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleGenericEntity3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleGenericEntity3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleGenericEntity3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleGenericEntity3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleGenericEntity3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleGenericEntity3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorAlias_in_entryRuleActorAlias3662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorAlias3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorAlias3717 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleActorAlias3729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorAlias3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorSignalReception_in_entryRuleInteractorSignalReception3785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorSignalReception3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorSignalReception3841 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleInteractorSignalReception3854 = new BitSet(new long[]{0x0003F80000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorSignalReception3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleInteractorSignalReception3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorSignalEmission_in_entryRuleInteractorSignalEmission3951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorSignalEmission3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorSignalEmission4006 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleInteractorSignalEmission4019 = new BitSet(new long[]{0x0003F80000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorSignalEmission4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehavior_in_entryRuleInteractorBehavior4078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehavior4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorCause_in_ruleInteractorBehavior4134 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractorBehavior4146 = new BitSet(new long[]{0x0140000040000000L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorEffect_in_ruleInteractorBehavior4167 = new BitSet(new long[]{0x0140000040000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorCause_in_entryRuleInteractorBehaviorCause4204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorCause4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorOnCause_in_ruleInteractorBehaviorCause4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorWhenCause_in_ruleInteractorBehaviorCause4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorOnCause_in_entryRuleInteractorBehaviorOnCause4323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorOnCause4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleInteractorBehaviorOnCause4370 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalReception_in_ruleInteractorBehaviorOnCause4391 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInteractorBehaviorOnCause4404 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorOnCause4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorWhenCause_in_entryRuleInteractorBehaviorWhenCause4463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorWhenCause4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInteractorBehaviorWhenCause4510 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorWhenCause4531 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInteractorBehaviorWhenCause4544 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorWhenCause4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorEffect_in_entryRuleInteractorBehaviorEffect4603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorEffect4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorAlwaysEffect_in_ruleInteractorBehaviorEffect4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorSetEffect_in_ruleInteractorBehaviorEffect4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorTriggerEffect_in_ruleInteractorBehaviorEffect4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorAlwaysEffect_in_entryRuleInteractorBehaviorAlwaysEffect4749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorAlwaysEffect4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInteractorBehaviorAlwaysEffect4796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalEmission_in_ruleInteractorBehaviorAlwaysEffect4817 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleInteractorBehaviorAlwaysEffect4829 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorAlwaysEffect4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorSetEffect_in_entryRuleInteractorBehaviorSetEffect4886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorSetEffect4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleInteractorBehaviorSetEffect4933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalEmission_in_ruleInteractorBehaviorSetEffect4954 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleInteractorBehaviorSetEffect4966 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorSetEffect4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorTriggerEffect_in_entryRuleInteractorBehaviorTriggerEffect5023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorTriggerEffect5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInteractorBehaviorTriggerEffect5070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalEmission_in_ruleInteractorBehaviorTriggerEffect5091 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleInteractorBehaviorTriggerEffect5103 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorTriggerEffect5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOr_in_ruleExpression5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOr_in_entryRuleExpressionOr5250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOr5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAnd_in_ruleExpressionOr5307 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOrOp_in_ruleExpressionOr5356 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionAnd_in_ruleExpressionOr5379 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOrOp_in_entryRuleExpressionOrOp5418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOrOp5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleExpressionOrOp5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAnd_in_entryRuleExpressionAnd5505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAnd5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEquality_in_ruleExpressionAnd5562 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAndOp_in_ruleExpressionAnd5611 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionEquality_in_ruleExpressionAnd5634 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAndOp_in_entryRuleExpressionAndOp5673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAndOp5684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleExpressionAndOp5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEquality_in_entryRuleExpressionEquality5760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionEquality5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCompare_in_ruleExpressionEquality5817 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEqualityOp_in_ruleExpressionEquality5866 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionCompare_in_ruleExpressionEquality5889 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEqualityOp_in_entryRuleExpressionEqualityOp5928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionEqualityOp5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleExpressionEqualityOp5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleExpressionEqualityOp5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCompare_in_entryRuleExpressionCompare6036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionCompare6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOther_in_ruleExpressionCompare6093 = new BitSet(new long[]{0xE000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpressionCompareOp_in_ruleExpressionCompare6142 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionOther_in_ruleExpressionCompare6165 = new BitSet(new long[]{0xE000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpressionCompareOp_in_entryRuleExpressionCompareOp6204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionCompareOp6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleExpressionCompareOp6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleExpressionCompareOp6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleExpressionCompareOp6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleExpressionCompareOp6310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOther_in_entryRuleExpressionOther6350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOther6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAddition_in_ruleExpressionOther6407 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleExpressionOtherOp_in_ruleExpressionOther6456 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionAddition_in_ruleExpressionOther6479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleExpressionOtherOp_in_entryRuleExpressionOtherOp6518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOtherOp6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleExpressionOtherOp6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleExpressionOtherOp6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAddition_in_entryRuleExpressionAddition6626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAddition6636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMultiplication_in_ruleExpressionAddition6683 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleExpressionAdditionOp_in_ruleExpressionAddition6732 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionMultiplication_in_ruleExpressionAddition6755 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleExpressionAdditionOp_in_entryRuleExpressionAdditionOp6794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAdditionOp6805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleExpressionAdditionOp6843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleExpressionAdditionOp6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMultiplication_in_entryRuleExpressionMultiplication6902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionMultiplication6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionUnary_in_ruleExpressionMultiplication6959 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleExpressionMultiplicationOp_in_ruleExpressionMultiplication7008 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionUnary_in_ruleExpressionMultiplication7031 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleExpressionMultiplicationOp_in_entryRuleExpressionMultiplicationOp7070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionMultiplicationOp7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleExpressionMultiplicationOp7119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleExpressionMultiplicationOp7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleExpressionMultiplicationOp7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionUnary_in_entryRuleExpressionUnary7197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionUnary7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionUnaryOp_in_ruleExpressionUnary7263 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionPrimary_in_ruleExpressionUnary7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionPrimary_in_ruleExpressionUnary7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionUnaryOp_in_entryRuleExpressionUnaryOp7349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionUnaryOp7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleExpressionUnaryOp7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleExpressionUnaryOp7417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleExpressionUnaryOp7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionPrimary_in_entryRuleExpressionPrimary7476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionPrimary7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionSwitch_in_ruleExpressionPrimary7533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionIf_in_ruleExpressionPrimary7560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteral_in_ruleExpressionPrimary7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionForEach_in_ruleExpressionPrimary7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFunctionCall_in_ruleExpressionPrimary7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionParenthesized_in_ruleExpressionPrimary7668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteral_in_entryRuleExpressionLiteral7703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionLiteral7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralCollection_in_ruleExpressionLiteral7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_ruleExpressionLiteral7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleExpressionLiteral7814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNull_in_ruleExpressionLiteral7841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralString_in_ruleExpressionLiteral7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_ruleExpressionLiteral7895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralEnum_in_ruleExpressionLiteral7922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionLiteral7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralCollection_in_entryRuleExpressionLiteralCollection7994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionLiteralCollection8004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralSet_in_ruleExpressionLiteralCollection8051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralList_in_ruleExpressionLiteralCollection8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralSet_in_entryRuleExpressionLiteralSet8113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionLiteralSet8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleExpressionLiteralSet8169 = new BitSet(new long[]{0x00100000005A0070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionLiteralSet8191 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleExpressionLiteralSet8204 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionLiteralSet8225 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleExpressionLiteralSet8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralList_in_entryRuleExpressionLiteralList8277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionLiteralList8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleExpressionLiteralList8333 = new BitSet(new long[]{0x0010000000720070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionLiteralList8355 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_ruleExpressionLiteralList8368 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionLiteralList8389 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleExpressionLiteralList8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionParenthesized_in_entryRuleExpressionParenthesized8441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionParenthesized8451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleExpressionParenthesized8488 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionParenthesized8510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleExpressionParenthesized8521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionIf_in_entryRuleExpressionIf8557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionIf8567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExpressionIf8613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleExpressionIf8625 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionIf8646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleExpressionIf8666 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionIf8688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleExpressionIf8709 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionIf8731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionSwitch_in_entryRuleExpressionSwitch8768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionSwitch8778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleExpressionSwitch8824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleExpressionSwitch8836 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSwitch8857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleExpressionSwitch8877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleExpressionCase_in_ruleExpressionSwitch8909 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleExpressionSwitch8931 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExpressionSwitch8944 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSwitch8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCase_in_entryRuleExpressionCase9003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionCase9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleExpressionCase9050 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionCase9071 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExpressionCase9083 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionCase9104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionForEach_in_entryRuleExpressionForEach9140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionForEach9150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleExpressionForEach9196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleExpressionForEach9208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleExpressionForEach9220 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionForEach9241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleExpressionForEach9253 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionForEach9274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFunctionCall_in_entryRuleExpressionFunctionCall9310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionFunctionCall9320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFunctionCallBase_in_ruleExpressionFunctionCall9375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleExpressionFunctionCall9387 = new BitSet(new long[]{0x0010000000560070L,0x000FFFFFFFFE9718L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionFunctionCall9408 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_18_in_ruleExpressionFunctionCall9422 = new BitSet(new long[]{0x0010000000520070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionFunctionCall9443 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleExpressionFunctionCall9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFunctionCallBase_in_entryRuleExpressionFunctionCallBase9494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionFunctionCallBase9505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleExpressionFunctionCallBase9543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleExpressionFunctionCallBase9562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleExpressionFunctionCallBase9581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleExpressionFunctionCallBase9600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleExpressionFunctionCallBase9619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleExpressionFunctionCallBase9638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleExpressionFunctionCallBase9657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleExpressionFunctionCallBase9676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleExpressionFunctionCallBase9695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleExpressionFunctionCallBase9714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleExpressionFunctionCallBase9733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleExpressionFunctionCallBase9752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleExpressionFunctionCallBase9771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleExpressionFunctionCallBase9790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleExpressionFunctionCallBase9809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleExpressionFunctionCallBase9828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleExpressionFunctionCallBase9847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleExpressionFunctionCallBase9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleExpressionFunctionCallBase9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleExpressionFunctionCallBase9904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleExpressionFunctionCallBase9923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleExpressionFunctionCallBase9942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleExpressionFunctionCallBase9961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleExpressionFunctionCallBase9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleExpressionFunctionCallBase9999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleExpressionFunctionCallBase10018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleExpressionFunctionCallBase10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleExpressionFunctionCallBase10056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleExpressionFunctionCallBase10075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleExpressionFunctionCallBase10094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleExpressionFunctionCallBase10113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean10153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean10163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleLiteralBoolean10210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleLiteralBoolean10234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull10284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNull10294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleLiteralNull10340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_entryRuleLiteralNumber10376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNumber10386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralNumber10441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralString_in_entryRuleLiteralString10477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralString10487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralString10538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralEnum_in_entryRuleLiteralEnum10579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralEnum10589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLiteralEnum10635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralEnum10655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_entryRuleLiteralTime10691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralTime10701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleLiteralTime10754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime10806 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleLiteralTime10818 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime10841 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleLiteralTime10853 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime10877 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleLiteralTime10889 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime10913 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime10925 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime10949 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime10962 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime10980 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11005 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_ruleLiteralTime11018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLiteralTime11036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11078 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleLiteralTime11090 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11113 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleLiteralTime11125 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11149 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime11161 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11185 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime11198 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime11216 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11241 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_ruleLiteralTime11254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLiteralTime11272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11314 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleLiteralTime11326 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11349 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime11361 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11385 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime11398 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime11416 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11441 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_ruleLiteralTime11454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLiteralTime11472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11514 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime11526 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11549 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime11562 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime11580 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11605 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_ruleLiteralTime11618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLiteralTime11636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11678 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime11691 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime11709 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11733 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_ruleLiteralTime11746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLiteralTime11764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11806 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_ruleLiteralTime11819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLiteralTime11837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER11877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER11888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER11928 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleNUMBER11947 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER11962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOrOp_in_synpred2_InternalLil5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAndOp_in_synpred3_InternalLil5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEqualityOp_in_synpred4_InternalLil5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCompareOp_in_synpred5_InternalLil6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOtherOp_in_synpred6_InternalLil6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAdditionOp_in_synpred7_InternalLil6702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMultiplicationOp_in_synpred8_InternalLil6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCase_in_synpred12_InternalLil8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred13_InternalLil8923 = new BitSet(new long[]{0x0000000000000002L});

}
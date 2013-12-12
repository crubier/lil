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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'actor'", "':'", "'input'", "'output'", "'data'", "'void'", "'symbol'", "'in'", "'number'", "'text'", "'time'", "'identifier'", "'collection'", "'set'", "'list'", "'queue'", "'{'", "','", "'}'", "'#'", "'['", "']'", "'interactor'", "'with'", "'event'", "'from'", "'to'", "'flow'", "'constant'", "'as'", "'any'", "'self'", "'other'", "'parent'", "'child'", "'all'", "'actors'", "'init'", "'on'", "'if'", "'when'", "'always'", "'='", "'trigger'", "'or'", "'and'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'<>'", "'?:'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'('", "')'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'each'", "'math.abs'", "'math.acos'", "'math.acosh'", "'math.asin'", "'math.asinh'", "'math.atan'", "'math.atanh'", "'math.atan2'", "'math.ceil'", "'math.clip'", "'math.cos'", "'math.cosh'", "'math.exp'", "'math.floor'", "'math.fround'", "'math.hypot'", "'math.log'", "'math.log10'", "'math.log2'", "'math.max'", "'math.min'", "'math.pow'", "'math.random'", "'math.round'", "'math.sign'", "'math.sin'", "'math.sinh'", "'math.sqrt'", "'math.tan'", "'math.tanh'", "'math.trunc'", "'false'", "'true'", "'null'", "'now'", "'year'", "'month'", "'day'", "'hour'", "'m'", "'minute'", "'s'", "'second'", "'.'", "'.*'"
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
    public static final int T__125=125;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:76:1: ruleLilModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImportStatement ) )* ( ( (lv_actorType_3_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_4_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_5_0= ruleInteractorTypeDefinition ) ) )* ) ;
    public final EObject ruleLilModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_actorType_3_0 = null;

        EObject lv_dataType_4_0 = null;

        EObject lv_interactorType_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImportStatement ) )* ( ( (lv_actorType_3_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_4_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_5_0= ruleInteractorTypeDefinition ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImportStatement ) )* ( ( (lv_actorType_3_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_4_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_5_0= ruleInteractorTypeDefinition ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImportStatement ) )* ( ( (lv_actorType_3_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_4_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_5_0= ruleInteractorTypeDefinition ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImportStatement ) )* ( ( (lv_actorType_3_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_4_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_5_0= ruleInteractorTypeDefinition ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleLilModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLilModelAccess().getPackageKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:86:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLilModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLilModel143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLilModelRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:102:2: ( (lv_imports_2_0= ruleImportStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:103:1: (lv_imports_2_0= ruleImportStatement )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:103:1: (lv_imports_2_0= ruleImportStatement )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:104:3: lv_imports_2_0= ruleImportStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getImportsImportStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportStatement_in_ruleLilModel164);
            	    lv_imports_2_0=ruleImportStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"ImportStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:120:3: ( ( (lv_actorType_3_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_4_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_5_0= ruleInteractorTypeDefinition ) ) )*
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    switch ( input.LA(2) ) {
                    case 35:
                        {
                        alt2=3;
                        }
                        break;
                    case 17:
                        {
                        alt2=2;
                        }
                        break;
                    case 13:
                        {
                        alt2=1;
                        }
                        break;

                    }

                }


                switch (alt2) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:120:4: ( (lv_actorType_3_0= ruleActorTypeDefinition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:120:4: ( (lv_actorType_3_0= ruleActorTypeDefinition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:121:1: (lv_actorType_3_0= ruleActorTypeDefinition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:121:1: (lv_actorType_3_0= ruleActorTypeDefinition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:122:3: lv_actorType_3_0= ruleActorTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getActorTypeActorTypeDefinitionParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleActorTypeDefinition_in_ruleLilModel187);
            	    lv_actorType_3_0=ruleActorTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actorType",
            	              		lv_actorType_3_0, 
            	              		"ActorTypeDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:139:6: ( (lv_dataType_4_0= ruleDataTypeDefinition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:139:6: ( (lv_dataType_4_0= ruleDataTypeDefinition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:140:1: (lv_dataType_4_0= ruleDataTypeDefinition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:140:1: (lv_dataType_4_0= ruleDataTypeDefinition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:141:3: lv_dataType_4_0= ruleDataTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getDataTypeDataTypeDefinitionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDataTypeDefinition_in_ruleLilModel214);
            	    lv_dataType_4_0=ruleDataTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dataType",
            	              		lv_dataType_4_0, 
            	              		"DataTypeDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:158:6: ( (lv_interactorType_5_0= ruleInteractorTypeDefinition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:158:6: ( (lv_interactorType_5_0= ruleInteractorTypeDefinition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:159:1: (lv_interactorType_5_0= ruleInteractorTypeDefinition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:159:1: (lv_interactorType_5_0= ruleInteractorTypeDefinition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:160:3: lv_interactorType_5_0= ruleInteractorTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getInteractorTypeInteractorTypeDefinitionParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorTypeDefinition_in_ruleLilModel241);
            	    lv_interactorType_5_0=ruleInteractorTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"interactorType",
            	              		lv_interactorType_5_0, 
            	              		"InteractorTypeDefinition");
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
    // $ANTLR end "ruleLilModel"


    // $ANTLR start "entryRuleImportStatement"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:184:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:185:2: (iv_ruleImportStatement= ruleImportStatement EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:186:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportStatementRule()); 
            }
            pushFollow(FOLLOW_ruleImportStatement_in_entryRuleImportStatement279);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportStatement289); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportStatement"


    // $ANTLR start "ruleImportStatement"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:193:1: ruleImportStatement returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:196:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:197:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:197:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:197:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImportStatement326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportStatementAccess().getImportKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:201:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:202:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:202:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:203:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportStatementAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportStatement347);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportStatementRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImportStatement"


    // $ANTLR start "entryRuleActorTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:227:1: entryRuleActorTypeDefinition returns [EObject current=null] : iv_ruleActorTypeDefinition= ruleActorTypeDefinition EOF ;
    public final EObject entryRuleActorTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorTypeDefinition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:228:2: (iv_ruleActorTypeDefinition= ruleActorTypeDefinition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:229:2: iv_ruleActorTypeDefinition= ruleActorTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleActorTypeDefinition_in_entryRuleActorTypeDefinition383);
            iv_ruleActorTypeDefinition=ruleActorTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorTypeDefinition393); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:236:1: ruleActorTypeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorComponentDeclaration ) )* ) ;
    public final EObject ruleActorTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_component_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:239:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorComponentDeclaration ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:240:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorComponentDeclaration ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:240:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorComponentDeclaration ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:240:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorComponentDeclaration ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:240:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:242:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorTypeDefinition435); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleActorTypeDefinition452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorTypeDefinitionAccess().getActorKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleActorTypeDefinition464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActorTypeDefinitionAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:266:1: ( (lv_component_3_0= ruleActorComponentDeclaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==14) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:267:1: (lv_component_3_0= ruleActorComponentDeclaration )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:267:1: (lv_component_3_0= ruleActorComponentDeclaration )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:268:3: lv_component_3_0= ruleActorComponentDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getActorTypeDefinitionAccess().getComponentActorComponentDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleActorComponentDeclaration_in_ruleActorTypeDefinition485);
            	    lv_component_3_0=ruleActorComponentDeclaration();

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
            	              		"ActorComponentDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:292:1: entryRuleActorType returns [EObject current=null] : iv_ruleActorType= ruleActorType EOF ;
    public final EObject entryRuleActorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:293:2: (iv_ruleActorType= ruleActorType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:294:2: iv_ruleActorType= ruleActorType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorTypeRule()); 
            }
            pushFollow(FOLLOW_ruleActorType_in_entryRuleActorType522);
            iv_ruleActorType=ruleActorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorType532); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:301:1: ruleActorType returns [EObject current=null] : ( ( () otherlv_1= 'input' ) | ( () otherlv_3= 'output' ) | ( () ( (otherlv_5= RULE_ID ) ) ) ) ;
    public final EObject ruleActorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:304:28: ( ( ( () otherlv_1= 'input' ) | ( () otherlv_3= 'output' ) | ( () ( (otherlv_5= RULE_ID ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:305:1: ( ( () otherlv_1= 'input' ) | ( () otherlv_3= 'output' ) | ( () ( (otherlv_5= RULE_ID ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:305:1: ( ( () otherlv_1= 'input' ) | ( () otherlv_3= 'output' ) | ( () ( (otherlv_5= RULE_ID ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:305:2: ( () otherlv_1= 'input' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:305:2: ( () otherlv_1= 'input' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:305:3: () otherlv_1= 'input'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:305:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:306:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getActorTypeAccess().getActorTypeInputAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleActorType579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getActorTypeAccess().getInputKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:316:6: ( () otherlv_3= 'output' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:316:6: ( () otherlv_3= 'output' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:316:7: () otherlv_3= 'output'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:316:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:317:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getActorTypeAccess().getActorTypeOutputAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleActorType608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getActorTypeAccess().getOutputKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:327:6: ( () ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:327:6: ( () ( (otherlv_5= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:327:7: () ( (otherlv_5= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:327:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:328:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getActorTypeAccess().getActorTypeCustomAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:333:2: ( (otherlv_5= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:334:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:334:1: (otherlv_5= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:335:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getActorTypeRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorType645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getActorTypeAccess().getDefinitionActorTypeDefinitionCrossReference_2_1_0()); 
                      	
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
    // $ANTLR end "ruleActorType"


    // $ANTLR start "entryRuleActorComponentDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:354:1: entryRuleActorComponentDeclaration returns [EObject current=null] : iv_ruleActorComponentDeclaration= ruleActorComponentDeclaration EOF ;
    public final EObject entryRuleActorComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorComponentDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:355:2: (iv_ruleActorComponentDeclaration= ruleActorComponentDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:356:2: iv_ruleActorComponentDeclaration= ruleActorComponentDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorComponentDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleActorComponentDeclaration_in_entryRuleActorComponentDeclaration682);
            iv_ruleActorComponentDeclaration=ruleActorComponentDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorComponentDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorComponentDeclaration692); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActorComponentDeclaration"


    // $ANTLR start "ruleActorComponentDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:363:1: ruleActorComponentDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) ) ;
    public final EObject ruleActorComponentDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:366:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:367:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:367:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:367:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:367:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:368:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:368:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:369:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorComponentDeclaration734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getActorComponentDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActorComponentDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleActorComponentDeclaration751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorComponentDeclarationAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:389:1: ( (lv_type_2_0= ruleActorType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:390:1: (lv_type_2_0= ruleActorType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:390:1: (lv_type_2_0= ruleActorType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:391:3: lv_type_2_0= ruleActorType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActorComponentDeclarationAccess().getTypeActorTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActorType_in_ruleActorComponentDeclaration772);
            lv_type_2_0=ruleActorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActorComponentDeclarationRule());
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
    // $ANTLR end "ruleActorComponentDeclaration"


    // $ANTLR start "entryRuleDataTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:415:1: entryRuleDataTypeDefinition returns [EObject current=null] : iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF ;
    public final EObject entryRuleDataTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDefinition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:416:2: (iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:417:2: iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeDefinition_in_entryRuleDataTypeDefinition808);
            iv_ruleDataTypeDefinition=ruleDataTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeDefinition818); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:424:1: ruleDataTypeDefinition returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponentDeclaration ) )* ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) ) ) ;
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
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:427:28: ( ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponentDeclaration ) )* ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:428:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponentDeclaration ) )* ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:428:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponentDeclaration ) )* ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==17) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==14) ) {
                        switch ( input.LA(4) ) {
                        case RULE_ID:
                            {
                            int LA6_4 = input.LA(5);

                            if ( ((LA6_4>=13 && LA6_4<=14)||LA6_4==17||LA6_4==35) ) {
                                alt6=1;
                            }
                            else if ( (LA6_4==EOF||LA6_4==RULE_ID||(LA6_4>=25 && LA6_4<=28)) ) {
                                alt6=2;
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
                        case 18:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:428:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponentDeclaration ) )* )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:428:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponentDeclaration ) )* )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:428:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataComponentDeclaration ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:428:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:429:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeDefinitionAccess().getDataTypeDefinitionCompoundAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:434:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:435:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:435:1: (lv_name_1_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:436:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeDefinition870); if (state.failed) return current;
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

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleDataTypeDefinition887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDataTypeDefinitionAccess().getDataKeyword_0_2());
                          
                    }
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDataTypeDefinition899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDataTypeDefinitionAccess().getColonKeyword_0_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:460:1: ( (lv_component_4_0= ruleDataComponentDeclaration ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            int LA5_2 = input.LA(2);

                            if ( (LA5_2==14) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:461:1: (lv_component_4_0= ruleDataComponentDeclaration )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:461:1: (lv_component_4_0= ruleDataComponentDeclaration )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:462:3: lv_component_4_0= ruleDataComponentDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getComponentDataComponentDeclarationParserRuleCall_0_4_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDataComponentDeclaration_in_ruleDataTypeDefinition920);
                    	    lv_component_4_0=ruleDataComponentDeclaration();

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
                    	              		"DataComponentDeclaration");
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:479:6: ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:479:6: ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:479:7: () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:479:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:480:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeDefinitionAccess().getDataTypeDefinitionAliasAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:485:2: ( (lv_name_6_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:486:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:486:1: (lv_name_6_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:487:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeDefinition955); if (state.failed) return current;
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

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleDataTypeDefinition972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDataTypeDefinitionAccess().getDataKeyword_1_2());
                          
                    }
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleDataTypeDefinition984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getDataTypeDefinitionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:511:1: ( (lv_alias_9_0= ruleDataType ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:512:1: (lv_alias_9_0= ruleDataType )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:512:1: (lv_alias_9_0= ruleDataType )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:513:3: lv_alias_9_0= ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getAliasDataTypeParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataType_in_ruleDataTypeDefinition1005);
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:537:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:538:2: (iv_ruleDataType= ruleDataType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:539:2: iv_ruleDataType= ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType1042);
            iv_ruleDataType=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType1052); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:546:1: ruleDataType returns [EObject current=null] : ( ( ( () otherlv_1= 'void' ) | ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? ) | ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? ) | ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? ) | ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? ) | ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? ) | ( () ( (otherlv_23= RULE_ID ) ) ) ) ( ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' ) )* ( ( ( () 'set' ) )=> ( () otherlv_27= 'set' ) )* ( ( ( () 'list' ) )=> ( () otherlv_29= 'list' ) )* ( ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' ) )* ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject lv_definitionSet_5_0 = null;

        EObject lv_definitionSet_9_0 = null;

        EObject lv_definitionSet_13_0 = null;

        EObject lv_definitionSet_17_0 = null;

        EObject lv_definitionSet_21_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:549:28: ( ( ( ( () otherlv_1= 'void' ) | ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? ) | ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? ) | ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? ) | ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? ) | ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? ) | ( () ( (otherlv_23= RULE_ID ) ) ) ) ( ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' ) )* ( ( ( () 'set' ) )=> ( () otherlv_27= 'set' ) )* ( ( ( () 'list' ) )=> ( () otherlv_29= 'list' ) )* ( ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:550:1: ( ( ( () otherlv_1= 'void' ) | ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? ) | ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? ) | ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? ) | ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? ) | ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? ) | ( () ( (otherlv_23= RULE_ID ) ) ) ) ( ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' ) )* ( ( ( () 'set' ) )=> ( () otherlv_27= 'set' ) )* ( ( ( () 'list' ) )=> ( () otherlv_29= 'list' ) )* ( ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:550:1: ( ( ( () otherlv_1= 'void' ) | ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? ) | ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? ) | ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? ) | ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? ) | ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? ) | ( () ( (otherlv_23= RULE_ID ) ) ) ) ( ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' ) )* ( ( ( () 'set' ) )=> ( () otherlv_27= 'set' ) )* ( ( ( () 'list' ) )=> ( () otherlv_29= 'list' ) )* ( ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:550:2: ( ( () otherlv_1= 'void' ) | ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? ) | ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? ) | ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? ) | ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? ) | ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? ) | ( () ( (otherlv_23= RULE_ID ) ) ) ) ( ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' ) )* ( ( ( () 'set' ) )=> ( () otherlv_27= 'set' ) )* ( ( ( () 'list' ) )=> ( () otherlv_29= 'list' ) )* ( ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:550:2: ( ( () otherlv_1= 'void' ) | ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? ) | ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? ) | ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? ) | ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? ) | ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? ) | ( () ( (otherlv_23= RULE_ID ) ) ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt12=1;
                }
                break;
            case 19:
                {
                alt12=2;
                }
                break;
            case 21:
                {
                alt12=3;
                }
                break;
            case 22:
                {
                alt12=4;
                }
                break;
            case 23:
                {
                alt12=5;
                }
                break;
            case 24:
                {
                alt12=6;
                }
                break;
            case RULE_ID:
                {
                alt12=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:550:3: ( () otherlv_1= 'void' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:550:3: ( () otherlv_1= 'void' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:550:4: () otherlv_1= 'void'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:550:4: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:551:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeVoidAction_0_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleDataType1100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getVoidKeyword_0_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:561:6: ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:561:6: ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:561:7: () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:561:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:562:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeSymbolAction_0_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleDataType1129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getSymbolKeyword_0_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:571:1: (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==20) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:571:3: otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) )
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleDataType1142); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getInKeyword_0_1_2_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:575:1: ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:576:1: (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:576:1: (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:577:3: lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDataTypeSymbolDefinitionSetParserRuleCall_0_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDataTypeSymbolDefinitionSet_in_ruleDataType1163);
                            lv_definitionSet_5_0=ruleDataTypeSymbolDefinitionSet();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definitionSet",
                                      		lv_definitionSet_5_0, 
                                      		"DataTypeSymbolDefinitionSet");
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:594:6: ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:594:6: ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:594:7: () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:594:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:595:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeNumberAction_0_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleDataType1194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDataTypeAccess().getNumberKeyword_0_2_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:604:1: (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:604:3: otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) )
                            {
                            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleDataType1207); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getDataTypeAccess().getInKeyword_0_2_2_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:608:1: ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:609:1: (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:609:1: (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:610:3: lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDataTypeNumberDefinitionSetParserRuleCall_0_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDataTypeNumberDefinitionSet_in_ruleDataType1228);
                            lv_definitionSet_9_0=ruleDataTypeNumberDefinitionSet();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definitionSet",
                                      		lv_definitionSet_9_0, 
                                      		"DataTypeNumberDefinitionSet");
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:627:6: ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:627:6: ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:627:7: () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:627:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:628:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeTextAction_0_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleDataType1259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDataTypeAccess().getTextKeyword_0_3_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:637:1: (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==20) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:637:3: otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) )
                            {
                            otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleDataType1272); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getDataTypeAccess().getInKeyword_0_3_2_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:641:1: ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:642:1: (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:642:1: (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:643:3: lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDataTypeTextDefinitionSetParserRuleCall_0_3_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDataTypeTextDefinitionSet_in_ruleDataType1293);
                            lv_definitionSet_13_0=ruleDataTypeTextDefinitionSet();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definitionSet",
                                      		lv_definitionSet_13_0, 
                                      		"DataTypeTextDefinitionSet");
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
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:660:6: ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:660:6: ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:660:7: () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:660:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:661:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeTimeAction_0_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleDataType1324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getDataTypeAccess().getTimeKeyword_0_4_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:670:1: (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==20) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:670:3: otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) )
                            {
                            otherlv_16=(Token)match(input,20,FOLLOW_20_in_ruleDataType1337); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getDataTypeAccess().getInKeyword_0_4_2_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:1: ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:675:1: (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:675:1: (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:676:3: lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDataTypeTimeDefinitionSetParserRuleCall_0_4_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDataTypeTimeDefinitionSet_in_ruleDataType1358);
                            lv_definitionSet_17_0=ruleDataTypeTimeDefinitionSet();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definitionSet",
                                      		lv_definitionSet_17_0, 
                                      		"DataTypeTimeDefinitionSet");
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
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:693:6: ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:693:6: ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:693:7: () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:693:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:694:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeIdentifierAction_0_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_19=(Token)match(input,24,FOLLOW_24_in_ruleDataType1389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getDataTypeAccess().getIdentifierKeyword_0_5_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:703:1: (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==20) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:703:3: otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) )
                            {
                            otherlv_20=(Token)match(input,20,FOLLOW_20_in_ruleDataType1402); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_20, grammarAccess.getDataTypeAccess().getInKeyword_0_5_2_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:707:1: ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:708:1: (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:708:1: (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:709:3: lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDataTypeIdentifierDefinitionSetParserRuleCall_0_5_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDataTypeIdentifierDefinitionSet_in_ruleDataType1423);
                            lv_definitionSet_21_0=ruleDataTypeIdentifierDefinitionSet();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definitionSet",
                                      		lv_definitionSet_21_0, 
                                      		"DataTypeIdentifierDefinitionSet");
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
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:726:6: ( () ( (otherlv_23= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:726:6: ( () ( (otherlv_23= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:726:7: () ( (otherlv_23= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:726:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:727:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeCustomAction_0_6_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:732:2: ( (otherlv_23= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:733:1: (otherlv_23= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:733:1: (otherlv_23= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:734:3: otherlv_23= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeRule());
                      	        }
                              
                    }
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType1462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_23, grammarAccess.getDataTypeAccess().getDefinitionDataTypeDefinitionCrossReference_0_6_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:745:4: ( ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) && (synpred1_InternalLil())) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:745:5: ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:747:5: ( () otherlv_25= 'collection' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:747:6: () otherlv_25= 'collection'
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:747:6: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:748:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDataTypeAccess().getDataTypeCollectionElementTypeAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_25=(Token)match(input,25,FOLLOW_25_in_ruleDataType1499); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getDataTypeAccess().getCollectionKeyword_1_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:757:4: ( ( ( () 'set' ) )=> ( () otherlv_27= 'set' ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) && (synpred2_InternalLil())) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:757:5: ( ( () 'set' ) )=> ( () otherlv_27= 'set' )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:759:5: ( () otherlv_27= 'set' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:759:6: () otherlv_27= 'set'
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:759:6: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:760:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDataTypeAccess().getDataTypeSetElementTypeAction_2_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_27=(Token)match(input,26,FOLLOW_26_in_ruleDataType1537); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getDataTypeAccess().getSetKeyword_2_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:769:4: ( ( ( () 'list' ) )=> ( () otherlv_29= 'list' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) && (synpred3_InternalLil())) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:769:5: ( ( () 'list' ) )=> ( () otherlv_29= 'list' )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:771:5: ( () otherlv_29= 'list' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:771:6: () otherlv_29= 'list'
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:771:6: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:772:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_29=(Token)match(input,27,FOLLOW_27_in_ruleDataType1575); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getDataTypeAccess().getListKeyword_3_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:781:4: ( ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) && (synpred4_InternalLil())) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:781:5: ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:783:5: ( () otherlv_31= 'queue' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:783:6: () otherlv_31= 'queue'
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:783:6: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:784:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_31=(Token)match(input,28,FOLLOW_28_in_ruleDataType1613); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_31, grammarAccess.getDataTypeAccess().getQueueKeyword_4_0_1());
            	          
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleDataTypeSymbolDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:801:1: entryRuleDataTypeSymbolDefinitionSet returns [EObject current=null] : iv_ruleDataTypeSymbolDefinitionSet= ruleDataTypeSymbolDefinitionSet EOF ;
    public final EObject entryRuleDataTypeSymbolDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeSymbolDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:802:2: (iv_ruleDataTypeSymbolDefinitionSet= ruleDataTypeSymbolDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:803:2: iv_ruleDataTypeSymbolDefinitionSet= ruleDataTypeSymbolDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeSymbolDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeSymbolDefinitionSet_in_entryRuleDataTypeSymbolDefinitionSet1652);
            iv_ruleDataTypeSymbolDefinitionSet=ruleDataTypeSymbolDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeSymbolDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeSymbolDefinitionSet1662); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeSymbolDefinitionSet"


    // $ANTLR start "ruleDataTypeSymbolDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:810:1: ruleDataTypeSymbolDefinitionSet returns [EObject current=null] : (otherlv_0= '{' ( (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleDataTypeSymbolDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_element_1_0 = null;

        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:813:28: ( (otherlv_0= '{' ( (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) ) )* otherlv_4= '}' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:814:1: (otherlv_0= '{' ( (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) ) )* otherlv_4= '}' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:814:1: (otherlv_0= '{' ( (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) ) )* otherlv_4= '}' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:814:3: otherlv_0= '{' ( (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleDataTypeSymbolDefinitionSet1699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDataTypeSymbolDefinitionSetAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:818:1: ( (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:819:1: (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:819:1: (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:820:3: lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataTypeSymbolDefinitionSetAccess().getElementDataTypeSymbolDefinitionSetElementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataTypeSymbolDefinitionSetElement_in_ruleDataTypeSymbolDefinitionSet1720);
            lv_element_1_0=ruleDataTypeSymbolDefinitionSetElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataTypeSymbolDefinitionSetRule());
              	        }
                     		add(
                     			current, 
                     			"element",
                      		lv_element_1_0, 
                      		"DataTypeSymbolDefinitionSetElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:836:2: (otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:836:4: otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleDataTypeSymbolDefinitionSet1733); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getDataTypeSymbolDefinitionSetAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:840:1: ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:841:1: (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:841:1: (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:842:3: lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataTypeSymbolDefinitionSetAccess().getElementDataTypeSymbolDefinitionSetElementParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDataTypeSymbolDefinitionSetElement_in_ruleDataTypeSymbolDefinitionSet1754);
            	    lv_element_3_0=ruleDataTypeSymbolDefinitionSetElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataTypeSymbolDefinitionSetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"element",
            	              		lv_element_3_0, 
            	              		"DataTypeSymbolDefinitionSetElement");
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

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleDataTypeSymbolDefinitionSet1768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDataTypeSymbolDefinitionSetAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleDataTypeSymbolDefinitionSet"


    // $ANTLR start "entryRuleDataTypeSymbolDefinitionSetElement"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:870:1: entryRuleDataTypeSymbolDefinitionSetElement returns [EObject current=null] : iv_ruleDataTypeSymbolDefinitionSetElement= ruleDataTypeSymbolDefinitionSetElement EOF ;
    public final EObject entryRuleDataTypeSymbolDefinitionSetElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeSymbolDefinitionSetElement = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:871:2: (iv_ruleDataTypeSymbolDefinitionSetElement= ruleDataTypeSymbolDefinitionSetElement EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:872:2: iv_ruleDataTypeSymbolDefinitionSetElement= ruleDataTypeSymbolDefinitionSetElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeSymbolDefinitionSetElementRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeSymbolDefinitionSetElement_in_entryRuleDataTypeSymbolDefinitionSetElement1804);
            iv_ruleDataTypeSymbolDefinitionSetElement=ruleDataTypeSymbolDefinitionSetElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeSymbolDefinitionSetElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeSymbolDefinitionSetElement1814); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeSymbolDefinitionSetElement"


    // $ANTLR start "ruleDataTypeSymbolDefinitionSetElement"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:879:1: ruleDataTypeSymbolDefinitionSetElement returns [EObject current=null] : ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDataTypeSymbolDefinitionSetElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:882:28: ( ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:883:1: ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:883:1: ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:883:2: () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:883:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:884:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataTypeSymbolDefinitionSetElementAccess().getDataTypeSymbolDefinitionSetElementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleDataTypeSymbolDefinitionSetElement1860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataTypeSymbolDefinitionSetElementAccess().getNumberSignKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:893:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:894:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:894:1: (lv_name_2_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:895:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeSymbolDefinitionSetElement1877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDataTypeSymbolDefinitionSetElementAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataTypeSymbolDefinitionSetElementRule());
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
    // $ANTLR end "ruleDataTypeSymbolDefinitionSetElement"


    // $ANTLR start "entryRuleDataTypeNumberDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:919:1: entryRuleDataTypeNumberDefinitionSet returns [EObject current=null] : iv_ruleDataTypeNumberDefinitionSet= ruleDataTypeNumberDefinitionSet EOF ;
    public final EObject entryRuleDataTypeNumberDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeNumberDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:920:2: (iv_ruleDataTypeNumberDefinitionSet= ruleDataTypeNumberDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:921:2: iv_ruleDataTypeNumberDefinitionSet= ruleDataTypeNumberDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeNumberDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeNumberDefinitionSet_in_entryRuleDataTypeNumberDefinitionSet1918);
            iv_ruleDataTypeNumberDefinitionSet=ruleDataTypeNumberDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeNumberDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeNumberDefinitionSet1928); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeNumberDefinitionSet"


    // $ANTLR start "ruleDataTypeNumberDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:928:1: ruleDataTypeNumberDefinitionSet returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']' ) ) ;
    public final EObject ruleDataTypeNumberDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;

        EObject lv_inf_8_0 = null;

        EObject lv_sup_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:931:28: ( ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']' ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:932:1: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']' ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:932:1: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            else if ( (LA19_0==33) ) {
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:932:2: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:932:2: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:932:3: () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:932:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:933:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeNumberDefinitionSetAccess().getDataTypeNumberDefinitionSetSetAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDataTypeNumberDefinitionSet1975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDataTypeNumberDefinitionSetAccess().getLeftCurlyBracketKeyword_0_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:942:1: ( (lv_element_2_0= ruleLiteralNumber ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:943:1: (lv_element_2_0= ruleLiteralNumber )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:943:1: (lv_element_2_0= ruleLiteralNumber )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:944:3: lv_element_2_0= ruleLiteralNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeNumberDefinitionSetAccess().getElementLiteralNumberParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet1996);
                    lv_element_2_0=ruleLiteralNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeNumberDefinitionSetRule());
                      	        }
                             		add(
                             			current, 
                             			"element",
                              		lv_element_2_0, 
                              		"LiteralNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:960:2: (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==30) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:960:4: otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDataTypeNumberDefinitionSet2009); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getDataTypeNumberDefinitionSetAccess().getCommaKeyword_0_3_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:964:1: ( (lv_element_4_0= ruleLiteralNumber ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:965:1: (lv_element_4_0= ruleLiteralNumber )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:965:1: (lv_element_4_0= ruleLiteralNumber )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:966:3: lv_element_4_0= ruleLiteralNumber
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDataTypeNumberDefinitionSetAccess().getElementLiteralNumberParserRuleCall_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet2030);
                    	    lv_element_4_0=ruleLiteralNumber();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDataTypeNumberDefinitionSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"element",
                    	              		lv_element_4_0, 
                    	              		"LiteralNumber");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleDataTypeNumberDefinitionSet2044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDataTypeNumberDefinitionSetAccess().getRightCurlyBracketKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:987:6: ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:987:6: ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:987:7: () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:987:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:988:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeNumberDefinitionSetAccess().getDataTypeNumberDefinitionSetIntervalAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleDataTypeNumberDefinitionSet2073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDataTypeNumberDefinitionSetAccess().getLeftSquareBracketKeyword_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:997:1: ( (lv_inf_8_0= ruleLiteralNumber ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:998:1: (lv_inf_8_0= ruleLiteralNumber )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:998:1: (lv_inf_8_0= ruleLiteralNumber )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:999:3: lv_inf_8_0= ruleLiteralNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeNumberDefinitionSetAccess().getInfLiteralNumberParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet2094);
                    lv_inf_8_0=ruleLiteralNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeNumberDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"inf",
                              		lv_inf_8_0, 
                              		"LiteralNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleDataTypeNumberDefinitionSet2106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getDataTypeNumberDefinitionSetAccess().getCommaKeyword_1_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1019:1: ( (lv_sup_10_0= ruleLiteralNumber ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1020:1: (lv_sup_10_0= ruleLiteralNumber )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1020:1: (lv_sup_10_0= ruleLiteralNumber )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1021:3: lv_sup_10_0= ruleLiteralNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeNumberDefinitionSetAccess().getSupLiteralNumberParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet2127);
                    lv_sup_10_0=ruleLiteralNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeNumberDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"sup",
                              		lv_sup_10_0, 
                              		"LiteralNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleDataTypeNumberDefinitionSet2139); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDataTypeNumberDefinitionSetAccess().getRightSquareBracketKeyword_1_5());
                          
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
    // $ANTLR end "ruleDataTypeNumberDefinitionSet"


    // $ANTLR start "entryRuleDataTypeTextDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1049:1: entryRuleDataTypeTextDefinitionSet returns [EObject current=null] : iv_ruleDataTypeTextDefinitionSet= ruleDataTypeTextDefinitionSet EOF ;
    public final EObject entryRuleDataTypeTextDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeTextDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1050:2: (iv_ruleDataTypeTextDefinitionSet= ruleDataTypeTextDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1051:2: iv_ruleDataTypeTextDefinitionSet= ruleDataTypeTextDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeTextDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeTextDefinitionSet_in_entryRuleDataTypeTextDefinitionSet2176);
            iv_ruleDataTypeTextDefinitionSet=ruleDataTypeTextDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeTextDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeTextDefinitionSet2186); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeTextDefinitionSet"


    // $ANTLR start "ruleDataTypeTextDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1058:1: ruleDataTypeTextDefinitionSet returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralText ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleDataTypeTextDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1061:28: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralText ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) ) )* otherlv_5= '}' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1062:1: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralText ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) ) )* otherlv_5= '}' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1062:1: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralText ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) ) )* otherlv_5= '}' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1062:2: () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralText ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) ) )* otherlv_5= '}'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1062:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1063:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataTypeTextDefinitionSetAccess().getDataTypeTextDefinitionSetSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDataTypeTextDefinitionSet2232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataTypeTextDefinitionSetAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1072:1: ( (lv_element_2_0= ruleLiteralText ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1073:1: (lv_element_2_0= ruleLiteralText )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1073:1: (lv_element_2_0= ruleLiteralText )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1074:3: lv_element_2_0= ruleLiteralText
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataTypeTextDefinitionSetAccess().getElementLiteralTextParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralText_in_ruleDataTypeTextDefinitionSet2253);
            lv_element_2_0=ruleLiteralText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataTypeTextDefinitionSetRule());
              	        }
                     		add(
                     			current, 
                     			"element",
                      		lv_element_2_0, 
                      		"LiteralText");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1090:2: (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1090:4: otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDataTypeTextDefinitionSet2266); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getDataTypeTextDefinitionSetAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1094:1: ( (lv_element_4_0= ruleLiteralText ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1095:1: (lv_element_4_0= ruleLiteralText )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1095:1: (lv_element_4_0= ruleLiteralText )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1096:3: lv_element_4_0= ruleLiteralText
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataTypeTextDefinitionSetAccess().getElementLiteralTextParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLiteralText_in_ruleDataTypeTextDefinitionSet2287);
            	    lv_element_4_0=ruleLiteralText();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataTypeTextDefinitionSetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"element",
            	              		lv_element_4_0, 
            	              		"LiteralText");
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

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleDataTypeTextDefinitionSet2301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDataTypeTextDefinitionSetAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleDataTypeTextDefinitionSet"


    // $ANTLR start "entryRuleDataTypeTimeDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1124:1: entryRuleDataTypeTimeDefinitionSet returns [EObject current=null] : iv_ruleDataTypeTimeDefinitionSet= ruleDataTypeTimeDefinitionSet EOF ;
    public final EObject entryRuleDataTypeTimeDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeTimeDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1125:2: (iv_ruleDataTypeTimeDefinitionSet= ruleDataTypeTimeDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1126:2: iv_ruleDataTypeTimeDefinitionSet= ruleDataTypeTimeDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeTimeDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeTimeDefinitionSet_in_entryRuleDataTypeTimeDefinitionSet2337);
            iv_ruleDataTypeTimeDefinitionSet=ruleDataTypeTimeDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeTimeDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeTimeDefinitionSet2347); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeTimeDefinitionSet"


    // $ANTLR start "ruleDataTypeTimeDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1133:1: ruleDataTypeTimeDefinitionSet returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']' ) ) ;
    public final EObject ruleDataTypeTimeDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;

        EObject lv_inf_8_0 = null;

        EObject lv_sup_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1136:28: ( ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']' ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1137:1: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']' ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1137:1: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            else if ( (LA22_0==33) ) {
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1137:2: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1137:2: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1137:3: () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1137:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1138:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeTimeDefinitionSetAccess().getDataTypeTimeDefinitionSetSetAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDataTypeTimeDefinitionSet2394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDataTypeTimeDefinitionSetAccess().getLeftCurlyBracketKeyword_0_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1147:1: ( (lv_element_2_0= ruleLiteralTime ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1148:1: (lv_element_2_0= ruleLiteralTime )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1148:1: (lv_element_2_0= ruleLiteralTime )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1149:3: lv_element_2_0= ruleLiteralTime
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeTimeDefinitionSetAccess().getElementLiteralTimeParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2415);
                    lv_element_2_0=ruleLiteralTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeTimeDefinitionSetRule());
                      	        }
                             		add(
                             			current, 
                             			"element",
                              		lv_element_2_0, 
                              		"LiteralTime");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1165:2: (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==30) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1165:4: otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDataTypeTimeDefinitionSet2428); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getDataTypeTimeDefinitionSetAccess().getCommaKeyword_0_3_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1169:1: ( (lv_element_4_0= ruleLiteralTime ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1170:1: (lv_element_4_0= ruleLiteralTime )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1170:1: (lv_element_4_0= ruleLiteralTime )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1171:3: lv_element_4_0= ruleLiteralTime
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDataTypeTimeDefinitionSetAccess().getElementLiteralTimeParserRuleCall_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2449);
                    	    lv_element_4_0=ruleLiteralTime();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDataTypeTimeDefinitionSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"element",
                    	              		lv_element_4_0, 
                    	              		"LiteralTime");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleDataTypeTimeDefinitionSet2463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDataTypeTimeDefinitionSetAccess().getRightCurlyBracketKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1192:6: ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1192:6: ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1192:7: () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1192:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1193:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeTimeDefinitionSetAccess().getDataTypeTimeDefinitionSetIntervalAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleDataTypeTimeDefinitionSet2492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDataTypeTimeDefinitionSetAccess().getLeftSquareBracketKeyword_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1202:1: ( (lv_inf_8_0= ruleLiteralTime ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1203:1: (lv_inf_8_0= ruleLiteralTime )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1203:1: (lv_inf_8_0= ruleLiteralTime )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1204:3: lv_inf_8_0= ruleLiteralTime
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeTimeDefinitionSetAccess().getInfLiteralTimeParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2513);
                    lv_inf_8_0=ruleLiteralTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeTimeDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"inf",
                              		lv_inf_8_0, 
                              		"LiteralTime");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleDataTypeTimeDefinitionSet2525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getDataTypeTimeDefinitionSetAccess().getCommaKeyword_1_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1224:1: ( (lv_sup_10_0= ruleLiteralTime ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1225:1: (lv_sup_10_0= ruleLiteralTime )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1225:1: (lv_sup_10_0= ruleLiteralTime )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1226:3: lv_sup_10_0= ruleLiteralTime
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeTimeDefinitionSetAccess().getSupLiteralTimeParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2546);
                    lv_sup_10_0=ruleLiteralTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeTimeDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"sup",
                              		lv_sup_10_0, 
                              		"LiteralTime");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleDataTypeTimeDefinitionSet2558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDataTypeTimeDefinitionSetAccess().getRightSquareBracketKeyword_1_5());
                          
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
    // $ANTLR end "ruleDataTypeTimeDefinitionSet"


    // $ANTLR start "entryRuleDataTypeIdentifierDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1254:1: entryRuleDataTypeIdentifierDefinitionSet returns [EObject current=null] : iv_ruleDataTypeIdentifierDefinitionSet= ruleDataTypeIdentifierDefinitionSet EOF ;
    public final EObject entryRuleDataTypeIdentifierDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeIdentifierDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1255:2: (iv_ruleDataTypeIdentifierDefinitionSet= ruleDataTypeIdentifierDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1256:2: iv_ruleDataTypeIdentifierDefinitionSet= ruleDataTypeIdentifierDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeIdentifierDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeIdentifierDefinitionSet_in_entryRuleDataTypeIdentifierDefinitionSet2595);
            iv_ruleDataTypeIdentifierDefinitionSet=ruleDataTypeIdentifierDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeIdentifierDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeIdentifierDefinitionSet2605); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeIdentifierDefinitionSet"


    // $ANTLR start "ruleDataTypeIdentifierDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1263:1: ruleDataTypeIdentifierDefinitionSet returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleDataTypeIdentifierDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1266:28: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1267:1: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1267:1: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1267:2: () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1267:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1268:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataTypeIdentifierDefinitionSetAccess().getDataTypeIdentifierDefinitionSetSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDataTypeIdentifierDefinitionSet2651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataTypeIdentifierDefinitionSetAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1277:1: ( (lv_element_2_0= ruleLiteralNumber ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1278:1: (lv_element_2_0= ruleLiteralNumber )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1278:1: (lv_element_2_0= ruleLiteralNumber )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1279:3: lv_element_2_0= ruleLiteralNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataTypeIdentifierDefinitionSetAccess().getElementLiteralNumberParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataTypeIdentifierDefinitionSet2672);
            lv_element_2_0=ruleLiteralNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataTypeIdentifierDefinitionSetRule());
              	        }
                     		add(
                     			current, 
                     			"element",
                      		lv_element_2_0, 
                      		"LiteralNumber");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1295:2: (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1295:4: otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDataTypeIdentifierDefinitionSet2685); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getDataTypeIdentifierDefinitionSetAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1299:1: ( (lv_element_4_0= ruleLiteralNumber ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1300:1: (lv_element_4_0= ruleLiteralNumber )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1300:1: (lv_element_4_0= ruleLiteralNumber )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1301:3: lv_element_4_0= ruleLiteralNumber
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataTypeIdentifierDefinitionSetAccess().getElementLiteralNumberParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataTypeIdentifierDefinitionSet2706);
            	    lv_element_4_0=ruleLiteralNumber();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataTypeIdentifierDefinitionSetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"element",
            	              		lv_element_4_0, 
            	              		"LiteralNumber");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleDataTypeIdentifierDefinitionSet2720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDataTypeIdentifierDefinitionSetAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleDataTypeIdentifierDefinitionSet"


    // $ANTLR start "entryRuleDataComponentDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1329:1: entryRuleDataComponentDeclaration returns [EObject current=null] : iv_ruleDataComponentDeclaration= ruleDataComponentDeclaration EOF ;
    public final EObject entryRuleDataComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataComponentDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1330:2: (iv_ruleDataComponentDeclaration= ruleDataComponentDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1331:2: iv_ruleDataComponentDeclaration= ruleDataComponentDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataComponentDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDataComponentDeclaration_in_entryRuleDataComponentDeclaration2756);
            iv_ruleDataComponentDeclaration=ruleDataComponentDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataComponentDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataComponentDeclaration2766); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataComponentDeclaration"


    // $ANTLR start "ruleDataComponentDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1338:1: ruleDataComponentDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleDataComponentDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1341:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1342:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1342:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1342:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1342:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1343:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1343:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1344:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataComponentDeclaration2808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getDataComponentDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataComponentDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDataComponentDeclaration2825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataComponentDeclarationAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1364:1: ( (lv_type_2_0= ruleDataType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1365:1: (lv_type_2_0= ruleDataType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1365:1: (lv_type_2_0= ruleDataType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1366:3: lv_type_2_0= ruleDataType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataComponentDeclarationAccess().getTypeDataTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataType_in_ruleDataComponentDeclaration2846);
            lv_type_2_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataComponentDeclarationRule());
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
    // $ANTLR end "ruleDataComponentDeclaration"


    // $ANTLR start "entryRuleInteractorTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1390:1: entryRuleInteractorTypeDefinition returns [EObject current=null] : iv_ruleInteractorTypeDefinition= ruleInteractorTypeDefinition EOF ;
    public final EObject entryRuleInteractorTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorTypeDefinition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1391:2: (iv_ruleInteractorTypeDefinition= ruleInteractorTypeDefinition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1392:2: iv_ruleInteractorTypeDefinition= ruleInteractorTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorTypeDefinition_in_entryRuleInteractorTypeDefinition2882);
            iv_ruleInteractorTypeDefinition=ruleInteractorTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorTypeDefinition2892); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1399:1: ruleInteractorTypeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActorDeclaration ) ) | ( (lv_data_4_0= ruleInteractorDataDeclaration ) ) | ( (lv_component_5_0= ruleInteractorComponentDeclaration ) ) | ( (lv_behavior_6_0= ruleInteractorBehaviorDeclaration ) ) )* ) ;
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
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1402:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActorDeclaration ) ) | ( (lv_data_4_0= ruleInteractorDataDeclaration ) ) | ( (lv_component_5_0= ruleInteractorComponentDeclaration ) ) | ( (lv_behavior_6_0= ruleInteractorBehaviorDeclaration ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1403:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActorDeclaration ) ) | ( (lv_data_4_0= ruleInteractorDataDeclaration ) ) | ( (lv_component_5_0= ruleInteractorComponentDeclaration ) ) | ( (lv_behavior_6_0= ruleInteractorBehaviorDeclaration ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1403:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActorDeclaration ) ) | ( (lv_data_4_0= ruleInteractorDataDeclaration ) ) | ( (lv_component_5_0= ruleInteractorComponentDeclaration ) ) | ( (lv_behavior_6_0= ruleInteractorBehaviorDeclaration ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1403:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActorDeclaration ) ) | ( (lv_data_4_0= ruleInteractorDataDeclaration ) ) | ( (lv_component_5_0= ruleInteractorComponentDeclaration ) ) | ( (lv_behavior_6_0= ruleInteractorBehaviorDeclaration ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1403:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1404:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1404:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1405:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorTypeDefinition2934); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleInteractorTypeDefinition2951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractorTypeDefinitionAccess().getInteractorKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleInteractorTypeDefinition2963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorTypeDefinitionAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1429:1: ( ( (lv_actor_3_0= ruleInteractorActorDeclaration ) ) | ( (lv_data_4_0= ruleInteractorDataDeclaration ) ) | ( (lv_component_5_0= ruleInteractorComponentDeclaration ) ) | ( (lv_behavior_6_0= ruleInteractorBehaviorDeclaration ) ) )*
            loop24:
            do {
                int alt24=5;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==14) ) {
                        switch ( input.LA(3) ) {
                        case 18:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            {
                            alt24=2;
                            }
                            break;
                        case RULE_ID:
                            {
                            switch ( input.LA(4) ) {
                            case 13:
                                {
                                alt24=1;
                                }
                                break;
                            case 35:
                                {
                                alt24=3;
                                }
                                break;
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 37:
                            case 40:
                            case 41:
                                {
                                alt24=2;
                                }
                                break;

                            }

                            }
                            break;
                        case 15:
                        case 16:
                            {
                            alt24=1;
                            }
                            break;

                        }

                    }


                }
                else if ( (LA24_0==51||LA24_0==53) ) {
                    alt24=4;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1429:2: ( (lv_actor_3_0= ruleInteractorActorDeclaration ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1429:2: ( (lv_actor_3_0= ruleInteractorActorDeclaration ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1430:1: (lv_actor_3_0= ruleInteractorActorDeclaration )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1430:1: (lv_actor_3_0= ruleInteractorActorDeclaration )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1431:3: lv_actor_3_0= ruleInteractorActorDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorTypeDefinitionAccess().getActorInteractorActorDeclarationParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorActorDeclaration_in_ruleInteractorTypeDefinition2985);
            	    lv_actor_3_0=ruleInteractorActorDeclaration();

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
            	              		"InteractorActorDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1448:6: ( (lv_data_4_0= ruleInteractorDataDeclaration ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1448:6: ( (lv_data_4_0= ruleInteractorDataDeclaration ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1449:1: (lv_data_4_0= ruleInteractorDataDeclaration )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1449:1: (lv_data_4_0= ruleInteractorDataDeclaration )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1450:3: lv_data_4_0= ruleInteractorDataDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorTypeDefinitionAccess().getDataInteractorDataDeclarationParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorDataDeclaration_in_ruleInteractorTypeDefinition3012);
            	    lv_data_4_0=ruleInteractorDataDeclaration();

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
            	              		"InteractorDataDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1467:6: ( (lv_component_5_0= ruleInteractorComponentDeclaration ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1467:6: ( (lv_component_5_0= ruleInteractorComponentDeclaration ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1468:1: (lv_component_5_0= ruleInteractorComponentDeclaration )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1468:1: (lv_component_5_0= ruleInteractorComponentDeclaration )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1469:3: lv_component_5_0= ruleInteractorComponentDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorTypeDefinitionAccess().getComponentInteractorComponentDeclarationParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorComponentDeclaration_in_ruleInteractorTypeDefinition3039);
            	    lv_component_5_0=ruleInteractorComponentDeclaration();

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
            	              		"InteractorComponentDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1486:6: ( (lv_behavior_6_0= ruleInteractorBehaviorDeclaration ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1486:6: ( (lv_behavior_6_0= ruleInteractorBehaviorDeclaration ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1487:1: (lv_behavior_6_0= ruleInteractorBehaviorDeclaration )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1487:1: (lv_behavior_6_0= ruleInteractorBehaviorDeclaration )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1488:3: lv_behavior_6_0= ruleInteractorBehaviorDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorTypeDefinitionAccess().getBehaviorInteractorBehaviorDeclarationParserRuleCall_3_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorBehaviorDeclaration_in_ruleInteractorTypeDefinition3066);
            	    lv_behavior_6_0=ruleInteractorBehaviorDeclaration();

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
            	              		"InteractorBehaviorDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1512:1: entryRuleInteractorType returns [EObject current=null] : iv_ruleInteractorType= ruleInteractorType EOF ;
    public final EObject entryRuleInteractorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1513:2: (iv_ruleInteractorType= ruleInteractorType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1514:2: iv_ruleInteractorType= ruleInteractorType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorTypeRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorType_in_entryRuleInteractorType3104);
            iv_ruleInteractorType=ruleInteractorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorType3114); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1521:1: ruleInteractorType returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleInteractorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1524:28: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1525:1: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1525:1: ( () ( (otherlv_1= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1525:2: () ( (otherlv_1= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1525:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1526:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInteractorTypeAccess().getInteractorTypeCustomAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1531:2: ( (otherlv_1= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1532:1: (otherlv_1= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1532:1: (otherlv_1= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1533:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorTypeRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorType3168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getInteractorTypeAccess().getDefinitionInteractorTypeDefinitionCrossReference_1_0()); 
              	
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
    // $ANTLR end "ruleInteractorType"


    // $ANTLR start "entryRuleInteractorActorDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1552:1: entryRuleInteractorActorDeclaration returns [EObject current=null] : iv_ruleInteractorActorDeclaration= ruleInteractorActorDeclaration EOF ;
    public final EObject entryRuleInteractorActorDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorActorDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1553:2: (iv_ruleInteractorActorDeclaration= ruleInteractorActorDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1554:2: iv_ruleInteractorActorDeclaration= ruleInteractorActorDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorActorDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorActorDeclaration_in_entryRuleInteractorActorDeclaration3204);
            iv_ruleInteractorActorDeclaration=ruleInteractorActorDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorActorDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorActorDeclaration3214); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractorActorDeclaration"


    // $ANTLR start "ruleInteractorActorDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1561:1: ruleInteractorActorDeclaration returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleActorType ) ) otherlv_4= 'actor' ) ) ;
    public final EObject ruleInteractorActorDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1564:28: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleActorType ) ) otherlv_4= 'actor' ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1565:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleActorType ) ) otherlv_4= 'actor' ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1565:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleActorType ) ) otherlv_4= 'actor' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1565:2: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleActorType ) ) otherlv_4= 'actor' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1565:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1566:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInteractorActorDeclarationAccess().getInteractorActorDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1571:2: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleActorType ) ) otherlv_4= 'actor' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1571:3: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleActorType ) ) otherlv_4= 'actor'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1571:3: ( (lv_name_1_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1572:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1572:1: (lv_name_1_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1573:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorActorDeclaration3266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getInteractorActorDeclarationAccess().getNameIDTerminalRuleCall_1_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorActorDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleInteractorActorDeclaration3283); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorActorDeclarationAccess().getColonKeyword_1_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1593:1: ( (lv_type_3_0= ruleActorType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1594:1: (lv_type_3_0= ruleActorType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1594:1: (lv_type_3_0= ruleActorType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1595:3: lv_type_3_0= ruleActorType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorActorDeclarationAccess().getTypeActorTypeParserRuleCall_1_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActorType_in_ruleInteractorActorDeclaration3304);
            lv_type_3_0=ruleActorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorActorDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"ActorType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleInteractorActorDeclaration3316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInteractorActorDeclarationAccess().getActorKeyword_1_3());
                  
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
    // $ANTLR end "ruleInteractorActorDeclaration"


    // $ANTLR start "entryRuleInteractorComponentDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1623:1: entryRuleInteractorComponentDeclaration returns [EObject current=null] : iv_ruleInteractorComponentDeclaration= ruleInteractorComponentDeclaration EOF ;
    public final EObject entryRuleInteractorComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorComponentDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1624:2: (iv_ruleInteractorComponentDeclaration= ruleInteractorComponentDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1625:2: iv_ruleInteractorComponentDeclaration= ruleInteractorComponentDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorComponentDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorComponentDeclaration_in_entryRuleInteractorComponentDeclaration3353);
            iv_ruleInteractorComponentDeclaration=ruleInteractorComponentDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorComponentDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorComponentDeclaration3363); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractorComponentDeclaration"


    // $ANTLR start "ruleInteractorComponentDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1632:1: ruleInteractorComponentDeclaration returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleInteractorType ) ) otherlv_4= 'interactor' (otherlv_5= 'with' ( (lv_actors_6_0= ruleInteractorActorAlias ) ) )* ) ) ;
    public final EObject ruleInteractorComponentDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_type_3_0 = null;

        EObject lv_actors_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1635:28: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleInteractorType ) ) otherlv_4= 'interactor' (otherlv_5= 'with' ( (lv_actors_6_0= ruleInteractorActorAlias ) ) )* ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1636:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleInteractorType ) ) otherlv_4= 'interactor' (otherlv_5= 'with' ( (lv_actors_6_0= ruleInteractorActorAlias ) ) )* ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1636:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleInteractorType ) ) otherlv_4= 'interactor' (otherlv_5= 'with' ( (lv_actors_6_0= ruleInteractorActorAlias ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1636:2: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleInteractorType ) ) otherlv_4= 'interactor' (otherlv_5= 'with' ( (lv_actors_6_0= ruleInteractorActorAlias ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1636:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1637:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInteractorComponentDeclarationAccess().getInteractorComponentDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1642:2: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleInteractorType ) ) otherlv_4= 'interactor' (otherlv_5= 'with' ( (lv_actors_6_0= ruleInteractorActorAlias ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1642:3: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleInteractorType ) ) otherlv_4= 'interactor' (otherlv_5= 'with' ( (lv_actors_6_0= ruleInteractorActorAlias ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1642:3: ( (lv_name_1_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1643:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1643:1: (lv_name_1_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1644:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorComponentDeclaration3415); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getInteractorComponentDeclarationAccess().getNameIDTerminalRuleCall_1_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorComponentDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleInteractorComponentDeclaration3432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorComponentDeclarationAccess().getColonKeyword_1_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1664:1: ( (lv_type_3_0= ruleInteractorType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1665:1: (lv_type_3_0= ruleInteractorType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1665:1: (lv_type_3_0= ruleInteractorType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1666:3: lv_type_3_0= ruleInteractorType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorComponentDeclarationAccess().getTypeInteractorTypeParserRuleCall_1_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorType_in_ruleInteractorComponentDeclaration3453);
            lv_type_3_0=ruleInteractorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorComponentDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"InteractorType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleInteractorComponentDeclaration3465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInteractorComponentDeclarationAccess().getInteractorKeyword_1_3());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1686:1: (otherlv_5= 'with' ( (lv_actors_6_0= ruleInteractorActorAlias ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1686:3: otherlv_5= 'with' ( (lv_actors_6_0= ruleInteractorActorAlias ) )
            	    {
            	    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleInteractorComponentDeclaration3478); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getInteractorComponentDeclarationAccess().getWithKeyword_1_4_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1690:1: ( (lv_actors_6_0= ruleInteractorActorAlias ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1691:1: (lv_actors_6_0= ruleInteractorActorAlias )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1691:1: (lv_actors_6_0= ruleInteractorActorAlias )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1692:3: lv_actors_6_0= ruleInteractorActorAlias
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorComponentDeclarationAccess().getActorsInteractorActorAliasParserRuleCall_1_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorActorAlias_in_ruleInteractorComponentDeclaration3499);
            	    lv_actors_6_0=ruleInteractorActorAlias();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorComponentDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actors",
            	              		lv_actors_6_0, 
            	              		"InteractorActorAlias");
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
    // $ANTLR end "ruleInteractorComponentDeclaration"


    // $ANTLR start "entryRuleInteractorDataDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1716:1: entryRuleInteractorDataDeclaration returns [EObject current=null] : iv_ruleInteractorDataDeclaration= ruleInteractorDataDeclaration EOF ;
    public final EObject entryRuleInteractorDataDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorDataDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1717:2: (iv_ruleInteractorDataDeclaration= ruleInteractorDataDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1718:2: iv_ruleInteractorDataDeclaration= ruleInteractorDataDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorDataDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorDataDeclaration_in_entryRuleInteractorDataDeclaration3538);
            iv_ruleInteractorDataDeclaration=ruleInteractorDataDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorDataDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorDataDeclaration3548); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractorDataDeclaration"


    // $ANTLR start "ruleInteractorDataDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1725:1: ruleInteractorDataDeclaration returns [EObject current=null] : ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'event' (otherlv_5= 'from' ( (lv_source_6_0= ruleInteractorDataAlias ) ) )? (otherlv_7= 'to' ( (lv_destinations_8_0= ruleInteractorDataAlias ) ) )* ) ) | ( () ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_type_12_0= ruleDataType ) ) otherlv_13= 'flow' (otherlv_14= 'from' ( (lv_source_15_0= ruleInteractorDataAlias ) ) )? (otherlv_16= 'to' ( (lv_destinations_17_0= ruleInteractorDataAlias ) ) )* ) ) | ( () ( ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_type_21_0= ruleDataType ) ) otherlv_22= 'constant' ) ) ) ;
    public final EObject ruleInteractorDataDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_name_19_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_type_3_0 = null;

        EObject lv_source_6_0 = null;

        EObject lv_destinations_8_0 = null;

        EObject lv_type_12_0 = null;

        EObject lv_source_15_0 = null;

        EObject lv_destinations_17_0 = null;

        EObject lv_type_21_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1728:28: ( ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'event' (otherlv_5= 'from' ( (lv_source_6_0= ruleInteractorDataAlias ) ) )? (otherlv_7= 'to' ( (lv_destinations_8_0= ruleInteractorDataAlias ) ) )* ) ) | ( () ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_type_12_0= ruleDataType ) ) otherlv_13= 'flow' (otherlv_14= 'from' ( (lv_source_15_0= ruleInteractorDataAlias ) ) )? (otherlv_16= 'to' ( (lv_destinations_17_0= ruleInteractorDataAlias ) ) )* ) ) | ( () ( ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_type_21_0= ruleDataType ) ) otherlv_22= 'constant' ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1729:1: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'event' (otherlv_5= 'from' ( (lv_source_6_0= ruleInteractorDataAlias ) ) )? (otherlv_7= 'to' ( (lv_destinations_8_0= ruleInteractorDataAlias ) ) )* ) ) | ( () ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_type_12_0= ruleDataType ) ) otherlv_13= 'flow' (otherlv_14= 'from' ( (lv_source_15_0= ruleInteractorDataAlias ) ) )? (otherlv_16= 'to' ( (lv_destinations_17_0= ruleInteractorDataAlias ) ) )* ) ) | ( () ( ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_type_21_0= ruleDataType ) ) otherlv_22= 'constant' ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1729:1: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'event' (otherlv_5= 'from' ( (lv_source_6_0= ruleInteractorDataAlias ) ) )? (otherlv_7= 'to' ( (lv_destinations_8_0= ruleInteractorDataAlias ) ) )* ) ) | ( () ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_type_12_0= ruleDataType ) ) otherlv_13= 'flow' (otherlv_14= 'from' ( (lv_source_15_0= ruleInteractorDataAlias ) ) )? (otherlv_16= 'to' ( (lv_destinations_17_0= ruleInteractorDataAlias ) ) )* ) ) | ( () ( ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_type_21_0= ruleDataType ) ) otherlv_22= 'constant' ) ) )
            int alt30=3;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1729:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'event' (otherlv_5= 'from' ( (lv_source_6_0= ruleInteractorDataAlias ) ) )? (otherlv_7= 'to' ( (lv_destinations_8_0= ruleInteractorDataAlias ) ) )* ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1729:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'event' (otherlv_5= 'from' ( (lv_source_6_0= ruleInteractorDataAlias ) ) )? (otherlv_7= 'to' ( (lv_destinations_8_0= ruleInteractorDataAlias ) ) )* ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1729:3: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'event' (otherlv_5= 'from' ( (lv_source_6_0= ruleInteractorDataAlias ) ) )? (otherlv_7= 'to' ( (lv_destinations_8_0= ruleInteractorDataAlias ) ) )* )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1729:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1730:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorDataDeclarationAccess().getInteractorDataDeclarationEventAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1735:2: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'event' (otherlv_5= 'from' ( (lv_source_6_0= ruleInteractorDataAlias ) ) )? (otherlv_7= 'to' ( (lv_destinations_8_0= ruleInteractorDataAlias ) ) )* )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1735:3: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'event' (otherlv_5= 'from' ( (lv_source_6_0= ruleInteractorDataAlias ) ) )? (otherlv_7= 'to' ( (lv_destinations_8_0= ruleInteractorDataAlias ) ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1735:3: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1736:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1736:1: (lv_name_1_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1737:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorDataDeclaration3601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getInteractorDataDeclarationAccess().getNameIDTerminalRuleCall_0_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorDataDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleInteractorDataDeclaration3618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInteractorDataDeclarationAccess().getColonKeyword_0_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1757:1: ( (lv_type_3_0= ruleDataType ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1758:1: (lv_type_3_0= ruleDataType )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1758:1: (lv_type_3_0= ruleDataType )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1759:3: lv_type_3_0= ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorDataDeclarationAccess().getTypeDataTypeParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataType_in_ruleInteractorDataDeclaration3639);
                    lv_type_3_0=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorDataDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"DataType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleInteractorDataDeclaration3651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInteractorDataDeclarationAccess().getEventKeyword_0_1_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1779:1: (otherlv_5= 'from' ( (lv_source_6_0= ruleInteractorDataAlias ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==38) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1779:3: otherlv_5= 'from' ( (lv_source_6_0= ruleInteractorDataAlias ) )
                            {
                            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleInteractorDataDeclaration3664); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getInteractorDataDeclarationAccess().getFromKeyword_0_1_4_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1783:1: ( (lv_source_6_0= ruleInteractorDataAlias ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1784:1: (lv_source_6_0= ruleInteractorDataAlias )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1784:1: (lv_source_6_0= ruleInteractorDataAlias )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1785:3: lv_source_6_0= ruleInteractorDataAlias
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInteractorDataDeclarationAccess().getSourceInteractorDataAliasParserRuleCall_0_1_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInteractorDataAlias_in_ruleInteractorDataDeclaration3685);
                            lv_source_6_0=ruleInteractorDataAlias();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInteractorDataDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"source",
                                      		lv_source_6_0, 
                                      		"InteractorDataAlias");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1801:4: (otherlv_7= 'to' ( (lv_destinations_8_0= ruleInteractorDataAlias ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==39) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1801:6: otherlv_7= 'to' ( (lv_destinations_8_0= ruleInteractorDataAlias ) )
                    	    {
                    	    otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleInteractorDataDeclaration3700); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getInteractorDataDeclarationAccess().getToKeyword_0_1_5_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1805:1: ( (lv_destinations_8_0= ruleInteractorDataAlias ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1806:1: (lv_destinations_8_0= ruleInteractorDataAlias )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1806:1: (lv_destinations_8_0= ruleInteractorDataAlias )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1807:3: lv_destinations_8_0= ruleInteractorDataAlias
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInteractorDataDeclarationAccess().getDestinationsInteractorDataAliasParserRuleCall_0_1_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInteractorDataAlias_in_ruleInteractorDataDeclaration3721);
                    	    lv_destinations_8_0=ruleInteractorDataAlias();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInteractorDataDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"destinations",
                    	              		lv_destinations_8_0, 
                    	              		"InteractorDataAlias");
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


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1824:6: ( () ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_type_12_0= ruleDataType ) ) otherlv_13= 'flow' (otherlv_14= 'from' ( (lv_source_15_0= ruleInteractorDataAlias ) ) )? (otherlv_16= 'to' ( (lv_destinations_17_0= ruleInteractorDataAlias ) ) )* ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1824:6: ( () ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_type_12_0= ruleDataType ) ) otherlv_13= 'flow' (otherlv_14= 'from' ( (lv_source_15_0= ruleInteractorDataAlias ) ) )? (otherlv_16= 'to' ( (lv_destinations_17_0= ruleInteractorDataAlias ) ) )* ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1824:7: () ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_type_12_0= ruleDataType ) ) otherlv_13= 'flow' (otherlv_14= 'from' ( (lv_source_15_0= ruleInteractorDataAlias ) ) )? (otherlv_16= 'to' ( (lv_destinations_17_0= ruleInteractorDataAlias ) ) )* )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1824:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1825:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorDataDeclarationAccess().getInteractorDataDeclarationFlowAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1830:2: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_type_12_0= ruleDataType ) ) otherlv_13= 'flow' (otherlv_14= 'from' ( (lv_source_15_0= ruleInteractorDataAlias ) ) )? (otherlv_16= 'to' ( (lv_destinations_17_0= ruleInteractorDataAlias ) ) )* )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1830:3: ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_type_12_0= ruleDataType ) ) otherlv_13= 'flow' (otherlv_14= 'from' ( (lv_source_15_0= ruleInteractorDataAlias ) ) )? (otherlv_16= 'to' ( (lv_destinations_17_0= ruleInteractorDataAlias ) ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1830:3: ( (lv_name_10_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1831:1: (lv_name_10_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1831:1: (lv_name_10_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1832:3: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorDataDeclaration3759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_10_0, grammarAccess.getInteractorDataDeclarationAccess().getNameIDTerminalRuleCall_1_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorDataDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_10_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleInteractorDataDeclaration3776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getInteractorDataDeclarationAccess().getColonKeyword_1_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1852:1: ( (lv_type_12_0= ruleDataType ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1853:1: (lv_type_12_0= ruleDataType )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1853:1: (lv_type_12_0= ruleDataType )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1854:3: lv_type_12_0= ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorDataDeclarationAccess().getTypeDataTypeParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataType_in_ruleInteractorDataDeclaration3797);
                    lv_type_12_0=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorDataDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_12_0, 
                              		"DataType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,40,FOLLOW_40_in_ruleInteractorDataDeclaration3809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getInteractorDataDeclarationAccess().getFlowKeyword_1_1_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1874:1: (otherlv_14= 'from' ( (lv_source_15_0= ruleInteractorDataAlias ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==38) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1874:3: otherlv_14= 'from' ( (lv_source_15_0= ruleInteractorDataAlias ) )
                            {
                            otherlv_14=(Token)match(input,38,FOLLOW_38_in_ruleInteractorDataDeclaration3822); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getInteractorDataDeclarationAccess().getFromKeyword_1_1_4_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1878:1: ( (lv_source_15_0= ruleInteractorDataAlias ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1879:1: (lv_source_15_0= ruleInteractorDataAlias )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1879:1: (lv_source_15_0= ruleInteractorDataAlias )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1880:3: lv_source_15_0= ruleInteractorDataAlias
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInteractorDataDeclarationAccess().getSourceInteractorDataAliasParserRuleCall_1_1_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInteractorDataAlias_in_ruleInteractorDataDeclaration3843);
                            lv_source_15_0=ruleInteractorDataAlias();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInteractorDataDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"source",
                                      		lv_source_15_0, 
                                      		"InteractorDataAlias");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1896:4: (otherlv_16= 'to' ( (lv_destinations_17_0= ruleInteractorDataAlias ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==39) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1896:6: otherlv_16= 'to' ( (lv_destinations_17_0= ruleInteractorDataAlias ) )
                    	    {
                    	    otherlv_16=(Token)match(input,39,FOLLOW_39_in_ruleInteractorDataDeclaration3858); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_16, grammarAccess.getInteractorDataDeclarationAccess().getToKeyword_1_1_5_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1900:1: ( (lv_destinations_17_0= ruleInteractorDataAlias ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1901:1: (lv_destinations_17_0= ruleInteractorDataAlias )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1901:1: (lv_destinations_17_0= ruleInteractorDataAlias )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1902:3: lv_destinations_17_0= ruleInteractorDataAlias
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInteractorDataDeclarationAccess().getDestinationsInteractorDataAliasParserRuleCall_1_1_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInteractorDataAlias_in_ruleInteractorDataDeclaration3879);
                    	    lv_destinations_17_0=ruleInteractorDataAlias();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInteractorDataDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"destinations",
                    	              		lv_destinations_17_0, 
                    	              		"InteractorDataAlias");
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


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1919:6: ( () ( ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_type_21_0= ruleDataType ) ) otherlv_22= 'constant' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1919:6: ( () ( ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_type_21_0= ruleDataType ) ) otherlv_22= 'constant' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1919:7: () ( ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_type_21_0= ruleDataType ) ) otherlv_22= 'constant' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1919:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1920:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorDataDeclarationAccess().getInteractorDataDeclarationConstantAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1925:2: ( ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_type_21_0= ruleDataType ) ) otherlv_22= 'constant' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1925:3: ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_type_21_0= ruleDataType ) ) otherlv_22= 'constant'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1925:3: ( (lv_name_19_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1926:1: (lv_name_19_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1926:1: (lv_name_19_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1927:3: lv_name_19_0= RULE_ID
                    {
                    lv_name_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorDataDeclaration3917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_19_0, grammarAccess.getInteractorDataDeclarationAccess().getNameIDTerminalRuleCall_2_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorDataDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_19_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,14,FOLLOW_14_in_ruleInteractorDataDeclaration3934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getInteractorDataDeclarationAccess().getColonKeyword_2_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1947:1: ( (lv_type_21_0= ruleDataType ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1948:1: (lv_type_21_0= ruleDataType )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1948:1: (lv_type_21_0= ruleDataType )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1949:3: lv_type_21_0= ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorDataDeclarationAccess().getTypeDataTypeParserRuleCall_2_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataType_in_ruleInteractorDataDeclaration3955);
                    lv_type_21_0=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorDataDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_21_0, 
                              		"DataType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,41,FOLLOW_41_in_ruleInteractorDataDeclaration3967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getInteractorDataDeclarationAccess().getConstantKeyword_2_1_3());
                          
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
    // $ANTLR end "ruleInteractorDataDeclaration"


    // $ANTLR start "entryRuleInteractorActorAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1977:1: entryRuleInteractorActorAlias returns [EObject current=null] : iv_ruleInteractorActorAlias= ruleInteractorActorAlias EOF ;
    public final EObject entryRuleInteractorActorAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorActorAlias = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1978:2: (iv_ruleInteractorActorAlias= ruleInteractorActorAlias EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1979:2: iv_ruleInteractorActorAlias= ruleInteractorActorAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorActorAliasRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorActorAlias_in_entryRuleInteractorActorAlias4005);
            iv_ruleInteractorActorAlias=ruleInteractorActorAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorActorAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorActorAlias4015); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractorActorAlias"


    // $ANTLR start "ruleInteractorActorAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1986:1: ruleInteractorActorAlias returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleInteractorActorAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1989:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1990:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1990:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1990:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1990:2: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1991:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1991:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1992:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorActorAliasRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorActorAlias4060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getInteractorActorAliasAccess().getActorInteractorActorDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleInteractorActorAlias4072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractorActorAliasAccess().getAsKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2007:1: ( (otherlv_2= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2008:1: (otherlv_2= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2008:1: (otherlv_2= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2009:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorActorAliasRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorActorAlias4092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getInteractorActorAliasAccess().getAliasInteractorActorDeclarationCrossReference_2_0()); 
              	
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
    // $ANTLR end "ruleInteractorActorAlias"


    // $ANTLR start "entryRuleInteractorDataAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2028:1: entryRuleInteractorDataAlias returns [EObject current=null] : iv_ruleInteractorDataAlias= ruleInteractorDataAlias EOF ;
    public final EObject entryRuleInteractorDataAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorDataAlias = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2029:2: (iv_ruleInteractorDataAlias= ruleInteractorDataAlias EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2030:2: iv_ruleInteractorDataAlias= ruleInteractorDataAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorDataAliasRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorDataAlias_in_entryRuleInteractorDataAlias4128);
            iv_ruleInteractorDataAlias=ruleInteractorDataAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorDataAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorDataAlias4138); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractorDataAlias"


    // $ANTLR start "ruleInteractorDataAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2037:1: ruleInteractorDataAlias returns [EObject current=null] : ( ( (lv_entity_0_0= ruleInteractorEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleInteractorDataAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_entity_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2040:28: ( ( ( (lv_entity_0_0= ruleInteractorEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2041:1: ( ( (lv_entity_0_0= ruleInteractorEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2041:1: ( ( (lv_entity_0_0= ruleInteractorEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2041:2: ( (lv_entity_0_0= ruleInteractorEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2041:2: ( (lv_entity_0_0= ruleInteractorEntity ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:1: (lv_entity_0_0= ruleInteractorEntity )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:1: (lv_entity_0_0= ruleInteractorEntity )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2043:3: lv_entity_0_0= ruleInteractorEntity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorDataAliasAccess().getEntityInteractorEntityParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorEntity_in_ruleInteractorDataAlias4184);
            lv_entity_0_0=ruleInteractorEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorDataAliasRule());
              	        }
                     		set(
                     			current, 
                     			"entity",
                      		lv_entity_0_0, 
                      		"InteractorEntity");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2059:2: (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2059:4: otherlv_1= 'as' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleInteractorDataAlias4197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getInteractorDataAliasAccess().getAsKeyword_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2063:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2064:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2064:1: (otherlv_2= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2065:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorDataAliasRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorDataAlias4217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getInteractorDataAliasAccess().getAliasInteractorDataDeclarationCrossReference_1_1_0()); 
                      	
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
    // $ANTLR end "ruleInteractorDataAlias"


    // $ANTLR start "entryRuleInteractorEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2084:1: entryRuleInteractorEntity returns [EObject current=null] : iv_ruleInteractorEntity= ruleInteractorEntity EOF ;
    public final EObject entryRuleInteractorEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorEntity = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2085:2: (iv_ruleInteractorEntity= ruleInteractorEntity EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2086:2: iv_ruleInteractorEntity= ruleInteractorEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorEntityRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorEntity_in_entryRuleInteractorEntity4255);
            iv_ruleInteractorEntity=ruleInteractorEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorEntity4265); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractorEntity"


    // $ANTLR start "ruleInteractorEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2093:1: ruleInteractorEntity returns [EObject current=null] : ( ( () otherlv_1= 'any' ) | ( () otherlv_3= 'self' ) | ( () otherlv_5= 'other' ) | ( () otherlv_7= 'parent' ) | ( () otherlv_9= 'child' ) | ( () otherlv_11= 'all' ) | ( () otherlv_13= 'actors' ) | ( () ( (otherlv_15= RULE_ID ) ) ) ) ;
    public final EObject ruleInteractorEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2096:28: ( ( ( () otherlv_1= 'any' ) | ( () otherlv_3= 'self' ) | ( () otherlv_5= 'other' ) | ( () otherlv_7= 'parent' ) | ( () otherlv_9= 'child' ) | ( () otherlv_11= 'all' ) | ( () otherlv_13= 'actors' ) | ( () ( (otherlv_15= RULE_ID ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2097:1: ( ( () otherlv_1= 'any' ) | ( () otherlv_3= 'self' ) | ( () otherlv_5= 'other' ) | ( () otherlv_7= 'parent' ) | ( () otherlv_9= 'child' ) | ( () otherlv_11= 'all' ) | ( () otherlv_13= 'actors' ) | ( () ( (otherlv_15= RULE_ID ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2097:1: ( ( () otherlv_1= 'any' ) | ( () otherlv_3= 'self' ) | ( () otherlv_5= 'other' ) | ( () otherlv_7= 'parent' ) | ( () otherlv_9= 'child' ) | ( () otherlv_11= 'all' ) | ( () otherlv_13= 'actors' ) | ( () ( (otherlv_15= RULE_ID ) ) ) )
            int alt32=8;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt32=1;
                }
                break;
            case 44:
                {
                alt32=2;
                }
                break;
            case 45:
                {
                alt32=3;
                }
                break;
            case 46:
                {
                alt32=4;
                }
                break;
            case 47:
                {
                alt32=5;
                }
                break;
            case 48:
                {
                alt32=6;
                }
                break;
            case 49:
                {
                alt32=7;
                }
                break;
            case RULE_ID:
                {
                alt32=8;
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2097:2: ( () otherlv_1= 'any' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2097:2: ( () otherlv_1= 'any' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2097:3: () otherlv_1= 'any'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2097:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2098:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorEntityAccess().getInteractorEntityAnyAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleInteractorEntity4312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getInteractorEntityAccess().getAnyKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2108:6: ( () otherlv_3= 'self' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2108:6: ( () otherlv_3= 'self' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2108:7: () otherlv_3= 'self'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2108:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2109:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorEntityAccess().getInteractorEntitySelfAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleInteractorEntity4341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInteractorEntityAccess().getSelfKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2119:6: ( () otherlv_5= 'other' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2119:6: ( () otherlv_5= 'other' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2119:7: () otherlv_5= 'other'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2119:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2120:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorEntityAccess().getInteractorEntityOtherAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleInteractorEntity4370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getInteractorEntityAccess().getOtherKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2130:6: ( () otherlv_7= 'parent' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2130:6: ( () otherlv_7= 'parent' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2130:7: () otherlv_7= 'parent'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2130:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2131:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorEntityAccess().getInteractorEntityParentAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleInteractorEntity4399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getInteractorEntityAccess().getParentKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2141:6: ( () otherlv_9= 'child' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2141:6: ( () otherlv_9= 'child' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2141:7: () otherlv_9= 'child'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2141:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2142:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorEntityAccess().getInteractorEntityChildAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleInteractorEntity4428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getInteractorEntityAccess().getChildKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2152:6: ( () otherlv_11= 'all' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2152:6: ( () otherlv_11= 'all' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2152:7: () otherlv_11= 'all'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2152:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2153:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorEntityAccess().getInteractorEntityAllAction_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_11=(Token)match(input,48,FOLLOW_48_in_ruleInteractorEntity4457); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getInteractorEntityAccess().getAllKeyword_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2163:6: ( () otherlv_13= 'actors' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2163:6: ( () otherlv_13= 'actors' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2163:7: () otherlv_13= 'actors'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2163:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2164:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorEntityAccess().getInteractorEntityActorsAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleInteractorEntity4486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getInteractorEntityAccess().getActorsKeyword_6_1());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2174:6: ( () ( (otherlv_15= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2174:6: ( () ( (otherlv_15= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2174:7: () ( (otherlv_15= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2174:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2175:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorEntityAccess().getInteractorEntitySpecificAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2180:2: ( (otherlv_15= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2181:1: (otherlv_15= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2181:1: (otherlv_15= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2182:3: otherlv_15= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorEntityRule());
                      	        }
                              
                    }
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorEntity4523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_15, grammarAccess.getInteractorEntityAccess().getEntityInteractorEntityDeclarationCrossReference_7_1_0()); 
                      	
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
    // $ANTLR end "ruleInteractorEntity"


    // $ANTLR start "entryRuleInteractorDataReception"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2201:1: entryRuleInteractorDataReception returns [EObject current=null] : iv_ruleInteractorDataReception= ruleInteractorDataReception EOF ;
    public final EObject entryRuleInteractorDataReception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorDataReception = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2202:2: (iv_ruleInteractorDataReception= ruleInteractorDataReception EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2203:2: iv_ruleInteractorDataReception= ruleInteractorDataReception EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorDataReceptionRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorDataReception_in_entryRuleInteractorDataReception4560);
            iv_ruleInteractorDataReception=ruleInteractorDataReception();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorDataReception; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorDataReception4570); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractorDataReception"


    // $ANTLR start "ruleInteractorDataReception"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2210:1: ruleInteractorDataReception returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorDataAlias ) ) ) ) | ( () otherlv_7= 'init' ) ) ;
    public final EObject ruleInteractorDataReception() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_source_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2213:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorDataAlias ) ) ) ) | ( () otherlv_7= 'init' ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2214:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorDataAlias ) ) ) ) | ( () otherlv_7= 'init' ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2214:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorDataAlias ) ) ) ) | ( () otherlv_7= 'init' ) )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==EOF||LA33_1==RULE_ID||LA33_1==14||LA33_1==26||(LA33_1>=30 && LA33_1<=31)||LA33_1==34||(LA33_1>=51 && LA33_1<=54)||(LA33_1>=56 && LA33_1<=71)||(LA33_1>=74 && LA33_1<=75)||(LA33_1>=77 && LA33_1<=78)) ) {
                    alt33=1;
                }
                else if ( (LA33_1==38) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==50) ) {
                alt33=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2214:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2214:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2214:3: () ( (otherlv_1= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2214:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2215:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorDataReceptionAccess().getInteractorDataReceptionInternalAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2220:2: ( (otherlv_1= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2221:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2221:1: (otherlv_1= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2222:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorDataReceptionRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorDataReception4625); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getInteractorDataReceptionAccess().getDataInteractorDataDeclarationCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2234:6: ( () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorDataAlias ) ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2234:6: ( () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorDataAlias ) ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2234:7: () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorDataAlias ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2234:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2235:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorDataReceptionAccess().getInteractorDataReceptionExternalAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2240:2: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorDataAlias ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2240:3: ( (otherlv_3= RULE_ID ) ) otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorDataAlias ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2240:3: ( (otherlv_3= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2241:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2241:1: (otherlv_3= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2242:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorDataReceptionRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorDataReception4663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getInteractorDataReceptionAccess().getDataInteractorDataDeclarationCrossReference_1_1_0_0()); 
                      	
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleInteractorDataReception4675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInteractorDataReceptionAccess().getFromKeyword_1_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2257:1: ( (lv_source_5_0= ruleInteractorDataAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2258:1: (lv_source_5_0= ruleInteractorDataAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2258:1: (lv_source_5_0= ruleInteractorDataAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2259:3: lv_source_5_0= ruleInteractorDataAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorDataReceptionAccess().getSourceInteractorDataAliasParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInteractorDataAlias_in_ruleInteractorDataReception4696);
                    lv_source_5_0=ruleInteractorDataAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorDataReceptionRule());
                      	        }
                             		set(
                             			current, 
                             			"source",
                              		lv_source_5_0, 
                              		"InteractorDataAlias");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2276:6: ( () otherlv_7= 'init' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2276:6: ( () otherlv_7= 'init' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2276:7: () otherlv_7= 'init'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2276:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2277:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorDataReceptionAccess().getInteractorDataReceptionInitAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleInteractorDataReception4726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getInteractorDataReceptionAccess().getInitKeyword_2_1());
                          
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
    // $ANTLR end "ruleInteractorDataReception"


    // $ANTLR start "entryRuleInteractorDataEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2294:1: entryRuleInteractorDataEmission returns [EObject current=null] : iv_ruleInteractorDataEmission= ruleInteractorDataEmission EOF ;
    public final EObject entryRuleInteractorDataEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorDataEmission = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2295:2: (iv_ruleInteractorDataEmission= ruleInteractorDataEmission EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2296:2: iv_ruleInteractorDataEmission= ruleInteractorDataEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorDataEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorDataEmission_in_entryRuleInteractorDataEmission4763);
            iv_ruleInteractorDataEmission=ruleInteractorDataEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorDataEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorDataEmission4773); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractorDataEmission"


    // $ANTLR start "ruleInteractorDataEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2303:1: ruleInteractorDataEmission returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_destination_5_0= ruleInteractorDataAlias ) ) ) ) ) ;
    public final EObject ruleInteractorDataEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_destination_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2306:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_destination_5_0= ruleInteractorDataAlias ) ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2307:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_destination_5_0= ruleInteractorDataAlias ) ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2307:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_destination_5_0= ruleInteractorDataAlias ) ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==39) ) {
                    alt34=2;
                }
                else if ( (LA34_1==EOF||LA34_1==55) ) {
                    alt34=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2307:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2307:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2307:3: () ( (otherlv_1= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2307:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2308:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorDataEmissionAccess().getInteractorDataEmissionInternalAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2313:2: ( (otherlv_1= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2314:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2314:1: (otherlv_1= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2315:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorDataEmissionRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorDataEmission4828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getInteractorDataEmissionAccess().getDataInteractorDataDeclarationCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2327:6: ( () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_destination_5_0= ruleInteractorDataAlias ) ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2327:6: ( () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_destination_5_0= ruleInteractorDataAlias ) ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2327:7: () ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_destination_5_0= ruleInteractorDataAlias ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2327:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2328:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorDataEmissionAccess().getInteractorDataEmissionExternalAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2333:2: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_destination_5_0= ruleInteractorDataAlias ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2333:3: ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_destination_5_0= ruleInteractorDataAlias ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2333:3: ( (otherlv_3= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2334:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2334:1: (otherlv_3= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2335:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorDataEmissionRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorDataEmission4866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getInteractorDataEmissionAccess().getDataInteractorDataDeclarationCrossReference_1_1_0_0()); 
                      	
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleInteractorDataEmission4878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInteractorDataEmissionAccess().getToKeyword_1_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2350:1: ( (lv_destination_5_0= ruleInteractorDataAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2351:1: (lv_destination_5_0= ruleInteractorDataAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2351:1: (lv_destination_5_0= ruleInteractorDataAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2352:3: lv_destination_5_0= ruleInteractorDataAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorDataEmissionAccess().getDestinationInteractorDataAliasParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInteractorDataAlias_in_ruleInteractorDataEmission4899);
                    lv_destination_5_0=ruleInteractorDataAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorDataEmissionRule());
                      	        }
                             		set(
                             			current, 
                             			"destination",
                              		lv_destination_5_0, 
                              		"InteractorDataAlias");
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
    // $ANTLR end "ruleInteractorDataEmission"


    // $ANTLR start "entryRuleInteractorBehaviorDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2376:1: entryRuleInteractorBehaviorDeclaration returns [EObject current=null] : iv_ruleInteractorBehaviorDeclaration= ruleInteractorBehaviorDeclaration EOF ;
    public final EObject entryRuleInteractorBehaviorDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2377:2: (iv_ruleInteractorBehaviorDeclaration= ruleInteractorBehaviorDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2378:2: iv_ruleInteractorBehaviorDeclaration= ruleInteractorBehaviorDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorDeclaration_in_entryRuleInteractorBehaviorDeclaration4937);
            iv_ruleInteractorBehaviorDeclaration=ruleInteractorBehaviorDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorDeclaration4947); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractorBehaviorDeclaration"


    // $ANTLR start "ruleInteractorBehaviorDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2385:1: ruleInteractorBehaviorDeclaration returns [EObject current=null] : ( () ( (lv_cause_1_0= ruleInteractorBehaviorCause ) ) otherlv_2= ':' ( (lv_effect_3_0= ruleInteractorBehaviorEffect ) )+ ) ;
    public final EObject ruleInteractorBehaviorDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_cause_1_0 = null;

        EObject lv_effect_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2388:28: ( ( () ( (lv_cause_1_0= ruleInteractorBehaviorCause ) ) otherlv_2= ':' ( (lv_effect_3_0= ruleInteractorBehaviorEffect ) )+ ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2389:1: ( () ( (lv_cause_1_0= ruleInteractorBehaviorCause ) ) otherlv_2= ':' ( (lv_effect_3_0= ruleInteractorBehaviorEffect ) )+ )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2389:1: ( () ( (lv_cause_1_0= ruleInteractorBehaviorCause ) ) otherlv_2= ':' ( (lv_effect_3_0= ruleInteractorBehaviorEffect ) )+ )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2389:2: () ( (lv_cause_1_0= ruleInteractorBehaviorCause ) ) otherlv_2= ':' ( (lv_effect_3_0= ruleInteractorBehaviorEffect ) )+
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2389:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2390:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInteractorBehaviorDeclarationAccess().getInteractorBehaviorDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2395:2: ( (lv_cause_1_0= ruleInteractorBehaviorCause ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2396:1: (lv_cause_1_0= ruleInteractorBehaviorCause )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2396:1: (lv_cause_1_0= ruleInteractorBehaviorCause )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2397:3: lv_cause_1_0= ruleInteractorBehaviorCause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorDeclarationAccess().getCauseInteractorBehaviorCauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorCause_in_ruleInteractorBehaviorDeclaration5002);
            lv_cause_1_0=ruleInteractorBehaviorCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"cause",
                      		lv_cause_1_0, 
                      		"InteractorBehaviorCause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleInteractorBehaviorDeclaration5014); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorBehaviorDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2417:1: ( (lv_effect_3_0= ruleInteractorBehaviorEffect ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==26||LA35_0==54||LA35_0==56) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2418:1: (lv_effect_3_0= ruleInteractorBehaviorEffect )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2418:1: (lv_effect_3_0= ruleInteractorBehaviorEffect )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2419:3: lv_effect_3_0= ruleInteractorBehaviorEffect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorBehaviorDeclarationAccess().getEffectInteractorBehaviorEffectParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorBehaviorEffect_in_ruleInteractorBehaviorDeclaration5035);
            	    lv_effect_3_0=ruleInteractorBehaviorEffect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"effect",
            	              		lv_effect_3_0, 
            	              		"InteractorBehaviorEffect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
    // $ANTLR end "ruleInteractorBehaviorDeclaration"


    // $ANTLR start "entryRuleInteractorBehaviorCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2443:1: entryRuleInteractorBehaviorCause returns [EObject current=null] : iv_ruleInteractorBehaviorCause= ruleInteractorBehaviorCause EOF ;
    public final EObject entryRuleInteractorBehaviorCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2444:2: (iv_ruleInteractorBehaviorCause= ruleInteractorBehaviorCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2445:2: iv_ruleInteractorBehaviorCause= ruleInteractorBehaviorCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorCauseRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorCause_in_entryRuleInteractorBehaviorCause5072);
            iv_ruleInteractorBehaviorCause=ruleInteractorBehaviorCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorCause5082); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2452:1: ruleInteractorBehaviorCause returns [EObject current=null] : ( ( () otherlv_1= 'on' ( (lv_event_2_0= ruleInteractorDataReception ) ) (otherlv_3= 'if' ( (lv_guard_4_0= ruleExpression ) ) )? ) | ( () otherlv_6= 'when' ( (lv_condition_7_0= ruleExpression ) ) (otherlv_8= 'if' ( (lv_guard_9_0= ruleExpression ) ) )? ) ) ;
    public final EObject ruleInteractorBehaviorCause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_event_2_0 = null;

        EObject lv_guard_4_0 = null;

        EObject lv_condition_7_0 = null;

        EObject lv_guard_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2455:28: ( ( ( () otherlv_1= 'on' ( (lv_event_2_0= ruleInteractorDataReception ) ) (otherlv_3= 'if' ( (lv_guard_4_0= ruleExpression ) ) )? ) | ( () otherlv_6= 'when' ( (lv_condition_7_0= ruleExpression ) ) (otherlv_8= 'if' ( (lv_guard_9_0= ruleExpression ) ) )? ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2456:1: ( ( () otherlv_1= 'on' ( (lv_event_2_0= ruleInteractorDataReception ) ) (otherlv_3= 'if' ( (lv_guard_4_0= ruleExpression ) ) )? ) | ( () otherlv_6= 'when' ( (lv_condition_7_0= ruleExpression ) ) (otherlv_8= 'if' ( (lv_guard_9_0= ruleExpression ) ) )? ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2456:1: ( ( () otherlv_1= 'on' ( (lv_event_2_0= ruleInteractorDataReception ) ) (otherlv_3= 'if' ( (lv_guard_4_0= ruleExpression ) ) )? ) | ( () otherlv_6= 'when' ( (lv_condition_7_0= ruleExpression ) ) (otherlv_8= 'if' ( (lv_guard_9_0= ruleExpression ) ) )? ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            else if ( (LA38_0==53) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2456:2: ( () otherlv_1= 'on' ( (lv_event_2_0= ruleInteractorDataReception ) ) (otherlv_3= 'if' ( (lv_guard_4_0= ruleExpression ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2456:2: ( () otherlv_1= 'on' ( (lv_event_2_0= ruleInteractorDataReception ) ) (otherlv_3= 'if' ( (lv_guard_4_0= ruleExpression ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2456:3: () otherlv_1= 'on' ( (lv_event_2_0= ruleInteractorDataReception ) ) (otherlv_3= 'if' ( (lv_guard_4_0= ruleExpression ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2456:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2457:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorBehaviorCauseAccess().getInteractorBehaviorCauseOnAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleInteractorBehaviorCause5129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getInteractorBehaviorCauseAccess().getOnKeyword_0_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2466:1: ( (lv_event_2_0= ruleInteractorDataReception ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2467:1: (lv_event_2_0= ruleInteractorDataReception )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2467:1: (lv_event_2_0= ruleInteractorDataReception )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2468:3: lv_event_2_0= ruleInteractorDataReception
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorBehaviorCauseAccess().getEventInteractorDataReceptionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInteractorDataReception_in_ruleInteractorBehaviorCause5150);
                    lv_event_2_0=ruleInteractorDataReception();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorCauseRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_2_0, 
                              		"InteractorDataReception");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2484:2: (otherlv_3= 'if' ( (lv_guard_4_0= ruleExpression ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==52) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2484:4: otherlv_3= 'if' ( (lv_guard_4_0= ruleExpression ) )
                            {
                            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleInteractorBehaviorCause5163); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getInteractorBehaviorCauseAccess().getIfKeyword_0_3_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2488:1: ( (lv_guard_4_0= ruleExpression ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2489:1: (lv_guard_4_0= ruleExpression )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2489:1: (lv_guard_4_0= ruleExpression )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2490:3: lv_guard_4_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInteractorBehaviorCauseAccess().getGuardExpressionParserRuleCall_0_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorCause5184);
                            lv_guard_4_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorCauseRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"guard",
                                      		lv_guard_4_0, 
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
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2507:6: ( () otherlv_6= 'when' ( (lv_condition_7_0= ruleExpression ) ) (otherlv_8= 'if' ( (lv_guard_9_0= ruleExpression ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2507:6: ( () otherlv_6= 'when' ( (lv_condition_7_0= ruleExpression ) ) (otherlv_8= 'if' ( (lv_guard_9_0= ruleExpression ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2507:7: () otherlv_6= 'when' ( (lv_condition_7_0= ruleExpression ) ) (otherlv_8= 'if' ( (lv_guard_9_0= ruleExpression ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2507:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2508:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorBehaviorCauseAccess().getInteractorBehaviorCauseWhenAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleInteractorBehaviorCause5215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInteractorBehaviorCauseAccess().getWhenKeyword_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2517:1: ( (lv_condition_7_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2518:1: (lv_condition_7_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2518:1: (lv_condition_7_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2519:3: lv_condition_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorBehaviorCauseAccess().getConditionExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorCause5236);
                    lv_condition_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorCauseRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_7_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2535:2: (otherlv_8= 'if' ( (lv_guard_9_0= ruleExpression ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==52) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2535:4: otherlv_8= 'if' ( (lv_guard_9_0= ruleExpression ) )
                            {
                            otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleInteractorBehaviorCause5249); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getInteractorBehaviorCauseAccess().getIfKeyword_1_3_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2539:1: ( (lv_guard_9_0= ruleExpression ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2540:1: (lv_guard_9_0= ruleExpression )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2540:1: (lv_guard_9_0= ruleExpression )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2541:3: lv_guard_9_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInteractorBehaviorCauseAccess().getGuardExpressionParserRuleCall_1_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorCause5270);
                            lv_guard_9_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorCauseRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"guard",
                                      		lv_guard_9_0, 
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


    // $ANTLR start "entryRuleInteractorBehaviorEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2565:1: entryRuleInteractorBehaviorEffect returns [EObject current=null] : iv_ruleInteractorBehaviorEffect= ruleInteractorBehaviorEffect EOF ;
    public final EObject entryRuleInteractorBehaviorEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2566:2: (iv_ruleInteractorBehaviorEffect= ruleInteractorBehaviorEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2567:2: iv_ruleInteractorBehaviorEffect= ruleInteractorBehaviorEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorEffectRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorEffect_in_entryRuleInteractorBehaviorEffect5309);
            iv_ruleInteractorBehaviorEffect=ruleInteractorBehaviorEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorEffect5319); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2574:1: ruleInteractorBehaviorEffect returns [EObject current=null] : ( ( () (otherlv_1= 'always' ( (lv_target_2_0= ruleInteractorDataEmission ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) ) | ( () (otherlv_6= 'set' ( (lv_target_7_0= ruleInteractorDataEmission ) ) otherlv_8= '=' ( (lv_value_9_0= ruleExpression ) ) ) ) | ( () (otherlv_11= 'trigger' ( (lv_target_12_0= ruleInteractorDataEmission ) ) otherlv_13= '=' ( (lv_value_14_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleInteractorBehaviorEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_target_2_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_target_7_0 = null;

        EObject lv_value_9_0 = null;

        EObject lv_target_12_0 = null;

        EObject lv_value_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2577:28: ( ( ( () (otherlv_1= 'always' ( (lv_target_2_0= ruleInteractorDataEmission ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) ) | ( () (otherlv_6= 'set' ( (lv_target_7_0= ruleInteractorDataEmission ) ) otherlv_8= '=' ( (lv_value_9_0= ruleExpression ) ) ) ) | ( () (otherlv_11= 'trigger' ( (lv_target_12_0= ruleInteractorDataEmission ) ) otherlv_13= '=' ( (lv_value_14_0= ruleExpression ) ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2578:1: ( ( () (otherlv_1= 'always' ( (lv_target_2_0= ruleInteractorDataEmission ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) ) | ( () (otherlv_6= 'set' ( (lv_target_7_0= ruleInteractorDataEmission ) ) otherlv_8= '=' ( (lv_value_9_0= ruleExpression ) ) ) ) | ( () (otherlv_11= 'trigger' ( (lv_target_12_0= ruleInteractorDataEmission ) ) otherlv_13= '=' ( (lv_value_14_0= ruleExpression ) ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2578:1: ( ( () (otherlv_1= 'always' ( (lv_target_2_0= ruleInteractorDataEmission ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) ) | ( () (otherlv_6= 'set' ( (lv_target_7_0= ruleInteractorDataEmission ) ) otherlv_8= '=' ( (lv_value_9_0= ruleExpression ) ) ) ) | ( () (otherlv_11= 'trigger' ( (lv_target_12_0= ruleInteractorDataEmission ) ) otherlv_13= '=' ( (lv_value_14_0= ruleExpression ) ) ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt39=1;
                }
                break;
            case 26:
                {
                alt39=2;
                }
                break;
            case 56:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2578:2: ( () (otherlv_1= 'always' ( (lv_target_2_0= ruleInteractorDataEmission ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2578:2: ( () (otherlv_1= 'always' ( (lv_target_2_0= ruleInteractorDataEmission ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2578:3: () (otherlv_1= 'always' ( (lv_target_2_0= ruleInteractorDataEmission ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2578:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2579:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorBehaviorEffectAccess().getInteractorBehaviorEffectAlwaysAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2584:2: (otherlv_1= 'always' ( (lv_target_2_0= ruleInteractorDataEmission ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2584:4: otherlv_1= 'always' ( (lv_target_2_0= ruleInteractorDataEmission ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleInteractorBehaviorEffect5367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getInteractorBehaviorEffectAccess().getAlwaysKeyword_0_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2588:1: ( (lv_target_2_0= ruleInteractorDataEmission ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2589:1: (lv_target_2_0= ruleInteractorDataEmission )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2589:1: (lv_target_2_0= ruleInteractorDataEmission )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2590:3: lv_target_2_0= ruleInteractorDataEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorBehaviorEffectAccess().getTargetInteractorDataEmissionParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInteractorDataEmission_in_ruleInteractorBehaviorEffect5388);
                    lv_target_2_0=ruleInteractorDataEmission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorEffectRule());
                      	        }
                             		set(
                             			current, 
                             			"target",
                              		lv_target_2_0, 
                              		"InteractorDataEmission");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleInteractorBehaviorEffect5400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInteractorBehaviorEffectAccess().getEqualsSignKeyword_0_1_2());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2610:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2611:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2611:1: (lv_value_4_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2612:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorBehaviorEffectAccess().getValueExpressionParserRuleCall_0_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorEffect5421);
                    lv_value_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorEffectRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2629:6: ( () (otherlv_6= 'set' ( (lv_target_7_0= ruleInteractorDataEmission ) ) otherlv_8= '=' ( (lv_value_9_0= ruleExpression ) ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2629:6: ( () (otherlv_6= 'set' ( (lv_target_7_0= ruleInteractorDataEmission ) ) otherlv_8= '=' ( (lv_value_9_0= ruleExpression ) ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2629:7: () (otherlv_6= 'set' ( (lv_target_7_0= ruleInteractorDataEmission ) ) otherlv_8= '=' ( (lv_value_9_0= ruleExpression ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2629:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2630:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorBehaviorEffectAccess().getInteractorBehaviorEffectSetAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2635:2: (otherlv_6= 'set' ( (lv_target_7_0= ruleInteractorDataEmission ) ) otherlv_8= '=' ( (lv_value_9_0= ruleExpression ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2635:4: otherlv_6= 'set' ( (lv_target_7_0= ruleInteractorDataEmission ) ) otherlv_8= '=' ( (lv_value_9_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleInteractorBehaviorEffect5452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInteractorBehaviorEffectAccess().getSetKeyword_1_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2639:1: ( (lv_target_7_0= ruleInteractorDataEmission ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2640:1: (lv_target_7_0= ruleInteractorDataEmission )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2640:1: (lv_target_7_0= ruleInteractorDataEmission )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2641:3: lv_target_7_0= ruleInteractorDataEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorBehaviorEffectAccess().getTargetInteractorDataEmissionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInteractorDataEmission_in_ruleInteractorBehaviorEffect5473);
                    lv_target_7_0=ruleInteractorDataEmission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorEffectRule());
                      	        }
                             		set(
                             			current, 
                             			"target",
                              		lv_target_7_0, 
                              		"InteractorDataEmission");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,55,FOLLOW_55_in_ruleInteractorBehaviorEffect5485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getInteractorBehaviorEffectAccess().getEqualsSignKeyword_1_1_2());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2661:1: ( (lv_value_9_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2662:1: (lv_value_9_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2662:1: (lv_value_9_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2663:3: lv_value_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorBehaviorEffectAccess().getValueExpressionParserRuleCall_1_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorEffect5506);
                    lv_value_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorEffectRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_9_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2680:6: ( () (otherlv_11= 'trigger' ( (lv_target_12_0= ruleInteractorDataEmission ) ) otherlv_13= '=' ( (lv_value_14_0= ruleExpression ) ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2680:6: ( () (otherlv_11= 'trigger' ( (lv_target_12_0= ruleInteractorDataEmission ) ) otherlv_13= '=' ( (lv_value_14_0= ruleExpression ) ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2680:7: () (otherlv_11= 'trigger' ( (lv_target_12_0= ruleInteractorDataEmission ) ) otherlv_13= '=' ( (lv_value_14_0= ruleExpression ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2680:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2681:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInteractorBehaviorEffectAccess().getInteractorBehaviorEffectTriggerAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2686:2: (otherlv_11= 'trigger' ( (lv_target_12_0= ruleInteractorDataEmission ) ) otherlv_13= '=' ( (lv_value_14_0= ruleExpression ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2686:4: otherlv_11= 'trigger' ( (lv_target_12_0= ruleInteractorDataEmission ) ) otherlv_13= '=' ( (lv_value_14_0= ruleExpression ) )
                    {
                    otherlv_11=(Token)match(input,56,FOLLOW_56_in_ruleInteractorBehaviorEffect5537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getInteractorBehaviorEffectAccess().getTriggerKeyword_2_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2690:1: ( (lv_target_12_0= ruleInteractorDataEmission ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2691:1: (lv_target_12_0= ruleInteractorDataEmission )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2691:1: (lv_target_12_0= ruleInteractorDataEmission )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2692:3: lv_target_12_0= ruleInteractorDataEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorBehaviorEffectAccess().getTargetInteractorDataEmissionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInteractorDataEmission_in_ruleInteractorBehaviorEffect5558);
                    lv_target_12_0=ruleInteractorDataEmission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorEffectRule());
                      	        }
                             		set(
                             			current, 
                             			"target",
                              		lv_target_12_0, 
                              		"InteractorDataEmission");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,55,FOLLOW_55_in_ruleInteractorBehaviorEffect5570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getInteractorBehaviorEffectAccess().getEqualsSignKeyword_2_1_2());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2712:1: ( (lv_value_14_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2713:1: (lv_value_14_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2713:1: (lv_value_14_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2714:3: lv_value_14_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorBehaviorEffectAccess().getValueExpressionParserRuleCall_2_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorEffect5591);
                    lv_value_14_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorEffectRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_14_0, 
                              		"Expression");
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
    // $ANTLR end "ruleInteractorBehaviorEffect"


    // $ANTLR start "entryRuleExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2738:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2739:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2740:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5629);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5639); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2747:1: ruleExpression returns [EObject current=null] : this_ExpressionOr_0= ruleExpressionOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionOr_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2750:28: (this_ExpressionOr_0= ruleExpressionOr )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:5: this_ExpressionOr_0= ruleExpressionOr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getExpressionOrParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionOr_in_ruleExpression5685);
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2768:1: entryRuleExpressionOr returns [EObject current=null] : iv_ruleExpressionOr= ruleExpressionOr EOF ;
    public final EObject entryRuleExpressionOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionOr = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2769:2: (iv_ruleExpressionOr= ruleExpressionOr EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2770:2: iv_ruleExpressionOr= ruleExpressionOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOrRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionOr_in_entryRuleExpressionOr5719);
            iv_ruleExpressionOr=ruleExpressionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOr5729); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2777:1: ruleExpressionOr returns [EObject current=null] : (this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )* ) ;
    public final EObject ruleExpressionOr() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionAnd_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2780:28: ( (this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2781:1: (this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2781:1: (this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2782:5: this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionOrAccess().getExpressionAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionAnd_in_ruleExpressionOr5776);
            this_ExpressionAnd_0=ruleExpressionAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2790:1: ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==57) ) {
                    int LA40_2 = input.LA(2);

                    if ( (synpred5_InternalLil()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2790:2: ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2790:2: ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2790:3: ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2795:6: ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2795:7: () ( (lv_feature_2_0= ruleExpressionOrOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2795:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2796:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2801:2: ( (lv_feature_2_0= ruleExpressionOrOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2802:1: (lv_feature_2_0= ruleExpressionOrOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2802:1: (lv_feature_2_0= ruleExpressionOrOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2803:3: lv_feature_2_0= ruleExpressionOrOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOrAccess().getFeatureExpressionOrOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionOrOp_in_ruleExpressionOr5825);
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

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2819:4: ( (lv_rightOperand_3_0= ruleExpressionAnd ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2820:1: (lv_rightOperand_3_0= ruleExpressionAnd )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2820:1: (lv_rightOperand_3_0= ruleExpressionAnd )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2821:3: lv_rightOperand_3_0= ruleExpressionAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOrAccess().getRightOperandExpressionAndParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionAnd_in_ruleExpressionOr5848);
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
    // $ANTLR end "ruleExpressionOr"


    // $ANTLR start "entryRuleExpressionOrOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2845:1: entryRuleExpressionOrOp returns [String current=null] : iv_ruleExpressionOrOp= ruleExpressionOrOp EOF ;
    public final String entryRuleExpressionOrOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionOrOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2846:2: (iv_ruleExpressionOrOp= ruleExpressionOrOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2847:2: iv_ruleExpressionOrOp= ruleExpressionOrOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOrOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionOrOp_in_entryRuleExpressionOrOp5887);
            iv_ruleExpressionOrOp=ruleExpressionOrOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOrOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOrOp5898); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2854:1: ruleExpressionOrOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'or' ;
    public final AntlrDatatypeRuleToken ruleExpressionOrOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2857:28: (kw= 'or' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2859:2: kw= 'or'
            {
            kw=(Token)match(input,57,FOLLOW_57_in_ruleExpressionOrOp5935); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2872:1: entryRuleExpressionAnd returns [EObject current=null] : iv_ruleExpressionAnd= ruleExpressionAnd EOF ;
    public final EObject entryRuleExpressionAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionAnd = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2873:2: (iv_ruleExpressionAnd= ruleExpressionAnd EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2874:2: iv_ruleExpressionAnd= ruleExpressionAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAndRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionAnd_in_entryRuleExpressionAnd5974);
            iv_ruleExpressionAnd=ruleExpressionAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionAnd5984); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2881:1: ruleExpressionAnd returns [EObject current=null] : (this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )* ) ;
    public final EObject ruleExpressionAnd() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionEquality_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2884:28: ( (this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2885:1: (this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2885:1: (this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2886:5: this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAndAccess().getExpressionEqualityParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionEquality_in_ruleExpressionAnd6031);
            this_ExpressionEquality_0=ruleExpressionEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionEquality_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2894:1: ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==58) ) {
                    int LA41_2 = input.LA(2);

                    if ( (synpred6_InternalLil()) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2894:2: ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2894:2: ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2894:3: ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2899:6: ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2899:7: () ( (lv_feature_2_0= ruleExpressionAndOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2899:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2900:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2905:2: ( (lv_feature_2_0= ruleExpressionAndOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2906:1: (lv_feature_2_0= ruleExpressionAndOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2906:1: (lv_feature_2_0= ruleExpressionAndOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2907:3: lv_feature_2_0= ruleExpressionAndOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAndAccess().getFeatureExpressionAndOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionAndOp_in_ruleExpressionAnd6080);
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

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2923:4: ( (lv_rightOperand_3_0= ruleExpressionEquality ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2924:1: (lv_rightOperand_3_0= ruleExpressionEquality )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2924:1: (lv_rightOperand_3_0= ruleExpressionEquality )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2925:3: lv_rightOperand_3_0= ruleExpressionEquality
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAndAccess().getRightOperandExpressionEqualityParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionEquality_in_ruleExpressionAnd6103);
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
            	    break loop41;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2949:1: entryRuleExpressionAndOp returns [String current=null] : iv_ruleExpressionAndOp= ruleExpressionAndOp EOF ;
    public final String entryRuleExpressionAndOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionAndOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2950:2: (iv_ruleExpressionAndOp= ruleExpressionAndOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2951:2: iv_ruleExpressionAndOp= ruleExpressionAndOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAndOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionAndOp_in_entryRuleExpressionAndOp6142);
            iv_ruleExpressionAndOp=ruleExpressionAndOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAndOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionAndOp6153); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2958:1: ruleExpressionAndOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleExpressionAndOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2961:28: (kw= 'and' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2963:2: kw= 'and'
            {
            kw=(Token)match(input,58,FOLLOW_58_in_ruleExpressionAndOp6190); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2976:1: entryRuleExpressionEquality returns [EObject current=null] : iv_ruleExpressionEquality= ruleExpressionEquality EOF ;
    public final EObject entryRuleExpressionEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionEquality = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2977:2: (iv_ruleExpressionEquality= ruleExpressionEquality EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2978:2: iv_ruleExpressionEquality= ruleExpressionEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionEquality_in_entryRuleExpressionEquality6229);
            iv_ruleExpressionEquality=ruleExpressionEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionEquality; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionEquality6239); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2985:1: ruleExpressionEquality returns [EObject current=null] : (this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )* ) ;
    public final EObject ruleExpressionEquality() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionCompare_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2988:28: ( (this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2989:1: (this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2989:1: (this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2990:5: this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionEqualityAccess().getExpressionCompareParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionCompare_in_ruleExpressionEquality6286);
            this_ExpressionCompare_0=ruleExpressionCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionCompare_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2998:1: ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==59) ) {
                    int LA42_2 = input.LA(2);

                    if ( (synpred7_InternalLil()) ) {
                        alt42=1;
                    }


                }
                else if ( (LA42_0==60) ) {
                    int LA42_3 = input.LA(2);

                    if ( (synpred7_InternalLil()) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2998:2: ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2998:2: ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2998:3: ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3003:6: ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3003:7: () ( (lv_feature_2_0= ruleExpressionEqualityOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3003:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3004:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3009:2: ( (lv_feature_2_0= ruleExpressionEqualityOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3010:1: (lv_feature_2_0= ruleExpressionEqualityOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3010:1: (lv_feature_2_0= ruleExpressionEqualityOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3011:3: lv_feature_2_0= ruleExpressionEqualityOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionEqualityAccess().getFeatureExpressionEqualityOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionEqualityOp_in_ruleExpressionEquality6335);
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

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3027:4: ( (lv_rightOperand_3_0= ruleExpressionCompare ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3028:1: (lv_rightOperand_3_0= ruleExpressionCompare )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3028:1: (lv_rightOperand_3_0= ruleExpressionCompare )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3029:3: lv_rightOperand_3_0= ruleExpressionCompare
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionEqualityAccess().getRightOperandExpressionCompareParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionCompare_in_ruleExpressionEquality6358);
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
    // $ANTLR end "ruleExpressionEquality"


    // $ANTLR start "entryRuleExpressionEqualityOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3053:1: entryRuleExpressionEqualityOp returns [String current=null] : iv_ruleExpressionEqualityOp= ruleExpressionEqualityOp EOF ;
    public final String entryRuleExpressionEqualityOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionEqualityOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3054:2: (iv_ruleExpressionEqualityOp= ruleExpressionEqualityOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3055:2: iv_ruleExpressionEqualityOp= ruleExpressionEqualityOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionEqualityOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionEqualityOp_in_entryRuleExpressionEqualityOp6397);
            iv_ruleExpressionEqualityOp=ruleExpressionEqualityOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionEqualityOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionEqualityOp6408); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3062:1: ruleExpressionEqualityOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionEqualityOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3065:28: ( (kw= '==' | kw= '!=' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3066:1: (kw= '==' | kw= '!=' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3066:1: (kw= '==' | kw= '!=' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==59) ) {
                alt43=1;
            }
            else if ( (LA43_0==60) ) {
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3067:2: kw= '=='
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleExpressionEqualityOp6446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionEqualityOpAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3074:2: kw= '!='
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleExpressionEqualityOp6465); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3087:1: entryRuleExpressionCompare returns [EObject current=null] : iv_ruleExpressionCompare= ruleExpressionCompare EOF ;
    public final EObject entryRuleExpressionCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionCompare = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3088:2: (iv_ruleExpressionCompare= ruleExpressionCompare EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3089:2: iv_ruleExpressionCompare= ruleExpressionCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionCompareRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionCompare_in_entryRuleExpressionCompare6505);
            iv_ruleExpressionCompare=ruleExpressionCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionCompare; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionCompare6515); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3096:1: ruleExpressionCompare returns [EObject current=null] : (this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )* ) ;
    public final EObject ruleExpressionCompare() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionOther_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3099:28: ( (this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3100:1: (this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3100:1: (this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3101:5: this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionCompareAccess().getExpressionOtherParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionOther_in_ruleExpressionCompare6562);
            this_ExpressionOther_0=ruleExpressionOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionOther_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3109:1: ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )*
            loop44:
            do {
                int alt44=2;
                switch ( input.LA(1) ) {
                case 61:
                    {
                    int LA44_2 = input.LA(2);

                    if ( (synpred8_InternalLil()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 62:
                    {
                    int LA44_3 = input.LA(2);

                    if ( (synpred8_InternalLil()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 63:
                    {
                    int LA44_4 = input.LA(2);

                    if ( (synpred8_InternalLil()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 64:
                    {
                    int LA44_5 = input.LA(2);

                    if ( (synpred8_InternalLil()) ) {
                        alt44=1;
                    }


                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3109:2: ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3109:2: ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3109:3: ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3114:6: ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3114:7: () ( (lv_feature_2_0= ruleExpressionCompareOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3114:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3115:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3120:2: ( (lv_feature_2_0= ruleExpressionCompareOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3121:1: (lv_feature_2_0= ruleExpressionCompareOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3121:1: (lv_feature_2_0= ruleExpressionCompareOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3122:3: lv_feature_2_0= ruleExpressionCompareOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionCompareAccess().getFeatureExpressionCompareOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionCompareOp_in_ruleExpressionCompare6611);
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

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3138:4: ( (lv_rightOperand_3_0= ruleExpressionOther ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3139:1: (lv_rightOperand_3_0= ruleExpressionOther )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3139:1: (lv_rightOperand_3_0= ruleExpressionOther )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3140:3: lv_rightOperand_3_0= ruleExpressionOther
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionCompareAccess().getRightOperandExpressionOtherParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionOther_in_ruleExpressionCompare6634);
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
    // $ANTLR end "ruleExpressionCompare"


    // $ANTLR start "entryRuleExpressionCompareOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3164:1: entryRuleExpressionCompareOp returns [String current=null] : iv_ruleExpressionCompareOp= ruleExpressionCompareOp EOF ;
    public final String entryRuleExpressionCompareOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionCompareOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3165:2: (iv_ruleExpressionCompareOp= ruleExpressionCompareOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3166:2: iv_ruleExpressionCompareOp= ruleExpressionCompareOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionCompareOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionCompareOp_in_entryRuleExpressionCompareOp6673);
            iv_ruleExpressionCompareOp=ruleExpressionCompareOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionCompareOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionCompareOp6684); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3173:1: ruleExpressionCompareOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionCompareOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3176:28: ( (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3177:1: (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3177:1: (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt45=1;
                }
                break;
            case 62:
                {
                alt45=2;
                }
                break;
            case 63:
                {
                alt45=3;
                }
                break;
            case 64:
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3178:2: kw= '<='
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleExpressionCompareOp6722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionCompareOpAccess().getLessThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3185:2: kw= '>='
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleExpressionCompareOp6741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionCompareOpAccess().getGreaterThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3192:2: kw= '<'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleExpressionCompareOp6760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionCompareOpAccess().getLessThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3199:2: kw= '>'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleExpressionCompareOp6779); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3212:1: entryRuleExpressionOther returns [EObject current=null] : iv_ruleExpressionOther= ruleExpressionOther EOF ;
    public final EObject entryRuleExpressionOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionOther = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3213:2: (iv_ruleExpressionOther= ruleExpressionOther EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3214:2: iv_ruleExpressionOther= ruleExpressionOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOtherRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionOther_in_entryRuleExpressionOther6819);
            iv_ruleExpressionOther=ruleExpressionOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOther; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOther6829); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3221:1: ruleExpressionOther returns [EObject current=null] : (this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )* ) ;
    public final EObject ruleExpressionOther() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionAddition_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3224:28: ( (this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3225:1: (this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3225:1: (this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3226:5: this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionOtherAccess().getExpressionAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionAddition_in_ruleExpressionOther6876);
            this_ExpressionAddition_0=ruleExpressionAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionAddition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3234:1: ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==65) ) {
                    int LA46_2 = input.LA(2);

                    if ( (synpred9_InternalLil()) ) {
                        alt46=1;
                    }


                }
                else if ( (LA46_0==66) ) {
                    int LA46_3 = input.LA(2);

                    if ( (synpred9_InternalLil()) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3234:2: ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3234:2: ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3234:3: ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3239:6: ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3239:7: () ( (lv_feature_2_0= ruleExpressionOtherOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3239:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3240:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3245:2: ( (lv_feature_2_0= ruleExpressionOtherOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3246:1: (lv_feature_2_0= ruleExpressionOtherOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3246:1: (lv_feature_2_0= ruleExpressionOtherOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3247:3: lv_feature_2_0= ruleExpressionOtherOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOtherAccess().getFeatureExpressionOtherOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionOtherOp_in_ruleExpressionOther6925);
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

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3263:4: ( (lv_rightOperand_3_0= ruleExpressionAddition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3264:1: (lv_rightOperand_3_0= ruleExpressionAddition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3264:1: (lv_rightOperand_3_0= ruleExpressionAddition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3265:3: lv_rightOperand_3_0= ruleExpressionAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOtherAccess().getRightOperandExpressionAdditionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionAddition_in_ruleExpressionOther6948);
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
            	    break loop46;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3289:1: entryRuleExpressionOtherOp returns [String current=null] : iv_ruleExpressionOtherOp= ruleExpressionOtherOp EOF ;
    public final String entryRuleExpressionOtherOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionOtherOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3290:2: (iv_ruleExpressionOtherOp= ruleExpressionOtherOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3291:2: iv_ruleExpressionOtherOp= ruleExpressionOtherOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOtherOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionOtherOp_in_entryRuleExpressionOtherOp6987);
            iv_ruleExpressionOtherOp=ruleExpressionOtherOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOtherOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOtherOp6998); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3298:1: ruleExpressionOtherOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<>' | kw= '?:' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionOtherOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3301:28: ( (kw= '<>' | kw= '?:' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3302:1: (kw= '<>' | kw= '?:' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3302:1: (kw= '<>' | kw= '?:' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==65) ) {
                alt47=1;
            }
            else if ( (LA47_0==66) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3303:2: kw= '<>'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleExpressionOtherOp7036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionOtherOpAccess().getLessThanSignGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3310:2: kw= '?:'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleExpressionOtherOp7055); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3323:1: entryRuleExpressionAddition returns [EObject current=null] : iv_ruleExpressionAddition= ruleExpressionAddition EOF ;
    public final EObject entryRuleExpressionAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionAddition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3324:2: (iv_ruleExpressionAddition= ruleExpressionAddition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3325:2: iv_ruleExpressionAddition= ruleExpressionAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionAddition_in_entryRuleExpressionAddition7095);
            iv_ruleExpressionAddition=ruleExpressionAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionAddition7105); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3332:1: ruleExpressionAddition returns [EObject current=null] : (this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )* ) ;
    public final EObject ruleExpressionAddition() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionMultiplication_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3335:28: ( (this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3336:1: (this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3336:1: (this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3337:5: this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAdditionAccess().getExpressionMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionMultiplication_in_ruleExpressionAddition7152);
            this_ExpressionMultiplication_0=ruleExpressionMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionMultiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3345:1: ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==67) ) {
                    int LA48_2 = input.LA(2);

                    if ( (synpred10_InternalLil()) ) {
                        alt48=1;
                    }


                }
                else if ( (LA48_0==68) ) {
                    int LA48_3 = input.LA(2);

                    if ( (synpred10_InternalLil()) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3345:2: ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3345:2: ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3345:3: ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3350:6: ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3350:7: () ( (lv_feature_2_0= ruleExpressionAdditionOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3350:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3351:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3356:2: ( (lv_feature_2_0= ruleExpressionAdditionOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3357:1: (lv_feature_2_0= ruleExpressionAdditionOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3357:1: (lv_feature_2_0= ruleExpressionAdditionOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3358:3: lv_feature_2_0= ruleExpressionAdditionOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAdditionAccess().getFeatureExpressionAdditionOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionAdditionOp_in_ruleExpressionAddition7201);
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

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3374:4: ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3375:1: (lv_rightOperand_3_0= ruleExpressionMultiplication )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3375:1: (lv_rightOperand_3_0= ruleExpressionMultiplication )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3376:3: lv_rightOperand_3_0= ruleExpressionMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAdditionAccess().getRightOperandExpressionMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionMultiplication_in_ruleExpressionAddition7224);
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
            	    break loop48;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3400:1: entryRuleExpressionAdditionOp returns [String current=null] : iv_ruleExpressionAdditionOp= ruleExpressionAdditionOp EOF ;
    public final String entryRuleExpressionAdditionOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionAdditionOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3401:2: (iv_ruleExpressionAdditionOp= ruleExpressionAdditionOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3402:2: iv_ruleExpressionAdditionOp= ruleExpressionAdditionOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAdditionOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionAdditionOp_in_entryRuleExpressionAdditionOp7263);
            iv_ruleExpressionAdditionOp=ruleExpressionAdditionOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAdditionOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionAdditionOp7274); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3409:1: ruleExpressionAdditionOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionAdditionOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3412:28: ( (kw= '+' | kw= '-' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3413:1: (kw= '+' | kw= '-' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3413:1: (kw= '+' | kw= '-' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==67) ) {
                alt49=1;
            }
            else if ( (LA49_0==68) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3414:2: kw= '+'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleExpressionAdditionOp7312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionAdditionOpAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3421:2: kw= '-'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleExpressionAdditionOp7331); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3434:1: entryRuleExpressionMultiplication returns [EObject current=null] : iv_ruleExpressionMultiplication= ruleExpressionMultiplication EOF ;
    public final EObject entryRuleExpressionMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMultiplication = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3435:2: (iv_ruleExpressionMultiplication= ruleExpressionMultiplication EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3436:2: iv_ruleExpressionMultiplication= ruleExpressionMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionMultiplication_in_entryRuleExpressionMultiplication7371);
            iv_ruleExpressionMultiplication=ruleExpressionMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionMultiplication7381); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3443:1: ruleExpressionMultiplication returns [EObject current=null] : (this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )* ) ;
    public final EObject ruleExpressionMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionUnary_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3446:28: ( (this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3447:1: (this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3447:1: (this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3448:5: this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionMultiplicationAccess().getExpressionUnaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionUnary_in_ruleExpressionMultiplication7428);
            this_ExpressionUnary_0=ruleExpressionUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionUnary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3456:1: ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )*
            loop50:
            do {
                int alt50=2;
                switch ( input.LA(1) ) {
                case 69:
                    {
                    int LA50_2 = input.LA(2);

                    if ( (synpred11_InternalLil()) ) {
                        alt50=1;
                    }


                    }
                    break;
                case 70:
                    {
                    int LA50_3 = input.LA(2);

                    if ( (synpred11_InternalLil()) ) {
                        alt50=1;
                    }


                    }
                    break;
                case 71:
                    {
                    int LA50_4 = input.LA(2);

                    if ( (synpred11_InternalLil()) ) {
                        alt50=1;
                    }


                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3456:2: ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3456:2: ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3456:3: ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3461:6: ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3461:7: () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3461:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3462:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3467:2: ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3468:1: (lv_feature_2_0= ruleExpressionMultiplicationOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3468:1: (lv_feature_2_0= ruleExpressionMultiplicationOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3469:3: lv_feature_2_0= ruleExpressionMultiplicationOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionMultiplicationAccess().getFeatureExpressionMultiplicationOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionMultiplicationOp_in_ruleExpressionMultiplication7477);
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

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3485:4: ( (lv_rightOperand_3_0= ruleExpressionUnary ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3486:1: (lv_rightOperand_3_0= ruleExpressionUnary )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3486:1: (lv_rightOperand_3_0= ruleExpressionUnary )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3487:3: lv_rightOperand_3_0= ruleExpressionUnary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionMultiplicationAccess().getRightOperandExpressionUnaryParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionUnary_in_ruleExpressionMultiplication7500);
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
            	    break loop50;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3511:1: entryRuleExpressionMultiplicationOp returns [String current=null] : iv_ruleExpressionMultiplicationOp= ruleExpressionMultiplicationOp EOF ;
    public final String entryRuleExpressionMultiplicationOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionMultiplicationOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3512:2: (iv_ruleExpressionMultiplicationOp= ruleExpressionMultiplicationOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3513:2: iv_ruleExpressionMultiplicationOp= ruleExpressionMultiplicationOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionMultiplicationOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionMultiplicationOp_in_entryRuleExpressionMultiplicationOp7539);
            iv_ruleExpressionMultiplicationOp=ruleExpressionMultiplicationOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionMultiplicationOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionMultiplicationOp7550); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3520:1: ruleExpressionMultiplicationOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionMultiplicationOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3523:28: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3524:1: (kw= '*' | kw= '/' | kw= '%' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3524:1: (kw= '*' | kw= '/' | kw= '%' )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt51=1;
                }
                break;
            case 70:
                {
                alt51=2;
                }
                break;
            case 71:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3525:2: kw= '*'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleExpressionMultiplicationOp7588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionMultiplicationOpAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3532:2: kw= '/'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleExpressionMultiplicationOp7607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionMultiplicationOpAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3539:2: kw= '%'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleExpressionMultiplicationOp7626); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3552:1: entryRuleExpressionUnary returns [EObject current=null] : iv_ruleExpressionUnary= ruleExpressionUnary EOF ;
    public final EObject entryRuleExpressionUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionUnary = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3553:2: (iv_ruleExpressionUnary= ruleExpressionUnary EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3554:2: iv_ruleExpressionUnary= ruleExpressionUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionUnary_in_entryRuleExpressionUnary7666);
            iv_ruleExpressionUnary=ruleExpressionUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionUnary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionUnary7676); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3561:1: ruleExpressionUnary returns [EObject current=null] : ( ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) ) | this_ExpressionPrimary_3= ruleExpressionPrimary ) ;
    public final EObject ruleExpressionUnary() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_feature_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_ExpressionPrimary_3 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3564:28: ( ( ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) ) | this_ExpressionPrimary_3= ruleExpressionPrimary ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3565:1: ( ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) ) | this_ExpressionPrimary_3= ruleExpressionPrimary )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3565:1: ( ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) ) | this_ExpressionPrimary_3= ruleExpressionPrimary )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=67 && LA52_0<=68)||LA52_0==72) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_INT)||LA52_0==29||(LA52_0>=32 && LA52_0<=33)||LA52_0==50||LA52_0==52||LA52_0==73||LA52_0==76||LA52_0==79||(LA52_0>=81 && LA52_0<=115)) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3565:2: ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3565:2: ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3565:3: () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3565:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3566:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionUnaryAccess().getUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3571:2: ( (lv_feature_1_0= ruleExpressionUnaryOp ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3572:1: (lv_feature_1_0= ruleExpressionUnaryOp )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3572:1: (lv_feature_1_0= ruleExpressionUnaryOp )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3573:3: lv_feature_1_0= ruleExpressionUnaryOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionUnaryAccess().getFeatureExpressionUnaryOpParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionUnaryOp_in_ruleExpressionUnary7732);
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

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3589:2: ( (lv_operand_2_0= ruleExpressionPrimary ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3590:1: (lv_operand_2_0= ruleExpressionPrimary )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3590:1: (lv_operand_2_0= ruleExpressionPrimary )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3591:3: lv_operand_2_0= ruleExpressionPrimary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionUnaryAccess().getOperandExpressionPrimaryParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionPrimary_in_ruleExpressionUnary7753);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3609:5: this_ExpressionPrimary_3= ruleExpressionPrimary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionUnaryAccess().getExpressionPrimaryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionPrimary_in_ruleExpressionUnary7782);
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3625:1: entryRuleExpressionUnaryOp returns [String current=null] : iv_ruleExpressionUnaryOp= ruleExpressionUnaryOp EOF ;
    public final String entryRuleExpressionUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionUnaryOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3626:2: (iv_ruleExpressionUnaryOp= ruleExpressionUnaryOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3627:2: iv_ruleExpressionUnaryOp= ruleExpressionUnaryOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionUnaryOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionUnaryOp_in_entryRuleExpressionUnaryOp7818);
            iv_ruleExpressionUnaryOp=ruleExpressionUnaryOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionUnaryOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionUnaryOp7829); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3634:1: ruleExpressionUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3637:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3638:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3638:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt53=1;
                }
                break;
            case 68:
                {
                alt53=2;
                }
                break;
            case 67:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3639:2: kw= '!'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleExpressionUnaryOp7867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionUnaryOpAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3646:2: kw= '-'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleExpressionUnaryOp7886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionUnaryOpAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3653:2: kw= '+'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleExpressionUnaryOp7905); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3666:1: entryRuleExpressionPrimary returns [EObject current=null] : iv_ruleExpressionPrimary= ruleExpressionPrimary EOF ;
    public final EObject entryRuleExpressionPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionPrimary = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3667:2: (iv_ruleExpressionPrimary= ruleExpressionPrimary EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3668:2: iv_ruleExpressionPrimary= ruleExpressionPrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionPrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionPrimary_in_entryRuleExpressionPrimary7945);
            iv_ruleExpressionPrimary=ruleExpressionPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionPrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionPrimary7955); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3675:1: ruleExpressionPrimary returns [EObject current=null] : (this_ExpressionSwitch_0= ruleExpressionSwitch | this_ExpressionIf_1= ruleExpressionIf | this_ExpressionLiteral_2= ruleExpressionLiteral | this_ExpressionForEach_3= ruleExpressionForEach | this_ExpressionFunctionCall_4= ruleExpressionFunctionCall | this_ExpressionParenthesized_5= ruleExpressionParenthesized ) ;
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
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3678:28: ( (this_ExpressionSwitch_0= ruleExpressionSwitch | this_ExpressionIf_1= ruleExpressionIf | this_ExpressionLiteral_2= ruleExpressionLiteral | this_ExpressionForEach_3= ruleExpressionForEach | this_ExpressionFunctionCall_4= ruleExpressionFunctionCall | this_ExpressionParenthesized_5= ruleExpressionParenthesized ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3679:1: (this_ExpressionSwitch_0= ruleExpressionSwitch | this_ExpressionIf_1= ruleExpressionIf | this_ExpressionLiteral_2= ruleExpressionLiteral | this_ExpressionForEach_3= ruleExpressionForEach | this_ExpressionFunctionCall_4= ruleExpressionFunctionCall | this_ExpressionParenthesized_5= ruleExpressionParenthesized )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3679:1: (this_ExpressionSwitch_0= ruleExpressionSwitch | this_ExpressionIf_1= ruleExpressionIf | this_ExpressionLiteral_2= ruleExpressionLiteral | this_ExpressionForEach_3= ruleExpressionForEach | this_ExpressionFunctionCall_4= ruleExpressionFunctionCall | this_ExpressionParenthesized_5= ruleExpressionParenthesized )
            int alt54=6;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt54=1;
                }
                break;
            case 52:
                {
                alt54=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 29:
            case 32:
            case 33:
            case 50:
            case 112:
            case 113:
            case 114:
            case 115:
                {
                alt54=3;
                }
                break;
            case 79:
                {
                alt54=4;
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
                alt54=5;
                }
                break;
            case 73:
                {
                alt54=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3680:5: this_ExpressionSwitch_0= ruleExpressionSwitch
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionSwitchParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionSwitch_in_ruleExpressionPrimary8002);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3690:5: this_ExpressionIf_1= ruleExpressionIf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionIfParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionIf_in_ruleExpressionPrimary8029);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3700:5: this_ExpressionLiteral_2= ruleExpressionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionLiteral_in_ruleExpressionPrimary8056);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3710:5: this_ExpressionForEach_3= ruleExpressionForEach
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionForEachParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionForEach_in_ruleExpressionPrimary8083);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3720:5: this_ExpressionFunctionCall_4= ruleExpressionFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionFunctionCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionFunctionCall_in_ruleExpressionPrimary8110);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3730:5: this_ExpressionParenthesized_5= ruleExpressionParenthesized
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionParenthesizedParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionParenthesized_in_ruleExpressionPrimary8137);
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3746:1: entryRuleExpressionLiteral returns [EObject current=null] : iv_ruleExpressionLiteral= ruleExpressionLiteral EOF ;
    public final EObject entryRuleExpressionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3747:2: (iv_ruleExpressionLiteral= ruleExpressionLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3748:2: iv_ruleExpressionLiteral= ruleExpressionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionLiteral_in_entryRuleExpressionLiteral8172);
            iv_ruleExpressionLiteral=ruleExpressionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionLiteral8182); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3755:1: ruleExpressionLiteral returns [EObject current=null] : (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralText_4= ruleLiteralText | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | this_InteractorDataReception_7= ruleInteractorDataReception ) ;
    public final EObject ruleExpressionLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLiteralCollection_0 = null;

        EObject this_LiteralBoolean_1 = null;

        EObject this_LiteralNumber_2 = null;

        EObject this_LiteralNull_3 = null;

        EObject this_LiteralText_4 = null;

        EObject this_LiteralTime_5 = null;

        EObject this_LiteralEnum_6 = null;

        EObject this_InteractorDataReception_7 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3758:28: ( (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralText_4= ruleLiteralText | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | this_InteractorDataReception_7= ruleInteractorDataReception ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3759:1: (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralText_4= ruleLiteralText | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | this_InteractorDataReception_7= ruleInteractorDataReception )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3759:1: (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralText_4= ruleLiteralText | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | this_InteractorDataReception_7= ruleInteractorDataReception )
            int alt55=8;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3760:5: this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getExpressionLiteralCollectionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionLiteralCollection_in_ruleExpressionLiteral8229);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3770:5: this_LiteralBoolean_1= ruleLiteralBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralBooleanParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralBoolean_in_ruleExpressionLiteral8256);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3780:5: this_LiteralNumber_2= ruleLiteralNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralNumberParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleExpressionLiteral8283);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3790:5: this_LiteralNull_3= ruleLiteralNull
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralNullParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralNull_in_ruleExpressionLiteral8310);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3800:5: this_LiteralText_4= ruleLiteralText
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralTextParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralText_in_ruleExpressionLiteral8337);
                    this_LiteralText_4=ruleLiteralText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralText_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3810:5: this_LiteralTime_5= ruleLiteralTime
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralTimeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralTime_in_ruleExpressionLiteral8364);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3820:5: this_LiteralEnum_6= ruleLiteralEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralEnumParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralEnum_in_ruleExpressionLiteral8391);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3830:5: this_InteractorDataReception_7= ruleInteractorDataReception
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getInteractorDataReceptionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteractorDataReception_in_ruleExpressionLiteral8418);
                    this_InteractorDataReception_7=ruleInteractorDataReception();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InteractorDataReception_7; 
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
    // $ANTLR end "ruleExpressionLiteral"


    // $ANTLR start "entryRuleExpressionLiteralCollection"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3846:1: entryRuleExpressionLiteralCollection returns [EObject current=null] : iv_ruleExpressionLiteralCollection= ruleExpressionLiteralCollection EOF ;
    public final EObject entryRuleExpressionLiteralCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLiteralCollection = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3847:2: (iv_ruleExpressionLiteralCollection= ruleExpressionLiteralCollection EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3848:2: iv_ruleExpressionLiteralCollection= ruleExpressionLiteralCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLiteralCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionLiteralCollection_in_entryRuleExpressionLiteralCollection8453);
            iv_ruleExpressionLiteralCollection=ruleExpressionLiteralCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLiteralCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionLiteralCollection8463); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3855:1: ruleExpressionLiteralCollection returns [EObject current=null] : (this_ExpressionLiteralSet_0= ruleExpressionLiteralSet | this_ExpressionLiteralList_1= ruleExpressionLiteralList ) ;
    public final EObject ruleExpressionLiteralCollection() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLiteralSet_0 = null;

        EObject this_ExpressionLiteralList_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3858:28: ( (this_ExpressionLiteralSet_0= ruleExpressionLiteralSet | this_ExpressionLiteralList_1= ruleExpressionLiteralList ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3859:1: (this_ExpressionLiteralSet_0= ruleExpressionLiteralSet | this_ExpressionLiteralList_1= ruleExpressionLiteralList )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3859:1: (this_ExpressionLiteralSet_0= ruleExpressionLiteralSet | this_ExpressionLiteralList_1= ruleExpressionLiteralList )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==29) ) {
                alt56=1;
            }
            else if ( (LA56_0==33) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3860:5: this_ExpressionLiteralSet_0= ruleExpressionLiteralSet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralCollectionAccess().getExpressionLiteralSetParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionLiteralSet_in_ruleExpressionLiteralCollection8510);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3870:5: this_ExpressionLiteralList_1= ruleExpressionLiteralList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralCollectionAccess().getExpressionLiteralListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionLiteralList_in_ruleExpressionLiteralCollection8537);
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3886:1: entryRuleExpressionLiteralSet returns [EObject current=null] : iv_ruleExpressionLiteralSet= ruleExpressionLiteralSet EOF ;
    public final EObject entryRuleExpressionLiteralSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLiteralSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3887:2: (iv_ruleExpressionLiteralSet= ruleExpressionLiteralSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3888:2: iv_ruleExpressionLiteralSet= ruleExpressionLiteralSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLiteralSetRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionLiteralSet_in_entryRuleExpressionLiteralSet8572);
            iv_ruleExpressionLiteralSet=ruleExpressionLiteralSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLiteralSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionLiteralSet8582); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3895:1: ruleExpressionLiteralSet returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleExpressionLiteralSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3898:28: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3899:1: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3899:1: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3899:2: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3899:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3900:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionLiteralSetAccess().getExpressionLiteralSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleExpressionLiteralSet8628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionLiteralSetAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3909:1: ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_INT)||LA58_0==29||(LA58_0>=32 && LA58_0<=33)||LA58_0==50||LA58_0==52||(LA58_0>=67 && LA58_0<=68)||(LA58_0>=72 && LA58_0<=73)||LA58_0==76||LA58_0==79||(LA58_0>=81 && LA58_0<=115)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3909:2: ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3909:2: ( (lv_elements_2_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3910:1: (lv_elements_2_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3910:1: (lv_elements_2_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3911:3: lv_elements_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionLiteralSetAccess().getElementsExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionLiteralSet8650);
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

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3927:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==30) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3927:4: otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleExpressionLiteralSet8663); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getExpressionLiteralSetAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3931:1: ( (lv_elements_4_0= ruleExpression ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3932:1: (lv_elements_4_0= ruleExpression )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3932:1: (lv_elements_4_0= ruleExpression )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3933:3: lv_elements_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionLiteralSetAccess().getElementsExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionLiteralSet8684);
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleExpressionLiteralSet8700); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3961:1: entryRuleExpressionLiteralList returns [EObject current=null] : iv_ruleExpressionLiteralList= ruleExpressionLiteralList EOF ;
    public final EObject entryRuleExpressionLiteralList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLiteralList = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3962:2: (iv_ruleExpressionLiteralList= ruleExpressionLiteralList EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3963:2: iv_ruleExpressionLiteralList= ruleExpressionLiteralList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLiteralListRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionLiteralList_in_entryRuleExpressionLiteralList8736);
            iv_ruleExpressionLiteralList=ruleExpressionLiteralList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLiteralList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionLiteralList8746); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3970:1: ruleExpressionLiteralList returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleExpressionLiteralList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3973:28: ( ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3974:1: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3974:1: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3974:2: () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3974:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3975:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionLiteralListAccess().getExpressionLiteralListAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleExpressionLiteralList8792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionLiteralListAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3984:1: ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_INT)||LA60_0==29||(LA60_0>=32 && LA60_0<=33)||LA60_0==50||LA60_0==52||(LA60_0>=67 && LA60_0<=68)||(LA60_0>=72 && LA60_0<=73)||LA60_0==76||LA60_0==79||(LA60_0>=81 && LA60_0<=115)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3984:2: ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3984:2: ( (lv_elements_2_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3985:1: (lv_elements_2_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3985:1: (lv_elements_2_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3986:3: lv_elements_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionLiteralListAccess().getElementsExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionLiteralList8814);
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

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4002:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==30) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4002:4: otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleExpressionLiteralList8827); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getExpressionLiteralListAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4006:1: ( (lv_elements_4_0= ruleExpression ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4007:1: (lv_elements_4_0= ruleExpression )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4007:1: (lv_elements_4_0= ruleExpression )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4008:3: lv_elements_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionLiteralListAccess().getElementsExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionLiteralList8848);
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
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleExpressionLiteralList8864); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4036:1: entryRuleExpressionParenthesized returns [EObject current=null] : iv_ruleExpressionParenthesized= ruleExpressionParenthesized EOF ;
    public final EObject entryRuleExpressionParenthesized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionParenthesized = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4037:2: (iv_ruleExpressionParenthesized= ruleExpressionParenthesized EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4038:2: iv_ruleExpressionParenthesized= ruleExpressionParenthesized EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionParenthesizedRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionParenthesized_in_entryRuleExpressionParenthesized8900);
            iv_ruleExpressionParenthesized=ruleExpressionParenthesized();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionParenthesized; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionParenthesized8910); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4045:1: ruleExpressionParenthesized returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleExpressionParenthesized() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4048:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4049:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4049:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4049:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleExpressionParenthesized8947); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpressionParenthesizedAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionParenthesizedAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionParenthesized8969);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleExpressionParenthesized8980); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4074:1: entryRuleExpressionIf returns [EObject current=null] : iv_ruleExpressionIf= ruleExpressionIf EOF ;
    public final EObject entryRuleExpressionIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionIf = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4075:2: (iv_ruleExpressionIf= ruleExpressionIf EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4076:2: iv_ruleExpressionIf= ruleExpressionIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionIfRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionIf_in_entryRuleExpressionIf9016);
            iv_ruleExpressionIf=ruleExpressionIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionIf9026); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4083:1: ruleExpressionIf returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) ) ;
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
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4086:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4087:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4087:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4087:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4087:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4088:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionIfAccess().getExpressionIfAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleExpressionIf9072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionIfAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleExpressionIf9084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionIfAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4101:1: ( (lv_if_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4102:1: (lv_if_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4102:1: (lv_if_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4103:3: lv_if_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionIfAccess().getIfExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionIf9105);
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4119:2: ( ( ')' )=>otherlv_4= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4119:3: ( ')' )=>otherlv_4= ')'
            {
            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleExpressionIf9125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExpressionIfAccess().getRightParenthesisKeyword_4());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4124:2: ( (lv_then_5_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4125:1: (lv_then_5_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4125:1: (lv_then_5_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4126:3: lv_then_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionIfAccess().getThenExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionIf9147);
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4142:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4142:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4142:3: ( ( 'else' )=>otherlv_6= 'else' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4142:4: ( 'else' )=>otherlv_6= 'else'
            {
            otherlv_6=(Token)match(input,75,FOLLOW_75_in_ruleExpressionIf9168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getExpressionIfAccess().getElseKeyword_6_0());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4147:2: ( (lv_else_7_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4148:1: (lv_else_7_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4148:1: (lv_else_7_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4149:3: lv_else_7_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionIfAccess().getElseExpressionParserRuleCall_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionIf9190);
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4173:1: entryRuleExpressionSwitch returns [EObject current=null] : iv_ruleExpressionSwitch= ruleExpressionSwitch EOF ;
    public final EObject entryRuleExpressionSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionSwitch = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4174:2: (iv_ruleExpressionSwitch= ruleExpressionSwitch EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4175:2: iv_ruleExpressionSwitch= ruleExpressionSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionSwitchRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionSwitch_in_entryRuleExpressionSwitch9227);
            iv_ruleExpressionSwitch=ruleExpressionSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionSwitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionSwitch9237); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4182:1: ruleExpressionSwitch returns [EObject current=null] : ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? ) ;
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
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4185:28: ( ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4186:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4186:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4186:2: () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4186:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4187:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionSwitchAccess().getExpressionSwitchAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleExpressionSwitch9283); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionSwitchAccess().getSwitchKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleExpressionSwitch9295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionSwitchAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4200:1: ( (lv_switch_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4201:1: (lv_switch_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4201:1: (lv_switch_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4202:3: lv_switch_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionSwitchAccess().getSwitchExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSwitch9316);
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4218:2: ( ( ')' )=>otherlv_4= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4218:3: ( ')' )=>otherlv_4= ')'
            {
            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleExpressionSwitch9336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExpressionSwitchAccess().getRightParenthesisKeyword_4());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4223:2: ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==78) ) {
                    int LA61_2 = input.LA(2);

                    if ( (synpred15_InternalLil()) ) {
                        alt61=1;
                    }


                }


                switch (alt61) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4223:3: ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4228:1: (lv_case_5_0= ruleExpressionCase )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4229:3: lv_case_5_0= ruleExpressionCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionSwitchAccess().getCaseExpressionCaseParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionCase_in_ruleExpressionSwitch9368);
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
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4245:3: ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==77) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred16_InternalLil()) ) {
                    alt62=1;
                }
            }
            switch (alt62) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4245:4: ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4245:4: ( ( 'default' )=>otherlv_6= 'default' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4245:5: ( 'default' )=>otherlv_6= 'default'
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleExpressionSwitch9390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExpressionSwitchAccess().getDefaultKeyword_6_0());
                          
                    }

                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleExpressionSwitch9403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExpressionSwitchAccess().getColonKeyword_6_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4254:1: ( (lv_default_8_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4255:1: (lv_default_8_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4255:1: (lv_default_8_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4256:3: lv_default_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionSwitchAccess().getDefaultExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSwitch9424);
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4280:1: entryRuleExpressionCase returns [EObject current=null] : iv_ruleExpressionCase= ruleExpressionCase EOF ;
    public final EObject entryRuleExpressionCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionCase = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4281:2: (iv_ruleExpressionCase= ruleExpressionCase EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4282:2: iv_ruleExpressionCase= ruleExpressionCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionCaseRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionCase_in_entryRuleExpressionCase9462);
            iv_ruleExpressionCase=ruleExpressionCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionCase9472); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4289:1: ruleExpressionCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) ) ;
    public final EObject ruleExpressionCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_case_1_0 = null;

        EObject lv_then_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4292:28: ( (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4293:1: (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4293:1: (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4293:3: otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleExpressionCase9509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpressionCaseAccess().getCaseKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4297:1: ( (lv_case_1_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4298:1: (lv_case_1_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4298:1: (lv_case_1_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4299:3: lv_case_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionCaseAccess().getCaseExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionCase9530);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleExpressionCase9542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionCaseAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4319:1: ( (lv_then_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4320:1: (lv_then_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4320:1: (lv_then_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4321:3: lv_then_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionCaseAccess().getThenExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionCase9563);
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4345:1: entryRuleExpressionForEach returns [EObject current=null] : iv_ruleExpressionForEach= ruleExpressionForEach EOF ;
    public final EObject entryRuleExpressionForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionForEach = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4346:2: (iv_ruleExpressionForEach= ruleExpressionForEach EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4347:2: iv_ruleExpressionForEach= ruleExpressionForEach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionForEachRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionForEach_in_entryRuleExpressionForEach9599);
            iv_ruleExpressionForEach=ruleExpressionForEach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionForEach; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionForEach9609); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4354:1: ruleExpressionForEach returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) ) ;
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
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4357:28: ( ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4358:1: ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4358:1: ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4358:2: () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4358:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4359:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionForEachAccess().getExpressionForEachAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleExpressionForEach9655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionForEachAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleExpressionForEach9667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionForEachAccess().getEachKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,73,FOLLOW_73_in_ruleExpressionForEach9679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExpressionForEachAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4376:1: ( (lv_forExpression_4_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4377:1: (lv_forExpression_4_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4377:1: (lv_forExpression_4_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4378:3: lv_forExpression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionForEachAccess().getForExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionForEach9700);
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

            otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleExpressionForEach9712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExpressionForEachAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4398:1: ( (lv_eachExpression_6_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4399:1: (lv_eachExpression_6_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4399:1: (lv_eachExpression_6_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4400:3: lv_eachExpression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionForEachAccess().getEachExpressionExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionForEach9733);
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4424:1: entryRuleExpressionFunctionCall returns [EObject current=null] : iv_ruleExpressionFunctionCall= ruleExpressionFunctionCall EOF ;
    public final EObject entryRuleExpressionFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionFunctionCall = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4425:2: (iv_ruleExpressionFunctionCall= ruleExpressionFunctionCall EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4426:2: iv_ruleExpressionFunctionCall= ruleExpressionFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionFunctionCall_in_entryRuleExpressionFunctionCall9769);
            iv_ruleExpressionFunctionCall=ruleExpressionFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionFunctionCall9779); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4433:1: ruleExpressionFunctionCall returns [EObject current=null] : ( () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' ) ;
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
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4436:28: ( ( () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4437:1: ( () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4437:1: ( () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4437:2: () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4437:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4438:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionFunctionCallAccess().getExpressionFunctionCallAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4443:2: ( (lv_function_1_0= ruleExpressionFunctionCallBase ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4444:1: (lv_function_1_0= ruleExpressionFunctionCallBase )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4444:1: (lv_function_1_0= ruleExpressionFunctionCallBase )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4445:3: lv_function_1_0= ruleExpressionFunctionCallBase
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionFunctionCallAccess().getFunctionExpressionFunctionCallBaseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionFunctionCallBase_in_ruleExpressionFunctionCall9834);
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

            otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleExpressionFunctionCall9846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionFunctionCallAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4465:1: ( (lv_arguments_3_0= ruleExpression ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_INT)||LA63_0==29||(LA63_0>=32 && LA63_0<=33)||LA63_0==50||LA63_0==52||(LA63_0>=67 && LA63_0<=68)||(LA63_0>=72 && LA63_0<=73)||LA63_0==76||LA63_0==79||(LA63_0>=81 && LA63_0<=115)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4466:1: (lv_arguments_3_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4466:1: (lv_arguments_3_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4467:3: lv_arguments_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionFunctionCallAccess().getArgumentsExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionFunctionCall9867);
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4483:3: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==30) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4483:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleExpressionFunctionCall9881); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getExpressionFunctionCallAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4487:1: ( (lv_arguments_5_0= ruleExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4488:1: (lv_arguments_5_0= ruleExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4488:1: (lv_arguments_5_0= ruleExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4489:3: lv_arguments_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionFunctionCallAccess().getArgumentsExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionFunctionCall9902);
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
            	    break loop64;
                }
            } while (true);

            otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleExpressionFunctionCall9916); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4517:1: entryRuleExpressionFunctionCallBase returns [String current=null] : iv_ruleExpressionFunctionCallBase= ruleExpressionFunctionCallBase EOF ;
    public final String entryRuleExpressionFunctionCallBase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionFunctionCallBase = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4518:2: (iv_ruleExpressionFunctionCallBase= ruleExpressionFunctionCallBase EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4519:2: iv_ruleExpressionFunctionCallBase= ruleExpressionFunctionCallBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionFunctionCallBaseRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionFunctionCallBase_in_entryRuleExpressionFunctionCallBase9953);
            iv_ruleExpressionFunctionCallBase=ruleExpressionFunctionCallBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionFunctionCallBase.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionFunctionCallBase9964); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4526:1: ruleExpressionFunctionCallBase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'math.abs' | kw= 'math.acos' | kw= 'math.acosh' | kw= 'math.asin' | kw= 'math.asinh' | kw= 'math.atan' | kw= 'math.atanh' | kw= 'math.atan2' | kw= 'math.ceil' | kw= 'math.clip' | kw= 'math.cos' | kw= 'math.cosh' | kw= 'math.exp' | kw= 'math.floor' | kw= 'math.fround' | kw= 'math.hypot' | kw= 'math.log' | kw= 'math.log10' | kw= 'math.log2' | kw= 'math.max' | kw= 'math.min' | kw= 'math.pow' | kw= 'math.random' | kw= 'math.round' | kw= 'math.sign' | kw= 'math.sin' | kw= 'math.sinh' | kw= 'math.sqrt' | kw= 'math.tan' | kw= 'math.tanh' | kw= 'math.trunc' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionFunctionCallBase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4529:28: ( (kw= 'math.abs' | kw= 'math.acos' | kw= 'math.acosh' | kw= 'math.asin' | kw= 'math.asinh' | kw= 'math.atan' | kw= 'math.atanh' | kw= 'math.atan2' | kw= 'math.ceil' | kw= 'math.clip' | kw= 'math.cos' | kw= 'math.cosh' | kw= 'math.exp' | kw= 'math.floor' | kw= 'math.fround' | kw= 'math.hypot' | kw= 'math.log' | kw= 'math.log10' | kw= 'math.log2' | kw= 'math.max' | kw= 'math.min' | kw= 'math.pow' | kw= 'math.random' | kw= 'math.round' | kw= 'math.sign' | kw= 'math.sin' | kw= 'math.sinh' | kw= 'math.sqrt' | kw= 'math.tan' | kw= 'math.tanh' | kw= 'math.trunc' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4530:1: (kw= 'math.abs' | kw= 'math.acos' | kw= 'math.acosh' | kw= 'math.asin' | kw= 'math.asinh' | kw= 'math.atan' | kw= 'math.atanh' | kw= 'math.atan2' | kw= 'math.ceil' | kw= 'math.clip' | kw= 'math.cos' | kw= 'math.cosh' | kw= 'math.exp' | kw= 'math.floor' | kw= 'math.fround' | kw= 'math.hypot' | kw= 'math.log' | kw= 'math.log10' | kw= 'math.log2' | kw= 'math.max' | kw= 'math.min' | kw= 'math.pow' | kw= 'math.random' | kw= 'math.round' | kw= 'math.sign' | kw= 'math.sin' | kw= 'math.sinh' | kw= 'math.sqrt' | kw= 'math.tan' | kw= 'math.tanh' | kw= 'math.trunc' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4530:1: (kw= 'math.abs' | kw= 'math.acos' | kw= 'math.acosh' | kw= 'math.asin' | kw= 'math.asinh' | kw= 'math.atan' | kw= 'math.atanh' | kw= 'math.atan2' | kw= 'math.ceil' | kw= 'math.clip' | kw= 'math.cos' | kw= 'math.cosh' | kw= 'math.exp' | kw= 'math.floor' | kw= 'math.fround' | kw= 'math.hypot' | kw= 'math.log' | kw= 'math.log10' | kw= 'math.log2' | kw= 'math.max' | kw= 'math.min' | kw= 'math.pow' | kw= 'math.random' | kw= 'math.round' | kw= 'math.sign' | kw= 'math.sin' | kw= 'math.sinh' | kw= 'math.sqrt' | kw= 'math.tan' | kw= 'math.tanh' | kw= 'math.trunc' )
            int alt65=31;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt65=1;
                }
                break;
            case 82:
                {
                alt65=2;
                }
                break;
            case 83:
                {
                alt65=3;
                }
                break;
            case 84:
                {
                alt65=4;
                }
                break;
            case 85:
                {
                alt65=5;
                }
                break;
            case 86:
                {
                alt65=6;
                }
                break;
            case 87:
                {
                alt65=7;
                }
                break;
            case 88:
                {
                alt65=8;
                }
                break;
            case 89:
                {
                alt65=9;
                }
                break;
            case 90:
                {
                alt65=10;
                }
                break;
            case 91:
                {
                alt65=11;
                }
                break;
            case 92:
                {
                alt65=12;
                }
                break;
            case 93:
                {
                alt65=13;
                }
                break;
            case 94:
                {
                alt65=14;
                }
                break;
            case 95:
                {
                alt65=15;
                }
                break;
            case 96:
                {
                alt65=16;
                }
                break;
            case 97:
                {
                alt65=17;
                }
                break;
            case 98:
                {
                alt65=18;
                }
                break;
            case 99:
                {
                alt65=19;
                }
                break;
            case 100:
                {
                alt65=20;
                }
                break;
            case 101:
                {
                alt65=21;
                }
                break;
            case 102:
                {
                alt65=22;
                }
                break;
            case 103:
                {
                alt65=23;
                }
                break;
            case 104:
                {
                alt65=24;
                }
                break;
            case 105:
                {
                alt65=25;
                }
                break;
            case 106:
                {
                alt65=26;
                }
                break;
            case 107:
                {
                alt65=27;
                }
                break;
            case 108:
                {
                alt65=28;
                }
                break;
            case 109:
                {
                alt65=29;
                }
                break;
            case 110:
                {
                alt65=30;
                }
                break;
            case 111:
                {
                alt65=31;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4531:2: kw= 'math.abs'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleExpressionFunctionCallBase10002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAbsKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4538:2: kw= 'math.acos'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleExpressionFunctionCallBase10021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAcosKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4545:2: kw= 'math.acosh'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleExpressionFunctionCallBase10040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAcoshKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4552:2: kw= 'math.asin'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleExpressionFunctionCallBase10059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAsinKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4559:2: kw= 'math.asinh'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleExpressionFunctionCallBase10078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAsinhKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4566:2: kw= 'math.atan'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleExpressionFunctionCallBase10097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAtanKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4573:2: kw= 'math.atanh'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleExpressionFunctionCallBase10116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAtanhKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4580:2: kw= 'math.atan2'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleExpressionFunctionCallBase10135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAtan2Keyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4587:2: kw= 'math.ceil'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleExpressionFunctionCallBase10154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathCeilKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4594:2: kw= 'math.clip'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleExpressionFunctionCallBase10173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathClipKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4601:2: kw= 'math.cos'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleExpressionFunctionCallBase10192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathCosKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4608:2: kw= 'math.cosh'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleExpressionFunctionCallBase10211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathCoshKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4615:2: kw= 'math.exp'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleExpressionFunctionCallBase10230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathExpKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4622:2: kw= 'math.floor'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleExpressionFunctionCallBase10249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathFloorKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4629:2: kw= 'math.fround'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleExpressionFunctionCallBase10268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathFroundKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4636:2: kw= 'math.hypot'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleExpressionFunctionCallBase10287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathHypotKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4643:2: kw= 'math.log'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleExpressionFunctionCallBase10306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathLogKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4650:2: kw= 'math.log10'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleExpressionFunctionCallBase10325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathLog10Keyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4657:2: kw= 'math.log2'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleExpressionFunctionCallBase10344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathLog2Keyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4664:2: kw= 'math.max'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleExpressionFunctionCallBase10363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathMaxKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4671:2: kw= 'math.min'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleExpressionFunctionCallBase10382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathMinKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4678:2: kw= 'math.pow'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleExpressionFunctionCallBase10401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathPowKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4685:2: kw= 'math.random'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleExpressionFunctionCallBase10420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathRandomKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4692:2: kw= 'math.round'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleExpressionFunctionCallBase10439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathRoundKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4699:2: kw= 'math.sign'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleExpressionFunctionCallBase10458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathSignKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4706:2: kw= 'math.sin'
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleExpressionFunctionCallBase10477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathSinKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4713:2: kw= 'math.sinh'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleExpressionFunctionCallBase10496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathSinhKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4720:2: kw= 'math.sqrt'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleExpressionFunctionCallBase10515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathSqrtKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4727:2: kw= 'math.tan'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleExpressionFunctionCallBase10534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathTanKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4734:2: kw= 'math.tanh'
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleExpressionFunctionCallBase10553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathTanhKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4741:2: kw= 'math.trunc'
                    {
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleExpressionFunctionCallBase10572); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4754:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4755:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4756:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean10612);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralBoolean10622); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4763:1: ruleLiteralBoolean returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4766:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4767:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4767:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4767:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4767:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4768:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralBooleanAccess().getLiteralBooleanAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4773:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==112) ) {
                alt66=1;
            }
            else if ( (LA66_0==113) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4773:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,112,FOLLOW_112_in_ruleLiteralBoolean10669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLiteralBooleanAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4778:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4778:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4779:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4779:1: (lv_isTrue_2_0= 'true' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4780:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,113,FOLLOW_113_in_ruleLiteralBoolean10693); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4801:1: entryRuleLiteralNull returns [EObject current=null] : iv_ruleLiteralNull= ruleLiteralNull EOF ;
    public final EObject entryRuleLiteralNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNull = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4802:2: (iv_ruleLiteralNull= ruleLiteralNull EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4803:2: iv_ruleLiteralNull= ruleLiteralNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNullRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull10743);
            iv_ruleLiteralNull=ruleLiteralNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralNull; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNull10753); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4810:1: ruleLiteralNull returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleLiteralNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4813:28: ( ( () otherlv_1= 'null' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4814:1: ( () otherlv_1= 'null' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4814:1: ( () otherlv_1= 'null' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4814:2: () otherlv_1= 'null'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4814:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4815:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralNullAccess().getLiteralNullAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,114,FOLLOW_114_in_ruleLiteralNull10799); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4832:1: entryRuleLiteralNumber returns [EObject current=null] : iv_ruleLiteralNumber= ruleLiteralNumber EOF ;
    public final EObject entryRuleLiteralNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNumber = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4833:2: (iv_ruleLiteralNumber= ruleLiteralNumber EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4834:2: iv_ruleLiteralNumber= ruleLiteralNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNumberRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralNumber_in_entryRuleLiteralNumber10835);
            iv_ruleLiteralNumber=ruleLiteralNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNumber10845); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4841:1: ruleLiteralNumber returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNUMBER ) ) ) ;
    public final EObject ruleLiteralNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4844:28: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4845:1: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4845:1: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4845:2: () ( (lv_value_1_0= ruleNUMBER ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4845:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4846:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralNumberAccess().getLiteralNumberAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4851:2: ( (lv_value_1_0= ruleNUMBER ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4852:1: (lv_value_1_0= ruleNUMBER )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4852:1: (lv_value_1_0= ruleNUMBER )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4853:3: lv_value_1_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralNumberAccess().getValueNUMBERParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralNumber10900);
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


    // $ANTLR start "entryRuleLiteralText"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4877:1: entryRuleLiteralText returns [EObject current=null] : iv_ruleLiteralText= ruleLiteralText EOF ;
    public final EObject entryRuleLiteralText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralText = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4878:2: (iv_ruleLiteralText= ruleLiteralText EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4879:2: iv_ruleLiteralText= ruleLiteralText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralTextRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralText_in_entryRuleLiteralText10936);
            iv_ruleLiteralText=ruleLiteralText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralText10946); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralText"


    // $ANTLR start "ruleLiteralText"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4886:1: ruleLiteralText returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLiteralText() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4889:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4890:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4890:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4890:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4890:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4891:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralTextAccess().getLiteralTextAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4896:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4897:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4897:1: (lv_value_1_0= RULE_STRING )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4898:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralText10997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getLiteralTextAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralTextRule());
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
    // $ANTLR end "ruleLiteralText"


    // $ANTLR start "entryRuleLiteralEnum"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4922:1: entryRuleLiteralEnum returns [EObject current=null] : iv_ruleLiteralEnum= ruleLiteralEnum EOF ;
    public final EObject entryRuleLiteralEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralEnum = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4923:2: (iv_ruleLiteralEnum= ruleLiteralEnum EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4924:2: iv_ruleLiteralEnum= ruleLiteralEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralEnumRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralEnum_in_entryRuleLiteralEnum11038);
            iv_ruleLiteralEnum=ruleLiteralEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralEnum11048); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4931:1: ruleLiteralEnum returns [EObject current=null] : ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLiteralEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4934:28: ( ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4935:1: ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4935:1: ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4935:2: () otherlv_1= '#' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4935:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4936:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralEnumAccess().getLiteralEnumAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleLiteralEnum11094); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralEnumAccess().getNumberSignKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4945:1: ( (otherlv_2= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4946:1: (otherlv_2= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4946:1: (otherlv_2= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4947:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralEnumRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralEnum11114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getLiteralEnumAccess().getValueDataTypeSymbolDefinitionSetElementCrossReference_2_0()); 
              	
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4966:1: entryRuleLiteralTime returns [EObject current=null] : iv_ruleLiteralTime= ruleLiteralTime EOF ;
    public final EObject entryRuleLiteralTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralTime = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4967:2: (iv_ruleLiteralTime= ruleLiteralTime EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4968:2: iv_ruleLiteralTime= ruleLiteralTime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralTimeRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralTime_in_entryRuleLiteralTime11150);
            iv_ruleLiteralTime=ruleLiteralTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralTime; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralTime11160); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4975:1: ruleLiteralTime returns [EObject current=null] : ( ( () otherlv_1= 'now' ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) ) ;
    public final EObject ruleLiteralTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4978:28: ( ( ( () otherlv_1= 'now' ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4979:1: ( ( () otherlv_1= 'now' ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4979:1: ( ( () otherlv_1= 'now' ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) )
            int alt93=7;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4979:2: ( () otherlv_1= 'now' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4979:2: ( () otherlv_1= 'now' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4979:3: () otherlv_1= 'now'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4979:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4980:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeNowAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,115,FOLLOW_115_in_ruleLiteralTime11207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLiteralTimeAccess().getNowKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4990:6: ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4990:6: ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4990:7: () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4990:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4991:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4996:2: ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4996:3: ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4996:3: ( (lv_year_3_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4997:1: (lv_year_3_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4997:1: (lv_year_3_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4998:3: lv_year_3_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getYearNUMBERParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11246);
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

                    otherlv_4=(Token)match(input,116,FOLLOW_116_in_ruleLiteralTime11258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getLiteralTimeAccess().getYearKeyword_1_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5018:2: ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_INT) ) {
                        int LA67_1 = input.LA(2);

                        if ( (LA67_1==124) ) {
                            int LA67_3 = input.LA(3);

                            if ( (LA67_3==RULE_INT) ) {
                                int LA67_5 = input.LA(4);

                                if ( (LA67_5==117) ) {
                                    alt67=1;
                                }
                            }
                        }
                        else if ( (LA67_1==117) ) {
                            alt67=1;
                        }
                    }
                    switch (alt67) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5018:3: ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5018:3: ( (lv_month_5_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5019:1: (lv_month_5_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5019:1: (lv_month_5_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5020:3: lv_month_5_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMonthNUMBERParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11281);
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

                            otherlv_6=(Token)match(input,117,FOLLOW_117_in_ruleLiteralTime11293); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getLiteralTimeAccess().getMonthKeyword_1_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5040:3: ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_INT) ) {
                        int LA68_1 = input.LA(2);

                        if ( (LA68_1==124) ) {
                            int LA68_3 = input.LA(3);

                            if ( (LA68_3==RULE_INT) ) {
                                int LA68_5 = input.LA(4);

                                if ( (LA68_5==118) ) {
                                    alt68=1;
                                }
                            }
                        }
                        else if ( (LA68_1==118) ) {
                            alt68=1;
                        }
                    }
                    switch (alt68) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5040:4: ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5040:4: ( (lv_day_7_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5041:1: (lv_day_7_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5041:1: (lv_day_7_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5042:3: lv_day_7_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getDayNUMBERParserRuleCall_1_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11317);
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

                            otherlv_8=(Token)match(input,118,FOLLOW_118_in_ruleLiteralTime11329); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getLiteralTimeAccess().getDayKeyword_1_3_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5062:3: ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_INT) ) {
                        int LA69_1 = input.LA(2);

                        if ( (LA69_1==124) ) {
                            int LA69_3 = input.LA(3);

                            if ( (LA69_3==RULE_INT) ) {
                                int LA69_5 = input.LA(4);

                                if ( (LA69_5==119) ) {
                                    alt69=1;
                                }
                            }
                        }
                        else if ( (LA69_1==119) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5062:4: ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5062:4: ( (lv_hour_9_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5063:1: (lv_hour_9_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5063:1: (lv_hour_9_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5064:3: lv_hour_9_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getHourNUMBERParserRuleCall_1_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11353);
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

                            otherlv_10=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime11365); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getLiteralTimeAccess().getHourKeyword_1_4_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5084:3: ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_INT) ) {
                        int LA71_1 = input.LA(2);

                        if ( (LA71_1==124) ) {
                            int LA71_3 = input.LA(3);

                            if ( (LA71_3==RULE_INT) ) {
                                int LA71_5 = input.LA(4);

                                if ( ((LA71_5>=120 && LA71_5<=121)) ) {
                                    alt71=1;
                                }
                            }
                        }
                        else if ( ((LA71_1>=120 && LA71_1<=121)) ) {
                            alt71=1;
                        }
                    }
                    switch (alt71) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5084:4: ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5084:4: ( (lv_minute_11_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5085:1: (lv_minute_11_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5085:1: (lv_minute_11_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5086:3: lv_minute_11_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11389);
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5102:2: (otherlv_12= 'm' | otherlv_13= 'minute' )
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==120) ) {
                                alt70=1;
                            }
                            else if ( (LA70_0==121) ) {
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
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5102:4: otherlv_12= 'm'
                                    {
                                    otherlv_12=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime11402); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_12, grammarAccess.getLiteralTimeAccess().getMKeyword_1_5_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5107:7: otherlv_13= 'minute'
                                    {
                                    otherlv_13=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime11420); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_13, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_1_5_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5111:4: ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==RULE_INT) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5111:5: ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5111:5: ( (lv_second_14_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5112:1: (lv_second_14_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5112:1: (lv_second_14_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5113:3: lv_second_14_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_1_6_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11445);
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5129:2: (otherlv_15= 's' | otherlv_16= 'second' )
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==122) ) {
                                alt72=1;
                            }
                            else if ( (LA72_0==123) ) {
                                alt72=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 72, 0, input);

                                throw nvae;
                            }
                            switch (alt72) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5129:4: otherlv_15= 's'
                                    {
                                    otherlv_15=(Token)match(input,122,FOLLOW_122_in_ruleLiteralTime11458); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_15, grammarAccess.getLiteralTimeAccess().getSKeyword_1_6_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5134:7: otherlv_16= 'second'
                                    {
                                    otherlv_16=(Token)match(input,123,FOLLOW_123_in_ruleLiteralTime11476); if (state.failed) return current;
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5139:6: ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5139:6: ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5139:7: () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5139:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5140:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5145:2: ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5145:3: ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5145:3: ( (lv_month_18_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5146:1: (lv_month_18_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5146:1: (lv_month_18_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5147:3: lv_month_18_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMonthNUMBERParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11518);
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

                    otherlv_19=(Token)match(input,117,FOLLOW_117_in_ruleLiteralTime11530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getLiteralTimeAccess().getMonthKeyword_2_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5167:2: ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_INT) ) {
                        int LA74_1 = input.LA(2);

                        if ( (LA74_1==124) ) {
                            int LA74_3 = input.LA(3);

                            if ( (LA74_3==RULE_INT) ) {
                                int LA74_5 = input.LA(4);

                                if ( (LA74_5==118) ) {
                                    alt74=1;
                                }
                            }
                        }
                        else if ( (LA74_1==118) ) {
                            alt74=1;
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5167:3: ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5167:3: ( (lv_day_20_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5168:1: (lv_day_20_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5168:1: (lv_day_20_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5169:3: lv_day_20_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getDayNUMBERParserRuleCall_2_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11553);
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

                            otherlv_21=(Token)match(input,118,FOLLOW_118_in_ruleLiteralTime11565); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_21, grammarAccess.getLiteralTimeAccess().getDayKeyword_2_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5189:3: ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RULE_INT) ) {
                        int LA75_1 = input.LA(2);

                        if ( (LA75_1==124) ) {
                            int LA75_3 = input.LA(3);

                            if ( (LA75_3==RULE_INT) ) {
                                int LA75_5 = input.LA(4);

                                if ( (LA75_5==119) ) {
                                    alt75=1;
                                }
                            }
                        }
                        else if ( (LA75_1==119) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5189:4: ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5189:4: ( (lv_hour_22_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5190:1: (lv_hour_22_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5190:1: (lv_hour_22_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5191:3: lv_hour_22_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getHourNUMBERParserRuleCall_2_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11589);
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

                            otherlv_23=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime11601); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_23, grammarAccess.getLiteralTimeAccess().getHourKeyword_2_3_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5211:3: ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RULE_INT) ) {
                        int LA77_1 = input.LA(2);

                        if ( (LA77_1==124) ) {
                            int LA77_3 = input.LA(3);

                            if ( (LA77_3==RULE_INT) ) {
                                int LA77_5 = input.LA(4);

                                if ( ((LA77_5>=120 && LA77_5<=121)) ) {
                                    alt77=1;
                                }
                            }
                        }
                        else if ( ((LA77_1>=120 && LA77_1<=121)) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5211:4: ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5211:4: ( (lv_minute_24_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5212:1: (lv_minute_24_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5212:1: (lv_minute_24_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5213:3: lv_minute_24_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_2_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11625);
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5229:2: (otherlv_25= 'm' | otherlv_26= 'minute' )
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==120) ) {
                                alt76=1;
                            }
                            else if ( (LA76_0==121) ) {
                                alt76=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 76, 0, input);

                                throw nvae;
                            }
                            switch (alt76) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5229:4: otherlv_25= 'm'
                                    {
                                    otherlv_25=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime11638); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_25, grammarAccess.getLiteralTimeAccess().getMKeyword_2_4_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5234:7: otherlv_26= 'minute'
                                    {
                                    otherlv_26=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime11656); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_26, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_2_4_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5238:4: ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==RULE_INT) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5238:5: ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5238:5: ( (lv_second_27_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5239:1: (lv_second_27_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5239:1: (lv_second_27_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5240:3: lv_second_27_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_2_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11681);
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5256:2: (otherlv_28= 's' | otherlv_29= 'second' )
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==122) ) {
                                alt78=1;
                            }
                            else if ( (LA78_0==123) ) {
                                alt78=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 78, 0, input);

                                throw nvae;
                            }
                            switch (alt78) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5256:4: otherlv_28= 's'
                                    {
                                    otherlv_28=(Token)match(input,122,FOLLOW_122_in_ruleLiteralTime11694); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_28, grammarAccess.getLiteralTimeAccess().getSKeyword_2_5_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5261:7: otherlv_29= 'second'
                                    {
                                    otherlv_29=(Token)match(input,123,FOLLOW_123_in_ruleLiteralTime11712); if (state.failed) return current;
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5266:6: ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5266:6: ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5266:7: () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5266:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5267:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5272:2: ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5272:3: ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5272:3: ( (lv_day_31_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5273:1: (lv_day_31_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5273:1: (lv_day_31_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5274:3: lv_day_31_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getDayNUMBERParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11754);
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

                    otherlv_32=(Token)match(input,118,FOLLOW_118_in_ruleLiteralTime11766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getLiteralTimeAccess().getDayKeyword_3_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5294:2: ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_INT) ) {
                        int LA80_1 = input.LA(2);

                        if ( (LA80_1==124) ) {
                            int LA80_3 = input.LA(3);

                            if ( (LA80_3==RULE_INT) ) {
                                int LA80_5 = input.LA(4);

                                if ( (LA80_5==119) ) {
                                    alt80=1;
                                }
                            }
                        }
                        else if ( (LA80_1==119) ) {
                            alt80=1;
                        }
                    }
                    switch (alt80) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5294:3: ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5294:3: ( (lv_hour_33_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5295:1: (lv_hour_33_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5295:1: (lv_hour_33_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5296:3: lv_hour_33_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getHourNUMBERParserRuleCall_3_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11789);
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

                            otherlv_34=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime11801); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_34, grammarAccess.getLiteralTimeAccess().getHourKeyword_3_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5316:3: ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==RULE_INT) ) {
                        int LA82_1 = input.LA(2);

                        if ( (LA82_1==124) ) {
                            int LA82_3 = input.LA(3);

                            if ( (LA82_3==RULE_INT) ) {
                                int LA82_5 = input.LA(4);

                                if ( ((LA82_5>=120 && LA82_5<=121)) ) {
                                    alt82=1;
                                }
                            }
                        }
                        else if ( ((LA82_1>=120 && LA82_1<=121)) ) {
                            alt82=1;
                        }
                    }
                    switch (alt82) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5316:4: ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5316:4: ( (lv_minute_35_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5317:1: (lv_minute_35_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5317:1: (lv_minute_35_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5318:3: lv_minute_35_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_3_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11825);
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5334:2: (otherlv_36= 'm' | otherlv_37= 'minute' )
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
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5334:4: otherlv_36= 'm'
                                    {
                                    otherlv_36=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime11838); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_36, grammarAccess.getLiteralTimeAccess().getMKeyword_3_3_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5339:7: otherlv_37= 'minute'
                                    {
                                    otherlv_37=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime11856); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_37, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_3_3_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5343:4: ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==RULE_INT) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5343:5: ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5343:5: ( (lv_second_38_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5344:1: (lv_second_38_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5344:1: (lv_second_38_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5345:3: lv_second_38_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_3_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11881);
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5361:2: (otherlv_39= 's' | otherlv_40= 'second' )
                            int alt83=2;
                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==122) ) {
                                alt83=1;
                            }
                            else if ( (LA83_0==123) ) {
                                alt83=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 83, 0, input);

                                throw nvae;
                            }
                            switch (alt83) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5361:4: otherlv_39= 's'
                                    {
                                    otherlv_39=(Token)match(input,122,FOLLOW_122_in_ruleLiteralTime11894); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_39, grammarAccess.getLiteralTimeAccess().getSKeyword_3_4_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5366:7: otherlv_40= 'second'
                                    {
                                    otherlv_40=(Token)match(input,123,FOLLOW_123_in_ruleLiteralTime11912); if (state.failed) return current;
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5371:6: ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5371:6: ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5371:7: () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5371:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5372:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5377:2: ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5377:3: ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5377:3: ( (lv_hour_42_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5378:1: (lv_hour_42_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5378:1: (lv_hour_42_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5379:3: lv_hour_42_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getHourNUMBERParserRuleCall_4_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11954);
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

                    otherlv_43=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime11966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getLiteralTimeAccess().getHourKeyword_4_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5399:2: ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==RULE_INT) ) {
                        int LA86_1 = input.LA(2);

                        if ( (LA86_1==124) ) {
                            int LA86_3 = input.LA(3);

                            if ( (LA86_3==RULE_INT) ) {
                                int LA86_5 = input.LA(4);

                                if ( ((LA86_5>=120 && LA86_5<=121)) ) {
                                    alt86=1;
                                }
                            }
                        }
                        else if ( ((LA86_1>=120 && LA86_1<=121)) ) {
                            alt86=1;
                        }
                    }
                    switch (alt86) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5399:3: ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5399:3: ( (lv_minute_44_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5400:1: (lv_minute_44_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5400:1: (lv_minute_44_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5401:3: lv_minute_44_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_4_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11989);
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5417:2: (otherlv_45= 'm' | otherlv_46= 'minute' )
                            int alt85=2;
                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==120) ) {
                                alt85=1;
                            }
                            else if ( (LA85_0==121) ) {
                                alt85=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 85, 0, input);

                                throw nvae;
                            }
                            switch (alt85) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5417:4: otherlv_45= 'm'
                                    {
                                    otherlv_45=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime12002); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_45, grammarAccess.getLiteralTimeAccess().getMKeyword_4_2_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5422:7: otherlv_46= 'minute'
                                    {
                                    otherlv_46=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime12020); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_46, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_4_2_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5426:4: ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_INT) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5426:5: ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5426:5: ( (lv_second_47_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5427:1: (lv_second_47_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5427:1: (lv_second_47_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5428:3: lv_second_47_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_4_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime12045);
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5444:2: (otherlv_48= 's' | otherlv_49= 'second' )
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==122) ) {
                                alt87=1;
                            }
                            else if ( (LA87_0==123) ) {
                                alt87=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 87, 0, input);

                                throw nvae;
                            }
                            switch (alt87) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5444:4: otherlv_48= 's'
                                    {
                                    otherlv_48=(Token)match(input,122,FOLLOW_122_in_ruleLiteralTime12058); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_48, grammarAccess.getLiteralTimeAccess().getSKeyword_4_3_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5449:7: otherlv_49= 'second'
                                    {
                                    otherlv_49=(Token)match(input,123,FOLLOW_123_in_ruleLiteralTime12076); if (state.failed) return current;
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5454:6: ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5454:6: ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5454:7: () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5454:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5455:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5460:2: ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5460:3: ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5460:3: ( (lv_minute_51_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5461:1: (lv_minute_51_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5461:1: (lv_minute_51_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5462:3: lv_minute_51_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime12118);
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

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5478:2: (otherlv_52= 'm' | otherlv_53= 'minute' )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==120) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==121) ) {
                        alt89=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5478:4: otherlv_52= 'm'
                            {
                            otherlv_52=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime12131); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_52, grammarAccess.getLiteralTimeAccess().getMKeyword_5_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5483:7: otherlv_53= 'minute'
                            {
                            otherlv_53=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime12149); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_53, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_5_1_1_1());
                                  
                            }

                            }
                            break;

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5487:3: ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==RULE_INT) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5487:4: ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5487:4: ( (lv_second_54_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5488:1: (lv_second_54_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5488:1: (lv_second_54_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5489:3: lv_second_54_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_5_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime12173);
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5505:2: (otherlv_55= 's' | otherlv_56= 'second' )
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==122) ) {
                                alt90=1;
                            }
                            else if ( (LA90_0==123) ) {
                                alt90=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 90, 0, input);

                                throw nvae;
                            }
                            switch (alt90) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5505:4: otherlv_55= 's'
                                    {
                                    otherlv_55=(Token)match(input,122,FOLLOW_122_in_ruleLiteralTime12186); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_55, grammarAccess.getLiteralTimeAccess().getSKeyword_5_2_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5510:7: otherlv_56= 'second'
                                    {
                                    otherlv_56=(Token)match(input,123,FOLLOW_123_in_ruleLiteralTime12204); if (state.failed) return current;
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5515:6: ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5515:6: ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5515:7: () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5515:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5516:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5521:2: ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5521:3: ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5521:3: ( (lv_second_58_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5522:1: (lv_second_58_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5522:1: (lv_second_58_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5523:3: lv_second_58_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_6_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime12246);
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

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5539:2: (otherlv_59= 's' | otherlv_60= 'second' )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==122) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==123) ) {
                        alt92=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;
                    }
                    switch (alt92) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5539:4: otherlv_59= 's'
                            {
                            otherlv_59=(Token)match(input,122,FOLLOW_122_in_ruleLiteralTime12259); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_59, grammarAccess.getLiteralTimeAccess().getSKeyword_6_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5544:7: otherlv_60= 'second'
                            {
                            otherlv_60=(Token)match(input,123,FOLLOW_123_in_ruleLiteralTime12277); if (state.failed) return current;
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5556:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5557:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5558:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12317);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12328); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5565:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5568:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5569:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5569:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5569:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5576:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==124) && (synpred17_InternalLil())) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5576:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5576:2: ( ( '.' )=>kw= '.' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5576:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,124,FOLLOW_124_in_ruleQualifiedName12396); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12412); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop94;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5599:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5600:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5601:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12460);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12471); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5608:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5611:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5612:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5612:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5613:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12518);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5623:1: (kw= '.*' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==125) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5624:2: kw= '.*'
                    {
                    kw=(Token)match(input,125,FOLLOW_125_in_ruleQualifiedNameWithWildcard12537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleNUMBER"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5637:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5638:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5639:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER12580);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER12591); if (state.failed) return current;

            }

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5646:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5649:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5650:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5650:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5650:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER12631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5657:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==124) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5658:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,124,FOLLOW_124_in_ruleNUMBER12650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER12665); if (state.failed) return current;
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
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:745:5: ( ( () 'collection' ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:745:6: ( () 'collection' )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:745:6: ( () 'collection' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:745:7: () 'collection'
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:745:7: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:746:1: 
        {
        }

        match(input,25,FOLLOW_25_in_synpred1_InternalLil1480); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalLil

    // $ANTLR start synpred2_InternalLil
    public final void synpred2_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:757:5: ( ( () 'set' ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:757:6: ( () 'set' )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:757:6: ( () 'set' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:757:7: () 'set'
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:757:7: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:758:1: 
        {
        }

        match(input,26,FOLLOW_26_in_synpred2_InternalLil1518); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalLil

    // $ANTLR start synpred3_InternalLil
    public final void synpred3_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:769:5: ( ( () 'list' ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:769:6: ( () 'list' )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:769:6: ( () 'list' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:769:7: () 'list'
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:769:7: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:770:1: 
        {
        }

        match(input,27,FOLLOW_27_in_synpred3_InternalLil1556); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalLil

    // $ANTLR start synpred4_InternalLil
    public final void synpred4_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:781:5: ( ( () 'queue' ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:781:6: ( () 'queue' )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:781:6: ( () 'queue' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:781:7: () 'queue'
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:781:7: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:782:1: 
        {
        }

        match(input,28,FOLLOW_28_in_synpred4_InternalLil1594); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalLil

    // $ANTLR start synpred5_InternalLil
    public final void synpred5_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2790:3: ( ( () ( ( ruleExpressionOrOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2790:4: ( () ( ( ruleExpressionOrOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2790:4: ( () ( ( ruleExpressionOrOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2790:5: () ( ( ruleExpressionOrOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2790:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2791:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2791:2: ( ( ruleExpressionOrOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2792:1: ( ruleExpressionOrOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2792:1: ( ruleExpressionOrOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2793:1: ruleExpressionOrOp
        {
        pushFollow(FOLLOW_ruleExpressionOrOp_in_synpred5_InternalLil5795);
        ruleExpressionOrOp();

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
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2894:3: ( ( () ( ( ruleExpressionAndOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2894:4: ( () ( ( ruleExpressionAndOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2894:4: ( () ( ( ruleExpressionAndOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2894:5: () ( ( ruleExpressionAndOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2894:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2895:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2895:2: ( ( ruleExpressionAndOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2896:1: ( ruleExpressionAndOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2896:1: ( ruleExpressionAndOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2897:1: ruleExpressionAndOp
        {
        pushFollow(FOLLOW_ruleExpressionAndOp_in_synpred6_InternalLil6050);
        ruleExpressionAndOp();

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
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2998:3: ( ( () ( ( ruleExpressionEqualityOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2998:4: ( () ( ( ruleExpressionEqualityOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2998:4: ( () ( ( ruleExpressionEqualityOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2998:5: () ( ( ruleExpressionEqualityOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2998:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2999:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2999:2: ( ( ruleExpressionEqualityOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3000:1: ( ruleExpressionEqualityOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3000:1: ( ruleExpressionEqualityOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3001:1: ruleExpressionEqualityOp
        {
        pushFollow(FOLLOW_ruleExpressionEqualityOp_in_synpred7_InternalLil6305);
        ruleExpressionEqualityOp();

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
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3109:3: ( ( () ( ( ruleExpressionCompareOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3109:4: ( () ( ( ruleExpressionCompareOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3109:4: ( () ( ( ruleExpressionCompareOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3109:5: () ( ( ruleExpressionCompareOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3109:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3110:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3110:2: ( ( ruleExpressionCompareOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3111:1: ( ruleExpressionCompareOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3111:1: ( ruleExpressionCompareOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3112:1: ruleExpressionCompareOp
        {
        pushFollow(FOLLOW_ruleExpressionCompareOp_in_synpred8_InternalLil6581);
        ruleExpressionCompareOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalLil

    // $ANTLR start synpred9_InternalLil
    public final void synpred9_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3234:3: ( ( () ( ( ruleExpressionOtherOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3234:4: ( () ( ( ruleExpressionOtherOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3234:4: ( () ( ( ruleExpressionOtherOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3234:5: () ( ( ruleExpressionOtherOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3234:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3235:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3235:2: ( ( ruleExpressionOtherOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3236:1: ( ruleExpressionOtherOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3236:1: ( ruleExpressionOtherOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3237:1: ruleExpressionOtherOp
        {
        pushFollow(FOLLOW_ruleExpressionOtherOp_in_synpred9_InternalLil6895);
        ruleExpressionOtherOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalLil

    // $ANTLR start synpred10_InternalLil
    public final void synpred10_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3345:3: ( ( () ( ( ruleExpressionAdditionOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3345:4: ( () ( ( ruleExpressionAdditionOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3345:4: ( () ( ( ruleExpressionAdditionOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3345:5: () ( ( ruleExpressionAdditionOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3345:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3346:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3346:2: ( ( ruleExpressionAdditionOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3347:1: ( ruleExpressionAdditionOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3347:1: ( ruleExpressionAdditionOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3348:1: ruleExpressionAdditionOp
        {
        pushFollow(FOLLOW_ruleExpressionAdditionOp_in_synpred10_InternalLil7171);
        ruleExpressionAdditionOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalLil

    // $ANTLR start synpred11_InternalLil
    public final void synpred11_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3456:3: ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3456:4: ( () ( ( ruleExpressionMultiplicationOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3456:4: ( () ( ( ruleExpressionMultiplicationOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3456:5: () ( ( ruleExpressionMultiplicationOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3456:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3457:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3457:2: ( ( ruleExpressionMultiplicationOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3458:1: ( ruleExpressionMultiplicationOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3458:1: ( ruleExpressionMultiplicationOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3459:1: ruleExpressionMultiplicationOp
        {
        pushFollow(FOLLOW_ruleExpressionMultiplicationOp_in_synpred11_InternalLil7447);
        ruleExpressionMultiplicationOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalLil

    // $ANTLR start synpred15_InternalLil
    public final void synpred15_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4223:3: ( ( ruleExpressionCase ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4224:1: ( ruleExpressionCase )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4224:1: ( ruleExpressionCase )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4225:1: ruleExpressionCase
        {
        pushFollow(FOLLOW_ruleExpressionCase_in_synpred15_InternalLil9351);
        ruleExpressionCase();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalLil

    // $ANTLR start synpred16_InternalLil
    public final void synpred16_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4245:5: ( 'default' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4245:7: 'default'
        {
        match(input,77,FOLLOW_77_in_synpred16_InternalLil9382); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalLil

    // $ANTLR start synpred17_InternalLil
    public final void synpred17_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5576:3: ( '.' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5577:2: '.'
        {
        match(input,124,FOLLOW_124_in_synpred17_InternalLil12387); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalLil

    // Delegated rules

    public final boolean synpred16_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred15_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalLil_fragment(); // can never throw exception
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
    public final boolean synpred17_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalLil_fragment(); // can never throw exception
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
    public final boolean synpred9_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA93 dfa93 = new DFA93(this);
    static final String DFA30_eotS =
        "\u0187\uffff";
    static final String DFA30_eofS =
        "\u0187\uffff";
    static final String DFA30_minS =
        "\1\4\1\16\1\4\1\31\5\24\2\31\1\32\1\33\1\34\3\uffff\5\35\1\40\2"+
        "\6\1\5\3\6\1\4\4\36\1\164\1\36\1\164\2\36\2\6\1\31\2\6\1\5\1\31"+
        "\1\6\1\31\7\6\2\36\2\6\2\36\10\6\1\31\1\40\1\31\3\36\1\42\2\36\2"+
        "\164\1\165\1\167\1\172\1\166\1\170\1\42\2\164\1\165\1\167\1\172"+
        "\1\170\1\166\2\36\1\4\2\6\1\31\1\6\2\36\14\6\2\36\4\6\2\36\1\6\2"+
        "\36\5\6\2\36\1\6\2\36\2\6\1\31\1\6\2\42\14\6\2\36\2\6\2\36\3\6\2"+
        "\36\3\6\2\36\2\6\2\36\4\6\2\36\1\42\1\164\1\170\1\165\1\167\1\166"+
        "\1\172\1\165\1\167\1\172\1\170\1\166\1\167\1\172\1\170\1\172\1\166"+
        "\1\167\1\172\2\170\1\172\1\164\1\165\1\167\1\170\1\172\1\166\1\165"+
        "\1\167\1\172\1\170\1\166\1\167\1\170\2\172\1\170\1\172\1\166\1\170"+
        "\1\172\1\167\1\36\1\6\2\36\10\6\2\36\2\6\2\36\6\6\2\36\2\6\2\36"+
        "\13\6\2\42\11\6\2\42\1\6\2\42\3\6\2\42\5\6\2\42\12\6\1\170\1\172"+
        "\1\165\1\167\1\172\1\166\1\170\1\167\1\170\1\172\1\166\1\172\1\170"+
        "\1\167\1\172\1\167\1\172\1\170\1\166\1\172\1\170\1\167\1\172\1\170"+
        "\1\172\1\165\1\166\1\167\1\172\1\170\1\167\1\170\1\172\1\170\2\172"+
        "\1\166\1\172\1\170\2\167\1\172\1\170\1\166\1\170\2\172\1\170\1\172"+
        "\1\167\24\6\1\172\1\167\1\172\1\166\2\170\2\172\1\170\1\167\1\166"+
        "\1\167\1\172\2\170\3\172\1\170\1\167";
    static final String DFA30_maxS =
        "\1\4\1\16\1\30\13\51\3\uffff\1\35\1\41\1\35\1\41\1\35\1\40\2\6\1"+
        "\5\2\163\1\6\1\4\2\174\2\37\1\174\1\36\2\174\1\37\2\6\1\51\2\6\1"+
        "\5\1\51\1\163\1\51\1\6\10\37\1\163\1\6\10\36\2\6\1\51\1\40\1\51"+
        "\1\37\1\174\1\36\1\174\2\37\1\174\1\173\5\174\1\42\1\174\1\173\5"+
        "\174\1\37\1\174\1\4\2\6\1\51\1\6\10\37\1\6\7\37\1\6\5\37\1\6\2\37"+
        "\1\6\6\37\1\6\4\37\1\51\1\6\10\42\1\6\7\36\1\6\5\36\1\6\2\36\1\6"+
        "\4\36\1\6\6\36\1\6\2\37\1\42\1\173\5\174\1\173\4\174\1\173\2\174"+
        "\2\173\3\174\1\173\1\174\1\173\5\174\1\173\4\174\1\173\2\174\2\173"+
        "\1\174\1\173\3\174\1\37\1\6\4\37\1\6\7\37\1\6\5\37\1\6\6\37\1\6"+
        "\2\37\13\6\7\42\1\6\5\42\1\6\4\42\1\6\2\42\1\6\6\42\12\6\1\173\1"+
        "\174\1\173\4\174\1\173\2\174\1\173\3\174\14\173\4\174\1\173\2\174"+
        "\1\173\1\174\2\173\3\174\12\173\24\6\24\173";
    static final String DFA30_acceptS =
        "\16\uffff\1\1\1\2\1\3\u0176\uffff";
    static final String DFA30_specialS =
        "\u0187\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1",
            "\1\2",
            "\1\11\15\uffff\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10",
            "\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "\1\21\4\uffff\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17"+
            "\1\20",
            "\1\22\4\uffff\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17"+
            "\1\20",
            "\1\23\4\uffff\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17"+
            "\1\20",
            "\1\24\4\uffff\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17"+
            "\1\20",
            "\1\25\4\uffff\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17"+
            "\1\20",
            "\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "\1\14\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "",
            "",
            "",
            "\1\26",
            "\1\27\3\uffff\1\30",
            "\1\31",
            "\1\32\3\uffff\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\42\154\uffff\1\41",
            "\1\44\154\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\50\1\51\134\uffff\1\47",
            "\1\53\135\uffff\1\52",
            "\1\54\1\55",
            "\1\56\1\57",
            "\1\61\1\65\1\62\1\66\1\63\1\64\1\67\1\70\1\60",
            "\1\71",
            "\1\75\1\102\1\76\1\101\1\77\1\100\1\73\1\74\1\72",
            "\1\104\1\105\134\uffff\1\103",
            "\1\106\1\107",
            "\1\110",
            "\1\111",
            "\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "\1\116\154\uffff\1\115",
            "\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "\1\117",
            "\1\120\27\uffff\1\56\1\57",
            "\1\121\27\uffff\1\56\1\57",
            "\1\122\27\uffff\1\56\1\57",
            "\1\122\27\uffff\1\56\1\57",
            "\1\123\27\uffff\1\56\1\57",
            "\1\124\27\uffff\1\56\1\57",
            "\1\56\1\57",
            "\1\56\1\57",
            "\1\126\154\uffff\1\125",
            "\1\127",
            "\1\71",
            "\1\71",
            "\1\130\27\uffff\1\71",
            "\1\131\27\uffff\1\71",
            "\1\132\27\uffff\1\71",
            "\1\132\27\uffff\1\71",
            "\1\133\27\uffff\1\71",
            "\1\134\27\uffff\1\71",
            "\1\135",
            "\1\136",
            "\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "\1\137",
            "\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "\1\50\1\51",
            "\1\50\1\51\134\uffff\1\140",
            "\1\53",
            "\1\142\131\uffff\1\141",
            "\1\54\1\55",
            "\1\56\1\57",
            "\1\147\1\151\1\150\1\146\1\152\1\153\1\144\1\145\1\143",
            "\1\61\1\65\1\62\1\66\1\63\1\64\1\67\1\70",
            "\1\161\1\155\1\160\1\156\1\157\1\162\1\163\1\154",
            "\1\167\1\165\1\166\1\170\1\171\1\164",
            "\1\173\1\174\1\172",
            "\1\176\1\u0081\1\177\1\u0080\1\u0082\1\u0083\1\175",
            "\1\u0087\1\u0088\1\u0085\1\u0086\1\u0084",
            "\1\u0089",
            "\1\u008d\1\u0092\1\u008e\1\u008f\1\u0090\1\u0091\1\u008b\1"+
            "\u008c\1\u008a",
            "\1\75\1\102\1\76\1\101\1\77\1\100\1\73\1\74",
            "\1\u0098\1\u0094\1\u0097\1\u0095\1\u0096\1\u0099\1\u009a\1"+
            "\u0093",
            "\1\u009c\1\u009f\1\u00a0\1\u009d\1\u009e\1\u009b",
            "\1\u00a2\1\u00a3\1\u00a1",
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a4",
            "\1\u00af\1\u00aa\1\u00ad\1\u00ae\1\u00ab\1\u00ac\1\u00a9",
            "\1\104\1\105",
            "\1\104\1\105\134\uffff\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "\1\u00b4",
            "\1\56\1\57",
            "\1\56\1\57",
            "\1\u00b5\27\uffff\1\56\1\57",
            "\1\u00b6\27\uffff\1\56\1\57",
            "\1\u00b7\27\uffff\1\56\1\57",
            "\1\u00b8\27\uffff\1\56\1\57",
            "\1\u00b9\27\uffff\1\56\1\57",
            "\1\u00b9\27\uffff\1\56\1\57",
            "\1\u00ba",
            "\1\u00bb\27\uffff\1\56\1\57",
            "\1\u00bc\27\uffff\1\56\1\57",
            "\1\u00bc\27\uffff\1\56\1\57",
            "\1\u00bd\27\uffff\1\56\1\57",
            "\1\u00be\27\uffff\1\56\1\57",
            "\1\56\1\57",
            "\1\56\1\57",
            "\1\u00bf",
            "\1\u00c0\27\uffff\1\56\1\57",
            "\1\u00c0\27\uffff\1\56\1\57",
            "\1\u00c1\27\uffff\1\56\1\57",
            "\1\56\1\57",
            "\1\56\1\57",
            "\1\u00c2",
            "\1\56\1\57",
            "\1\56\1\57",
            "\1\u00c3",
            "\1\u00c4\27\uffff\1\56\1\57",
            "\1\u00c5\27\uffff\1\56\1\57",
            "\1\u00c5\27\uffff\1\56\1\57",
            "\1\u00c6\27\uffff\1\56\1\57",
            "\1\56\1\57",
            "\1\56\1\57",
            "\1\u00c7",
            "\1\56\1\57",
            "\1\56\1\57",
            "\1\u00c8\27\uffff\1\56\1\57",
            "\1\u00c8\27\uffff\1\56\1\57",
            "\1\12\1\13\1\14\1\15\10\uffff\1\16\2\uffff\1\17\1\20",
            "\1\u00c9",
            "\1\u0089",
            "\1\u0089",
            "\1\u00ca\33\uffff\1\u0089",
            "\1\u00cb\33\uffff\1\u0089",
            "\1\u00cc\33\uffff\1\u0089",
            "\1\u00cd\33\uffff\1\u0089",
            "\1\u00cd\33\uffff\1\u0089",
            "\1\u00ce\33\uffff\1\u0089",
            "\1\u00cf",
            "\1\u00d0\27\uffff\1\71",
            "\1\u00d1\27\uffff\1\71",
            "\1\u00d1\27\uffff\1\71",
            "\1\u00d2\27\uffff\1\71",
            "\1\u00d3\27\uffff\1\71",
            "\1\71",
            "\1\71",
            "\1\u00d4",
            "\1\u00d5\27\uffff\1\71",
            "\1\71",
            "\1\71",
            "\1\u00d6\27\uffff\1\71",
            "\1\u00d6\27\uffff\1\71",
            "\1\u00d7",
            "\1\71",
            "\1\71",
            "\1\u00d8",
            "\1\u00d9\27\uffff\1\71",
            "\1\u00d9\27\uffff\1\71",
            "\1\71",
            "\1\71",
            "\1\u00da",
            "\1\u00db\27\uffff\1\71",
            "\1\71",
            "\1\71",
            "\1\u00dc\27\uffff\1\71",
            "\1\u00dc\27\uffff\1\71",
            "\1\u00dd\27\uffff\1\71",
            "\1\u00de",
            "\1\106\1\107",
            "\1\50\1\51",
            "\1\142",
            "\1\147\1\151\1\150\1\146\1\152\1\153\1\144\1\145",
            "\1\u00e2\1\u00e3\1\u00e0\1\u00e1\1\u00df",
            "\1\u00e8\1\u00e5\1\u00e9\1\u00e6\1\u00e7\1\u00ea\1\u00eb\1"+
            "\u00e4",
            "\1\u00ed\1\u00f0\1\u00f1\1\u00ee\1\u00ef\1\u00ec",
            "\1\u00f8\1\u00f5\1\u00f3\1\u00f4\1\u00f6\1\u00f7\1\u00f2",
            "\1\u00fa\1\u00fb\1\u00f9",
            "\1\161\1\155\1\160\1\156\1\157\1\162\1\163",
            "\1\160\1\156\1\157\1\162\1\163\1\u00fc",
            "\1\162\1\163\1\u00fd",
            "\1\156\1\157\1\162\1\163\1\u00fe",
            "\1\155\1\160\1\156\1\157\1\162\1\163\1\u00ff",
            "\1\167\1\165\1\166\1\170\1\171",
            "\1\170\1\171\1\u0100",
            "\1\165\1\166\1\170\1\171\1\u0101",
            "\1\173\1\174",
            "\1\176\1\u0081\1\177\1\u0080\1\u0082\1\u0083",
            "\1\u0081\1\177\1\u0080\1\u0082\1\u0083\1\u0102",
            "\1\u0082\1\u0083\1\u0103",
            "\1\177\1\u0080\1\u0082\1\u0083\1\u0104",
            "\1\u0087\1\u0088\1\u0085\1\u0086",
            "\1\u0085\1\u0086\1\u0105",
            "\1\u008d\1\u0092\1\u008e\1\u008f\1\u0090\1\u0091\1\u008b\1"+
            "\u008c",
            "\1\u0109\1\u010a\1\u010d\1\u010b\1\u010c\1\u0107\1\u0108\1"+
            "\u0106",
            "\1\u010f\1\u0110\1\u0111\1\u0112\1\u0113\1\u010e",
            "\1\u0117\1\u0118\1\u0115\1\u0116\1\u0114",
            "\1\u011a\1\u011b\1\u0119",
            "\1\u0120\1\u011f\1\u011d\1\u011e\1\u0121\1\u0122\1\u011c",
            "\1\u0098\1\u0094\1\u0097\1\u0095\1\u0096\1\u0099\1\u009a",
            "\1\u0097\1\u0095\1\u0096\1\u0099\1\u009a\1\u0123",
            "\1\u0099\1\u009a\1\u0124",
            "\1\u0095\1\u0096\1\u0099\1\u009a\1\u0125",
            "\1\u0094\1\u0097\1\u0095\1\u0096\1\u0099\1\u009a\1\u0126",
            "\1\u009c\1\u009f\1\u00a0\1\u009d\1\u009e",
            "\1\u009f\1\u00a0\1\u009d\1\u009e\1\u0127",
            "\1\u009d\1\u009e\1\u0128",
            "\1\u00a2\1\u00a3",
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8",
            "\1\u00a7\1\u00a8\1\u0129",
            "\1\u00af\1\u00aa\1\u00ad\1\u00ae\1\u00ab\1\u00ac",
            "\1\u00ad\1\u00ae\1\u00ab\1\u00ac\1\u012a",
            "\1\u00ab\1\u00ac\1\u012b",
            "\1\u00aa\1\u00ad\1\u00ae\1\u00ab\1\u00ac\1\u012c",
            "\1\104\1\105",
            "\1\u012d",
            "\1\56\1\57",
            "\1\56\1\57",
            "\1\u012e\27\uffff\1\56\1\57",
            "\1\u012e\27\uffff\1\56\1\57",
            "\1\u012f",
            "\1\u0130\27\uffff\1\56\1\57",
            "\1\u0131\27\uffff\1\56\1\57",
            "\1\u0131\27\uffff\1\56\1\57",
            "\1\u0132\27\uffff\1\56\1\57",
            "\1\u0133\27\uffff\1\56\1\57",
            "\1\56\1\57",
            "\1\56\1\57",
            "\1\u0134",
            "\1\u0135\27\uffff\1\56\1\57",
            "\1\56\1\57",
            "\1\56\1\57",
            "\1\u0136\27\uffff\1\56\1\57",
            "\1\u0136\27\uffff\1\56\1\57",
            "\1\u0137",
            "\1\u0138\27\uffff\1\56\1\57",
            "\1\u0138\27\uffff\1\56\1\57",
            "\1\u0139\27\uffff\1\56\1\57",
            "\1\56\1\57",
            "\1\56\1\57",
            "\1\u013a\27\uffff\1\56\1\57",
            "\1\u013b",
            "\1\56\1\57",
            "\1\56\1\57",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0089",
            "\1\u0089",
            "\1\u0147\33\uffff\1\u0089",
            "\1\u0148\33\uffff\1\u0089",
            "\1\u0149\33\uffff\1\u0089",
            "\1\u0149\33\uffff\1\u0089",
            "\1\u014a\33\uffff\1\u0089",
            "\1\u014b",
            "\1\u014c\33\uffff\1\u0089",
            "\1\u014d\33\uffff\1\u0089",
            "\1\u014d\33\uffff\1\u0089",
            "\1\u0089",
            "\1\u0089",
            "\1\u014e",
            "\1\u0089",
            "\1\u0089",
            "\1\u014f\33\uffff\1\u0089",
            "\1\u014f\33\uffff\1\u0089",
            "\1\u0150",
            "\1\u0089",
            "\1\u0089",
            "\1\u0151",
            "\1\u0152\33\uffff\1\u0089",
            "\1\u0152\33\uffff\1\u0089",
            "\1\u0153\33\uffff\1\u0089",
            "\1\u0154\33\uffff\1\u0089",
            "\1\u0089",
            "\1\u0089",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u00e2\1\u00e3\1\u00e0\1\u00e1",
            "\1\u00e0\1\u00e1\1\u015f",
            "\1\u00e8\1\u00e5\1\u00e9\1\u00e6\1\u00e7\1\u00ea\1\u00eb",
            "\1\u00e9\1\u00e6\1\u00e7\1\u00ea\1\u00eb\1\u0160",
            "\1\u00ea\1\u00eb\1\u0161",
            "\1\u00e5\1\u00e9\1\u00e6\1\u00e7\1\u00ea\1\u00eb\1\u0162",
            "\1\u00e6\1\u00e7\1\u00ea\1\u00eb\1\u0163",
            "\1\u00ed\1\u00f0\1\u00f1\1\u00ee\1\u00ef",
            "\1\u00f0\1\u00f1\1\u00ee\1\u00ef\1\u0164",
            "\1\u00ee\1\u00ef\1\u0165",
            "\1\u00f8\1\u00f5\1\u00f3\1\u00f4\1\u00f6\1\u00f7",
            "\1\u00f6\1\u00f7\1\u0166",
            "\1\u00f3\1\u00f4\1\u00f6\1\u00f7\1\u0167",
            "\1\u00f5\1\u00f3\1\u00f4\1\u00f6\1\u00f7\1\u0168",
            "\1\u00fa\1\u00fb",
            "\1\160\1\156\1\157\1\162\1\163",
            "\1\162\1\163",
            "\1\156\1\157\1\162\1\163",
            "\1\155\1\160\1\156\1\157\1\162\1\163",
            "\1\170\1\171",
            "\1\165\1\166\1\170\1\171",
            "\1\u0081\1\177\1\u0080\1\u0082\1\u0083",
            "\1\u0082\1\u0083",
            "\1\177\1\u0080\1\u0082\1\u0083",
            "\1\u0085\1\u0086",
            "\1\u0109\1\u010a\1\u010d\1\u010b\1\u010c\1\u0107\1\u0108",
            "\1\u010a\1\u010d\1\u010b\1\u010c\1\u0107\1\u0108\1\u0169",
            "\1\u010d\1\u010b\1\u010c\1\u0107\1\u0108\1\u016a",
            "\1\u0107\1\u0108\1\u016b",
            "\1\u010b\1\u010c\1\u0107\1\u0108\1\u016c",
            "\1\u010f\1\u0110\1\u0111\1\u0112\1\u0113",
            "\1\u0110\1\u0111\1\u0112\1\u0113\1\u016d",
            "\1\u0112\1\u0113\1\u016e",
            "\1\u0117\1\u0118\1\u0115\1\u0116",
            "\1\u0115\1\u0116\1\u016f",
            "\1\u011a\1\u011b",
            "\1\u0120\1\u011f\1\u011d\1\u011e\1\u0121\1\u0122",
            "\1\u0121\1\u0122\1\u0170",
            "\1\u011d\1\u011e\1\u0121\1\u0122\1\u0171",
            "\1\u011f\1\u011d\1\u011e\1\u0121\1\u0122\1\u0172",
            "\1\u0097\1\u0095\1\u0096\1\u0099\1\u009a",
            "\1\u0099\1\u009a",
            "\1\u0095\1\u0096\1\u0099\1\u009a",
            "\1\u0094\1\u0097\1\u0095\1\u0096\1\u0099\1\u009a",
            "\1\u009f\1\u00a0\1\u009d\1\u009e",
            "\1\u009d\1\u009e",
            "\1\u00a7\1\u00a8",
            "\1\u00ad\1\u00ae\1\u00ab\1\u00ac",
            "\1\u00ab\1\u00ac",
            "\1\u00aa\1\u00ad\1\u00ae\1\u00ab\1\u00ac",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u00e0\1\u00e1",
            "\1\u00e9\1\u00e6\1\u00e7\1\u00ea\1\u00eb",
            "\1\u00ea\1\u00eb",
            "\1\u00e5\1\u00e9\1\u00e6\1\u00e7\1\u00ea\1\u00eb",
            "\1\u00e6\1\u00e7\1\u00ea\1\u00eb",
            "\1\u00f0\1\u00f1\1\u00ee\1\u00ef",
            "\1\u00ee\1\u00ef",
            "\1\u00f6\1\u00f7",
            "\1\u00f3\1\u00f4\1\u00f6\1\u00f7",
            "\1\u00f5\1\u00f3\1\u00f4\1\u00f6\1\u00f7",
            "\1\u010a\1\u010d\1\u010b\1\u010c\1\u0107\1\u0108",
            "\1\u010d\1\u010b\1\u010c\1\u0107\1\u0108",
            "\1\u0107\1\u0108",
            "\1\u010b\1\u010c\1\u0107\1\u0108",
            "\1\u0110\1\u0111\1\u0112\1\u0113",
            "\1\u0112\1\u0113",
            "\1\u0115\1\u0116",
            "\1\u0121\1\u0122",
            "\1\u011d\1\u011e\1\u0121\1\u0122",
            "\1\u011f\1\u011d\1\u011e\1\u0121\1\u0122"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1729:1: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'event' (otherlv_5= 'from' ( (lv_source_6_0= ruleInteractorDataAlias ) ) )? (otherlv_7= 'to' ( (lv_destinations_8_0= ruleInteractorDataAlias ) ) )* ) ) | ( () ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ( (lv_type_12_0= ruleDataType ) ) otherlv_13= 'flow' (otherlv_14= 'from' ( (lv_source_15_0= ruleInteractorDataAlias ) ) )? (otherlv_16= 'to' ( (lv_destinations_17_0= ruleInteractorDataAlias ) ) )* ) ) | ( () ( ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_type_21_0= ruleDataType ) ) otherlv_22= 'constant' ) ) )";
        }
    }
    static final String DFA55_eotS =
        "\14\uffff";
    static final String DFA55_eofS =
        "\3\uffff\1\12\7\uffff\1\12";
    static final String DFA55_minS =
        "\1\4\2\uffff\1\4\5\uffff\1\6\1\uffff\1\4";
    static final String DFA55_maxS =
        "\1\163\2\uffff\1\174\5\uffff\1\6\1\uffff\1\173";
    static final String DFA55_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\3\1\uffff";
    static final String DFA55_specialS =
        "\14\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\10\1\5\1\3\26\uffff\1\1\2\uffff\1\7\1\1\20\uffff\1\10\75"+
            "\uffff\2\2\1\4\1\6",
            "",
            "",
            "\1\12\11\uffff\1\12\13\uffff\1\12\3\uffff\2\12\2\uffff\1\12"+
            "\20\uffff\4\12\1\uffff\20\12\2\uffff\2\12\1\uffff\2\12\45\uffff"+
            "\10\6\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "\1\12\11\uffff\1\12\13\uffff\1\12\3\uffff\2\12\2\uffff\1\12"+
            "\20\uffff\4\12\1\uffff\20\12\2\uffff\2\12\1\uffff\2\12\45\uffff"+
            "\10\6"
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3759:1: (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralText_4= ruleLiteralText | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | this_InteractorDataReception_7= ruleInteractorDataReception )";
        }
    }
    static final String DFA93_eotS =
        "\13\uffff";
    static final String DFA93_eofS =
        "\13\uffff";
    static final String DFA93_minS =
        "\1\6\1\uffff\1\164\1\6\6\uffff\1\164";
    static final String DFA93_maxS =
        "\1\163\1\uffff\1\174\1\6\6\uffff\1\173";
    static final String DFA93_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\4\1\7\1\6\1\2\1\5\1\uffff";
    static final String DFA93_specialS =
        "\13\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\2\154\uffff\1\1",
            "",
            "\1\10\1\4\1\5\1\11\2\7\2\6\1\3",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\4\1\5\1\11\2\7\2\6"
    };

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "4979:1: ( ( () otherlv_1= 'now' ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLilModel_in_entryRuleLilModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleLilModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLilModel143 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleImportStatement_in_ruleLilModel164 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleActorTypeDefinition_in_ruleLilModel187 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDataTypeDefinition_in_ruleLilModel214 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInteractorTypeDefinition_in_ruleLilModel241 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleImportStatement_in_entryRuleImportStatement279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImportStatement326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportStatement347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorTypeDefinition_in_entryRuleActorTypeDefinition383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorTypeDefinition393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorTypeDefinition435 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActorTypeDefinition452 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActorTypeDefinition464 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleActorComponentDeclaration_in_ruleActorTypeDefinition485 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleActorType_in_entryRuleActorType522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorType532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleActorType579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleActorType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorType645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorComponentDeclaration_in_entryRuleActorComponentDeclaration682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorComponentDeclaration692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorComponentDeclaration734 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActorComponentDeclaration751 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_ruleActorType_in_ruleActorComponentDeclaration772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDefinition_in_entryRuleDataTypeDefinition808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDefinition818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeDefinition870 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataTypeDefinition887 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataTypeDefinition899 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDataComponentDeclaration_in_ruleDataTypeDefinition920 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeDefinition955 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataTypeDefinition972 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataTypeDefinition984 = new BitSet(new long[]{0x0000000001EC0010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataTypeDefinition1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDataType1100 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_19_in_ruleDataType1129 = new BitSet(new long[]{0x000000001E100002L});
    public static final BitSet FOLLOW_20_in_ruleDataType1142 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleDataTypeSymbolDefinitionSet_in_ruleDataType1163 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_21_in_ruleDataType1194 = new BitSet(new long[]{0x000000001E100002L});
    public static final BitSet FOLLOW_20_in_ruleDataType1207 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_ruleDataTypeNumberDefinitionSet_in_ruleDataType1228 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_22_in_ruleDataType1259 = new BitSet(new long[]{0x000000001E100002L});
    public static final BitSet FOLLOW_20_in_ruleDataType1272 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleDataTypeTextDefinitionSet_in_ruleDataType1293 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_23_in_ruleDataType1324 = new BitSet(new long[]{0x000000001E100002L});
    public static final BitSet FOLLOW_20_in_ruleDataType1337 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_ruleDataTypeTimeDefinitionSet_in_ruleDataType1358 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_24_in_ruleDataType1389 = new BitSet(new long[]{0x000000001E100002L});
    public static final BitSet FOLLOW_20_in_ruleDataType1402 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleDataTypeIdentifierDefinitionSet_in_ruleDataType1423 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1462 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_25_in_ruleDataType1499 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_26_in_ruleDataType1537 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_27_in_ruleDataType1575 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_28_in_ruleDataType1613 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleDataTypeSymbolDefinitionSet_in_entryRuleDataTypeSymbolDefinitionSet1652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeSymbolDefinitionSet1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDataTypeSymbolDefinitionSet1699 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleDataTypeSymbolDefinitionSetElement_in_ruleDataTypeSymbolDefinitionSet1720 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_ruleDataTypeSymbolDefinitionSet1733 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleDataTypeSymbolDefinitionSetElement_in_ruleDataTypeSymbolDefinitionSet1754 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_ruleDataTypeSymbolDefinitionSet1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeSymbolDefinitionSetElement_in_entryRuleDataTypeSymbolDefinitionSetElement1804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeSymbolDefinitionSetElement1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDataTypeSymbolDefinitionSetElement1860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeSymbolDefinitionSetElement1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeNumberDefinitionSet_in_entryRuleDataTypeNumberDefinitionSet1918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeNumberDefinitionSet1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDataTypeNumberDefinitionSet1975 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet1996 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_ruleDataTypeNumberDefinitionSet2009 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet2030 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_ruleDataTypeNumberDefinitionSet2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDataTypeNumberDefinitionSet2073 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet2094 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDataTypeNumberDefinitionSet2106 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet2127 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDataTypeNumberDefinitionSet2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeTextDefinitionSet_in_entryRuleDataTypeTextDefinitionSet2176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeTextDefinitionSet2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDataTypeTextDefinitionSet2232 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralText_in_ruleDataTypeTextDefinitionSet2253 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_ruleDataTypeTextDefinitionSet2266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralText_in_ruleDataTypeTextDefinitionSet2287 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_ruleDataTypeTextDefinitionSet2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeTimeDefinitionSet_in_entryRuleDataTypeTimeDefinitionSet2337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeTimeDefinitionSet2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDataTypeTimeDefinitionSet2394 = new BitSet(new long[]{0x0000000000000040L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2415 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_ruleDataTypeTimeDefinitionSet2428 = new BitSet(new long[]{0x0000000000000040L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2449 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_ruleDataTypeTimeDefinitionSet2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDataTypeTimeDefinitionSet2492 = new BitSet(new long[]{0x0000000000000040L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2513 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDataTypeTimeDefinitionSet2525 = new BitSet(new long[]{0x0000000000000040L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2546 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDataTypeTimeDefinitionSet2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeIdentifierDefinitionSet_in_entryRuleDataTypeIdentifierDefinitionSet2595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeIdentifierDefinitionSet2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDataTypeIdentifierDefinitionSet2651 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataTypeIdentifierDefinitionSet2672 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_ruleDataTypeIdentifierDefinitionSet2685 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataTypeIdentifierDefinitionSet2706 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_ruleDataTypeIdentifierDefinitionSet2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataComponentDeclaration_in_entryRuleDataComponentDeclaration2756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataComponentDeclaration2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataComponentDeclaration2808 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataComponentDeclaration2825 = new BitSet(new long[]{0x0000000001EC0010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataComponentDeclaration2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorTypeDefinition_in_entryRuleInteractorTypeDefinition2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorTypeDefinition2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorTypeDefinition2934 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInteractorTypeDefinition2951 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInteractorTypeDefinition2963 = new BitSet(new long[]{0x0028000000000012L});
    public static final BitSet FOLLOW_ruleInteractorActorDeclaration_in_ruleInteractorTypeDefinition2985 = new BitSet(new long[]{0x0028000000000012L});
    public static final BitSet FOLLOW_ruleInteractorDataDeclaration_in_ruleInteractorTypeDefinition3012 = new BitSet(new long[]{0x0028000000000012L});
    public static final BitSet FOLLOW_ruleInteractorComponentDeclaration_in_ruleInteractorTypeDefinition3039 = new BitSet(new long[]{0x0028000000000012L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorDeclaration_in_ruleInteractorTypeDefinition3066 = new BitSet(new long[]{0x0028000000000012L});
    public static final BitSet FOLLOW_ruleInteractorType_in_entryRuleInteractorType3104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorType3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorType3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorActorDeclaration_in_entryRuleInteractorActorDeclaration3204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorActorDeclaration3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorActorDeclaration3266 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInteractorActorDeclaration3283 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_ruleActorType_in_ruleInteractorActorDeclaration3304 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInteractorActorDeclaration3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorComponentDeclaration_in_entryRuleInteractorComponentDeclaration3353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorComponentDeclaration3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorComponentDeclaration3415 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInteractorComponentDeclaration3432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorType_in_ruleInteractorComponentDeclaration3453 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInteractorComponentDeclaration3465 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleInteractorComponentDeclaration3478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorActorAlias_in_ruleInteractorComponentDeclaration3499 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleInteractorDataDeclaration_in_entryRuleInteractorDataDeclaration3538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorDataDeclaration3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorDataDeclaration3601 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInteractorDataDeclaration3618 = new BitSet(new long[]{0x0000000001EC0010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleInteractorDataDeclaration3639 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleInteractorDataDeclaration3651 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_ruleInteractorDataDeclaration3664 = new BitSet(new long[]{0x0003F80000000010L});
    public static final BitSet FOLLOW_ruleInteractorDataAlias_in_ruleInteractorDataDeclaration3685 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleInteractorDataDeclaration3700 = new BitSet(new long[]{0x0003F80000000010L});
    public static final BitSet FOLLOW_ruleInteractorDataAlias_in_ruleInteractorDataDeclaration3721 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorDataDeclaration3759 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInteractorDataDeclaration3776 = new BitSet(new long[]{0x0000000001EC0010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleInteractorDataDeclaration3797 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleInteractorDataDeclaration3809 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_ruleInteractorDataDeclaration3822 = new BitSet(new long[]{0x0003F80000000010L});
    public static final BitSet FOLLOW_ruleInteractorDataAlias_in_ruleInteractorDataDeclaration3843 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleInteractorDataDeclaration3858 = new BitSet(new long[]{0x0003F80000000010L});
    public static final BitSet FOLLOW_ruleInteractorDataAlias_in_ruleInteractorDataDeclaration3879 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorDataDeclaration3917 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInteractorDataDeclaration3934 = new BitSet(new long[]{0x0000000001EC0010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleInteractorDataDeclaration3955 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleInteractorDataDeclaration3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorActorAlias_in_entryRuleInteractorActorAlias4005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorActorAlias4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorActorAlias4060 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleInteractorActorAlias4072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorActorAlias4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorDataAlias_in_entryRuleInteractorDataAlias4128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorDataAlias4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorEntity_in_ruleInteractorDataAlias4184 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleInteractorDataAlias4197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorDataAlias4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorEntity_in_entryRuleInteractorEntity4255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorEntity4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInteractorEntity4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInteractorEntity4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleInteractorEntity4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleInteractorEntity4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleInteractorEntity4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleInteractorEntity4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleInteractorEntity4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorEntity4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorDataReception_in_entryRuleInteractorDataReception4560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorDataReception4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorDataReception4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorDataReception4663 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleInteractorDataReception4675 = new BitSet(new long[]{0x0003F80000000010L});
    public static final BitSet FOLLOW_ruleInteractorDataAlias_in_ruleInteractorDataReception4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleInteractorDataReception4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorDataEmission_in_entryRuleInteractorDataEmission4763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorDataEmission4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorDataEmission4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorDataEmission4866 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleInteractorDataEmission4878 = new BitSet(new long[]{0x0003F80000000010L});
    public static final BitSet FOLLOW_ruleInteractorDataAlias_in_ruleInteractorDataEmission4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorDeclaration_in_entryRuleInteractorBehaviorDeclaration4937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorDeclaration4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorCause_in_ruleInteractorBehaviorDeclaration5002 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInteractorBehaviorDeclaration5014 = new BitSet(new long[]{0x0140000004000000L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorEffect_in_ruleInteractorBehaviorDeclaration5035 = new BitSet(new long[]{0x0140000004000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorCause_in_entryRuleInteractorBehaviorCause5072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorCause5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleInteractorBehaviorCause5129 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleInteractorDataReception_in_ruleInteractorBehaviorCause5150 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInteractorBehaviorCause5163 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorCause5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInteractorBehaviorCause5215 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorCause5236 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInteractorBehaviorCause5249 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorCause5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorEffect_in_entryRuleInteractorBehaviorEffect5309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorEffect5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInteractorBehaviorEffect5367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorDataEmission_in_ruleInteractorBehaviorEffect5388 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleInteractorBehaviorEffect5400 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorEffect5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleInteractorBehaviorEffect5452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorDataEmission_in_ruleInteractorBehaviorEffect5473 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleInteractorBehaviorEffect5485 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorEffect5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInteractorBehaviorEffect5537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorDataEmission_in_ruleInteractorBehaviorEffect5558 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleInteractorBehaviorEffect5570 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorEffect5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOr_in_ruleExpression5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOr_in_entryRuleExpressionOr5719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOr5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAnd_in_ruleExpressionOr5776 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOrOp_in_ruleExpressionOr5825 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionAnd_in_ruleExpressionOr5848 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOrOp_in_entryRuleExpressionOrOp5887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOrOp5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleExpressionOrOp5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAnd_in_entryRuleExpressionAnd5974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAnd5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEquality_in_ruleExpressionAnd6031 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAndOp_in_ruleExpressionAnd6080 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionEquality_in_ruleExpressionAnd6103 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAndOp_in_entryRuleExpressionAndOp6142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAndOp6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleExpressionAndOp6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEquality_in_entryRuleExpressionEquality6229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionEquality6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCompare_in_ruleExpressionEquality6286 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEqualityOp_in_ruleExpressionEquality6335 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionCompare_in_ruleExpressionEquality6358 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEqualityOp_in_entryRuleExpressionEqualityOp6397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionEqualityOp6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleExpressionEqualityOp6446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleExpressionEqualityOp6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCompare_in_entryRuleExpressionCompare6505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionCompare6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOther_in_ruleExpressionCompare6562 = new BitSet(new long[]{0xE000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpressionCompareOp_in_ruleExpressionCompare6611 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionOther_in_ruleExpressionCompare6634 = new BitSet(new long[]{0xE000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpressionCompareOp_in_entryRuleExpressionCompareOp6673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionCompareOp6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleExpressionCompareOp6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleExpressionCompareOp6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleExpressionCompareOp6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleExpressionCompareOp6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOther_in_entryRuleExpressionOther6819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOther6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAddition_in_ruleExpressionOther6876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleExpressionOtherOp_in_ruleExpressionOther6925 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionAddition_in_ruleExpressionOther6948 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleExpressionOtherOp_in_entryRuleExpressionOtherOp6987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOtherOp6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleExpressionOtherOp7036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleExpressionOtherOp7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAddition_in_entryRuleExpressionAddition7095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAddition7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMultiplication_in_ruleExpressionAddition7152 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleExpressionAdditionOp_in_ruleExpressionAddition7201 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionMultiplication_in_ruleExpressionAddition7224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleExpressionAdditionOp_in_entryRuleExpressionAdditionOp7263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAdditionOp7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleExpressionAdditionOp7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleExpressionAdditionOp7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMultiplication_in_entryRuleExpressionMultiplication7371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionMultiplication7381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionUnary_in_ruleExpressionMultiplication7428 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleExpressionMultiplicationOp_in_ruleExpressionMultiplication7477 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionUnary_in_ruleExpressionMultiplication7500 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleExpressionMultiplicationOp_in_entryRuleExpressionMultiplicationOp7539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionMultiplicationOp7550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleExpressionMultiplicationOp7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleExpressionMultiplicationOp7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleExpressionMultiplicationOp7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionUnary_in_entryRuleExpressionUnary7666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionUnary7676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionUnaryOp_in_ruleExpressionUnary7732 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpressionPrimary_in_ruleExpressionUnary7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionPrimary_in_ruleExpressionUnary7782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionUnaryOp_in_entryRuleExpressionUnaryOp7818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionUnaryOp7829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleExpressionUnaryOp7867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleExpressionUnaryOp7886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleExpressionUnaryOp7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionPrimary_in_entryRuleExpressionPrimary7945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionPrimary7955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionSwitch_in_ruleExpressionPrimary8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionIf_in_ruleExpressionPrimary8029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteral_in_ruleExpressionPrimary8056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionForEach_in_ruleExpressionPrimary8083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFunctionCall_in_ruleExpressionPrimary8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionParenthesized_in_ruleExpressionPrimary8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteral_in_entryRuleExpressionLiteral8172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionLiteral8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralCollection_in_ruleExpressionLiteral8229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_ruleExpressionLiteral8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleExpressionLiteral8283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNull_in_ruleExpressionLiteral8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralText_in_ruleExpressionLiteral8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_ruleExpressionLiteral8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralEnum_in_ruleExpressionLiteral8391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorDataReception_in_ruleExpressionLiteral8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralCollection_in_entryRuleExpressionLiteralCollection8453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionLiteralCollection8463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralSet_in_ruleExpressionLiteralCollection8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralList_in_ruleExpressionLiteralCollection8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralSet_in_entryRuleExpressionLiteralSet8572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionLiteralSet8582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleExpressionLiteralSet8628 = new BitSet(new long[]{0x00140003A0000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionLiteralSet8650 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_ruleExpressionLiteralSet8663 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionLiteralSet8684 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_ruleExpressionLiteralSet8700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralList_in_entryRuleExpressionLiteralList8736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionLiteralList8746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleExpressionLiteralList8792 = new BitSet(new long[]{0x0014000720000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionLiteralList8814 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_30_in_ruleExpressionLiteralList8827 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionLiteralList8848 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_34_in_ruleExpressionLiteralList8864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionParenthesized_in_entryRuleExpressionParenthesized8900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionParenthesized8910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleExpressionParenthesized8947 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionParenthesized8969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleExpressionParenthesized8980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionIf_in_entryRuleExpressionIf9016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionIf9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExpressionIf9072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleExpressionIf9084 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionIf9105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleExpressionIf9125 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionIf9147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleExpressionIf9168 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionIf9190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionSwitch_in_entryRuleExpressionSwitch9227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionSwitch9237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleExpressionSwitch9283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleExpressionSwitch9295 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSwitch9316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleExpressionSwitch9336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleExpressionCase_in_ruleExpressionSwitch9368 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleExpressionSwitch9390 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExpressionSwitch9403 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSwitch9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCase_in_entryRuleExpressionCase9462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionCase9472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleExpressionCase9509 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionCase9530 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExpressionCase9542 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionCase9563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionForEach_in_entryRuleExpressionForEach9599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionForEach9609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleExpressionForEach9655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleExpressionForEach9667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleExpressionForEach9679 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionForEach9700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleExpressionForEach9712 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionForEach9733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFunctionCall_in_entryRuleExpressionFunctionCall9769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionFunctionCall9779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFunctionCallBase_in_ruleExpressionFunctionCall9834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleExpressionFunctionCall9846 = new BitSet(new long[]{0x0014000360000070L,0x000FFFFFFFFE9718L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionFunctionCall9867 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_30_in_ruleExpressionFunctionCall9881 = new BitSet(new long[]{0x0014000320000070L,0x000FFFFFFFFE9318L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionFunctionCall9902 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleExpressionFunctionCall9916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFunctionCallBase_in_entryRuleExpressionFunctionCallBase9953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionFunctionCallBase9964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleExpressionFunctionCallBase10002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleExpressionFunctionCallBase10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleExpressionFunctionCallBase10040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleExpressionFunctionCallBase10059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleExpressionFunctionCallBase10078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleExpressionFunctionCallBase10097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleExpressionFunctionCallBase10116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleExpressionFunctionCallBase10135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleExpressionFunctionCallBase10154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleExpressionFunctionCallBase10173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleExpressionFunctionCallBase10192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleExpressionFunctionCallBase10211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleExpressionFunctionCallBase10230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleExpressionFunctionCallBase10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleExpressionFunctionCallBase10268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleExpressionFunctionCallBase10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleExpressionFunctionCallBase10306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleExpressionFunctionCallBase10325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleExpressionFunctionCallBase10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleExpressionFunctionCallBase10363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleExpressionFunctionCallBase10382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleExpressionFunctionCallBase10401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleExpressionFunctionCallBase10420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleExpressionFunctionCallBase10439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleExpressionFunctionCallBase10458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleExpressionFunctionCallBase10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleExpressionFunctionCallBase10496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleExpressionFunctionCallBase10515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleExpressionFunctionCallBase10534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleExpressionFunctionCallBase10553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleExpressionFunctionCallBase10572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean10612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean10622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleLiteralBoolean10669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleLiteralBoolean10693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull10743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNull10753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleLiteralNull10799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_entryRuleLiteralNumber10835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNumber10845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralNumber10900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralText_in_entryRuleLiteralText10936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralText10946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralText10997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralEnum_in_entryRuleLiteralEnum11038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralEnum11048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleLiteralEnum11094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralEnum11114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_entryRuleLiteralTime11150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralTime11160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleLiteralTime11207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11246 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleLiteralTime11258 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11281 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleLiteralTime11293 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11317 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleLiteralTime11329 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11353 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime11365 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11389 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime11402 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime11420 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11445 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_ruleLiteralTime11458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLiteralTime11476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11518 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleLiteralTime11530 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11553 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleLiteralTime11565 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11589 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime11601 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11625 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime11638 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime11656 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11681 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_ruleLiteralTime11694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLiteralTime11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11754 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleLiteralTime11766 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11789 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime11801 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11825 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime11838 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime11856 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11881 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_ruleLiteralTime11894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLiteralTime11912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11954 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime11966 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11989 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime12002 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime12020 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime12045 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_ruleLiteralTime12058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLiteralTime12076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime12118 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime12131 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime12149 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime12173 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_ruleLiteralTime12186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLiteralTime12204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime12246 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_122_in_ruleLiteralTime12259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLiteralTime12277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12368 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleQualifiedName12396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12412 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12518 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleQualifiedNameWithWildcard12537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER12580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER12591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER12631 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleNUMBER12650 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER12665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred1_InternalLil1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred2_InternalLil1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred3_InternalLil1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred4_InternalLil1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOrOp_in_synpred5_InternalLil5795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAndOp_in_synpred6_InternalLil6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEqualityOp_in_synpred7_InternalLil6305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCompareOp_in_synpred8_InternalLil6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOtherOp_in_synpred9_InternalLil6895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAdditionOp_in_synpred10_InternalLil7171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMultiplicationOp_in_synpred11_InternalLil7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCase_in_synpred15_InternalLil9351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred16_InternalLil9382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_synpred17_InternalLil12387 = new BitSet(new long[]{0x0000000000000002L});

}
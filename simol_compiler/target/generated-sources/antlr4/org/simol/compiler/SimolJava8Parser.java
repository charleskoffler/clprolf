// Generated from org/simol/compiler/SimolJava8Parser.g4 by ANTLR 4.13.1
package org.simol.compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimolJava8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, SIMU_REAL_WORLD_OBJ=51, SIMU_COMP_WORKER=52, REAL_WORLD_OBJ=53, 
		INFORMATION=54, NATURE=55, CONTRACTS=56, COMPAT_INTERF_VERSION=57, COMPAT_INTERF_CAPACITY=58, 
		WITH_COMPAT=59, UNDERST=60, LONG_ACTION=61, PREVENT_MISSING_COLLISION=62, 
		ONE_AT_A_TIME=63, TOUR_MONITOR=64, FOR_EVERY_THREAD=65, DEPENDENT_ACTIVITY=66, 
		IntegerLiteral=67, FloatingPointLiteral=68, BooleanLiteral=69, CharacterLiteral=70, 
		StringLiteral=71, NullLiteral=72, LPAREN=73, RPAREN=74, LBRACE=75, RBRACE=76, 
		LBRACK=77, RBRACK=78, SEMI=79, COMMA=80, DOT=81, ASSIGN=82, GT=83, LT=84, 
		BANG=85, TILDE=86, QUESTION=87, COLON=88, EQUAL=89, LE=90, GE=91, NOTEQUAL=92, 
		AND=93, OR=94, INC=95, DEC=96, ADD=97, SUB=98, MUL=99, DIV=100, BITAND=101, 
		BITOR=102, CARET=103, MOD=104, ARROW=105, COLONCOLON=106, ADD_ASSIGN=107, 
		SUB_ASSIGN=108, MUL_ASSIGN=109, DIV_ASSIGN=110, AND_ASSIGN=111, OR_ASSIGN=112, 
		XOR_ASSIGN=113, MOD_ASSIGN=114, LSHIFT_ASSIGN=115, RSHIFT_ASSIGN=116, 
		URSHIFT_ASSIGN=117, Identifier=118, AT=119, ELLIPSIS=120, WS=121, COMMENT=122, 
		LINE_COMMENT=123;
	public static final int
		RULE_literal = 0, RULE_primitiveType = 1, RULE_numericType = 2, RULE_integralType = 3, 
		RULE_floatingPointType = 4, RULE_referenceType = 5, RULE_classOrInterfaceType = 6, 
		RULE_classType = 7, RULE_classType_lf_classOrInterfaceType = 8, RULE_classType_lfno_classOrInterfaceType = 9, 
		RULE_interfaceType = 10, RULE_interfaceType_lf_classOrInterfaceType = 11, 
		RULE_interfaceType_lfno_classOrInterfaceType = 12, RULE_typeVariable = 13, 
		RULE_arrayType = 14, RULE_dims = 15, RULE_typeParameter = 16, RULE_typeParameterModifier = 17, 
		RULE_typeBound = 18, RULE_additionalBound = 19, RULE_typeArguments = 20, 
		RULE_typeArgumentList = 21, RULE_typeArgument = 22, RULE_wildcard = 23, 
		RULE_wildcardBounds = 24, RULE_packageName = 25, RULE_typeName = 26, RULE_packageOrTypeName = 27, 
		RULE_expressionName = 28, RULE_methodName = 29, RULE_ambiguousName = 30, 
		RULE_compilationUnit = 31, RULE_packageDeclaration = 32, RULE_packageModifier = 33, 
		RULE_importDeclaration = 34, RULE_singleTypeImportDeclaration = 35, RULE_typeImportOnDemandDeclaration = 36, 
		RULE_singleStaticImportDeclaration = 37, RULE_staticImportOnDemandDeclaration = 38, 
		RULE_typeDeclaration = 39, RULE_classDeclaration = 40, RULE_normalClassDeclaration = 41, 
		RULE_simolRole = 42, RULE_classModifier = 43, RULE_typeParameters = 44, 
		RULE_typeParameterList = 45, RULE_superclass = 46, RULE_superinterfaces = 47, 
		RULE_interfaceTypeList = 48, RULE_classBody = 49, RULE_classBodyDeclaration = 50, 
		RULE_classMemberDeclaration = 51, RULE_fieldDeclaration = 52, RULE_fieldModifier = 53, 
		RULE_variableDeclaratorList = 54, RULE_variableDeclarator = 55, RULE_variableDeclaratorId = 56, 
		RULE_variableInitializer = 57, RULE_unannType = 58, RULE_unannPrimitiveType = 59, 
		RULE_unannReferenceType = 60, RULE_unannClassOrInterfaceType = 61, RULE_unannClassType = 62, 
		RULE_unannClassType_lf_unannClassOrInterfaceType = 63, RULE_unannClassType_lfno_unannClassOrInterfaceType = 64, 
		RULE_unannInterfaceType = 65, RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 66, 
		RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 67, RULE_unannTypeVariable = 68, 
		RULE_unannArrayType = 69, RULE_methodDeclaration = 70, RULE_methodModifier = 71, 
		RULE_methodHeader = 72, RULE_result = 73, RULE_methodDeclarator = 74, 
		RULE_formalParameterList = 75, RULE_formalParameters = 76, RULE_formalParameter = 77, 
		RULE_variableModifier = 78, RULE_lastFormalParameter = 79, RULE_receiverParameter = 80, 
		RULE_throws_ = 81, RULE_exceptionTypeList = 82, RULE_exceptionType = 83, 
		RULE_methodBody = 84, RULE_instanceInitializer = 85, RULE_staticInitializer = 86, 
		RULE_constructorDeclaration = 87, RULE_constructorModifier = 88, RULE_constructorDeclarator = 89, 
		RULE_simpleTypeName = 90, RULE_constructorBody = 91, RULE_explicitConstructorInvocation = 92, 
		RULE_enumDeclaration = 93, RULE_enumBody = 94, RULE_enumConstantList = 95, 
		RULE_enumConstant = 96, RULE_enumConstantModifier = 97, RULE_enumBodyDeclarations = 98, 
		RULE_interfaceDeclaration = 99, RULE_normalInterfaceDeclaration = 100, 
		RULE_simolInterfaceRole = 101, RULE_interfaceModifier = 102, RULE_extendsInterfaces = 103, 
		RULE_interfaceBody = 104, RULE_interfaceMemberDeclaration = 105, RULE_constantDeclaration = 106, 
		RULE_constantModifier = 107, RULE_interfaceMethodDeclaration = 108, RULE_interfaceMethodModifier = 109, 
		RULE_annotationTypeDeclaration = 110, RULE_annotationTypeBody = 111, RULE_annotationTypeMemberDeclaration = 112, 
		RULE_annotationTypeElementDeclaration = 113, RULE_annotationTypeElementModifier = 114, 
		RULE_defaultValue = 115, RULE_annotation = 116, RULE_normalAnnotation = 117, 
		RULE_elementValuePairList = 118, RULE_elementValuePair = 119, RULE_elementValue = 120, 
		RULE_elementValueArrayInitializer = 121, RULE_elementValueList = 122, 
		RULE_markerAnnotation = 123, RULE_singleElementAnnotation = 124, RULE_arrayInitializer = 125, 
		RULE_variableInitializerList = 126, RULE_block = 127, RULE_blockStatements = 128, 
		RULE_blockStatement = 129, RULE_localVariableDeclarationStatement = 130, 
		RULE_localVariableDeclaration = 131, RULE_statement = 132, RULE_statementNoShortIf = 133, 
		RULE_statementWithoutTrailingSubstatement = 134, RULE_emptyStatement_ = 135, 
		RULE_labeledStatement = 136, RULE_labeledStatementNoShortIf = 137, RULE_expressionStatement = 138, 
		RULE_statementExpression = 139, RULE_ifThenStatement = 140, RULE_ifThenElseStatement = 141, 
		RULE_ifThenElseStatementNoShortIf = 142, RULE_assertStatement = 143, RULE_switchStatement = 144, 
		RULE_switchBlock = 145, RULE_switchBlockStatementGroup = 146, RULE_switchLabels = 147, 
		RULE_switchLabel = 148, RULE_enumConstantName = 149, RULE_whileStatement = 150, 
		RULE_whileStatementNoShortIf = 151, RULE_doStatement = 152, RULE_forStatement = 153, 
		RULE_forStatementNoShortIf = 154, RULE_basicForStatement = 155, RULE_basicForStatementNoShortIf = 156, 
		RULE_forInit = 157, RULE_forUpdate = 158, RULE_statementExpressionList = 159, 
		RULE_enhancedForStatement = 160, RULE_enhancedForStatementNoShortIf = 161, 
		RULE_breakStatement = 162, RULE_continueStatement = 163, RULE_returnStatement = 164, 
		RULE_throwStatement = 165, RULE_synchronizedStatement = 166, RULE_tryStatement = 167, 
		RULE_catches = 168, RULE_catchClause = 169, RULE_catchFormalParameter = 170, 
		RULE_catchType = 171, RULE_finally_ = 172, RULE_tryWithResourcesStatement = 173, 
		RULE_resourceSpecification = 174, RULE_resourceList = 175, RULE_resource = 176, 
		RULE_primary = 177, RULE_primaryNoNewArray = 178, RULE_primaryNoNewArray_lf_arrayAccess = 179, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 180, RULE_primaryNoNewArray_lf_primary = 181, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 182, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 183, 
		RULE_primaryNoNewArray_lfno_primary = 184, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 185, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 186, 
		RULE_classInstanceCreationExpression = 187, RULE_classInstanceCreationExpression_lf_primary = 188, 
		RULE_classInstanceCreationExpression_lfno_primary = 189, RULE_typeArgumentsOrDiamond = 190, 
		RULE_fieldAccess = 191, RULE_fieldAccess_lf_primary = 192, RULE_fieldAccess_lfno_primary = 193, 
		RULE_arrayAccess = 194, RULE_arrayAccess_lf_primary = 195, RULE_arrayAccess_lfno_primary = 196, 
		RULE_methodInvocation = 197, RULE_methodInvocation_lf_primary = 198, RULE_methodInvocation_lfno_primary = 199, 
		RULE_argumentList = 200, RULE_methodReference = 201, RULE_methodReference_lf_primary = 202, 
		RULE_methodReference_lfno_primary = 203, RULE_arrayCreationExpression = 204, 
		RULE_dimExprs = 205, RULE_dimExpr = 206, RULE_constantExpression = 207, 
		RULE_expression = 208, RULE_lambdaExpression = 209, RULE_lambdaParameters = 210, 
		RULE_inferredFormalParameterList = 211, RULE_lambdaBody = 212, RULE_assignmentExpression = 213, 
		RULE_assignment = 214, RULE_leftHandSide = 215, RULE_assignmentOperator = 216, 
		RULE_conditionalExpression = 217, RULE_conditionalOrExpression = 218, 
		RULE_conditionalAndExpression = 219, RULE_inclusiveOrExpression = 220, 
		RULE_exclusiveOrExpression = 221, RULE_andExpression = 222, RULE_equalityExpression = 223, 
		RULE_relationalExpression = 224, RULE_shiftExpression = 225, RULE_additiveExpression = 226, 
		RULE_multiplicativeExpression = 227, RULE_unaryExpression = 228, RULE_preIncrementExpression = 229, 
		RULE_preDecrementExpression = 230, RULE_unaryExpressionNotPlusMinus = 231, 
		RULE_postfixExpression = 232, RULE_postIncrementExpression = 233, RULE_postIncrementExpression_lf_postfixExpression = 234, 
		RULE_postDecrementExpression = 235, RULE_postDecrementExpression_lf_postfixExpression = 236, 
		RULE_castExpression = 237;
	private static String[] makeRuleNames() {
		return new String[] {
			"literal", "primitiveType", "numericType", "integralType", "floatingPointType", 
			"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
			"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
			"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
			"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
			"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
			"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", 
			"ambiguousName", "compilationUnit", "packageDeclaration", "packageModifier", 
			"importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration", 
			"singleStaticImportDeclaration", "staticImportOnDemandDeclaration", "typeDeclaration", 
			"classDeclaration", "normalClassDeclaration", "simolRole", "classModifier", 
			"typeParameters", "typeParameterList", "superclass", "superinterfaces", 
			"interfaceTypeList", "classBody", "classBodyDeclaration", "classMemberDeclaration", 
			"fieldDeclaration", "fieldModifier", "variableDeclaratorList", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "unannType", "unannPrimitiveType", 
			"unannReferenceType", "unannClassOrInterfaceType", "unannClassType", 
			"unannClassType_lf_unannClassOrInterfaceType", "unannClassType_lfno_unannClassOrInterfaceType", 
			"unannInterfaceType", "unannInterfaceType_lf_unannClassOrInterfaceType", 
			"unannInterfaceType_lfno_unannClassOrInterfaceType", "unannTypeVariable", 
			"unannArrayType", "methodDeclaration", "methodModifier", "methodHeader", 
			"result", "methodDeclarator", "formalParameterList", "formalParameters", 
			"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
			"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
			"staticInitializer", "constructorDeclaration", "constructorModifier", 
			"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
			"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
			"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
			"simolInterfaceRole", "interfaceModifier", "extendsInterfaces", "interfaceBody", 
			"interfaceMemberDeclaration", "constantDeclaration", "constantModifier", 
			"interfaceMethodDeclaration", "interfaceMethodModifier", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
			"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
			"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
			"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
			"variableInitializerList", "block", "blockStatements", "blockStatement", 
			"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
			"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement_", 
			"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
			"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
			"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
			"switchLabels", "switchLabel", "enumConstantName", "whileStatement", 
			"whileStatementNoShortIf", "doStatement", "forStatement", "forStatementNoShortIf", 
			"basicForStatement", "basicForStatementNoShortIf", "forInit", "forUpdate", 
			"statementExpressionList", "enhancedForStatement", "enhancedForStatementNoShortIf", 
			"breakStatement", "continueStatement", "returnStatement", "throwStatement", 
			"synchronizedStatement", "tryStatement", "catches", "catchClause", "catchFormalParameter", 
			"catchType", "finally_", "tryWithResourcesStatement", "resourceSpecification", 
			"resourceList", "resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
			"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
			"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
			"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
			"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
			"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
			"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
			"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", 
			"methodInvocation", "methodInvocation_lf_primary", "methodInvocation_lfno_primary", 
			"argumentList", "methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
			"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
			"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
			"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
			"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
			"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
			"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
			"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
			"postDecrementExpression_lf_postfixExpression", "castExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'simu_real_world_obj'", 
			"'simu_comp_worker'", "'real_world_obj'", "'information'", "'nature'", 
			"'contracts'", "'compat_interf_version'", "'compat_interf_capacity'", 
			"'with_compat'", "'underst'", "'long_action'", "'prevent_missing_collision'", 
			"'one_at_a_time'", "'tour_monitor'", "'for_every_thread'", "'dependent_activity'", 
			null, null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
			"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
			"'>>='", "'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "SIMU_REAL_WORLD_OBJ", 
			"SIMU_COMP_WORKER", "REAL_WORLD_OBJ", "INFORMATION", "NATURE", "CONTRACTS", 
			"COMPAT_INTERF_VERSION", "COMPAT_INTERF_CAPACITY", "WITH_COMPAT", "UNDERST", 
			"LONG_ACTION", "PREVENT_MISSING_COLLISION", "ONE_AT_A_TIME", "TOUR_MONITOR", 
			"FOR_EVERY_THREAD", "DEPENDENT_ACTIVITY", "IntegerLiteral", "FloatingPointLiteral", 
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"Identifier", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SimolJava8Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimolJava8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(SimolJava8Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(SimolJava8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(SimolJava8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(SimolJava8Parser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SimolJava8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(SimolJava8Parser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(SimolJava8Parser.BOOLEAN, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primitiveType);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(478);
					annotation();
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(484);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(485);
					annotation();
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(491);
				match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericType);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(SimolJava8Parser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(SimolJava8Parser.SHORT, 0); }
		public TerminalNode INT() { return getToken(SimolJava8Parser.INT, 0); }
		public TerminalNode LONG() { return getToken(SimolJava8Parser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(SimolJava8Parser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 138110042400L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SimolJava8Parser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(SimolJava8Parser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_referenceType);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(507);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(508);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(511);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(512);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classType);
		int _la;
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(518);
					annotation();
					}
					}
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(524);
				match(Identifier);
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(525);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				classOrInterfaceType();
				setState(529);
				match(DOT);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(530);
					annotation();
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
				match(Identifier);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(537);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(DOT);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(543);
				annotation();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			match(Identifier);
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(550);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitClassType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(553);
				annotation();
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
			match(Identifier);
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(560);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInterfaceType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInterfaceType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(569);
				annotation();
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				primitiveType();
				setState(578);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				classOrInterfaceType();
				setState(581);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				typeVariable();
				setState(584);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(SimolJava8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimolJava8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimolJava8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimolJava8Parser.RBRACK, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(588);
				annotation();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			match(LBRACK);
			setState(595);
			match(RBRACK);
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(596);
						annotation();
						}
						}
						setState(601);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(602);
					match(LBRACK);
					setState(603);
					match(RBRACK);
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(609);
				typeParameterModifier();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615);
			match(Identifier);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(616);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeParameterModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoundContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(SimolJava8Parser.EXTENDS, 0); }
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeBound);
		int _la;
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(EXTENDS);
				setState(622);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(EXTENDS);
				setState(624);
				classOrInterfaceType();
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(625);
					additionalBound();
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditionalBoundContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(SimolJava8Parser.BITAND, 0); }
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAdditionalBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAdditionalBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(BITAND);
			setState(634);
			interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SimolJava8Parser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(SimolJava8Parser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(LT);
			setState(637);
			typeArgumentList();
			setState(638);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			typeArgument();
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(641);
				match(COMMA);
				setState(642);
				typeArgument();
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgument);
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(SimolJava8Parser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(652);
				annotation();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(658);
			match(QUESTION);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(659);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WildcardBoundsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(SimolJava8Parser.EXTENDS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(SimolJava8Parser.SUPER, 0); }
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcardBounds);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(EXTENDS);
				setState(663);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				match(SUPER);
				setState(665);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(669);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(671);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(672);
					match(DOT);
					setState(673);
					match(Identifier);
					}
					} 
				}
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeName);
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				packageOrTypeName(0);
				setState(681);
				match(DOT);
				setState(682);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(687);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(689);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(690);
					match(DOT);
					setState(691);
					match(Identifier);
					}
					} 
				}
				setState(696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionName);
		try {
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				ambiguousName(0);
				setState(699);
				match(DOT);
				setState(700);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAmbiguousName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(707);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(709);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(710);
					match(DOT);
					setState(711);
					match(Identifier);
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimolJava8Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(717);
				packageDeclaration();
				}
				break;
			}
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(720);
				importDeclaration();
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 466123446196436994L) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(726);
				typeDeclaration();
				}
				}
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(732);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(SimolJava8Parser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(734);
				packageModifier();
				}
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(740);
			match(PACKAGE);
			setState(741);
			packageName(0);
			setState(742);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPackageModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPackageModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_importDeclaration);
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(748);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(749);
				staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(SimolJava8Parser.IMPORT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSingleTypeImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSingleTypeImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(IMPORT);
			setState(753);
			typeName();
			setState(754);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(SimolJava8Parser.IMPORT, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TerminalNode MUL() { return getToken(SimolJava8Parser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(IMPORT);
			setState(757);
			packageOrTypeName(0);
			setState(758);
			match(DOT);
			setState(759);
			match(MUL);
			setState(760);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(SimolJava8Parser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(SimolJava8Parser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSingleStaticImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSingleStaticImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(IMPORT);
			setState(763);
			match(STATIC);
			setState(764);
			typeName();
			setState(765);
			match(DOT);
			setState(766);
			match(Identifier);
			setState(767);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(SimolJava8Parser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(SimolJava8Parser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TerminalNode MUL() { return getToken(SimolJava8Parser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStaticImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitStaticImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(IMPORT);
			setState(770);
			match(STATIC);
			setState(771);
			typeName();
			setState(772);
			match(DOT);
			setState(773);
			match(MUL);
			setState(774);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeDeclaration);
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classDeclaration);
		try {
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public SimolRoleContext simolRole() {
			return getRuleContext(SimolRoleContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 884763525122L) != 0) || _la==AT) {
				{
				{
				setState(785);
				classModifier();
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(791);
			simolRole();
			setState(792);
			match(Identifier);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(793);
				typeParameters();
				}
			}

			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATURE) {
				{
				setState(796);
				superclass();
				}
			}

			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTRACTS) {
				{
				setState(799);
				superinterfaces();
				}
			}

			setState(802);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimolRoleContext extends ParserRuleContext {
		public TerminalNode SIMU_REAL_WORLD_OBJ() { return getToken(SimolJava8Parser.SIMU_REAL_WORLD_OBJ, 0); }
		public TerminalNode SIMU_COMP_WORKER() { return getToken(SimolJava8Parser.SIMU_COMP_WORKER, 0); }
		public TerminalNode REAL_WORLD_OBJ() { return getToken(SimolJava8Parser.REAL_WORLD_OBJ, 0); }
		public TerminalNode INFORMATION() { return getToken(SimolJava8Parser.INFORMATION, 0); }
		public SimolRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simolRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSimolRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSimolRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSimolRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimolRoleContext simolRole() throws RecognitionException {
		SimolRoleContext _localctx = new SimolRoleContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_simolRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33776997205278720L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(SimolJava8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(SimolJava8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(SimolJava8Parser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(SimolJava8Parser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(SimolJava8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(SimolJava8Parser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(SimolJava8Parser.STRICTFP, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classModifier);
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(809);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(810);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(811);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(812);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(813);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SimolJava8Parser.LT, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode GT() { return getToken(SimolJava8Parser.GT, 0); }
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(LT);
			setState(817);
			typeParameterList();
			setState(818);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			typeParameter();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(821);
				match(COMMA);
				setState(822);
				typeParameter();
				}
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode NATURE() { return getToken(SimolJava8Parser.NATURE, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(NATURE);
			setState(829);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuperinterfacesContext extends ParserRuleContext {
		public TerminalNode CONTRACTS() { return getToken(SimolJava8Parser.CONTRACTS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSuperinterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSuperinterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(CONTRACTS);
			setState(832);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			interfaceType();
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(835);
				match(COMMA);
				setState(836);
				interfaceType();
				}
				}
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimolJava8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimolJava8Parser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(LBRACE);
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -109417975201316566L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 54043195529529351L) != 0)) {
				{
				{
				setState(843);
				classBodyDeclaration();
				}
				}
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(849);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classBodyDeclaration);
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(853);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classMemberDeclaration);
		try {
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(859);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(860);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(861);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 577094406008733696L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 36028797018963971L) != 0)) {
				{
				{
				setState(864);
				fieldModifier();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(870);
			unannType();
			setState(871);
			variableDeclaratorList();
			setState(872);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(SimolJava8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(SimolJava8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(SimolJava8Parser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(SimolJava8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(SimolJava8Parser.FINAL, 0); }
		public TerminalNode TRANSIENT() { return getToken(SimolJava8Parser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(SimolJava8Parser.VOLATILE, 0); }
		public TerminalNode WITH_COMPAT() { return getToken(SimolJava8Parser.WITH_COMPAT, 0); }
		public TerminalNode TOUR_MONITOR() { return getToken(SimolJava8Parser.TOUR_MONITOR, 0); }
		public TerminalNode FOR_EVERY_THREAD() { return getToken(SimolJava8Parser.FOR_EVERY_THREAD, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldModifier);
		try {
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(877);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(878);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(879);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(880);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(881);
				match(VOLATILE);
				}
				break;
			case WITH_COMPAT:
				enterOuterAlt(_localctx, 9);
				{
				setState(882);
				match(WITH_COMPAT);
				}
				break;
			case TOUR_MONITOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(883);
				match(TOUR_MONITOR);
				}
				break;
			case FOR_EVERY_THREAD:
				enterOuterAlt(_localctx, 11);
				{
				setState(884);
				match(FOR_EVERY_THREAD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitVariableDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			variableDeclarator();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(888);
				match(COMMA);
				setState(889);
				variableDeclarator();
				}
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SimolJava8Parser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			variableDeclaratorId();
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(896);
				match(ASSIGN);
				setState(897);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(Identifier);
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(901);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableInitializer);
		try {
			setState(906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnannType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannType);
		try {
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				unannReferenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(SimolJava8Parser.BOOLEAN, 0); }
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnannPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannPrimitiveType);
		try {
			setState(914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(913);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnannReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannReferenceType);
		try {
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(918);
				unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(921);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(922);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(929);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(927);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(925);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(926);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnannClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnannClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannClassType);
		int _la;
		try {
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				match(Identifier);
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(933);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				unannClassOrInterfaceType();
				setState(937);
				match(DOT);
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(938);
					annotation();
					}
					}
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(944);
				match(Identifier);
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(945);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnannClassType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(DOT);
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(951);
				annotation();
				}
				}
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(957);
			match(Identifier);
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(958);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnannClassType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(Identifier);
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(962);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnannInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnannTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnannArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannArrayType);
		try {
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				unannPrimitiveType();
				setState(974);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				unannClassOrInterfaceType();
				setState(977);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(979);
				unannTypeVariable();
				setState(980);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152916220723068926L) != 0) || _la==DEPENDENT_ACTIVITY || _la==AT) {
				{
				{
				setState(984);
				methodModifier();
				}
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(990);
			methodHeader();
			setState(991);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(SimolJava8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(SimolJava8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(SimolJava8Parser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(SimolJava8Parser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(SimolJava8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(SimolJava8Parser.FINAL, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(SimolJava8Parser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(SimolJava8Parser.NATIVE, 0); }
		public TerminalNode STRICTFP() { return getToken(SimolJava8Parser.STRICTFP, 0); }
		public TerminalNode UNDERST() { return getToken(SimolJava8Parser.UNDERST, 0); }
		public TerminalNode LONG_ACTION() { return getToken(SimolJava8Parser.LONG_ACTION, 0); }
		public TerminalNode PREVENT_MISSING_COLLISION() { return getToken(SimolJava8Parser.PREVENT_MISSING_COLLISION, 0); }
		public TerminalNode ONE_AT_A_TIME() { return getToken(SimolJava8Parser.ONE_AT_A_TIME, 0); }
		public TerminalNode DEPENDENT_ACTIVITY() { return getToken(SimolJava8Parser.DEPENDENT_ACTIVITY, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodModifier);
		try {
			setState(1008);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(995);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(996);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(997);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(998);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(999);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1000);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1001);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1002);
				match(STRICTFP);
				}
				break;
			case UNDERST:
				enterOuterAlt(_localctx, 11);
				{
				setState(1003);
				match(UNDERST);
				}
				break;
			case LONG_ACTION:
				enterOuterAlt(_localctx, 12);
				{
				setState(1004);
				match(LONG_ACTION);
				}
				break;
			case PREVENT_MISSING_COLLISION:
				enterOuterAlt(_localctx, 13);
				{
				setState(1005);
				match(PREVENT_MISSING_COLLISION);
				}
				break;
			case ONE_AT_A_TIME:
				enterOuterAlt(_localctx, 14);
				{
				setState(1006);
				match(ONE_AT_A_TIME);
				}
				break;
			case DEPENDENT_ACTIVITY:
				enterOuterAlt(_localctx, 15);
				{
				setState(1007);
				match(DEPENDENT_ACTIVITY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodHeader);
		int _la;
		try {
			setState(1027);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				result();
				setState(1011);
				methodDeclarator();
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1012);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1015);
				typeParameters();
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1016);
					annotation();
					}
					}
					setState(1021);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1022);
				result();
				setState(1023);
				methodDeclarator();
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1024);
					throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimolJava8Parser.VOID, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_result);
		try {
			setState(1031);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1030);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(Identifier);
			setState(1034);
			match(LPAREN);
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460890414793000L) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1035);
				formalParameterList();
				}
			}

			setState(1038);
			match(RPAREN);
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1039);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterListContext extends ParserRuleContext {
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimolJava8Parser.COMMA, 0); }
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameterList);
		try {
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1042);
				receiverParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1043);
				formalParameters();
				setState(1044);
				match(COMMA);
				setState(1045);
				lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1047);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameters);
		try {
			int _alt;
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1050);
				formalParameter();
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1051);
						match(COMMA);
						setState(1052);
						formalParameter();
						}
						} 
					}
					setState(1057);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				receiverParameter();
				setState(1063);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1059);
						match(COMMA);
						setState(1060);
						formalParameter();
						}
						} 
					}
					setState(1065);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1068);
				variableModifier();
				}
				}
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1074);
			unannType();
			setState(1075);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(SimolJava8Parser.FINAL, 0); }
		public TerminalNode WITH_COMPAT() { return getToken(SimolJava8Parser.WITH_COMPAT, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableModifier);
		try {
			setState(1080);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1077);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				match(FINAL);
				}
				break;
			case WITH_COMPAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				match(WITH_COMPAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(SimolJava8Parser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
					{
					{
					setState(1082);
					variableModifier();
					}
					}
					setState(1087);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1088);
				unannType();
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1089);
					annotation();
					}
					}
					setState(1094);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1095);
				match(ELLIPSIS);
				setState(1096);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(SimolJava8Parser.THIS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitReceiverParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1101);
				annotation();
				}
				}
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1107);
			unannType();
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1108);
				match(Identifier);
				setState(1109);
				match(DOT);
				}
			}

			setState(1112);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Throws_Context extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(SimolJava8Parser.THROWS, 0); }
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitThrows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitThrows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(THROWS);
			setState(1115);
			exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExceptionTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitExceptionTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			exceptionType();
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1118);
				match(COMMA);
				setState(1119);
				exceptionType();
				}
				}
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExceptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exceptionType);
		try {
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1126);
				typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodBody);
		try {
			setState(1131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInstanceInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInstanceInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(SimolJava8Parser.STATIC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStaticInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitStaticInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(STATIC);
			setState(1136);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0) || _la==AT) {
				{
				{
				setState(1138);
				constructorModifier();
				}
				}
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1144);
			constructorDeclarator();
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1145);
				throws_();
				}
			}

			setState(1148);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(SimolJava8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(SimolJava8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(SimolJava8Parser.PRIVATE, 0); }
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstructorModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitConstructorModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorModifier);
		try {
			setState(1154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1152);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1153);
				match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstructorDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitConstructorDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1156);
				typeParameters();
				}
			}

			setState(1159);
			simpleTypeName();
			setState(1160);
			match(LPAREN);
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460890414793000L) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1161);
				formalParameterList();
				}
			}

			setState(1164);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSimpleTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimolJava8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimolJava8Parser.RBRACE, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(LBRACE);
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1169);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 611821040489031998L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755400246366591L) != 0)) {
				{
				setState(1172);
				blockStatements();
				}
			}

			setState(1175);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(SimolJava8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(SimolJava8Parser.SUPER, 0); }
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1177);
					typeArguments();
					}
				}

				setState(1180);
				match(THIS);
				setState(1181);
				match(LPAREN);
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(1182);
					argumentList();
					}
				}

				setState(1185);
				match(RPAREN);
				setState(1186);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1187);
					typeArguments();
					}
				}

				setState(1190);
				match(SUPER);
				setState(1191);
				match(LPAREN);
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(1192);
					argumentList();
					}
				}

				setState(1195);
				match(RPAREN);
				setState(1196);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1197);
				expressionName();
				setState(1198);
				match(DOT);
				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1199);
					typeArguments();
					}
				}

				setState(1202);
				match(SUPER);
				setState(1203);
				match(LPAREN);
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(1204);
					argumentList();
					}
				}

				setState(1207);
				match(RPAREN);
				setState(1208);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1210);
				primary();
				setState(1211);
				match(DOT);
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1212);
					typeArguments();
					}
				}

				setState(1215);
				match(SUPER);
				setState(1216);
				match(LPAREN);
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(1217);
					argumentList();
					}
				}

				setState(1220);
				match(RPAREN);
				setState(1221);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(SimolJava8Parser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 884763525122L) != 0) || _la==AT) {
				{
				{
				setState(1225);
				classModifier();
				}
				}
				setState(1230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1231);
			match(ENUM);
			setState(1232);
			match(Identifier);
			setState(1234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTRACTS) {
				{
				setState(1233);
				superinterfaces();
				}
			}

			setState(1236);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimolJava8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimolJava8Parser.RBRACE, 0); }
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimolJava8Parser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(LBRACE);
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1239);
				enumConstantList();
				}
			}

			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1242);
				match(COMMA);
				}
			}

			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1245);
				enumBodyDeclarations();
				}
			}

			setState(1248);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitEnumConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			enumConstant();
			setState(1255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1251);
					match(COMMA);
					setState(1252);
					enumConstant();
					}
					} 
				}
				setState(1257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1258);
				enumConstantModifier();
				}
				}
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1264);
			match(Identifier);
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1265);
				match(LPAREN);
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(1266);
					argumentList();
					}
				}

				setState(1269);
				match(RPAREN);
				}
			}

			setState(1273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1272);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitEnumConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			match(SEMI);
			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -109417975201316566L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 54043195529529351L) != 0)) {
				{
				{
				setState(1278);
				classBodyDeclaration();
				}
				}
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interfaceDeclaration);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1284);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
				annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public SimolInterfaceRoleContext simolInterfaceRole() {
			return getRuleContext(SimolInterfaceRoleContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitNormalInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 884763262978L) != 0) || _la==AT) {
				{
				{
				setState(1288);
				interfaceModifier();
				}
				}
				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1294);
			simolInterfaceRole();
			setState(1295);
			match(Identifier);
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1296);
				typeParameters();
				}
			}

			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1299);
				extendsInterfaces();
				}
			}

			setState(1302);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimolInterfaceRoleContext extends ParserRuleContext {
		public TerminalNode COMPAT_INTERF_VERSION() { return getToken(SimolJava8Parser.COMPAT_INTERF_VERSION, 0); }
		public TerminalNode COMPAT_INTERF_CAPACITY() { return getToken(SimolJava8Parser.COMPAT_INTERF_CAPACITY, 0); }
		public SimolInterfaceRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simolInterfaceRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSimolInterfaceRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSimolInterfaceRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSimolInterfaceRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimolInterfaceRoleContext simolInterfaceRole() throws RecognitionException {
		SimolInterfaceRoleContext _localctx = new SimolInterfaceRoleContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_simolInterfaceRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			_la = _input.LA(1);
			if ( !(_la==COMPAT_INTERF_VERSION || _la==COMPAT_INTERF_CAPACITY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(SimolJava8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(SimolJava8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(SimolJava8Parser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(SimolJava8Parser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(SimolJava8Parser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(SimolJava8Parser.STRICTFP, 0); }
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_interfaceModifier);
		try {
			setState(1313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1308);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1309);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1310);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1311);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1312);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(SimolJava8Parser.EXTENDS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExtendsInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			match(EXTENDS);
			setState(1316);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimolJava8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimolJava8Parser.RBRACE, 0); }
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			match(LBRACE);
			setState(1322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 466405059284259114L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 1649267441697L) != 0)) {
				{
				{
				setState(1319);
				interfaceMemberDeclaration();
				}
				}
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1325);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_interfaceMemberDeclaration);
		try {
			setState(1332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1327);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1329);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1330);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1331);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 309237907456L) != 0) || _la==AT) {
				{
				{
				setState(1334);
				constantModifier();
				}
				}
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1340);
			unannType();
			setState(1341);
			variableDeclaratorList();
			setState(1342);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(SimolJava8Parser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(SimolJava8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(SimolJava8Parser.FINAL, 0); }
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_constantModifier);
		try {
			setState(1348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1344);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1346);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1347);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 858993463298L) != 0) || _la==AT) {
				{
				{
				setState(1350);
				interfaceMethodModifier();
				}
				}
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1356);
			methodHeader();
			setState(1357);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(SimolJava8Parser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(SimolJava8Parser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(SimolJava8Parser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(SimolJava8Parser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(SimolJava8Parser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_interfaceMethodModifier);
		try {
			setState(1365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1359);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1361);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1362);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1363);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1364);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(SimolJava8Parser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(SimolJava8Parser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1367);
					interfaceModifier();
					}
					} 
				}
				setState(1372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1373);
			match(AT);
			setState(1374);
			match(INTERFACE);
			setState(1375);
			match(Identifier);
			setState(1376);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimolJava8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimolJava8Parser.RBRACE, 0); }
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			match(LBRACE);
			setState(1382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 466123584307544362L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 1649267441665L) != 0)) {
				{
				{
				setState(1379);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1385);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAnnotationTypeMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1388);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1389);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1390);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1391);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1394);
				annotationTypeElementModifier();
				}
				}
				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1400);
			unannType();
			setState(1401);
			match(Identifier);
			setState(1402);
			match(LPAREN);
			setState(1403);
			match(RPAREN);
			setState(1405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1404);
				dims();
				}
			}

			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1407);
				defaultValue();
				}
			}

			setState(1410);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(SimolJava8Parser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(SimolJava8Parser.ABSTRACT, 0); }
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAnnotationTypeElementModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAnnotationTypeElementModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_annotationTypeElementModifier);
		try {
			setState(1415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1412);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1413);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1414);
				match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SimolJava8Parser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			match(DEFAULT);
			setState(1418);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_annotation);
		try {
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1420);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1421);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1422);
				singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(SimolJava8Parser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitNormalAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitNormalAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			match(AT);
			setState(1426);
			typeName();
			setState(1427);
			match(LPAREN);
			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1428);
				elementValuePairList();
				}
			}

			setState(1431);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitElementValuePairList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitElementValuePairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			elementValuePair();
			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1434);
				match(COMMA);
				setState(1435);
				elementValuePair();
				}
				}
				setState(1440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(SimolJava8Parser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(Identifier);
			setState(1442);
			match(ASSIGN);
			setState(1443);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValue);
		try {
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1445);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1446);
				elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1447);
				annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimolJava8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimolJava8Parser.RBRACE, 0); }
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimolJava8Parser.COMMA, 0); }
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(LBRACE);
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374399L) != 0)) {
				{
				setState(1451);
				elementValueList();
				}
			}

			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1454);
				match(COMMA);
				}
			}

			setState(1457);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitElementValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitElementValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			elementValue();
			setState(1464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1460);
					match(COMMA);
					setState(1461);
					elementValue();
					}
					} 
				}
				setState(1466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(SimolJava8Parser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMarkerAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMarkerAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			match(AT);
			setState(1468);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(SimolJava8Parser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSingleElementAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSingleElementAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			match(AT);
			setState(1471);
			typeName();
			setState(1472);
			match(LPAREN);
			setState(1473);
			elementValue();
			setState(1474);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimolJava8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimolJava8Parser.RBRACE, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimolJava8Parser.COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			match(LBRACE);
			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374399L) != 0)) {
				{
				setState(1477);
				variableInitializerList();
				}
			}

			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1480);
				match(COMMA);
				}
			}

			setState(1483);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitVariableInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			variableInitializer();
			setState(1490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1486);
					match(COMMA);
					setState(1487);
					variableInitializer();
					}
					} 
				}
				setState(1492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimolJava8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimolJava8Parser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(LBRACE);
			setState(1495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 611821040489031998L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755400246366591L) != 0)) {
				{
				setState(1494);
				blockStatements();
				}
			}

			setState(1497);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1499);
				blockStatement();
				}
				}
				setState(1502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 611821040489031998L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755400246366591L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_blockStatement);
		try {
			setState(1507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1504);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1505);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1506);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			localVariableDeclaration();
			setState(1510);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1512);
				variableModifier();
				}
				}
				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1518);
			unannType();
			setState(1519);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_statement);
		try {
			setState(1527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1523);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1524);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1525);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1526);
				forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_statementNoShortIf);
		try {
			setState(1534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1529);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1530);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1531);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1532);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1533);
				forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1536);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537);
				emptyStatement_();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1538);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1539);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1540);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1541);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1542);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1543);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1544);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1545);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1546);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1547);
				tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEmptyStatement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEmptyStatement_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitEmptyStatement_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 270, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(SimolJava8Parser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			match(Identifier);
			setState(1553);
			match(COLON);
			setState(1554);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(SimolJava8Parser.COLON, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLabeledStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitLabeledStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			match(Identifier);
			setState(1557);
			match(COLON);
			setState(1558);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			statementExpression();
			setState(1561);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_statementExpression);
		try {
			setState(1570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1563);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1564);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1565);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1566);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1567);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1568);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1569);
				classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimolJava8Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitIfThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			match(IF);
			setState(1573);
			match(LPAREN);
			setState(1574);
			expression();
			setState(1575);
			match(RPAREN);
			setState(1576);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimolJava8Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SimolJava8Parser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitIfThenElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			match(IF);
			setState(1579);
			match(LPAREN);
			setState(1580);
			expression();
			setState(1581);
			match(RPAREN);
			setState(1582);
			statementNoShortIf();
			setState(1583);
			match(ELSE);
			setState(1584);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimolJava8Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimolJava8Parser.ELSE, 0); }
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitIfThenElseStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitIfThenElseStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(IF);
			setState(1587);
			match(LPAREN);
			setState(1588);
			expression();
			setState(1589);
			match(RPAREN);
			setState(1590);
			statementNoShortIf();
			setState(1591);
			match(ELSE);
			setState(1592);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(SimolJava8Parser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(SimolJava8Parser.COLON, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_assertStatement);
		try {
			setState(1604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594);
				match(ASSERT);
				setState(1595);
				expression();
				setState(1596);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1598);
				match(ASSERT);
				setState(1599);
				expression();
				setState(1600);
				match(COLON);
				setState(1601);
				expression();
				setState(1602);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(SimolJava8Parser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			match(SWITCH);
			setState(1607);
			match(LPAREN);
			setState(1608);
			expression();
			setState(1609);
			match(RPAREN);
			setState(1610);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimolJava8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimolJava8Parser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			match(LBRACE);
			setState(1616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1613);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1619);
				switchLabel();
				}
				}
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1625);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			switchLabels();
			setState(1628);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSwitchLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSwitchLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			switchLabel();
			setState(1634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1631);
				switchLabel();
				}
				}
				setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(SimolJava8Parser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimolJava8Parser.COLON, 0); }
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SimolJava8Parser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_switchLabel);
		try {
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1637);
				match(CASE);
				setState(1638);
				constantExpression();
				setState(1639);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1641);
				match(CASE);
				setState(1642);
				enumConstantName();
				setState(1643);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1645);
				match(DEFAULT);
				setState(1646);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SimolJava8Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			match(WHILE);
			setState(1652);
			match(LPAREN);
			setState(1653);
			expression();
			setState(1654);
			match(RPAREN);
			setState(1655);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SimolJava8Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitWhileStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitWhileStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			match(WHILE);
			setState(1658);
			match(LPAREN);
			setState(1659);
			expression();
			setState(1660);
			match(RPAREN);
			setState(1661);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(SimolJava8Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(SimolJava8Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			match(DO);
			setState(1664);
			statement();
			setState(1665);
			match(WHILE);
			setState(1666);
			match(LPAREN);
			setState(1667);
			expression();
			setState(1668);
			match(RPAREN);
			setState(1669);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_forStatement);
		try {
			setState(1673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1671);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1672);
				enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_forStatementNoShortIf);
		try {
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1675);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1676);
				enhancedForStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BasicForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SimolJava8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(SimolJava8Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SimolJava8Parser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitBasicForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitBasicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			match(FOR);
			setState(1680);
			match(LPAREN);
			setState(1682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576752263143637288L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755400246362239L) != 0)) {
				{
				setState(1681);
				forInit();
				}
			}

			setState(1684);
			match(SEMI);
			setState(1686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
				{
				setState(1685);
				expression();
				}
			}

			setState(1688);
			match(SEMI);
			setState(1690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755400246362239L) != 0)) {
				{
				setState(1689);
				forUpdate();
				}
			}

			setState(1692);
			match(RPAREN);
			setState(1693);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SimolJava8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(SimolJava8Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SimolJava8Parser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitBasicForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitBasicForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(FOR);
			setState(1696);
			match(LPAREN);
			setState(1698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576752263143637288L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755400246362239L) != 0)) {
				{
				setState(1697);
				forInit();
				}
			}

			setState(1700);
			match(SEMI);
			setState(1702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
				{
				setState(1701);
				expression();
				}
			}

			setState(1704);
			match(SEMI);
			setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755400246362239L) != 0)) {
				{
				setState(1705);
				forUpdate();
				}
			}

			setState(1708);
			match(RPAREN);
			setState(1709);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forInit);
		try {
			setState(1713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1711);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1712);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715);
			statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStatementExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitStatementExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			statementExpression();
			setState(1722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1718);
				match(COMMA);
				setState(1719);
				statementExpression();
				}
				}
				setState(1724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SimolJava8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimolJava8Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnhancedForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitEnhancedForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			match(FOR);
			setState(1726);
			match(LPAREN);
			setState(1730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1727);
				variableModifier();
				}
				}
				setState(1732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1733);
			unannType();
			setState(1734);
			variableDeclaratorId();
			setState(1735);
			match(COLON);
			setState(1736);
			expression();
			setState(1737);
			match(RPAREN);
			setState(1738);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SimolJava8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimolJava8Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnhancedForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitEnhancedForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			match(FOR);
			setState(1741);
			match(LPAREN);
			setState(1745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1742);
				variableModifier();
				}
				}
				setState(1747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1748);
			unannType();
			setState(1749);
			variableDeclaratorId();
			setState(1750);
			match(COLON);
			setState(1751);
			expression();
			setState(1752);
			match(RPAREN);
			setState(1753);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(SimolJava8Parser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			match(BREAK);
			setState(1757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1756);
				match(Identifier);
				}
			}

			setState(1759);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(SimolJava8Parser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
			match(CONTINUE);
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1762);
				match(Identifier);
				}
			}

			setState(1765);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SimolJava8Parser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			match(RETURN);
			setState(1769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
				{
				setState(1768);
				expression();
				}
			}

			setState(1771);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(SimolJava8Parser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			match(THROW);
			setState(1774);
			expression();
			setState(1775);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(SimolJava8Parser.SYNCHRONIZED, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			match(SYNCHRONIZED);
			setState(1778);
			match(LPAREN);
			setState(1779);
			expression();
			setState(1780);
			match(RPAREN);
			setState(1781);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(SimolJava8Parser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_tryStatement);
		int _la;
		try {
			setState(1795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1783);
				match(TRY);
				setState(1784);
				block();
				setState(1785);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1787);
				match(TRY);
				setState(1788);
				block();
				setState(1790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1789);
					catches();
					}
				}

				setState(1792);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1794);
				tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			catchClause();
			setState(1801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1798);
				catchClause();
				}
				}
				setState(1803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(SimolJava8Parser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			match(CATCH);
			setState(1805);
			match(LPAREN);
			setState(1806);
			catchFormalParameter();
			setState(1807);
			match(RPAREN);
			setState(1808);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitCatchFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitCatchFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1810);
				variableModifier();
				}
				}
				setState(1815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1816);
			catchType();
			setState(1817);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<TerminalNode> BITOR() { return getTokens(SimolJava8Parser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(SimolJava8Parser.BITOR, i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			unannClassType();
			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1820);
				match(BITOR);
				setState(1821);
				classType();
				}
				}
				setState(1826);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Finally_Context extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(SimolJava8Parser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFinally_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitFinally_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 344, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1827);
			match(FINALLY);
			setState(1828);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(SimolJava8Parser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTryWithResourcesStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTryWithResourcesStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			match(TRY);
			setState(1831);
			resourceSpecification();
			setState(1832);
			block();
			setState(1834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1833);
				catches();
				}
			}

			setState(1837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1836);
				finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(SimolJava8Parser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			match(LPAREN);
			setState(1840);
			resourceList();
			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1841);
				match(SEMI);
				}
			}

			setState(1844);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SimolJava8Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SimolJava8Parser.SEMI, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitResourceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			resource();
			setState(1851);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1847);
					match(SEMI);
					setState(1848);
					resource();
					}
					} 
				}
				setState(1853);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SimolJava8Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1854);
				variableModifier();
				}
				}
				setState(1859);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1860);
			unannType();
			setState(1861);
			variableDeclaratorId();
			setState(1862);
			match(ASSIGN);
			setState(1863);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1865);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1866);
				arrayCreationExpression();
				}
				break;
			}
			setState(1872);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1869);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1874);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(SimolJava8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(SimolJava8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimolJava8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimolJava8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimolJava8Parser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(SimolJava8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(SimolJava8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1875);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1876);
				typeName();
				setState(1881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1877);
					match(LBRACK);
					setState(1878);
					match(RBRACK);
					}
					}
					setState(1883);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1884);
				match(DOT);
				setState(1885);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1887);
				match(VOID);
				setState(1888);
				match(DOT);
				setState(1889);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1890);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1891);
				typeName();
				setState(1892);
				match(DOT);
				setState(1893);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1895);
				match(LPAREN);
				setState(1896);
				expression();
				setState(1897);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1899);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1900);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1901);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1902);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1903);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(SimolJava8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(SimolJava8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimolJava8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimolJava8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimolJava8Parser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(SimolJava8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(SimolJava8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1908);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1909);
				typeName();
				setState(1914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1910);
					match(LBRACK);
					setState(1911);
					match(RBRACK);
					}
					}
					setState(1916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1917);
				match(DOT);
				setState(1918);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1920);
				match(VOID);
				setState(1921);
				match(DOT);
				setState(1922);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1923);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1924);
				typeName();
				setState(1925);
				match(DOT);
				setState(1926);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1928);
				match(LPAREN);
				setState(1929);
				expression();
				setState(1930);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1932);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1933);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1934);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1935);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1938);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1939);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1940);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1941);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1942);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1947);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1948);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1949);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1950);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(SimolJava8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(SimolJava8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimolJava8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimolJava8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimolJava8Parser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimolJava8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(SimolJava8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(1993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1953);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1954);
				typeName();
				setState(1959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1955);
					match(LBRACK);
					setState(1956);
					match(RBRACK);
					}
					}
					setState(1961);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1962);
				match(DOT);
				setState(1963);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1965);
				unannPrimitiveType();
				setState(1970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1966);
					match(LBRACK);
					setState(1967);
					match(RBRACK);
					}
					}
					setState(1972);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1973);
				match(DOT);
				setState(1974);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1976);
				match(VOID);
				setState(1977);
				match(DOT);
				setState(1978);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1979);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1980);
				typeName();
				setState(1981);
				match(DOT);
				setState(1982);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1984);
				match(LPAREN);
				setState(1985);
				expression();
				setState(1986);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1988);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1989);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1990);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1991);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1992);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(SimolJava8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(SimolJava8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimolJava8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimolJava8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimolJava8Parser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimolJava8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(SimolJava8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1997);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1998);
				typeName();
				setState(2003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1999);
					match(LBRACK);
					setState(2000);
					match(RBRACK);
					}
					}
					setState(2005);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2006);
				match(DOT);
				setState(2007);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2009);
				unannPrimitiveType();
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2010);
					match(LBRACK);
					setState(2011);
					match(RBRACK);
					}
					}
					setState(2016);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2017);
				match(DOT);
				setState(2018);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2020);
				match(VOID);
				setState(2021);
				match(DOT);
				setState(2022);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2023);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2024);
				typeName();
				setState(2025);
				match(DOT);
				setState(2026);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2028);
				match(LPAREN);
				setState(2029);
				expression();
				setState(2030);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2032);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2033);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2034);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2035);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(SimolJava8Parser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(SimolJava8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimolJava8Parser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SimolJava8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimolJava8Parser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassInstanceCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitClassInstanceCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2038);
				match(NEW);
				setState(2040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2039);
					typeArguments();
					}
				}

				setState(2045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2042);
					annotation();
					}
					}
					setState(2047);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2048);
				match(Identifier);
				setState(2059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2049);
					match(DOT);
					setState(2053);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2050);
						annotation();
						}
						}
						setState(2055);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2056);
					match(Identifier);
					}
					}
					setState(2061);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2062);
					typeArgumentsOrDiamond();
					}
				}

				setState(2065);
				match(LPAREN);
				setState(2067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2066);
					argumentList();
					}
				}

				setState(2069);
				match(RPAREN);
				setState(2071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2070);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2073);
				expressionName();
				setState(2074);
				match(DOT);
				setState(2075);
				match(NEW);
				setState(2077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2076);
					typeArguments();
					}
				}

				setState(2082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2079);
					annotation();
					}
					}
					setState(2084);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2085);
				match(Identifier);
				setState(2087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2086);
					typeArgumentsOrDiamond();
					}
				}

				setState(2089);
				match(LPAREN);
				setState(2091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2090);
					argumentList();
					}
				}

				setState(2093);
				match(RPAREN);
				setState(2095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2094);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2097);
				primary();
				setState(2098);
				match(DOT);
				setState(2099);
				match(NEW);
				setState(2101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2100);
					typeArguments();
					}
				}

				setState(2106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2103);
					annotation();
					}
					}
					setState(2108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2109);
				match(Identifier);
				setState(2111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2110);
					typeArgumentsOrDiamond();
					}
				}

				setState(2113);
				match(LPAREN);
				setState(2115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2114);
					argumentList();
					}
				}

				setState(2117);
				match(RPAREN);
				setState(2119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2118);
					classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TerminalNode NEW() { return getToken(SimolJava8Parser.NEW, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			match(DOT);
			setState(2124);
			match(NEW);
			setState(2126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2125);
				typeArguments();
				}
			}

			setState(2131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2128);
				annotation();
				}
				}
				setState(2133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2134);
			match(Identifier);
			setState(2136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2135);
				typeArgumentsOrDiamond();
				}
			}

			setState(2138);
			match(LPAREN);
			setState(2140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
				{
				setState(2139);
				argumentList();
				}
			}

			setState(2142);
			match(RPAREN);
			setState(2144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(2143);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(SimolJava8Parser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(SimolJava8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimolJava8Parser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SimolJava8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimolJava8Parser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2146);
				match(NEW);
				setState(2148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2147);
					typeArguments();
					}
				}

				setState(2153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2150);
					annotation();
					}
					}
					setState(2155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2156);
				match(Identifier);
				setState(2167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2157);
					match(DOT);
					setState(2161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2158);
						annotation();
						}
						}
						setState(2163);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2164);
					match(Identifier);
					}
					}
					setState(2169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2170);
					typeArgumentsOrDiamond();
					}
				}

				setState(2173);
				match(LPAREN);
				setState(2175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2174);
					argumentList();
					}
				}

				setState(2177);
				match(RPAREN);
				setState(2179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(2178);
					classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2181);
				expressionName();
				setState(2182);
				match(DOT);
				setState(2183);
				match(NEW);
				setState(2185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2184);
					typeArguments();
					}
				}

				setState(2190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2187);
					annotation();
					}
					}
					setState(2192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2193);
				match(Identifier);
				setState(2195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2194);
					typeArgumentsOrDiamond();
					}
				}

				setState(2197);
				match(LPAREN);
				setState(2199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2198);
					argumentList();
					}
				}

				setState(2201);
				match(RPAREN);
				setState(2203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(2202);
					classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode LT() { return getToken(SimolJava8Parser.LT, 0); }
		public TerminalNode GT() { return getToken(SimolJava8Parser.GT, 0); }
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_typeArgumentsOrDiamond);
		try {
			setState(2210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2207);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2208);
				match(LT);
				setState(2209);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SimolJava8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimolJava8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TerminalNode SUPER() { return getToken(SimolJava8Parser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess);
		try {
			setState(2225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2212);
				primary();
				setState(2213);
				match(DOT);
				setState(2214);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2216);
				match(SUPER);
				setState(2217);
				match(DOT);
				setState(2218);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2219);
				typeName();
				setState(2220);
				match(DOT);
				setState(2221);
				match(SUPER);
				setState(2222);
				match(DOT);
				setState(2223);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFieldAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitFieldAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2227);
			match(DOT);
			setState(2228);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(SimolJava8Parser.SUPER, 0); }
		public List<TerminalNode> DOT() { return getTokens(SimolJava8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimolJava8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFieldAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitFieldAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_fieldAccess_lfno_primary);
		try {
			setState(2239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2230);
				match(SUPER);
				setState(2231);
				match(DOT);
				setState(2232);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2233);
				typeName();
				setState(2234);
				match(DOT);
				setState(2235);
				match(SUPER);
				setState(2236);
				match(DOT);
				setState(2237);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SimolJava8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimolJava8Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimolJava8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimolJava8Parser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2241);
				expressionName();
				setState(2242);
				match(LBRACK);
				setState(2243);
				expression();
				setState(2244);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2246);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2247);
				match(LBRACK);
				setState(2248);
				expression();
				setState(2249);
				match(RBRACK);
				}
				break;
			}
			setState(2260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2253);
				primaryNoNewArray_lf_arrayAccess();
				setState(2254);
				match(LBRACK);
				setState(2255);
				expression();
				setState(2256);
				match(RBRACK);
				}
				}
				setState(2262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SimolJava8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimolJava8Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimolJava8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimolJava8Parser.RBRACK, i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2263);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2264);
			match(LBRACK);
			setState(2265);
			expression();
			setState(2266);
			match(RBRACK);
			setState(2274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2267);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2268);
					match(LBRACK);
					setState(2269);
					expression();
					setState(2270);
					match(RBRACK);
					}
					} 
				}
				setState(2276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SimolJava8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimolJava8Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimolJava8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimolJava8Parser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2277);
				expressionName();
				setState(2278);
				match(LBRACK);
				setState(2279);
				expression();
				setState(2280);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2282);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2283);
				match(LBRACK);
				setState(2284);
				expression();
				setState(2285);
				match(RBRACK);
				}
				break;
			}
			setState(2296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2289);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2290);
					match(LBRACK);
					setState(2291);
					expression();
					setState(2292);
					match(RBRACK);
					}
					} 
				}
				setState(2298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SimolJava8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimolJava8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(SimolJava8Parser.SUPER, 0); }
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation);
		int _la;
		try {
			setState(2367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2299);
				methodName();
				setState(2300);
				match(LPAREN);
				setState(2302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2301);
					argumentList();
					}
				}

				setState(2304);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2306);
				typeName();
				setState(2307);
				match(DOT);
				setState(2309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2308);
					typeArguments();
					}
				}

				setState(2311);
				match(Identifier);
				setState(2312);
				match(LPAREN);
				setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2313);
					argumentList();
					}
				}

				setState(2316);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2318);
				expressionName();
				setState(2319);
				match(DOT);
				setState(2321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2320);
					typeArguments();
					}
				}

				setState(2323);
				match(Identifier);
				setState(2324);
				match(LPAREN);
				setState(2326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2325);
					argumentList();
					}
				}

				setState(2328);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2330);
				primary();
				setState(2331);
				match(DOT);
				setState(2333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2332);
					typeArguments();
					}
				}

				setState(2335);
				match(Identifier);
				setState(2336);
				match(LPAREN);
				setState(2338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2337);
					argumentList();
					}
				}

				setState(2340);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2342);
				match(SUPER);
				setState(2343);
				match(DOT);
				setState(2345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2344);
					typeArguments();
					}
				}

				setState(2347);
				match(Identifier);
				setState(2348);
				match(LPAREN);
				setState(2350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2349);
					argumentList();
					}
				}

				setState(2352);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2353);
				typeName();
				setState(2354);
				match(DOT);
				setState(2355);
				match(SUPER);
				setState(2356);
				match(DOT);
				setState(2358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2357);
					typeArguments();
					}
				}

				setState(2360);
				match(Identifier);
				setState(2361);
				match(LPAREN);
				setState(2363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2362);
					argumentList();
					}
				}

				setState(2365);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodInvocation_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMethodInvocation_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2369);
			match(DOT);
			setState(2371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2370);
				typeArguments();
				}
			}

			setState(2373);
			match(Identifier);
			setState(2374);
			match(LPAREN);
			setState(2376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
				{
				setState(2375);
				argumentList();
				}
			}

			setState(2378);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SimolJava8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimolJava8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(SimolJava8Parser.SUPER, 0); }
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodInvocation_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMethodInvocation_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2380);
				methodName();
				setState(2381);
				match(LPAREN);
				setState(2383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2382);
					argumentList();
					}
				}

				setState(2385);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2387);
				typeName();
				setState(2388);
				match(DOT);
				setState(2390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2389);
					typeArguments();
					}
				}

				setState(2392);
				match(Identifier);
				setState(2393);
				match(LPAREN);
				setState(2395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2394);
					argumentList();
					}
				}

				setState(2397);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2399);
				expressionName();
				setState(2400);
				match(DOT);
				setState(2402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2401);
					typeArguments();
					}
				}

				setState(2404);
				match(Identifier);
				setState(2405);
				match(LPAREN);
				setState(2407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2406);
					argumentList();
					}
				}

				setState(2409);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2411);
				match(SUPER);
				setState(2412);
				match(DOT);
				setState(2414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2413);
					typeArguments();
					}
				}

				setState(2416);
				match(Identifier);
				setState(2417);
				match(LPAREN);
				setState(2419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2418);
					argumentList();
					}
				}

				setState(2421);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2422);
				typeName();
				setState(2423);
				match(DOT);
				setState(2424);
				match(SUPER);
				setState(2425);
				match(DOT);
				setState(2427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2426);
					typeArguments();
					}
				}

				setState(2429);
				match(Identifier);
				setState(2430);
				match(LPAREN);
				setState(2432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 6755403468374143L) != 0)) {
					{
					setState(2431);
					argumentList();
					}
				}

				setState(2434);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			expression();
			setState(2443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2439);
				match(COMMA);
				setState(2440);
				expression();
				}
				}
				setState(2445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(SimolJava8Parser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(SimolJava8Parser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(SimolJava8Parser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference);
		int _la;
		try {
			setState(2493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2446);
				expressionName();
				setState(2447);
				match(COLONCOLON);
				setState(2449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2448);
					typeArguments();
					}
				}

				setState(2451);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2453);
				referenceType();
				setState(2454);
				match(COLONCOLON);
				setState(2456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2455);
					typeArguments();
					}
				}

				setState(2458);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2460);
				primary();
				setState(2461);
				match(COLONCOLON);
				setState(2463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2462);
					typeArguments();
					}
				}

				setState(2465);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2467);
				match(SUPER);
				setState(2468);
				match(COLONCOLON);
				setState(2470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2469);
					typeArguments();
					}
				}

				setState(2472);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2473);
				typeName();
				setState(2474);
				match(DOT);
				setState(2475);
				match(SUPER);
				setState(2476);
				match(COLONCOLON);
				setState(2478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2477);
					typeArguments();
					}
				}

				setState(2480);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2482);
				classType();
				setState(2483);
				match(COLONCOLON);
				setState(2485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2484);
					typeArguments();
					}
				}

				setState(2487);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2489);
				arrayType();
				setState(2490);
				match(COLONCOLON);
				setState(2491);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(SimolJava8Parser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodReference_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMethodReference_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2495);
			match(COLONCOLON);
			setState(2497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2496);
				typeArguments();
				}
			}

			setState(2499);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(SimolJava8Parser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(SimolJava8Parser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimolJava8Parser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(SimolJava8Parser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodReference_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMethodReference_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2501);
				expressionName();
				setState(2502);
				match(COLONCOLON);
				setState(2504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2503);
					typeArguments();
					}
				}

				setState(2506);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2508);
				referenceType();
				setState(2509);
				match(COLONCOLON);
				setState(2511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2510);
					typeArguments();
					}
				}

				setState(2513);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2515);
				match(SUPER);
				setState(2516);
				match(COLONCOLON);
				setState(2518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2517);
					typeArguments();
					}
				}

				setState(2520);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2521);
				typeName();
				setState(2522);
				match(DOT);
				setState(2523);
				match(SUPER);
				setState(2524);
				match(COLONCOLON);
				setState(2526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2525);
					typeArguments();
					}
				}

				setState(2528);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2530);
				classType();
				setState(2531);
				match(COLONCOLON);
				setState(2533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2532);
					typeArguments();
					}
				}

				setState(2535);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2537);
				arrayType();
				setState(2538);
				match(COLONCOLON);
				setState(2539);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(SimolJava8Parser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_arrayCreationExpression);
		try {
			setState(2565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2543);
				match(NEW);
				setState(2544);
				primitiveType();
				setState(2545);
				dimExprs();
				setState(2547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2546);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2549);
				match(NEW);
				setState(2550);
				classOrInterfaceType();
				setState(2551);
				dimExprs();
				setState(2553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2552);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2555);
				match(NEW);
				setState(2556);
				primitiveType();
				setState(2557);
				dims();
				setState(2558);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2560);
				match(NEW);
				setState(2561);
				classOrInterfaceType();
				setState(2562);
				dims();
				setState(2563);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2567);
			dimExpr();
			setState(2571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2568);
					dimExpr();
					}
					} 
				}
				setState(2573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SimolJava8Parser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SimolJava8Parser.RBRACK, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitDimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2574);
				annotation();
				}
				}
				setState(2579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2580);
			match(LBRACK);
			setState(2581);
			expression();
			setState(2582);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_expression);
		try {
			setState(2588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2586);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2587);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(SimolJava8Parser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2590);
			lambdaParameters();
			setState(2591);
			match(ARROW);
			setState(2592);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_lambdaParameters);
		int _la;
		try {
			setState(2604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2594);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2595);
				match(LPAREN);
				setState(2597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460890414793000L) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2596);
					formalParameterList();
					}
				}

				setState(2599);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2600);
				match(LPAREN);
				setState(2601);
				inferredFormalParameterList();
				setState(2602);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SimolJava8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimolJava8Parser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimolJava8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimolJava8Parser.COMMA, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInferredFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInferredFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2606);
			match(Identifier);
			setState(2611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2607);
				match(COMMA);
				setState(2608);
				match(Identifier);
				}
				}
				setState(2613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_lambdaBody);
		try {
			setState(2616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2614);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2615);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_assignmentExpression);
		try {
			setState(2620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2618);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2619);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2622);
			leftHandSide();
			setState(2623);
			assignmentOperator();
			setState(2624);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_leftHandSide);
		try {
			setState(2629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2626);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2627);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2628);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SimolJava8Parser.ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(SimolJava8Parser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(SimolJava8Parser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(SimolJava8Parser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(SimolJava8Parser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(SimolJava8Parser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(SimolJava8Parser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(SimolJava8Parser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(SimolJava8Parser.URSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(SimolJava8Parser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(SimolJava8Parser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(SimolJava8Parser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2631);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 68685922305L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(SimolJava8Parser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimolJava8Parser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_conditionalExpression);
		try {
			setState(2640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2633);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2634);
				conditionalOrExpression(0);
				setState(2635);
				match(QUESTION);
				setState(2636);
				expression();
				setState(2637);
				match(COLON);
				setState(2638);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(SimolJava8Parser.OR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2643);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2645);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2646);
					match(OR);
					setState(2647);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SimolJava8Parser.AND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2654);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2656);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2657);
					match(AND);
					setState(2658);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode BITOR() { return getToken(SimolJava8Parser.BITOR, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2665);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2667);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2668);
					match(BITOR);
					setState(2669);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(SimolJava8Parser.CARET, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2676);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2678);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2679);
					match(CARET);
					setState(2680);
					andExpression(0);
					}
					} 
				}
				setState(2685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(SimolJava8Parser.BITAND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2687);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2689);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2690);
					match(BITAND);
					setState(2691);
					equalityExpression(0);
					}
					} 
				}
				setState(2696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SimolJava8Parser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(SimolJava8Parser.NOTEQUAL, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2698);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2706);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2700);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2701);
						match(EQUAL);
						setState(2702);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2703);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2704);
						match(NOTEQUAL);
						setState(2705);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(SimolJava8Parser.LT, 0); }
		public TerminalNode GT() { return getToken(SimolJava8Parser.GT, 0); }
		public TerminalNode LE() { return getToken(SimolJava8Parser.LE, 0); }
		public TerminalNode GE() { return getToken(SimolJava8Parser.GE, 0); }
		public TerminalNode INSTANCEOF() { return getToken(SimolJava8Parser.INSTANCEOF, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2712);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2729);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2714);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2715);
						match(LT);
						setState(2716);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2717);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2718);
						match(GT);
						setState(2719);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2720);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2721);
						match(LE);
						setState(2722);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2723);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2724);
						match(GE);
						setState(2725);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2726);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2727);
						match(INSTANCEOF);
						setState(2728);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public List<TerminalNode> LT() { return getTokens(SimolJava8Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(SimolJava8Parser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(SimolJava8Parser.GT); }
		public TerminalNode GT(int i) {
			return getToken(SimolJava8Parser.GT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2735);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2752);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2750);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2737);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2738);
						match(LT);
						setState(2739);
						match(LT);
						setState(2740);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2741);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2742);
						match(GT);
						setState(2743);
						match(GT);
						setState(2744);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2745);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2746);
						match(GT);
						setState(2747);
						match(GT);
						setState(2748);
						match(GT);
						setState(2749);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SimolJava8Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SimolJava8Parser.SUB, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2756);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2764);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2758);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2759);
						match(ADD);
						setState(2760);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2761);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2762);
						match(SUB);
						setState(2763);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(SimolJava8Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SimolJava8Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SimolJava8Parser.MOD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2770);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2781);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2772);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2773);
						match(MUL);
						setState(2774);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2775);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2776);
						match(DIV);
						setState(2777);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2778);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2779);
						match(MOD);
						setState(2780);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SimolJava8Parser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(SimolJava8Parser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_unaryExpression);
		try {
			setState(2793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2786);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2787);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2788);
				match(ADD);
				setState(2789);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2790);
				match(SUB);
				setState(2791);
				unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2792);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(SimolJava8Parser.INC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2795);
			match(INC);
			setState(2796);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(SimolJava8Parser.DEC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPreDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2798);
			match(DEC);
			setState(2799);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(SimolJava8Parser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(SimolJava8Parser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2801);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2802);
				match(TILDE);
				setState(2803);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2804);
				match(BANG);
				setState(2805);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2806);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(2809);
				primary();
				}
				break;
			case 2:
				{
				setState(2810);
				expressionName();
				}
				break;
			}
			setState(2817);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2815);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2813);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2814);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2819);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(SimolJava8Parser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2820);
			postfixExpression();
			setState(2821);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(SimolJava8Parser.INC, 0); }
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPostIncrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2823);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(SimolJava8Parser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2825);
			postfixExpression();
			setState(2826);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(SimolJava8Parser.DEC, 0); }
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitPostDecrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2828);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SimolJava8Parser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimolJava8Parser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimolJava8ParserVisitor ) return ((SimolJava8ParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_castExpression);
		int _la;
		try {
			setState(2857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2830);
				match(LPAREN);
				setState(2831);
				primitiveType();
				setState(2832);
				match(RPAREN);
				setState(2833);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2835);
				match(LPAREN);
				setState(2836);
				referenceType();
				setState(2840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2837);
					additionalBound();
					}
					}
					setState(2842);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2843);
				match(RPAREN);
				setState(2844);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2846);
				match(LPAREN);
				setState(2847);
				referenceType();
				setState(2851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2848);
					additionalBound();
					}
					}
					setState(2853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2854);
				match(RPAREN);
				setState(2855);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 27:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 30:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 218:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 219:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 220:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 221:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 222:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 223:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 224:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 225:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 226:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 227:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001{\u0b2c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0002"+
		"n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007r\u0002"+
		"s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007w\u0002"+
		"x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007|\u0002"+
		"}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007\u0080"+
		"\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007\u0083"+
		"\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007\u0086"+
		"\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007\u0089"+
		"\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007\u008c"+
		"\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007\u008f"+
		"\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007\u0092"+
		"\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007\u0095"+
		"\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007\u0098"+
		"\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007\u009b"+
		"\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007\u009e"+
		"\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007\u00a1"+
		"\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007\u00a4"+
		"\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007\u00a7"+
		"\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007\u00aa"+
		"\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007\u00ad"+
		"\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007\u00b0"+
		"\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007\u00b3"+
		"\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007\u00b6"+
		"\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007\u00b9"+
		"\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007\u00bc"+
		"\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007\u00bf"+
		"\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007\u00c2"+
		"\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007\u00c5"+
		"\u0002\u00c6\u0007\u00c6\u0002\u00c7\u0007\u00c7\u0002\u00c8\u0007\u00c8"+
		"\u0002\u00c9\u0007\u00c9\u0002\u00ca\u0007\u00ca\u0002\u00cb\u0007\u00cb"+
		"\u0002\u00cc\u0007\u00cc\u0002\u00cd\u0007\u00cd\u0002\u00ce\u0007\u00ce"+
		"\u0002\u00cf\u0007\u00cf\u0002\u00d0\u0007\u00d0\u0002\u00d1\u0007\u00d1"+
		"\u0002\u00d2\u0007\u00d2\u0002\u00d3\u0007\u00d3\u0002\u00d4\u0007\u00d4"+
		"\u0002\u00d5\u0007\u00d5\u0002\u00d6\u0007\u00d6\u0002\u00d7\u0007\u00d7"+
		"\u0002\u00d8\u0007\u00d8\u0002\u00d9\u0007\u00d9\u0002\u00da\u0007\u00da"+
		"\u0002\u00db\u0007\u00db\u0002\u00dc\u0007\u00dc\u0002\u00dd\u0007\u00dd"+
		"\u0002\u00de\u0007\u00de\u0002\u00df\u0007\u00df\u0002\u00e0\u0007\u00e0"+
		"\u0002\u00e1\u0007\u00e1\u0002\u00e2\u0007\u00e2\u0002\u00e3\u0007\u00e3"+
		"\u0002\u00e4\u0007\u00e4\u0002\u00e5\u0007\u00e5\u0002\u00e6\u0007\u00e6"+
		"\u0002\u00e7\u0007\u00e7\u0002\u00e8\u0007\u00e8\u0002\u00e9\u0007\u00e9"+
		"\u0002\u00ea\u0007\u00ea\u0002\u00eb\u0007\u00eb\u0002\u00ec\u0007\u00ec"+
		"\u0002\u00ed\u0007\u00ed\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"\u01e0\b\u0001\n\u0001\f\u0001\u01e3\t\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u01e7\b\u0001\n\u0001\f\u0001\u01ea\t\u0001\u0001\u0001\u0003\u0001"+
		"\u01ed\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u01f1\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u01fa\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u01fe"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0202\b\u0006\n\u0006\f\u0006"+
		"\u0205\t\u0006\u0001\u0007\u0005\u0007\u0208\b\u0007\n\u0007\f\u0007\u020b"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u020f\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0214\b\u0007\n\u0007\f\u0007\u0217"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u021b\b\u0007\u0003\u0007"+
		"\u021d\b\u0007\u0001\b\u0001\b\u0005\b\u0221\b\b\n\b\f\b\u0224\t\b\u0001"+
		"\b\u0001\b\u0003\b\u0228\b\b\u0001\t\u0005\t\u022b\b\t\n\t\f\t\u022e\t"+
		"\t\u0001\t\u0001\t\u0003\t\u0232\b\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0005\r\u023b\b\r\n\r\f\r\u023e\t\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u024b\b\u000e"+
		"\u0001\u000f\u0005\u000f\u024e\b\u000f\n\u000f\f\u000f\u0251\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0256\b\u000f\n\u000f\f\u000f"+
		"\u0259\t\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u025d\b\u000f\n\u000f"+
		"\f\u000f\u0260\t\u000f\u0001\u0010\u0005\u0010\u0263\b\u0010\n\u0010\f"+
		"\u0010\u0266\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u026a\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0273\b\u0012\n\u0012\f\u0012\u0276\t\u0012\u0003"+
		"\u0012\u0278\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0284\b\u0015\n\u0015\f\u0015\u0287\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u028b\b\u0016\u0001\u0017\u0005\u0017\u028e\b\u0017\n\u0017"+
		"\f\u0017\u0291\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0295\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u029b\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u02a3\b\u0019\n\u0019\f\u0019\u02a6\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u02ad\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u02b5\b\u001b\n\u001b\f\u001b\u02b8\t\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u02bf\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u02c9\b\u001e\n\u001e\f\u001e\u02cc\t\u001e\u0001"+
		"\u001f\u0003\u001f\u02cf\b\u001f\u0001\u001f\u0005\u001f\u02d2\b\u001f"+
		"\n\u001f\f\u001f\u02d5\t\u001f\u0001\u001f\u0005\u001f\u02d8\b\u001f\n"+
		"\u001f\f\u001f\u02db\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0005 \u02e0"+
		"\b \n \f \u02e3\t \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u02ef\b\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u030c\b\'\u0001(\u0001(\u0003(\u0310\b(\u0001"+
		")\u0005)\u0313\b)\n)\f)\u0316\t)\u0001)\u0001)\u0001)\u0003)\u031b\b)"+
		"\u0001)\u0003)\u031e\b)\u0001)\u0003)\u0321\b)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u032f"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0005-\u0338\b-\n"+
		"-\f-\u033b\t-\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u00010\u00010"+
		"\u00010\u00050\u0346\b0\n0\f0\u0349\t0\u00011\u00011\u00051\u034d\b1\n"+
		"1\f1\u0350\t1\u00011\u00011\u00012\u00012\u00012\u00012\u00032\u0358\b"+
		"2\u00013\u00013\u00013\u00013\u00013\u00033\u035f\b3\u00014\u00054\u0362"+
		"\b4\n4\f4\u0365\t4\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u0376\b5\u0001"+
		"6\u00016\u00016\u00056\u037b\b6\n6\f6\u037e\t6\u00017\u00017\u00017\u0003"+
		"7\u0383\b7\u00018\u00018\u00038\u0387\b8\u00019\u00019\u00039\u038b\b"+
		"9\u0001:\u0001:\u0003:\u038f\b:\u0001;\u0001;\u0003;\u0393\b;\u0001<\u0001"+
		"<\u0001<\u0003<\u0398\b<\u0001=\u0001=\u0003=\u039c\b=\u0001=\u0001=\u0005"+
		"=\u03a0\b=\n=\f=\u03a3\t=\u0001>\u0001>\u0003>\u03a7\b>\u0001>\u0001>"+
		"\u0001>\u0005>\u03ac\b>\n>\f>\u03af\t>\u0001>\u0001>\u0003>\u03b3\b>\u0003"+
		">\u03b5\b>\u0001?\u0001?\u0005?\u03b9\b?\n?\f?\u03bc\t?\u0001?\u0001?"+
		"\u0003?\u03c0\b?\u0001@\u0001@\u0003@\u03c4\b@\u0001A\u0001A\u0001B\u0001"+
		"B\u0001C\u0001C\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0003E\u03d7\bE\u0001F\u0005F\u03da\bF\nF\fF\u03dd"+
		"\tF\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u03f1"+
		"\bG\u0001H\u0001H\u0001H\u0003H\u03f6\bH\u0001H\u0001H\u0005H\u03fa\b"+
		"H\nH\fH\u03fd\tH\u0001H\u0001H\u0001H\u0003H\u0402\bH\u0003H\u0404\bH"+
		"\u0001I\u0001I\u0003I\u0408\bI\u0001J\u0001J\u0001J\u0003J\u040d\bJ\u0001"+
		"J\u0001J\u0003J\u0411\bJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003"+
		"K\u0419\bK\u0001L\u0001L\u0001L\u0005L\u041e\bL\nL\fL\u0421\tL\u0001L"+
		"\u0001L\u0001L\u0005L\u0426\bL\nL\fL\u0429\tL\u0003L\u042b\bL\u0001M\u0005"+
		"M\u042e\bM\nM\fM\u0431\tM\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0003"+
		"N\u0439\bN\u0001O\u0005O\u043c\bO\nO\fO\u043f\tO\u0001O\u0001O\u0005O"+
		"\u0443\bO\nO\fO\u0446\tO\u0001O\u0001O\u0001O\u0001O\u0003O\u044c\bO\u0001"+
		"P\u0005P\u044f\bP\nP\fP\u0452\tP\u0001P\u0001P\u0001P\u0003P\u0457\bP"+
		"\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0005R\u0461"+
		"\bR\nR\fR\u0464\tR\u0001S\u0001S\u0003S\u0468\bS\u0001T\u0001T\u0003T"+
		"\u046c\bT\u0001U\u0001U\u0001V\u0001V\u0001V\u0001W\u0005W\u0474\bW\n"+
		"W\fW\u0477\tW\u0001W\u0001W\u0003W\u047b\bW\u0001W\u0001W\u0001X\u0001"+
		"X\u0001X\u0001X\u0003X\u0483\bX\u0001Y\u0003Y\u0486\bY\u0001Y\u0001Y\u0001"+
		"Y\u0003Y\u048b\bY\u0001Y\u0001Y\u0001Z\u0001Z\u0001[\u0001[\u0003[\u0493"+
		"\b[\u0001[\u0003[\u0496\b[\u0001[\u0001[\u0001\\\u0003\\\u049b\b\\\u0001"+
		"\\\u0001\\\u0001\\\u0003\\\u04a0\b\\\u0001\\\u0001\\\u0001\\\u0003\\\u04a5"+
		"\b\\\u0001\\\u0001\\\u0001\\\u0003\\\u04aa\b\\\u0001\\\u0001\\\u0001\\"+
		"\u0001\\\u0001\\\u0003\\\u04b1\b\\\u0001\\\u0001\\\u0001\\\u0003\\\u04b6"+
		"\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u04be\b\\"+
		"\u0001\\\u0001\\\u0001\\\u0003\\\u04c3\b\\\u0001\\\u0001\\\u0001\\\u0003"+
		"\\\u04c8\b\\\u0001]\u0005]\u04cb\b]\n]\f]\u04ce\t]\u0001]\u0001]\u0001"+
		"]\u0003]\u04d3\b]\u0001]\u0001]\u0001^\u0001^\u0003^\u04d9\b^\u0001^\u0003"+
		"^\u04dc\b^\u0001^\u0003^\u04df\b^\u0001^\u0001^\u0001_\u0001_\u0001_\u0005"+
		"_\u04e6\b_\n_\f_\u04e9\t_\u0001`\u0005`\u04ec\b`\n`\f`\u04ef\t`\u0001"+
		"`\u0001`\u0001`\u0003`\u04f4\b`\u0001`\u0003`\u04f7\b`\u0001`\u0003`\u04fa"+
		"\b`\u0001a\u0001a\u0001b\u0001b\u0005b\u0500\bb\nb\fb\u0503\tb\u0001c"+
		"\u0001c\u0003c\u0507\bc\u0001d\u0005d\u050a\bd\nd\fd\u050d\td\u0001d\u0001"+
		"d\u0001d\u0003d\u0512\bd\u0001d\u0003d\u0515\bd\u0001d\u0001d\u0001e\u0001"+
		"e\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0003f\u0522\bf\u0001"+
		"g\u0001g\u0001g\u0001h\u0001h\u0005h\u0529\bh\nh\fh\u052c\th\u0001h\u0001"+
		"h\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u0535\bi\u0001j\u0005j\u0538"+
		"\bj\nj\fj\u053b\tj\u0001j\u0001j\u0001j\u0001j\u0001k\u0001k\u0001k\u0001"+
		"k\u0003k\u0545\bk\u0001l\u0005l\u0548\bl\nl\fl\u054b\tl\u0001l\u0001l"+
		"\u0001l\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0003m\u0556\bm\u0001"+
		"n\u0005n\u0559\bn\nn\fn\u055c\tn\u0001n\u0001n\u0001n\u0001n\u0001n\u0001"+
		"o\u0001o\u0005o\u0565\bo\no\fo\u0568\to\u0001o\u0001o\u0001p\u0001p\u0001"+
		"p\u0001p\u0001p\u0003p\u0571\bp\u0001q\u0005q\u0574\bq\nq\fq\u0577\tq"+
		"\u0001q\u0001q\u0001q\u0001q\u0001q\u0003q\u057e\bq\u0001q\u0003q\u0581"+
		"\bq\u0001q\u0001q\u0001r\u0001r\u0001r\u0003r\u0588\br\u0001s\u0001s\u0001"+
		"s\u0001t\u0001t\u0001t\u0003t\u0590\bt\u0001u\u0001u\u0001u\u0001u\u0003"+
		"u\u0596\bu\u0001u\u0001u\u0001v\u0001v\u0001v\u0005v\u059d\bv\nv\fv\u05a0"+
		"\tv\u0001w\u0001w\u0001w\u0001w\u0001x\u0001x\u0001x\u0003x\u05a9\bx\u0001"+
		"y\u0001y\u0003y\u05ad\by\u0001y\u0003y\u05b0\by\u0001y\u0001y\u0001z\u0001"+
		"z\u0001z\u0005z\u05b7\bz\nz\fz\u05ba\tz\u0001{\u0001{\u0001{\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001}\u0001}\u0003}\u05c7\b}\u0001}\u0003"+
		"}\u05ca\b}\u0001}\u0001}\u0001~\u0001~\u0001~\u0005~\u05d1\b~\n~\f~\u05d4"+
		"\t~\u0001\u007f\u0001\u007f\u0003\u007f\u05d8\b\u007f\u0001\u007f\u0001"+
		"\u007f\u0001\u0080\u0004\u0080\u05dd\b\u0080\u000b\u0080\f\u0080\u05de"+
		"\u0001\u0081\u0001\u0081\u0001\u0081\u0003\u0081\u05e4\b\u0081\u0001\u0082"+
		"\u0001\u0082\u0001\u0082\u0001\u0083\u0005\u0083\u05ea\b\u0083\n\u0083"+
		"\f\u0083\u05ed\t\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0003\u0084"+
		"\u05f8\b\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0003\u0085\u05ff\b\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0001\u0086\u0001\u0086\u0003\u0086\u060d\b\u0086\u0001\u0087\u0001\u0087"+
		"\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0089\u0001\u0089"+
		"\u0001\u0089\u0001\u0089\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0003\u008b\u0623\b\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c"+
		"\u0001\u008c\u0001\u008c\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008e\u0001\u008e"+
		"\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e"+
		"\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0003\u008f\u0645\b\u008f"+
		"\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0001\u0091\u0001\u0091\u0005\u0091\u064f\b\u0091\n\u0091\f\u0091\u0652"+
		"\t\u0091\u0001\u0091\u0005\u0091\u0655\b\u0091\n\u0091\f\u0091\u0658\t"+
		"\u0091\u0001\u0091\u0001\u0091\u0001\u0092\u0001\u0092\u0001\u0092\u0001"+
		"\u0093\u0001\u0093\u0005\u0093\u0661\b\u0093\n\u0093\f\u0093\u0664\t\u0093"+
		"\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094"+
		"\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0003\u0094\u0670\b\u0094"+
		"\u0001\u0095\u0001\u0095\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096"+
		"\u0001\u0096\u0001\u0096\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097"+
		"\u0001\u0097\u0001\u0097\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098"+
		"\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0099\u0001\u0099"+
		"\u0003\u0099\u068a\b\u0099\u0001\u009a\u0001\u009a\u0003\u009a\u068e\b"+
		"\u009a\u0001\u009b\u0001\u009b\u0001\u009b\u0003\u009b\u0693\b\u009b\u0001"+
		"\u009b\u0001\u009b\u0003\u009b\u0697\b\u009b\u0001\u009b\u0001\u009b\u0003"+
		"\u009b\u069b\b\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009c\u0001"+
		"\u009c\u0001\u009c\u0003\u009c\u06a3\b\u009c\u0001\u009c\u0001\u009c\u0003"+
		"\u009c\u06a7\b\u009c\u0001\u009c\u0001\u009c\u0003\u009c\u06ab\b\u009c"+
		"\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009d\u0001\u009d\u0003\u009d"+
		"\u06b2\b\u009d\u0001\u009e\u0001\u009e\u0001\u009f\u0001\u009f\u0001\u009f"+
		"\u0005\u009f\u06b9\b\u009f\n\u009f\f\u009f\u06bc\t\u009f\u0001\u00a0\u0001"+
		"\u00a0\u0001\u00a0\u0005\u00a0\u06c1\b\u00a0\n\u00a0\f\u00a0\u06c4\t\u00a0"+
		"\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0"+
		"\u0001\u00a0\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0005\u00a1\u06d0\b\u00a1"+
		"\n\u00a1\f\u00a1\u06d3\t\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001"+
		"\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a2\u0001\u00a2\u0003"+
		"\u00a2\u06de\b\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a3\u0001\u00a3\u0003"+
		"\u00a3\u06e4\b\u00a3\u0001\u00a3\u0001\u00a3\u0001\u00a4\u0001\u00a4\u0003"+
		"\u00a4\u06ea\b\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a5\u0001\u00a5\u0001"+
		"\u00a5\u0001\u00a5\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001"+
		"\u00a6\u0001\u00a6\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001"+
		"\u00a7\u0001\u00a7\u0001\u00a7\u0003\u00a7\u06ff\b\u00a7\u0001\u00a7\u0001"+
		"\u00a7\u0001\u00a7\u0003\u00a7\u0704\b\u00a7\u0001\u00a8\u0001\u00a8\u0005"+
		"\u00a8\u0708\b\u00a8\n\u00a8\f\u00a8\u070b\t\u00a8\u0001\u00a9\u0001\u00a9"+
		"\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00aa\u0005\u00aa"+
		"\u0714\b\u00aa\n\u00aa\f\u00aa\u0717\t\u00aa\u0001\u00aa\u0001\u00aa\u0001"+
		"\u00aa\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0005\u00ab\u071f\b\u00ab\n"+
		"\u00ab\f\u00ab\u0722\t\u00ab\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001"+
		"\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0003\u00ad\u072b\b\u00ad\u0001"+
		"\u00ad\u0003\u00ad\u072e\b\u00ad\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0003"+
		"\u00ae\u0733\b\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00af\u0001\u00af\u0001"+
		"\u00af\u0005\u00af\u073a\b\u00af\n\u00af\f\u00af\u073d\t\u00af\u0001\u00b0"+
		"\u0005\u00b0\u0740\b\u00b0\n\u00b0\f\u00b0\u0743\t\u00b0\u0001\u00b0\u0001"+
		"\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b1\u0001\u00b1\u0003"+
		"\u00b1\u074c\b\u00b1\u0001\u00b1\u0005\u00b1\u074f\b\u00b1\n\u00b1\f\u00b1"+
		"\u0752\t\u00b1\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0005\u00b2"+
		"\u0758\b\u00b2\n\u00b2\f\u00b2\u075b\t\u00b2\u0001\u00b2\u0001\u00b2\u0001"+
		"\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001"+
		"\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001"+
		"\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0003"+
		"\u00b2\u0771\b\u00b2\u0001\u00b3\u0001\u00b3\u0001\u00b4\u0001\u00b4\u0001"+
		"\u00b4\u0001\u00b4\u0005\u00b4\u0779\b\u00b4\n\u00b4\f\u00b4\u077c\t\u00b4"+
		"\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4"+
		"\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4"+
		"\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4"+
		"\u0001\u00b4\u0003\u00b4\u0791\b\u00b4\u0001\u00b5\u0001\u00b5\u0001\u00b5"+
		"\u0001\u00b5\u0001\u00b5\u0003\u00b5\u0798\b\u00b5\u0001\u00b6\u0001\u00b6"+
		"\u0001\u00b7\u0001\u00b7\u0001\u00b7\u0001\u00b7\u0003\u00b7\u07a0\b\u00b7"+
		"\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0005\u00b8\u07a6\b\u00b8"+
		"\n\u00b8\f\u00b8\u07a9\t\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001"+
		"\u00b8\u0001\u00b8\u0001\u00b8\u0005\u00b8\u07b1\b\u00b8\n\u00b8\f\u00b8"+
		"\u07b4\t\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8"+
		"\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8"+
		"\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8"+
		"\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0003\u00b8\u07ca\b\u00b8\u0001\u00b9"+
		"\u0001\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0005\u00ba"+
		"\u07d2\b\u00ba\n\u00ba\f\u00ba\u07d5\t\u00ba\u0001\u00ba\u0001\u00ba\u0001"+
		"\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0005\u00ba\u07dd\b\u00ba\n"+
		"\u00ba\f\u00ba\u07e0\t\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001"+
		"\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001"+
		"\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001"+
		"\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0003\u00ba\u07f5\b\u00ba\u0001"+
		"\u00bb\u0001\u00bb\u0003\u00bb\u07f9\b\u00bb\u0001\u00bb\u0005\u00bb\u07fc"+
		"\b\u00bb\n\u00bb\f\u00bb\u07ff\t\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb"+
		"\u0005\u00bb\u0804\b\u00bb\n\u00bb\f\u00bb\u0807\t\u00bb\u0001\u00bb\u0005"+
		"\u00bb\u080a\b\u00bb\n\u00bb\f\u00bb\u080d\t\u00bb\u0001\u00bb\u0003\u00bb"+
		"\u0810\b\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb\u0814\b\u00bb\u0001"+
		"\u00bb\u0001\u00bb\u0003\u00bb\u0818\b\u00bb\u0001\u00bb\u0001\u00bb\u0001"+
		"\u00bb\u0001\u00bb\u0003\u00bb\u081e\b\u00bb\u0001\u00bb\u0005\u00bb\u0821"+
		"\b\u00bb\n\u00bb\f\u00bb\u0824\t\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb"+
		"\u0828\b\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb\u082c\b\u00bb\u0001"+
		"\u00bb\u0001\u00bb\u0003\u00bb\u0830\b\u00bb\u0001\u00bb\u0001\u00bb\u0001"+
		"\u00bb\u0001\u00bb\u0003\u00bb\u0836\b\u00bb\u0001\u00bb\u0005\u00bb\u0839"+
		"\b\u00bb\n\u00bb\f\u00bb\u083c\t\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb"+
		"\u0840\b\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb\u0844\b\u00bb\u0001"+
		"\u00bb\u0001\u00bb\u0003\u00bb\u0848\b\u00bb\u0003\u00bb\u084a\b\u00bb"+
		"\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0003\u00bc\u084f\b\u00bc\u0001\u00bc"+
		"\u0005\u00bc\u0852\b\u00bc\n\u00bc\f\u00bc\u0855\t\u00bc\u0001\u00bc\u0001"+
		"\u00bc\u0003\u00bc\u0859\b\u00bc\u0001\u00bc\u0001\u00bc\u0003\u00bc\u085d"+
		"\b\u00bc\u0001\u00bc\u0001\u00bc\u0003\u00bc\u0861\b\u00bc\u0001\u00bd"+
		"\u0001\u00bd\u0003\u00bd\u0865\b\u00bd\u0001\u00bd\u0005\u00bd\u0868\b"+
		"\u00bd\n\u00bd\f\u00bd\u086b\t\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd"+
		"\u0005\u00bd\u0870\b\u00bd\n\u00bd\f\u00bd\u0873\t\u00bd\u0001\u00bd\u0005"+
		"\u00bd\u0876\b\u00bd\n\u00bd\f\u00bd\u0879\t\u00bd\u0001\u00bd\u0003\u00bd"+
		"\u087c\b\u00bd\u0001\u00bd\u0001\u00bd\u0003\u00bd\u0880\b\u00bd\u0001"+
		"\u00bd\u0001\u00bd\u0003\u00bd\u0884\b\u00bd\u0001\u00bd\u0001\u00bd\u0001"+
		"\u00bd\u0001\u00bd\u0003\u00bd\u088a\b\u00bd\u0001\u00bd\u0005\u00bd\u088d"+
		"\b\u00bd\n\u00bd\f\u00bd\u0890\t\u00bd\u0001\u00bd\u0001\u00bd\u0003\u00bd"+
		"\u0894\b\u00bd\u0001\u00bd\u0001\u00bd\u0003\u00bd\u0898\b\u00bd\u0001"+
		"\u00bd\u0001\u00bd\u0003\u00bd\u089c\b\u00bd\u0003\u00bd\u089e\b\u00bd"+
		"\u0001\u00be\u0001\u00be\u0001\u00be\u0003\u00be\u08a3\b\u00be\u0001\u00bf"+
		"\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf"+
		"\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf"+
		"\u0003\u00bf\u08b2\b\u00bf\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c1"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1"+
		"\u0001\u00c1\u0001\u00c1\u0003\u00c1\u08c0\b\u00c1\u0001\u00c2\u0001\u00c2"+
		"\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2"+
		"\u0001\u00c2\u0001\u00c2\u0003\u00c2\u08cc\b\u00c2\u0001\u00c2\u0001\u00c2"+
		"\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0005\u00c2\u08d3\b\u00c2\n\u00c2"+
		"\f\u00c2\u08d6\t\u00c2\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3"+
		"\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0005\u00c3"+
		"\u08e1\b\u00c3\n\u00c3\f\u00c3\u08e4\t\u00c3\u0001\u00c4\u0001\u00c4\u0001"+
		"\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001"+
		"\u00c4\u0001\u00c4\u0003\u00c4\u08f0\b\u00c4\u0001\u00c4\u0001\u00c4\u0001"+
		"\u00c4\u0001\u00c4\u0001\u00c4\u0005\u00c4\u08f7\b\u00c4\n\u00c4\f\u00c4"+
		"\u08fa\t\u00c4\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u08ff\b"+
		"\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003"+
		"\u00c5\u0906\b\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u090b"+
		"\b\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003"+
		"\u00c5\u0912\b\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u0917"+
		"\b\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003"+
		"\u00c5\u091e\b\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u0923"+
		"\b\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003"+
		"\u00c5\u092a\b\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u092f"+
		"\b\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001"+
		"\u00c5\u0003\u00c5\u0937\b\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003"+
		"\u00c5\u093c\b\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u0940\b\u00c5"+
		"\u0001\u00c6\u0001\u00c6\u0003\u00c6\u0944\b\u00c6\u0001\u00c6\u0001\u00c6"+
		"\u0001\u00c6\u0003\u00c6\u0949\b\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0003\u00c7\u0950\b\u00c7\u0001\u00c7\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0003\u00c7\u0957\b\u00c7\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0003\u00c7\u095c\b\u00c7\u0001\u00c7\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0003\u00c7\u0963\b\u00c7\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0003\u00c7\u0968\b\u00c7\u0001\u00c7\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0003\u00c7\u096f\b\u00c7\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0003\u00c7\u0974\b\u00c7\u0001\u00c7\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0003\u00c7\u097c\b\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0003\u00c7\u0981\b\u00c7\u0001\u00c7"+
		"\u0001\u00c7\u0003\u00c7\u0985\b\u00c7\u0001\u00c8\u0001\u00c8\u0001\u00c8"+
		"\u0005\u00c8\u098a\b\u00c8\n\u00c8\f\u00c8\u098d\t\u00c8\u0001\u00c9\u0001"+
		"\u00c9\u0001\u00c9\u0003\u00c9\u0992\b\u00c9\u0001\u00c9\u0001\u00c9\u0001"+
		"\u00c9\u0001\u00c9\u0001\u00c9\u0003\u00c9\u0999\b\u00c9\u0001\u00c9\u0001"+
		"\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0003\u00c9\u09a0\b\u00c9\u0001"+
		"\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0003\u00c9\u09a7"+
		"\b\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001"+
		"\u00c9\u0003\u00c9\u09af\b\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001"+
		"\u00c9\u0001\u00c9\u0003\u00c9\u09b6\b\u00c9\u0001\u00c9\u0001\u00c9\u0001"+
		"\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0003\u00c9\u09be\b\u00c9\u0001"+
		"\u00ca\u0001\u00ca\u0003\u00ca\u09c2\b\u00ca\u0001\u00ca\u0001\u00ca\u0001"+
		"\u00cb\u0001\u00cb\u0001\u00cb\u0003\u00cb\u09c9\b\u00cb\u0001\u00cb\u0001"+
		"\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0003\u00cb\u09d0\b\u00cb\u0001"+
		"\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0003\u00cb\u09d7"+
		"\b\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0001"+
		"\u00cb\u0003\u00cb\u09df\b\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0001"+
		"\u00cb\u0001\u00cb\u0003\u00cb\u09e6\b\u00cb\u0001\u00cb\u0001\u00cb\u0001"+
		"\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0003\u00cb\u09ee\b\u00cb\u0001"+
		"\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0003\u00cc\u09f4\b\u00cc\u0001"+
		"\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0003\u00cc\u09fa\b\u00cc\u0001"+
		"\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001"+
		"\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0003\u00cc\u0a06\b\u00cc\u0001"+
		"\u00cd\u0001\u00cd\u0005\u00cd\u0a0a\b\u00cd\n\u00cd\f\u00cd\u0a0d\t\u00cd"+
		"\u0001\u00ce\u0005\u00ce\u0a10\b\u00ce\n\u00ce\f\u00ce\u0a13\t\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00cf\u0001\u00cf\u0001"+
		"\u00d0\u0001\u00d0\u0003\u00d0\u0a1d\b\u00d0\u0001\u00d1\u0001\u00d1\u0001"+
		"\u00d1\u0001\u00d1\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0003\u00d2\u0a26"+
		"\b\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0003"+
		"\u00d2\u0a2d\b\u00d2\u0001\u00d3\u0001\u00d3\u0001\u00d3\u0005\u00d3\u0a32"+
		"\b\u00d3\n\u00d3\f\u00d3\u0a35\t\u00d3\u0001\u00d4\u0001\u00d4\u0003\u00d4"+
		"\u0a39\b\u00d4\u0001\u00d5\u0001\u00d5\u0003\u00d5\u0a3d\b\u00d5\u0001"+
		"\u00d6\u0001\u00d6\u0001\u00d6\u0001\u00d6\u0001\u00d7\u0001\u00d7\u0001"+
		"\u00d7\u0003\u00d7\u0a46\b\u00d7\u0001\u00d8\u0001\u00d8\u0001\u00d9\u0001"+
		"\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0003"+
		"\u00d9\u0a51\b\u00d9\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001"+
		"\u00da\u0001\u00da\u0005\u00da\u0a59\b\u00da\n\u00da\f\u00da\u0a5c\t\u00da"+
		"\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db"+
		"\u0005\u00db\u0a64\b\u00db\n\u00db\f\u00db\u0a67\t\u00db\u0001\u00dc\u0001"+
		"\u00dc\u0001\u00dc\u0001\u00dc\u0001\u00dc\u0001\u00dc\u0005\u00dc\u0a6f"+
		"\b\u00dc\n\u00dc\f\u00dc\u0a72\t\u00dc\u0001\u00dd\u0001\u00dd\u0001\u00dd"+
		"\u0001\u00dd\u0001\u00dd\u0001\u00dd\u0005\u00dd\u0a7a\b\u00dd\n\u00dd"+
		"\f\u00dd\u0a7d\t\u00dd\u0001\u00de\u0001\u00de\u0001\u00de\u0001\u00de"+
		"\u0001\u00de\u0001\u00de\u0005\u00de\u0a85\b\u00de\n\u00de\f\u00de\u0a88"+
		"\t\u00de\u0001\u00df\u0001\u00df\u0001\u00df\u0001\u00df\u0001\u00df\u0001"+
		"\u00df\u0001\u00df\u0001\u00df\u0001\u00df\u0005\u00df\u0a93\b\u00df\n"+
		"\u00df\f\u00df\u0a96\t\u00df\u0001\u00e0\u0001\u00e0\u0001\u00e0\u0001"+
		"\u00e0\u0001\u00e0\u0001\u00e0\u0001\u00e0\u0001\u00e0\u0001\u00e0\u0001"+
		"\u00e0\u0001\u00e0\u0001\u00e0\u0001\u00e0\u0001\u00e0\u0001\u00e0\u0001"+
		"\u00e0\u0001\u00e0\u0001\u00e0\u0005\u00e0\u0aaa\b\u00e0\n\u00e0\f\u00e0"+
		"\u0aad\t\u00e0\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1"+
		"\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1"+
		"\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0005\u00e1"+
		"\u0abf\b\u00e1\n\u00e1\f\u00e1\u0ac2\t\u00e1\u0001\u00e2\u0001\u00e2\u0001"+
		"\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001"+
		"\u00e2\u0005\u00e2\u0acd\b\u00e2\n\u00e2\f\u00e2\u0ad0\t\u00e2\u0001\u00e3"+
		"\u0001\u00e3\u0001\u00e3\u0001\u00e3\u0001\u00e3\u0001\u00e3\u0001\u00e3"+
		"\u0001\u00e3\u0001\u00e3\u0001\u00e3\u0001\u00e3\u0001\u00e3\u0005\u00e3"+
		"\u0ade\b\u00e3\n\u00e3\f\u00e3\u0ae1\t\u00e3\u0001\u00e4\u0001\u00e4\u0001"+
		"\u00e4\u0001\u00e4\u0001\u00e4\u0001\u00e4\u0001\u00e4\u0003\u00e4\u0aea"+
		"\b\u00e4\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0001\u00e6\u0001\u00e6\u0001"+
		"\u00e6\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001"+
		"\u00e7\u0003\u00e7\u0af8\b\u00e7\u0001\u00e8\u0001\u00e8\u0003\u00e8\u0afc"+
		"\b\u00e8\u0001\u00e8\u0001\u00e8\u0005\u00e8\u0b00\b\u00e8\n\u00e8\f\u00e8"+
		"\u0b03\t\u00e8\u0001\u00e9\u0001\u00e9\u0001\u00e9\u0001\u00ea\u0001\u00ea"+
		"\u0001\u00eb\u0001\u00eb\u0001\u00eb\u0001\u00ec\u0001\u00ec\u0001\u00ed"+
		"\u0001\u00ed\u0001\u00ed\u0001\u00ed\u0001\u00ed\u0001\u00ed\u0001\u00ed"+
		"\u0001\u00ed\u0005\u00ed\u0b17\b\u00ed\n\u00ed\f\u00ed\u0b1a\t\u00ed\u0001"+
		"\u00ed\u0001\u00ed\u0001\u00ed\u0001\u00ed\u0001\u00ed\u0001\u00ed\u0005"+
		"\u00ed\u0b22\b\u00ed\n\u00ed\f\u00ed\u0b25\t\u00ed\u0001\u00ed\u0001\u00ed"+
		"\u0001\u00ed\u0003\u00ed\u0b2a\b\u00ed\u0001\u00ed\u0000\r26<\u01b4\u01b6"+
		"\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u00ee\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146"+
		"\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e"+
		"\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176"+
		"\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e"+
		"\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6"+
		"\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be"+
		"\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6"+
		"\u01d8\u01da\u0000\u0006\u0001\u0000CH\u0005\u0000\u0005\u0005\b\b\u001b"+
		"\u001b\u001d\u001d%%\u0002\u0000\u000e\u000e\u0014\u0014\u0001\u00003"+
		"6\u0001\u00009:\u0002\u0000RRku\u0c24\u0000\u01dc\u0001\u0000\u0000\u0000"+
		"\u0002\u01ec\u0001\u0000\u0000\u0000\u0004\u01f0\u0001\u0000\u0000\u0000"+
		"\u0006\u01f2\u0001\u0000\u0000\u0000\b\u01f4\u0001\u0000\u0000\u0000\n"+
		"\u01f9\u0001\u0000\u0000\u0000\f\u01fd\u0001\u0000\u0000\u0000\u000e\u021c"+
		"\u0001\u0000\u0000\u0000\u0010\u021e\u0001\u0000\u0000\u0000\u0012\u022c"+
		"\u0001\u0000\u0000\u0000\u0014\u0233\u0001\u0000\u0000\u0000\u0016\u0235"+
		"\u0001\u0000\u0000\u0000\u0018\u0237\u0001\u0000\u0000\u0000\u001a\u023c"+
		"\u0001\u0000\u0000\u0000\u001c\u024a\u0001\u0000\u0000\u0000\u001e\u024f"+
		"\u0001\u0000\u0000\u0000 \u0264\u0001\u0000\u0000\u0000\"\u026b\u0001"+
		"\u0000\u0000\u0000$\u0277\u0001\u0000\u0000\u0000&\u0279\u0001\u0000\u0000"+
		"\u0000(\u027c\u0001\u0000\u0000\u0000*\u0280\u0001\u0000\u0000\u0000,"+
		"\u028a\u0001\u0000\u0000\u0000.\u028f\u0001\u0000\u0000\u00000\u029a\u0001"+
		"\u0000\u0000\u00002\u029c\u0001\u0000\u0000\u00004\u02ac\u0001\u0000\u0000"+
		"\u00006\u02ae\u0001\u0000\u0000\u00008\u02be\u0001\u0000\u0000\u0000:"+
		"\u02c0\u0001\u0000\u0000\u0000<\u02c2\u0001\u0000\u0000\u0000>\u02ce\u0001"+
		"\u0000\u0000\u0000@\u02e1\u0001\u0000\u0000\u0000B\u02e8\u0001\u0000\u0000"+
		"\u0000D\u02ee\u0001\u0000\u0000\u0000F\u02f0\u0001\u0000\u0000\u0000H"+
		"\u02f4\u0001\u0000\u0000\u0000J\u02fa\u0001\u0000\u0000\u0000L\u0301\u0001"+
		"\u0000\u0000\u0000N\u030b\u0001\u0000\u0000\u0000P\u030f\u0001\u0000\u0000"+
		"\u0000R\u0314\u0001\u0000\u0000\u0000T\u0324\u0001\u0000\u0000\u0000V"+
		"\u032e\u0001\u0000\u0000\u0000X\u0330\u0001\u0000\u0000\u0000Z\u0334\u0001"+
		"\u0000\u0000\u0000\\\u033c\u0001\u0000\u0000\u0000^\u033f\u0001\u0000"+
		"\u0000\u0000`\u0342\u0001\u0000\u0000\u0000b\u034a\u0001\u0000\u0000\u0000"+
		"d\u0357\u0001\u0000\u0000\u0000f\u035e\u0001\u0000\u0000\u0000h\u0363"+
		"\u0001\u0000\u0000\u0000j\u0375\u0001\u0000\u0000\u0000l\u0377\u0001\u0000"+
		"\u0000\u0000n\u037f\u0001\u0000\u0000\u0000p\u0384\u0001\u0000\u0000\u0000"+
		"r\u038a\u0001\u0000\u0000\u0000t\u038e\u0001\u0000\u0000\u0000v\u0392"+
		"\u0001\u0000\u0000\u0000x\u0397\u0001\u0000\u0000\u0000z\u039b\u0001\u0000"+
		"\u0000\u0000|\u03b4\u0001\u0000\u0000\u0000~\u03b6\u0001\u0000\u0000\u0000"+
		"\u0080\u03c1\u0001\u0000\u0000\u0000\u0082\u03c5\u0001\u0000\u0000\u0000"+
		"\u0084\u03c7\u0001\u0000\u0000\u0000\u0086\u03c9\u0001\u0000\u0000\u0000"+
		"\u0088\u03cb\u0001\u0000\u0000\u0000\u008a\u03d6\u0001\u0000\u0000\u0000"+
		"\u008c\u03db\u0001\u0000\u0000\u0000\u008e\u03f0\u0001\u0000\u0000\u0000"+
		"\u0090\u0403\u0001\u0000\u0000\u0000\u0092\u0407\u0001\u0000\u0000\u0000"+
		"\u0094\u0409\u0001\u0000\u0000\u0000\u0096\u0418\u0001\u0000\u0000\u0000"+
		"\u0098\u042a\u0001\u0000\u0000\u0000\u009a\u042f\u0001\u0000\u0000\u0000"+
		"\u009c\u0438\u0001\u0000\u0000\u0000\u009e\u044b\u0001\u0000\u0000\u0000"+
		"\u00a0\u0450\u0001\u0000\u0000\u0000\u00a2\u045a\u0001\u0000\u0000\u0000"+
		"\u00a4\u045d\u0001\u0000\u0000\u0000\u00a6\u0467\u0001\u0000\u0000\u0000"+
		"\u00a8\u046b\u0001\u0000\u0000\u0000\u00aa\u046d\u0001\u0000\u0000\u0000"+
		"\u00ac\u046f\u0001\u0000\u0000\u0000\u00ae\u0475\u0001\u0000\u0000\u0000"+
		"\u00b0\u0482\u0001\u0000\u0000\u0000\u00b2\u0485\u0001\u0000\u0000\u0000"+
		"\u00b4\u048e\u0001\u0000\u0000\u0000\u00b6\u0490\u0001\u0000\u0000\u0000"+
		"\u00b8\u04c7\u0001\u0000\u0000\u0000\u00ba\u04cc\u0001\u0000\u0000\u0000"+
		"\u00bc\u04d6\u0001\u0000\u0000\u0000\u00be\u04e2\u0001\u0000\u0000\u0000"+
		"\u00c0\u04ed\u0001\u0000\u0000\u0000\u00c2\u04fb\u0001\u0000\u0000\u0000"+
		"\u00c4\u04fd\u0001\u0000\u0000\u0000\u00c6\u0506\u0001\u0000\u0000\u0000"+
		"\u00c8\u050b\u0001\u0000\u0000\u0000\u00ca\u0518\u0001\u0000\u0000\u0000"+
		"\u00cc\u0521\u0001\u0000\u0000\u0000\u00ce\u0523\u0001\u0000\u0000\u0000"+
		"\u00d0\u0526\u0001\u0000\u0000\u0000\u00d2\u0534\u0001\u0000\u0000\u0000"+
		"\u00d4\u0539\u0001\u0000\u0000\u0000\u00d6\u0544\u0001\u0000\u0000\u0000"+
		"\u00d8\u0549\u0001\u0000\u0000\u0000\u00da\u0555\u0001\u0000\u0000\u0000"+
		"\u00dc\u055a\u0001\u0000\u0000\u0000\u00de\u0562\u0001\u0000\u0000\u0000"+
		"\u00e0\u0570\u0001\u0000\u0000\u0000\u00e2\u0575\u0001\u0000\u0000\u0000"+
		"\u00e4\u0587\u0001\u0000\u0000\u0000\u00e6\u0589\u0001\u0000\u0000\u0000"+
		"\u00e8\u058f\u0001\u0000\u0000\u0000\u00ea\u0591\u0001\u0000\u0000\u0000"+
		"\u00ec\u0599\u0001\u0000\u0000\u0000\u00ee\u05a1\u0001\u0000\u0000\u0000"+
		"\u00f0\u05a8\u0001\u0000\u0000\u0000\u00f2\u05aa\u0001\u0000\u0000\u0000"+
		"\u00f4\u05b3\u0001\u0000\u0000\u0000\u00f6\u05bb\u0001\u0000\u0000\u0000"+
		"\u00f8\u05be\u0001\u0000\u0000\u0000\u00fa\u05c4\u0001\u0000\u0000\u0000"+
		"\u00fc\u05cd\u0001\u0000\u0000\u0000\u00fe\u05d5\u0001\u0000\u0000\u0000"+
		"\u0100\u05dc\u0001\u0000\u0000\u0000\u0102\u05e3\u0001\u0000\u0000\u0000"+
		"\u0104\u05e5\u0001\u0000\u0000\u0000\u0106\u05eb\u0001\u0000\u0000\u0000"+
		"\u0108\u05f7\u0001\u0000\u0000\u0000\u010a\u05fe\u0001\u0000\u0000\u0000"+
		"\u010c\u060c\u0001\u0000\u0000\u0000\u010e\u060e\u0001\u0000\u0000\u0000"+
		"\u0110\u0610\u0001\u0000\u0000\u0000\u0112\u0614\u0001\u0000\u0000\u0000"+
		"\u0114\u0618\u0001\u0000\u0000\u0000\u0116\u0622\u0001\u0000\u0000\u0000"+
		"\u0118\u0624\u0001\u0000\u0000\u0000\u011a\u062a\u0001\u0000\u0000\u0000"+
		"\u011c\u0632\u0001\u0000\u0000\u0000\u011e\u0644\u0001\u0000\u0000\u0000"+
		"\u0120\u0646\u0001\u0000\u0000\u0000\u0122\u064c\u0001\u0000\u0000\u0000"+
		"\u0124\u065b\u0001\u0000\u0000\u0000\u0126\u065e\u0001\u0000\u0000\u0000"+
		"\u0128\u066f\u0001\u0000\u0000\u0000\u012a\u0671\u0001\u0000\u0000\u0000"+
		"\u012c\u0673\u0001\u0000\u0000\u0000\u012e\u0679\u0001\u0000\u0000\u0000"+
		"\u0130\u067f\u0001\u0000\u0000\u0000\u0132\u0689\u0001\u0000\u0000\u0000"+
		"\u0134\u068d\u0001\u0000\u0000\u0000\u0136\u068f\u0001\u0000\u0000\u0000"+
		"\u0138\u069f\u0001\u0000\u0000\u0000\u013a\u06b1\u0001\u0000\u0000\u0000"+
		"\u013c\u06b3\u0001\u0000\u0000\u0000\u013e\u06b5\u0001\u0000\u0000\u0000"+
		"\u0140\u06bd\u0001\u0000\u0000\u0000\u0142\u06cc\u0001\u0000\u0000\u0000"+
		"\u0144\u06db\u0001\u0000\u0000\u0000\u0146\u06e1\u0001\u0000\u0000\u0000"+
		"\u0148\u06e7\u0001\u0000\u0000\u0000\u014a\u06ed\u0001\u0000\u0000\u0000"+
		"\u014c\u06f1\u0001\u0000\u0000\u0000\u014e\u0703\u0001\u0000\u0000\u0000"+
		"\u0150\u0705\u0001\u0000\u0000\u0000\u0152\u070c\u0001\u0000\u0000\u0000"+
		"\u0154\u0715\u0001\u0000\u0000\u0000\u0156\u071b\u0001\u0000\u0000\u0000"+
		"\u0158\u0723\u0001\u0000\u0000\u0000\u015a\u0726\u0001\u0000\u0000\u0000"+
		"\u015c\u072f\u0001\u0000\u0000\u0000\u015e\u0736\u0001\u0000\u0000\u0000"+
		"\u0160\u0741\u0001\u0000\u0000\u0000\u0162\u074b\u0001\u0000\u0000\u0000"+
		"\u0164\u0770\u0001\u0000\u0000\u0000\u0166\u0772\u0001\u0000\u0000\u0000"+
		"\u0168\u0790\u0001\u0000\u0000\u0000\u016a\u0797\u0001\u0000\u0000\u0000"+
		"\u016c\u0799\u0001\u0000\u0000\u0000\u016e\u079f\u0001\u0000\u0000\u0000"+
		"\u0170\u07c9\u0001\u0000\u0000\u0000\u0172\u07cb\u0001\u0000\u0000\u0000"+
		"\u0174\u07f4\u0001\u0000\u0000\u0000\u0176\u0849\u0001\u0000\u0000\u0000"+
		"\u0178\u084b\u0001\u0000\u0000\u0000\u017a\u089d\u0001\u0000\u0000\u0000"+
		"\u017c\u08a2\u0001\u0000\u0000\u0000\u017e\u08b1\u0001\u0000\u0000\u0000"+
		"\u0180\u08b3\u0001\u0000\u0000\u0000\u0182\u08bf\u0001\u0000\u0000\u0000"+
		"\u0184\u08cb\u0001\u0000\u0000\u0000\u0186\u08d7\u0001\u0000\u0000\u0000"+
		"\u0188\u08ef\u0001\u0000\u0000\u0000\u018a\u093f\u0001\u0000\u0000\u0000"+
		"\u018c\u0941\u0001\u0000\u0000\u0000\u018e\u0984\u0001\u0000\u0000\u0000"+
		"\u0190\u0986\u0001\u0000\u0000\u0000\u0192\u09bd\u0001\u0000\u0000\u0000"+
		"\u0194\u09bf\u0001\u0000\u0000\u0000\u0196\u09ed\u0001\u0000\u0000\u0000"+
		"\u0198\u0a05\u0001\u0000\u0000\u0000\u019a\u0a07\u0001\u0000\u0000\u0000"+
		"\u019c\u0a11\u0001\u0000\u0000\u0000\u019e\u0a18\u0001\u0000\u0000\u0000"+
		"\u01a0\u0a1c\u0001\u0000\u0000\u0000\u01a2\u0a1e\u0001\u0000\u0000\u0000"+
		"\u01a4\u0a2c\u0001\u0000\u0000\u0000\u01a6\u0a2e\u0001\u0000\u0000\u0000"+
		"\u01a8\u0a38\u0001\u0000\u0000\u0000\u01aa\u0a3c\u0001\u0000\u0000\u0000"+
		"\u01ac\u0a3e\u0001\u0000\u0000\u0000\u01ae\u0a45\u0001\u0000\u0000\u0000"+
		"\u01b0\u0a47\u0001\u0000\u0000\u0000\u01b2\u0a50\u0001\u0000\u0000\u0000"+
		"\u01b4\u0a52\u0001\u0000\u0000\u0000\u01b6\u0a5d\u0001\u0000\u0000\u0000"+
		"\u01b8\u0a68\u0001\u0000\u0000\u0000\u01ba\u0a73\u0001\u0000\u0000\u0000"+
		"\u01bc\u0a7e\u0001\u0000\u0000\u0000\u01be\u0a89\u0001\u0000\u0000\u0000"+
		"\u01c0\u0a97\u0001\u0000\u0000\u0000\u01c2\u0aae\u0001\u0000\u0000\u0000"+
		"\u01c4\u0ac3\u0001\u0000\u0000\u0000\u01c6\u0ad1\u0001\u0000\u0000\u0000"+
		"\u01c8\u0ae9\u0001\u0000\u0000\u0000\u01ca\u0aeb\u0001\u0000\u0000\u0000"+
		"\u01cc\u0aee\u0001\u0000\u0000\u0000\u01ce\u0af7\u0001\u0000\u0000\u0000"+
		"\u01d0\u0afb\u0001\u0000\u0000\u0000\u01d2\u0b04\u0001\u0000\u0000\u0000"+
		"\u01d4\u0b07\u0001\u0000\u0000\u0000\u01d6\u0b09\u0001\u0000\u0000\u0000"+
		"\u01d8\u0b0c\u0001\u0000\u0000\u0000\u01da\u0b29\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0007\u0000\u0000\u0000\u01dd\u0001\u0001\u0000\u0000\u0000"+
		"\u01de\u01e0\u0003\u00e8t\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e4\u01ed\u0003\u0004\u0002\u0000\u01e5"+
		"\u01e7\u0003\u00e8t\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7\u01ea"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0001\u0000\u0000\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e8"+
		"\u0001\u0000\u0000\u0000\u01eb\u01ed\u0005\u0003\u0000\u0000\u01ec\u01e1"+
		"\u0001\u0000\u0000\u0000\u01ec\u01e8\u0001\u0000\u0000\u0000\u01ed\u0003"+
		"\u0001\u0000\u0000\u0000\u01ee\u01f1\u0003\u0006\u0003\u0000\u01ef\u01f1"+
		"\u0003\b\u0004\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f1\u0005\u0001\u0000\u0000\u0000\u01f2\u01f3\u0007"+
		"\u0001\u0000\u0000\u01f3\u0007\u0001\u0000\u0000\u0000\u01f4\u01f5\u0007"+
		"\u0002\u0000\u0000\u01f5\t\u0001\u0000\u0000\u0000\u01f6\u01fa\u0003\f"+
		"\u0006\u0000\u01f7\u01fa\u0003\u001a\r\u0000\u01f8\u01fa\u0003\u001c\u000e"+
		"\u0000\u01f9\u01f6\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01fa\u000b\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fe\u0003\u0012\t\u0000\u01fc\u01fe\u0003\u0018\f\u0000"+
		"\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fe\u0203\u0001\u0000\u0000\u0000\u01ff\u0202\u0003\u0010\b\u0000\u0200"+
		"\u0202\u0003\u0016\u000b\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201"+
		"\u0200\u0001\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203"+
		"\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204"+
		"\r\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u0208"+
		"\u0003\u00e8t\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u020b\u0001"+
		"\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001"+
		"\u0000\u0000\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u0209\u0001"+
		"\u0000\u0000\u0000\u020c\u020e\u0005v\u0000\u0000\u020d\u020f\u0003(\u0014"+
		"\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000"+
		"\u0000\u020f\u021d\u0001\u0000\u0000\u0000\u0210\u0211\u0003\f\u0006\u0000"+
		"\u0211\u0215\u0005Q\u0000\u0000\u0212\u0214\u0003\u00e8t\u0000\u0213\u0212"+
		"\u0001\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215\u0213"+
		"\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0218"+
		"\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218\u021a"+
		"\u0005v\u0000\u0000\u0219\u021b\u0003(\u0014\u0000\u021a\u0219\u0001\u0000"+
		"\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021d\u0001\u0000"+
		"\u0000\u0000\u021c\u0209\u0001\u0000\u0000\u0000\u021c\u0210\u0001\u0000"+
		"\u0000\u0000\u021d\u000f\u0001\u0000\u0000\u0000\u021e\u0222\u0005Q\u0000"+
		"\u0000\u021f\u0221\u0003\u00e8t\u0000\u0220\u021f\u0001\u0000\u0000\u0000"+
		"\u0221\u0224\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000"+
		"\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0225\u0001\u0000\u0000\u0000"+
		"\u0224\u0222\u0001\u0000\u0000\u0000\u0225\u0227\u0005v\u0000\u0000\u0226"+
		"\u0228\u0003(\u0014\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0227\u0228"+
		"\u0001\u0000\u0000\u0000\u0228\u0011\u0001\u0000\u0000\u0000\u0229\u022b"+
		"\u0003\u00e8t\u0000\u022a\u0229\u0001\u0000\u0000\u0000\u022b\u022e\u0001"+
		"\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001"+
		"\u0000\u0000\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u022c\u0001"+
		"\u0000\u0000\u0000\u022f\u0231\u0005v\u0000\u0000\u0230\u0232\u0003(\u0014"+
		"\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000"+
		"\u0000\u0232\u0013\u0001\u0000\u0000\u0000\u0233\u0234\u0003\u000e\u0007"+
		"\u0000\u0234\u0015\u0001\u0000\u0000\u0000\u0235\u0236\u0003\u0010\b\u0000"+
		"\u0236\u0017\u0001\u0000\u0000\u0000\u0237\u0238\u0003\u0012\t\u0000\u0238"+
		"\u0019\u0001\u0000\u0000\u0000\u0239\u023b\u0003\u00e8t\u0000\u023a\u0239"+
		"\u0001\u0000\u0000\u0000\u023b\u023e\u0001\u0000\u0000\u0000\u023c\u023a"+
		"\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023f"+
		"\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023f\u0240"+
		"\u0005v\u0000\u0000\u0240\u001b\u0001\u0000\u0000\u0000\u0241\u0242\u0003"+
		"\u0002\u0001\u0000\u0242\u0243\u0003\u001e\u000f\u0000\u0243\u024b\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0003\f\u0006\u0000\u0245\u0246\u0003\u001e"+
		"\u000f\u0000\u0246\u024b\u0001\u0000\u0000\u0000\u0247\u0248\u0003\u001a"+
		"\r\u0000\u0248\u0249\u0003\u001e\u000f\u0000\u0249\u024b\u0001\u0000\u0000"+
		"\u0000\u024a\u0241\u0001\u0000\u0000\u0000\u024a\u0244\u0001\u0000\u0000"+
		"\u0000\u024a\u0247\u0001\u0000\u0000\u0000\u024b\u001d\u0001\u0000\u0000"+
		"\u0000\u024c\u024e\u0003\u00e8t\u0000\u024d\u024c\u0001\u0000\u0000\u0000"+
		"\u024e\u0251\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000"+
		"\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0252\u0001\u0000\u0000\u0000"+
		"\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0253\u0005M\u0000\u0000\u0253"+
		"\u025e\u0005N\u0000\u0000\u0254\u0256\u0003\u00e8t\u0000\u0255\u0254\u0001"+
		"\u0000\u0000\u0000\u0256\u0259\u0001\u0000\u0000\u0000\u0257\u0255\u0001"+
		"\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u025a\u0001"+
		"\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u025a\u025b\u0005"+
		"M\u0000\u0000\u025b\u025d\u0005N\u0000\u0000\u025c\u0257\u0001\u0000\u0000"+
		"\u0000\u025d\u0260\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000"+
		"\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u001f\u0001\u0000\u0000"+
		"\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0261\u0263\u0003\"\u0011\u0000"+
		"\u0262\u0261\u0001\u0000\u0000\u0000\u0263\u0266\u0001\u0000\u0000\u0000"+
		"\u0264\u0262\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000"+
		"\u0265\u0267\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000"+
		"\u0267\u0269\u0005v\u0000\u0000\u0268\u026a\u0003$\u0012\u0000\u0269\u0268"+
		"\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a!\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0003\u00e8t\u0000\u026c#\u0001\u0000\u0000"+
		"\u0000\u026d\u026e\u0005\u0011\u0000\u0000\u026e\u0278\u0003\u001a\r\u0000"+
		"\u026f\u0270\u0005\u0011\u0000\u0000\u0270\u0274\u0003\f\u0006\u0000\u0271"+
		"\u0273\u0003&\u0013\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0276"+
		"\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275"+
		"\u0001\u0000\u0000\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274"+
		"\u0001\u0000\u0000\u0000\u0277\u026d\u0001\u0000\u0000\u0000\u0277\u026f"+
		"\u0001\u0000\u0000\u0000\u0278%\u0001\u0000\u0000\u0000\u0279\u027a\u0005"+
		"e\u0000\u0000\u027a\u027b\u0003\u0014\n\u0000\u027b\'\u0001\u0000\u0000"+
		"\u0000\u027c\u027d\u0005T\u0000\u0000\u027d\u027e\u0003*\u0015\u0000\u027e"+
		"\u027f\u0005S\u0000\u0000\u027f)\u0001\u0000\u0000\u0000\u0280\u0285\u0003"+
		",\u0016\u0000\u0281\u0282\u0005P\u0000\u0000\u0282\u0284\u0003,\u0016"+
		"\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000\u0000"+
		"\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000"+
		"\u0000\u0286+\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000"+
		"\u0288\u028b\u0003\n\u0005\u0000\u0289\u028b\u0003.\u0017\u0000\u028a"+
		"\u0288\u0001\u0000\u0000\u0000\u028a\u0289\u0001\u0000\u0000\u0000\u028b"+
		"-\u0001\u0000\u0000\u0000\u028c\u028e\u0003\u00e8t\u0000\u028d\u028c\u0001"+
		"\u0000\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d\u0001"+
		"\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0292\u0001"+
		"\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0294\u0005"+
		"W\u0000\u0000\u0293\u0295\u00030\u0018\u0000\u0294\u0293\u0001\u0000\u0000"+
		"\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295/\u0001\u0000\u0000\u0000"+
		"\u0296\u0297\u0005\u0011\u0000\u0000\u0297\u029b\u0003\n\u0005\u0000\u0298"+
		"\u0299\u0005(\u0000\u0000\u0299\u029b\u0003\n\u0005\u0000\u029a\u0296"+
		"\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000\u029b1\u0001"+
		"\u0000\u0000\u0000\u029c\u029d\u0006\u0019\uffff\uffff\u0000\u029d\u029e"+
		"\u0005v\u0000\u0000\u029e\u02a4\u0001\u0000\u0000\u0000\u029f\u02a0\n"+
		"\u0001\u0000\u0000\u02a0\u02a1\u0005Q\u0000\u0000\u02a1\u02a3\u0005v\u0000"+
		"\u0000\u02a2\u029f\u0001\u0000\u0000\u0000\u02a3\u02a6\u0001\u0000\u0000"+
		"\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a53\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000"+
		"\u02a7\u02ad\u0005v\u0000\u0000\u02a8\u02a9\u00036\u001b\u0000\u02a9\u02aa"+
		"\u0005Q\u0000\u0000\u02aa\u02ab\u0005v\u0000\u0000\u02ab\u02ad\u0001\u0000"+
		"\u0000\u0000\u02ac\u02a7\u0001\u0000\u0000\u0000\u02ac\u02a8\u0001\u0000"+
		"\u0000\u0000\u02ad5\u0001\u0000\u0000\u0000\u02ae\u02af\u0006\u001b\uffff"+
		"\uffff\u0000\u02af\u02b0\u0005v\u0000\u0000\u02b0\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b1\u02b2\n\u0001\u0000\u0000\u02b2\u02b3\u0005Q\u0000\u0000"+
		"\u02b3\u02b5\u0005v\u0000\u0000\u02b4\u02b1\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b7\u0001\u0000\u0000\u0000\u02b77\u0001\u0000\u0000\u0000\u02b8\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b9\u02bf\u0005v\u0000\u0000\u02ba\u02bb\u0003"+
		"<\u001e\u0000\u02bb\u02bc\u0005Q\u0000\u0000\u02bc\u02bd\u0005v\u0000"+
		"\u0000\u02bd\u02bf\u0001\u0000\u0000\u0000\u02be\u02b9\u0001\u0000\u0000"+
		"\u0000\u02be\u02ba\u0001\u0000\u0000\u0000\u02bf9\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c1\u0005v\u0000\u0000\u02c1;\u0001\u0000\u0000\u0000\u02c2\u02c3"+
		"\u0006\u001e\uffff\uffff\u0000\u02c3\u02c4\u0005v\u0000\u0000\u02c4\u02ca"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c6\n\u0001\u0000\u0000\u02c6\u02c7\u0005"+
		"Q\u0000\u0000\u02c7\u02c9\u0005v\u0000\u0000\u02c8\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb=\u0001\u0000\u0000\u0000"+
		"\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd\u02cf\u0003@ \u0000\u02ce\u02cd"+
		"\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d0\u02d2\u0003D\"\u0000\u02d1\u02d0\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d5\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d9\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d6\u02d8\u0003"+
		"N\'\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d8\u02db\u0001\u0000"+
		"\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000"+
		"\u0000\u0000\u02da\u02dc\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000"+
		"\u0000\u0000\u02dc\u02dd\u0005\u0000\u0000\u0001\u02dd?\u0001\u0000\u0000"+
		"\u0000\u02de\u02e0\u0003B!\u0000\u02df\u02de\u0001\u0000\u0000\u0000\u02e0"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e4\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005 \u0000\u0000\u02e5\u02e6"+
		"\u00032\u0019\u0000\u02e6\u02e7\u0005O\u0000\u0000\u02e7A\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e9\u0003\u00e8t\u0000\u02e9C\u0001\u0000\u0000\u0000"+
		"\u02ea\u02ef\u0003F#\u0000\u02eb\u02ef\u0003H$\u0000\u02ec\u02ef\u0003"+
		"J%\u0000\u02ed\u02ef\u0003L&\u0000\u02ee\u02ea\u0001\u0000\u0000\u0000"+
		"\u02ee\u02eb\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ed\u0001\u0000\u0000\u0000\u02efE\u0001\u0000\u0000\u0000\u02f0"+
		"\u02f1\u0005\u0019\u0000\u0000\u02f1\u02f2\u00034\u001a\u0000\u02f2\u02f3"+
		"\u0005O\u0000\u0000\u02f3G\u0001\u0000\u0000\u0000\u02f4\u02f5\u0005\u0019"+
		"\u0000\u0000\u02f5\u02f6\u00036\u001b\u0000\u02f6\u02f7\u0005Q\u0000\u0000"+
		"\u02f7\u02f8\u0005c\u0000\u0000\u02f8\u02f9\u0005O\u0000\u0000\u02f9I"+
		"\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005\u0019\u0000\u0000\u02fb\u02fc"+
		"\u0005&\u0000\u0000\u02fc\u02fd\u00034\u001a\u0000\u02fd\u02fe\u0005Q"+
		"\u0000\u0000\u02fe\u02ff\u0005v\u0000\u0000\u02ff\u0300\u0005O\u0000\u0000"+
		"\u0300K\u0001\u0000\u0000\u0000\u0301\u0302\u0005\u0019\u0000\u0000\u0302"+
		"\u0303\u0005&\u0000\u0000\u0303\u0304\u00034\u001a\u0000\u0304\u0305\u0005"+
		"Q\u0000\u0000\u0305\u0306\u0005c\u0000\u0000\u0306\u0307\u0005O\u0000"+
		"\u0000\u0307M\u0001\u0000\u0000\u0000\u0308\u030c\u0003P(\u0000\u0309"+
		"\u030c\u0003\u00c6c\u0000\u030a\u030c\u0005O\u0000\u0000\u030b\u0308\u0001"+
		"\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030b\u030a\u0001"+
		"\u0000\u0000\u0000\u030cO\u0001\u0000\u0000\u0000\u030d\u0310\u0003R)"+
		"\u0000\u030e\u0310\u0003\u00ba]\u0000\u030f\u030d\u0001\u0000\u0000\u0000"+
		"\u030f\u030e\u0001\u0000\u0000\u0000\u0310Q\u0001\u0000\u0000\u0000\u0311"+
		"\u0313\u0003V+\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0313\u0316\u0001"+
		"\u0000\u0000\u0000\u0314\u0312\u0001\u0000\u0000\u0000\u0314\u0315\u0001"+
		"\u0000\u0000\u0000\u0315\u0317\u0001\u0000\u0000\u0000\u0316\u0314\u0001"+
		"\u0000\u0000\u0000\u0317\u0318\u0003T*\u0000\u0318\u031a\u0005v\u0000"+
		"\u0000\u0319\u031b\u0003X,\u0000\u031a\u0319\u0001\u0000\u0000\u0000\u031a"+
		"\u031b\u0001\u0000\u0000\u0000\u031b\u031d\u0001\u0000\u0000\u0000\u031c"+
		"\u031e\u0003\\.\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031d\u031e"+
		"\u0001\u0000\u0000\u0000\u031e\u0320\u0001\u0000\u0000\u0000\u031f\u0321"+
		"\u0003^/\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000"+
		"\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0323\u0003b1\u0000"+
		"\u0323S\u0001\u0000\u0000\u0000\u0324\u0325\u0007\u0003\u0000\u0000\u0325"+
		"U\u0001\u0000\u0000\u0000\u0326\u032f\u0003\u00e8t\u0000\u0327\u032f\u0005"+
		"#\u0000\u0000\u0328\u032f\u0005\"\u0000\u0000\u0329\u032f\u0005!\u0000"+
		"\u0000\u032a\u032f\u0005\u0001\u0000\u0000\u032b\u032f\u0005&\u0000\u0000"+
		"\u032c\u032f\u0005\u0012\u0000\u0000\u032d\u032f\u0005\'\u0000\u0000\u032e"+
		"\u0326\u0001\u0000\u0000\u0000\u032e\u0327\u0001\u0000\u0000\u0000\u032e"+
		"\u0328\u0001\u0000\u0000\u0000\u032e\u0329\u0001\u0000\u0000\u0000\u032e"+
		"\u032a\u0001\u0000\u0000\u0000\u032e\u032b\u0001\u0000\u0000\u0000\u032e"+
		"\u032c\u0001\u0000\u0000\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032f"+
		"W\u0001\u0000\u0000\u0000\u0330\u0331\u0005T\u0000\u0000\u0331\u0332\u0003"+
		"Z-\u0000\u0332\u0333\u0005S\u0000\u0000\u0333Y\u0001\u0000\u0000\u0000"+
		"\u0334\u0339\u0003 \u0010\u0000\u0335\u0336\u0005P\u0000\u0000\u0336\u0338"+
		"\u0003 \u0010\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338\u033b\u0001"+
		"\u0000\u0000\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u0339\u033a\u0001"+
		"\u0000\u0000\u0000\u033a[\u0001\u0000\u0000\u0000\u033b\u0339\u0001\u0000"+
		"\u0000\u0000\u033c\u033d\u00057\u0000\u0000\u033d\u033e\u0003\u000e\u0007"+
		"\u0000\u033e]\u0001\u0000\u0000\u0000\u033f\u0340\u00058\u0000\u0000\u0340"+
		"\u0341\u0003`0\u0000\u0341_\u0001\u0000\u0000\u0000\u0342\u0347\u0003"+
		"\u0014\n\u0000\u0343\u0344\u0005P\u0000\u0000\u0344\u0346\u0003\u0014"+
		"\n\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0346\u0349\u0001\u0000\u0000"+
		"\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000"+
		"\u0000\u0348a\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000"+
		"\u034a\u034e\u0005K\u0000\u0000\u034b\u034d\u0003d2\u0000\u034c\u034b"+
		"\u0001\u0000\u0000\u0000\u034d\u0350\u0001\u0000\u0000\u0000\u034e\u034c"+
		"\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000\u034f\u0351"+
		"\u0001\u0000\u0000\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0351\u0352"+
		"\u0005L\u0000\u0000\u0352c\u0001\u0000\u0000\u0000\u0353\u0358\u0003f"+
		"3\u0000\u0354\u0358\u0003\u00aaU\u0000\u0355\u0358\u0003\u00acV\u0000"+
		"\u0356\u0358\u0003\u00aeW\u0000\u0357\u0353\u0001\u0000\u0000\u0000\u0357"+
		"\u0354\u0001\u0000\u0000\u0000\u0357\u0355\u0001\u0000\u0000\u0000\u0357"+
		"\u0356\u0001\u0000\u0000\u0000\u0358e\u0001\u0000\u0000\u0000\u0359\u035f"+
		"\u0003h4\u0000\u035a\u035f\u0003\u008cF\u0000\u035b\u035f\u0003P(\u0000"+
		"\u035c\u035f\u0003\u00c6c\u0000\u035d\u035f\u0005O\u0000\u0000\u035e\u0359"+
		"\u0001\u0000\u0000\u0000\u035e\u035a\u0001\u0000\u0000\u0000\u035e\u035b"+
		"\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000\u0000\u035e\u035d"+
		"\u0001\u0000\u0000\u0000\u035fg\u0001\u0000\u0000\u0000\u0360\u0362\u0003"+
		"j5\u0000\u0361\u0360\u0001\u0000\u0000\u0000\u0362\u0365\u0001\u0000\u0000"+
		"\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000"+
		"\u0000\u0364\u0366\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000"+
		"\u0000\u0366\u0367\u0003t:\u0000\u0367\u0368\u0003l6\u0000\u0368\u0369"+
		"\u0005O\u0000\u0000\u0369i\u0001\u0000\u0000\u0000\u036a\u0376\u0003\u00e8"+
		"t\u0000\u036b\u0376\u0005#\u0000\u0000\u036c\u0376\u0005\"\u0000\u0000"+
		"\u036d\u0376\u0005!\u0000\u0000\u036e\u0376\u0005&\u0000\u0000\u036f\u0376"+
		"\u0005\u0012\u0000\u0000\u0370\u0376\u0005.\u0000\u0000\u0371\u0376\u0005"+
		"1\u0000\u0000\u0372\u0376\u0005;\u0000\u0000\u0373\u0376\u0005@\u0000"+
		"\u0000\u0374\u0376\u0005A\u0000\u0000\u0375\u036a\u0001\u0000\u0000\u0000"+
		"\u0375\u036b\u0001\u0000\u0000\u0000\u0375\u036c\u0001\u0000\u0000\u0000"+
		"\u0375\u036d\u0001\u0000\u0000\u0000\u0375\u036e\u0001\u0000\u0000\u0000"+
		"\u0375\u036f\u0001\u0000\u0000\u0000\u0375\u0370\u0001\u0000\u0000\u0000"+
		"\u0375\u0371\u0001\u0000\u0000\u0000\u0375\u0372\u0001\u0000\u0000\u0000"+
		"\u0375\u0373\u0001\u0000\u0000\u0000\u0375\u0374\u0001\u0000\u0000\u0000"+
		"\u0376k\u0001\u0000\u0000\u0000\u0377\u037c\u0003n7\u0000\u0378\u0379"+
		"\u0005P\u0000\u0000\u0379\u037b\u0003n7\u0000\u037a\u0378\u0001\u0000"+
		"\u0000\u0000\u037b\u037e\u0001\u0000\u0000\u0000\u037c\u037a\u0001\u0000"+
		"\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037dm\u0001\u0000\u0000"+
		"\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037f\u0382\u0003p8\u0000\u0380"+
		"\u0381\u0005R\u0000\u0000\u0381\u0383\u0003r9\u0000\u0382\u0380\u0001"+
		"\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383o\u0001\u0000"+
		"\u0000\u0000\u0384\u0386\u0005v\u0000\u0000\u0385\u0387\u0003\u001e\u000f"+
		"\u0000\u0386\u0385\u0001\u0000\u0000\u0000\u0386\u0387\u0001\u0000\u0000"+
		"\u0000\u0387q\u0001\u0000\u0000\u0000\u0388\u038b\u0003\u01a0\u00d0\u0000"+
		"\u0389\u038b\u0003\u00fa}\u0000\u038a\u0388\u0001\u0000\u0000\u0000\u038a"+
		"\u0389\u0001\u0000\u0000\u0000\u038bs\u0001\u0000\u0000\u0000\u038c\u038f"+
		"\u0003v;\u0000\u038d\u038f\u0003x<\u0000\u038e\u038c\u0001\u0000\u0000"+
		"\u0000\u038e\u038d\u0001\u0000\u0000\u0000\u038fu\u0001\u0000\u0000\u0000"+
		"\u0390\u0393\u0003\u0004\u0002\u0000\u0391\u0393\u0005\u0003\u0000\u0000"+
		"\u0392\u0390\u0001\u0000\u0000\u0000\u0392\u0391\u0001\u0000\u0000\u0000"+
		"\u0393w\u0001\u0000\u0000\u0000\u0394\u0398\u0003z=\u0000\u0395\u0398"+
		"\u0003\u0088D\u0000\u0396\u0398\u0003\u008aE\u0000\u0397\u0394\u0001\u0000"+
		"\u0000\u0000\u0397\u0395\u0001\u0000\u0000\u0000\u0397\u0396\u0001\u0000"+
		"\u0000\u0000\u0398y\u0001\u0000\u0000\u0000\u0399\u039c\u0003\u0080@\u0000"+
		"\u039a\u039c\u0003\u0086C\u0000\u039b\u0399\u0001\u0000\u0000\u0000\u039b"+
		"\u039a\u0001\u0000\u0000\u0000\u039c\u03a1\u0001\u0000\u0000\u0000\u039d"+
		"\u03a0\u0003~?\u0000\u039e\u03a0\u0003\u0084B\u0000\u039f\u039d\u0001"+
		"\u0000\u0000\u0000\u039f\u039e\u0001\u0000\u0000\u0000\u03a0\u03a3\u0001"+
		"\u0000\u0000\u0000\u03a1\u039f\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001"+
		"\u0000\u0000\u0000\u03a2{\u0001\u0000\u0000\u0000\u03a3\u03a1\u0001\u0000"+
		"\u0000\u0000\u03a4\u03a6\u0005v\u0000\u0000\u03a5\u03a7\u0003(\u0014\u0000"+
		"\u03a6\u03a5\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000"+
		"\u03a7\u03b5\u0001\u0000\u0000\u0000\u03a8\u03a9\u0003z=\u0000\u03a9\u03ad"+
		"\u0005Q\u0000\u0000\u03aa\u03ac\u0003\u00e8t\u0000\u03ab\u03aa\u0001\u0000"+
		"\u0000\u0000\u03ac\u03af\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000"+
		"\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae\u03b0\u0001\u0000"+
		"\u0000\u0000\u03af\u03ad\u0001\u0000\u0000\u0000\u03b0\u03b2\u0005v\u0000"+
		"\u0000\u03b1\u03b3\u0003(\u0014\u0000\u03b2\u03b1\u0001\u0000\u0000\u0000"+
		"\u03b2\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b5\u0001\u0000\u0000\u0000"+
		"\u03b4\u03a4\u0001\u0000\u0000\u0000\u03b4\u03a8\u0001\u0000\u0000\u0000"+
		"\u03b5}\u0001\u0000\u0000\u0000\u03b6\u03ba\u0005Q\u0000\u0000\u03b7\u03b9"+
		"\u0003\u00e8t\u0000\u03b8\u03b7\u0001\u0000\u0000\u0000\u03b9\u03bc\u0001"+
		"\u0000\u0000\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03ba\u03bb\u0001"+
		"\u0000\u0000\u0000\u03bb\u03bd\u0001\u0000\u0000\u0000\u03bc\u03ba\u0001"+
		"\u0000\u0000\u0000\u03bd\u03bf\u0005v\u0000\u0000\u03be\u03c0\u0003(\u0014"+
		"\u0000\u03bf\u03be\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000"+
		"\u0000\u03c0\u007f\u0001\u0000\u0000\u0000\u03c1\u03c3\u0005v\u0000\u0000"+
		"\u03c2\u03c4\u0003(\u0014\u0000\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c3"+
		"\u03c4\u0001\u0000\u0000\u0000\u03c4\u0081\u0001\u0000\u0000\u0000\u03c5"+
		"\u03c6\u0003|>\u0000\u03c6\u0083\u0001\u0000\u0000\u0000\u03c7\u03c8\u0003"+
		"~?\u0000\u03c8\u0085\u0001\u0000\u0000\u0000\u03c9\u03ca\u0003\u0080@"+
		"\u0000\u03ca\u0087\u0001\u0000\u0000\u0000\u03cb\u03cc\u0005v\u0000\u0000"+
		"\u03cc\u0089\u0001\u0000\u0000\u0000\u03cd\u03ce\u0003v;\u0000\u03ce\u03cf"+
		"\u0003\u001e\u000f\u0000\u03cf\u03d7\u0001\u0000\u0000\u0000\u03d0\u03d1"+
		"\u0003z=\u0000\u03d1\u03d2\u0003\u001e\u000f\u0000\u03d2\u03d7\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d4\u0003\u0088D\u0000\u03d4\u03d5\u0003\u001e\u000f"+
		"\u0000\u03d5\u03d7\u0001\u0000\u0000\u0000\u03d6\u03cd\u0001\u0000\u0000"+
		"\u0000\u03d6\u03d0\u0001\u0000\u0000\u0000\u03d6\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d7\u008b\u0001\u0000\u0000\u0000\u03d8\u03da\u0003\u008eG\u0000"+
		"\u03d9\u03d8\u0001\u0000\u0000\u0000\u03da\u03dd\u0001\u0000\u0000\u0000"+
		"\u03db\u03d9\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000"+
		"\u03dc\u03de\u0001\u0000\u0000\u0000\u03dd\u03db\u0001\u0000\u0000\u0000"+
		"\u03de\u03df\u0003\u0090H\u0000\u03df\u03e0\u0003\u00a8T\u0000\u03e0\u008d"+
		"\u0001\u0000\u0000\u0000\u03e1\u03f1\u0003\u00e8t\u0000\u03e2\u03f1\u0005"+
		"#\u0000\u0000\u03e3\u03f1\u0005\"\u0000\u0000\u03e4\u03f1\u0005!\u0000"+
		"\u0000\u03e5\u03f1\u0005\u0001\u0000\u0000\u03e6\u03f1\u0005&\u0000\u0000"+
		"\u03e7\u03f1\u0005\u0012\u0000\u0000\u03e8\u03f1\u0005*\u0000\u0000\u03e9"+
		"\u03f1\u0005\u001e\u0000\u0000\u03ea\u03f1\u0005\'\u0000\u0000\u03eb\u03f1"+
		"\u0005<\u0000\u0000\u03ec\u03f1\u0005=\u0000\u0000\u03ed\u03f1\u0005>"+
		"\u0000\u0000\u03ee\u03f1\u0005?\u0000\u0000\u03ef\u03f1\u0005B\u0000\u0000"+
		"\u03f0\u03e1\u0001\u0000\u0000\u0000\u03f0\u03e2\u0001\u0000\u0000\u0000"+
		"\u03f0\u03e3\u0001\u0000\u0000\u0000\u03f0\u03e4\u0001\u0000\u0000\u0000"+
		"\u03f0\u03e5\u0001\u0000\u0000\u0000\u03f0\u03e6\u0001\u0000\u0000\u0000"+
		"\u03f0\u03e7\u0001\u0000\u0000\u0000\u03f0\u03e8\u0001\u0000\u0000\u0000"+
		"\u03f0\u03e9\u0001\u0000\u0000\u0000\u03f0\u03ea\u0001\u0000\u0000\u0000"+
		"\u03f0\u03eb\u0001\u0000\u0000\u0000\u03f0\u03ec\u0001\u0000\u0000\u0000"+
		"\u03f0\u03ed\u0001\u0000\u0000\u0000\u03f0\u03ee\u0001\u0000\u0000\u0000"+
		"\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f1\u008f\u0001\u0000\u0000\u0000"+
		"\u03f2\u03f3\u0003\u0092I\u0000\u03f3\u03f5\u0003\u0094J\u0000\u03f4\u03f6"+
		"\u0003\u00a2Q\u0000\u03f5\u03f4\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001"+
		"\u0000\u0000\u0000\u03f6\u0404\u0001\u0000\u0000\u0000\u03f7\u03fb\u0003"+
		"X,\u0000\u03f8\u03fa\u0003\u00e8t\u0000\u03f9\u03f8\u0001\u0000\u0000"+
		"\u0000\u03fa\u03fd\u0001\u0000\u0000\u0000\u03fb\u03f9\u0001\u0000\u0000"+
		"\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc\u03fe\u0001\u0000\u0000"+
		"\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000\u03fe\u03ff\u0003\u0092I\u0000"+
		"\u03ff\u0401\u0003\u0094J\u0000\u0400\u0402\u0003\u00a2Q\u0000\u0401\u0400"+
		"\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0404"+
		"\u0001\u0000\u0000\u0000\u0403\u03f2\u0001\u0000\u0000\u0000\u0403\u03f7"+
		"\u0001\u0000\u0000\u0000\u0404\u0091\u0001\u0000\u0000\u0000\u0405\u0408"+
		"\u0003t:\u0000\u0406\u0408\u00050\u0000\u0000\u0407\u0405\u0001\u0000"+
		"\u0000\u0000\u0407\u0406\u0001\u0000\u0000\u0000\u0408\u0093\u0001\u0000"+
		"\u0000\u0000\u0409\u040a\u0005v\u0000\u0000\u040a\u040c\u0005I\u0000\u0000"+
		"\u040b\u040d\u0003\u0096K\u0000\u040c\u040b\u0001\u0000\u0000\u0000\u040c"+
		"\u040d\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e"+
		"\u0410\u0005J\u0000\u0000\u040f\u0411\u0003\u001e\u000f\u0000\u0410\u040f"+
		"\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000\u0411\u0095"+
		"\u0001\u0000\u0000\u0000\u0412\u0419\u0003\u00a0P\u0000\u0413\u0414\u0003"+
		"\u0098L\u0000\u0414\u0415\u0005P\u0000\u0000\u0415\u0416\u0003\u009eO"+
		"\u0000\u0416\u0419\u0001\u0000\u0000\u0000\u0417\u0419\u0003\u009eO\u0000"+
		"\u0418\u0412\u0001\u0000\u0000\u0000\u0418\u0413\u0001\u0000\u0000\u0000"+
		"\u0418\u0417\u0001\u0000\u0000\u0000\u0419\u0097\u0001\u0000\u0000\u0000"+
		"\u041a\u041f\u0003\u009aM\u0000\u041b\u041c\u0005P\u0000\u0000\u041c\u041e"+
		"\u0003\u009aM\u0000\u041d\u041b\u0001\u0000\u0000\u0000\u041e\u0421\u0001"+
		"\u0000\u0000\u0000\u041f\u041d\u0001\u0000\u0000\u0000\u041f\u0420\u0001"+
		"\u0000\u0000\u0000\u0420\u042b\u0001\u0000\u0000\u0000\u0421\u041f\u0001"+
		"\u0000\u0000\u0000\u0422\u0427\u0003\u00a0P\u0000\u0423\u0424\u0005P\u0000"+
		"\u0000\u0424\u0426\u0003\u009aM\u0000\u0425\u0423\u0001\u0000\u0000\u0000"+
		"\u0426\u0429\u0001\u0000\u0000\u0000\u0427\u0425\u0001\u0000\u0000\u0000"+
		"\u0427\u0428\u0001\u0000\u0000\u0000\u0428\u042b\u0001\u0000\u0000\u0000"+
		"\u0429\u0427\u0001\u0000\u0000\u0000\u042a\u041a\u0001\u0000\u0000\u0000"+
		"\u042a\u0422\u0001\u0000\u0000\u0000\u042b\u0099\u0001\u0000\u0000\u0000"+
		"\u042c\u042e\u0003\u009cN\u0000\u042d\u042c\u0001\u0000\u0000\u0000\u042e"+
		"\u0431\u0001\u0000\u0000\u0000\u042f\u042d\u0001\u0000\u0000\u0000\u042f"+
		"\u0430\u0001\u0000\u0000\u0000\u0430\u0432\u0001\u0000\u0000\u0000\u0431"+
		"\u042f\u0001\u0000\u0000\u0000\u0432\u0433\u0003t:\u0000\u0433\u0434\u0003"+
		"p8\u0000\u0434\u009b\u0001\u0000\u0000\u0000\u0435\u0439\u0003\u00e8t"+
		"\u0000\u0436\u0439\u0005\u0012\u0000\u0000\u0437\u0439\u0005;\u0000\u0000"+
		"\u0438\u0435\u0001\u0000\u0000\u0000\u0438\u0436\u0001\u0000\u0000\u0000"+
		"\u0438\u0437\u0001\u0000\u0000\u0000\u0439\u009d\u0001\u0000\u0000\u0000"+
		"\u043a\u043c\u0003\u009cN\u0000\u043b\u043a\u0001\u0000\u0000\u0000\u043c"+
		"\u043f\u0001\u0000\u0000\u0000\u043d\u043b\u0001\u0000\u0000\u0000\u043d"+
		"\u043e\u0001\u0000\u0000\u0000\u043e\u0440\u0001\u0000\u0000\u0000\u043f"+
		"\u043d\u0001\u0000\u0000\u0000\u0440\u0444\u0003t:\u0000\u0441\u0443\u0003"+
		"\u00e8t\u0000\u0442\u0441\u0001\u0000\u0000\u0000\u0443\u0446\u0001\u0000"+
		"\u0000\u0000\u0444\u0442\u0001\u0000\u0000\u0000\u0444\u0445\u0001\u0000"+
		"\u0000\u0000\u0445\u0447\u0001\u0000\u0000\u0000\u0446\u0444\u0001\u0000"+
		"\u0000\u0000\u0447\u0448\u0005x\u0000\u0000\u0448\u0449\u0003p8\u0000"+
		"\u0449\u044c\u0001\u0000\u0000\u0000\u044a\u044c\u0003\u009aM\u0000\u044b"+
		"\u043d\u0001\u0000\u0000\u0000\u044b\u044a\u0001\u0000\u0000\u0000\u044c"+
		"\u009f\u0001\u0000\u0000\u0000\u044d\u044f\u0003\u00e8t\u0000\u044e\u044d"+
		"\u0001\u0000\u0000\u0000\u044f\u0452\u0001\u0000\u0000\u0000\u0450\u044e"+
		"\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000\u0451\u0453"+
		"\u0001\u0000\u0000\u0000\u0452\u0450\u0001\u0000\u0000\u0000\u0453\u0456"+
		"\u0003t:\u0000\u0454\u0455\u0005v\u0000\u0000\u0455\u0457\u0005Q\u0000"+
		"\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0456\u0457\u0001\u0000\u0000"+
		"\u0000\u0457\u0458\u0001\u0000\u0000\u0000\u0458\u0459\u0005+\u0000\u0000"+
		"\u0459\u00a1\u0001\u0000\u0000\u0000\u045a\u045b\u0005-\u0000\u0000\u045b"+
		"\u045c\u0003\u00a4R\u0000\u045c\u00a3\u0001\u0000\u0000\u0000\u045d\u0462"+
		"\u0003\u00a6S\u0000\u045e\u045f\u0005P\u0000\u0000\u045f\u0461\u0003\u00a6"+
		"S\u0000\u0460\u045e\u0001\u0000\u0000\u0000\u0461\u0464\u0001\u0000\u0000"+
		"\u0000\u0462\u0460\u0001\u0000\u0000\u0000\u0462\u0463\u0001\u0000\u0000"+
		"\u0000\u0463\u00a5\u0001\u0000\u0000\u0000\u0464\u0462\u0001\u0000\u0000"+
		"\u0000\u0465\u0468\u0003\u000e\u0007\u0000\u0466\u0468\u0003\u001a\r\u0000"+
		"\u0467\u0465\u0001\u0000\u0000\u0000\u0467\u0466\u0001\u0000\u0000\u0000"+
		"\u0468\u00a7\u0001\u0000\u0000\u0000\u0469\u046c\u0003\u00fe\u007f\u0000"+
		"\u046a\u046c\u0005O\u0000\u0000\u046b\u0469\u0001\u0000\u0000\u0000\u046b"+
		"\u046a\u0001\u0000\u0000\u0000\u046c\u00a9\u0001\u0000\u0000\u0000\u046d"+
		"\u046e\u0003\u00fe\u007f\u0000\u046e\u00ab\u0001\u0000\u0000\u0000\u046f"+
		"\u0470\u0005&\u0000\u0000\u0470\u0471\u0003\u00fe\u007f\u0000\u0471\u00ad"+
		"\u0001\u0000\u0000\u0000\u0472\u0474\u0003\u00b0X\u0000\u0473\u0472\u0001"+
		"\u0000\u0000\u0000\u0474\u0477\u0001\u0000\u0000\u0000\u0475\u0473\u0001"+
		"\u0000\u0000\u0000\u0475\u0476\u0001\u0000\u0000\u0000\u0476\u0478\u0001"+
		"\u0000\u0000\u0000\u0477\u0475\u0001\u0000\u0000\u0000\u0478\u047a\u0003"+
		"\u00b2Y\u0000\u0479\u047b\u0003\u00a2Q\u0000\u047a\u0479\u0001\u0000\u0000"+
		"\u0000\u047a\u047b\u0001\u0000\u0000\u0000\u047b\u047c\u0001\u0000\u0000"+
		"\u0000\u047c\u047d\u0003\u00b6[\u0000\u047d\u00af\u0001\u0000\u0000\u0000"+
		"\u047e\u0483\u0003\u00e8t\u0000\u047f\u0483\u0005#\u0000\u0000\u0480\u0483"+
		"\u0005\"\u0000\u0000\u0481\u0483\u0005!\u0000\u0000\u0482\u047e\u0001"+
		"\u0000\u0000\u0000\u0482\u047f\u0001\u0000\u0000\u0000\u0482\u0480\u0001"+
		"\u0000\u0000\u0000\u0482\u0481\u0001\u0000\u0000\u0000\u0483\u00b1\u0001"+
		"\u0000\u0000\u0000\u0484\u0486\u0003X,\u0000\u0485\u0484\u0001\u0000\u0000"+
		"\u0000\u0485\u0486\u0001\u0000\u0000\u0000\u0486\u0487\u0001\u0000\u0000"+
		"\u0000\u0487\u0488\u0003\u00b4Z\u0000\u0488\u048a\u0005I\u0000\u0000\u0489"+
		"\u048b\u0003\u0096K\u0000\u048a\u0489\u0001\u0000\u0000\u0000\u048a\u048b"+
		"\u0001\u0000\u0000\u0000\u048b\u048c\u0001\u0000\u0000\u0000\u048c\u048d"+
		"\u0005J\u0000\u0000\u048d\u00b3\u0001\u0000\u0000\u0000\u048e\u048f\u0005"+
		"v\u0000\u0000\u048f\u00b5\u0001\u0000\u0000\u0000\u0490\u0492\u0005K\u0000"+
		"\u0000\u0491\u0493\u0003\u00b8\\\u0000\u0492\u0491\u0001\u0000\u0000\u0000"+
		"\u0492\u0493\u0001\u0000\u0000\u0000\u0493\u0495\u0001\u0000\u0000\u0000"+
		"\u0494\u0496\u0003\u0100\u0080\u0000\u0495\u0494\u0001\u0000\u0000\u0000"+
		"\u0495\u0496\u0001\u0000\u0000\u0000\u0496\u0497\u0001\u0000\u0000\u0000"+
		"\u0497\u0498\u0005L\u0000\u0000\u0498\u00b7\u0001\u0000\u0000\u0000\u0499"+
		"\u049b\u0003(\u0014\u0000\u049a\u0499\u0001\u0000\u0000\u0000\u049a\u049b"+
		"\u0001\u0000\u0000\u0000\u049b\u049c\u0001\u0000\u0000\u0000\u049c\u049d"+
		"\u0005+\u0000\u0000\u049d\u049f\u0005I\u0000\u0000\u049e\u04a0\u0003\u0190"+
		"\u00c8\u0000\u049f\u049e\u0001\u0000\u0000\u0000\u049f\u04a0\u0001\u0000"+
		"\u0000\u0000\u04a0\u04a1\u0001\u0000\u0000\u0000\u04a1\u04a2\u0005J\u0000"+
		"\u0000\u04a2\u04c8\u0005O\u0000\u0000\u04a3\u04a5\u0003(\u0014\u0000\u04a4"+
		"\u04a3\u0001\u0000\u0000\u0000\u04a4\u04a5\u0001\u0000\u0000\u0000\u04a5"+
		"\u04a6\u0001\u0000\u0000\u0000\u04a6\u04a7\u0005(\u0000\u0000\u04a7\u04a9"+
		"\u0005I\u0000\u0000\u04a8\u04aa\u0003\u0190\u00c8\u0000\u04a9\u04a8\u0001"+
		"\u0000\u0000\u0000\u04a9\u04aa\u0001\u0000\u0000\u0000\u04aa\u04ab\u0001"+
		"\u0000\u0000\u0000\u04ab\u04ac\u0005J\u0000\u0000\u04ac\u04c8\u0005O\u0000"+
		"\u0000\u04ad\u04ae\u00038\u001c\u0000\u04ae\u04b0\u0005Q\u0000\u0000\u04af"+
		"\u04b1\u0003(\u0014\u0000\u04b0\u04af\u0001\u0000\u0000\u0000\u04b0\u04b1"+
		"\u0001\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2\u04b3"+
		"\u0005(\u0000\u0000\u04b3\u04b5\u0005I\u0000\u0000\u04b4\u04b6\u0003\u0190"+
		"\u00c8\u0000\u04b5\u04b4\u0001\u0000\u0000\u0000\u04b5\u04b6\u0001\u0000"+
		"\u0000\u0000\u04b6\u04b7\u0001\u0000\u0000\u0000\u04b7\u04b8\u0005J\u0000"+
		"\u0000\u04b8\u04b9\u0005O\u0000\u0000\u04b9\u04c8\u0001\u0000\u0000\u0000"+
		"\u04ba\u04bb\u0003\u0162\u00b1\u0000\u04bb\u04bd\u0005Q\u0000\u0000\u04bc"+
		"\u04be\u0003(\u0014\u0000\u04bd\u04bc\u0001\u0000\u0000\u0000\u04bd\u04be"+
		"\u0001\u0000\u0000\u0000\u04be\u04bf\u0001\u0000\u0000\u0000\u04bf\u04c0"+
		"\u0005(\u0000\u0000\u04c0\u04c2\u0005I\u0000\u0000\u04c1\u04c3\u0003\u0190"+
		"\u00c8\u0000\u04c2\u04c1\u0001\u0000\u0000\u0000\u04c2\u04c3\u0001\u0000"+
		"\u0000\u0000\u04c3\u04c4\u0001\u0000\u0000\u0000\u04c4\u04c5\u0005J\u0000"+
		"\u0000\u04c5\u04c6\u0005O\u0000\u0000\u04c6\u04c8\u0001\u0000\u0000\u0000"+
		"\u04c7\u049a\u0001\u0000\u0000\u0000\u04c7\u04a4\u0001\u0000\u0000\u0000"+
		"\u04c7\u04ad\u0001\u0000\u0000\u0000\u04c7\u04ba\u0001\u0000\u0000\u0000"+
		"\u04c8\u00b9\u0001\u0000\u0000\u0000\u04c9\u04cb\u0003V+\u0000\u04ca\u04c9"+
		"\u0001\u0000\u0000\u0000\u04cb\u04ce\u0001\u0000\u0000\u0000\u04cc\u04ca"+
		"\u0001\u0000\u0000\u0000\u04cc\u04cd\u0001\u0000\u0000\u0000\u04cd\u04cf"+
		"\u0001\u0000\u0000\u0000\u04ce\u04cc\u0001\u0000\u0000\u0000\u04cf\u04d0"+
		"\u0005\u0010\u0000\u0000\u04d0\u04d2\u0005v\u0000\u0000\u04d1\u04d3\u0003"+
		"^/\u0000\u04d2\u04d1\u0001\u0000\u0000\u0000\u04d2\u04d3\u0001\u0000\u0000"+
		"\u0000\u04d3\u04d4\u0001\u0000\u0000\u0000\u04d4\u04d5\u0003\u00bc^\u0000"+
		"\u04d5\u00bb\u0001\u0000\u0000\u0000\u04d6\u04d8\u0005K\u0000\u0000\u04d7"+
		"\u04d9\u0003\u00be_\u0000\u04d8\u04d7\u0001\u0000\u0000\u0000\u04d8\u04d9"+
		"\u0001\u0000\u0000\u0000\u04d9\u04db\u0001\u0000\u0000\u0000\u04da\u04dc"+
		"\u0005P\u0000\u0000\u04db\u04da\u0001\u0000\u0000\u0000\u04db\u04dc\u0001"+
		"\u0000\u0000\u0000\u04dc\u04de\u0001\u0000\u0000\u0000\u04dd\u04df\u0003"+
		"\u00c4b\u0000\u04de\u04dd\u0001\u0000\u0000\u0000\u04de\u04df\u0001\u0000"+
		"\u0000\u0000\u04df\u04e0\u0001\u0000\u0000\u0000\u04e0\u04e1\u0005L\u0000"+
		"\u0000\u04e1\u00bd\u0001\u0000\u0000\u0000\u04e2\u04e7\u0003\u00c0`\u0000"+
		"\u04e3\u04e4\u0005P\u0000\u0000\u04e4\u04e6\u0003\u00c0`\u0000\u04e5\u04e3"+
		"\u0001\u0000\u0000\u0000\u04e6\u04e9\u0001\u0000\u0000\u0000\u04e7\u04e5"+
		"\u0001\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8\u00bf"+
		"\u0001\u0000\u0000\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000\u04ea\u04ec"+
		"\u0003\u00c2a\u0000\u04eb\u04ea\u0001\u0000\u0000\u0000\u04ec\u04ef\u0001"+
		"\u0000\u0000\u0000\u04ed\u04eb\u0001\u0000\u0000\u0000\u04ed\u04ee\u0001"+
		"\u0000\u0000\u0000\u04ee\u04f0\u0001\u0000\u0000\u0000\u04ef\u04ed\u0001"+
		"\u0000\u0000\u0000\u04f0\u04f6\u0005v\u0000\u0000\u04f1\u04f3\u0005I\u0000"+
		"\u0000\u04f2\u04f4\u0003\u0190\u00c8\u0000\u04f3\u04f2\u0001\u0000\u0000"+
		"\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f5\u0001\u0000\u0000"+
		"\u0000\u04f5\u04f7\u0005J\u0000\u0000\u04f6\u04f1\u0001\u0000\u0000\u0000"+
		"\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7\u04f9\u0001\u0000\u0000\u0000"+
		"\u04f8\u04fa\u0003b1\u0000\u04f9\u04f8\u0001\u0000\u0000\u0000\u04f9\u04fa"+
		"\u0001\u0000\u0000\u0000\u04fa\u00c1\u0001\u0000\u0000\u0000\u04fb\u04fc"+
		"\u0003\u00e8t\u0000\u04fc\u00c3\u0001\u0000\u0000\u0000\u04fd\u0501\u0005"+
		"O\u0000\u0000\u04fe\u0500\u0003d2\u0000\u04ff\u04fe\u0001\u0000\u0000"+
		"\u0000\u0500\u0503\u0001\u0000\u0000\u0000\u0501\u04ff\u0001\u0000\u0000"+
		"\u0000\u0501\u0502\u0001\u0000\u0000\u0000\u0502\u00c5\u0001\u0000\u0000"+
		"\u0000\u0503\u0501\u0001\u0000\u0000\u0000\u0504\u0507\u0003\u00c8d\u0000"+
		"\u0505\u0507\u0003\u00dcn\u0000\u0506\u0504\u0001\u0000\u0000\u0000\u0506"+
		"\u0505\u0001\u0000\u0000\u0000\u0507\u00c7\u0001\u0000\u0000\u0000\u0508"+
		"\u050a\u0003\u00ccf\u0000\u0509\u0508\u0001\u0000\u0000\u0000\u050a\u050d"+
		"\u0001\u0000\u0000\u0000\u050b\u0509\u0001\u0000\u0000\u0000\u050b\u050c"+
		"\u0001\u0000\u0000\u0000\u050c\u050e\u0001\u0000\u0000\u0000\u050d\u050b"+
		"\u0001\u0000\u0000\u0000\u050e\u050f\u0003\u00cae\u0000\u050f\u0511\u0005"+
		"v\u0000\u0000\u0510\u0512\u0003X,\u0000\u0511\u0510\u0001\u0000\u0000"+
		"\u0000\u0511\u0512\u0001\u0000\u0000\u0000\u0512\u0514\u0001\u0000\u0000"+
		"\u0000\u0513\u0515\u0003\u00ceg\u0000\u0514\u0513\u0001\u0000\u0000\u0000"+
		"\u0514\u0515\u0001\u0000\u0000\u0000\u0515\u0516\u0001\u0000\u0000\u0000"+
		"\u0516\u0517\u0003\u00d0h\u0000\u0517\u00c9\u0001\u0000\u0000\u0000\u0518"+
		"\u0519\u0007\u0004\u0000\u0000\u0519\u00cb\u0001\u0000\u0000\u0000\u051a"+
		"\u0522\u0003\u00e8t\u0000\u051b\u0522\u0005#\u0000\u0000\u051c\u0522\u0005"+
		"\"\u0000\u0000\u051d\u0522\u0005!\u0000\u0000\u051e\u0522\u0005\u0001"+
		"\u0000\u0000\u051f\u0522\u0005&\u0000\u0000\u0520\u0522\u0005\'\u0000"+
		"\u0000\u0521\u051a\u0001\u0000\u0000\u0000\u0521\u051b\u0001\u0000\u0000"+
		"\u0000\u0521\u051c\u0001\u0000\u0000\u0000\u0521\u051d\u0001\u0000\u0000"+
		"\u0000\u0521\u051e\u0001\u0000\u0000\u0000\u0521\u051f\u0001\u0000\u0000"+
		"\u0000\u0521\u0520\u0001\u0000\u0000\u0000\u0522\u00cd\u0001\u0000\u0000"+
		"\u0000\u0523\u0524\u0005\u0011\u0000\u0000\u0524\u0525\u0003`0\u0000\u0525"+
		"\u00cf\u0001\u0000\u0000\u0000\u0526\u052a\u0005K\u0000\u0000\u0527\u0529"+
		"\u0003\u00d2i\u0000\u0528\u0527\u0001\u0000\u0000\u0000\u0529\u052c\u0001"+
		"\u0000\u0000\u0000\u052a\u0528\u0001\u0000\u0000\u0000\u052a\u052b\u0001"+
		"\u0000\u0000\u0000\u052b\u052d\u0001\u0000\u0000\u0000\u052c\u052a\u0001"+
		"\u0000\u0000\u0000\u052d\u052e\u0005L\u0000\u0000\u052e\u00d1\u0001\u0000"+
		"\u0000\u0000\u052f\u0535\u0003\u00d4j\u0000\u0530\u0535\u0003\u00d8l\u0000"+
		"\u0531\u0535\u0003P(\u0000\u0532\u0535\u0003\u00c6c\u0000\u0533\u0535"+
		"\u0005O\u0000\u0000\u0534\u052f\u0001\u0000\u0000\u0000\u0534\u0530\u0001"+
		"\u0000\u0000\u0000\u0534\u0531\u0001\u0000\u0000\u0000\u0534\u0532\u0001"+
		"\u0000\u0000\u0000\u0534\u0533\u0001\u0000\u0000\u0000\u0535\u00d3\u0001"+
		"\u0000\u0000\u0000\u0536\u0538\u0003\u00d6k\u0000\u0537\u0536\u0001\u0000"+
		"\u0000\u0000\u0538\u053b\u0001\u0000\u0000\u0000\u0539\u0537\u0001\u0000"+
		"\u0000\u0000\u0539\u053a\u0001\u0000\u0000\u0000\u053a\u053c\u0001\u0000"+
		"\u0000\u0000\u053b\u0539\u0001\u0000\u0000\u0000\u053c\u053d\u0003t:\u0000"+
		"\u053d\u053e\u0003l6\u0000\u053e\u053f\u0005O\u0000\u0000\u053f\u00d5"+
		"\u0001\u0000\u0000\u0000\u0540\u0545\u0003\u00e8t\u0000\u0541\u0545\u0005"+
		"#\u0000\u0000\u0542\u0545\u0005&\u0000\u0000\u0543\u0545\u0005\u0012\u0000"+
		"\u0000\u0544\u0540\u0001\u0000\u0000\u0000\u0544\u0541\u0001\u0000\u0000"+
		"\u0000\u0544\u0542\u0001\u0000\u0000\u0000\u0544\u0543\u0001\u0000\u0000"+
		"\u0000\u0545\u00d7\u0001\u0000\u0000\u0000\u0546\u0548\u0003\u00dam\u0000"+
		"\u0547\u0546\u0001\u0000\u0000\u0000\u0548\u054b\u0001\u0000\u0000\u0000"+
		"\u0549\u0547\u0001\u0000\u0000\u0000\u0549\u054a\u0001\u0000\u0000\u0000"+
		"\u054a\u054c\u0001\u0000\u0000\u0000\u054b\u0549\u0001\u0000\u0000\u0000"+
		"\u054c\u054d\u0003\u0090H\u0000\u054d\u054e\u0003\u00a8T\u0000\u054e\u00d9"+
		"\u0001\u0000\u0000\u0000\u054f\u0556\u0003\u00e8t\u0000\u0550\u0556\u0005"+
		"#\u0000\u0000\u0551\u0556\u0005\u0001\u0000\u0000\u0552\u0556\u0005\f"+
		"\u0000\u0000\u0553\u0556\u0005&\u0000\u0000\u0554\u0556\u0005\'\u0000"+
		"\u0000\u0555\u054f\u0001\u0000\u0000\u0000\u0555\u0550\u0001\u0000\u0000"+
		"\u0000\u0555\u0551\u0001\u0000\u0000\u0000\u0555\u0552\u0001\u0000\u0000"+
		"\u0000\u0555\u0553\u0001\u0000\u0000\u0000\u0555\u0554\u0001\u0000\u0000"+
		"\u0000\u0556\u00db\u0001\u0000\u0000\u0000\u0557\u0559\u0003\u00ccf\u0000"+
		"\u0558\u0557\u0001\u0000\u0000\u0000\u0559\u055c\u0001\u0000\u0000\u0000"+
		"\u055a\u0558\u0001\u0000\u0000\u0000\u055a\u055b\u0001\u0000\u0000\u0000"+
		"\u055b\u055d\u0001\u0000\u0000\u0000\u055c\u055a\u0001\u0000\u0000\u0000"+
		"\u055d\u055e\u0005w\u0000\u0000\u055e\u055f\u0005\u001c\u0000\u0000\u055f"+
		"\u0560\u0005v\u0000\u0000\u0560\u0561\u0003\u00deo\u0000\u0561\u00dd\u0001"+
		"\u0000\u0000\u0000\u0562\u0566\u0005K\u0000\u0000\u0563\u0565\u0003\u00e0"+
		"p\u0000\u0564\u0563\u0001\u0000\u0000\u0000\u0565\u0568\u0001\u0000\u0000"+
		"\u0000\u0566\u0564\u0001\u0000\u0000\u0000\u0566\u0567\u0001\u0000\u0000"+
		"\u0000\u0567\u0569\u0001\u0000\u0000\u0000\u0568\u0566\u0001\u0000\u0000"+
		"\u0000\u0569\u056a\u0005L\u0000\u0000\u056a\u00df\u0001\u0000\u0000\u0000"+
		"\u056b\u0571\u0003\u00e2q\u0000\u056c\u0571\u0003\u00d4j\u0000\u056d\u0571"+
		"\u0003P(\u0000\u056e\u0571\u0003\u00c6c\u0000\u056f\u0571\u0005O\u0000"+
		"\u0000\u0570\u056b\u0001\u0000\u0000\u0000\u0570\u056c\u0001\u0000\u0000"+
		"\u0000\u0570\u056d\u0001\u0000\u0000\u0000\u0570\u056e\u0001\u0000\u0000"+
		"\u0000\u0570\u056f\u0001\u0000\u0000\u0000\u0571\u00e1\u0001\u0000\u0000"+
		"\u0000\u0572\u0574\u0003\u00e4r\u0000\u0573\u0572\u0001\u0000\u0000\u0000"+
		"\u0574\u0577\u0001\u0000\u0000\u0000\u0575\u0573\u0001\u0000\u0000\u0000"+
		"\u0575\u0576\u0001\u0000\u0000\u0000\u0576\u0578\u0001\u0000\u0000\u0000"+
		"\u0577\u0575\u0001\u0000\u0000\u0000\u0578\u0579\u0003t:\u0000\u0579\u057a"+
		"\u0005v\u0000\u0000\u057a\u057b\u0005I\u0000\u0000\u057b\u057d\u0005J"+
		"\u0000\u0000\u057c\u057e\u0003\u001e\u000f\u0000\u057d\u057c\u0001\u0000"+
		"\u0000\u0000\u057d\u057e\u0001\u0000\u0000\u0000\u057e\u0580\u0001\u0000"+
		"\u0000\u0000\u057f\u0581\u0003\u00e6s\u0000\u0580\u057f\u0001\u0000\u0000"+
		"\u0000\u0580\u0581\u0001\u0000\u0000\u0000\u0581\u0582\u0001\u0000\u0000"+
		"\u0000\u0582\u0583\u0005O\u0000\u0000\u0583\u00e3\u0001\u0000\u0000\u0000"+
		"\u0584\u0588\u0003\u00e8t\u0000\u0585\u0588\u0005#\u0000\u0000\u0586\u0588"+
		"\u0005\u0001\u0000\u0000\u0587\u0584\u0001\u0000\u0000\u0000\u0587\u0585"+
		"\u0001\u0000\u0000\u0000\u0587\u0586\u0001\u0000\u0000\u0000\u0588\u00e5"+
		"\u0001\u0000\u0000\u0000\u0589\u058a\u0005\f\u0000\u0000\u058a\u058b\u0003"+
		"\u00f0x\u0000\u058b\u00e7\u0001\u0000\u0000\u0000\u058c\u0590\u0003\u00ea"+
		"u\u0000\u058d\u0590\u0003\u00f6{\u0000\u058e\u0590\u0003\u00f8|\u0000"+
		"\u058f\u058c\u0001\u0000\u0000\u0000\u058f\u058d\u0001\u0000\u0000\u0000"+
		"\u058f\u058e\u0001\u0000\u0000\u0000\u0590\u00e9\u0001\u0000\u0000\u0000"+
		"\u0591\u0592\u0005w\u0000\u0000\u0592\u0593\u00034\u001a\u0000\u0593\u0595"+
		"\u0005I\u0000\u0000\u0594\u0596\u0003\u00ecv\u0000\u0595\u0594\u0001\u0000"+
		"\u0000\u0000\u0595\u0596\u0001\u0000\u0000\u0000\u0596\u0597\u0001\u0000"+
		"\u0000\u0000\u0597\u0598\u0005J\u0000\u0000\u0598\u00eb\u0001\u0000\u0000"+
		"\u0000\u0599\u059e\u0003\u00eew\u0000\u059a\u059b\u0005P\u0000\u0000\u059b"+
		"\u059d\u0003\u00eew\u0000\u059c\u059a\u0001\u0000\u0000\u0000\u059d\u05a0"+
		"\u0001\u0000\u0000\u0000\u059e\u059c\u0001\u0000\u0000\u0000\u059e\u059f"+
		"\u0001\u0000\u0000\u0000\u059f\u00ed\u0001\u0000\u0000\u0000\u05a0\u059e"+
		"\u0001\u0000\u0000\u0000\u05a1\u05a2\u0005v\u0000\u0000\u05a2\u05a3\u0005"+
		"R\u0000\u0000\u05a3\u05a4\u0003\u00f0x\u0000\u05a4\u00ef\u0001\u0000\u0000"+
		"\u0000\u05a5\u05a9\u0003\u01b2\u00d9\u0000\u05a6\u05a9\u0003\u00f2y\u0000"+
		"\u05a7\u05a9\u0003\u00e8t\u0000\u05a8\u05a5\u0001\u0000\u0000\u0000\u05a8"+
		"\u05a6\u0001\u0000\u0000\u0000\u05a8\u05a7\u0001\u0000\u0000\u0000\u05a9"+
		"\u00f1\u0001\u0000\u0000\u0000\u05aa\u05ac\u0005K\u0000\u0000\u05ab\u05ad"+
		"\u0003\u00f4z\u0000\u05ac\u05ab\u0001\u0000\u0000\u0000\u05ac\u05ad\u0001"+
		"\u0000\u0000\u0000\u05ad\u05af\u0001\u0000\u0000\u0000\u05ae\u05b0\u0005"+
		"P\u0000\u0000\u05af\u05ae\u0001\u0000\u0000\u0000\u05af\u05b0\u0001\u0000"+
		"\u0000\u0000\u05b0\u05b1\u0001\u0000\u0000\u0000\u05b1\u05b2\u0005L\u0000"+
		"\u0000\u05b2\u00f3\u0001\u0000\u0000\u0000\u05b3\u05b8\u0003\u00f0x\u0000"+
		"\u05b4\u05b5\u0005P\u0000\u0000\u05b5\u05b7\u0003\u00f0x\u0000\u05b6\u05b4"+
		"\u0001\u0000\u0000\u0000\u05b7\u05ba\u0001\u0000\u0000\u0000\u05b8\u05b6"+
		"\u0001\u0000\u0000\u0000\u05b8\u05b9\u0001\u0000\u0000\u0000\u05b9\u00f5"+
		"\u0001\u0000\u0000\u0000\u05ba\u05b8\u0001\u0000\u0000\u0000\u05bb\u05bc"+
		"\u0005w\u0000\u0000\u05bc\u05bd\u00034\u001a\u0000\u05bd\u00f7\u0001\u0000"+
		"\u0000\u0000\u05be\u05bf\u0005w\u0000\u0000\u05bf\u05c0\u00034\u001a\u0000"+
		"\u05c0\u05c1\u0005I\u0000\u0000\u05c1\u05c2\u0003\u00f0x\u0000\u05c2\u05c3"+
		"\u0005J\u0000\u0000\u05c3\u00f9\u0001\u0000\u0000\u0000\u05c4\u05c6\u0005"+
		"K\u0000\u0000\u05c5\u05c7\u0003\u00fc~\u0000\u05c6\u05c5\u0001\u0000\u0000"+
		"\u0000\u05c6\u05c7\u0001\u0000\u0000\u0000\u05c7\u05c9\u0001\u0000\u0000"+
		"\u0000\u05c8\u05ca\u0005P\u0000\u0000\u05c9\u05c8\u0001\u0000\u0000\u0000"+
		"\u05c9\u05ca\u0001\u0000\u0000\u0000\u05ca\u05cb\u0001\u0000\u0000\u0000"+
		"\u05cb\u05cc\u0005L\u0000\u0000\u05cc\u00fb\u0001\u0000\u0000\u0000\u05cd"+
		"\u05d2\u0003r9\u0000\u05ce\u05cf\u0005P\u0000\u0000\u05cf\u05d1\u0003"+
		"r9\u0000\u05d0\u05ce\u0001\u0000\u0000\u0000\u05d1\u05d4\u0001\u0000\u0000"+
		"\u0000\u05d2\u05d0\u0001\u0000\u0000\u0000\u05d2\u05d3\u0001\u0000\u0000"+
		"\u0000\u05d3\u00fd\u0001\u0000\u0000\u0000\u05d4\u05d2\u0001\u0000\u0000"+
		"\u0000\u05d5\u05d7\u0005K\u0000\u0000\u05d6\u05d8\u0003\u0100\u0080\u0000"+
		"\u05d7\u05d6\u0001\u0000\u0000\u0000\u05d7\u05d8\u0001\u0000\u0000\u0000"+
		"\u05d8\u05d9\u0001\u0000\u0000\u0000\u05d9\u05da\u0005L\u0000\u0000\u05da"+
		"\u00ff\u0001\u0000\u0000\u0000\u05db\u05dd\u0003\u0102\u0081\u0000\u05dc"+
		"\u05db\u0001\u0000\u0000\u0000\u05dd\u05de\u0001\u0000\u0000\u0000\u05de"+
		"\u05dc\u0001\u0000\u0000\u0000\u05de\u05df\u0001\u0000\u0000\u0000\u05df"+
		"\u0101\u0001\u0000\u0000\u0000\u05e0\u05e4\u0003\u0104\u0082\u0000\u05e1"+
		"\u05e4\u0003P(\u0000\u05e2\u05e4\u0003\u0108\u0084\u0000\u05e3\u05e0\u0001"+
		"\u0000\u0000\u0000\u05e3\u05e1\u0001\u0000\u0000\u0000\u05e3\u05e2\u0001"+
		"\u0000\u0000\u0000\u05e4\u0103\u0001\u0000\u0000\u0000\u05e5\u05e6\u0003"+
		"\u0106\u0083\u0000\u05e6\u05e7\u0005O\u0000\u0000\u05e7\u0105\u0001\u0000"+
		"\u0000\u0000\u05e8\u05ea\u0003\u009cN\u0000\u05e9\u05e8\u0001\u0000\u0000"+
		"\u0000\u05ea\u05ed\u0001\u0000\u0000\u0000\u05eb\u05e9\u0001\u0000\u0000"+
		"\u0000\u05eb\u05ec\u0001\u0000\u0000\u0000\u05ec\u05ee\u0001\u0000\u0000"+
		"\u0000\u05ed\u05eb\u0001\u0000\u0000\u0000\u05ee\u05ef\u0003t:\u0000\u05ef"+
		"\u05f0\u0003l6\u0000\u05f0\u0107\u0001\u0000\u0000\u0000\u05f1\u05f8\u0003"+
		"\u010c\u0086\u0000\u05f2\u05f8\u0003\u0110\u0088\u0000\u05f3\u05f8\u0003"+
		"\u0118\u008c\u0000\u05f4\u05f8\u0003\u011a\u008d\u0000\u05f5\u05f8\u0003"+
		"\u012c\u0096\u0000\u05f6\u05f8\u0003\u0132\u0099\u0000\u05f7\u05f1\u0001"+
		"\u0000\u0000\u0000\u05f7\u05f2\u0001\u0000\u0000\u0000\u05f7\u05f3\u0001"+
		"\u0000\u0000\u0000\u05f7\u05f4\u0001\u0000\u0000\u0000\u05f7\u05f5\u0001"+
		"\u0000\u0000\u0000\u05f7\u05f6\u0001\u0000\u0000\u0000\u05f8\u0109\u0001"+
		"\u0000\u0000\u0000\u05f9\u05ff\u0003\u010c\u0086\u0000\u05fa\u05ff\u0003"+
		"\u0112\u0089\u0000\u05fb\u05ff\u0003\u011c\u008e\u0000\u05fc\u05ff\u0003"+
		"\u012e\u0097\u0000\u05fd\u05ff\u0003\u0134\u009a\u0000\u05fe\u05f9\u0001"+
		"\u0000\u0000\u0000\u05fe\u05fa\u0001\u0000\u0000\u0000\u05fe\u05fb\u0001"+
		"\u0000\u0000\u0000\u05fe\u05fc\u0001\u0000\u0000\u0000\u05fe\u05fd\u0001"+
		"\u0000\u0000\u0000\u05ff\u010b\u0001\u0000\u0000\u0000\u0600\u060d\u0003"+
		"\u00fe\u007f\u0000\u0601\u060d\u0003\u010e\u0087\u0000\u0602\u060d\u0003"+
		"\u0114\u008a\u0000\u0603\u060d\u0003\u011e\u008f\u0000\u0604\u060d\u0003"+
		"\u0120\u0090\u0000\u0605\u060d\u0003\u0130\u0098\u0000\u0606\u060d\u0003"+
		"\u0144\u00a2\u0000\u0607\u060d\u0003\u0146\u00a3\u0000\u0608\u060d\u0003"+
		"\u0148\u00a4\u0000\u0609\u060d\u0003\u014c\u00a6\u0000\u060a\u060d\u0003"+
		"\u014a\u00a5\u0000\u060b\u060d\u0003\u014e\u00a7\u0000\u060c\u0600\u0001"+
		"\u0000\u0000\u0000\u060c\u0601\u0001\u0000\u0000\u0000\u060c\u0602\u0001"+
		"\u0000\u0000\u0000\u060c\u0603\u0001\u0000\u0000\u0000\u060c\u0604\u0001"+
		"\u0000\u0000\u0000\u060c\u0605\u0001\u0000\u0000\u0000\u060c\u0606\u0001"+
		"\u0000\u0000\u0000\u060c\u0607\u0001\u0000\u0000\u0000\u060c\u0608\u0001"+
		"\u0000\u0000\u0000\u060c\u0609\u0001\u0000\u0000\u0000\u060c\u060a\u0001"+
		"\u0000\u0000\u0000\u060c\u060b\u0001\u0000\u0000\u0000\u060d\u010d\u0001"+
		"\u0000\u0000\u0000\u060e\u060f\u0005O\u0000\u0000\u060f\u010f\u0001\u0000"+
		"\u0000\u0000\u0610\u0611\u0005v\u0000\u0000\u0611\u0612\u0005X\u0000\u0000"+
		"\u0612\u0613\u0003\u0108\u0084\u0000\u0613\u0111\u0001\u0000\u0000\u0000"+
		"\u0614\u0615\u0005v\u0000\u0000\u0615\u0616\u0005X\u0000\u0000\u0616\u0617"+
		"\u0003\u010a\u0085\u0000\u0617\u0113\u0001\u0000\u0000\u0000\u0618\u0619"+
		"\u0003\u0116\u008b\u0000\u0619\u061a\u0005O\u0000\u0000\u061a\u0115\u0001"+
		"\u0000\u0000\u0000\u061b\u0623\u0003\u01ac\u00d6\u0000\u061c\u0623\u0003"+
		"\u01ca\u00e5\u0000\u061d\u0623\u0003\u01cc\u00e6\u0000\u061e\u0623\u0003"+
		"\u01d2\u00e9\u0000\u061f\u0623\u0003\u01d6\u00eb\u0000\u0620\u0623\u0003"+
		"\u018a\u00c5\u0000\u0621\u0623\u0003\u0176\u00bb\u0000\u0622\u061b\u0001"+
		"\u0000\u0000\u0000\u0622\u061c\u0001\u0000\u0000\u0000\u0622\u061d\u0001"+
		"\u0000\u0000\u0000\u0622\u061e\u0001\u0000\u0000\u0000\u0622\u061f\u0001"+
		"\u0000\u0000\u0000\u0622\u0620\u0001\u0000\u0000\u0000\u0622\u0621\u0001"+
		"\u0000\u0000\u0000\u0623\u0117\u0001\u0000\u0000\u0000\u0624\u0625\u0005"+
		"\u0016\u0000\u0000\u0625\u0626\u0005I\u0000\u0000\u0626\u0627\u0003\u01a0"+
		"\u00d0\u0000\u0627\u0628\u0005J\u0000\u0000\u0628\u0629\u0003\u0108\u0084"+
		"\u0000\u0629\u0119\u0001\u0000\u0000\u0000\u062a\u062b\u0005\u0016\u0000"+
		"\u0000\u062b\u062c\u0005I\u0000\u0000\u062c\u062d\u0003\u01a0\u00d0\u0000"+
		"\u062d\u062e\u0005J\u0000\u0000\u062e\u062f\u0003\u010a\u0085\u0000\u062f"+
		"\u0630\u0005\u000f\u0000\u0000\u0630\u0631\u0003\u0108\u0084\u0000\u0631"+
		"\u011b\u0001\u0000\u0000\u0000\u0632\u0633\u0005\u0016\u0000\u0000\u0633"+
		"\u0634\u0005I\u0000\u0000\u0634\u0635\u0003\u01a0\u00d0\u0000\u0635\u0636"+
		"\u0005J\u0000\u0000\u0636\u0637\u0003\u010a\u0085\u0000\u0637\u0638\u0005"+
		"\u000f\u0000\u0000\u0638\u0639\u0003\u010a\u0085\u0000\u0639\u011d\u0001"+
		"\u0000\u0000\u0000\u063a\u063b\u0005\u0002\u0000\u0000\u063b\u063c\u0003"+
		"\u01a0\u00d0\u0000\u063c\u063d\u0005O\u0000\u0000\u063d\u0645\u0001\u0000"+
		"\u0000\u0000\u063e\u063f\u0005\u0002\u0000\u0000\u063f\u0640\u0003\u01a0"+
		"\u00d0\u0000\u0640\u0641\u0005X\u0000\u0000\u0641\u0642\u0003\u01a0\u00d0"+
		"\u0000\u0642\u0643\u0005O\u0000\u0000\u0643\u0645\u0001\u0000\u0000\u0000"+
		"\u0644\u063a\u0001\u0000\u0000\u0000\u0644\u063e\u0001\u0000\u0000\u0000"+
		"\u0645\u011f\u0001\u0000\u0000\u0000\u0646\u0647\u0005)\u0000\u0000\u0647"+
		"\u0648\u0005I\u0000\u0000\u0648\u0649\u0003\u01a0\u00d0\u0000\u0649\u064a"+
		"\u0005J\u0000\u0000\u064a\u064b\u0003\u0122\u0091\u0000\u064b\u0121\u0001"+
		"\u0000\u0000\u0000\u064c\u0650\u0005K\u0000\u0000\u064d\u064f\u0003\u0124"+
		"\u0092\u0000\u064e\u064d\u0001\u0000\u0000\u0000\u064f\u0652\u0001\u0000"+
		"\u0000\u0000\u0650\u064e\u0001\u0000\u0000\u0000\u0650\u0651\u0001\u0000"+
		"\u0000\u0000\u0651\u0656\u0001\u0000\u0000\u0000\u0652\u0650\u0001\u0000"+
		"\u0000\u0000\u0653\u0655\u0003\u0128\u0094\u0000\u0654\u0653\u0001\u0000"+
		"\u0000\u0000\u0655\u0658\u0001\u0000\u0000\u0000\u0656\u0654\u0001\u0000"+
		"\u0000\u0000\u0656\u0657\u0001\u0000\u0000\u0000\u0657\u0659\u0001\u0000"+
		"\u0000\u0000\u0658\u0656\u0001\u0000\u0000\u0000\u0659\u065a\u0005L\u0000"+
		"\u0000\u065a\u0123\u0001\u0000\u0000\u0000\u065b\u065c\u0003\u0126\u0093"+
		"\u0000\u065c\u065d\u0003\u0100\u0080\u0000\u065d\u0125\u0001\u0000\u0000"+
		"\u0000\u065e\u0662\u0003\u0128\u0094\u0000\u065f\u0661\u0003\u0128\u0094"+
		"\u0000\u0660\u065f\u0001\u0000\u0000\u0000\u0661\u0664\u0001\u0000\u0000"+
		"\u0000\u0662\u0660\u0001\u0000\u0000\u0000\u0662\u0663\u0001\u0000\u0000"+
		"\u0000\u0663\u0127\u0001\u0000\u0000\u0000\u0664\u0662\u0001\u0000\u0000"+
		"\u0000\u0665\u0666\u0005\u0006\u0000\u0000\u0666\u0667\u0003\u019e\u00cf"+
		"\u0000\u0667\u0668\u0005X\u0000\u0000\u0668\u0670\u0001\u0000\u0000\u0000"+
		"\u0669\u066a\u0005\u0006\u0000\u0000\u066a\u066b\u0003\u012a\u0095\u0000"+
		"\u066b\u066c\u0005X\u0000\u0000\u066c\u0670\u0001\u0000\u0000\u0000\u066d"+
		"\u066e\u0005\f\u0000\u0000\u066e\u0670\u0005X\u0000\u0000\u066f\u0665"+
		"\u0001\u0000\u0000\u0000\u066f\u0669\u0001\u0000\u0000\u0000\u066f\u066d"+
		"\u0001\u0000\u0000\u0000\u0670\u0129\u0001\u0000\u0000\u0000\u0671\u0672"+
		"\u0005v\u0000\u0000\u0672\u012b\u0001\u0000\u0000\u0000\u0673\u0674\u0005"+
		"2\u0000\u0000\u0674\u0675\u0005I\u0000\u0000\u0675\u0676\u0003\u01a0\u00d0"+
		"\u0000\u0676\u0677\u0005J\u0000\u0000\u0677\u0678\u0003\u0108\u0084\u0000"+
		"\u0678\u012d\u0001\u0000\u0000\u0000\u0679\u067a\u00052\u0000\u0000\u067a"+
		"\u067b\u0005I\u0000\u0000\u067b\u067c\u0003\u01a0\u00d0\u0000\u067c\u067d"+
		"\u0005J\u0000\u0000\u067d\u067e\u0003\u010a\u0085\u0000\u067e\u012f\u0001"+
		"\u0000\u0000\u0000\u067f\u0680\u0005\r\u0000\u0000\u0680\u0681\u0003\u0108"+
		"\u0084\u0000\u0681\u0682\u00052\u0000\u0000\u0682\u0683\u0005I\u0000\u0000"+
		"\u0683\u0684\u0003\u01a0\u00d0\u0000\u0684\u0685\u0005J\u0000\u0000\u0685"+
		"\u0686\u0005O\u0000\u0000\u0686\u0131\u0001\u0000\u0000\u0000\u0687\u068a"+
		"\u0003\u0136\u009b\u0000\u0688\u068a\u0003\u0140\u00a0\u0000\u0689\u0687"+
		"\u0001\u0000\u0000\u0000\u0689\u0688\u0001\u0000\u0000\u0000\u068a\u0133"+
		"\u0001\u0000\u0000\u0000\u068b\u068e\u0003\u0138\u009c\u0000\u068c\u068e"+
		"\u0003\u0142\u00a1\u0000\u068d\u068b\u0001\u0000\u0000\u0000\u068d\u068c"+
		"\u0001\u0000\u0000\u0000\u068e\u0135\u0001\u0000\u0000\u0000\u068f\u0690"+
		"\u0005\u0015\u0000\u0000\u0690\u0692\u0005I\u0000\u0000\u0691\u0693\u0003"+
		"\u013a\u009d\u0000\u0692\u0691\u0001\u0000\u0000\u0000\u0692\u0693\u0001"+
		"\u0000\u0000\u0000\u0693\u0694\u0001\u0000\u0000\u0000\u0694\u0696\u0005"+
		"O\u0000\u0000\u0695\u0697\u0003\u01a0\u00d0\u0000\u0696\u0695\u0001\u0000"+
		"\u0000\u0000\u0696\u0697\u0001\u0000\u0000\u0000\u0697\u0698\u0001\u0000"+
		"\u0000\u0000\u0698\u069a\u0005O\u0000\u0000\u0699\u069b\u0003\u013c\u009e"+
		"\u0000\u069a\u0699\u0001\u0000\u0000\u0000\u069a\u069b\u0001\u0000\u0000"+
		"\u0000\u069b\u069c\u0001\u0000\u0000\u0000\u069c\u069d\u0005J\u0000\u0000"+
		"\u069d\u069e\u0003\u0108\u0084\u0000\u069e\u0137\u0001\u0000\u0000\u0000"+
		"\u069f\u06a0\u0005\u0015\u0000\u0000\u06a0\u06a2\u0005I\u0000\u0000\u06a1"+
		"\u06a3\u0003\u013a\u009d\u0000\u06a2\u06a1\u0001\u0000\u0000\u0000\u06a2"+
		"\u06a3\u0001\u0000\u0000\u0000\u06a3\u06a4\u0001\u0000\u0000\u0000\u06a4"+
		"\u06a6\u0005O\u0000\u0000\u06a5\u06a7\u0003\u01a0\u00d0\u0000\u06a6\u06a5"+
		"\u0001\u0000\u0000\u0000\u06a6\u06a7\u0001\u0000\u0000\u0000\u06a7\u06a8"+
		"\u0001\u0000\u0000\u0000\u06a8\u06aa\u0005O\u0000\u0000\u06a9\u06ab\u0003"+
		"\u013c\u009e\u0000\u06aa\u06a9\u0001\u0000\u0000\u0000\u06aa\u06ab\u0001"+
		"\u0000\u0000\u0000\u06ab\u06ac\u0001\u0000\u0000\u0000\u06ac\u06ad\u0005"+
		"J\u0000\u0000\u06ad\u06ae\u0003\u010a\u0085\u0000\u06ae\u0139\u0001\u0000"+
		"\u0000\u0000\u06af\u06b2\u0003\u013e\u009f\u0000\u06b0\u06b2\u0003\u0106"+
		"\u0083\u0000\u06b1\u06af\u0001\u0000\u0000\u0000\u06b1\u06b0\u0001\u0000"+
		"\u0000\u0000\u06b2\u013b\u0001\u0000\u0000\u0000\u06b3\u06b4\u0003\u013e"+
		"\u009f\u0000\u06b4\u013d\u0001\u0000\u0000\u0000\u06b5\u06ba\u0003\u0116"+
		"\u008b\u0000\u06b6\u06b7\u0005P\u0000\u0000\u06b7\u06b9\u0003\u0116\u008b"+
		"\u0000\u06b8\u06b6\u0001\u0000\u0000\u0000\u06b9\u06bc\u0001\u0000\u0000"+
		"\u0000\u06ba\u06b8\u0001\u0000\u0000\u0000\u06ba\u06bb\u0001\u0000\u0000"+
		"\u0000\u06bb\u013f\u0001\u0000\u0000\u0000\u06bc\u06ba\u0001\u0000\u0000"+
		"\u0000\u06bd\u06be\u0005\u0015\u0000\u0000\u06be\u06c2\u0005I\u0000\u0000"+
		"\u06bf\u06c1\u0003\u009cN\u0000\u06c0\u06bf\u0001\u0000\u0000\u0000\u06c1"+
		"\u06c4\u0001\u0000\u0000\u0000\u06c2\u06c0\u0001\u0000\u0000\u0000\u06c2"+
		"\u06c3\u0001\u0000\u0000\u0000\u06c3\u06c5\u0001\u0000\u0000\u0000\u06c4"+
		"\u06c2\u0001\u0000\u0000\u0000\u06c5\u06c6\u0003t:\u0000\u06c6\u06c7\u0003"+
		"p8\u0000\u06c7\u06c8\u0005X\u0000\u0000\u06c8\u06c9\u0003\u01a0\u00d0"+
		"\u0000\u06c9\u06ca\u0005J\u0000\u0000\u06ca\u06cb\u0003\u0108\u0084\u0000"+
		"\u06cb\u0141\u0001\u0000\u0000\u0000\u06cc\u06cd\u0005\u0015\u0000\u0000"+
		"\u06cd\u06d1\u0005I\u0000\u0000\u06ce\u06d0\u0003\u009cN\u0000\u06cf\u06ce"+
		"\u0001\u0000\u0000\u0000\u06d0\u06d3\u0001\u0000\u0000\u0000\u06d1\u06cf"+
		"\u0001\u0000\u0000\u0000\u06d1\u06d2\u0001\u0000\u0000\u0000\u06d2\u06d4"+
		"\u0001\u0000\u0000\u0000\u06d3\u06d1\u0001\u0000\u0000\u0000\u06d4\u06d5"+
		"\u0003t:\u0000\u06d5\u06d6\u0003p8\u0000\u06d6\u06d7\u0005X\u0000\u0000"+
		"\u06d7\u06d8\u0003\u01a0\u00d0\u0000\u06d8\u06d9\u0005J\u0000\u0000\u06d9"+
		"\u06da\u0003\u010a\u0085\u0000\u06da\u0143\u0001\u0000\u0000\u0000\u06db"+
		"\u06dd\u0005\u0004\u0000\u0000\u06dc\u06de\u0005v\u0000\u0000\u06dd\u06dc"+
		"\u0001\u0000\u0000\u0000\u06dd\u06de\u0001\u0000\u0000\u0000\u06de\u06df"+
		"\u0001\u0000\u0000\u0000\u06df\u06e0\u0005O\u0000\u0000\u06e0\u0145\u0001"+
		"\u0000\u0000\u0000\u06e1\u06e3\u0005\u000b\u0000\u0000\u06e2\u06e4\u0005"+
		"v\u0000\u0000\u06e3\u06e2\u0001\u0000\u0000\u0000\u06e3\u06e4\u0001\u0000"+
		"\u0000\u0000\u06e4\u06e5\u0001\u0000\u0000\u0000\u06e5\u06e6\u0005O\u0000"+
		"\u0000\u06e6\u0147\u0001\u0000\u0000\u0000\u06e7\u06e9\u0005$\u0000\u0000"+
		"\u06e8\u06ea\u0003\u01a0\u00d0\u0000\u06e9\u06e8\u0001\u0000\u0000\u0000"+
		"\u06e9\u06ea\u0001\u0000\u0000\u0000\u06ea\u06eb\u0001\u0000\u0000\u0000"+
		"\u06eb\u06ec\u0005O\u0000\u0000\u06ec\u0149\u0001\u0000\u0000\u0000\u06ed"+
		"\u06ee\u0005,\u0000\u0000\u06ee\u06ef\u0003\u01a0\u00d0\u0000\u06ef\u06f0"+
		"\u0005O\u0000\u0000\u06f0\u014b\u0001\u0000\u0000\u0000\u06f1\u06f2\u0005"+
		"*\u0000\u0000\u06f2\u06f3\u0005I\u0000\u0000\u06f3\u06f4\u0003\u01a0\u00d0"+
		"\u0000\u06f4\u06f5\u0005J\u0000\u0000\u06f5\u06f6\u0003\u00fe\u007f\u0000"+
		"\u06f6\u014d\u0001\u0000\u0000\u0000\u06f7\u06f8\u0005/\u0000\u0000\u06f8"+
		"\u06f9\u0003\u00fe\u007f\u0000\u06f9\u06fa\u0003\u0150\u00a8\u0000\u06fa"+
		"\u0704\u0001\u0000\u0000\u0000\u06fb\u06fc\u0005/\u0000\u0000\u06fc\u06fe"+
		"\u0003\u00fe\u007f\u0000\u06fd\u06ff\u0003\u0150\u00a8\u0000\u06fe\u06fd"+
		"\u0001\u0000\u0000\u0000\u06fe\u06ff\u0001\u0000\u0000\u0000\u06ff\u0700"+
		"\u0001\u0000\u0000\u0000\u0700\u0701\u0003\u0158\u00ac\u0000\u0701\u0704"+
		"\u0001\u0000\u0000\u0000\u0702\u0704\u0003\u015a\u00ad\u0000\u0703\u06f7"+
		"\u0001\u0000\u0000\u0000\u0703\u06fb\u0001\u0000\u0000\u0000\u0703\u0702"+
		"\u0001\u0000\u0000\u0000\u0704\u014f\u0001\u0000\u0000\u0000\u0705\u0709"+
		"\u0003\u0152\u00a9\u0000\u0706\u0708\u0003\u0152\u00a9\u0000\u0707\u0706"+
		"\u0001\u0000\u0000\u0000\u0708\u070b\u0001\u0000\u0000\u0000\u0709\u0707"+
		"\u0001\u0000\u0000\u0000\u0709\u070a\u0001\u0000\u0000\u0000\u070a\u0151"+
		"\u0001\u0000\u0000\u0000\u070b\u0709\u0001\u0000\u0000\u0000\u070c\u070d"+
		"\u0005\u0007\u0000\u0000\u070d\u070e\u0005I\u0000\u0000\u070e\u070f\u0003"+
		"\u0154\u00aa\u0000\u070f\u0710\u0005J\u0000\u0000\u0710\u0711\u0003\u00fe"+
		"\u007f\u0000\u0711\u0153\u0001\u0000\u0000\u0000\u0712\u0714\u0003\u009c"+
		"N\u0000\u0713\u0712\u0001\u0000\u0000\u0000\u0714\u0717\u0001\u0000\u0000"+
		"\u0000\u0715\u0713\u0001\u0000\u0000\u0000\u0715\u0716\u0001\u0000\u0000"+
		"\u0000\u0716\u0718\u0001\u0000\u0000\u0000\u0717\u0715\u0001\u0000\u0000"+
		"\u0000\u0718\u0719\u0003\u0156\u00ab\u0000\u0719\u071a\u0003p8\u0000\u071a"+
		"\u0155\u0001\u0000\u0000\u0000\u071b\u0720\u0003|>\u0000\u071c\u071d\u0005"+
		"f\u0000\u0000\u071d\u071f\u0003\u000e\u0007\u0000\u071e\u071c\u0001\u0000"+
		"\u0000\u0000\u071f\u0722\u0001\u0000\u0000\u0000\u0720\u071e\u0001\u0000"+
		"\u0000\u0000\u0720\u0721\u0001\u0000\u0000\u0000\u0721\u0157\u0001\u0000"+
		"\u0000\u0000\u0722\u0720\u0001\u0000\u0000\u0000\u0723\u0724\u0005\u0013"+
		"\u0000\u0000\u0724\u0725\u0003\u00fe\u007f\u0000\u0725\u0159\u0001\u0000"+
		"\u0000\u0000\u0726\u0727\u0005/\u0000\u0000\u0727\u0728\u0003\u015c\u00ae"+
		"\u0000\u0728\u072a\u0003\u00fe\u007f\u0000\u0729\u072b\u0003\u0150\u00a8"+
		"\u0000\u072a\u0729\u0001\u0000\u0000\u0000\u072a\u072b\u0001\u0000\u0000"+
		"\u0000\u072b\u072d\u0001\u0000\u0000\u0000\u072c\u072e\u0003\u0158\u00ac"+
		"\u0000\u072d\u072c\u0001\u0000\u0000\u0000\u072d\u072e\u0001\u0000\u0000"+
		"\u0000\u072e\u015b\u0001\u0000\u0000\u0000\u072f\u0730\u0005I\u0000\u0000"+
		"\u0730\u0732\u0003\u015e\u00af\u0000\u0731\u0733\u0005O\u0000\u0000\u0732"+
		"\u0731\u0001\u0000\u0000\u0000\u0732\u0733\u0001\u0000\u0000\u0000\u0733"+
		"\u0734\u0001\u0000\u0000\u0000\u0734\u0735\u0005J\u0000\u0000\u0735\u015d"+
		"\u0001\u0000\u0000\u0000\u0736\u073b\u0003\u0160\u00b0\u0000\u0737\u0738"+
		"\u0005O\u0000\u0000\u0738\u073a\u0003\u0160\u00b0\u0000\u0739\u0737\u0001"+
		"\u0000\u0000\u0000\u073a\u073d\u0001\u0000\u0000\u0000\u073b\u0739\u0001"+
		"\u0000\u0000\u0000\u073b\u073c\u0001\u0000\u0000\u0000\u073c\u015f\u0001"+
		"\u0000\u0000\u0000\u073d\u073b\u0001\u0000\u0000\u0000\u073e\u0740\u0003"+
		"\u009cN\u0000\u073f\u073e\u0001\u0000\u0000\u0000\u0740\u0743\u0001\u0000"+
		"\u0000\u0000\u0741\u073f\u0001\u0000\u0000\u0000\u0741\u0742\u0001\u0000"+
		"\u0000\u0000\u0742\u0744\u0001\u0000\u0000\u0000\u0743\u0741\u0001\u0000"+
		"\u0000\u0000\u0744\u0745\u0003t:\u0000\u0745\u0746\u0003p8\u0000\u0746"+
		"\u0747\u0005R\u0000\u0000\u0747\u0748\u0003\u01a0\u00d0\u0000\u0748\u0161"+
		"\u0001\u0000\u0000\u0000\u0749\u074c\u0003\u0170\u00b8\u0000\u074a\u074c"+
		"\u0003\u0198\u00cc\u0000\u074b\u0749\u0001\u0000\u0000\u0000\u074b\u074a"+
		"\u0001\u0000\u0000\u0000\u074c\u0750\u0001\u0000\u0000\u0000\u074d\u074f"+
		"\u0003\u016a\u00b5\u0000\u074e\u074d\u0001\u0000\u0000\u0000\u074f\u0752"+
		"\u0001\u0000\u0000\u0000\u0750\u074e\u0001\u0000\u0000\u0000\u0750\u0751"+
		"\u0001\u0000\u0000\u0000\u0751\u0163\u0001\u0000\u0000\u0000\u0752\u0750"+
		"\u0001\u0000\u0000\u0000\u0753\u0771\u0003\u0000\u0000\u0000\u0754\u0759"+
		"\u00034\u001a\u0000\u0755\u0756\u0005M\u0000\u0000\u0756\u0758\u0005N"+
		"\u0000\u0000\u0757\u0755\u0001\u0000\u0000\u0000\u0758\u075b\u0001\u0000"+
		"\u0000\u0000\u0759\u0757\u0001\u0000\u0000\u0000\u0759\u075a\u0001\u0000"+
		"\u0000\u0000\u075a\u075c\u0001\u0000\u0000\u0000\u075b\u0759\u0001\u0000"+
		"\u0000\u0000\u075c\u075d\u0005Q\u0000\u0000\u075d\u075e\u0005\t\u0000"+
		"\u0000\u075e\u0771\u0001\u0000\u0000\u0000\u075f\u0760\u00050\u0000\u0000"+
		"\u0760\u0761\u0005Q\u0000\u0000\u0761\u0771\u0005\t\u0000\u0000\u0762"+
		"\u0771\u0005+\u0000\u0000\u0763\u0764\u00034\u001a\u0000\u0764\u0765\u0005"+
		"Q\u0000\u0000\u0765\u0766\u0005+\u0000\u0000\u0766\u0771\u0001\u0000\u0000"+
		"\u0000\u0767\u0768\u0005I\u0000\u0000\u0768\u0769\u0003\u01a0\u00d0\u0000"+
		"\u0769\u076a\u0005J\u0000\u0000\u076a\u0771\u0001\u0000\u0000\u0000\u076b"+
		"\u0771\u0003\u0176\u00bb\u0000\u076c\u0771\u0003\u017e\u00bf\u0000\u076d"+
		"\u0771\u0003\u0184\u00c2\u0000\u076e\u0771\u0003\u018a\u00c5\u0000\u076f"+
		"\u0771\u0003\u0192\u00c9\u0000\u0770\u0753\u0001\u0000\u0000\u0000\u0770"+
		"\u0754\u0001\u0000\u0000\u0000\u0770\u075f\u0001\u0000\u0000\u0000\u0770"+
		"\u0762\u0001\u0000\u0000\u0000\u0770\u0763\u0001\u0000\u0000\u0000\u0770"+
		"\u0767\u0001\u0000\u0000\u0000\u0770\u076b\u0001\u0000\u0000\u0000\u0770"+
		"\u076c\u0001\u0000\u0000\u0000\u0770\u076d\u0001\u0000\u0000\u0000\u0770"+
		"\u076e\u0001\u0000\u0000\u0000\u0770\u076f\u0001\u0000\u0000\u0000\u0771"+
		"\u0165\u0001\u0000\u0000\u0000\u0772\u0773\u0001\u0000\u0000\u0000\u0773"+
		"\u0167\u0001\u0000\u0000\u0000\u0774\u0791\u0003\u0000\u0000\u0000\u0775"+
		"\u077a\u00034\u001a\u0000\u0776\u0777\u0005M\u0000\u0000\u0777\u0779\u0005"+
		"N\u0000\u0000\u0778\u0776\u0001\u0000\u0000\u0000\u0779\u077c\u0001\u0000"+
		"\u0000\u0000\u077a\u0778\u0001\u0000\u0000\u0000\u077a\u077b\u0001\u0000"+
		"\u0000\u0000\u077b\u077d\u0001\u0000\u0000\u0000\u077c\u077a\u0001\u0000"+
		"\u0000\u0000\u077d\u077e\u0005Q\u0000\u0000\u077e\u077f\u0005\t\u0000"+
		"\u0000\u077f\u0791\u0001\u0000\u0000\u0000\u0780\u0781\u00050\u0000\u0000"+
		"\u0781\u0782\u0005Q\u0000\u0000\u0782\u0791\u0005\t\u0000\u0000\u0783"+
		"\u0791\u0005+\u0000\u0000\u0784\u0785\u00034\u001a\u0000\u0785\u0786\u0005"+
		"Q\u0000\u0000\u0786\u0787\u0005+\u0000\u0000\u0787\u0791\u0001\u0000\u0000"+
		"\u0000\u0788\u0789\u0005I\u0000\u0000\u0789\u078a\u0003\u01a0\u00d0\u0000"+
		"\u078a\u078b\u0005J\u0000\u0000\u078b\u0791\u0001\u0000\u0000\u0000\u078c"+
		"\u0791\u0003\u0176\u00bb\u0000\u078d\u0791\u0003\u017e\u00bf\u0000\u078e"+
		"\u0791\u0003\u018a\u00c5\u0000\u078f\u0791\u0003\u0192\u00c9\u0000\u0790"+
		"\u0774\u0001\u0000\u0000\u0000\u0790\u0775\u0001\u0000\u0000\u0000\u0790"+
		"\u0780\u0001\u0000\u0000\u0000\u0790\u0783\u0001\u0000\u0000\u0000\u0790"+
		"\u0784\u0001\u0000\u0000\u0000\u0790\u0788\u0001\u0000\u0000\u0000\u0790"+
		"\u078c\u0001\u0000\u0000\u0000\u0790\u078d\u0001\u0000\u0000\u0000\u0790"+
		"\u078e\u0001\u0000\u0000\u0000\u0790\u078f\u0001\u0000\u0000\u0000\u0791"+
		"\u0169\u0001\u0000\u0000\u0000\u0792\u0798\u0003\u0178\u00bc\u0000\u0793"+
		"\u0798\u0003\u0180\u00c0\u0000\u0794\u0798\u0003\u0186\u00c3\u0000\u0795"+
		"\u0798\u0003\u018c\u00c6\u0000\u0796\u0798\u0003\u0194\u00ca\u0000\u0797"+
		"\u0792\u0001\u0000\u0000\u0000\u0797\u0793\u0001\u0000\u0000\u0000\u0797"+
		"\u0794\u0001\u0000\u0000\u0000\u0797\u0795\u0001\u0000\u0000\u0000\u0797"+
		"\u0796\u0001\u0000\u0000\u0000\u0798\u016b\u0001\u0000\u0000\u0000\u0799"+
		"\u079a\u0001\u0000\u0000\u0000\u079a\u016d\u0001\u0000\u0000\u0000\u079b"+
		"\u07a0\u0003\u0178\u00bc\u0000\u079c\u07a0\u0003\u0180\u00c0\u0000\u079d"+
		"\u07a0\u0003\u018c\u00c6\u0000\u079e\u07a0\u0003\u0194\u00ca\u0000\u079f"+
		"\u079b\u0001\u0000\u0000\u0000\u079f\u079c\u0001\u0000\u0000\u0000\u079f"+
		"\u079d\u0001\u0000\u0000\u0000\u079f\u079e\u0001\u0000\u0000\u0000\u07a0"+
		"\u016f\u0001\u0000\u0000\u0000\u07a1\u07ca\u0003\u0000\u0000\u0000\u07a2"+
		"\u07a7\u00034\u001a\u0000\u07a3\u07a4\u0005M\u0000\u0000\u07a4\u07a6\u0005"+
		"N\u0000\u0000\u07a5\u07a3\u0001\u0000\u0000\u0000\u07a6\u07a9\u0001\u0000"+
		"\u0000\u0000\u07a7\u07a5\u0001\u0000\u0000\u0000\u07a7\u07a8\u0001\u0000"+
		"\u0000\u0000\u07a8\u07aa\u0001\u0000\u0000\u0000\u07a9\u07a7\u0001\u0000"+
		"\u0000\u0000\u07aa\u07ab\u0005Q\u0000\u0000\u07ab\u07ac\u0005\t\u0000"+
		"\u0000\u07ac\u07ca\u0001\u0000\u0000\u0000\u07ad\u07b2\u0003v;\u0000\u07ae"+
		"\u07af\u0005M\u0000\u0000\u07af\u07b1\u0005N\u0000\u0000\u07b0\u07ae\u0001"+
		"\u0000\u0000\u0000\u07b1\u07b4\u0001\u0000\u0000\u0000\u07b2\u07b0\u0001"+
		"\u0000\u0000\u0000\u07b2\u07b3\u0001\u0000\u0000\u0000\u07b3\u07b5\u0001"+
		"\u0000\u0000\u0000\u07b4\u07b2\u0001\u0000\u0000\u0000\u07b5\u07b6\u0005"+
		"Q\u0000\u0000\u07b6\u07b7\u0005\t\u0000\u0000\u07b7\u07ca\u0001\u0000"+
		"\u0000\u0000\u07b8\u07b9\u00050\u0000\u0000\u07b9\u07ba\u0005Q\u0000\u0000"+
		"\u07ba\u07ca\u0005\t\u0000\u0000\u07bb\u07ca\u0005+\u0000\u0000\u07bc"+
		"\u07bd\u00034\u001a\u0000\u07bd\u07be\u0005Q\u0000\u0000\u07be\u07bf\u0005"+
		"+\u0000\u0000\u07bf\u07ca\u0001\u0000\u0000\u0000\u07c0\u07c1\u0005I\u0000"+
		"\u0000\u07c1\u07c2\u0003\u01a0\u00d0\u0000\u07c2\u07c3\u0005J\u0000\u0000"+
		"\u07c3\u07ca\u0001\u0000\u0000\u0000\u07c4\u07ca\u0003\u017a\u00bd\u0000"+
		"\u07c5\u07ca\u0003\u0182\u00c1\u0000\u07c6\u07ca\u0003\u0188\u00c4\u0000"+
		"\u07c7\u07ca\u0003\u018e\u00c7\u0000\u07c8\u07ca\u0003\u0196\u00cb\u0000"+
		"\u07c9\u07a1\u0001\u0000\u0000\u0000\u07c9\u07a2\u0001\u0000\u0000\u0000"+
		"\u07c9\u07ad\u0001\u0000\u0000\u0000\u07c9\u07b8\u0001\u0000\u0000\u0000"+
		"\u07c9\u07bb\u0001\u0000\u0000\u0000\u07c9\u07bc\u0001\u0000\u0000\u0000"+
		"\u07c9\u07c0\u0001\u0000\u0000\u0000\u07c9\u07c4\u0001\u0000\u0000\u0000"+
		"\u07c9\u07c5\u0001\u0000\u0000\u0000\u07c9\u07c6\u0001\u0000\u0000\u0000"+
		"\u07c9\u07c7\u0001\u0000\u0000\u0000\u07c9\u07c8\u0001\u0000\u0000\u0000"+
		"\u07ca\u0171\u0001\u0000\u0000\u0000\u07cb\u07cc\u0001\u0000\u0000\u0000"+
		"\u07cc\u0173\u0001\u0000\u0000\u0000\u07cd\u07f5\u0003\u0000\u0000\u0000"+
		"\u07ce\u07d3\u00034\u001a\u0000\u07cf\u07d0\u0005M\u0000\u0000\u07d0\u07d2"+
		"\u0005N\u0000\u0000\u07d1\u07cf\u0001\u0000\u0000\u0000\u07d2\u07d5\u0001"+
		"\u0000\u0000\u0000\u07d3\u07d1\u0001\u0000\u0000\u0000\u07d3\u07d4\u0001"+
		"\u0000\u0000\u0000\u07d4\u07d6\u0001\u0000\u0000\u0000\u07d5\u07d3\u0001"+
		"\u0000\u0000\u0000\u07d6\u07d7\u0005Q\u0000\u0000\u07d7\u07d8\u0005\t"+
		"\u0000\u0000\u07d8\u07f5\u0001\u0000\u0000\u0000\u07d9\u07de\u0003v;\u0000"+
		"\u07da\u07db\u0005M\u0000\u0000\u07db\u07dd\u0005N\u0000\u0000\u07dc\u07da"+
		"\u0001\u0000\u0000\u0000\u07dd\u07e0\u0001\u0000\u0000\u0000\u07de\u07dc"+
		"\u0001\u0000\u0000\u0000\u07de\u07df\u0001\u0000\u0000\u0000\u07df\u07e1"+
		"\u0001\u0000\u0000\u0000\u07e0\u07de\u0001\u0000\u0000\u0000\u07e1\u07e2"+
		"\u0005Q\u0000\u0000\u07e2\u07e3\u0005\t\u0000\u0000\u07e3\u07f5\u0001"+
		"\u0000\u0000\u0000\u07e4\u07e5\u00050\u0000\u0000\u07e5\u07e6\u0005Q\u0000"+
		"\u0000\u07e6\u07f5\u0005\t\u0000\u0000\u07e7\u07f5\u0005+\u0000\u0000"+
		"\u07e8\u07e9\u00034\u001a\u0000\u07e9\u07ea\u0005Q\u0000\u0000\u07ea\u07eb"+
		"\u0005+\u0000\u0000\u07eb\u07f5\u0001\u0000\u0000\u0000\u07ec\u07ed\u0005"+
		"I\u0000\u0000\u07ed\u07ee\u0003\u01a0\u00d0\u0000\u07ee\u07ef\u0005J\u0000"+
		"\u0000\u07ef\u07f5\u0001\u0000\u0000\u0000\u07f0\u07f5\u0003\u017a\u00bd"+
		"\u0000\u07f1\u07f5\u0003\u0182\u00c1\u0000\u07f2\u07f5\u0003\u018e\u00c7"+
		"\u0000\u07f3\u07f5\u0003\u0196\u00cb\u0000\u07f4\u07cd\u0001\u0000\u0000"+
		"\u0000\u07f4\u07ce\u0001\u0000\u0000\u0000\u07f4\u07d9\u0001\u0000\u0000"+
		"\u0000\u07f4\u07e4\u0001\u0000\u0000\u0000\u07f4\u07e7\u0001\u0000\u0000"+
		"\u0000\u07f4\u07e8\u0001\u0000\u0000\u0000\u07f4\u07ec\u0001\u0000\u0000"+
		"\u0000\u07f4\u07f0\u0001\u0000\u0000\u0000\u07f4\u07f1\u0001\u0000\u0000"+
		"\u0000\u07f4\u07f2\u0001\u0000\u0000\u0000\u07f4\u07f3\u0001\u0000\u0000"+
		"\u0000\u07f5\u0175\u0001\u0000\u0000\u0000\u07f6\u07f8\u0005\u001f\u0000"+
		"\u0000\u07f7\u07f9\u0003(\u0014\u0000\u07f8\u07f7\u0001\u0000\u0000\u0000"+
		"\u07f8\u07f9\u0001\u0000\u0000\u0000\u07f9\u07fd\u0001\u0000\u0000\u0000"+
		"\u07fa\u07fc\u0003\u00e8t\u0000\u07fb\u07fa\u0001\u0000\u0000\u0000\u07fc"+
		"\u07ff\u0001\u0000\u0000\u0000\u07fd\u07fb\u0001\u0000\u0000\u0000\u07fd"+
		"\u07fe\u0001\u0000\u0000\u0000\u07fe\u0800\u0001\u0000\u0000\u0000\u07ff"+
		"\u07fd\u0001\u0000\u0000\u0000\u0800\u080b\u0005v\u0000\u0000\u0801\u0805"+
		"\u0005Q\u0000\u0000\u0802\u0804\u0003\u00e8t\u0000\u0803\u0802\u0001\u0000"+
		"\u0000\u0000\u0804\u0807\u0001\u0000\u0000\u0000\u0805\u0803\u0001\u0000"+
		"\u0000\u0000\u0805\u0806\u0001\u0000\u0000\u0000\u0806\u0808\u0001\u0000"+
		"\u0000\u0000\u0807\u0805\u0001\u0000\u0000\u0000\u0808\u080a\u0005v\u0000"+
		"\u0000\u0809\u0801\u0001\u0000\u0000\u0000\u080a\u080d\u0001\u0000\u0000"+
		"\u0000\u080b\u0809\u0001\u0000\u0000\u0000\u080b\u080c\u0001\u0000\u0000"+
		"\u0000\u080c\u080f\u0001\u0000\u0000\u0000\u080d\u080b\u0001\u0000\u0000"+
		"\u0000\u080e\u0810\u0003\u017c\u00be\u0000\u080f\u080e\u0001\u0000\u0000"+
		"\u0000\u080f\u0810\u0001\u0000\u0000\u0000\u0810\u0811\u0001\u0000\u0000"+
		"\u0000\u0811\u0813\u0005I\u0000\u0000\u0812\u0814\u0003\u0190\u00c8\u0000"+
		"\u0813\u0812\u0001\u0000\u0000\u0000\u0813\u0814\u0001\u0000\u0000\u0000"+
		"\u0814\u0815\u0001\u0000\u0000\u0000\u0815\u0817\u0005J\u0000\u0000\u0816"+
		"\u0818\u0003b1\u0000\u0817\u0816\u0001\u0000\u0000\u0000\u0817\u0818\u0001"+
		"\u0000\u0000\u0000\u0818\u084a\u0001\u0000\u0000\u0000\u0819\u081a\u0003"+
		"8\u001c\u0000\u081a\u081b\u0005Q\u0000\u0000\u081b\u081d\u0005\u001f\u0000"+
		"\u0000\u081c\u081e\u0003(\u0014\u0000\u081d\u081c\u0001\u0000\u0000\u0000"+
		"\u081d\u081e\u0001\u0000\u0000\u0000\u081e\u0822\u0001\u0000\u0000\u0000"+
		"\u081f\u0821\u0003\u00e8t\u0000\u0820\u081f\u0001\u0000\u0000\u0000\u0821"+
		"\u0824\u0001\u0000\u0000\u0000\u0822\u0820\u0001\u0000\u0000\u0000\u0822"+
		"\u0823\u0001\u0000\u0000\u0000\u0823\u0825\u0001\u0000\u0000\u0000\u0824"+
		"\u0822\u0001\u0000\u0000\u0000\u0825\u0827\u0005v\u0000\u0000\u0826\u0828"+
		"\u0003\u017c\u00be\u0000\u0827\u0826\u0001\u0000\u0000\u0000\u0827\u0828"+
		"\u0001\u0000\u0000\u0000\u0828\u0829\u0001\u0000\u0000\u0000\u0829\u082b"+
		"\u0005I\u0000\u0000\u082a\u082c\u0003\u0190\u00c8\u0000\u082b\u082a\u0001"+
		"\u0000\u0000\u0000\u082b\u082c\u0001\u0000\u0000\u0000\u082c\u082d\u0001"+
		"\u0000\u0000\u0000\u082d\u082f\u0005J\u0000\u0000\u082e\u0830\u0003b1"+
		"\u0000\u082f\u082e\u0001\u0000\u0000\u0000\u082f\u0830\u0001\u0000\u0000"+
		"\u0000\u0830\u084a\u0001\u0000\u0000\u0000\u0831\u0832\u0003\u0162\u00b1"+
		"\u0000\u0832\u0833\u0005Q\u0000\u0000\u0833\u0835\u0005\u001f\u0000\u0000"+
		"\u0834\u0836\u0003(\u0014\u0000\u0835\u0834\u0001\u0000\u0000\u0000\u0835"+
		"\u0836\u0001\u0000\u0000\u0000\u0836\u083a\u0001\u0000\u0000\u0000\u0837"+
		"\u0839\u0003\u00e8t\u0000\u0838\u0837\u0001\u0000\u0000\u0000\u0839\u083c"+
		"\u0001\u0000\u0000\u0000\u083a\u0838\u0001\u0000\u0000\u0000\u083a\u083b"+
		"\u0001\u0000\u0000\u0000\u083b\u083d\u0001\u0000\u0000\u0000\u083c\u083a"+
		"\u0001\u0000\u0000\u0000\u083d\u083f\u0005v\u0000\u0000\u083e\u0840\u0003"+
		"\u017c\u00be\u0000\u083f\u083e\u0001\u0000\u0000\u0000\u083f\u0840\u0001"+
		"\u0000\u0000\u0000\u0840\u0841\u0001\u0000\u0000\u0000\u0841\u0843\u0005"+
		"I\u0000\u0000\u0842\u0844\u0003\u0190\u00c8\u0000\u0843\u0842\u0001\u0000"+
		"\u0000\u0000\u0843\u0844\u0001\u0000\u0000\u0000\u0844\u0845\u0001\u0000"+
		"\u0000\u0000\u0845\u0847\u0005J\u0000\u0000\u0846\u0848\u0003b1\u0000"+
		"\u0847\u0846\u0001\u0000\u0000\u0000\u0847\u0848\u0001\u0000\u0000\u0000"+
		"\u0848\u084a\u0001\u0000\u0000\u0000\u0849\u07f6\u0001\u0000\u0000\u0000"+
		"\u0849\u0819\u0001\u0000\u0000\u0000\u0849\u0831\u0001\u0000\u0000\u0000"+
		"\u084a\u0177\u0001\u0000\u0000\u0000\u084b\u084c\u0005Q\u0000\u0000\u084c"+
		"\u084e\u0005\u001f\u0000\u0000\u084d\u084f\u0003(\u0014\u0000\u084e\u084d"+
		"\u0001\u0000\u0000\u0000\u084e\u084f\u0001\u0000\u0000\u0000\u084f\u0853"+
		"\u0001\u0000\u0000\u0000\u0850\u0852\u0003\u00e8t\u0000\u0851\u0850\u0001"+
		"\u0000\u0000\u0000\u0852\u0855\u0001\u0000\u0000\u0000\u0853\u0851\u0001"+
		"\u0000\u0000\u0000\u0853\u0854\u0001\u0000\u0000\u0000\u0854\u0856\u0001"+
		"\u0000\u0000\u0000\u0855\u0853\u0001\u0000\u0000\u0000\u0856\u0858\u0005"+
		"v\u0000\u0000\u0857\u0859\u0003\u017c\u00be\u0000\u0858\u0857\u0001\u0000"+
		"\u0000\u0000\u0858\u0859\u0001\u0000\u0000\u0000\u0859\u085a\u0001\u0000"+
		"\u0000\u0000\u085a\u085c\u0005I\u0000\u0000\u085b\u085d\u0003\u0190\u00c8"+
		"\u0000\u085c\u085b\u0001\u0000\u0000\u0000\u085c\u085d\u0001\u0000\u0000"+
		"\u0000\u085d\u085e\u0001\u0000\u0000\u0000\u085e\u0860\u0005J\u0000\u0000"+
		"\u085f\u0861\u0003b1\u0000\u0860\u085f\u0001\u0000\u0000\u0000\u0860\u0861"+
		"\u0001\u0000\u0000\u0000\u0861\u0179\u0001\u0000\u0000\u0000\u0862\u0864"+
		"\u0005\u001f\u0000\u0000\u0863\u0865\u0003(\u0014\u0000\u0864\u0863\u0001"+
		"\u0000\u0000\u0000\u0864\u0865\u0001\u0000\u0000\u0000\u0865\u0869\u0001"+
		"\u0000\u0000\u0000\u0866\u0868\u0003\u00e8t\u0000\u0867\u0866\u0001\u0000"+
		"\u0000\u0000\u0868\u086b\u0001\u0000\u0000\u0000\u0869\u0867\u0001\u0000"+
		"\u0000\u0000\u0869\u086a\u0001\u0000\u0000\u0000\u086a\u086c\u0001\u0000"+
		"\u0000\u0000\u086b\u0869\u0001\u0000\u0000\u0000\u086c\u0877\u0005v\u0000"+
		"\u0000\u086d\u0871\u0005Q\u0000\u0000\u086e\u0870\u0003\u00e8t\u0000\u086f"+
		"\u086e\u0001\u0000\u0000\u0000\u0870\u0873\u0001\u0000\u0000\u0000\u0871"+
		"\u086f\u0001\u0000\u0000\u0000\u0871\u0872\u0001\u0000\u0000\u0000\u0872"+
		"\u0874\u0001\u0000\u0000\u0000\u0873\u0871\u0001\u0000\u0000\u0000\u0874"+
		"\u0876\u0005v\u0000\u0000\u0875\u086d\u0001\u0000\u0000\u0000\u0876\u0879"+
		"\u0001\u0000\u0000\u0000\u0877\u0875\u0001\u0000\u0000\u0000\u0877\u0878"+
		"\u0001\u0000\u0000\u0000\u0878\u087b\u0001\u0000\u0000\u0000\u0879\u0877"+
		"\u0001\u0000\u0000\u0000\u087a\u087c\u0003\u017c\u00be\u0000\u087b\u087a"+
		"\u0001\u0000\u0000\u0000\u087b\u087c\u0001\u0000\u0000\u0000\u087c\u087d"+
		"\u0001\u0000\u0000\u0000\u087d\u087f\u0005I\u0000\u0000\u087e\u0880\u0003"+
		"\u0190\u00c8\u0000\u087f\u087e\u0001\u0000\u0000\u0000\u087f\u0880\u0001"+
		"\u0000\u0000\u0000\u0880\u0881\u0001\u0000\u0000\u0000\u0881\u0883\u0005"+
		"J\u0000\u0000\u0882\u0884\u0003b1\u0000\u0883\u0882\u0001\u0000\u0000"+
		"\u0000\u0883\u0884\u0001\u0000\u0000\u0000\u0884\u089e\u0001\u0000\u0000"+
		"\u0000\u0885\u0886\u00038\u001c\u0000\u0886\u0887\u0005Q\u0000\u0000\u0887"+
		"\u0889\u0005\u001f\u0000\u0000\u0888\u088a\u0003(\u0014\u0000\u0889\u0888"+
		"\u0001\u0000\u0000\u0000\u0889\u088a\u0001\u0000\u0000\u0000\u088a\u088e"+
		"\u0001\u0000\u0000\u0000\u088b\u088d\u0003\u00e8t\u0000\u088c\u088b\u0001"+
		"\u0000\u0000\u0000\u088d\u0890\u0001\u0000\u0000\u0000\u088e\u088c\u0001"+
		"\u0000\u0000\u0000\u088e\u088f\u0001\u0000\u0000\u0000\u088f\u0891\u0001"+
		"\u0000\u0000\u0000\u0890\u088e\u0001\u0000\u0000\u0000\u0891\u0893\u0005"+
		"v\u0000\u0000\u0892\u0894\u0003\u017c\u00be\u0000\u0893\u0892\u0001\u0000"+
		"\u0000\u0000\u0893\u0894\u0001\u0000\u0000\u0000\u0894\u0895\u0001\u0000"+
		"\u0000\u0000\u0895\u0897\u0005I\u0000\u0000\u0896\u0898\u0003\u0190\u00c8"+
		"\u0000\u0897\u0896\u0001\u0000\u0000\u0000\u0897\u0898\u0001\u0000\u0000"+
		"\u0000\u0898\u0899\u0001\u0000\u0000\u0000\u0899\u089b\u0005J\u0000\u0000"+
		"\u089a\u089c\u0003b1\u0000\u089b\u089a\u0001\u0000\u0000\u0000\u089b\u089c"+
		"\u0001\u0000\u0000\u0000\u089c\u089e\u0001\u0000\u0000\u0000\u089d\u0862"+
		"\u0001\u0000\u0000\u0000\u089d\u0885\u0001\u0000\u0000\u0000\u089e\u017b"+
		"\u0001\u0000\u0000\u0000\u089f\u08a3\u0003(\u0014\u0000\u08a0\u08a1\u0005"+
		"T\u0000\u0000\u08a1\u08a3\u0005S\u0000\u0000\u08a2\u089f\u0001\u0000\u0000"+
		"\u0000\u08a2\u08a0\u0001\u0000\u0000\u0000\u08a3\u017d\u0001\u0000\u0000"+
		"\u0000\u08a4\u08a5\u0003\u0162\u00b1\u0000\u08a5\u08a6\u0005Q\u0000\u0000"+
		"\u08a6\u08a7\u0005v\u0000\u0000\u08a7\u08b2\u0001\u0000\u0000\u0000\u08a8"+
		"\u08a9\u0005(\u0000\u0000\u08a9\u08aa\u0005Q\u0000\u0000\u08aa\u08b2\u0005"+
		"v\u0000\u0000\u08ab\u08ac\u00034\u001a\u0000\u08ac\u08ad\u0005Q\u0000"+
		"\u0000\u08ad\u08ae\u0005(\u0000\u0000\u08ae\u08af\u0005Q\u0000\u0000\u08af"+
		"\u08b0\u0005v\u0000\u0000\u08b0\u08b2\u0001\u0000\u0000\u0000\u08b1\u08a4"+
		"\u0001\u0000\u0000\u0000\u08b1\u08a8\u0001\u0000\u0000\u0000\u08b1\u08ab"+
		"\u0001\u0000\u0000\u0000\u08b2\u017f\u0001\u0000\u0000\u0000\u08b3\u08b4"+
		"\u0005Q\u0000\u0000\u08b4\u08b5\u0005v\u0000\u0000\u08b5\u0181\u0001\u0000"+
		"\u0000\u0000\u08b6\u08b7\u0005(\u0000\u0000\u08b7\u08b8\u0005Q\u0000\u0000"+
		"\u08b8\u08c0\u0005v\u0000\u0000\u08b9\u08ba\u00034\u001a\u0000\u08ba\u08bb"+
		"\u0005Q\u0000\u0000\u08bb\u08bc\u0005(\u0000\u0000\u08bc\u08bd\u0005Q"+
		"\u0000\u0000\u08bd\u08be\u0005v\u0000\u0000\u08be\u08c0\u0001\u0000\u0000"+
		"\u0000\u08bf\u08b6\u0001\u0000\u0000\u0000\u08bf\u08b9\u0001\u0000\u0000"+
		"\u0000\u08c0\u0183\u0001\u0000\u0000\u0000\u08c1\u08c2\u00038\u001c\u0000"+
		"\u08c2\u08c3\u0005M\u0000\u0000\u08c3\u08c4\u0003\u01a0\u00d0\u0000\u08c4"+
		"\u08c5\u0005N\u0000\u0000\u08c5\u08cc\u0001\u0000\u0000\u0000\u08c6\u08c7"+
		"\u0003\u0168\u00b4\u0000\u08c7\u08c8\u0005M\u0000\u0000\u08c8\u08c9\u0003"+
		"\u01a0\u00d0\u0000\u08c9\u08ca\u0005N\u0000\u0000\u08ca\u08cc\u0001\u0000"+
		"\u0000\u0000\u08cb\u08c1\u0001\u0000\u0000\u0000\u08cb\u08c6\u0001\u0000"+
		"\u0000\u0000\u08cc\u08d4\u0001\u0000\u0000\u0000\u08cd\u08ce\u0003\u0166"+
		"\u00b3\u0000\u08ce\u08cf\u0005M\u0000\u0000\u08cf\u08d0\u0003\u01a0\u00d0"+
		"\u0000\u08d0\u08d1\u0005N\u0000\u0000\u08d1\u08d3\u0001\u0000\u0000\u0000"+
		"\u08d2\u08cd\u0001\u0000\u0000\u0000\u08d3\u08d6\u0001\u0000\u0000\u0000"+
		"\u08d4\u08d2\u0001\u0000\u0000\u0000\u08d4\u08d5\u0001\u0000\u0000\u0000"+
		"\u08d5\u0185\u0001\u0000\u0000\u0000\u08d6\u08d4\u0001\u0000\u0000\u0000"+
		"\u08d7\u08d8\u0003\u016e\u00b7\u0000\u08d8\u08d9\u0005M\u0000\u0000\u08d9"+
		"\u08da\u0003\u01a0\u00d0\u0000\u08da\u08e2\u0005N\u0000\u0000\u08db\u08dc"+
		"\u0003\u016c\u00b6\u0000\u08dc\u08dd\u0005M\u0000\u0000\u08dd\u08de\u0003"+
		"\u01a0\u00d0\u0000\u08de\u08df\u0005N\u0000\u0000\u08df\u08e1\u0001\u0000"+
		"\u0000\u0000\u08e0\u08db\u0001\u0000\u0000\u0000\u08e1\u08e4\u0001\u0000"+
		"\u0000\u0000\u08e2\u08e0\u0001\u0000\u0000\u0000\u08e2\u08e3\u0001\u0000"+
		"\u0000\u0000\u08e3\u0187\u0001\u0000\u0000\u0000\u08e4\u08e2\u0001\u0000"+
		"\u0000\u0000\u08e5\u08e6\u00038\u001c\u0000\u08e6\u08e7\u0005M\u0000\u0000"+
		"\u08e7\u08e8\u0003\u01a0\u00d0\u0000\u08e8\u08e9\u0005N\u0000\u0000\u08e9"+
		"\u08f0\u0001\u0000\u0000\u0000\u08ea\u08eb\u0003\u0174\u00ba\u0000\u08eb"+
		"\u08ec\u0005M\u0000\u0000\u08ec\u08ed\u0003\u01a0\u00d0\u0000\u08ed\u08ee"+
		"\u0005N\u0000\u0000\u08ee\u08f0\u0001\u0000\u0000\u0000\u08ef\u08e5\u0001"+
		"\u0000\u0000\u0000\u08ef\u08ea\u0001\u0000\u0000\u0000\u08f0\u08f8\u0001"+
		"\u0000\u0000\u0000\u08f1\u08f2\u0003\u0172\u00b9\u0000\u08f2\u08f3\u0005"+
		"M\u0000\u0000\u08f3\u08f4\u0003\u01a0\u00d0\u0000\u08f4\u08f5\u0005N\u0000"+
		"\u0000\u08f5\u08f7\u0001\u0000\u0000\u0000\u08f6\u08f1\u0001\u0000\u0000"+
		"\u0000\u08f7\u08fa\u0001\u0000\u0000\u0000\u08f8\u08f6\u0001\u0000\u0000"+
		"\u0000\u08f8\u08f9\u0001\u0000\u0000\u0000\u08f9\u0189\u0001\u0000\u0000"+
		"\u0000\u08fa\u08f8\u0001\u0000\u0000\u0000\u08fb\u08fc\u0003:\u001d\u0000"+
		"\u08fc\u08fe\u0005I\u0000\u0000\u08fd\u08ff\u0003\u0190\u00c8\u0000\u08fe"+
		"\u08fd\u0001\u0000\u0000\u0000\u08fe\u08ff\u0001\u0000\u0000\u0000\u08ff"+
		"\u0900\u0001\u0000\u0000\u0000\u0900\u0901\u0005J\u0000\u0000\u0901\u0940"+
		"\u0001\u0000\u0000\u0000\u0902\u0903\u00034\u001a\u0000\u0903\u0905\u0005"+
		"Q\u0000\u0000\u0904\u0906\u0003(\u0014\u0000\u0905\u0904\u0001\u0000\u0000"+
		"\u0000\u0905\u0906\u0001\u0000\u0000\u0000\u0906\u0907\u0001\u0000\u0000"+
		"\u0000\u0907\u0908\u0005v\u0000\u0000\u0908\u090a\u0005I\u0000\u0000\u0909"+
		"\u090b\u0003\u0190\u00c8\u0000\u090a\u0909\u0001\u0000\u0000\u0000\u090a"+
		"\u090b\u0001\u0000\u0000\u0000\u090b\u090c\u0001\u0000\u0000\u0000\u090c"+
		"\u090d\u0005J\u0000\u0000\u090d\u0940\u0001\u0000\u0000\u0000\u090e\u090f"+
		"\u00038\u001c\u0000\u090f\u0911\u0005Q\u0000\u0000\u0910\u0912\u0003("+
		"\u0014\u0000\u0911\u0910\u0001\u0000\u0000\u0000\u0911\u0912\u0001\u0000"+
		"\u0000\u0000\u0912\u0913\u0001\u0000\u0000\u0000\u0913\u0914\u0005v\u0000"+
		"\u0000\u0914\u0916\u0005I\u0000\u0000\u0915\u0917\u0003\u0190\u00c8\u0000"+
		"\u0916\u0915\u0001\u0000\u0000\u0000\u0916\u0917\u0001\u0000\u0000\u0000"+
		"\u0917\u0918\u0001\u0000\u0000\u0000\u0918\u0919\u0005J\u0000\u0000\u0919"+
		"\u0940\u0001\u0000\u0000\u0000\u091a\u091b\u0003\u0162\u00b1\u0000\u091b"+
		"\u091d\u0005Q\u0000\u0000\u091c\u091e\u0003(\u0014\u0000\u091d\u091c\u0001"+
		"\u0000\u0000\u0000\u091d\u091e\u0001\u0000\u0000\u0000\u091e\u091f\u0001"+
		"\u0000\u0000\u0000\u091f\u0920\u0005v\u0000\u0000\u0920\u0922\u0005I\u0000"+
		"\u0000\u0921\u0923\u0003\u0190\u00c8\u0000\u0922\u0921\u0001\u0000\u0000"+
		"\u0000\u0922\u0923\u0001\u0000\u0000\u0000\u0923\u0924\u0001\u0000\u0000"+
		"\u0000\u0924\u0925\u0005J\u0000\u0000\u0925\u0940\u0001\u0000\u0000\u0000"+
		"\u0926\u0927\u0005(\u0000\u0000\u0927\u0929\u0005Q\u0000\u0000\u0928\u092a"+
		"\u0003(\u0014\u0000\u0929\u0928\u0001\u0000\u0000\u0000\u0929\u092a\u0001"+
		"\u0000\u0000\u0000\u092a\u092b\u0001\u0000\u0000\u0000\u092b\u092c\u0005"+
		"v\u0000\u0000\u092c\u092e\u0005I\u0000\u0000\u092d\u092f\u0003\u0190\u00c8"+
		"\u0000\u092e\u092d\u0001\u0000\u0000\u0000\u092e\u092f\u0001\u0000\u0000"+
		"\u0000\u092f\u0930\u0001\u0000\u0000\u0000\u0930\u0940\u0005J\u0000\u0000"+
		"\u0931\u0932\u00034\u001a\u0000\u0932\u0933\u0005Q\u0000\u0000\u0933\u0934"+
		"\u0005(\u0000\u0000\u0934\u0936\u0005Q\u0000\u0000\u0935\u0937\u0003("+
		"\u0014\u0000\u0936\u0935\u0001\u0000\u0000\u0000\u0936\u0937\u0001\u0000"+
		"\u0000\u0000\u0937\u0938\u0001\u0000\u0000\u0000\u0938\u0939\u0005v\u0000"+
		"\u0000\u0939\u093b\u0005I\u0000\u0000\u093a\u093c\u0003\u0190\u00c8\u0000"+
		"\u093b\u093a\u0001\u0000\u0000\u0000\u093b\u093c\u0001\u0000\u0000\u0000"+
		"\u093c\u093d\u0001\u0000\u0000\u0000\u093d\u093e\u0005J\u0000\u0000\u093e"+
		"\u0940\u0001\u0000\u0000\u0000\u093f\u08fb\u0001\u0000\u0000\u0000\u093f"+
		"\u0902\u0001\u0000\u0000\u0000\u093f\u090e\u0001\u0000\u0000\u0000\u093f"+
		"\u091a\u0001\u0000\u0000\u0000\u093f\u0926\u0001\u0000\u0000\u0000\u093f"+
		"\u0931\u0001\u0000\u0000\u0000\u0940\u018b\u0001\u0000\u0000\u0000\u0941"+
		"\u0943\u0005Q\u0000\u0000\u0942\u0944\u0003(\u0014\u0000\u0943\u0942\u0001"+
		"\u0000\u0000\u0000\u0943\u0944\u0001\u0000\u0000\u0000\u0944\u0945\u0001"+
		"\u0000\u0000\u0000\u0945\u0946\u0005v\u0000\u0000\u0946\u0948\u0005I\u0000"+
		"\u0000\u0947\u0949\u0003\u0190\u00c8\u0000\u0948\u0947\u0001\u0000\u0000"+
		"\u0000\u0948\u0949\u0001\u0000\u0000\u0000\u0949\u094a\u0001\u0000\u0000"+
		"\u0000\u094a\u094b\u0005J\u0000\u0000\u094b\u018d\u0001\u0000\u0000\u0000"+
		"\u094c\u094d\u0003:\u001d\u0000\u094d\u094f\u0005I\u0000\u0000\u094e\u0950"+
		"\u0003\u0190\u00c8\u0000\u094f\u094e\u0001\u0000\u0000\u0000\u094f\u0950"+
		"\u0001\u0000\u0000\u0000\u0950\u0951\u0001\u0000\u0000\u0000\u0951\u0952"+
		"\u0005J\u0000\u0000\u0952\u0985\u0001\u0000\u0000\u0000\u0953\u0954\u0003"+
		"4\u001a\u0000\u0954\u0956\u0005Q\u0000\u0000\u0955\u0957\u0003(\u0014"+
		"\u0000\u0956\u0955\u0001\u0000\u0000\u0000\u0956\u0957\u0001\u0000\u0000"+
		"\u0000\u0957\u0958\u0001\u0000\u0000\u0000\u0958\u0959\u0005v\u0000\u0000"+
		"\u0959\u095b\u0005I\u0000\u0000\u095a\u095c\u0003\u0190\u00c8\u0000\u095b"+
		"\u095a\u0001\u0000\u0000\u0000\u095b\u095c\u0001\u0000\u0000\u0000\u095c"+
		"\u095d\u0001\u0000\u0000\u0000\u095d\u095e\u0005J\u0000\u0000\u095e\u0985"+
		"\u0001\u0000\u0000\u0000\u095f\u0960\u00038\u001c\u0000\u0960\u0962\u0005"+
		"Q\u0000\u0000\u0961\u0963\u0003(\u0014\u0000\u0962\u0961\u0001\u0000\u0000"+
		"\u0000\u0962\u0963\u0001\u0000\u0000";
	private static final String _serializedATNSegment1 =
		"\u0000\u0963\u0964\u0001\u0000\u0000\u0000\u0964\u0965\u0005v\u0000\u0000"+
		"\u0965\u0967\u0005I\u0000\u0000\u0966\u0968\u0003\u0190\u00c8\u0000\u0967"+
		"\u0966\u0001\u0000\u0000\u0000\u0967\u0968\u0001\u0000\u0000\u0000\u0968"+
		"\u0969\u0001\u0000\u0000\u0000\u0969\u096a\u0005J\u0000\u0000\u096a\u0985"+
		"\u0001\u0000\u0000\u0000\u096b\u096c\u0005(\u0000\u0000\u096c\u096e\u0005"+
		"Q\u0000\u0000\u096d\u096f\u0003(\u0014\u0000\u096e\u096d\u0001\u0000\u0000"+
		"\u0000\u096e\u096f\u0001\u0000\u0000\u0000\u096f\u0970\u0001\u0000\u0000"+
		"\u0000\u0970\u0971\u0005v\u0000\u0000\u0971\u0973\u0005I\u0000\u0000\u0972"+
		"\u0974\u0003\u0190\u00c8\u0000\u0973\u0972\u0001\u0000\u0000\u0000\u0973"+
		"\u0974\u0001\u0000\u0000\u0000\u0974\u0975\u0001\u0000\u0000\u0000\u0975"+
		"\u0985\u0005J\u0000\u0000\u0976\u0977\u00034\u001a\u0000\u0977\u0978\u0005"+
		"Q\u0000\u0000\u0978\u0979\u0005(\u0000\u0000\u0979\u097b\u0005Q\u0000"+
		"\u0000\u097a\u097c\u0003(\u0014\u0000\u097b\u097a\u0001\u0000\u0000\u0000"+
		"\u097b\u097c\u0001\u0000\u0000\u0000\u097c\u097d\u0001\u0000\u0000\u0000"+
		"\u097d\u097e\u0005v\u0000\u0000\u097e\u0980\u0005I\u0000\u0000\u097f\u0981"+
		"\u0003\u0190\u00c8\u0000\u0980\u097f\u0001\u0000\u0000\u0000\u0980\u0981"+
		"\u0001\u0000\u0000\u0000\u0981\u0982\u0001\u0000\u0000\u0000\u0982\u0983"+
		"\u0005J\u0000\u0000\u0983\u0985\u0001\u0000\u0000\u0000\u0984\u094c\u0001"+
		"\u0000\u0000\u0000\u0984\u0953\u0001\u0000\u0000\u0000\u0984\u095f\u0001"+
		"\u0000\u0000\u0000\u0984\u096b\u0001\u0000\u0000\u0000\u0984\u0976\u0001"+
		"\u0000\u0000\u0000\u0985\u018f\u0001\u0000\u0000\u0000\u0986\u098b\u0003"+
		"\u01a0\u00d0\u0000\u0987\u0988\u0005P\u0000\u0000\u0988\u098a\u0003\u01a0"+
		"\u00d0\u0000\u0989\u0987\u0001\u0000\u0000\u0000\u098a\u098d\u0001\u0000"+
		"\u0000\u0000\u098b\u0989\u0001\u0000\u0000\u0000\u098b\u098c\u0001\u0000"+
		"\u0000\u0000\u098c\u0191\u0001\u0000\u0000\u0000\u098d\u098b\u0001\u0000"+
		"\u0000\u0000\u098e\u098f\u00038\u001c\u0000\u098f\u0991\u0005j\u0000\u0000"+
		"\u0990\u0992\u0003(\u0014\u0000\u0991\u0990\u0001\u0000\u0000\u0000\u0991"+
		"\u0992\u0001\u0000\u0000\u0000\u0992\u0993\u0001\u0000\u0000\u0000\u0993"+
		"\u0994\u0005v\u0000\u0000\u0994\u09be\u0001\u0000\u0000\u0000\u0995\u0996"+
		"\u0003\n\u0005\u0000\u0996\u0998\u0005j\u0000\u0000\u0997\u0999\u0003"+
		"(\u0014\u0000\u0998\u0997\u0001\u0000\u0000\u0000\u0998\u0999\u0001\u0000"+
		"\u0000\u0000\u0999\u099a\u0001\u0000\u0000\u0000\u099a\u099b\u0005v\u0000"+
		"\u0000\u099b\u09be\u0001\u0000\u0000\u0000\u099c\u099d\u0003\u0162\u00b1"+
		"\u0000\u099d\u099f\u0005j\u0000\u0000\u099e\u09a0\u0003(\u0014\u0000\u099f"+
		"\u099e\u0001\u0000\u0000\u0000\u099f\u09a0\u0001\u0000\u0000\u0000\u09a0"+
		"\u09a1\u0001\u0000\u0000\u0000\u09a1\u09a2\u0005v\u0000\u0000\u09a2\u09be"+
		"\u0001\u0000\u0000\u0000\u09a3\u09a4\u0005(\u0000\u0000\u09a4\u09a6\u0005"+
		"j\u0000\u0000\u09a5\u09a7\u0003(\u0014\u0000\u09a6\u09a5\u0001\u0000\u0000"+
		"\u0000\u09a6\u09a7\u0001\u0000\u0000\u0000\u09a7\u09a8\u0001\u0000\u0000"+
		"\u0000\u09a8\u09be\u0005v\u0000\u0000\u09a9\u09aa\u00034\u001a\u0000\u09aa"+
		"\u09ab\u0005Q\u0000\u0000\u09ab\u09ac\u0005(\u0000\u0000\u09ac\u09ae\u0005"+
		"j\u0000\u0000\u09ad\u09af\u0003(\u0014\u0000\u09ae\u09ad\u0001\u0000\u0000"+
		"\u0000\u09ae\u09af\u0001\u0000\u0000\u0000\u09af\u09b0\u0001\u0000\u0000"+
		"\u0000\u09b0\u09b1\u0005v\u0000\u0000\u09b1\u09be\u0001\u0000\u0000\u0000"+
		"\u09b2\u09b3\u0003\u000e\u0007\u0000\u09b3\u09b5\u0005j\u0000\u0000\u09b4"+
		"\u09b6\u0003(\u0014\u0000\u09b5\u09b4\u0001\u0000\u0000\u0000\u09b5\u09b6"+
		"\u0001\u0000\u0000\u0000\u09b6\u09b7\u0001\u0000\u0000\u0000\u09b7\u09b8"+
		"\u0005\u001f\u0000\u0000\u09b8\u09be\u0001\u0000\u0000\u0000\u09b9\u09ba"+
		"\u0003\u001c\u000e\u0000\u09ba\u09bb\u0005j\u0000\u0000\u09bb\u09bc\u0005"+
		"\u001f\u0000\u0000\u09bc\u09be\u0001\u0000\u0000\u0000\u09bd\u098e\u0001"+
		"\u0000\u0000\u0000\u09bd\u0995\u0001\u0000\u0000\u0000\u09bd\u099c\u0001"+
		"\u0000\u0000\u0000\u09bd\u09a3\u0001\u0000\u0000\u0000\u09bd\u09a9\u0001"+
		"\u0000\u0000\u0000\u09bd\u09b2\u0001\u0000\u0000\u0000\u09bd\u09b9\u0001"+
		"\u0000\u0000\u0000\u09be\u0193\u0001\u0000\u0000\u0000\u09bf\u09c1\u0005"+
		"j\u0000\u0000\u09c0\u09c2\u0003(\u0014\u0000\u09c1\u09c0\u0001\u0000\u0000"+
		"\u0000\u09c1\u09c2\u0001\u0000\u0000\u0000\u09c2\u09c3\u0001\u0000\u0000"+
		"\u0000\u09c3\u09c4\u0005v\u0000\u0000\u09c4\u0195\u0001\u0000\u0000\u0000"+
		"\u09c5\u09c6\u00038\u001c\u0000\u09c6\u09c8\u0005j\u0000\u0000\u09c7\u09c9"+
		"\u0003(\u0014\u0000\u09c8\u09c7\u0001\u0000\u0000\u0000\u09c8\u09c9\u0001"+
		"\u0000\u0000\u0000\u09c9\u09ca\u0001\u0000\u0000\u0000\u09ca\u09cb\u0005"+
		"v\u0000\u0000\u09cb\u09ee\u0001\u0000\u0000\u0000\u09cc\u09cd\u0003\n"+
		"\u0005\u0000\u09cd\u09cf\u0005j\u0000\u0000\u09ce\u09d0\u0003(\u0014\u0000"+
		"\u09cf\u09ce\u0001\u0000\u0000\u0000\u09cf\u09d0\u0001\u0000\u0000\u0000"+
		"\u09d0\u09d1\u0001\u0000\u0000\u0000\u09d1\u09d2\u0005v\u0000\u0000\u09d2"+
		"\u09ee\u0001\u0000\u0000\u0000\u09d3\u09d4\u0005(\u0000\u0000\u09d4\u09d6"+
		"\u0005j\u0000\u0000\u09d5\u09d7\u0003(\u0014\u0000\u09d6\u09d5\u0001\u0000"+
		"\u0000\u0000\u09d6\u09d7\u0001\u0000\u0000\u0000\u09d7\u09d8\u0001\u0000"+
		"\u0000\u0000\u09d8\u09ee\u0005v\u0000\u0000\u09d9\u09da\u00034\u001a\u0000"+
		"\u09da\u09db\u0005Q\u0000\u0000\u09db\u09dc\u0005(\u0000\u0000\u09dc\u09de"+
		"\u0005j\u0000\u0000\u09dd\u09df\u0003(\u0014\u0000\u09de\u09dd\u0001\u0000"+
		"\u0000\u0000\u09de\u09df\u0001\u0000\u0000\u0000\u09df\u09e0\u0001\u0000"+
		"\u0000\u0000\u09e0\u09e1\u0005v\u0000\u0000\u09e1\u09ee\u0001\u0000\u0000"+
		"\u0000\u09e2\u09e3\u0003\u000e\u0007\u0000\u09e3\u09e5\u0005j\u0000\u0000"+
		"\u09e4\u09e6\u0003(\u0014\u0000\u09e5\u09e4\u0001\u0000\u0000\u0000\u09e5"+
		"\u09e6\u0001\u0000\u0000\u0000\u09e6\u09e7\u0001\u0000\u0000\u0000\u09e7"+
		"\u09e8\u0005\u001f\u0000\u0000\u09e8\u09ee\u0001\u0000\u0000\u0000\u09e9"+
		"\u09ea\u0003\u001c\u000e\u0000\u09ea\u09eb\u0005j\u0000\u0000\u09eb\u09ec"+
		"\u0005\u001f\u0000\u0000\u09ec\u09ee\u0001\u0000\u0000\u0000\u09ed\u09c5"+
		"\u0001\u0000\u0000\u0000\u09ed\u09cc\u0001\u0000\u0000\u0000\u09ed\u09d3"+
		"\u0001\u0000\u0000\u0000\u09ed\u09d9\u0001\u0000\u0000\u0000\u09ed\u09e2"+
		"\u0001\u0000\u0000\u0000\u09ed\u09e9\u0001\u0000\u0000\u0000\u09ee\u0197"+
		"\u0001\u0000\u0000\u0000\u09ef\u09f0\u0005\u001f\u0000\u0000\u09f0\u09f1"+
		"\u0003\u0002\u0001\u0000\u09f1\u09f3\u0003\u019a\u00cd\u0000\u09f2\u09f4"+
		"\u0003\u001e\u000f\u0000\u09f3\u09f2\u0001\u0000\u0000\u0000\u09f3\u09f4"+
		"\u0001\u0000\u0000\u0000\u09f4\u0a06\u0001\u0000\u0000\u0000\u09f5\u09f6"+
		"\u0005\u001f\u0000\u0000\u09f6\u09f7\u0003\f\u0006\u0000\u09f7\u09f9\u0003"+
		"\u019a\u00cd\u0000\u09f8\u09fa\u0003\u001e\u000f\u0000\u09f9\u09f8\u0001"+
		"\u0000\u0000\u0000\u09f9\u09fa\u0001\u0000\u0000\u0000\u09fa\u0a06\u0001"+
		"\u0000\u0000\u0000\u09fb\u09fc\u0005\u001f\u0000\u0000\u09fc\u09fd\u0003"+
		"\u0002\u0001\u0000\u09fd\u09fe\u0003\u001e\u000f\u0000\u09fe\u09ff\u0003"+
		"\u00fa}\u0000\u09ff\u0a06\u0001\u0000\u0000\u0000\u0a00\u0a01\u0005\u001f"+
		"\u0000\u0000\u0a01\u0a02\u0003\f\u0006\u0000\u0a02\u0a03\u0003\u001e\u000f"+
		"\u0000\u0a03\u0a04\u0003\u00fa}\u0000\u0a04\u0a06\u0001\u0000\u0000\u0000"+
		"\u0a05\u09ef\u0001\u0000\u0000\u0000\u0a05\u09f5\u0001\u0000\u0000\u0000"+
		"\u0a05\u09fb\u0001\u0000\u0000\u0000\u0a05\u0a00\u0001\u0000\u0000\u0000"+
		"\u0a06\u0199\u0001\u0000\u0000\u0000\u0a07\u0a0b\u0003\u019c\u00ce\u0000"+
		"\u0a08\u0a0a\u0003\u019c\u00ce\u0000\u0a09\u0a08\u0001\u0000\u0000\u0000"+
		"\u0a0a\u0a0d\u0001\u0000\u0000\u0000\u0a0b\u0a09\u0001\u0000\u0000\u0000"+
		"\u0a0b\u0a0c\u0001\u0000\u0000\u0000\u0a0c\u019b\u0001\u0000\u0000\u0000"+
		"\u0a0d\u0a0b\u0001\u0000\u0000\u0000\u0a0e\u0a10\u0003\u00e8t\u0000\u0a0f"+
		"\u0a0e\u0001\u0000\u0000\u0000\u0a10\u0a13\u0001\u0000\u0000\u0000\u0a11"+
		"\u0a0f\u0001\u0000\u0000\u0000\u0a11\u0a12\u0001\u0000\u0000\u0000\u0a12"+
		"\u0a14\u0001\u0000\u0000\u0000\u0a13\u0a11\u0001\u0000\u0000\u0000\u0a14"+
		"\u0a15\u0005M\u0000\u0000\u0a15\u0a16\u0003\u01a0\u00d0\u0000\u0a16\u0a17"+
		"\u0005N\u0000\u0000\u0a17\u019d\u0001\u0000\u0000\u0000\u0a18\u0a19\u0003"+
		"\u01a0\u00d0\u0000\u0a19\u019f\u0001\u0000\u0000\u0000\u0a1a\u0a1d\u0003"+
		"\u01a2\u00d1\u0000\u0a1b\u0a1d\u0003\u01aa\u00d5\u0000\u0a1c\u0a1a\u0001"+
		"\u0000\u0000\u0000\u0a1c\u0a1b\u0001\u0000\u0000\u0000\u0a1d\u01a1\u0001"+
		"\u0000\u0000\u0000\u0a1e\u0a1f\u0003\u01a4\u00d2\u0000\u0a1f\u0a20\u0005"+
		"i\u0000\u0000\u0a20\u0a21\u0003\u01a8\u00d4\u0000\u0a21\u01a3\u0001\u0000"+
		"\u0000\u0000\u0a22\u0a2d\u0005v\u0000\u0000\u0a23\u0a25\u0005I\u0000\u0000"+
		"\u0a24\u0a26\u0003\u0096K\u0000\u0a25\u0a24\u0001\u0000\u0000\u0000\u0a25"+
		"\u0a26\u0001\u0000\u0000\u0000\u0a26\u0a27\u0001\u0000\u0000\u0000\u0a27"+
		"\u0a2d\u0005J\u0000\u0000\u0a28\u0a29\u0005I\u0000\u0000\u0a29\u0a2a\u0003"+
		"\u01a6\u00d3\u0000\u0a2a\u0a2b\u0005J\u0000\u0000\u0a2b\u0a2d\u0001\u0000"+
		"\u0000\u0000\u0a2c\u0a22\u0001\u0000\u0000\u0000\u0a2c\u0a23\u0001\u0000"+
		"\u0000\u0000\u0a2c\u0a28\u0001\u0000\u0000\u0000\u0a2d\u01a5\u0001\u0000"+
		"\u0000\u0000\u0a2e\u0a33\u0005v\u0000\u0000\u0a2f\u0a30\u0005P\u0000\u0000"+
		"\u0a30\u0a32\u0005v\u0000\u0000\u0a31\u0a2f\u0001\u0000\u0000\u0000\u0a32"+
		"\u0a35\u0001\u0000\u0000\u0000\u0a33\u0a31\u0001\u0000\u0000\u0000\u0a33"+
		"\u0a34\u0001\u0000\u0000\u0000\u0a34\u01a7\u0001\u0000\u0000\u0000\u0a35"+
		"\u0a33\u0001\u0000\u0000\u0000\u0a36\u0a39\u0003\u01a0\u00d0\u0000\u0a37"+
		"\u0a39\u0003\u00fe\u007f\u0000\u0a38\u0a36\u0001\u0000\u0000\u0000\u0a38"+
		"\u0a37\u0001\u0000\u0000\u0000\u0a39\u01a9\u0001\u0000\u0000\u0000\u0a3a"+
		"\u0a3d\u0003\u01b2\u00d9\u0000\u0a3b\u0a3d\u0003\u01ac\u00d6\u0000\u0a3c"+
		"\u0a3a\u0001\u0000\u0000\u0000\u0a3c\u0a3b\u0001\u0000\u0000\u0000\u0a3d"+
		"\u01ab\u0001\u0000\u0000\u0000\u0a3e\u0a3f\u0003\u01ae\u00d7\u0000\u0a3f"+
		"\u0a40\u0003\u01b0\u00d8\u0000\u0a40\u0a41\u0003\u01a0\u00d0\u0000\u0a41"+
		"\u01ad\u0001\u0000\u0000\u0000\u0a42\u0a46\u00038\u001c\u0000\u0a43\u0a46"+
		"\u0003\u017e\u00bf\u0000\u0a44\u0a46\u0003\u0184\u00c2\u0000\u0a45\u0a42"+
		"\u0001\u0000\u0000\u0000\u0a45\u0a43\u0001\u0000\u0000\u0000\u0a45\u0a44"+
		"\u0001\u0000\u0000\u0000\u0a46\u01af\u0001\u0000\u0000\u0000\u0a47\u0a48"+
		"\u0007\u0005\u0000\u0000\u0a48\u01b1\u0001\u0000\u0000\u0000\u0a49\u0a51"+
		"\u0003\u01b4\u00da\u0000\u0a4a\u0a4b\u0003\u01b4\u00da\u0000\u0a4b\u0a4c"+
		"\u0005W\u0000\u0000\u0a4c\u0a4d\u0003\u01a0\u00d0\u0000\u0a4d\u0a4e\u0005"+
		"X\u0000\u0000\u0a4e\u0a4f\u0003\u01b2\u00d9\u0000\u0a4f\u0a51\u0001\u0000"+
		"\u0000\u0000\u0a50\u0a49\u0001\u0000\u0000\u0000\u0a50\u0a4a\u0001\u0000"+
		"\u0000\u0000\u0a51\u01b3\u0001\u0000\u0000\u0000\u0a52\u0a53\u0006\u00da"+
		"\uffff\uffff\u0000\u0a53\u0a54\u0003\u01b6\u00db\u0000\u0a54\u0a5a\u0001"+
		"\u0000\u0000\u0000\u0a55\u0a56\n\u0001\u0000\u0000\u0a56\u0a57\u0005^"+
		"\u0000\u0000\u0a57\u0a59\u0003\u01b6\u00db\u0000\u0a58\u0a55\u0001\u0000"+
		"\u0000\u0000\u0a59\u0a5c\u0001\u0000\u0000\u0000\u0a5a\u0a58\u0001\u0000"+
		"\u0000\u0000\u0a5a\u0a5b\u0001\u0000\u0000\u0000\u0a5b\u01b5\u0001\u0000"+
		"\u0000\u0000\u0a5c\u0a5a\u0001\u0000\u0000\u0000\u0a5d\u0a5e\u0006\u00db"+
		"\uffff\uffff\u0000\u0a5e\u0a5f\u0003\u01b8\u00dc\u0000\u0a5f\u0a65\u0001"+
		"\u0000\u0000\u0000\u0a60\u0a61\n\u0001\u0000\u0000\u0a61\u0a62\u0005]"+
		"\u0000\u0000\u0a62\u0a64\u0003\u01b8\u00dc\u0000\u0a63\u0a60\u0001\u0000"+
		"\u0000\u0000\u0a64\u0a67\u0001\u0000\u0000\u0000\u0a65\u0a63\u0001\u0000"+
		"\u0000\u0000\u0a65\u0a66\u0001\u0000\u0000\u0000\u0a66\u01b7\u0001\u0000"+
		"\u0000\u0000\u0a67\u0a65\u0001\u0000\u0000\u0000\u0a68\u0a69\u0006\u00dc"+
		"\uffff\uffff\u0000\u0a69\u0a6a\u0003\u01ba\u00dd\u0000\u0a6a\u0a70\u0001"+
		"\u0000\u0000\u0000\u0a6b\u0a6c\n\u0001\u0000\u0000\u0a6c\u0a6d\u0005f"+
		"\u0000\u0000\u0a6d\u0a6f\u0003\u01ba\u00dd\u0000\u0a6e\u0a6b\u0001\u0000"+
		"\u0000\u0000\u0a6f\u0a72\u0001\u0000\u0000\u0000\u0a70\u0a6e\u0001\u0000"+
		"\u0000\u0000\u0a70\u0a71\u0001\u0000\u0000\u0000\u0a71\u01b9\u0001\u0000"+
		"\u0000\u0000\u0a72\u0a70\u0001\u0000\u0000\u0000\u0a73\u0a74\u0006\u00dd"+
		"\uffff\uffff\u0000\u0a74\u0a75\u0003\u01bc\u00de\u0000\u0a75\u0a7b\u0001"+
		"\u0000\u0000\u0000\u0a76\u0a77\n\u0001\u0000\u0000\u0a77\u0a78\u0005g"+
		"\u0000\u0000\u0a78\u0a7a\u0003\u01bc\u00de\u0000\u0a79\u0a76\u0001\u0000"+
		"\u0000\u0000\u0a7a\u0a7d\u0001\u0000\u0000\u0000\u0a7b\u0a79\u0001\u0000"+
		"\u0000\u0000\u0a7b\u0a7c\u0001\u0000\u0000\u0000\u0a7c\u01bb\u0001\u0000"+
		"\u0000\u0000\u0a7d\u0a7b\u0001\u0000\u0000\u0000\u0a7e\u0a7f\u0006\u00de"+
		"\uffff\uffff\u0000\u0a7f\u0a80\u0003\u01be\u00df\u0000\u0a80\u0a86\u0001"+
		"\u0000\u0000\u0000\u0a81\u0a82\n\u0001\u0000\u0000\u0a82\u0a83\u0005e"+
		"\u0000\u0000\u0a83\u0a85\u0003\u01be\u00df\u0000\u0a84\u0a81\u0001\u0000"+
		"\u0000\u0000\u0a85\u0a88\u0001\u0000\u0000\u0000\u0a86\u0a84\u0001\u0000"+
		"\u0000\u0000\u0a86\u0a87\u0001\u0000\u0000\u0000\u0a87\u01bd\u0001\u0000"+
		"\u0000\u0000\u0a88\u0a86\u0001\u0000\u0000\u0000\u0a89\u0a8a\u0006\u00df"+
		"\uffff\uffff\u0000\u0a8a\u0a8b\u0003\u01c0\u00e0\u0000\u0a8b\u0a94\u0001"+
		"\u0000\u0000\u0000\u0a8c\u0a8d\n\u0002\u0000\u0000\u0a8d\u0a8e\u0005Y"+
		"\u0000\u0000\u0a8e\u0a93\u0003\u01c0\u00e0\u0000\u0a8f\u0a90\n\u0001\u0000"+
		"\u0000\u0a90\u0a91\u0005\\\u0000\u0000\u0a91\u0a93\u0003\u01c0\u00e0\u0000"+
		"\u0a92\u0a8c\u0001\u0000\u0000\u0000\u0a92\u0a8f\u0001\u0000\u0000\u0000"+
		"\u0a93\u0a96\u0001\u0000\u0000\u0000\u0a94\u0a92\u0001\u0000\u0000\u0000"+
		"\u0a94\u0a95\u0001\u0000\u0000\u0000\u0a95\u01bf\u0001\u0000\u0000\u0000"+
		"\u0a96\u0a94\u0001\u0000\u0000\u0000\u0a97\u0a98\u0006\u00e0\uffff\uffff"+
		"\u0000\u0a98\u0a99\u0003\u01c2\u00e1\u0000\u0a99\u0aab\u0001\u0000\u0000"+
		"\u0000\u0a9a\u0a9b\n\u0005\u0000\u0000\u0a9b\u0a9c\u0005T\u0000\u0000"+
		"\u0a9c\u0aaa\u0003\u01c2\u00e1\u0000\u0a9d\u0a9e\n\u0004\u0000\u0000\u0a9e"+
		"\u0a9f\u0005S\u0000\u0000\u0a9f\u0aaa\u0003\u01c2\u00e1\u0000\u0aa0\u0aa1"+
		"\n\u0003\u0000\u0000\u0aa1\u0aa2\u0005Z\u0000\u0000\u0aa2\u0aaa\u0003"+
		"\u01c2\u00e1\u0000\u0aa3\u0aa4\n\u0002\u0000\u0000\u0aa4\u0aa5\u0005["+
		"\u0000\u0000\u0aa5\u0aaa\u0003\u01c2\u00e1\u0000\u0aa6\u0aa7\n\u0001\u0000"+
		"\u0000\u0aa7\u0aa8\u0005\u001a\u0000\u0000\u0aa8\u0aaa\u0003\n\u0005\u0000"+
		"\u0aa9\u0a9a\u0001\u0000\u0000\u0000\u0aa9\u0a9d\u0001\u0000\u0000\u0000"+
		"\u0aa9\u0aa0\u0001\u0000\u0000\u0000\u0aa9\u0aa3\u0001\u0000\u0000\u0000"+
		"\u0aa9\u0aa6\u0001\u0000\u0000\u0000\u0aaa\u0aad\u0001\u0000\u0000\u0000"+
		"\u0aab\u0aa9\u0001\u0000\u0000\u0000\u0aab\u0aac\u0001\u0000\u0000\u0000"+
		"\u0aac\u01c1\u0001\u0000\u0000\u0000\u0aad\u0aab\u0001\u0000\u0000\u0000"+
		"\u0aae\u0aaf\u0006\u00e1\uffff\uffff\u0000\u0aaf\u0ab0\u0003\u01c4\u00e2"+
		"\u0000\u0ab0\u0ac0\u0001\u0000\u0000\u0000\u0ab1\u0ab2\n\u0003\u0000\u0000"+
		"\u0ab2\u0ab3\u0005T\u0000\u0000\u0ab3\u0ab4\u0005T\u0000\u0000\u0ab4\u0abf"+
		"\u0003\u01c4\u00e2\u0000\u0ab5\u0ab6\n\u0002\u0000\u0000\u0ab6\u0ab7\u0005"+
		"S\u0000\u0000\u0ab7\u0ab8\u0005S\u0000\u0000\u0ab8\u0abf\u0003\u01c4\u00e2"+
		"\u0000\u0ab9\u0aba\n\u0001\u0000\u0000\u0aba\u0abb\u0005S\u0000\u0000"+
		"\u0abb\u0abc\u0005S\u0000\u0000\u0abc\u0abd\u0005S\u0000\u0000\u0abd\u0abf"+
		"\u0003\u01c4\u00e2\u0000\u0abe\u0ab1\u0001\u0000\u0000\u0000\u0abe\u0ab5"+
		"\u0001\u0000\u0000\u0000\u0abe\u0ab9\u0001\u0000\u0000\u0000\u0abf\u0ac2"+
		"\u0001\u0000\u0000\u0000\u0ac0\u0abe\u0001\u0000\u0000\u0000\u0ac0\u0ac1"+
		"\u0001\u0000\u0000\u0000\u0ac1\u01c3\u0001\u0000\u0000\u0000\u0ac2\u0ac0"+
		"\u0001\u0000\u0000\u0000\u0ac3\u0ac4\u0006\u00e2\uffff\uffff\u0000\u0ac4"+
		"\u0ac5\u0003\u01c6\u00e3\u0000\u0ac5\u0ace\u0001\u0000\u0000\u0000\u0ac6"+
		"\u0ac7\n\u0002\u0000\u0000\u0ac7\u0ac8\u0005a\u0000\u0000\u0ac8\u0acd"+
		"\u0003\u01c6\u00e3\u0000\u0ac9\u0aca\n\u0001\u0000\u0000\u0aca\u0acb\u0005"+
		"b\u0000\u0000\u0acb\u0acd\u0003\u01c6\u00e3\u0000\u0acc\u0ac6\u0001\u0000"+
		"\u0000\u0000\u0acc\u0ac9\u0001\u0000\u0000\u0000\u0acd\u0ad0\u0001\u0000"+
		"\u0000\u0000\u0ace\u0acc\u0001\u0000\u0000\u0000\u0ace\u0acf\u0001\u0000"+
		"\u0000\u0000\u0acf\u01c5\u0001\u0000\u0000\u0000\u0ad0\u0ace\u0001\u0000"+
		"\u0000\u0000\u0ad1\u0ad2\u0006\u00e3\uffff\uffff\u0000\u0ad2\u0ad3\u0003"+
		"\u01c8\u00e4\u0000\u0ad3\u0adf\u0001\u0000\u0000\u0000\u0ad4\u0ad5\n\u0003"+
		"\u0000\u0000\u0ad5\u0ad6\u0005c\u0000\u0000\u0ad6\u0ade\u0003\u01c8\u00e4"+
		"\u0000\u0ad7\u0ad8\n\u0002\u0000\u0000\u0ad8\u0ad9\u0005d\u0000\u0000"+
		"\u0ad9\u0ade\u0003\u01c8\u00e4\u0000\u0ada\u0adb\n\u0001\u0000\u0000\u0adb"+
		"\u0adc\u0005h\u0000\u0000\u0adc\u0ade\u0003\u01c8\u00e4\u0000\u0add\u0ad4"+
		"\u0001\u0000\u0000\u0000\u0add\u0ad7\u0001\u0000\u0000\u0000\u0add\u0ada"+
		"\u0001\u0000\u0000\u0000\u0ade\u0ae1\u0001\u0000\u0000\u0000\u0adf\u0add"+
		"\u0001\u0000\u0000\u0000\u0adf\u0ae0\u0001\u0000\u0000\u0000\u0ae0\u01c7"+
		"\u0001\u0000\u0000\u0000\u0ae1\u0adf\u0001\u0000\u0000\u0000\u0ae2\u0aea"+
		"\u0003\u01ca\u00e5\u0000\u0ae3\u0aea\u0003\u01cc\u00e6\u0000\u0ae4\u0ae5"+
		"\u0005a\u0000\u0000\u0ae5\u0aea\u0003\u01c8\u00e4\u0000\u0ae6\u0ae7\u0005"+
		"b\u0000\u0000\u0ae7\u0aea\u0003\u01c8\u00e4\u0000\u0ae8\u0aea\u0003\u01ce"+
		"\u00e7\u0000\u0ae9\u0ae2\u0001\u0000\u0000\u0000\u0ae9\u0ae3\u0001\u0000"+
		"\u0000\u0000\u0ae9\u0ae4\u0001\u0000\u0000\u0000\u0ae9\u0ae6\u0001\u0000"+
		"\u0000\u0000\u0ae9\u0ae8\u0001\u0000\u0000\u0000\u0aea\u01c9\u0001\u0000"+
		"\u0000\u0000\u0aeb\u0aec\u0005_\u0000\u0000\u0aec\u0aed\u0003\u01c8\u00e4"+
		"\u0000\u0aed\u01cb\u0001\u0000\u0000\u0000\u0aee\u0aef\u0005`\u0000\u0000"+
		"\u0aef\u0af0\u0003\u01c8\u00e4\u0000\u0af0\u01cd\u0001\u0000\u0000\u0000"+
		"\u0af1\u0af8\u0003\u01d0\u00e8\u0000\u0af2\u0af3\u0005V\u0000\u0000\u0af3"+
		"\u0af8\u0003\u01c8\u00e4\u0000\u0af4\u0af5\u0005U\u0000\u0000\u0af5\u0af8"+
		"\u0003\u01c8\u00e4\u0000\u0af6\u0af8\u0003\u01da\u00ed\u0000\u0af7\u0af1"+
		"\u0001\u0000\u0000\u0000\u0af7\u0af2\u0001\u0000\u0000\u0000\u0af7\u0af4"+
		"\u0001\u0000\u0000\u0000\u0af7\u0af6\u0001\u0000\u0000\u0000\u0af8\u01cf"+
		"\u0001\u0000\u0000\u0000\u0af9\u0afc\u0003\u0162\u00b1\u0000\u0afa\u0afc"+
		"\u00038\u001c\u0000\u0afb\u0af9\u0001\u0000\u0000\u0000\u0afb\u0afa\u0001"+
		"\u0000\u0000\u0000\u0afc\u0b01\u0001\u0000\u0000\u0000\u0afd\u0b00\u0003"+
		"\u01d4\u00ea\u0000\u0afe\u0b00\u0003\u01d8\u00ec\u0000\u0aff\u0afd\u0001"+
		"\u0000\u0000\u0000\u0aff\u0afe\u0001\u0000\u0000\u0000\u0b00\u0b03\u0001"+
		"\u0000\u0000\u0000\u0b01\u0aff\u0001\u0000\u0000\u0000\u0b01\u0b02\u0001"+
		"\u0000\u0000\u0000\u0b02\u01d1\u0001\u0000\u0000\u0000\u0b03\u0b01\u0001"+
		"\u0000\u0000\u0000\u0b04\u0b05\u0003\u01d0\u00e8\u0000\u0b05\u0b06\u0005"+
		"_\u0000\u0000\u0b06\u01d3\u0001\u0000\u0000\u0000\u0b07\u0b08\u0005_\u0000"+
		"\u0000\u0b08\u01d5\u0001\u0000\u0000\u0000\u0b09\u0b0a\u0003\u01d0\u00e8"+
		"\u0000\u0b0a\u0b0b\u0005`\u0000\u0000\u0b0b\u01d7\u0001\u0000\u0000\u0000"+
		"\u0b0c\u0b0d\u0005`\u0000\u0000\u0b0d\u01d9\u0001\u0000\u0000\u0000\u0b0e"+
		"\u0b0f\u0005I\u0000\u0000\u0b0f\u0b10\u0003\u0002\u0001\u0000\u0b10\u0b11"+
		"\u0005J\u0000\u0000\u0b11\u0b12\u0003\u01c8\u00e4\u0000\u0b12\u0b2a\u0001"+
		"\u0000\u0000\u0000\u0b13\u0b14\u0005I\u0000\u0000\u0b14\u0b18\u0003\n"+
		"\u0005\u0000\u0b15\u0b17\u0003&\u0013\u0000\u0b16\u0b15\u0001\u0000\u0000"+
		"\u0000\u0b17\u0b1a\u0001\u0000\u0000\u0000\u0b18\u0b16\u0001\u0000\u0000"+
		"\u0000\u0b18\u0b19\u0001\u0000\u0000\u0000\u0b19\u0b1b\u0001\u0000\u0000"+
		"\u0000\u0b1a\u0b18\u0001\u0000\u0000\u0000\u0b1b\u0b1c\u0005J\u0000\u0000"+
		"\u0b1c\u0b1d\u0003\u01ce\u00e7\u0000\u0b1d\u0b2a\u0001\u0000\u0000\u0000"+
		"\u0b1e\u0b1f\u0005I\u0000\u0000\u0b1f\u0b23\u0003\n\u0005\u0000\u0b20"+
		"\u0b22\u0003&\u0013\u0000\u0b21\u0b20\u0001\u0000\u0000\u0000\u0b22\u0b25"+
		"\u0001\u0000\u0000\u0000\u0b23\u0b21\u0001\u0000\u0000\u0000\u0b23\u0b24"+
		"\u0001\u0000\u0000\u0000\u0b24\u0b26\u0001\u0000\u0000\u0000\u0b25\u0b23"+
		"\u0001\u0000\u0000\u0000\u0b26\u0b27\u0005J\u0000\u0000\u0b27\u0b28\u0003"+
		"\u01a2\u00d1\u0000\u0b28\u0b2a\u0001\u0000\u0000\u0000\u0b29\u0b0e\u0001"+
		"\u0000\u0000\u0000\u0b29\u0b13\u0001\u0000\u0000\u0000\u0b29\u0b1e\u0001"+
		"\u0000\u0000\u0000\u0b2a\u01db\u0001\u0000\u0000\u0000\u0142\u01e1\u01e8"+
		"\u01ec\u01f0\u01f9\u01fd\u0201\u0203\u0209\u020e\u0215\u021a\u021c\u0222"+
		"\u0227\u022c\u0231\u023c\u024a\u024f\u0257\u025e\u0264\u0269\u0274\u0277"+
		"\u0285\u028a\u028f\u0294\u029a\u02a4\u02ac\u02b6\u02be\u02ca\u02ce\u02d3"+
		"\u02d9\u02e1\u02ee\u030b\u030f\u0314\u031a\u031d\u0320\u032e\u0339\u0347"+
		"\u034e\u0357\u035e\u0363\u0375\u037c\u0382\u0386\u038a\u038e\u0392\u0397"+
		"\u039b\u039f\u03a1\u03a6\u03ad\u03b2\u03b4\u03ba\u03bf\u03c3\u03d6\u03db"+
		"\u03f0\u03f5\u03fb\u0401\u0403\u0407\u040c\u0410\u0418\u041f\u0427\u042a"+
		"\u042f\u0438\u043d\u0444\u044b\u0450\u0456\u0462\u0467\u046b\u0475\u047a"+
		"\u0482\u0485\u048a\u0492\u0495\u049a\u049f\u04a4\u04a9\u04b0\u04b5\u04bd"+
		"\u04c2\u04c7\u04cc\u04d2\u04d8\u04db\u04de\u04e7\u04ed\u04f3\u04f6\u04f9"+
		"\u0501\u0506\u050b\u0511\u0514\u0521\u052a\u0534\u0539\u0544\u0549\u0555"+
		"\u055a\u0566\u0570\u0575\u057d\u0580\u0587\u058f\u0595\u059e\u05a8\u05ac"+
		"\u05af\u05b8\u05c6\u05c9\u05d2\u05d7\u05de\u05e3\u05eb\u05f7\u05fe\u060c"+
		"\u0622\u0644\u0650\u0656\u0662\u066f\u0689\u068d\u0692\u0696\u069a\u06a2"+
		"\u06a6\u06aa\u06b1\u06ba\u06c2\u06d1\u06dd\u06e3\u06e9\u06fe\u0703\u0709"+
		"\u0715\u0720\u072a\u072d\u0732\u073b\u0741\u074b\u0750\u0759\u0770\u077a"+
		"\u0790\u0797\u079f\u07a7\u07b2\u07c9\u07d3\u07de\u07f4\u07f8\u07fd\u0805"+
		"\u080b\u080f\u0813\u0817\u081d\u0822\u0827\u082b\u082f\u0835\u083a\u083f"+
		"\u0843\u0847\u0849\u084e\u0853\u0858\u085c\u0860\u0864\u0869\u0871\u0877"+
		"\u087b\u087f\u0883\u0889\u088e\u0893\u0897\u089b\u089d\u08a2\u08b1\u08bf"+
		"\u08cb\u08d4\u08e2\u08ef\u08f8\u08fe\u0905\u090a\u0911\u0916\u091d\u0922"+
		"\u0929\u092e\u0936\u093b\u093f\u0943\u0948\u094f\u0956\u095b\u0962\u0967"+
		"\u096e\u0973\u097b\u0980\u0984\u098b\u0991\u0998\u099f\u09a6\u09ae\u09b5"+
		"\u09bd\u09c1\u09c8\u09cf\u09d6\u09de\u09e5\u09ed\u09f3\u09f9\u0a05\u0a0b"+
		"\u0a11\u0a1c\u0a25\u0a2c\u0a33\u0a38\u0a3c\u0a45\u0a50\u0a5a\u0a65\u0a70"+
		"\u0a7b\u0a86\u0a92\u0a94\u0aa9\u0aab\u0abe\u0ac0\u0acc\u0ace\u0add\u0adf"+
		"\u0ae9\u0af7\u0afb\u0aff\u0b01\u0b18\u0b23\u0b29";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
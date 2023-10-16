// Generated from org/simol/compiler/SimolJava8Parser.g4 by ANTLR 4.13.1
package org.simol.compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimolJava8Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimolJava8ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SimolJava8Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(SimolJava8Parser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(SimolJava8Parser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(SimolJava8Parser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(SimolJava8Parser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(SimolJava8Parser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(SimolJava8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(SimolJava8Parser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(SimolJava8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(SimolJava8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(SimolJava8Parser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(SimolJava8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(SimolJava8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(SimolJava8Parser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(SimolJava8Parser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(SimolJava8Parser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(SimolJava8Parser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(SimolJava8Parser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(SimolJava8Parser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(SimolJava8Parser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(SimolJava8Parser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(SimolJava8Parser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(SimolJava8Parser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(SimolJava8Parser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(SimolJava8Parser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(SimolJava8Parser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(SimolJava8Parser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(SimolJava8Parser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(SimolJava8Parser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(SimolJava8Parser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(SimolJava8Parser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(SimolJava8Parser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(SimolJava8Parser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(SimolJava8Parser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(SimolJava8Parser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(SimolJava8Parser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(SimolJava8Parser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(SimolJava8Parser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(SimolJava8Parser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(SimolJava8Parser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(SimolJava8Parser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(SimolJava8Parser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#simolRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimolRole(SimolJava8Parser.SimolRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(SimolJava8Parser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(SimolJava8Parser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(SimolJava8Parser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(SimolJava8Parser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(SimolJava8Parser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(SimolJava8Parser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(SimolJava8Parser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(SimolJava8Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(SimolJava8Parser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(SimolJava8Parser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(SimolJava8Parser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(SimolJava8Parser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(SimolJava8Parser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(SimolJava8Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(SimolJava8Parser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(SimolJava8Parser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(SimolJava8Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(SimolJava8Parser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(SimolJava8Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(SimolJava8Parser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(SimolJava8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(SimolJava8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(SimolJava8Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(SimolJava8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(SimolJava8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(SimolJava8Parser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(SimolJava8Parser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(SimolJava8Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(SimolJava8Parser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(SimolJava8Parser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(SimolJava8Parser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(SimolJava8Parser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(SimolJava8Parser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(SimolJava8Parser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(SimolJava8Parser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(SimolJava8Parser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(SimolJava8Parser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(SimolJava8Parser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(SimolJava8Parser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(SimolJava8Parser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(SimolJava8Parser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(SimolJava8Parser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(SimolJava8Parser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(SimolJava8Parser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(SimolJava8Parser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(SimolJava8Parser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(SimolJava8Parser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(SimolJava8Parser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(SimolJava8Parser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(SimolJava8Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(SimolJava8Parser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(SimolJava8Parser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(SimolJava8Parser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(SimolJava8Parser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(SimolJava8Parser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(SimolJava8Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(SimolJava8Parser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(SimolJava8Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#simolInterfaceRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimolInterfaceRole(SimolJava8Parser.SimolInterfaceRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(SimolJava8Parser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(SimolJava8Parser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(SimolJava8Parser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(SimolJava8Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(SimolJava8Parser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(SimolJava8Parser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(SimolJava8Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(SimolJava8Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(SimolJava8Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(SimolJava8Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(SimolJava8Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(SimolJava8Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(SimolJava8Parser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(SimolJava8Parser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(SimolJava8Parser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(SimolJava8Parser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(SimolJava8Parser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(SimolJava8Parser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(SimolJava8Parser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(SimolJava8Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(SimolJava8Parser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(SimolJava8Parser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(SimolJava8Parser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(SimolJava8Parser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(SimolJava8Parser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimolJava8Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(SimolJava8Parser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(SimolJava8Parser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(SimolJava8Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(SimolJava8Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimolJava8Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(SimolJava8Parser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(SimolJava8Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#emptyStatement_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement_(SimolJava8Parser.EmptyStatement_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(SimolJava8Parser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(SimolJava8Parser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SimolJava8Parser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(SimolJava8Parser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(SimolJava8Parser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(SimolJava8Parser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(SimolJava8Parser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(SimolJava8Parser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(SimolJava8Parser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(SimolJava8Parser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(SimolJava8Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(SimolJava8Parser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(SimolJava8Parser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(SimolJava8Parser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SimolJava8Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(SimolJava8Parser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(SimolJava8Parser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SimolJava8Parser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(SimolJava8Parser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(SimolJava8Parser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(SimolJava8Parser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(SimolJava8Parser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(SimolJava8Parser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(SimolJava8Parser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(SimolJava8Parser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(SimolJava8Parser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(SimolJava8Parser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(SimolJava8Parser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SimolJava8Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(SimolJava8Parser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(SimolJava8Parser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(SimolJava8Parser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(SimolJava8Parser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(SimolJava8Parser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(SimolJava8Parser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(SimolJava8Parser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(SimolJava8Parser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(SimolJava8Parser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(SimolJava8Parser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(SimolJava8Parser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(SimolJava8Parser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(SimolJava8Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(SimolJava8Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(SimolJava8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(SimolJava8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(SimolJava8Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(SimolJava8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(SimolJava8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(SimolJava8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(SimolJava8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(SimolJava8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(SimolJava8Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(SimolJava8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(SimolJava8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(SimolJava8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(SimolJava8Parser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(SimolJava8Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(SimolJava8Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(SimolJava8Parser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(SimolJava8Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(SimolJava8Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(SimolJava8Parser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(SimolJava8Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(SimolJava8Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(SimolJava8Parser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(SimolJava8Parser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(SimolJava8Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(SimolJava8Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(SimolJava8Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(SimolJava8Parser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(SimolJava8Parser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(SimolJava8Parser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimolJava8Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(SimolJava8Parser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(SimolJava8Parser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(SimolJava8Parser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(SimolJava8Parser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(SimolJava8Parser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimolJava8Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(SimolJava8Parser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(SimolJava8Parser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(SimolJava8Parser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(SimolJava8Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(SimolJava8Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(SimolJava8Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(SimolJava8Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(SimolJava8Parser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(SimolJava8Parser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(SimolJava8Parser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(SimolJava8Parser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(SimolJava8Parser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(SimolJava8Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(SimolJava8Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(SimolJava8Parser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(SimolJava8Parser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(SimolJava8Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(SimolJava8Parser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(SimolJava8Parser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(SimolJava8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(SimolJava8Parser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(SimolJava8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimolJava8Parser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(SimolJava8Parser.CastExpressionContext ctx);
}
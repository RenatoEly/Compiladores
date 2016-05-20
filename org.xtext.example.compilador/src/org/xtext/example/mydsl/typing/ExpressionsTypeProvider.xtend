package org.xtext.example.mydsl.typing

import org.xtext.example.mydsl.myDsl.simple_expression;



import org.xtext.example.mydsl.myDsl.*;

class ExpressionsTypeProvider {
	public static val stringType = new StringType
	public static val intType = new IntType
	public static val boolType = new BoolType
	public static val floatType = new FloatType
	
	def dispatch ExpressionsType typeFor(simple_expression e) {
		switch (e) {
			stringType: stringType
			intType: intType
			booleanType: boolType
			floatType: floatType
			REL: boolType
			EQL: boolType
			LOG_AND: boolType
			AND: boolType
			EXC_OR: boolType
			INC_OR: boolType
			LOG_OR: boolType
		}
	}
	
	def dispatch ExpressionsType typeFor(type_specifier e) {
		switch (e) {
			stringType: stringType
			intType: intType
			booleanType: boolType
			floatType: floatType
		}
	}
	
	def dispatch ExpressionsType typeFor(ADD e) {
		val leftType = e.left.typeFor
		val rightType = e.right?.typeFor
		if (leftType == boolType || rightType == boolType)
			boolType
		else
			if (leftType == stringType || rightType == stringType)
			stringType
			else
				if(leftType == floatType || rightType == floatType)
				floatType
				else
				intType
	}
	
	def dispatch ExpressionsType typeFor(MUL e) {
		val leftType = e.left.typeFor
		val rightType = e.right?.typeFor
		if (leftType == boolType || rightType == boolType)
			boolType
		else
			if (leftType == stringType || rightType == stringType)
			null
			else
				if(leftType == floatType || rightType == floatType)
				floatType
				else
				intType
	}
	
	def dispatch ExpressionsType typeFor(MINUS e) {
		val leftType = e.left.typeFor
		val rightType = e.right?.typeFor
		if (leftType == boolType || rightType == boolType)
			boolType
		else
			if (leftType == stringType || rightType == stringType)
			null
			else
				if(leftType == floatType || rightType == floatType)
				floatType
				else
				intType
	}
	
	def dispatch ExpressionsType typeFor(init_declarator variable) {
		variable?.initializer?.typeFor
	}
	
	def isInt(ExpressionsType type) { type == intType }
	def isString(ExpressionsType type) { type == stringType }
	def isBoolean(ExpressionsType type) { type == boolType }
	
}
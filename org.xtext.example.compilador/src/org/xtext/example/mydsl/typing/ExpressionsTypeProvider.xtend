package org.xtext.example.mydsl.typing

import org.xtext.example.mydsl.myDsl.simple_expression;



import org.xtext.example.mydsl.myDsl.stringType;
import org.xtext.example.mydsl.myDsl.intType;
import org.xtext.example.mydsl.myDsl.booleanType;
import org.xtext.example.mydsl.myDsl.ADD;
import org.xtext.example.mydsl.myDsl.init_declarator;

class ExpressionsTypeProvider {
	public static val stringType = new StringType
	public static val intType = new IntType
	public static val boolType = new BoolType
	
	def dispatch ExpressionsType typeFor(simple_expression e) {
		switch (e) {
			stringType: stringType
			intType: intType
			booleanType: boolType
			
		}
	}
	
	def dispatch ExpressionsType typeFor(ADD e) {
		val leftType = e.left.typeFor
		val rightType = e.right?.typeFor
		if (leftType == boolType || rightType == boolType)
			boolType
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
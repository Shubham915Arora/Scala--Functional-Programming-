package lectures.part1basics

object Expressions extends App {
  val x=1+2 //Expressions
  println(x)

  println(2+3*4)
  // Mathematical Expressions : + - * / & | ^ <<   >>    >>>>(right shift with zero extension)

  println(1==x)
  //Relational Expressions : == != > >= < <=

  var aVariable = 2
  aVariable +=3 //also works with -= *=  /= ......side effects
  println(aVariable)

  //Instructions (Do) vs Expressions (VALUE)
  //Instructions are Executed whereas expressions are evaluated .
  //Functional Programming focuses on Expressions so we try to use expressions as much as we can .

  // If Expression
  val aCondition = true
  val aConditionedValue =if(aCondition) 5 else 3  // IF Expression , Expression because it returns some value .
  println(aConditionedValue)


/******************************************----LOOPS------***********************************************************/
  //LOOPS : loops are specifically related to imperative programming like java , python or C
  //Scala discourages the use loops . As they increase side effects . As well as Scala forces us to make
  // evry line of code to be an expressions .
  //Still we should know how to write loops in scala... so for that we have given an exaple of a while loop down here .

  var i =0
  while(i<10){
    println(i)
    i+=1
  }
/********************************************************************************************************************/


/*************************************-------UNITS-----------********************************************************/
  //Unit in scala is equivalent to void in other languages .
  //EG.
  val aWeirdValue=(aVariable = 3)
  println(aWeirdValue)

  // examples of side effects : println(), while loops , reassigning
/*********************************************************************************************************************/





/******************************************--------Code Block---------**************************************************/

// A piece of code written in curly braces is known as a code block in scala . A code is consider to be an Expression in scala

  val aCodeBlock ={
    val y =2
    val z= y+1

  (if (z>2) "hello" else "goodbye"

  // The value of the block is the value of its last expression . In our case it is the value of the last if statment .

  }
  //Anything defined inside a code block is visible only in that specific code block . It is like the Scope in other languages .






/**********************************************************************************************************************/
}

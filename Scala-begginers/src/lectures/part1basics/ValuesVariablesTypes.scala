package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int =42
  println(x)

  //Vals are Immutable

  //Compiler can Infer Types

  val aString : String ="Hello Scala .";

  //Semicolons are allowed in scala  but they are not cumpolsary .They are mandatory to use when we are using mutliple
  //expresions in the same line . Which is a bad practice .

  println(aString)

  val aBoolean : Boolean = true
  val aChar : Char = 'a'
  val aInt : Int = x
  val aLong : Long = 876543276532L // You need to mention 'L' in the end for the Long in scala just like java
  val aShort : Short =12345
  val aFloat : Float = 2.4f // For float you need to mention the 'f' in the end other wise the compiler takes it as double
  val aDouble :  Double =3.14

  //Variables : They are mutable or we can say they can be reassigned .

  var aVariable : Int = 4
  aVariable =5 //Side effects



}

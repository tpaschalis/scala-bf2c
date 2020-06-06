import java.io.{BufferedWriter, File, FileWriter}

import scala.io.Source

object BF2C extends App {

  // Define i/o filenames, constants
  val inputFilename: String = "input.bf"
  val outputFilename: String = "output.c"

  val Prologue: String = """#include <stdio.h>
  |int main() {
  |#define TAPE_SIZE 30000
  |char array[TAPE_SIZE] = {0};
  |char *ptr=array;
  """.stripMargin

  val Epilogue: String = """return 0;
  |}""".stripMargin


  // Read input into val contents
  val input = Source.fromFile(inputFilename)
  val contents = input.mkString.trim()


  // Initialize the string builder and interpret the BF code
  val builder = new StringBuilder("");
  builder ++= Prologue

  builder ++= contents flatMap {
    case '>' => "++ptr;";
    case '<' => "--ptr;";
    case '+' => "++*ptr;";
    case '-' => "--*ptr;";
    case '.' => "putchar(*ptr);";
    case ',' => "*ptr->getchar();";
    case '[' => "while (*ptr) {";
    case ']' => "}";
  }

  builder ++= Epilogue

  // Write to output file and close file handlers
  val output = new File(outputFilename)
  val bw = new BufferedWriter(new FileWriter(output))
  bw.write(builder.toString())

  bw.close()
  input.close()


  // Notes
  // The following doesn't seem to be working correctly, as it's performing sub-substitutions, but only sometimes
  // println(brainfuckToC.foldLeft(str)((a, b) => a.replace(b._1, b._2)))
  //
  // How can we achieve the same pattern matching by using a Map?
  //   val brainfuckToC: Map[String,String] = Map(
  //    ">" -> "++ptr;",
  //    "<" -> "--ptr;",
  //    "+" -> "++*ptr;",
  //    "-" -> "--*ptr;",
  //    "." -> "putchar(*ptr);",
  //    "," -> "*ptr->getchar();",
  //    "[" -> "while (*ptr) {",
  //    "]" -> "}",
  //  )

}

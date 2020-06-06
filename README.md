# scala-bf2c

This is a simple Scala application to interpret Brainfuck code into C.

It was written as a IntelliJ Idea + SBT project.

The input is read from an `input.bf` file and written into an `output.c` file.

Just write your brainfuck code into the input file, run the `main/BF2C.scala` class and compile the output.c.


## Example
Here's a simple example, where I'm using a Brainfuck program to output "Hello World!" on the command line.

```bash
$ echo "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++." > input.bf

# Run main/BF2C.scala class

$ gcc output.c -o bfrun

$ ./bfrun
Hello World!

# scala-bf2c

This is a simple Scala application to interpret Brainfuck code into C. All logic lives in [this](https://github.com/tpaschalis/scala-bf2c/blob/master/src/main/scala/BF2C.scala) file. It shamelessly copies from [here](https://gist.github.com/maxcountryman/1699708) and [here](https://starius.ru/2015/05/16/brainfuck-to-c-in-lua/).

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
```

## TODO
- Handle erroneous symbols
- Figure out how unit-testing works in Scala
- Figure out how I could dockerize this thing
- Support running from the command line and reading/writing to stdin/stdout

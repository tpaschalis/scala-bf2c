#include <stdio.h>
int main() {
#define TAPE_SIZE 30000
char array[TAPE_SIZE] = {0};
char *ptr=array;
  ++*ptr;++*ptr;++*ptr;++*ptr;++*ptr;++*ptr;++*ptr;++*ptr;while (*ptr) {++ptr;++*ptr;++*ptr;++*ptr;++*ptr;while (*ptr) {++ptr;++*ptr;++*ptr;++ptr;++*ptr;++*ptr;++*ptr;++ptr;++*ptr;++*ptr;++*ptr;++ptr;++*ptr;--ptr;--ptr;--ptr;--ptr;--*ptr;}++ptr;++*ptr;++ptr;++*ptr;++ptr;--*ptr;++ptr;++ptr;++*ptr;while (*ptr) {--ptr;}--ptr;--*ptr;}++ptr;++ptr;putchar(*ptr);++ptr;--*ptr;--*ptr;--*ptr;putchar(*ptr);++*ptr;++*ptr;++*ptr;++*ptr;++*ptr;++*ptr;++*ptr;putchar(*ptr);putchar(*ptr);++*ptr;++*ptr;++*ptr;putchar(*ptr);++ptr;++ptr;putchar(*ptr);--ptr;--*ptr;putchar(*ptr);--ptr;putchar(*ptr);++*ptr;++*ptr;++*ptr;putchar(*ptr);--*ptr;--*ptr;--*ptr;--*ptr;--*ptr;--*ptr;putchar(*ptr);--*ptr;--*ptr;--*ptr;--*ptr;--*ptr;--*ptr;--*ptr;--*ptr;putchar(*ptr);++ptr;++ptr;++*ptr;putchar(*ptr);++ptr;++*ptr;++*ptr;putchar(*ptr);return 0;
}
/*continuing After ThrowVsThrows3*/

/*what are resources?
the program itself is stored in ram in the code section, its variables are stored in stack
during the runtime of the program, anything that is outside the code section and the stack
is an external resource that a program might use
Heap is an external resource,printers,network connections, databases, files, keyboard...etc
when a program deals with an external resource it has 2 main steps
1)when need ask for the resource and acquire it
2)when finished release the resource so others can use it and to free memory

remember that any java object is created and allocated in heap, and we have a reference to this
object allocated in the stack
for the heap when we want to create an object we say new, this creates an object in heap, when
we finish using that object we must deallocate it, if we forgot java will deallocate it
automatically
but for other resources like files,databases , the developer must release them properly as
java would not do that step

rule:want to use a resource then acquire it, finished using then release it for others

sometimes we use finally block in the releasing resource process
let's say we opened a file and no exception happens, the releasing of the file is done in the
finally block as it will always get executed
let's say we opened a file and during the process an exception raised
finally block will be processed before the exception is handled or the program is crashed
and it will close the file releasing it
get back here when u learn about files and IO stream
* */

public class TryWithResources {
}

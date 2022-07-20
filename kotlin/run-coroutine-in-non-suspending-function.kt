/**
 * Run coroutines in non-suspending functions
 *
 * @author Stephan Koglin-Fischer
 * @since 2022-07-15
 */
val myScope = CoroutineScope(Dispatchers.Default) 

myScope.launch {
   // This will wait till the execution of the background work has finished
   withContext(Dispatchers.IO) {
        //to stuff in the background
    }

}

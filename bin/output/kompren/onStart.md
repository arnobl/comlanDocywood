### <a name="Defining-a-pre-execution-code-block"></a>Defining a pre-execution code block

```
slicer aStrictSlicer {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	onStart [[ ]]
 
 }
```
It defines a block of Kermeta 3 statements that are executed before the slicing process. Then, give the value, here: `[[ ]]
 `.


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)

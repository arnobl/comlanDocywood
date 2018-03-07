### <a name="Defining-a-post-execution-code-block"></a>Defining a post-execution code block

```
slicer aStrictSlicer {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	onEnd [[ ]]
 
 }
```
It defines a block of Kermeta 3 statements that are executed after the slicing process. Then, give the value, here: `[[ ]]
 `.


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)

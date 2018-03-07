### <a name="Defining-a-helper"></a>Defining a helper

```
slicer aStrictSlicer {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	helper [[ ]]
 
 }
```
It defines a block of statements (written in Kermeta3), such as variables, operations, that can be used in other blocks (e.g. onStart). Then, give the value, here: `[[ ]]
 `.


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)

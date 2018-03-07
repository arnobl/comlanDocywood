### <a name="Defining-An-expression"></a>Defining An expression

```
slicer aStrictSlicer {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : ex1.A [[ ]]
 
 }
```
It defines the Xtend code executed when an instance of this element is sliced. It does not work with strict slicer. An expression must be defined. It defines the Xtend code executed when an instance of this element is sliced. It does not work with strict slicer. The expected format is a block of Xtend code (between `[[` `]]`). In our example, type: `[[ ]]
 `.


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)<br/>
[Defining a SlicedClass](Defining-a-SlicedClass)

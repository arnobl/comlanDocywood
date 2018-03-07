### <a name="Defining-a-strict-slicer"></a>Defining a strict slicer

```
slicer strict aStrictSlicer {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 }
```
It defines a slicer as a strict slicer. A strict slicer produces as output a model that is always conformed to its input metamodel. This means that some classes, relations, attributes may be sliced while not selected by the user. Type `strict`. 


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)

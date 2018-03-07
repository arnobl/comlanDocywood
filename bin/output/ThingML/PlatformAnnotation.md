### <a name="Defining-a-PlatformAnnotation"></a>Defining a PlatformAnnotation

```
datatype Byte < 1 > @ type_checker "Integer" ;
```
Additional information passed to the compiler. (@key "value). Type `@`. 

The name of the annotation must be defined. The expected format is an identifier. In our example, type: `type_checker `.


`value` must be defined. The expected format is a string literal (between double quotes). In our example, type: `"Integer" `.


See also:<br/>
[Defining a ThingMLModel](Defining-a-ThingMLModel)<br/>
[Defining a PrimitiveType](Defining-a-PrimitiveType)

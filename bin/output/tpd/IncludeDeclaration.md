### <a name="Defining-a-IncludeDeclaration"></a>Defining a IncludeDeclaration

```
target "Sample Target Platform" include "base.tpd" 
```
To include other target platform files if you decided to split your target platform definition into several files. This will still lead to the generation of a single .target file. `importURI` must be defined. The expected format is a string that can be surrounded by either simple quotes ' or double quotes ".
Type `include`. 

Then, give the value, here: `"base.tpd" `.


See also:<br/>
[Defining a TargetPlatform](Defining-a-TargetPlatform)

### <a name="Defining-targetplatform.IU.version"></a>Defining targetplatform.IU.version

```
target "Sample Target Platform" location kepler "http://download.eclipse.org/releases/kepler" {
 		; version = "[3.8.100,3.8.101)" 

 }

```
If no version is specified, the most recent IUs will be selected in the repository. You can restrain the range of version to use by using the same syntax as in MANIFEST.MF files. Then, the most recent version of the given IU within this range will be selected. Then, give the value, here: `"[3.8.100,3.8.101)" `.


See also:<br/>
[Defining a TargetPlatform](Defining-a-TargetPlatform)<br/>
[Defining a Location](Defining-a-Location)<br/>
[Defining a IU](Defining-a-IU)

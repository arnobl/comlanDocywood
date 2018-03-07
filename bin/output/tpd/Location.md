### <a name="Defining-a-Location"></a>Defining a Location

```
target "Sample Target Platform" location kepler "http://download.eclipse.org/releases/kepler" ```
The location of your p2 repositories. You can add as many locations as your want to your target. Location string must be URL, if your p2 repository is local, don’t forget to put a file:/ URL. Type `location`. 

The ID must be defined. A location may have an ID. This is useful if you want to apply some maven stuff (providing a password, a mirror…) for this repository. The expected format is a character sequence starting with an alpha (no space allowed). In our example, type: `kepler `.

`uri` must be defined. The expected format is a string that can be surrounded by either simple quotes ' or double quotes ". In our example, type: `"http://download.eclipse.org/releases/kepler" `.


See also:<br/>
[Defining a TargetPlatform](Defining-a-TargetPlatform)

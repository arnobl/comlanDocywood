# Documentation

[Defining a TargetPlatform](#Defining-a-TargetPlatform)<br/>
[Defining a Location](#Defining-a-Location)<br/>
[Defining a IncludeDeclaration](#Defining-a-IncludeDeclaration)<br/>
[Defining an Environment](#Defining-a-Environment)<br/>
[Defining a Options](#Defining-a-Options)<br/>


### <a name="Defining-a-TargetPlatform"></a>Defining a TargetPlatform

```
target "Sample Target Platform" 
```
Via a target platform you define which set of plug-ins and what version of Eclipse you develop against. 
The name of the target platform must be defined. 
The expected format is a string that can be surrounded by either simple quotes ' or double quotes ".
Type `target`. 

Then, give the value, here: `"Sample Target Platform" `.



### <a name="Defining-a-Location"></a>Defining a Location

```
target "Sample Target Platform" 
location kepler "http://download.eclipse.org/releases/kepler" { 
 org.eclipse.pde [3.8.100,3.8.101) 
}
```
The location of your p2 repositories. You can add as many locations as your want to your target. Location string must be URL, if your p2 repository is local, don’t forget to put a file:/ URL. Type `location`. 

An identifier can be defined (a character sequence starting with an alpha (no space allowed)). This is useful if you want to apply some maven stuff (providing a password, a mirror…) for this repository. The expected format is ID. In our example, type: `kepler `.
Type `{`. 

The URI of the location must be defined. The expected format is a string that can be surrounded by either simple quotes ' or double quotes ". In our example, type: `"http://download.eclipse.org/releases/kepler" `.


The Installable Units (IUs) your want to include in your target. This can be bundles or Eclipse features (it may end with feature.group).<br/>
An identifier can be defined. 
In our example, type: `org.eclipse.pde `.


The version to use can be defined. 
If no version is specified, the most recent IUs will be selected in the repository. 
You can restrain the range of version to use by using the same syntax as in MANIFEST.MF files. 
Then, the most recent version of the given IU within this range will be selected.  
Give the value, here: `[3.8.100,3.8.101)`.

Type `}`. 

See also:<br/>
[Defining a TargetPlatform](#Defining-a-TargetPlatform)


### <a name="Defining-a-IncludeDeclaration"></a>Defining a IncludeDeclaration

```
target "Sample Target Platform" 
include "base.tpd" 
```
To include other target platform files if you decided to split your target platform definition into several files. This will still lead to the generation of a single .target file. `importURI` must be defined. The expected format is a string that can be surrounded by either simple quotes ' or double quotes ".<br/>
Type `include`.<br/>
Then, give the value, here: `"base.tpd" `.


See also:<br/>
[Defining a TargetPlatform](#Defining-a-TargetPlatform)


### <a name="Defining-a-Environment"></a>Defining an Environment

```
target "Sample Target Platform" 
environment linux gtk 
```
Defines the environment of your target platform. `env` must be defined. The expected format is a character sequence starting with an alpha (no space allowed).<br/>
Type `environment`.<br/>
Then, give the value, here: `linux `, followed by possible other values: `, gtk`


See also:<br/>
[Defining a TargetPlatform](#Defining-a-TargetPlatform)


### <a name="Defining-a-Options"></a>Defining a Options

```
target "Sample Target Platform" 
with source requirements
```
Some options about what should be retrieved from the p2 repository. 
Describes how the set of elements to add to this target is determined.
The expected format is `requirements`, whether this target must have all required IUs of the selected IUs available and included in the target to resolve successfully. 
If this option is true, the planner will be used to resolve otherwise the slicer is used. 
The planner can describe any missing requirements as errors.<br/>
`allEnvironments`, whether this target should download and include environment (platform) specific units for all available platforms (vs. only the current target definition’s environment settings). Only supported by the slicer so requirements must not be used for this setting to be used.<br/>
`source`, whether this location should download and include source bundles for the selected units if the associated source is available in the repository.<br/>
`configurePhase`, whether this target should execute the configure phase after fetching the selected units.<br/>
Type `with`. 

Then, give the value, here: `source `. Other values can be added: ` requirements`.


See also:<br/>
[Defining a TargetPlatform](#Defining-a-TargetPlatform)

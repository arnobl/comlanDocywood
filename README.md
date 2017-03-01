
The Kompren tutorials are available on the [official web page of the Kompren DSL](https://github.com/arnobl/kompren).

The `robot` folder contains the metamodel, the grammar and the input model used as the illustrative example. The generated tutorials are provided as follows:


### <a name="Defining-a-ProgramUnit"></a>Defining a ProgramUnit

```
begin
 end
```
A ProgramUnit contains the commands for controlling a robot. It is the main class of the language. Type `begin`. 

Type `end`. 



### <a name="Defining-a-Move"></a>Defining a Move

```
begin
 	move ( 25 )
 end

```
It defines a command for moving forward the robot. The distance must be defined. The robot moves foward for a given distance in centimeter. The expected format is a double value. In our example, type: `25 `.
Type `move (`. 

Then, give the value, here: `25 `


Type `)`. 

See also:<br/>
[Defining a ProgramUnit](Defining-a-ProgramUnit)



### <a name="Defining-a-Turn"></a>Defining a Turn

```
begin
 	turn ( -100 )
 end

```
It defines a command for rotating the robot. The rotation angle must be defined. The robot rotates following a given rotation angle in degree. The expected format is a double value. In our example, type: `-100 `.
Type `turn (`. 

Then, give the value, here: `-100 `


Type `)`. 

See also:<br/>
[Defining a ProgramUnit](Defining-a-ProgramUnit)


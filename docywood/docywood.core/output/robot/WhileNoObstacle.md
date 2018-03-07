### <a name="Defining-a-WhileNoObstacle"></a>Defining a WhileNoObstacle

```
begin
 	whileNoObstacleAt ( 10 ) {
 }

 end

```
This command is a special loop. The contained commands are executed while no obstacle is present in front of the robot. `distance` must be defined. It defines the detection distance that the robot will use to stop the loop. The expected format is a double value.
Type `whileNoObstacleAt (`. 

Then, give the value, here: `10 `.


Type `)`. 

Type `{`. 

Type `}`. 

See also:<br/>
[Defining a ProgramUnit](Defining-a-ProgramUnit)

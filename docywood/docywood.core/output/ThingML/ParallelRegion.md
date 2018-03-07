### <a name="Defining-a-ParallelRegion"></a>Defining a ParallelRegion

```
					thing TestSession5 {
 composite state Chart init AnId {
 region R init AnId {
 }
 }
 }

```
State machines and composite states can contain one or more parallel regions. Each region executes independently from each other: they have their own initial, history and current state. By default a state machine and composite states define one region. Additional regions can be added. Type `region`. 

The name of the parallel region must be defined. The expected format is an identifier. In our example, type: `R `.


Type `init`. 

`initial` must be defined. The expected format is an identifier. In our example, type: `AnId `.


Type `{`. 

Type `}`. 

See also:<br/>
[Defining a ThingMLModel](Defining-a-ThingMLModel)<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a CompositeState](Defining-a-CompositeState)

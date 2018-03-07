### <a name="Defining-a-ReceiveMessage"></a>Defining a Receive Message

```
thing fragment TestHistoryStatesWithStream {
 required port p {
   receives mArray
 }

 composite state C2 init s1 {
 state s1 {
   transition t1 -> s1
    event e : p?mArray
 }
}

```
Message reception event.
The name of the port must be defined.<br>
In our example, type: `p`.<br>
Type `?`.<br>
The name of the message must be defined<br>
In our example, type: `mArray`.<br>

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Composite State](Defining-a-CompositeState)<br/>
[Defining a Required Port](Defining-a-RequiredPort)<br/>
[Defining a Transition](Defining-a-Transition)<br/>
[Defining an Event Transition](Defining-a-event-Transition)<br/>
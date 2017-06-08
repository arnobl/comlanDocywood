### <a name="Defining-a-Thing"></a>Defining a Thing

```
thing fragment TestArrays4 {
}

```
The thing is a central concept in ThingML. It models a component that can be instanciated in a configuration. It may include a statemachine, ports, messages, properties, functions. It can be a whole thing or a fragment. A fragment is a thing that can not be instanciated but rather be included in another thing. Type `thing`. 

It can be a whole thing or a fragment. A fragment is a thing that can not be instanciated but rather be included in another thing.
You can type `fragment`. 


The name of the thing must be defined. The expected format is an identifier. In our example, type: `TestArrays4 `.
<br>
Type `{`. <br>
Type `}`. 

### <a name="Defining-a-includes-Thing"></a>Defining an includes Thing

```
thing fragment TestArrays4 {
}

thing TestArrays3 includes TestArrays4 {
}
```
Even though ThingML is not an OO language, and thus does not provide plain inheritance, it provides some basic mechanisms to improve the modularity/reusability of fragments of ThingML provides.
A thing fragment can been seen as an interface or abstract class. Typically it declares some messages, but could also define any feature we can find in plan things. 
<br>
Type `includes`.<br>
The name of the thing to include must be defined. The expected format is an identifier. 
In our example, type: `TestArrays4`.
<br>
Type `{`. <br>
Type `}`. 



### <a name="Defining-a-CompositeState"></a>Defining a Composite State

```
thing fragment TestArrays4 {
 composite state c init s1 keeps history{
    state s1{}
 }
}

```
Sub state machine contained in a state. Type `composite state`. 

The name of the state machine must be defined. The expected format is an identifier. In our example, type: `c`.
<br>
Type `init`. 
<br>
The initial state must be defined. The expected format is an identifier. In our example, type: `s1`.
<br>
History states enter their initial state the first time they are activated, save their current state when exited and reenter that state when activated again. 
Optionally, type `keeps history`. 
<br>
Type `{`. 
<br>
Type `state`.
The name of the state must be defined. The expected format is an identifier. In our example, type: `s1`.
<br> 
Type `{`. 
<br>
Type `}`. 
<br>Type `}`. 

See also:<br/>
[Defining a Thing](Defining-a-Thing)


### <a name="Defining-a-entry-CompositeState"></a>Defining an entry Composite State

```
thing fragment TestArrays4 {
 composite state c init s1 keeps history{
    state s1{
        on entry do
        end
    }
 }
}

```
All states (composite or not) can have entry actions executed when entering the state. 
<br>
Type `on entry`. 
<br>
The block of actions must be defined.
Type `do`. 
<br>
Type `end`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br>
[Defining a Composite State](Defining-a-CompositeState)


### <a name="Defining-a-exit-CompositeState"></a>Defining an exit Composite State

```
thing fragment TestArrays4 {
 composite state c init s1 keeps history{
    state s1{
        on exit do
        end
    }
 }
}

```
All states (composite or not) can have exit actions executed when leaving the state. 
<br>
Type `on exit`. 
<br>
The block of actions must be defined.
Type `do`. 
<br>
Type `end`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br>
[Defining a Composite State](Defining-a-CompositeState)


### <a name="Defining-a-FinalState"></a>Defining a Final State

```
thing fragment TestArrays4 {
 composite state c init s1 {
    final state s1{}
 }
}

```
State from which it can't be any outgoing transition.<br>
Type `final`. <br>
The state must be defined.<br>
Type `}`.<br>
Type `}`. 

See also:<br/>
[Defining a Thing](Defining-a-Thing)
[Defining a Composite State](Defining-a-CompositeState)


### <a name="Defining-a-ParallelRegion"></a>Defining a Parallel Region

```
thing fragment TestSession5 {
 composite state Chart init s1 {
  state s1{ }
  region R init s2 {
    state s2 { }
  }
 }
}

```
State machines and composite states can contain one or more parallel regions. Each region executes independently from each other: they have their own initial, history and current state.
By default a state machine and composite states define one region. Additional regions can be added.
Type `region`. 
<br>
The name of the region must be defined. The expected format is an identifier. In our example, type: `R`.
<br>
Type `init`. 
<br>
The initial state must be defined. The expected format is an identifier. In our example, type: `s2`.
<br>
Type `{`. 
<br>
Type `}`. 

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a CompositeState](Defining-a-CompositeState)


### <a name="Defining-a-Transition"></a>Defining a Transition

```
thing fragment TestHistoryStatesWithStream {
 composite state C2 init s1 {
 state s1 {
   transition t1 -> s1 
 }
}

```
Describes a transition from one state to another (can be the same). Can be triggered automatically or by a given event. 
Type `transition`.
The name of the transition must be defined. The expected format is an identifier. In our example, type: `t1`.
The targeted state of the transition must be defined. The expected format is an identifier.
Then, give the value, here: `s1`.


See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Composite State](Defining-a-CompositeState)


### <a name="Defining-a-Property"></a>Defining a Property

```
thing fragment A {
 readonly property c : 	String 
 }

```
Declare a variable for the whole instance of a thing. You can type `readonly`. 
<br>
Type `property`. 

The name of the property must be defined. The expected format is an identifier. In our example, type: `c `.
<br>
Type `:`. 
<br>
The type of the property must be defined. The expected format is an identifier.
Then, give the value, here: `String`.


See also:<br/>
[Defining a Thing](Defining-a-Thing)


### <a name="Defining-a-action-Transition"></a>Defining a guard Transition

```
thing fragment TestHistoryStatesWithStream {
 property c : char 

 composite state C2 init s1 {
 state s1 {
   transition t1 -> s1 
   action do
   end
 }
}

```
Optionally transitions can have actions.
Type `action`.
The action block must be defined.
Type: `do`.
Type: `end`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Composite State](Defining-a-CompositeState)<br/>
[Defining a Property](Defining-a-Property)


### <a name="Defining-a-RequiredPort"></a>Defining a Required Port

```
thing TestArrays4 {
 optional required port myPort {
 }
}
```
If possible thing that depends on other are instantiated after their dependancies. 
You can type `optional`. 


Type `required port`. 

The name of the port must be defined. The expected format is an identifier. In our example, type: `myPort`.
<br>
Type `{`. 
<br>
Type `}`. 

See also:<br/>
[Defining a Thing](Defining-a-Thing)

### <a name="Defining-a-ProvidedPort"></a>Defining a Provided Port

```
thing TestArrays4 {
 	provided port p1 {
 }
}
```
If possible thing that depends on other are instantiated after their dependancies. `name` must be defined. The expected format is an identifier.
Type `provided port`. 

Then, give the value, here: `p1 `.

Type `{`. 
<br>
Type `}`. 

See also:<br/>
[Defining a Thing](Defining-a-Thing)


### <a name="Defining-a-sends-RequiredPort"></a>Defining a sends Required Port

```
thing TestArrays4 {
 optional required port myPort {
  sends rep
 }
}
```
A thing can send a set of messages asynchronously. Messages are sent via ports.
Type `sends`. 
The message must be defined.
In our example, type: `rep`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Required Port](Defining-a-RequiredPort)


### <a name="Defining-a-receives-RequiredPort"></a>Defining a receives Required Port

```
thing TestArrays4 {
 optional required port myPort {
  receives op
 }
}
```
A thing can receive a set of messages asynchronously. Messages are received via ports.
Type `receives`. 
The message must be defined.
In our example, type: `op`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Required Port](Defining-a-RequiredPort)


### <a name="Defining-a-guard-Transition"></a>Defining a guard Transition

```
thing fragment TestHistoryStatesWithStream {
 property c : char 

 composite state C2 init s1 {
 state s1 {
   transition t1 -> s1 
   guard c == 'n'
 }
}

```
Optionally transitions can have a guard condition.
Type `guard`.
The expression must be defined.
In our example, type: `c == 'n'`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Composite State](Defining-a-CompositeState)<br/>
[Defining a Property](Defining-a-Property)


### <a name="Defining-a-event-Transition"></a>Defining an event Transition

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
Event allowing to trigger a transition.
Type `event`.
The name of the event can be defined.
In our example, type: `e`.
Type: `:`.
The expression of the event must be defined.
In our example, type: `p?mArray`.

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Composite State](Defining-a-CompositeState)<br/>
[Defining a Required Port](Defining-a-RequiredPort)


### <a name="Defining-a-internal-Transition"></a>Defining an internal Transition

```
thing fragment TestHistoryStatesWithStream {
 required port p {
   receives mArray
 }
 
 composite state C2 init s1 {
  state s1 {
    internal event e : p?mArray
    action do
    end
  }
}

```
Internal transitions can be used to implement event handlers on states which do not exit and reenter the state.<br>
Type `internal`.<br>
The event of the internal transition must be defined.<br>
Actions of the transition can be defined. <br>
Type `}`.<br>
Type `}`.<br>


See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Required Port](Defining-a-RequiredPort)<br/>
[Defining a Composite State](Defining-a-CompositeState)


### <a name="Defining-a-Message"></a>Defining a Message

```
thing fragment Msgs {
 message rep ( c : 	AnId ) ; 
}

```
Declare the model of a message with its eventual parameters. It can then be sent or received over a port. Things needs to include ever messages that they use. Type `message`. 

The name of the message must be defined. The expected format is an identifier. In our example, type: `rep`.


Type `(`. 

The name of the parameter must be defined. The expected format is an identifier. In our example, type: `c `.
<br>
Type `:`. 
<br>
The type of the parameter must be defined. The expected format is an identifier.
Then, give the value, here: `AnId `.

Type `)`. 

Type `;`. 

See also:<br/>
[Defining a Thing](Defining-a-Thing)


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


### <a name="Defining-a-SendAction"></a>Defining a Send Action

```
thing fragment TestArrays4 {
 required port myPort {
  sends rep
 }
	
 composite state c init s1 keeps history{
    state s1{
        on entry do
          myPort!rep('\'A\'')
        end
    }
 }
}

```
Sending of a message on a port with given parameters.
The name of the port must be defined.<br>
In our example, type: `myPort`.<br>
Type `!`.<br>
The expression of the message must be defined.<br>
In our example, type: `rep('\'A\'')`.<br>

See also:<br/>
[Defining a Thing](Defining-a-Thing)<br/>
[Defining a Composite State](Defining-a-CompositeState)<br/>
[Defining an entry Composite State](Defining-a-entry-CompositeState)<br/>
[Defining a Required Port](Defining-a-RequiredPort)


### <a name="Defining-a-Protocol"></a>Defining a Protocol

```
protocol UDP ;

```
Protocol are used to named external components, that will not lead to code generation by compilers. They may however be used by plugins. Typically used for network transmissions. Additional information must be provided with annotation in most cases. `name` must be defined. The expected format is an identifier.
Type `protocol`. 
<br>
Then, give the value, here: `UDP `.
<br>
Type `;`. 


### <a name="Defining-a-PropertyAssign"></a>Defining a Property Assignment

```
thing fragment SendArray {
 	property array : Char[4]
 	set array[0] = '\'A\''
 }

```
Assign a value to a property.
Type `set`. 
The name of the property must be defined. The expected format is an identifier. In our example, type: `array[0]`.
Type `=`. 
The assignment must be defined. In our example, type: `'\'A\''`.


See also:<br/>
[Defining a Thing](Defining-a-Thing)


### <a name="Defining-a-Enumeration"></a>Defining an Enumeration

```
enumeration DigitalState {
 	LOW 
}

```
Type that consists of a set of named values. Type `enumeration`. 

The name of the enumeration must be defined. The expected format is an identifier. In our example, type: `DigitalState `.

Type `{`. 

The name of the literal must be defined. The expected format is an identifier.
Then, give the value, here: `LOW`.

Type `}`. 


### <a name="Defining-a-Function"></a>Defining a Function

```
thing fragment JavaMathAgg {
 function sumByte ( tab : AnId) do end 
}

```
Declares a function for the thing. Type `function`. 

The name of the function must be defined. The expected format is an identifier. In our example, type: `sumByte `.

Type `(`.
 
 Parameters of the function can be defined.<br>
The name of the parameter must be defined. The expected format is an identifier. In our example, type: `tab `.
<br>
Type `:`. 
<br>
The type of the parameter must be defined. The expected format is an identifier.
Then, give the value, here: `AnId `.

Type `)`. 
<br>
Type `do`. 
<br>
Type `end`. 


See also:<br/>
[Defining a Thing](Defining-a-Thing)


### <a name="Defining-a-Import"></a>Defining an Import

```
import "../thingml.thingml" 

```
The path to the model to import must be defined. The expected format is a string literal (between double quotes).
Type `import`. 

Then, give the value, here: `"../thingml.thingml" `.


### <a name="Defining-a-ObjectType"></a>Defining an Object Type

```
object String ;

```
Container for complex types such as classes, pointers, structs... `name` must be defined. The expected format is an identifier.
Type `object`. 
<br>
Then, give the value, here: `String `.
<br>
Type `;`. 


### <a name="Defining-a-Configuration"></a>Defining a Configuration

```
configuration HelloWorldCfg {
}


```
Describes the list of component instances and their inter connections. The name of the configuration must be defined. The expected format is an identifier.
Type `configuration`. 

Then, give the value, here: `HelloWorldCfg `.


Type `{`. 

Type `}`. 


### <a name="Defining-a-Instance"></a>Defining a Instance

```
configuration HelloWorldCfg {
 instance HelloWorldInstance : AnId 
}
```
Instance of a given thing. Type `instance`. 

The name of the instance must be defined. The expected format is an identifier. In our example, type: `HelloWorldInstance `.
<br>
Type `:`. <br>
The type of the instance must be defined. The expected format is an identifier. In our example, type: `AnId`.


See also:<br/>
[Defining a Configuration](Defining-a-Configuration)

### <a name="Defining-a-PrimitiveType"></a>Defining a Primitive Type

```
datatype Byte < 1 > ;
```
Container for plateform types. (Allows to link types from differents plateforms). Type `datatype`. 

The name of the primitive type must be defined. The expected format is an identifier. In our example, type: `Byte `.
<br>
Type `<`. 
<br>
The byte size must be defined. The expected format is an integer value. In our example, type: `1`.
<br>
Type `>`. 
<br>
Type `;`. 


### <a name="Defining-a-PlatformAnnotation"></a>Defining a Platform Annotation

```
datatype Byte < 1 > @type_checker "Integer" ;
```
Additional information passed to the compiler. (@key "value). Type `@`. 

The name of the annotation must be defined. The expected format is an identifier. In our example, type: `type_checker `.


The value of the annotation must be defined. The expected format is a string literal (between double quotes). In our example, type: `"Integer" `.


See also:<br/>
[Defining a Primitive Type](Defining-a-PrimitiveType)

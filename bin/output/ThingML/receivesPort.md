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
